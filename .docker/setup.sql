-- create the databases
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';
CREATE DATABASE IF NOT EXISTS smartdb;

-- create the users for each database
CREATE USER 'appuser'@'%' IDENTIFIED BY 'passwd';
GRANT CREATE, ALTER, INDEX, LOCK TABLES, REFERENCES, UPDATE, DELETE, DROP, SELECT, INSERT ON `smartdb`.* TO 'appuser'@'%';

FLUSH PRIVILEGES;