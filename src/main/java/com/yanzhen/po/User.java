package com.yanzhen.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class User implements Serializable {
    private Integer id;
    private Integer deptId;
    private String username;
    private String password;
    private String realname;
    private String sex;
    private String tel;
    private String email;
    private String avatar;
    private String jobTitle;
    private String status;
    private Integer sort;
    private Integer delFalg;
    private Date createTime;
    private Date updataTime;
    private String dname;//直接加一个属性，映射到部门的名称

    private List roleList;


}
