package com.moodanalyser;

public class MoodAnalyserException extends Exception {

    public ExcetionType type;

    public enum ExcetionType {
        ENTERED_EMPTY,ENTERED_NULL;
    }
    public MoodAnalyserException(ExcetionType type,String message) {
        super(message);
        this.type=type;
    }
}
