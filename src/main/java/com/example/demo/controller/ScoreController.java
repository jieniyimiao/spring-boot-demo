package com.example.demo.controller;

import com.example.demo.dao.IScoreDao;
import com.example.demo.vo.Score;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController {

    private static final Logger logger = LoggerFactory.getLogger(ScoreController.class);

    @Autowired
    private IScoreDao scoreService;

    @RequestMapping("/scoreList")
    public List<Score> getScoreList(){
        logger.info("从数据库读取Score集合");
        // 测试更新数据库
        //scoreService.save(new Score(1, "jack", 1.1f , new Date()));
        //scoreService.save(new Score(2, "jack", 1.1f , new Date()));
        logger.info("更新的行数：" + scoreService.updateScoreById(88.8f, 2));
        //scoreService.delete(23);

        return scoreService.getList();
    }
}