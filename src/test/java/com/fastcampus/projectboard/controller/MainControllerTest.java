package com.fastcampus.projectboard.controller;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@WebMvcTest(MainController.class)
class MainControllerTest {

    private final MockMvc mvc;
    public MainControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }


    @Test
    void givenNothing_whenRequestingRootPage_thenRedirectsToArticlesPage() throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("forward:/articles"))
                .andExpect(forwardedUrl("/articles"))
                .andDo(MockMvcResultHandlers.print());
    }
    //아무것도 주어지지 않았을때 MainControll에서 설정한 String띄우는지
    //url이 주어진게 맞는지
    //실행 결과를 로그로 출력
   // Handler: 로 출렫력됨.
}