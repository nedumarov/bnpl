package uz.bnpl.client.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import uz.bnpl.client.entity.config.BaseEntity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity(name = ClientDocument.Constants.ENTITY_NAME)
@Table(name = ClientDocument.Constants.TABLE_NAME, schema = "client")
public class ClientDocument extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -8431387891938085522L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_documents_id_gen")
    @SequenceGenerator(name = "client_documents_id_gen", sequenceName = "client_documents_id_seq", allocationSize = 1)
    @Column(name = Constants.COLUMN_ID_NAME, nullable = false)
    private Long id;

    @Column(name = Constants.COLUMN_DOCTYPE_NAME, length = 45)
    private String docType;

    @Column(name = Constants.COLUMN_DOCSERIES_NAME, length = 10)
    private String docSeries;

    @Column(name = Constants.COLUMN_DOCNUMBER_NAME, length = 50)
    private String docNumber;

    @Column(name = Constants.COLUMN_DOCISSUER_NAME)
    private String docIssuer;

    @Column(name = Constants.COLUMN_DOCISSUEDATE_NAME)
    private LocalDate docIssueDate;

    @Column(name = Constants.COLUMN_DOCEXPIREDATE_NAME)
    private LocalDate docExpireDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "client_id", nullable = false)
    private ClientInfo client;

    public static class Constants {
        public static final String ENTITY_NAME = "ClientDocument";
        public static final String TABLE_NAME = "client_documents";
        public static final String COLUMN_ID_NAME = "id";
        public static final String COLUMN_DOCTYPE_NAME = "doc_type";
        public static final String COLUMN_DOCSERIES_NAME = "doc_series";
        public static final String COLUMN_DOCNUMBER_NAME = "doc_number";
        public static final String COLUMN_DOCISSUER_NAME = "doc_issuer";
        public static final String COLUMN_DOCISSUEDATE_NAME = "doc_issue_date";
        public static final String COLUMN_DOCEXPIREDATE_NAME = "doc_expire_date";
    }
}