package First;

public class PlayerFirst extends Price implements PlaySong {

    protected PlayerFirst(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println(PlayerFirst.music);
    }
}
