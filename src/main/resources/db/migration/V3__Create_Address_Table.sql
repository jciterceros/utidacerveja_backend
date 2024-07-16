CREATE TABLE address (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT,
    street VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    state VARCHAR(255) NOT NULL,
    postal_code VARCHAR(10) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);