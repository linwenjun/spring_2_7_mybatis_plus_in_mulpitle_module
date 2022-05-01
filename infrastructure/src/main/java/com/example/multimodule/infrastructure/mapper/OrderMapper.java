package com.example.multimodule.infrastructure.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.multimodule.infrastructure.dataobject.OrderDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<OrderDO> { }
