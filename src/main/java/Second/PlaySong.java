package Second;

abstract class  PlaySong {
    static final String music = "MUSIC!!!";
    private final int price;

    public PlaySong(int price) {
        this.price = price;
    }


    public abstract void playMusic();
    public int getPrice() {
        return price;
    }
}
