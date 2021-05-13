package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void given_Message_When_Sad_Should_Return_Sad(){
        String mood=null;
        try {
            mood = moodAnalyser.analysisMood("This is a Sad Message");
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void given_Message_When_Null_Should_Return_Happy() {
        String mood = null;
        try {
            mood = moodAnalyser.analysisMood(null);
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExcetionType.ENTERED_NULL, e.type);
            Assertions.assertEquals("Enter proper mood", e.getMessage());
        }
    }

    @Test
    public void given_Message_When_Null_ReturnCustomException(){
        try {
            String mood = moodAnalyser.analysisMood("");
            Assertions.assertEquals("HAPPY", mood);
        }catch (MoodAnalyserException e){
            Assertions.assertEquals(MoodAnalyserException.ExcetionType.ENTERED_EMPTY, e.type);
            e.printStackTrace();
        }
    }
}
