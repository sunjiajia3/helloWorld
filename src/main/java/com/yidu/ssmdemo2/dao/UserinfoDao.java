package com.yidu.ssmdemo2.dao;

import com.yidu.ssmdemo2.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Userinfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-16 10:13:43
 */
@Mapper
@Repository
public interface UserinfoDao {

   public List<Userinfo> selectAll();

}