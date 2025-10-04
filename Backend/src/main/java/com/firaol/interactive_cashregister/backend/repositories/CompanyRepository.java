package com.firaol.interactive_cashregister.backend.repositories;

import com.firaol.interactive_cashregister.backend.models.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company, String> {
}
