package db.db_lesson.Controller;

import db.db_lesson.entity.MemberEntity;
import db.db_lesson.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class memberController {
    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/member")
    public void viewTable(@RequestParam(name = "id") int id, @RequestParam(name="name")String name) {
        List<MemberEntity> list = memberRepository.findAll();

    }

}
