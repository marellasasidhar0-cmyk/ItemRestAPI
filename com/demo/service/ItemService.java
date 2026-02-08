package com.demo.service;

import com.demo.model.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemService {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Item getById(int id) {
        for(Item i : items) {
            if(i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public List<Item> getAll() {
        return items;
    }
}

