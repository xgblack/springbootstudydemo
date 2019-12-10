package cn.xgblack.cacheredis_demo.service;

import cn.xgblack.cacheredis_demo.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author xg BLACK
 * @date 2019/12/10 10:05
 * description:
 */
@Service
@CacheConfig
public class UserService {
    @Cacheable(cacheNames = "c1")
    public User getUserById(Integer id) {
        System.out.println("getUserById>>>" + id);
        return new User(id, null, null);
    }

    @CacheEvict
    public void deleteUserById(Integer id) {
        System.out.println("deleteUserById>>>" + id);
    }

    @CachePut(key = "#user.id")
    public User updateUserById(User user) {
        return new User(user.getId(), user.getUsername(), user.getAddress());
    }
}
