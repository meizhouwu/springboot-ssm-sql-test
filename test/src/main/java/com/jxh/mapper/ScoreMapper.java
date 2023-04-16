package com.jxh.mapper;

import com.jxh.domain.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author meizh
 */
@Mapper
public interface ScoreMapper {

    /**
     * 查询所有分数信息
     */
    List<Score> findAll();

    /**
     * 根据id查询分数信息
     */
    Score findById(Long id);

    /**
     * 添加分数信息
     */
    void addScore(Score score);

    /**
     * 修改分数信息
     */
    void updateScore(Score score);

    /**
     * 根据id删除分数信息
     */
    void deleteScore(Long id);


    /**
     * 查询所有分数所属学生和课程名
     */
    List<Score> find();
}
