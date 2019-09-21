package cn.xgblack.mybatis.mapper;

import cn.xgblack.mybatis.domain.Buser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 小光
 * @date 2019/9/21 23:07
 * Copyright(C),2018-2019,https://blog.xgblack.cn
 * interfaceName: BuserMapper
 * description:
 */
@Mapper
public interface BuserMapper {
    public List<Buser> queryBuserList();
}
