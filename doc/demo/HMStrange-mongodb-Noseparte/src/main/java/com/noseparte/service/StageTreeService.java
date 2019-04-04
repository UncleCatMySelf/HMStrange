package com.noseparte.service;

import com.noseparte.logic.StageTreeShop;

import java.util.List;

public interface StageTreeService {

    List<StageTreeShop> findTreeStages(int storyType, int pageSize, int pageNumber);

    long countByChannel(int storyType);
}
