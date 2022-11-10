package vcorp.ecom.service;

import org.springframework.stereotype.Service;
import vcorp.ecom.models.User;
@Service
public class UserServiceImpl implements UserService{

    @Override
    public User login(String email, String password) {
        return null;
    }

    @Override
    public User getProfileWithToken(String token) {
        return new User(1000000,"Vikesh","Kumar","vikesh@gmail.com","1234567890","NA","A1");
    }

    @Override
    public User updateProfile(User user) {
        return null;
    }

    @Override
    public void deleteProfile(User user) {

    }

    @Override
    public User disableProfile(User user) {
        return null;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{}";
    }
}
