package cn.xgblack.security_db.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.xgblack.security_db.entity.Role;
import cn.xgblack.security_db.mapper.RoleMapper;
@Service
public class RoleService{

    @Resource
    private RoleMapper roleMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    
    public Role selectByPrimaryKey(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

}
