package pl.sdacademy.javapoz19programowanie1;

public class Author {
    //first name, lastname, birthyear, nation(enum)
    private String firstName;
    private String lastName;
    private int birthYear;
    private Nation nation;


    public Author(){

    }
    public Author(String firstName, String lastName, int birthyear, Nation nation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthyear;
        this.nation = nation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", nation=" + nation +
                '}';
    }
}
