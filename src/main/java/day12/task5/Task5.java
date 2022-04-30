package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicBand> musicBand = new ArrayList<>();
        List<MusicArtist> musicArtists1 = new ArrayList<>();
        List<MusicArtist> musicArtists2 = new ArrayList<>();

        musicArtists1.add(new MusicArtist("John",20));
        musicArtists1.add(new MusicArtist("Bob", 22));
        musicBand.add(new MusicBand("U2",1980,musicArtists1));

        musicArtists2.add(new MusicArtist("Bill", 27));
        musicArtists2.add(new MusicArtist("Phil",30));
        musicBand.add(new MusicBand("ONE",2002,musicArtists2));

        musicBand.get(1).printMembers();

        MusicBand.transferMembers(musicBand.get(0),musicBand.get(1));

        musicBand.get(1).printMembers();

    }
}
