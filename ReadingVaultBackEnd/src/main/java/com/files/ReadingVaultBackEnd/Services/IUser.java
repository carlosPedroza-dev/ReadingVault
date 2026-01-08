package com.files.ReadingVaultBackEnd.Services;

import com.files.ReadingVaultBackEnd.DTOs.UserDTO;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;

public interface IUser {
    public UserDTO createUser(UserDTO userDTO);
    public UserDTO updateUser(Long id,UserDTO userDTO);
    public void deleteUser(Long id);
}
