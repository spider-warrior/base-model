package cn.t.base.mybatis.dao;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T, E, PK extends Serializable> {

    void insert(T t);

    int insertSelective(T record);

    long countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(PK pk);

    List<T> selectByExample(E example);

    List<T> selectAll();

    T selectByPrimaryKey(PK pk);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByExample(@Param("record") T record, @Param("example") E example);

    int updateByPrimaryKey(T record);

    int updateByPrimaryKeySelective(T record);
}
