package cn.e3mall.search.mapper;

import cn.e3mall.common.pojo.SearchItem;

import java.util.List;

/**
 * Created by Administrator on 2017/11/12.
 */
public interface ItemMapper {
    List<SearchItem> getItemList();
    SearchItem getItemById(long itemId);
}
