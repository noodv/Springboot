package com.example.demo.controller;

import com.example.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController
{

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getData")
    public String getData()
    {
         String str = restTemplate.getForObject("http://localhost:8762/getOffer", String.class);
         return str;
    }

    @RequestMapping("/getRegData")
    public String getRegData(User user)
    {
        // 通过你需要调用的服务的别名去进行调用
        String str = restTemplate.getForObject("http://service-2/getOffer", String.class);
        return str;
    }

    @RequestMapping("/postRegData")
    public String postRegData()
    {
        // 通过你需要调用的服务的别名去进行调用
        String str = restTemplate.postForObject("http://service-2/getOffer",new Object(), String.class);
        return str;
    }

    @RequestMapping("/putRegData")
    public void putRegData()
    {
        User user = new User();
        user.setName("aaaaaaaa");
        user.setAge("11");
        // 通过你需要调用的服务的别名去进行调用
        restTemplate.put("http://service-2/putUser", new User());
    }

    @RequestMapping("/putExchangeRegData")
    public void putExchangeRegData()
    {
        String reqJsonStr = "{\"name\":\"aaaaaa\", \"age\":\"11\",\"content\":\"testContent\", \"order\":1}";
        HttpHeaders headers = new HttpHeaders(); headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(reqJsonStr,headers);
        // 通过你需要调用的服务的别名去进行调用
        restTemplate.exchange("http://service-2/putUser", HttpMethod.PUT, entity, String.class);
    }

    @RequestMapping("/deleteRegData")
    public void deleteRegData()
    {
        User user = new User();
        user.setName("bbbbbbbb");
        user.setAge("22");
        // 通过你需要调用的服务的别名去进行调用
        restTemplate.delete("http://service-2/deleteUser", new User());
    }

}
