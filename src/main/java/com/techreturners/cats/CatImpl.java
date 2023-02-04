package com.techreturners.cats;

public abstract class CatImpl implements Cat{
    private boolean isAsleep;
    private int averageHeight;
    private String setting;

    public CatImpl(boolean isAsleep, int averageHeight, String setting) {
        this.isAsleep = isAsleep;
        this.averageHeight = averageHeight;
        this.setting = setting;
    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }


    @Override
    public int getAverageHeight() {
        return averageHeight;
    }


    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public boolean goToSleep() {
        isAsleep = true;
        return isAsleep;
    }

    @Override
    public boolean wakeUp() {
        isAsleep = false;
        return isAsleep;
    }

    public String run() {
        return "All cats can run";
    }

    public abstract String eat();
}
