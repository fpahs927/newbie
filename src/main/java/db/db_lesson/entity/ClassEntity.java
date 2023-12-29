package db.db_lesson.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 추가
    private int id;

    @Column
    String grade;


}
