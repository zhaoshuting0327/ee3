package cn.e3mall.sso.service;

import cn.e3mall.common.utils.E3Result;
import cn.e3mall.pojo.TbUser;

/**
 * Created by Administrator on 2017/11/18.
 */
public interface TokenService {

    E3Result getUserByToken(String token);
}
