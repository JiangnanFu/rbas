package com.yanzhen.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleMenu implements Serializable {
    private Integer id;
    private Integer roleId;
    private Integer menuId;

    public RoleMenu(int roleId, int menuId){
        this.roleId = roleId;
        this.menuId = menuId;
    }
}
