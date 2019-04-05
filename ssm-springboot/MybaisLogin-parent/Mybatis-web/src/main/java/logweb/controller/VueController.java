package logweb.controller;


import Dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.LoginService;


@RestController
public class VueController {
@Autowired
LoginService loginService;

@RequestMapping(value = "/login",method = RequestMethod.POST)
    public User log(@RequestBody User user){
    System.out.println("进入了方法");
   User logedUser = loginService.log(user);
   if(logedUser!=null){
       System.out.println("登录成功");
       return logedUser;
   } else{
       System.out.println("登录失败");
       return null;
   }
}

}
