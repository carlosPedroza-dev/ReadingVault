package com.files.ReadingVaultBackEnd.Entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="app_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long userId;

    @Column(name = "user_name",unique = true)
    private String userName;
    @Column(name="user_email",unique=true)
   private String userEmail;

    @Column(name="user_password",nullable=false)
   private String userPassword;
    
   
    
}
