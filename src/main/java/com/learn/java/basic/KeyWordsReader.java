package com.learn.java.basic;

import com.learn.java.basic.exception.KeyWordsException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class KeyWordsReader {

    private String path;

    public KeyWordsReader() {
    }

    public KeyWordsReader(String path) {
        this.path = path;
    }

    public Data take() throws KeyWordsException {

        FileReader reader = null;
        Data data = new Data();
        KeyWordsSearcher keyWordsSearcher = new KeyWordsSearcher();

        try {
            reader = new FileReader(path);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                keyWordsSearcher.searchForKeyWords(scanner.nextLine(), data);
            }

        } catch (FileNotFoundException e) {
            throw new KeyWordsException(e);
        } catch (IOException e) {
            throw new KeyWordsException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new KeyWordsException(e);
                }
            }
        }

        return data;
    }
}

