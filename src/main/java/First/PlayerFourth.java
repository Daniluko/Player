package First;

public class PlayerFourth extends Price implements PlayAllSongs {

    protected PlayerFourth(int price) {
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
        System.out.println("Plaing: " + playelist[(playelist.length - 1)]);
    }
}
