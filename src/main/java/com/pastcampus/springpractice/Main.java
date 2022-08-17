package com.pastcampus.springpractice;

import com.pastcampus.springpractice.config.Config;
import com.pastcampus.springpractice.logic.BubbleSort;
import com.pastcampus.springpractice.logic.Sort;
import com.pastcampus.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 12.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        SortService service =  context.getBean(SortService.class);

        System.out.println("[result]");
    }
}
