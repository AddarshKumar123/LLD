package Strategy;

import Model.Playlist;
import Model.Song;

public class RandomPlayStrategy implements PlayStrategy {

    @Override
    public void setPlaylist(Playlist playlist) {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Song next() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Song previous() {
        return null;
    }
}
