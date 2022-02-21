package com.learn.java.basic;

import com.learn.java.basic.exception.KeyWordsException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String file1 = "resources/file.java";
        String file2 = "resources/result.txt";

        Data data = null;

        KeyWordsReader keyWordsReader = null;
        KeyWordsWriter keyWordsWriter = null;

        try {
            keyWordsReader = new KeyWordsReader(file1);
            data = keyWordsReader.take();

            keyWordsWriter = new KeyWordsWriter(file2, data);
            boolean b = keyWordsWriter.save();

        } catch (KeyWordsException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
