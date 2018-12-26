package Second;

public class PlayerFirst extends PlaySong {
    public PlayerFirst(int price) {
        super(price);
    }

    @Override
    public void playMusic() {
        System.out.println(PlayerFirst.music);
    }
}
