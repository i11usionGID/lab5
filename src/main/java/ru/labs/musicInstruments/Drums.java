package ru.labs.musicInstruments;

public class Drums extends Instrument {

    public Drums() {
        super("Барабаны");
    }

    @Override
    public void play() {
        System.out.println("Ритмично бьем по барабанам.");
    }
}

