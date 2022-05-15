package org.example.multimodule.order.infrastructure.persistent.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.multimodule.order.infrastructure.persistent.dataobject.OrderDO;
import org.example.multimodule.order.infrastructure.persistent.dataobject.UserDO;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

    @Select("select * from user")
    List<UserDO> selectAllUsers();
}
