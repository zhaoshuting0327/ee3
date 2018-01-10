package cn.e3mall.content.service;

import cn.e3mall.common.utils.E3Result;
import cn.e3mall.pojo.TbContent;

import java.util.List;

/**
 * Created by Administrator on 2017/11/12.
 */
public interface ContentService {

    E3Result addContent(TbContent tbContent);

    List<TbContent> getContentByCid(long cid);


}
