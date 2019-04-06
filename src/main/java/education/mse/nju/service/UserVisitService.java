package education.mse.nju.service;

import education.mse.nju.entity.UserBean;
import education.mse.nju.entity.UserVisitBean;

import java.util.List;

/**
 * Created by Wang Han on 2017/6/18 15:18.
 * E-mail address is wanghan0501@vip.qq.com.
 * Copyright © 2017 Wang Han. SCU. All Rights Reserved.啊
 */
public interface UserVisitService {
    void addUserVisit(UserVisitBean userFlow) throws Exception;
    List<UserVisitBean>  queryUserVisit(List<Integer> shopIdlist) throws Exception;
    List<UserBean> queryUserShop(List<Integer> shopIdlist) throws Exception;

    List<Integer> queryShopList(String userName) throws Exception;
}
