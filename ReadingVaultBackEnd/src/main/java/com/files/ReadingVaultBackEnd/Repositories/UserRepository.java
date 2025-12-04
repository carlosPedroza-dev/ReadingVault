package com.files.ReadingVaultBackEnd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.files.ReadingVaultBackEnd.Entities.User;
@Repository
interface  UserRepository extends JpaRepository<User,Long>{
    
}
