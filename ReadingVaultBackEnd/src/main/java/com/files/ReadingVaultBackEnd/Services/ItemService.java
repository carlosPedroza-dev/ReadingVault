package com.files.ReadingVaultBackEnd.Services;

import com.files.ReadingVaultBackEnd.DTOs.ItemDTO;
import com.files.ReadingVaultBackEnd.Repositories.ItemRepository;
import com.files.ReadingVaultBackEnd.mappers.Mappers;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemService implements IItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<ItemDTO> showItems(){
        return itemRepository.findAll().stream().map(Mappers::toDTO).toList();
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
