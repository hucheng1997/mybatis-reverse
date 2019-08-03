package com.hucheng.myblog.mapper;

import com.hucheng.myblog.bean.BlogArticle;
import java.util.List;

public interface BlogArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BlogArticle record);

    BlogArticle selectByPrimaryKey(Integer id);

    List<BlogArticle> selectAll();

    int updateByPrimaryKey(BlogArticle record);
}