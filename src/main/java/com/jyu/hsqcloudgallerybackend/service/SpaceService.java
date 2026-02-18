package com.jyu.hsqcloudgallerybackend.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jyu.hsqcloudgallerybackend.model.dto.space.SpaceAddRequest;
import com.jyu.hsqcloudgallerybackend.model.dto.space.SpaceQueryRequest;
import com.jyu.hsqcloudgallerybackend.model.entity.Space;
import com.jyu.hsqcloudgallerybackend.model.entity.User;
import com.jyu.hsqcloudgallerybackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

public interface SpaceService extends IService<Space> {
/**
 * 空间服务接口，继承自IService<Space>，提供空间相关的业务操作方法
 */

    /**
     * 创建空间
     *方法
     * @param spaceAddRequest
     * @param loginUser 空间添加请求对象，包含创建空间所需的信息
     * @return 当前登录用户信息
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * 校验空间
     *数据的方法
     * @param space
     * @param add   是否为创建时检验 待校验的空间对象
     */
    void validSpace(Space space, boolean add);

    /**
     * 获取空间包装类（单条）
     *
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取空间包装类（分页）
     *
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 获取查询对象
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 根据空间级别填充空间对象
     *
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);

    /**
     * 校验空间权限
     *
     * @param loginUser
     * @param space
     */
    void checkSpaceAuth(User loginUser, Space space);
}
