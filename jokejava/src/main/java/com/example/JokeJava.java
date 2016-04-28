package com.example;

import java.util.Random;

public class JokeJava {
    static final String[] JokeArray = {
            "I went to the psychiatrist, and he says \"You're crazy.\" I tell him I want a second opinion. He says, \"Okay, you're ugly too!\" ",
            "A guy shows up late for work. The boss yells \"You should have been here at 8:30!\" he replies: \"Why? What happened at 8:30?\"",
            "I failed my driver’s test. The guy asked me \"what do you do at a red light?\" I said, I don’t know… look around, listen to the radio…",
            "A guy asks a lawyer what his fee is. \"I charge $50 for three questions,\" the lawyer says. \"That’s awfully steep, isn’t it?\" the guy asks. \"Yes,\" the lawyer replies, \"Now what’s your final question?\""
    };
    public String getJoke(){
        //http://stackoverflow.com/questions/13340516/random-element-from-string-array
        int idx = new Random().nextInt(JokeArray.length);
        return (JokeArray[idx]);
    }
}
