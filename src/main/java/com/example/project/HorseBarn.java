package com.example.project;

public class HorseBarn {
    private Horse[] stalls;

    public HorseBarn(int numStalls) {
        this.stalls = new Horse[numStalls];
    }

    public HorseBarn(Horse[] sampleStalls) {
        stalls = sampleStalls;
    }

    public Horse[] getStalls() {
        return stalls;
    }

    public String horseBarnInfo() {
        String str = "";
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] == null) {
                str += "Stall " + i + ": empty";
            } else {
                str += "Stall " + i + stalls[i].horseInfo();
            }
            str += "\n";
        }
        return str;
    }

    public void placeHorse(Horse horse, int stall) {
        stalls[stall] = horse;
    }

    public int findHorseStall(String name) {
        int indx = -1;
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null) {
                if (stalls[i].getName().equals(name)) {
                    indx = i;
                }
            }
        }
        return indx;
    }

    public void consolidate() {
        /* to be implemented in part (e) */
        Horse[] newStalls = new Horse[stalls.length];
        int index = 0;
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null) {
                newStalls[index] = stalls[i];
                index++;
            }
        }
        stalls = newStalls;
    }
}
