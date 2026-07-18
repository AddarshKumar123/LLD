package Managers;

import Model.Playlist;
import Model.Song;

import java.util.HashMap;
import java.util.Map;

public class PlaylistManager {

    Map<String, Playlist>playlists;
    private PlaylistManager(){
        playlists=new HashMap<>();
    }

    private static class SingletonHelper{
        private static final PlaylistManager INSTANCE = new PlaylistManager();
    }

    public static PlaylistManager getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public void createPlaylist(String name){
        if (playlists.containsKey(name)) {
            throw new RuntimeException("Playlist \"" + name + "\" already exists.");
        }

        playlists.put(name,new Playlist(name));
    }

    public void addSongToPlaylist(String playlistName, Song song){
        if (!playlists.containsKey(playlistName)) {
            throw new RuntimeException("Playlist \"" + playlistName + "\" not found.");
        }

        playlists.get(playlistName).addSongToPlaylist(song);
    }

    public Playlist getPlaylist(String name){
        if (!playlists.containsKey(name)) {
            throw new RuntimeException("Playlist \"" + name + "\" not found.");
        }

        return playlists.get(name);
    }

}
