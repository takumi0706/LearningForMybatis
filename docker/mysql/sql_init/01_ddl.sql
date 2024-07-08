-- データベースの作成
CREATE DATABASE IF NOT EXISTS spring_dev CHARACTER SET utf8 COLLATE utf8_general_ci;
-- データベースの使用
USE spring_dev;

-- テーブルの作成
CREATE TABLE IF NOT EXISTS spring_dev.user_info
(
    login_id VARCHAR(50) NOT NULL PRIMARY KEY,
    password_hash VARCHAR(255) NOT NULL
);