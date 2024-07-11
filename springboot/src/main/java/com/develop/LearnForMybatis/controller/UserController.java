package com.develop.LearnForMybatis.controller;

import com.develop.LearnForMybatis.dto.UserSearchRequest;
import com.develop.LearnForMybatis.entity.User;
import com.develop.LearnForMybatis.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
* ユーザー情報　Controller
*/
@Controller
public class UserController {

    /*
    * ユーザ情報 Service
    * */
    @Autowired
    UserService userService;

    /*
    * ユーザ情報検索画面を表示
    * @param model Model
    * @return ユーザ情報一覧画面
    * */
    @GetMapping(value = "/user/search")
    public String displaySearch(Model model) {
        // ユーザ情報一覧画面を表示
        model.addAttribute("userSearchRequest", new UserSearchRequest());
        return "user/search";
    }

    /*ユーザー情報検索
    * @param userSearchRequest リクエストデータ
    * @param model Model
    * @return ユーザ情報一覧画面
    * */
    @RequestMapping(value = "/user/id_search", method = RequestMethod.POST)
    public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
        User user = userService.search(userSearchRequest);
        model.addAttribute("userinfo", user);
        return "user/search";
    }
}
