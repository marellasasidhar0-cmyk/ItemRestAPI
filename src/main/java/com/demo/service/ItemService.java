package com.demo.service;

import com.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        items.add(item);
        return item;
    }

    public Item getById(int id) {
        return items.stream()
            .filter(i -> i.getId() == id)
            .findFirst()
            .orElse(null);
    }

    public List<Item> getAll() {
        return items;
    }
}
