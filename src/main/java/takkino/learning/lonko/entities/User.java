package takkino.learning.lonko.entities;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String firstName, lastName, username, email, password;
    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public User() {
        // Constructeur sans argument nécessaire pour JPA
    }

    public User(String firstName, String lastName, String username, String email) {
  
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = encodePassword("password");
    }

    public static String encodePassword(String password) {
            return passwordEncoder.encode(password);
    }
    
    public Long getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = passwordEncoder.encode(password);
        System.err.println("________________________________");
        System.out.println("le mot de passe est --- "+ this.password);
        System.err.println("________________________________");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
