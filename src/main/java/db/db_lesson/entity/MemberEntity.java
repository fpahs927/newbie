package db.db_lesson.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 추가
    private int id;

    @Column(nullable = false)
    private String name;
}
