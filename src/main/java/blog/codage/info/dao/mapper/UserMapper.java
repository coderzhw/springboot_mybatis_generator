package blog.codage.info.dao.mapper;

import blog.codage.info.dao.example.UserExample;
import blog.codage.info.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    User selectOneByExample(UserExample example);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}