package com.example.crud_basic.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotNull
    private String donor_name;
    @NotNull
    private String donor_email_id;

    @NotNull
    private Long donor_mobile_number;

    @NotNull
    private Long donor_amount;


    @NotNull
    private String donor_country;
    private String donor_cause;

}
