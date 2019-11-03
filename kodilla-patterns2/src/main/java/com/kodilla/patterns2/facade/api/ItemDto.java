package com.kodilla.patterns2.facade.api;

public class ItemDto {
    private final Long prductId;
    private final double quantity;

    public ItemDto(Long prductId, double quantity) {
        this.prductId = prductId;
        this.quantity = quantity;
    }

    public Long getPrductId() {
        return prductId;
    }

    public double getQuantity() {
        return quantity;
    }
}
