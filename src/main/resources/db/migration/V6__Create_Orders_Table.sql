CREATE TABLE orders (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT,
    total DECIMAL(12, 2) NOT NULL,
    status VARCHAR(255) NOT NULL,
    delivery_status VARCHAR(255),
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);