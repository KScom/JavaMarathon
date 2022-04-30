package day12.task4;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members){
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }


    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public List<String> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2){

        band2.getMembers().addAll(band1.getMembers());
        band1.getMembers().clear();
    }

    public void printMembers(){

        for (String i:this.members){
            System.out.println(i);
        }

    }
}
