package First;

public class PlayerSecond extends Price implements PlaySong {

    protected PlayerSecond(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Error");
    }
}
