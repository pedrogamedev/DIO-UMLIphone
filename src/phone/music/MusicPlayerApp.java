package phone.music;

import phone.Iphone;

import java.util.ArrayList;

public class MusicPlayerApp extends Iphone {
    ArrayList<MusicPlaylist> playlistList;
    Music currentMusic;

    public void getMusicInfo() {}

    public Music getCurrentMusic() {
        return currentMusic;
    }
    public void playMusic(Music music) {}
    public void playMusic(MusicPlaylist playlist, Music music, int position) {}

    public void pauseMusic() {}

    public void stopMusic() {}

    public void createPlaylist(int id, String name, String description) {}

    public void deletePlaylist(MusicPlaylist playlist) {}

    public void addMusicToPlaylist(MusicPlaylist playlist, Music music) {}
    public void addMusicToPlaylist(MusicPlaylist playlist, Music music, int position) {}

    public void updatePlaylist(String name, String description) {}

    public void removeMusicFromPlaylist(MusicPlaylist playlist, int position) {}

    public void cleanPlaylist(MusicPlaylist playlist) {}
}
