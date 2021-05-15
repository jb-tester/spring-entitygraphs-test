
CREATE TABLE customers (
                           customer_id INT AUTO_INCREMENT PRIMARY KEY,
                           customer_name VARCHAR(100),
                           address VARCHAR(100),
                           vip BOOLEAN
                       
);

CREATE TABLE items (
                       item_id INT AUTO_INCREMENT PRIMARY KEY,
                       item_name VARCHAR(100),
                       category VARCHAR(100),
                       available INT,
                       price INT
);

CREATE TABLE orders (
                        order_id INT AUTO_INCREMENT PRIMARY KEY,
                        customer_id INT,
                        urgent      tinyint(1) default 0 null,
                        FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

CREATE TABLE order_items (
                              order_id INT,
                              item_id INT,
                              amount INT,
                              PRIMARY KEY(order_id, item_id),
                              FOREIGN KEY(order_id) REFERENCES orders(order_id) ON DELETE CASCADE,
                              FOREIGN KEY(item_id) REFERENCES items(item_id) ON DELETE CASCADE
);