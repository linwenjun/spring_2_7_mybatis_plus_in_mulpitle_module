package com.example.multimodule.infrastructure.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.multimodule.infrastructure.dataobject.OrderDO;
import com.example.multimodule.infrastructure.typeHandler.OrderItemTypeHandler;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<OrderDO> { }
