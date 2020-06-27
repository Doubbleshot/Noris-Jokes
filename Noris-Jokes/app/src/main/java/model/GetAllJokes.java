package model;

import java.util.List;

public class GetAllJokes {

    private String type;
    private List<Joke> value;

    public GetAllJokes() {
    }

    public GetAllJokes(String type, List<Joke> value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Joke> getValue() {
        return value;
    }

    public void setValue(List<Joke> value) {
        this.value = value;
    }
}
