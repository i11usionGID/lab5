package ru.labs.musicInstruments;

public class Piano extends Instrument {

    public Piano() {
        super("Фортепиано");
    }

    @Override
    public void play() {
        System.out.println("Играем красивую мелодию на фортепиано.");
    }
}
