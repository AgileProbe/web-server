﻿package education.mse.nju.service;


import education.mse.nju.entity.UserVisitTimeBean;

import java.util.List;

/**
 * Created by Wang Han on 2017/6/20 16:40.
 * E-mail address is wanghan0501@vip.qq.com.
 * Copyright © 2017 Wang Han. SCU. All Rights Reserved.啊
 */
public interface UserVisitTimeService {
    List<UserVisitTimeBean> getUserVisitTime(int firstLine, int secondLine);

    String getFirstVisitTIme(int shopId, String mac);
}
