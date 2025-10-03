package com.firaol.interactive_cashregister.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "items")
public class Item {
    @Id
    private String id;
    private String companyId;
    private String name;
    private String categoryId;
    private float purchasedPrice;
    private float retailPrice;
    private Stock stock;
    private String imagePath;
    private int code;

    @Data
    public static class Stock{
        private int quantity;
        private String unit;
    }
}
