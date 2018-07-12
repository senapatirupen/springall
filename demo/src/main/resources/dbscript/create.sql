create database demo; -- Create the new database
create user 'demouser'@'localhost' identified by 'demouser'; -- Creates the user
grant all on demo.* to 'demouser'@'localhost'; -- Gives all the privileges to the new user on the newly created database  