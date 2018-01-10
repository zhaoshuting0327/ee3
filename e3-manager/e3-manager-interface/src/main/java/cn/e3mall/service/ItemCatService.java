package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * Created by Administrator on 2017/11/8.
 */
public interface ItemCatService {

     List<EasyUITreeNode> getItemCatlist(long parentId);
}
