package com.yanzhen.service;

import com.yanzhen.po.Dept;

import java.util.List;

public interface IDeptService {
    List<Dept> queryDeptAll();

    void addDept(Dept dept);

    // 根据部门id查询信息
    Dept queryDeptById(int id);

    // 修改部门信息
    void updateDept(Dept dept);

    // 删除部门信息
    void deleteDept(int id);
}
