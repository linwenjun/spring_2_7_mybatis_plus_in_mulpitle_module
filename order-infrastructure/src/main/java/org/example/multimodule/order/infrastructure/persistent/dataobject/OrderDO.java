package org.example.multimodule.order.infrastructure.persistent.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.example.multimodule.order.infrastructure.persistent.mapper.typeHandler.OrderItemTypeHandler;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "`order`", autoResultMap = true)
@Table("order")
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
    @Id
    private Long id;
    private String name;
    private BigDecimal price;

    @TableField(value = "order_item", typeHandler = OrderItemTypeHandler.class)
    @Transient
    private List<OrderItem> orderItems;

    @TableField(exist = false)
    @Transient
    private UserDO user;
}