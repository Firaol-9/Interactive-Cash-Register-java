package com.firaol.interactive_cashregister.backend.repositories;

import com.firaol.interactive_cashregister.backend.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
}
