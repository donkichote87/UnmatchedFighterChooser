package pl.basicstuff.model;

import java.util.List;

public class Box {
    private Long id;
    private String title;
    private List<String> fighters;

    public Box(Long id, String title, List<String> fighters) {
        this.id = id;
        this.title = title;
        this.fighters = fighters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getFighters() {
        return fighters;
    }

    public void setFighters(List<String> fighters) {
        this.fighters = fighters;
    }
}

