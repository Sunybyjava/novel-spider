package com.suny.spider.novel.core.interfaces;

import com.suny.spider.novel.core.model.Chapter;

import java.util.List;

/**
 * @author sunjianrong
 * @date 2017/02/19 14:34
 */
public interface IChapterSpider {

    /**
     * 返回一个章节
     *
     * @param url 要趴取的页面
     * @return 获取的章节
     */
    List<Chapter> getChapter(String url);

}
