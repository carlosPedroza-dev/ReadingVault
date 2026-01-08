package com.files.ReadingVaultBackEnd.DTOs;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
}
