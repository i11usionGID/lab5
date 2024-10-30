package ru.labs;

import ru.labs.musicInstruments.*;

public class Main {
    public static void main(String[] args) {
        Instrument piano = new Piano();
        Instrument guitar = new Guitar();
        Instrument drums = new Drums();
        ElectronicInstrument synthesizer = new Synthesizer();

        piano.play();
        guitar.play();
        drums.play();

        synthesizer.play();
        synthesizer.adjustVolume(5);
    }
}
