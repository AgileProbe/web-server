package education.mse.nju.mapper;

import education.mse.nju.entity.UserBean;
import education.mse.nju.entity.UserVisitBean;

import java.util.List;

/**
 * Created by maicius on 2017/6/18.
 */
public interface UserVisitMapper {
    void addUserVisit(UserVisitBean userVisitBean) throws Exception;
    List<UserVisitBean>  queryUserVisit(List<Integer> shopIdlist) throws Exception;
    List<UserBean> queryUserShop(List<Integer> shopIdlist) throws Exception;
}
