package com.firaol.interactive_cashregister.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "companies")
public class Company {
    @Id
    private String id;
    private String name;
    private String moto;
    private String logo;
    private String address;
    private String email;
    private List<Category> categories;

    @Data
    public static class Category{
        private String category_id;
        private String name;
    }
}
