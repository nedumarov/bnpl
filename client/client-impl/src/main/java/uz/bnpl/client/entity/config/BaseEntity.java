package uz.bnpl.client.entity.config;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.OffsetDateTime;
import java.time.ZoneId;

@Getter
@Setter
@MappedSuperclass
@SuperBuilder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseEntity {

    @Column(name = Constants.COLUMN_CREATEDAT_NAME, nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = Constants.COLUMN_UPDATEDAT_NAME)
    private OffsetDateTime updatedAt;

    @PostPersist
    public void postPersist() {
        createdAt = OffsetDateTime.now(ZoneId.of("5"));
    }

    @PostUpdate
    public void postUpdate() {
        updatedAt = OffsetDateTime.now(ZoneId.of("5"));
    }

    public static class Constants {
        public static final String COLUMN_CREATEDAT_NAME = "created_at";
        public static final String COLUMN_UPDATEDAT_NAME = "updated_at";
    }

}
