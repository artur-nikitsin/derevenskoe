INSERT INTO books (name, price, year_of_publication)
VALUES ('Book1', 12, 2000);
INSERT INTO books (name, price, year_of_publication)
VALUES ('Book2', 15, 1990);
INSERT INTO books (name, price, year_of_publication)
VALUES ('Book3', 22, 2005);
INSERT INTO books (name, price, year_of_publication)
VALUES ('Book4', 44, 1985);
INSERT INTO books (name, price, year_of_publication)
VALUES ('Book5', 62, 2019);

INSERT INTO genres (name)
VALUES ('Fary tailes');
INSERT INTO genres (name)
VALUES ('Historical');
INSERT INTO genres (name)
VALUES ('Fantastic');

INSERT INTO authors (first_name, second_name)
VALUES ('Aleksandr', 'Pushkin');
INSERT INTO authors (first_name, second_name)
VALUES ('Stiven', 'King');
INSERT INTO authors (first_name, second_name)
VALUES ('Vasil', 'Bykov');

INSERT INTO books_authors (book_id, author_id)
VALUES (1, 1);
INSERT INTO books_authors (book_id, author_id)
VALUES (3, 2);
INSERT INTO books_authors (book_id, author_id)
VALUES (3, 3);
INSERT INTO books_authors (book_id, author_id)
VALUES (4, 3);

INSERT INTO books_genres (book_id, genre_id)
VALUES (1, 1);
INSERT INTO books_genres (book_id, genre_id)
VALUES (2, 1);
INSERT INTO books_genres (book_id, genre_id)
VALUES (3, 2);

INSERT INTO order_statuses (name)
VALUES ('New');
INSERT INTO order_statuses (name)
VALUES ('Picking');
INSERT INTO order_statuses (name)
VALUES ('Complete');
INSERT INTO order_statuses (name)
VALUES ('Delivered');