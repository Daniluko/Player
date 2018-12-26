package First;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayerSixth extends Price implements PlayAllSongs {
    protected PlayerSixth(int price) {
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
        System.out.println(PlayerSixth.music);
    }

    public String[] shuffle(){
        List<String> list = Arrays.asList(PlayerSixth.playelist);
        Collections.shuffle(list);
        return list.toArray(new String[list.size()]);
    }
}
