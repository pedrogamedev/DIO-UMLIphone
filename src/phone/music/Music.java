package phone.music;

public class Music {

    int id;
    double lenght;
    String name;
    String description;
    String credits;

    Music(int id, double lenght, String description, String credits) {}

    public int getId() {
        return id;
    }

    public double getLenght() {
        return lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
}
