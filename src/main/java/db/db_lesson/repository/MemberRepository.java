package db.db_lesson.repository;

import db.db_lesson.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    //entity에 설정된 기본적인 CRUD가 가능하도록 만든 INTERFACE

    
    MemberEntity findById(int id); //쿼리를 요청하는 메서드, id를 보자
    MemberEntity countBy(int id); //쿼리 레코드 수를 요청하는 메서드
}
