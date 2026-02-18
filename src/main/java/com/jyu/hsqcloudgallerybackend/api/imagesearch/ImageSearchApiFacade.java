package com.jyu.hsqcloudgallerybackend.api.imagesearch;

import com.jyu.hsqcloudgallerybackend.api.imagesearch.model.ImageSearchResult;
import com.jyu.hsqcloudgallerybackend.api.imagesearch.sub.GetImageFirstUrlApi;
import com.jyu.hsqcloudgallerybackend.api.imagesearch.sub.GetImageListApi;
import com.jyu.hsqcloudgallerybackend.api.imagesearch.sub.GetImagePageUrlApi;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ImageSearchApiFacade {

    /**
     * 搜索图片
     * @param imageUrl 要搜索的图片URL
     * @return 返回图片搜索结果列表
     */
    public static List<ImageSearchResult> searchImage(String imageUrl) {
        // 获取图片页面URL
        String imagePageUrl = GetImagePageUrlApi.getImagePageUrl(imageUrl);
        // 获取图片第一页URL
        String imageFirstUrl = GetImageFirstUrlApi.getImageFirstUrl(imagePageUrl);
        // 获取图片列表
        List<ImageSearchResult> imageList = GetImageListApi.getImageList(imageFirstUrl);
        return imageList;
    }

    public static void main(String[] args) {
        // 调用searchImage方法搜索指定图片
        List<ImageSearchResult> imageList = searchImage("https://www.codefather.cn/logo.png");
        // 输出结果列表
        System.out.println("结果列表" + imageList);
    }
}
