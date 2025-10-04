package com.firaol.interactive_cashregister.backend.repositories;

import com.firaol.interactive_cashregister.backend.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
