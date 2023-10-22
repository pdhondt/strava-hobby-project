package be.kunlabora.stravahobbyproject.clients.strava;

public class Athlete {
    private final long id;
    private final String username;
    private final String firstname;
    private final String lastname;
    private final String city;
    private final String state;
    private final String country;
    private final String sex;
    private final Double weight;

    public Athlete(long id, String username, String firstname, String lastname, String city, String state, String country, String sex, Double weight) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.state = state;
        this.country = country;
        this.sex = sex;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getSex() {
        return sex;
    }

    public Double getWeight() {
        return weight;
    }
}
