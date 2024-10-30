package ru.labs.musicInstruments;

public class Synthesizer extends ElectronicInstrument {

    public Synthesizer() {
        super("Синтезатор");
    }

    @Override
    public void play() {
        System.out.println("Играем синтезированные звуки на синтезаторе.");
    }

    @Override
    public void adjustVolume(int level) {
        System.out.println("Регулируем громкость синтезатора до уровня " + level);
    }
}

