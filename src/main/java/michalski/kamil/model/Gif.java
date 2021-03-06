package michalski.kamil.model;

public class Gif {
    private String name;
    private String username;

    private boolean  favorite;

    private int categoryId;

    public Gif(String name, String username, boolean favorite, int categoryId) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }



    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }


}
