package com.example.multimodule.infrastructure.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.multimodule.infrastructure.typeHandler.OrderItemTypeHandler;
import lombok.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "`order`", autoResultMap = true)
public class OrderDO {

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderItem {
        private String sku;
        private BigDecimal price;
        private int amount;
    }

    @TableId(type = IdType.AUTO)
    private int id;
    private String name;
    private BigDecimal price;

    @TableField(value = "order_item", typeHandler = OrderItemTypeHandler.class)
    private List<OrderItem> orderItems;

}