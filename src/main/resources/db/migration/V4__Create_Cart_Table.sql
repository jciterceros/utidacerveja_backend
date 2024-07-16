CREATE TABLE cart (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);