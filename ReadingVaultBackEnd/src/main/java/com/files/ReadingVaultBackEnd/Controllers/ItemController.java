package com.files.ReadingVaultBackEnd.Controllers;

import com.files.ReadingVaultBackEnd.DTOs.ItemDTO;
import com.files.ReadingVaultBackEnd.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("/ReadingVault/Items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<ItemDTO>> showItems(){
return ResponseEntity.ok(itemService.showItems());
    }

    @PostMapping
    public ResponseEntity<ItemDTO> addItem(@RequestBody ItemDTO item){
        ItemDTO object = itemService.addItem(item);

        return ResponseEntity.created(URI.create("/ReadingVault/Item" + object.getId())).body(object);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemDTO>updateItem(@PathVariable Long id,@RequestBody ItemDTO item){
        return ResponseEntity.ok(itemService.updateItem(id,item));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id){
       itemService.deleteItem(id);
       return ResponseEntity.noContent().build();
    }
}
