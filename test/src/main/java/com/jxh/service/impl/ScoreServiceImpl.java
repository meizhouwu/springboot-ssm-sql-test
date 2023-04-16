package com.jxh.service.impl;

import com.jxh.domain.Score;
import com.jxh.mapper.ScoreMapper;
import com.jxh.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author meizh
 */

@Service
public class ScoreServiceImpl implements IScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public List<Score> findAll() {
        return scoreMapper.findAll();
    }

    @Override
    public Score findById(Long id) {
        return scoreMapper.findById(id);
    }

    @Override
    public void addScore(Score score) {
        scoreMapper.addScore(score);
    }

    @Override
    public void updateScore(Score score) {
        scoreMapper.updateScore(score);
    }

    @Override
    public void deleteScore(Long id) {
        scoreMapper.deleteScore(id);
    }

    @Override
    public List<Score> find() {
        return scoreMapper.find();
    }
}
