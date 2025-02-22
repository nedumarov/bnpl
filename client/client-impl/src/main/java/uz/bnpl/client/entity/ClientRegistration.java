package uz.bnpl.client.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.bnpl.client.constant.RegistrationType;
import uz.bnpl.client.entity.config.BaseEntity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = ClientRegistration.Constants.ENTITY_NAME)
@Table(name = ClientRegistration.Constants.TABLE_NAME, schema = "client")
public class ClientRegistration extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -6881510940334502141L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_registrations_id_gen")
    @SequenceGenerator(name = "client_registrations_id_gen", sequenceName = "client_registrations_id_seq", allocationSize = 1)
    @Column(name = Constants.COLUMN_ID_NAME, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private ClientInfo client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @Enumerated(EnumType.STRING)
    @Column(name = Constants.COLUMN_REGISTRATIONTYPE_NAME, nullable = false)
    private RegistrationType registrationType;

    @Column(name = Constants.COLUMN_REGISTRATIONDATE_NAME, nullable = false)
    private LocalDate registrationDate;

    @Column(name = Constants.COLUMN_REGISTRATIONENDDATE_NAME)
    private LocalDate registrationEndDate;

    public static class Constants {
        public static final String ENTITY_NAME = "ClientRegistration";
        public static final String TABLE_NAME = "client_registrations";
        public static final String COLUMN_ID_NAME = "id";
        public static final String COLUMN_REGISTRATIONTYPE_NAME = "registration_type";
        public static final String COLUMN_REGISTRATIONDATE_NAME = "registration_date";
        public static final String COLUMN_REGISTRATIONENDDATE_NAME = "registration_end_date";


    }
}