package com.firaol.interactive_cashregister.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String companyId;
    private String userId;
    private String date;
    private float total_amount;

    @Data
    private static class soldItem{
        private String itemId;
        private String itemName;
        private int quantity;
        private float price;
        private float subtotal;
    }
}
