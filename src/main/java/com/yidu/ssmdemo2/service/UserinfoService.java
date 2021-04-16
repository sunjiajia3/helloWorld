package com.yidu.ssmdemo2.service;

import com.yidu.ssmdemo2.entity.Userinfo;
import java.util.List;

/**
 * (Userinfo)表服务接口
 *
 * @author makejava
 * @since 2021-04-16 10:13:44
 */
public interface UserinfoService {

    public List<Userinfo> selectAll();

}