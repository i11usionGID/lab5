package ru.labs.musicInstruments;

public class ElectronicInstrument extends Instrument {

    public ElectronicInstrument(String name) {
        super(name);
    }

    public void adjustVolume(int level) {
        System.out.println("Регулируем громкость до уровня " + level);
    }

    @Override
    public void play() {
        System.out.println("Играем электронную музыку на " + name);
    }
}

