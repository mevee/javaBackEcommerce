package vcorp.ecom.service;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{
    @Override
    public boolean isValid(String userId) {
        return false;
    }

    @Override
    public String getToken(String userId) {
        return null;
    }

    @Override
    public boolean checkTokenValidation(String token) {
        return false;
    }

    @Override
    public void invalidateToken(String token) {

    }
}
