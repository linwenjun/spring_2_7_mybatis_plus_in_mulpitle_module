ALTER TABLE `order`
    MODIFY `price` Decimal(12, 4) NOT NULL,
    ADD `order_item` JSON NULL;


