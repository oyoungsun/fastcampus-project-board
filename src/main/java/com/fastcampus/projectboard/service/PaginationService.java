package com.fastcampus.projectboard.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class  PaginationService {

    private static final int BAR_LENGTH = 5;


    public List<Integer> getPaginationBarNumbers(int currentPageNumber, int totalPages) {
        int startNumber = Math.max(currentPageNumber - (BAR_LENGTH / 2), 0); //2개앞 까지
        int endNumber = Math.min(startNumber + BAR_LENGTH, totalPages); //2개 뒤 까지
//시작번호랑 끝 번호 페이지 알려주는 리스트로 반환
        return IntStream.range(startNumber, endNumber).boxed().toList();
    }

    public int currentBarLength() {
        return BAR_LENGTH;
    }
//네비게이션 바 길이
}