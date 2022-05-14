TRUNCATE `order`;

INSERT INTO `order` (`id`, `name`, `price`, `order_item`)
VALUES
	(1, '苹果手机', 9999.9900, '[{"sku": "13Max", "price": "70000.00", "amount": 4}]'),
	(2, '小米手机', 8888.9900, '[{"sku": "9S", "price": "60000.00", "amount": 4}]');
