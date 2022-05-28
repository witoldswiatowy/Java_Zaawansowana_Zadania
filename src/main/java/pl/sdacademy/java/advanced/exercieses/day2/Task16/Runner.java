package pl.sdacademy.java.advanced.exercieses.day2.Task16;

import java.util.Arrays;

public enum Runner {
    BEGINNER(240,360),
    INTERMEDIATE(180,240),
    ADVANCE(100,180);

    int minMarathonTime;
    int maxMarathonTime;

    Runner(int minMarathonTime, int maxMarathonTime) {
        this.minMarathonTime = minMarathonTime;
        this.maxMarathonTime = maxMarathonTime;
    }

    static Runner getFitnessLevel (int time){
        return Arrays.stream(values())
                .filter(r -> time > r.minMarathonTime && time <= r.maxMarathonTime)
                .findFirst()
//                .orElse(BEGINNER); //jedno z rozwiązań, że zwracamy deufoltowa wartowś
                .orElseThrow(() -> new IllegalArgumentException("Given time out of possible bound"));
//        if(time > 240 && time < 360){
//            return Runner.BEGINNER;
//        }
    }
}
