package vcorp.ecom.service;

public interface AuthService {
    boolean isValid(String userId);

    String getToken(String userId);

    boolean checkTokenValidation(String token);

    void invalidateToken(String token);
}
