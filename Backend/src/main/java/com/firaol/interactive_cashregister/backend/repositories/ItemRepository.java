package com.firaol.interactive_cashregister.backend.repositories;

import com.firaol.interactive_cashregister.backend.models.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
}
