package cn.e3mall.content.service;

import cn.e3mall.common.pojo.EasyUITreeNode;
import cn.e3mall.common.utils.E3Result;

import java.util.List;

/**
 * Created by Administrator on 2017/11/12.
 */
public interface ContentCategoryService {

    List<EasyUITreeNode> getContentCatList(long parentId);

    E3Result addContentCategory(long parentId,String name);
}
