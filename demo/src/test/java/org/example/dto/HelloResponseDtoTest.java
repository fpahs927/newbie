package org.example.dto;

import org.example.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        //given
        String name="test";
        int amount =1000;
        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        //then
        assertThat(dto.getName()).isEqualTo(name); //dto.getname이 name과 맞는지 검증하고싶습니다
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
