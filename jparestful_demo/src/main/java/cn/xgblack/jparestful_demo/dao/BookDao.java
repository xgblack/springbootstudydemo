package cn.xgblack.jparestful_demo.dao;

import cn.xgblack.jparestful_demo.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xg BLACK
 * @date 2019/12/9 15:57
 * description:
 */
public interface BookDao extends JpaRepository<Book,Integer> {
}
