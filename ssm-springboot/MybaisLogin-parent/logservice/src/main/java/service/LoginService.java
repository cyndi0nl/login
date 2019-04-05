package service;

import Dao.User;
import Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
@Autowired
private UserDao logDao;

    public User log(User user) {
        return logDao.login(user);
    }
}
