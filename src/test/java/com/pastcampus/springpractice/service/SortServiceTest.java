package com.pastcampus.springpractice.service;

import com.pastcampus.springpractice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 16.
 */
class SortServiceTest {

    private final SortService sort = new SortService(new JavaSort<String>());

    @Test
    void test(){
        //when
        List<String> actual= sort.doSort(List.of("3","2","1"));

        //then
        assertEquals(List.of("1","2","3"), actual);

    }

}