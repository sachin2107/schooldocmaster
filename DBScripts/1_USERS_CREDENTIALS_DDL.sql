CREATE TABLE USERS
(
   EMAIL varchar(18) NOT NULL,
   USER_NAME_DESC varchar(30) NOT NULL,
   PASSWORD varchar(30) NOT NULL,
   HINT varchar(30),
   HINT_ANSWER varchar(30) 
   UPDATE_BY varchar(30),
   UPDATE_TIMESTAMP timestamp,
   CONSTRAINT PRIMARY KEY (EMAIL,PASSWORD,USER_NAME_DESC)
);

ALTER TABLE PROJ.USERS MODIFY EMAIL varchar(50);

INSERT INTO PROJ.USERS (EMAIL, USER_NAME_DESC, PASSWORD, HINT, HINT_ANSWER, UPDATE_BY, UPDATE_TIMESTAMP) VALUES
('2107sachin@gmail.com','sachin khachane','sachin','firstname','sachin','SACHIN',current_timestamp());
