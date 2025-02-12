package uz.bnpl.client.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import uz.bnpl.client.constant.Language;
import uz.bnpl.client.constant.Sex;
import uz.bnpl.client.entity.config.BaseEntity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = ClientInfo.Constants.ENTITY_NAME)
@Table(name = ClientInfo.Constants.TABLE_NAME, schema = "client")
public class ClientInfo extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -5107501379275690506L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_info_id_gen")
    @SequenceGenerator(name = "client_info_id_gen", sequenceName = "client_info_id_seq", allocationSize = 1)
    @Column(name = Constants.COLUMN_ID_NAME, nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = Constants.COLUMN_PREFERABLELANGUAGE_NAME, nullable = false, length = 2)
    private Language preferableLanguage;

    @Column(name = Constants.COLUMN_FIRSTNAME_NAME, nullable = false)
    private String firstName;

    @Column(name = Constants.COLUMN_LASTNAME_NAME, nullable = false)
    private String lastName;

    @Column(name = Constants.COLUMN_PATRONYMIC_NAME)
    private String patronymic;

    @Column(name = Constants.COLUMN_BIRTHDATE_NAME, nullable = false)
    private LocalDate birthDate;

    @Column(name = Constants.COLUMN_PIN_NAME, nullable = false, length = 20)
    private String pin;

    @Enumerated(EnumType.STRING)
    @Column(name = Constants.COLUMN_SEX_NAME, nullable = false, length = 50)
    private Sex sex;

    public static class Constants {
        public static final String ENTITY_NAME = "ClientInfo";
        public static final String TABLE_NAME = "client_info";
        public static final String COLUMN_ID_NAME = "id";
        public static final String COLUMN_PREFERABLELANGUAGE_NAME = "preferable_language";
        public static final String COLUMN_FIRSTNAME_NAME = "first_name";
        public static final String COLUMN_LASTNAME_NAME = "last_name";
        public static final String COLUMN_PATRONYMIC_NAME = "patronymic";
        public static final String COLUMN_BIRTHDATE_NAME = "birth_date";
        public static final String COLUMN_PIN_NAME = "pin";
        public static final String COLUMN_SEX_NAME = "sex";


    }
}