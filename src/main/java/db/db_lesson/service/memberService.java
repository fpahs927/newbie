package db.db_lesson.service;

import db.db_lesson.entity.MemberEntity;
import db.db_lesson.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class memberService {
    private final MemberRepository memberRepository;

    public memberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void save(MemberEntity member){
        memberRepository.save(member);
    }
}
