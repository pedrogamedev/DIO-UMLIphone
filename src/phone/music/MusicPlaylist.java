package phone.music;

import java.util.ArrayList;

public class MusicPlaylist {

    int id;
    String name;
    String description;
    ArrayList<Music> musicList;
    double timeLenght;

    MusicPlaylist(int id, String name, String description){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Music> getMusicList() {
        return musicList;
    }

    public double getTimeLenght() {
        return timeLenght;
    }
    public int getMusicPosition() { return 0; }

    public void addMusic(Music music) {}
    public void addMusic(Music music, int position) {}

    public void removeMusic(Music music) {}
    public void removeMusic(Music music, int position) {}

    public void cleanPlaylist() {}

    public void deletePlayList() {}
}
