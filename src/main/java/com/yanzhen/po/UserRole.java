package com.yanzhen.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserRole implements Serializable {
    private Integer id;
    private Integer roleId;
    private Integer userId;
    private Date createTime;

    public UserRole (int userId, int roleId){
        this.userId = userId;
        this.roleId = roleId;
    }

}
