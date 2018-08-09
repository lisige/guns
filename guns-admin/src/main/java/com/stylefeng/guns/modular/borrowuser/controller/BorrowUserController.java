package com.stylefeng.guns.modular.borrowuser.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.system.model.BorrowUser;
import com.stylefeng.guns.modular.borrowuser.service.IBorrowUserService;

/**
 * 前台用户列表控制器
 *
 * @author fengshuonan
 * @Date 2018-08-09 10:34:00
 */
@Controller
@RequestMapping("/borrowUser")
public class BorrowUserController extends BaseController {

    private String PREFIX = "/borrowuser/borrowUser/";

    @Autowired
    private IBorrowUserService borrowUserService;

    /**
     * 跳转到前台用户列表首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "borrowUser.html";
    }

    /**
     * 跳转到添加前台用户列表
     */
    @RequestMapping("/borrowUser_add")
    public String borrowUserAdd() {
        return PREFIX + "borrowUser_add.html";
    }

    /**
     * 跳转到修改前台用户列表
     */
    @RequestMapping("/borrowUser_update/{borrowUserId}")
    public String borrowUserUpdate(@PathVariable Integer borrowUserId, Model model) {
        BorrowUser borrowUser = borrowUserService.selectById(borrowUserId);
        model.addAttribute("item",borrowUser);
        LogObjectHolder.me().set(borrowUser);
        return PREFIX + "borrowUser_edit.html";
    }

    /**
     * 获取前台用户列表列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return borrowUserService.selectList(null);
    }

    /**
     * 新增前台用户列表
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(BorrowUser borrowUser) {
        borrowUserService.insert(borrowUser);
        return SUCCESS_TIP;
    }

    /**
     * 删除前台用户列表
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer borrowUserId) {
        borrowUserService.deleteById(borrowUserId);
        return SUCCESS_TIP;
    }

    /**
     * 修改前台用户列表
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(BorrowUser borrowUser) {
        borrowUserService.updateById(borrowUser);
        return SUCCESS_TIP;
    }

    /**
     * 前台用户列表详情
     */
    @RequestMapping(value = "/detail/{borrowUserId}")
    @ResponseBody
    public Object detail(@PathVariable("borrowUserId") Integer borrowUserId) {
        return borrowUserService.selectById(borrowUserId);
    }
}
