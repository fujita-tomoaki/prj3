package com.common.dao;

import com.common.dao.model.T0a9;
import com.common.dao.model.T0a9Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T0a9Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T0A9
     *
     * @mbggenerated Sat May 21 21:52:31 JST 2016
     */
    int countByExample(T0a9Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T0A9
     *
     * @mbggenerated Sat May 21 21:52:31 JST 2016
     */
    int deleteByExample(T0a9Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T0A9
     *
     * @mbggenerated Sat May 21 21:52:31 JST 2016
     */
    int insert(T0a9 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T0A9
     *
     * @mbggenerated Sat May 21 21:52:31 JST 2016
     */
    int insertSelective(T0a9 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T0A9
     *
     * @mbggenerated Sat May 21 21:52:31 JST 2016
     */
    List<T0a9> selectByExampleWithBLOBs(T0a9Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T0A9
     *
     * @mbggenerated Sat May 21 21:52:31 JST 2016
     */
    List<T0a9> selectByExample(T0a9Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T0A9
     *
     * @mbggenerated Sat May 21 21:52:31 JST 2016
     */
    int updateByExampleSelective(@Param("record") T0a9 record, @Param("example") T0a9Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T0A9
     *
     * @mbggenerated Sat May 21 21:52:31 JST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") T0a9 record, @Param("example") T0a9Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T0A9
     *
     * @mbggenerated Sat May 21 21:52:31 JST 2016
     */
    int updateByExample(@Param("record") T0a9 record, @Param("example") T0a9Example example);
}