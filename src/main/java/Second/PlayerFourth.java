package Second;

public class PlayerFourth extends PlaySong implements PlayAllSong {
    public PlayerFourth(int price) {
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
        System.out.println("Plaing: " + playelist[(playelist.length - 1)]);
    }
}
