-- データベースの作成
CREATE DATABASE IF NOT EXISTS sampledb CHARACTER SET utf8 COLLATE utf8_general_ci;
-- データベースの使用
USE sampledb;

-- テーブルの作成
CREATE TABLE sampledb.user (
                            `id`                    BIGINT NOT NULL AUTO_INCREMENT,
                            `name`    VARCHAR(100)  NOT NULL,
                            `address` VARCHAR(255)  NULL,
                            `phone`   VARCHAR(50)   NULL,
                            `update_date`           DATETIME NOT NULL,
                            `create_date`           DATETIME NOT NULL,
                            `delete_date`            DATETIME NULL,
                            PRIMARY KEY (`id`)
                           );