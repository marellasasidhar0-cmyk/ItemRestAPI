package com.demo.controller;

import com.demo.model.Item;
import com.demo.service.ItemService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping
    public Item add(@Valid @RequestBody Item item) {
        return service.add(item);
    }

    @GetMapping("/{id}")
    public Item get(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Item> all() {
        return service.getAll();
    }
}
