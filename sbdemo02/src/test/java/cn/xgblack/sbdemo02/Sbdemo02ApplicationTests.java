package cn.xgblack.sbdemo02;

import cn.xgblack.sbdemo02.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sbdemo02ApplicationTests {

    @Autowired
    Book book;

    @Test
    public void testBook(){
        System.out.println(book);
    }

    @Test
    void contextLoads() {
    }

}
