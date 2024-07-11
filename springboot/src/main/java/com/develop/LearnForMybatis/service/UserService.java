package com.develop.LearnForMybatis.service;

import com.develop.LearnForMybatis.dto.UserSearchRequest;
import com.develop.LearnForMybatis.entity.User;
import com.develop.LearnForMybatis.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* ユーザ情報　Service
*/
@Service
public class UserService {
    /*
    * ユーザ情報　Mapper
    * */
    @Autowired
    private UserMapper userMapper;

    /*
    * ユーザ情報検索
    *  @param userSearchRequest リクエストデータ
    * @return 検索結果
    * */
    public User search(UserSearchRequest userSearchRequest){
        return userMapper.search(userSearchRequest);
    }
}
