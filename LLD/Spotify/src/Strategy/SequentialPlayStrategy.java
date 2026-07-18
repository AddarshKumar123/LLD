package Strategy;

import Model.Playlist;
import Model.Song;

public class SequentialPlayStrategy implements PlayStrategy{
    private Playlist currentPlaylist;
    private int currIndex;

    public SequentialPlayStrategy(){
        this.currentPlaylist=null;
        this.currIndex=-1;
    }

    @Override
    public void setPlaylist(Playlist playlist) {
        this.currentPlaylist=playlist;
        this.currIndex=-1;
    }

    @Override
    public boolean hasNext() {
        return ((currIndex+1)<currentPlaylist.getSize());
    }

    @Override
    public Song next() {
        if (currentPlaylist == null || currentPlaylist.getSize() == 0) {
            throw new RuntimeException("No playlist loaded or playlist is empty.");
        }
        currIndex=currIndex+1;
        return currentPlaylist.getSongs().get(currIndex);
    }

    @Override
    public boolean hasPrevious() {
        return ((currIndex-1)>0);
    }

    @Override
    public Song previous() {
        if (currentPlaylist == null || currentPlaylist.getSize() == 0) {
            throw new RuntimeException("No playlist loaded or playlist is empty.");
        }
        currIndex=currIndex-1;
        return currentPlaylist.getSongs().get(currIndex);
    }
}
