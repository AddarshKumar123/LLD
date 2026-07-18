package Strategy;

import Model.Playlist;
import Model.Song;

public interface PlayStrategy {
    void setPlaylist(Playlist playlist);
    boolean hasNext();
    Song next();
    boolean hasPrevious();
    Song previous();
}
