package com.bfy.movieplayerplus.parameter;


import com.bfy.movieplayerplus.utils.Md5Coder;

/**
 * <pre>
 * @copyright  : Copyright ©2004-2018 版权所有　XXXXXXXXXXXXXXXXX
 * @company    : XXXXXXXXXXXXXXXXX
 * @author     : OuyangJinfu
 * @e-mail     : jinfu123.-@163.com
 * @createDate : 2017/4/26 0026
 * @modifyDate : 2017/4/26 0026
 * @version    : 1.0
 * @desc       : 请求参数基类
 * </pre>
 */

public abstract class RequestParameter {

    public abstract String toJsonString();

//    public abstract String generateSign(String key);

    protected String generateMD5Sign(String str){
        return Md5Coder.md5(str);
    }

}
