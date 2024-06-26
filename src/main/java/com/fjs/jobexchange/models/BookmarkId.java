package com.fjs.jobexchange.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class BookmarkId implements Serializable {

    @Serial
    private static final long serialVersionUID = 1932590682598799897L;

    @NotNull
    @Column(name = "student_id", nullable = false)
    private Integer studentId;
    @NotNull
    @Column(name = "job_id", nullable = false)
    private Integer jobId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BookmarkId entity = (BookmarkId) o;
        return Objects.equals(this.studentId, entity.studentId) &&
                Objects.equals(this.jobId, entity.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, jobId);
    }
}
