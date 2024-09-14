package com.test.mapper.mysql;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.test.domain.Classroom;


/**
* Classroom表Mapper接口
*
* @since 1.0
* @author kanglitian
* @date 2024-09-14 15:02:13.089
*/
public interface ClassroomMapper
{
    /**
    * Classroom表根据主键查询
    *
    * @param id Classroom表主键
    * @return Classroom表
    */
    public Classroom selectClassroomById(Integer id);

    /**
    * Classroom表动态条件查询
    *
    * @param classroom Classroom表
    * @return Classroom表集合
    */
    public List<Classroom> selectClassroomList(Classroom classroom);

    /**
    * Classroom表多列or查询
    *
    * @param classroomList Classroom表
    * @return Classroom表集合
    */
//    public List<Classroom> classroomMultiColumnOrQuery(List<Classroom> classroomList);

    /**
    * Classroom表多列in查询
    *
    * @param classroomList Classroom表
    * @return Classroom表集合
    */
    public List<Classroom> classroomMultiColumnInQuery(List<Classroom> classroomList);

    /**
    * Classroom表多列union查询
    *
    * @param classroomList Classroom表
    * @return Classroom表集合
    */
//    public List<Classroom> classroomMultiColumnUnionQuery(List<Classroom> classroomList);

    /**
    * Classroom表多列union all查询
    *
    * @param classroomList Classroom表
    * @return Classroom表集合
    */
//    public List<Classroom> classroomMultiColumnUnionAllQuery(List<Classroom> classroomList);

    /**
    * Classroom表单条插入
    *
    * @param classroom Classroom表
    * @return 影响行数
    */
    public int insertClassroom(Classroom classroom);

    /**
    * Classroom表批量插入
    *
    * @param classroomList Classroom表
    * @return 影响行数
    */
    public int batchInsertClassroom(List<Classroom> classroomList);

    /**
    * Classroom表根据主键修改单条记录
    *
    * @param classroom Classroom表
    * @return Classroom表被修改的记录条数
    */
    public int updateClassroom(Classroom classroom);

    /**
    * Classroom表根据主键批量修改
    *
    * @param classroomList Classroom表
    * @return Classroom表被修改的记录条数
    */
    public int batchUpdateClassroom(List<Classroom> classroomList);

    /**
    * Classroom表单条删除
    *
    * @param id Classroom表主键
    * @return Classroom表被删除的记录条数
    */
    public int deleteClassroomById(Integer id);

    /**
    * Classroom表条件删除
    *
    * @param classroom Classroom表
    *
    * @return Classroom表被删除的记录条数
    */
    public int deleteClassroom(Classroom classroom);


    /**
    * Classroom表批量删除
    *
    * @param classroomList 需要删除的数据主键集合
    * @return Classroom表被批量删除的记录条数
    */
    public int batchDeleteClassroom(List<Classroom> classroomList);

    /**
    * Classroom表批量删除
    *
    * @param idArr Classroom表主键集合
    * @return Classroom表被批量删除的记录条数
    */
    public int deleteClassroomByIdArr(@Param("idArr")Integer[] idArr);

    /**
    * Classroom表保存，存在则更新，不存在则插入
    *
    * @param classroom Classroom表
    *
    * @return Classroom表受影响行数，更新返回2，插入返回1
    */
    public int saveClassroomById(Classroom classroom);

    /**
    * Classroom表批量保存，存在则更新，不存在则插入
    *
    * @param classroomList Classroom表
    *
    * @return Classroom表受影响行数
    */
    public int batchSaveClassroomById(List<Classroom> classroomList);

}

