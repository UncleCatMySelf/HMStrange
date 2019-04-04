package com.noseparte.service.impl;

import com.noseparte.dao.StageTreeDao;
import com.noseparte.logic.StageTreeShop;
import com.noseparte.service.StageTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StageTreeServiceImpl implements StageTreeService {

    @Autowired
    private StageTreeDao stageTreeDao;

    @Override
    public List<StageTreeShop> findTreeStages(int storyType, int pageSize, int pageNumber) {
        return stageTreeDao.findTreeStages(storyType, pageSize, pageNumber);
    }

    @Override
    public long countByChannel(int storyType) {
        return stageTreeDao.countByChannel(storyType);
    }
}
