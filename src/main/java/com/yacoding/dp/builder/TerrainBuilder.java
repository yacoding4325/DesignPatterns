package com.yacoding.dp.builder;

/**
 * @Author yaCoding
 * @create 2022-05-30 下午 3:39
 */

public interface TerrainBuilder {

    TerrainBuilder buildWall();
    TerrainBuilder buildFort();
    TerrainBuilder buildMine();
    Terrain build();

}
