package com.example.emergency_care_made;

public class QuestionAnswer {

    public static String question[] = {
            "How many steps do you need to follow to ensure the risk of harm of covid will be minimal?",
            "What is the distance for social distancing COVID-19?",
            "What is the most effective way to prevent the spread of coronavirus?",
            "Why must we avoid touching our eyes, nose, or mouth during covid?",
            "How can you help someone you suspect has covid-19 without getting close to them?"
    };

    public static String choices[][] = {
            {"5 steps", "6 steps", "7 steps", "8 steps"},
            {"at least 1 millimeter", "at least 1 inches", "at least 1 meter", "at least 1 kilometer"},
            {"Washing your clothes", "Washing Hands", "Eat more orange", "Take a bath twice a day"},
            {"This is how the virus can enter the body", "This can clog your pores, which can lead to an outbreak", "This can cause anxiety in people.", "None of the above"},
            {"Keep your distance", "Throw them an alcohol", "Look after yourself", "Help them help themself"},
    };

    public static String correctAnswers[] = {
            "5 steps",
            "at least 1 meter",
            "Washing Hands",
            "his is how the virus can enter the body",
            "Help them help themself"
    };
}

