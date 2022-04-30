package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<MusicBand> musicBands = new ArrayList<>();
        List<String> members1 = new ArrayList<>();
        List<String> members2 = new ArrayList<>();

        members1.add("Bob");
        members1.add("Phil");
        members2.add("John");
        members2.add("Sam");

        musicBands.add(new MusicBand("U2", 1980, members1));
        musicBands.add(new MusicBand("ONE", 2000, members2));

        MusicBand.transferMembers(musicBands.get(0),musicBands.get(1));

        musicBands.get(0).printMembers();

    }
}
