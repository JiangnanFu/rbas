package com.yanzhen.controller;

import com.yanzhen.po.Dept;
import com.yanzhen.service.IDeptService;
import com.yanzhen.util.JsonObject;
import com.yanzhen.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private IDeptService iDeptService;
    @RequestMapping("/dept/deptAll")
    @ResponseBody
    public Object queryAll(){
        List<Dept> list= iDeptService.queryDeptAll();
        JsonObject<Dept> object = new JsonObject<>();
        object.setCode(0);
        object.setMsg("OK");
        object.setCount((long) list.size());
        object.setData(list);

        System.out.println(list);
        return object;
    }
    @RequestMapping("/dept")
    public String deptIndex(){
        return "pages/dept";
    }

    @RequestMapping("/addDept")
    public String addDept(int type, int parentId, Model model) {
        model.addAttribute("type", type + 1);
        model.addAttribute("parentId", parentId);
        return "pages/addDept";
    }

    @RequestMapping("dept/addDeptSubmit")
    @ResponseBody
    public R addDept(Dept dept){
        //创建记录时间
        dept.setCreateTime(new Date());
        iDeptService.addDept(dept);
        return R.ok();
    }

    // 修改操作
    @RequestMapping("dept/updateDeptSubmit")
    @ResponseBody
    public R updataDept(Dept dept){
        iDeptService.updateDept(dept);
        return R.ok();
    }

    // 删除操作
    @RequestMapping("dept/deleteDeptByID")
    @ResponseBody
    public R deleteDeptById(int id){
        iDeptService.deleteDept(id);
        return R.ok();
    }

}
