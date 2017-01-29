package michalski.kamil.repository;

import michalski.kamil.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class GiftRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "Kamil", false),
            new Gif("ben-and-mike", "Kamil", false),
            new Gif("book-dominos", "Kamil", true),
            new Gif("compiler-bot", "Kamil", false),
            new Gif("cowboy-coder", "Kamil", true),
            new Gif("infinite-andrew", "Kamil", false)
    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name))
                return gif;
        }
        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

    public List<Gif> getFavorites(){
        List<Gif> favorites = new ArrayList<Gif>();
         for (Gif gif : ALL_GIFS) {
            if (gif.isFavorite())
                favorites.add(gif);
        }
        return favorites;
    }
}
