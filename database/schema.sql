CREATE DATABASE IF NOT EXISTS library_management;
USE library_management;
CREATE TABLE books (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    isbn VARCHAR(20) UNIQUE,
    title VARCHAR(200) NOT NULL,
    author VARCHAR(100) NOT NULL
);
INSERT INTO books (isbn, title, author) VALUES 
('978-0134685991', 'Effective Java', 'Joshua Bloch');
