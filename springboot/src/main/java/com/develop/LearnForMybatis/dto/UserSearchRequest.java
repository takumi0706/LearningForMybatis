package com.develop.LearnForMybatis.dto;

import lombok.Data;

import java.io.Serializable;

/*
* ユーザ情報検索用リクエストデータ
* */
@Data
public class UserSearchRequest implements Serializable {
    /*
    * ユーザID
    * */
    private Long id;
}
