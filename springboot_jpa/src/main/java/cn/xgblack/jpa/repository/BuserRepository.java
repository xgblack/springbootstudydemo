package cn.xgblack.jpa.repository;

import cn.xgblack.jpa.domain.Buser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 小光
 * @date 2019/9/22 10:13
 * Copyright(C),2018-2019,https://blog.xgblack.cn
 * interfaceName: BuserRepository
 * description:
 */
public interface BuserRepository extends JpaRepository<Buser, Long> {

    public List<Buser> findAll();
}
