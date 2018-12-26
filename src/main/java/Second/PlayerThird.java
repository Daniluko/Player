package Second;

public class PlayerThird extends PlaySong implements PlayAllSong {

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
    public void playMusic() {
        System.out.println(PlayerThird.playelist[0]);
    }
}
