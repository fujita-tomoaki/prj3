package com.example.dao;

import com.example.model.UserMaster;
import com.example.model.UserMasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMasterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    int countByExample(UserMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    int deleteByExample(UserMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    int insert(UserMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    int insertSelective(UserMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    List<UserMaster> selectByExample(UserMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    UserMaster selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    int updateByExampleSelective(@Param("record") UserMaster record, @Param("example") UserMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    int updateByExample(@Param("record") UserMaster record, @Param("example") UserMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    int updateByPrimaryKeySelective(UserMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM.USER_MASTER
     *
     * @mbggenerated Sun May 08 14:50:17 JST 2016
     */
    int updateByPrimaryKey(UserMaster record);
}