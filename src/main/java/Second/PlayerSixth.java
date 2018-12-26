package Second;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayerSixth extends PlaySong implements PlayAllSong {
    public PlayerSixth(int price) {
        super(price);
    }

    @Override
    public void playMusic() {
        System.out.println(PlayerSixth.music);
    }

    @Override
    public void playAllSong() {
        for (String mus : playelist) {
            System.out.println("Playing " + mus);
        }
    }

    public String[] shuffle(){
        List<String> list = Arrays.asList(First.PlayerSixth.playelist);
        Collections.shuffle(list);
        return list.toArray(new String[list.size()]);
    }
}
