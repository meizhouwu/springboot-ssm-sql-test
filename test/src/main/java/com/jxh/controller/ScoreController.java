package com.jxh.controller;

import com.jxh.domain.Score;
import com.jxh.service.IScoreService;
import com.jxh.until.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author meizh
 */
@Controller
@RequestMapping("/score")
@ResponseBody
public class ScoreController {

    @Autowired
    private IScoreService scoreService;


    @GetMapping("/findall")
    public List<Score> findAll() {
        return scoreService.findAll();
    }


    @GetMapping ("/findbyid")
    public Score findOne(Long id) {
        return scoreService.findById(id);
    }


    @PutMapping("/save")
    public AjaxResult save(Score score){
        try {
            if(score.getId() == null){//添加
                score.setCreate_time(new Date());
                scoreService.addScore(score);
            }else{
                score.setUpdate_time(new Date());
                scoreService.updateScore(score);
            }
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false,"操作失败");
        }
    }

    @DeleteMapping("/delete")
    public AjaxResult del(Long id){
        try {
            scoreService.deleteScore(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false,"操作失败");
        }
    }


    @GetMapping("/find")
    public List<Score> find() {
        return scoreService.find();
    }
}
