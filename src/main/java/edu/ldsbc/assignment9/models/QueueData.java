package edu.ldsbc.assignment9.models;

import java.util.List;

public class QueueData {

    private String itemForQueue;
    private List<String> itemsFromQueue;

    public String getItemForQueue() {
        return itemForQueue;
    }

    public void setItemForQueue(String itemForQueue) {
        this.itemForQueue = itemForQueue;
    }

    public List<String> getItemsFromQueue() {
        return itemsFromQueue;
    }

    public void setItemsFromQueue(List<String> itemsFromQueue) {
        this.itemsFromQueue = itemsFromQueue;
    }
}