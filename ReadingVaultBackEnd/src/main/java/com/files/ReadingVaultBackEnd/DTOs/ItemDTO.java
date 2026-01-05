package com.files.ReadingVaultBackEnd.DTOs;

import java.time.LocalDateTime;

import com.files.ReadingVaultBackEnd.Entities.Itemtype;

import lombok.Data;

@Data
public class ItemDTO {
private Long id;
private String title;
private String author;
private LocalDateTime publicationDate;
private Double price;
private Itemtype type;
private LocalDateTime createdAt;

}
