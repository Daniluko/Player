package First;

public class PlayerFifth extends Price implements PlayAllSongs {

    protected PlayerFifth(int price) {
        super(price);
    }

    @Override
    public void playAllSong() {
        for ( int i=playelist.length -1 ; i>=0; i-- )
            System.out.println(playelist[i]);
    }

    @Override
    public void playSong() {
        System.out.println(PlayerFifth.music);
    }
}
