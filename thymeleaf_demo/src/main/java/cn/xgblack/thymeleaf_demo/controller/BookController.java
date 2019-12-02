package cn.xgblack.thymeleaf_demo.controller;

import cn.xgblack.thymeleaf_demo.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小光
 * @date 2019/12/1 22:38
 * className: BookController
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
@Controller
public class BookController {
    @GetMapping("/book")
    public String book(Model model){
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("三国演义" + i);
            book.setAuthor("罗贯中" + i);
            book.setPrice(30.0);
            bookList.add(book);
        }
        model.addAttribute("books", bookList);
        return "books";
    }
}
