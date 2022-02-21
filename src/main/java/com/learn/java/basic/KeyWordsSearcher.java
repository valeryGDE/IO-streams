package com.learn.java.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KeyWordsSearcher {

    Pattern pattern = Pattern.compile("abstract|continue|for|new|switch|assert|default|goto|package|synchronized|boolean|do|if|private|this|break|double|implements|protected|throw|byte|else|import|public|throws|case|enum|instanceof|return|transient|catch|extends|int|short|try|char|final|interface|static|void|class|finally|long|strictfp|volatile|const|float|native|super|while");

    public void searchForKeyWords(String str, Data data) {
        Matcher matcher = pattern.matcher(str);
        int x = 1;
        while (matcher.find()) {
            data.getMap().merge(matcher.group(), x, Integer::sum);
        }
    }
}

