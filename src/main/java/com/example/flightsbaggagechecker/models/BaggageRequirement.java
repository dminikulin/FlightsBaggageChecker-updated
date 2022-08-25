package com.example.flightsbaggagechecker.models;

import lombok.*;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.lang.reflect.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
//
@Entity
@Table(name = "baggage_requirements")
public class BaggageRequirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private Company company;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private BaggageType baggageType;
    @Column
    @Comment("kg")
    private Double weight;
    @Column
    @Comment("cm")
    private Integer length;
    @Column
    @Comment("cm")
    private Integer width;
    @Column
    @Comment("cm")
    private Integer height;

    @SneakyThrows
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BaggageRequirement{\n");
        Comment comment;
        for (Field field : getClass().getDeclaredFields()) {
            field.setAccessible(true);
            sb.append(field.getName()).append('=').append(field.get(this));
            comment = field.getAnnotation(Comment.class);
            if (comment != null)
                sb.append(comment.value());
            sb.append(",\n");
        }
        sb.replace(sb.length() - 2, sb.length(), "");
        sb.append("\n}\n");
        return sb.toString();
    }
}
