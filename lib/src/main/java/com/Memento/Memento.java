package com.Memento;

import java.util.Map;
import java.util.Objects;

/**
 * 备忘录角色 备份数据
 * Created by wangyawen on 2017/1/24 0024.
 */
public class Memento {
    private Map<String, Object> stateMap;

    public Memento(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }


}
