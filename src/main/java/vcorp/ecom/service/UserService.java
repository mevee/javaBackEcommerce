package vcorp.ecom.service;

import vcorp.ecom.models.User;

public interface UserService {
    User login(String email,String password);
    User getProfileWithToken(String token);
    User updateProfile(User user);
    void deleteProfile(User user);
    User disableProfile(User user);

}
