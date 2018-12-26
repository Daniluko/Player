package Second;

public class PlayerFifth extends PlaySong implements PlayAllSong {
    public PlayerFifth(int price) {
        super(price);
    }

    @Override
    public void playAllSong() {
        for ( int i=playelist.length -1 ; i>=0; i-- )
            System.out.println(playelist[i]);
    }

    @Override
    public void playMusic() {
        System.out.println(PlayerFifth.music);
    }
}
