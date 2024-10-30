package ru.labs.musicInstruments;

public class Guitar extends Instrument {

    public Guitar() {
        super("Гитара");
    }

    @Override
    public void play() {
        System.out.println("Перебираем струны гитары.");
    }
}

