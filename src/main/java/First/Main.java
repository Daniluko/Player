package First;

public class Main {
    public static void main(String[] args) {
        System.out.println("First.PlayerFirst : ");
        PlayerFirst playerFirst = new PlayerFirst(100);
        playerFirst.playSong();

        System.out.println("First.PlayerSecond : ");
        PlayerSecond playerSecond = new PlayerSecond(150);
        playerSecond.playSong();

        System.out.println("First.PlayerThird : ");
        PlayerThird playerThird = new PlayerThird(200);
        playerThird.playSong();
        playerThird.playAllSong();

        System.out.println("First.PlayerFourth : ");
        PlayerFourth playerFourth = new PlayerFourth(250);
        playerFourth.playSong();
        playerFourth.playAllSong();

        System.out.println("First.PlayerFifth : ");
        PlayerFifth playerFifth = new PlayerFifth(300);
        playerFifth.playSong();
        playerFifth.playAllSong();

        System.out.println("First.PlayerSixth : ");
        PlayerSixth playerSixth = new PlayerSixth(350);
        playerSixth.playSong();
        playerSixth.playAllSong();
        playerSixth.shuffle();
        System.out.println("after snuffle :");
        playerSixth.playAllSong();
    }
}
