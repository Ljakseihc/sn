package by.my.sn.dao;

import by.my.sn.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User, Long> {

    List<User> findAll();

    User findByIdUser(Long idUser);

    @SuppressWarnings("unchecked")
    User save(User user);

}
