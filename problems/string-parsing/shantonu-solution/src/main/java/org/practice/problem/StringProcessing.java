package org.practice.problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessing {
    private String para;
    private final String aux="am|is|are|was|were|be|can|being|been|do|does|did|has|have|had|having|Should|might";
    private final String verbs=aux+"|called|appear|derived|deleting|changing|need|detailed|calls|we’ll|making|able|make|preserves";

    public int getWordCount() {
        return getMatch("\\w+");
    }

    public void setParagraph(String word) {
        this.para = word;
    }

    public int getVerbCount() {
        return getMatch("^"+verbs+"\\s");
    }

    public int getAuxVerbCount() {
        return getMatch("^"+aux+"\\s");
    }

    public int getTheCount() {
        return getMatch("\\sthe\\s");
    }

    private int getMatch(String pattern){
        Matcher matcher = Pattern.compile(pattern).matcher(para);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    //todo 
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher("This is String for parsing where 12345 is number and others are String");


    }
}
