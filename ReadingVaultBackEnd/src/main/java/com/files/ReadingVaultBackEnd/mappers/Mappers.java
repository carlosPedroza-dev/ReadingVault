package com.files.ReadingVaultBackEnd.mappers;

import com.files.ReadingVaultBackEnd.DTOs.ItemDTO;
import com.files.ReadingVaultBackEnd.Entities.Item;


public class Mappers {
    public static ItemDTO toDTO(Item item){
        if(item == null){
            return null;
        }
        return ItemDTO.builder()
                .id(item.getItemId())
           .title(item.getItemTitle())
                .author(item.getItemAuthor())
                .publicationDate(item.getItemPublication())
                .price(item.getItemprice())
                .type(item.getItemType())
                .createdAt(item.getItemCreatedAt())
                .build();
    }
}
