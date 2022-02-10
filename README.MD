# springMVC

### データベース
```
mysql> create database contactdb;
```

```
mysql> connect contactdb;
```

```
mysql> create table `contact` (
    -> `contact_id` int(11) not null auto_increment,
    -> `name` varchar(45) not null,
    -> `email` varchar(45) not null,
    -> `address` varchar(100) not null,
    -> `phone` varchar(15) not null,
    -> primary key (`contact_id`)
    -> );
```

```
mysql> show tables;
```
