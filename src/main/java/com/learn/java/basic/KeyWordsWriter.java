package com.learn.java.basic;

import java.io.FileWriter;
import java.io.IOException;

public class KeyWordsWriter {

    private static final String DATA_SEPARATOR = " ";
    private String path;
    private Data data;

    public KeyWordsWriter(String path, Data data) {
        this.path = path;
        this.data = data;
    }

    public boolean save() {
//        FileWriter writer = null;

        try {
            FileWriter writer = new FileWriter(path);
            data.getMap().forEach((key, value) -> {
                try {
                    writer.write(key + DATA_SEPARATOR + value + System.lineSeparator());
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error");
                }
            });
        } catch (
                IOException e) {
            e.printStackTrace();
            System.out.println("Please check files");
        }
        return true;
    }
}
