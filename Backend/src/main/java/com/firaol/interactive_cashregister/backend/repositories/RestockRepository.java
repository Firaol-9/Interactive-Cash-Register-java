package com.firaol.interactive_cashregister.backend.repositories;

import com.firaol.interactive_cashregister.backend.models.Restock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestockRepository extends MongoRepository<Restock, String> {
}
