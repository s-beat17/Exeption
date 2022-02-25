package pack;

import exception.*;

public class User {
    private static String surname;
    private static String name;
    private static int age;
    private static String email;
    private static String phone;

    public User() {
    }

    public User(String surname, String name, int age, String email, String phone) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static void valid(User user) throws UserValidException {
        if (surname == null || !surname.matches("[a-zA-Z]+")) {
            try {
                throw new UserSurnameException();
            } catch (UserSurnameException ex) {
                ex.printStackTrace();
            }
        }
        if (name == null || !name.matches("[a-zA-Z]+")) {
            try {
                throw new UserNameException();
            } catch (UserNameException ex) {
                ex.printStackTrace();
            }
        }
        if (age == 0 || age <= 0 || age >= 100) {
            try {
                throw new UserAgeException();
            } catch (UserAgeException ex) {
                ex.printStackTrace();
            }
        }
        if (email == null || !email.matches("^((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$")) {
            try {
                throw new UserMailException();
            } catch (UserMailException ex) {
                ex.printStackTrace();
            }
        }
        if (phone == null || !phone.matches("^([0]){1}([0-9]){9}$")) {
            try {
                throw new UserPhoneException();
            } catch (UserPhoneException ex) {
                ex.printStackTrace();
            }
        }
    }
}
