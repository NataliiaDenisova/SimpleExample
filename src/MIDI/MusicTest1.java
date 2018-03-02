package MIDI;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by Natali on 27.02.2018.
 */
public class MusicTest1 {
    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }

    public void play(){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Успешно получили синтезатор");
        } catch (MidiUnavailableException ex){
            System.out.println("Неудача");
        }

    }
}
