TRUNCATE `user`;
TRUNCATE `order`;

INSERT INTO `user` (`id`, `first_name`, `last_name`, `birth_date`)
VALUES
	(NULL, 'john', 'smith', '2000-01-01 00:00:00'),
	(NULL, 'martin', 'fowler', '2000-01-01 00:00:00');

INSERT INTO `order` (`id`, `name`, `price`, `order_item`, `user_id`)
VALUES
	(NULL, '苹果手机', 9999.9900, '[{"sku": "13Max", "price": "70000.00", "amount": 4}]', 1),
	(NULL, 'OPPO手机', 9999.9900, '[{"sku": "13Max", "price": "70000.00", "amount": 4}]', 1),
	(NULL, 'VIVO手机', 9999.9900, '[{"sku": "13Max", "price": "70000.00", "amount": 4}]', 2),
	(NULL, '小米手机', 8888.9900, '[{"sku": "9S", "price": "60000.00", "amount": 4}]', 2);