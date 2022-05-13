package MusicLandscape.entities;

public class Album extends Release{
public TrackListItem trackListHead;

    @Override
    int totalTime() {
        return 0;
    }
}
