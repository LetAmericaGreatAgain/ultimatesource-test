package com.test.mapper.mysql;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.test.domain.School;


/**
* School表Mapper接口
*
* @since 1.0
* @author kanglitian
* @date 2024-09-14 15:02:13.111
*/
public interface SchoolMapper
{
    /**
    * School表根据主键查询
    *
    * @param id School表主键
    * @return School表
    */
    public School selectSchoolById(Integer id);

    /**
    * School表动态条件查询
    *
    * @param school School表
    * @return School表集合
    */
    public List<School> selectSchoolList(School school);

    /**
    * School表多列or查询
    *
    * @param schoolList School表
    * @return School表集合
    */
//    public List<School> schoolMultiColumnOrQuery(List<School> schoolList);

    /**
    * School表多列in查询
    *
    * @param schoolList School表
    * @return School表集合
    */
    public List<School> schoolMultiColumnInQuery(List<School> schoolList);

    /**
    * School表多列union查询
    *
    * @param schoolList School表
    * @return School表集合
    */
//    public List<School> schoolMultiColumnUnionQuery(List<School> schoolList);

    /**
    * School表多列union all查询
    *
    * @param schoolList School表
    * @return School表集合
    */
//    public List<School> schoolMultiColumnUnionAllQuery(List<School> schoolList);

    /**
    * School表单条插入
    *
    * @param school School表
    * @return 影响行数
    */
    public int insertSchool(School school);

    /**
    * School表批量插入
    *
    * @param schoolList School表
    * @return 影响行数
    */
    public int batchInsertSchool(List<School> schoolList);

    /**
    * School表根据主键修改单条记录
    *
    * @param school School表
    * @return School表被修改的记录条数
    */
    public int updateSchool(School school);

    /**
    * School表根据主键批量修改
    *
    * @param schoolList School表
    * @return School表被修改的记录条数
    */
    public int batchUpdateSchool(List<School> schoolList);

    /**
    * School表单条删除
    *
    * @param id School表主键
    * @return School表被删除的记录条数
    */
    public int deleteSchoolById(Integer id);

    /**
    * School表条件删除
    *
    * @param school School表
    *
    * @return School表被删除的记录条数
    */
    public int deleteSchool(School school);


    /**
    * School表批量删除
    *
    * @param schoolList 需要删除的数据主键集合
    * @return School表被批量删除的记录条数
    */
    public int batchDeleteSchool(List<School> schoolList);

    /**
    * School表批量删除
    *
    * @param idArr School表主键集合
    * @return School表被批量删除的记录条数
    */
    public int deleteSchoolByIdArr(@Param("idArr")Integer[] idArr);

    /**
    * School表保存，存在则更新，不存在则插入
    *
    * @param school School表
    *
    * @return School表受影响行数，更新返回2，插入返回1
    */
    public int saveSchoolById(School school);

    /**
    * School表批量保存，存在则更新，不存在则插入
    *
    * @param schoolList School表
    *
    * @return School表受影响行数
    */
    public int batchSaveSchoolById(List<School> schoolList);

}

