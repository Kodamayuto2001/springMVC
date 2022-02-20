# v4-gradle-springframework -memo

### memo
- 2月20日 14時25分　build.gradleやConfigのプログラムファイル、ビルドした際のファイルが実験と検証を繰り返し行った結果、ぐちゃぐちゃになり、今までアクセスできていたuriにアクセスできなくなったので、feature-yk-webapp-devは git stashして、新しくfeature-yk-webapp-vanillaを作成した。

### wsl2:Ubuntu20.04 MySQL start
```
$ sudo service mysql start
[sudo] password for yuto: ****
```
### wsl2:Ubuntu20.04 MySQL login
```
$ sudo mysql -u root -p
Enter password: *********************
```

### MySQL Commands

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

```
mysql> desc contact;
```
