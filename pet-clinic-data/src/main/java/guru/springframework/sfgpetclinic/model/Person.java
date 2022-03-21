package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity{

    private String lastName;
    private String FirstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
}
