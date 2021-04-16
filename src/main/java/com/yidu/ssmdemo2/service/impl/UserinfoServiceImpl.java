package com.yidu.ssmdemo2.service.impl;

import com.yidu.ssmdemo2.entity.Userinfo;
import com.yidu.ssmdemo2.dao.UserinfoDao;
import com.yidu.ssmdemo2.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Userinfo)表服务实现类
 *
 * @author makejava
 * @since 2021-04-16 10:13:44
 */
@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Resource
    private UserinfoDao userinfoDao;

    public List<Userinfo> selectAll(){
    return userinfoDao.selectAll();
    }

}