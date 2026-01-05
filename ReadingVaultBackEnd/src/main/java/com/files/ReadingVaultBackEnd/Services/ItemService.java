package com.files.ReadingVaultBackEnd.Services;

import com.files.ReadingVaultBackEnd.DTOs.ItemDTO;
import java.util.List;
public class ItemService implements IItemService{

    @Override
    public List<ItemDTO> showItems(){
        return List.of();
    }

    @Override
    public ItemDTO addItem(ItemDTO itemDTO){
        return null;
    }

    @Override
    public ItemDTO updateItem(Long id,ItemDTO itemDTO){
        return null;
    }

    @Override
    public void deleteItem(Long id){
        
    }
    
}
