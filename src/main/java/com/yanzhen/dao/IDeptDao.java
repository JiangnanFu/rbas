package com.yanzhen.dao;

import com.yanzhen.po.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDeptDao {

    // 查询部门信息
    List<Dept> queryAll();

    // 添加部门信息
    void addDept(Dept dept);

    // 根据部门id查询信息
    Dept queryDeptById(int id);

    // 修改部门信息
    void updateDept(Dept dept);

    // 删除部门信息
    void deleteDeptById(int id);

}
