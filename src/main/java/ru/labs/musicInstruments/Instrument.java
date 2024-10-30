package ru.labs.musicInstruments;

public class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Играем на музыкальном инструменте.");
    }

    @Override
    public String toString() {
        return "Instrument{name='" + name + "'}";
    }
}


