package com.sandy.crudsand.repository;

import com.sandy.crudsand.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUserName(String username);

    void deleteById(String id);
}
