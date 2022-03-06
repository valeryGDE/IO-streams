package com.learn.java.basic;

import com.learn.java.basic.exception.KeyWordsException;

import java.io.FileNotFoundException;
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

    public boolean save() throws KeyWordsException {
        FileWriter writer = null;

        try {
            writer = new FileWriter(path);
            FileWriter finalWriter = writer;
            data.getMap().forEach((key, value) -> {
                try {
                    finalWriter.write(key + DATA_SEPARATOR + value + System.lineSeparator());
                    finalWriter.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error in lambda expression");
                }
            });
        } catch (FileNotFoundException e) {
            throw new KeyWordsException(e);
        } catch (IOException e) {
            throw new KeyWordsException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new KeyWordsException(e);
                }
            }
        }
        return true;
    }
}
