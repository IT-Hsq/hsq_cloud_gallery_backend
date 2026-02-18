package com.jyu.hsqcloudgallerybackend.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyu.hsqcloudgallerybackend.model.entity.Space;


/**
 * SpaceMapper接口 - 继承BaseMapper<Space>接口
 * 这是一个数据访问层(DAO)接口，用于处理Space实型的数据库操作
 * 通过继承BaseMapper<Space>，SpaceMapper自动获得了对Space实体进行CRUD操作的能力
 * BaseMapper是MyBatis-Plus提供的基础接口，包含常用的数据库操作方法
 *
 */
public interface SpaceMapper extends BaseMapper<Space> {

}




