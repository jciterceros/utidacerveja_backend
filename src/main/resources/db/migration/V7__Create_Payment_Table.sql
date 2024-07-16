CREATE TABLE payment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    orders_id BIGINT,
    amount DECIMAL(10, 2) NOT NULL,
    payment_method VARCHAR(255) NOT NULL,
    installment INT,
    FOREIGN KEY (orders_id) REFERENCES orders(id)
);