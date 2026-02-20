package com.jyu.hsqcloudgallerybackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;


@Data
public class PictureUploadRequest implements Serializable {

    /**
     * 图片 id（用于修改）
     * 该属性用于标识图片的唯一ID，在需要修改已有图片信息时会使用到
     */
    private Long id;

    /**
     * 文件地址
     * 存储图片文件的完整URL路径，用于访问和展示图片
     */
    private String fileUrl;

    /**
     * 图片名称
     * 图片的显示名称或文件名，用于用户界面展示和识别
     */
    private String picName;

    /**
     * 空间 id
     * 所属空间或分类的唯一标识符，用于图片的分类管理
     */
    private Long spaceId;

    // 序列化版本UID，用于Java序列化过程中的版本控制
    private static final long serialVersionUID = 1L;
}