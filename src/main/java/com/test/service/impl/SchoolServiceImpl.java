package com.test.service.impl;

import com.test.domain.School;
import com.test.mapper.mysql.SchoolMapper;
import com.test.service.ISchoolService;

import jakarta.inject.Inject;
import org.mybatis.guice.transactional.Transactional;
import java.util.List;

/**
* School表场景处理具体实现
*
* @since 1.0
* @author kanglitian
* @date 2024-09-14 15:02:13.111
*/
public class SchoolServiceImpl implements ISchoolService
{
    @Inject
    private SchoolMapper schoolMapper;

    /**
    * School表根据主键单条查询
    *
    * @param id School表主键
    * @return School表
    */
    @Override
    public School selectSchoolById(Integer id) {
        return schoolMapper.selectSchoolById(id);
    }

    /**
    * School表动态查询
    *
    * @param school School表查询条件
    * @return School表结果集
    */
    @Override
    public List<School> selectSchoolList(School school) {
        return schoolMapper.selectSchoolList(school);
    }

    /**
    * School表多列in查询
    *
    * @param schoolList School表
    * @return School表集合
    */
    public List<School> schoolMultiColumnInQuery(List<School> schoolList) {
        return schoolMapper.schoolMultiColumnInQuery(schoolList);
    }

    /**
    * School表单条插入
    *
    * @param school School表对应实体
    * @return 影响行数
    */
    @Override
    public int insertSchool(School school) {
        return schoolMapper.insertSchool(school);
    }

    /**
    * School表批量插入
    *
    * @param schoolList School表对应实体列表
    * @return 影响行数
    */
    @Override
    public int batchInsertSchool(List<School> schoolList) {
        return schoolMapper.batchInsertSchool(schoolList);
    }

    /**
    * School表根据主键修改单行
    *
    * @param school School表对应实体
    * @return 影响行数
    */
    @Override
    public int updateSchool(School school) {
        return schoolMapper.updateSchool(school);
    }

    /**
    * School表根据主键批量修改
    *
    * @param schoolList School表对应实体列表
    * @return 影响行数
    */
    @Override
    @Transactional
    public int batchUpdateSchool(List<School> schoolList) {
        return schoolMapper.batchUpdateSchool(schoolList);
    }


    /**
    * School表根据主键单条删除
    *
    * @param id School表主键
    * @return 影响行数
    */
    @Override
    public int deleteSchoolById(Integer id) {
        return schoolMapper.deleteSchoolById(id);
    }

    /**
    * School表条件删除
    *
    * @param school School表
    *
    * @return School表被删除的记录条数
    */
    public int deleteSchool(School school){
        return schoolMapper.deleteSchool(school);
    }

    /**
    * School表批量删除
    *
    * @param schoolList 需要删除的数据主键集合
    * @return School表被批量删除的记录条数
    */
    public int batchDeleteSchool(List<School> schoolList) {
        return schoolMapper.batchDeleteSchool(schoolList);
    }

    /**
    * School表根据主键批量删除
    *
    * @param idArr School表主键数组
    * @return 影响行数
    */
    @Override
    public int deleteSchoolByIdArr(Integer[] idArr) {
        return schoolMapper.deleteSchoolByIdArr(idArr);
    }

    /**
    * School表保存，存在则更新，不存在则插入
    *
    * @param school School表
    *
    * @return School表受影响行数，更新返回2，插入返回1
    */
    public int saveSchoolById(School school) {
        return schoolMapper.saveSchoolById(school);
    }

    /**
    * School表批量保存，存在则更新，不存在则插入
    *
    * @param schoolList School表
    *
    * @return School表受影响行数
    */
    public int batchSaveSchoolById(List<School> schoolList) {
        return schoolMapper.batchSaveSchoolById(schoolList);
    }
}

