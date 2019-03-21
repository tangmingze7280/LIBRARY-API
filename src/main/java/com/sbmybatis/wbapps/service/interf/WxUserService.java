package com.sbmybatis.wbapps.service.interf;

import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.WxUser;

public interface WxUserService {
    /**
     * 同步微信用户信息到项目数据库
     * @return  返回 成功消息和失败信息
     */
    public CommonResult synchWxUserForLib(WxUser wxUser);

    /**
     *  用户新增借书 项
     * @return
     */
    public CommonResult updateWxUserInfoByBkUsered(String bookCode,String code);
}
