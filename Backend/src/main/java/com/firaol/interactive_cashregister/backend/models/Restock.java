package com.firaol.interactive_cashregister.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document (collection = "restocks")
public class Restock {
    @Id
    private String id;
    private String itemId;
    private String companyId;
    private String userId;
    private double quantity;
    private double balanceAfter;
    private String timeStamp;
}
