package com.yidu.ssmdemo2.controller;

import com.yidu.ssmdemo2.entity.Userinfo;
import com.yidu.ssmdemo2.service.UserinfoService;
import com.yidu.ssmdemo2.service.impl.UserinfoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (Userinfo)表控制层
 *
 * @author makejava
 * @since 2021-04-16 10:13:44
 */
@Controller
public class UserinfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserinfoServiceImpl userinfoService;

  @RequestMapping("selectAll")
  public String selectAll(HttpServletRequest request){
      //调用数据库方法得到用户数据
      List<Userinfo> userinfos = userinfoService.selectAll();
      //数据存入作用域
      request.setAttribute("userinfoList",userinfos);
      //跳转到指定页面 显示数据
      return "userInfo";
  }

}