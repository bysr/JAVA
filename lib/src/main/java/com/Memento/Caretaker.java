package com.Memento;

import com.Facade.Memory;

import java.util.HashMap;
import java.util.Map;

/**
 * 管理者
 * Created by wangyawen on 2017/1/24 0024.
 */
public class Caretaker {


    private Map<String, Memento> memMap = new HashMap<>();

    public Memento getMemento(String index) {
        return memMap.get(index);
    }

    public void setMemMap(String index, Memento memento) {
        this.memMap.put(index, memento);
    }

}
