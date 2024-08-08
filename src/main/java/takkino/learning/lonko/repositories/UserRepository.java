package takkino.learning.lonko.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import takkino.learning.lonko.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByLastName(String lastName);

    User findById(long id);
}
