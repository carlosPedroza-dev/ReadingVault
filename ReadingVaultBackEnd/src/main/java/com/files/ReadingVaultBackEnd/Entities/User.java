package com.files.ReadingVaultBackEnd.Entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="app_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    @Column(name="user_email",unique=true)
   private String email;

    @Column(name="user_password")
   private String password;
    
    public User(){}

    public User(String email,String password){
        this.email = email;
        this.password = password;
    }

public void setId(Long id){
    this.id = id;
}

public Long getId(){
    return id;
}

   public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

public String getEmail(){
    return email;
}

    public String getPassword(){
        return password;
    }

    
}
