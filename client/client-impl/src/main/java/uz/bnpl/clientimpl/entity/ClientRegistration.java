package uz.bnpl.clientimpl.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = ClientRegistration.Constants.ENTITY_NAME)
@Table(name = ClientRegistration.Constants.TABLE_NAME, schema = "client")
public class ClientRegistration implements Serializable {

    private static final long serialVersionUID = -6881510940334502141L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_registrations_id_gen")
    @SequenceGenerator(name = "client_registrations_id_gen", sequenceName = "client_registrations_id_seq", allocationSize = 1)
    @Column(name = Constants.COLUMN_ID_NAME, nullable = false)
    private Long id;

    @Column(name = Constants.COLUMN_CREATEDAT_NAME, nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = Constants.COLUMN_UPDATEDAT_NAME)
    private OffsetDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "client_id", nullable = false)
    private ClientInfo client;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = Constants.COLUMN_REGISTRATIONTYPE_NAME, nullable = false)
    private String registrationType;

    @Column(name = Constants.COLUMN_REGISTRATIONDATE_NAME, nullable = false)
    private LocalDate registrationDate;

    @Column(name = Constants.COLUMN_REGISTRATIONENDDATE_NAME)
    private LocalDate registrationEndDate;

    public static class Constants {
        public static final String ENTITY_NAME = "ClientRegistration";
        public static final String TABLE_NAME = "client_registrations";
        public static final String COLUMN_ID_NAME = "id";
        public static final String COLUMN_CREATEDAT_NAME = "created_at";
        public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
        public static final String COLUMN_REGISTRATIONTYPE_NAME = "registration_type";
        public static final String COLUMN_REGISTRATIONDATE_NAME = "registration_date";
        public static final String COLUMN_REGISTRATIONENDDATE_NAME = "registration_end_date";


    }
}