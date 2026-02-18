package com.jyu.hsqcloudgallerybackend.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jyu.hsqcloudgallerybackend.model.dto.spaceuser.SpaceUserAddRequest;
import com.jyu.hsqcloudgallerybackend.model.dto.spaceuser.SpaceUserQueryRequest;
import com.jyu.hsqcloudgallerybackend.model.entity.SpaceUser;
import com.jyu.hsqcloudgallerybackend.model.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 空间用户服务接口，继承自IService，提供空间成员相关的业务操作
 */
public interface SpaceUserService extends IService<SpaceUser> {

    /**
     * 创建空间成员
     *
     * @param spaceUserAddRequest 空间成员添加请求参数，包含成员创建所需的所有信息
     * @return 返回新创建空间成员的ID
     */
    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);

    /**
     * 校验空间成员
     * 需要校验的空间成员对象
     * @param spaceUser
     * @param add       是否为创建时检验
     */
    void validSpaceUser(SpaceUser spaceUser, boolean add);

    /**
     * 获取空间成员包装类（单条）
     *
     * @param spaceUser
     * @param request
     * @return
     */
    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    /**
     * 获取空间成员包装类（列表）
     *
     * @param spaceUserList
     * @return
     */
    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);

    /**
     * 获取查询对象
     *
     * @param spaceUserQueryRequest
     * @return
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);
}
