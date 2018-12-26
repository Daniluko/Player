package First;

abstract class Price implements PlaySong{
    private final int price;

    public Price(int price) {
        this.price = price;
    }
    @Override
    public int getPrice(){
        return price;
    }
}
