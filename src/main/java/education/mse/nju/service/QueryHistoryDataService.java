package education.cs.scu.service;

import education.cs.scu.entity.HistoryData;
import education.cs.scu.entity.entityData.Day;
import education.cs.scu.entity.entityData.Hour;
import education.cs.scu.entity.entityData.Month;
import education.cs.scu.entity.entityData.Year;

import java.util.List;

/**
 * Created by maicius on 2017/6/29.
 */
public interface QueryHistoryDataService {
//增加活跃数据
    int addActivityData() throws Exception;
    List<Year> queryActivityYear() throws Exception;
    List<Month> queryActivityMonth() throws Exception;
    List<Hour> queryActivityDay(String date) throws Exception;
}
