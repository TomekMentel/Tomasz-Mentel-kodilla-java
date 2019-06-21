package food2Door;

public class Supplier {

    private String name, surname, address, email;
    private int telNr;

    public Supplier(String name, String surname, String address, String email, int telNr) {
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

    public int getTelNr() {
        return telNr;
    }
}