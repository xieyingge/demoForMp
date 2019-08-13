package com.example.demoForMp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_mp_user")
public class User {
    @TableId(value = "id")
    private Long userId;

    @TableField(value = "name")
    private String realname;
    private Integer age;
    private String email;

    @TableField(exist = false)
    private String remark;

}
