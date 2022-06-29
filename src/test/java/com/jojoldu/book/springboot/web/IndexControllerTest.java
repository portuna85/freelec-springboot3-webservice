package com.jojoldu.book.springboot.web;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest
class IndexControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void 메인페이지_로딩() throws Exception {
        // given
        String body = this.restTemplate.getForObject("/", String.class);

        // when
        Assertions.assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");

        // then


    }
}