package com.develop.LearnForMybatis.repository;

import com.develop.LearnForMybatis.dto.UserSearchRequest;
import com.develop.LearnForMybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

/*
* ユーザ情報Mapper
* */
@Mapper
public interface UserMapper {
    /*
    * ユーザ情報検索
    * @param user 検索用リクエストデータ
    * @return ユーザ情報
    * */
    User search(UserSearchRequest user);
}
