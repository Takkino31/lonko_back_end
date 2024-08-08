package takkino.learning.lonko.fixtures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import takkino.learning.lonko.entities.User;
import takkino.learning.lonko.repositories.UserRepository;

@Component
public class UserFixtures implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
	public void run(String... args) {
        User User = new User("aicha","looo","shahsha","shasha@gmail.com");
        System.out.println(User.toString());
        userRepository.save(User);
	}
}
