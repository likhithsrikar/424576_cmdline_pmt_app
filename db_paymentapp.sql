CREATE TABLE user_details (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    phone_number VARCHAR(15) NOT NULL,
    address VARCHAR(255) NOT NULL
);

-----------------
CREATE TABLE user_account_details (
    user_account_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    account_open_date DATE NOT NULL,
    current_wallet_balance DECIMAL(15, 2) NOT NULL,
    linked_bank_accounts_count INT DEFAULT 0,
    wallet_pin VARCHAR(4) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user_details(user_id)
);

-----------
CREATE TABLE bank_accounts (
    bank_account_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    account_number VARCHAR(20) NOT NULL,
    ifsc_code VARCHAR(11) NOT NULL,
    bank_name VARCHAR(100) NOT NULL,
    branch VARCHAR(100) NOT NULL,
    account_status VARCHAR(20) NOT NULL DEFAULT 'ACTIVE',
     -- Linked to AccountStatus enum
    FOREIGN KEY (user_id) REFERENCES user_details(user_id)
);
---------------------
CREATE TABLE source_types (
    source_type_id INT AUTO_INCREMENT PRIMARY KEY,
    source_type_name VARCHAR(50) NOT NULL UNIQUE
);

-- Insert default source types
INSERT INTO source_types (source_type_name) VALUES ('bank_account'), ('wallet_account'), ('third_party');

---------------

CREATE TABLE txn_details (
    txn_id INT AUTO_INCREMENT PRIMARY KEY,
    txn_date_time DATETIME NOT NULL,
    source_id INT NOT NULL,
    target_id INT NOT NULL,
    source_type_id INT NOT NULL,
    dest_type_id INT NOT NULL,
    txn_amount DECIMAL(15, 2) NOT NULL,
    user_id INT NOT NULL, -- Linked to user_details
    FOREIGN KEY (source_type_id) REFERENCES source_types(source_type_id),
    FOREIGN KEY (dest_type_id) REFERENCES source_types(source_type_id),
    FOREIGN KEY (user_id) REFERENCES user_details(user_id)
);
-- Inserting dummy data into tables

INSERT INTO user_details (user_name, password, first_name, last_name, phone_number, address)
VALUES ('john_doe', 'password123', 'John', 'Doe', '1234567890', '123 Main St');

INSERT INTO user_account_details (user_id, account_open_date, current_wallet_balance, linked_bank_accounts_count, wallet_pin)
VALUES (1, '2023-10-01', 1000.00, 1, '1234');

INSERT INTO bank_accounts (user_id, account_number, ifsc_code, bank_name, branch, account_status)
VALUES (1, '123456789', 'IFSC001', 'Bank of Java', 'Main Branch', 'ACTIVE');

INSERT INTO source_types (source_type_name)
VALUES ('bank_account'), ('wallet_account'), ('third_party');

INSERT INTO txn_details (txn_date_time, source_id, target_id, source_type_id, dest_type_id, txn_amount, user_id)
VALUES ('2023-10-01 12:00:00', 123, 456, 1, 2, 1000.00, 1);

--Retrieving data

SELECT * FROM bank_accounts WHERE user_id = 1;

SELECT * FROM txn_details WHERE user_id = 1;

SELECT * FROM user_details WHERE user_id = 1;

