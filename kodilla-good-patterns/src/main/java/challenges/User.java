package challenges;

public class User {

    private String name;
    private String surname;
    private String address;
    private String email;
    private long telNr;

    public User(String name, String surname, String address, String email, long telNr) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.telNr = telNr;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public long getTelNr() {
        return telNr;
    }
}

