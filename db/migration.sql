DROP DATABASE IF EXISTS lighthouse_db;


CREATE DATABASE lighthouse_db;


USE lighthouse_db;

CREATE USER admin_user@localhost IDENTIFIED BY 'root';
GRANT ALL ON lighthouse_db.* TO admin_user@localhost;

