package model;

import java.util.List;

public class Joke {
    private int id;
    private String joke;
    private List<String> categories;

    public Joke() {
    }

    public Joke(int id, String joke, List<String> categories) {
        this.id = id;
        this.joke = joke;
        this.categories = categories;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }


}
