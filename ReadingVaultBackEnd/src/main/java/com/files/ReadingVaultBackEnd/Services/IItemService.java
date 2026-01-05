package com.files.ReadingVaultBackEnd.Services;

import java.util.List;

import com.files.ReadingVaultBackEnd.DTOs.ItemDTO;
public interface IItemService {
    List<ItemDTO> showItems();
    ItemDTO addItem(ItemDTO itemDTO);
    ItemDTO updateItem(Long id,ItemDTO itemDto);
    void deleteItem(Long id);
}
