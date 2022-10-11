package java_II.movies;

public class Movie {
    private String name;
    private String catagory;

    public Movie(String name, String catagory) {
        this.name = name;
        this.catagory = catagory;
    }

    public String getName() {
        return name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    
}
