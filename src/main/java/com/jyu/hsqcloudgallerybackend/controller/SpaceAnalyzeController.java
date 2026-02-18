package com.jyu.hsqcloudgallerybackend.controller;


import com.jyu.hsqcloudgallerybackend.common.BaseResponse;
import com.jyu.hsqcloudgallerybackend.common.ResultUtils;
import com.jyu.hsqcloudgallerybackend.exception.ErrorCode;
import com.jyu.hsqcloudgallerybackend.exception.ThrowUtils;
import com.jyu.hsqcloudgallerybackend.model.dto.space.analyze.*;
import com.jyu.hsqcloudgallerybackend.model.entity.Space;
import com.jyu.hsqcloudgallerybackend.model.entity.User;
import com.jyu.hsqcloudgallerybackend.model.vo.space.analyze.*;
import com.jyu.hsqcloudgallerybackend.service.SpaceAnalyzeService;
import com.jyu.hsqcloudgallerybackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 空间分析控制器，提供空间相关的各种分析接口
 */
@Slf4j
@RestController
@RequestMapping("/space/analyze")
public class SpaceAnalyzeController {

    @Resource
    private UserService userService; // 用户服务，用于处理用户相关操作

    @Resource
    private SpaceAnalyzeService spaceAnalyzeService; // 空间分析服务，用于处理空间分析相关操作

    /**
     * 获取空间的使用状态
     *
     * @param spaceUsageAnalyzeRequest 空间使用分析请求参数
     * @param request HTTP请求对象
     * @return 返回空间使用分析结果
     */
    @PostMapping("/usage")
    public BaseResponse<SpaceUsageAnalyzeResponse> getSpaceUsageAnalyze(
            @RequestBody SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest,
            HttpServletRequest request) {
        ThrowUtils.throwIf(spaceUsageAnalyzeRequest == null, ErrorCode.PARAMS_ERROR); // 参数校验
        User loginUser = userService.getLoginUser(request); // 获取当前登录用户
        SpaceUsageAnalyzeResponse spaceUsageAnalyze = spaceAnalyzeService.getSpaceUsageAnalyze(spaceUsageAnalyzeRequest, loginUser);
        return ResultUtils.success(spaceUsageAnalyze); // 返回成功结果
    }

    /**
     * 获取空间图片分类分析
     *
     * @param spaceCategoryAnalyzeRequest 空间分类分析请求参数
     * @param request HTTP请求对象
     * @return 返回空间分类分析结果列表
     */
    @PostMapping("/category")
    public BaseResponse<List<SpaceCategoryAnalyzeResponse>> getSpaceCategoryAnalyze(
            @RequestBody SpaceCategoryAnalyzeRequest spaceCategoryAnalyzeRequest,
            HttpServletRequest request) {
        ThrowUtils.throwIf(spaceCategoryAnalyzeRequest == null, ErrorCode.PARAMS_ERROR); // 参数校验
        User loginUser = userService.getLoginUser(request); // 获取当前登录用户
        List<SpaceCategoryAnalyzeResponse> spaceCategoryAnalyze = spaceAnalyzeService.getSpaceCategoryAnalyze(spaceCategoryAnalyzeRequest, loginUser);
        return ResultUtils.success(spaceCategoryAnalyze); // 返回成功结果
    }

    /**
     * 获取空间图片标签分析
     *
     * @param spaceTagAnalyzeRequest 空间标签分析请求参数
     * @param request HTTP请求对象
     * @return 返回空间标签分析结果列表
     */
    @PostMapping("/tag")
    public BaseResponse<List<SpaceTagAnalyzeResponse>> getSpaceTagAnalyze(
            @RequestBody SpaceTagAnalyzeRequest spaceTagAnalyzeRequest,
            HttpServletRequest request) {
        ThrowUtils.throwIf(spaceTagAnalyzeRequest == null, ErrorCode.PARAMS_ERROR); // 参数校验
        User loginUser = userService.getLoginUser(request); // 获取当前登录用户
        List<SpaceTagAnalyzeResponse> spaceTagAnalyze = spaceAnalyzeService.getSpaceTagAnalyze(spaceTagAnalyzeRequest, loginUser);
        return ResultUtils.success(spaceTagAnalyze); // 返回成功结果
    }

    /**
     * 获取空间图片大小分析
     *
     * @param spaceSizeAnalyzeRequest 空间大小分析请求参数
     * @param request HTTP请求对象
     * @return 返回空间大小分析结果列表
     */
    @PostMapping("/size")
    public BaseResponse<List<SpaceSizeAnalyzeResponse>> getSpaceSizeAnalyze(@RequestBody SpaceSizeAnalyzeRequest spaceSizeAnalyzeRequest,
                                                                            HttpServletRequest request) {
        ThrowUtils.throwIf(spaceSizeAnalyzeRequest == null, ErrorCode.PARAMS_ERROR); // 参数校验
        User loginUser = userService.getLoginUser(request); // 获取当前登录用户
        List<SpaceSizeAnalyzeResponse> resultList = spaceAnalyzeService.getSpaceSizeAnalyze(spaceSizeAnalyzeRequest, loginUser);
        return ResultUtils.success(resultList); // 返回成功结果
    }

    /**
     * 获取空间用户行为分析
     *
     * @param spaceUserAnalyzeRequest 空间用户行为分析请求参数
     * @param request HTTP请求对象
     * @return 返回空间用户行为分析结果列表
     */
    @PostMapping("/user")
    public BaseResponse<List<SpaceUserAnalyzeResponse>> getSpaceUserAnalyze(@RequestBody SpaceUserAnalyzeRequest spaceUserAnalyzeRequest,
                                                                            HttpServletRequest request) {
        ThrowUtils.throwIf(spaceUserAnalyzeRequest == null, ErrorCode.PARAMS_ERROR); // 参数校验
        User loginUser = userService.getLoginUser(request); // 获取当前登录用户
        List<SpaceUserAnalyzeResponse> resultList = spaceAnalyzeService.getSpaceUserAnalyze(spaceUserAnalyzeRequest, loginUser);
        return ResultUtils.success(resultList); // 返回成功结果
    }

    /**
     * 获取空间使用排行分析
     *
     * @param spaceRankAnalyzeRequest 空间排行分析请求参数
     * @param request HTTP请求对象
     * @return 返回空间排行分析结果列表
     */
    @PostMapping("/rank")
    public BaseResponse<List<Space>> getSpaceRankAnalyze(@RequestBody SpaceRankAnalyzeRequest spaceRankAnalyzeRequest,
                                                         HttpServletRequest request) {
        ThrowUtils.throwIf(spaceRankAnalyzeRequest == null, ErrorCode.PARAMS_ERROR); // 参数校验
        User loginUser = userService.getLoginUser(request); // 获取当前登录用户
        List<Space> resultList = spaceAnalyzeService.getSpaceRankAnalyze(spaceRankAnalyzeRequest, loginUser);
        return ResultUtils.success(resultList); // 返回成功结果
    }
}

