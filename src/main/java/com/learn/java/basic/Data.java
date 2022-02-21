package com.learn.java.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Data {

    private Map<String, Integer> map;

    public Data() {
        map = new HashMap<>();
    }

    public Data(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(map, data.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    @Override
    public String toString() {
        return "Data{" +
                "map=" + map +
                '}';
    }
}
