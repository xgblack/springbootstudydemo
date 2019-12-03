package cn.xgblack.controlleradvice_demo.controller;

import cn.xgblack.controlleradvice_demo.bean.Author;
import cn.xgblack.controlleradvice_demo.bean.Book;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xg BLACK
 * @date 2019/12/3 9:18
 * description:
 */
@RestController
public class BookController {
    @PostMapping("/book")
    public void addBook(@ModelAttribute("b")Book book, @ModelAttribute("a")Author author) {
        System.out.println(book);
        System.out.println(author);

    }
}
