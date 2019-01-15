package org.fattrackit;

public class RecreationalActivity {
    private String name;
    private String favoriteRecreationalActivity;
    private float time;


    RecreationalActivity(String name) {
        this.name = name;
    }

    public void walk(String favoriteRecreationalActivity) {
        this.favoriteRecreationalActivity = favoriteRecreationalActivity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteRecreationalActivity() {
        return favoriteRecreationalActivity;
    }

    public void setFavoriteRecreationalActivity(String favoriteRecreationalActivity) {
        this.favoriteRecreationalActivity = favoriteRecreationalActivity;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
}
