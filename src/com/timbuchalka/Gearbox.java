package com.timbuchalka;

import java.util.ArrayList;

/**
 * Created by Antonina on 2017-08-09.
 */
public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGear;
    private int currentGear;
    private boolean clucthIsIn;

    public Gearbox(int maxGear){
        this.gears = new ArrayList<Gear>();
        this.maxGear = maxGear;
        Gear neutral = new Gear(0);
        this.gears.add(neutral);

        for(int i=0; i<=maxGear; i++){
            this.gears.add(i, new Gear(i));
        }
    }

    public void setClucthIsIn(boolean clucthIsIn) {
        this.clucthIsIn = clucthIsIn;
    }

    public ArrayList<Gear> getGears() {
        return gears;
    }

    public void changeGear(int newGear){
        if(newGear>=0 && newGear<this.gears.size() && clucthIsIn){
            this.currentGear = newGear;
            System.out.println("Current gear: " + newGear);
        }
        else{
            this.currentGear=0;
            System.out.println("Unsuccessful");
        }
    }

    private class Gear{
        private int number;
        private double ratio;

        public Gear(int number){
            this.number= number;
            this.ratio = number * 1.3;
        }

        public int getNumber() {
            return number;
        }
    }
}
