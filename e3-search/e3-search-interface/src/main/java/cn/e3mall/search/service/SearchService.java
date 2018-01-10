package cn.e3mall.search.service;

import cn.e3mall.common.pojo.SearchResult;

/**
 * Created by Administrator on 2017/11/13.
 */
public interface SearchService {

    SearchResult search(String keyword,int page,int rows) throws Exception;


}
