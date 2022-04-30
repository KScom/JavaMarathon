package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> musicBands = new ArrayList<>();
        List<MusicBand> newBands = new ArrayList<>();

        for (int i = 0; i < 12; i++){
            musicBands.add(new MusicBand("Группа " + i, 1995 + i));
        }

        newBands = groupsAfter2000(musicBands);

        for (MusicBand i:musicBands){
            System.out.println(i.getName() + " " + i.getYear());
        }

        System.out.println();

        for (MusicBand i:newBands){
            System.out.println(i.getName() + " " + i.getYear());
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){

        List<MusicBand> newBands = new ArrayList<>();

        for (MusicBand i:bands){
            if(i.getYear()>=2000){
                newBands.add(new MusicBand(i.getName(), i.getYear()));
            }
        }

        return newBands;
    }
}
