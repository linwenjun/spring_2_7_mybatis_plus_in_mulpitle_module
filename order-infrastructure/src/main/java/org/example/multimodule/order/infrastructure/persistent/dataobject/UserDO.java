package org.example.multimodule.order.infrastructure.persistent.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@RequiredArgsConstructor
@TableName("user")
public class UserDO {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    @TableField(exist = false)
    private List<OrderDO> orders;
}
