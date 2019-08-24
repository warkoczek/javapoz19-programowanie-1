package pl.sdacademy.javapoz19programowanie1.User;

import java.util.List;

public class User {
    // utworzyc pakiet clase user z 4 polami gender(enum), age, balance long string, 3 utworzyc klase user
   //UserService(z lista userow na podstawie jasona)4. z metodami findByGender(Gender gender),mapToNames, sortByAge(), sortByBallance(), avgBallance(), findHighestBalance(
    private String name;
    private Gender gender;
    private int age;
    private Long balance;

    public User(String name, Gender gender, String balance, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.balance = Long.valueOf(balance
                .replace("$", "")
                .replace(".", "")
                .replace(",", ""));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
