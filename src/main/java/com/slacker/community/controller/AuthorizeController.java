package com.slacker.community.controller;

import com.slacker.community.dto.AccessTokenDTO;
import com.slacker.community.dto.GithubUser;
import com.slacker.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("callback")
    public String callback(@RequestParam(name = "code")String code,
                           @RequestParam(name = "state")String state){
        AccessTokenDTO accessTokenDTO=new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setState(state);
        accessTokenDTO.setRedirect_url("http://localhost:8080/callback");
        accessTokenDTO.setClient_id("eeff7772b1c34b5c7b54");
        accessTokenDTO.setClient_secret("da0e01598a155b3f5da8d02e004b8a1deffed7a5");
        String token=githubProvider.getAccessToken(accessTokenDTO);
        System.out.println(token);
        GithubUser user=githubProvider.getUser(token);
        System.out.println(user.getName());
        System.out.println(user.getId());
        return "index";
    }

}
