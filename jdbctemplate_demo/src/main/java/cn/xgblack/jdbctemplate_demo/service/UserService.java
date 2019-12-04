package cn.xgblack.jdbctemplate_demo.service;

import cn.xgblack.jdbctemplate_demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xg BLACK
 * @date 2019/12/4 15:12
 * description:
 */
@Service
public class UserService {
    @Autowired
    JdbcTemplate template;
    public Integer addUser(User user) {
        return template.update("insert into user (username,address) values (?,?)", user.getUsername(), user.getAddress());
    }

    public Integer updateUsernameById(User user) {
        return template.update("update user set username = ? where id = ?", user.getUsername(), user.getId());
    }

    public Integer deleteUserById(Integer id) {
        return template.update("delete from user where id = ?", id);
    }

    /*public List<User> getAllUsers(){
        return template.query("select * from user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String address = resultSet.getString("address");
                User user = new User(id,username,address);
                return user;
            }
        });
    }*/

    public List<User> getAllUsers(){
        return template.query("select * from user", new BeanPropertyRowMapper<>(User.class));
    }
}
