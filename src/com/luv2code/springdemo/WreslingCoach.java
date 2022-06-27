package com.luv2code.springdemo;

public class WreslingCoach implements Coach {

    private FortuneService fortuneService;

    public WreslingCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Submit 10 wrestlers, ankle pick 20";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
