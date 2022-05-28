package org.example.multimodule.order.infrastructure.persistent.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.example.multimodule.order.infrastructure.persistent.dataobject.OrderDO;
import org.example.multimodule.order.infrastructure.persistent.dataobject.UserDO;
import org.example.multimodule.order.infrastructure.persistent.mapper.typeHandler.OrderItemTypeHandler;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<OrderDO> {

    @Select("select * from `order`")
    @Results(value = {
            @Result(property="id", column="id"),
            @Result(property="orderItems", column="order_item", typeHandler = OrderItemTypeHandler.class),
            @Result(property="user", javaType= UserDO.class, column="user_id",
                    one=@One(select="findUserByUserId"))})
    List<OrderDO> all();

    @Select("SELECT * FROM `user` WHERE id = #{userId}")
    UserDO findUserByUserId(Long userId);
}
