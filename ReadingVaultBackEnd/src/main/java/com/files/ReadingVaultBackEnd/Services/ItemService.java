package com.files.ReadingVaultBackEnd.Services;

import com.files.ReadingVaultBackEnd.DTOs.ItemDTO;
import com.files.ReadingVaultBackEnd.Entities.Item;
import com.files.ReadingVaultBackEnd.Exceptions.NotFoundException;
import com.files.ReadingVaultBackEnd.Repositories.ItemRepository;
import com.files.ReadingVaultBackEnd.mappers.Mappers;
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
        Item item = Item.builder()
                .itemId(itemDTO.getId())
                .itemTitle(itemDTO.getTitle())
                .itemAuthor(itemDTO.getAuthor())
                .itemPublication(itemDTO.getPublicationDate())
                .itemprice(itemDTO.getPrice())
                .itemType(itemDTO.getType())
                .itemCreatedAt(itemDTO.getCreatedAt())
                .build();
return Mappers.toDTO(itemRepository.save(item));
    }

    @Override
    public ItemDTO updateItem(Long id,ItemDTO itemDTO){
        Item item = itemRepository.findById(id)
        .orElseThrow(() -> new NotFoundException("Item not found"));

                item.setItemId(itemDTO.getId());
                item.setItemTitle(itemDTO.getTitle());
                item.setItemAuthor(itemDTO.getAuthor());
                item.setItemPublication(itemDTO.getPublicationDate());
                item.setItemprice(itemDTO.getPrice());
                        item.setItemType(itemDTO.getType());
item.setItemCreatedAt(itemDTO.getCreatedAt());

        return Mappers.toDTO(itemRepository.save(item));
    }

    @Override
    public void deleteItem(Long id){
      if(!itemRepository.existsById(id)){
          throw new NotFoundException("Item not found");
      }

      itemRepository.deleteById(id);

    }
    
}
