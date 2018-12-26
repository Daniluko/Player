package First;

public class PlayerThird extends Price implements PlayAllSongs {

    public PlayerThird(int price) {
        super(price);
    }

    @Override
    public void playAllSong() {
        for (String mus : playelist) {
            System.out.println("Playing " + mus);
        }
    }

    @Override
    public void playSong() {
        System.out.println(PlayerThird.music);
    }
}
