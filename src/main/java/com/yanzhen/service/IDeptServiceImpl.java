package com.yanzhen.service;

import com.yanzhen.dao.IDeptDao;
import com.yanzhen.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IDeptServiceImpl implements IDeptService{
    @Autowired
    private IDeptDao iDeptDao;
    @Override
    public List<Dept> queryDeptAll() {
        return iDeptDao.queryAll();
    }

    @Override
    public void addDept(Dept dept) {
        iDeptDao.addDept(dept);

    }

    @Override
    public Dept queryDeptById(int id) {
        return iDeptDao.queryDeptById(id);
    }

    @Override
    public void updateDept(Dept dept) {
        dept.setCreateTime(new Date());
        iDeptDao.updateDept(dept);

    }


    @Override
    public void deleteDept(int id) {
        iDeptDao.deleteDeptById(id);
    }
}
