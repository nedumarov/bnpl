package uz.bnpl.client.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = Address.Constants.ENTITY_NAME)
@Table(name = Address.Constants.TABLE_NAME, schema = "client")
public class Address implements Serializable {

    private static final long serialVersionUID = -4929041592093350431L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addresses_id_gen")
    @SequenceGenerator(name = "addresses_id_gen", sequenceName = "addresses_id_seq", allocationSize = 1)
    @Column(name = Constants.COLUMN_ID_NAME, nullable = false)
    private Long id;

    @Column(name = Constants.COLUMN_CREATEDAT_NAME, nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = Constants.COLUMN_UPDATEDAT_NAME)
    private OffsetDateTime updatedAt;

    @Column(name = Constants.COLUMN_REGION_NAME)
    private String region;

    @Column(name = Constants.COLUMN_ADDRESS_NAME)
    private String address;

    @Column(name = Constants.COLUMN_COUNTRY_NAME)
    private String country;

    @Column(name = Constants.COLUMN_CADASTRE_NAME)
    private String cadastre;

    @Column(name = Constants.COLUMN_DISTRICT_NAME)
    private String district;

    @Column(name = Constants.COLUMN_REGIONID_NAME)
    private String regionId;

    @Column(name = Constants.COLUMN_COUNTRYID_NAME)
    private String countryId;

    @Column(name = Constants.COLUMN_DISTRICTID_NAME)
    private String districtId;

    @Column(name = Constants.COLUMN_REGIONIDCBU_NAME)
    private String regionIdCbu;

    @Column(name = Constants.COLUMN_COUNTRYIDCBU_NAME)
    private String countryIdCbu;

    @Column(name = Constants.COLUMN_DISTRICTIDCBU_NAME)
    private String districtIdCbu;

    public static class Constants {
        public static final String ENTITY_NAME = "Address";
        public static final String TABLE_NAME = "addresses";
        public static final String COLUMN_ID_NAME = "id";
        public static final String COLUMN_CREATEDAT_NAME = "created_at";
        public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
        public static final String COLUMN_REGION_NAME = "region";
        public static final String COLUMN_ADDRESS_NAME = "address";
        public static final String COLUMN_COUNTRY_NAME = "country";
        public static final String COLUMN_CADASTRE_NAME = "cadastre";
        public static final String COLUMN_DISTRICT_NAME = "district";
        public static final String COLUMN_REGIONID_NAME = "region_id";
        public static final String COLUMN_COUNTRYID_NAME = "country_id";
        public static final String COLUMN_DISTRICTID_NAME = "district_id";
        public static final String COLUMN_REGIONIDCBU_NAME = "region_id_cbu";
        public static final String COLUMN_COUNTRYIDCBU_NAME = "country_id_cbu";
        public static final String COLUMN_DISTRICTIDCBU_NAME = "district_id_cbu";
    }
}