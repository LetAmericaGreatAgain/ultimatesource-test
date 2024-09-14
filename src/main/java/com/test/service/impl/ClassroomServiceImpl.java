package com.test.service.impl;

import com.test.domain.Classroom;
import com.test.mapper.mysql.ClassroomMapper;
import com.test.service.IClassroomService;

import jakarta.inject.Inject;
import org.mybatis.guice.transactional.Transactional;
import java.util.List;

/**
* Classroom表场景处理具体实现
*
* @since 1.0
* @author kanglitian
* @date 2024-09-14 15:02:13.089
*/
public class ClassroomServiceImpl implements IClassroomService
{
    @Inject
    private ClassroomMapper classroomMapper;

    /**
    * Classroom表根据主键单条查询
    *
    * @param id Classroom表主键
    * @return Classroom表
    */
    @Override
    public Classroom selectClassroomById(Integer id) {
        return classroomMapper.selectClassroomById(id);
    }

    /**
    * Classroom表动态查询
    *
    * @param classroom Classroom表查询条件
    * @return Classroom表结果集
    */
    @Override
    public List<Classroom> selectClassroomList(Classroom classroom) {
        return classroomMapper.selectClassroomList(classroom);
    }

    /**
    * Classroom表多列in查询
    *
    * @param classroomList Classroom表
    * @return Classroom表集合
    */
    public List<Classroom> classroomMultiColumnInQuery(List<Classroom> classroomList) {
        return classroomMapper.classroomMultiColumnInQuery(classroomList);
    }

    /**
    * Classroom表单条插入
    *
    * @param classroom Classroom表对应实体
    * @return 影响行数
    */
    @Override
    public int insertClassroom(Classroom classroom) {
        return classroomMapper.insertClassroom(classroom);
    }

    /**
    * Classroom表批量插入
    *
    * @param classroomList Classroom表对应实体列表
    * @return 影响行数
    */
    @Override
    public int batchInsertClassroom(List<Classroom> classroomList) {
        return classroomMapper.batchInsertClassroom(classroomList);
    }

    /**
    * Classroom表根据主键修改单行
    *
    * @param classroom Classroom表对应实体
    * @return 影响行数
    */
    @Override
    public int updateClassroom(Classroom classroom) {
        return classroomMapper.updateClassroom(classroom);
    }

    /**
    * Classroom表根据主键批量修改
    *
    * @param classroomList Classroom表对应实体列表
    * @return 影响行数
    */
    @Override
    @Transactional
    public int batchUpdateClassroom(List<Classroom> classroomList) {
        return classroomMapper.batchUpdateClassroom(classroomList);
    }


    /**
    * Classroom表根据主键单条删除
    *
    * @param id Classroom表主键
    * @return 影响行数
    */
    @Override
    public int deleteClassroomById(Integer id) {
        return classroomMapper.deleteClassroomById(id);
    }

    /**
    * Classroom表条件删除
    *
    * @param classroom Classroom表
    *
    * @return Classroom表被删除的记录条数
    */
    public int deleteClassroom(Classroom classroom){
        return classroomMapper.deleteClassroom(classroom);
    }

    /**
    * Classroom表批量删除
    *
    * @param classroomList 需要删除的数据主键集合
    * @return Classroom表被批量删除的记录条数
    */
    public int batchDeleteClassroom(List<Classroom> classroomList) {
        return classroomMapper.batchDeleteClassroom(classroomList);
    }

    /**
    * Classroom表根据主键批量删除
    *
    * @param idArr Classroom表主键数组
    * @return 影响行数
    */
    @Override
    public int deleteClassroomByIdArr(Integer[] idArr) {
        return classroomMapper.deleteClassroomByIdArr(idArr);
    }

    /**
    * Classroom表保存，存在则更新，不存在则插入
    *
    * @param classroom Classroom表
    *
    * @return Classroom表受影响行数，更新返回2，插入返回1
    */
    public int saveClassroomById(Classroom classroom) {
        return classroomMapper.saveClassroomById(classroom);
    }

    /**
    * Classroom表批量保存，存在则更新，不存在则插入
    *
    * @param classroomList Classroom表
    *
    * @return Classroom表受影响行数
    */
    public int batchSaveClassroomById(List<Classroom> classroomList) {
        return classroomMapper.batchSaveClassroomById(classroomList);
    }
}

