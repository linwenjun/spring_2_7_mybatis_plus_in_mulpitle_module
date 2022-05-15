package org.example.multimodule.order.infrastructure.persistent.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.multimodule.order.infrastructure.persistent.dataobject.OrderDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<OrderDO> {

}
