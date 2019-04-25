package com.lambdaschool.solution;

public class App implements Processor
{
    private AthleteMessage athMessage;

    public App(AthleteMessage athMessage)
    {
        this.athMessage = athMessage;
    }

    public void displayAthlete()
    {
        athMessage.displayAthlete();
    }

}
