package vcorp.ecom.dao;

public interface FileDao {

void saveProfile(String userId,String fileName);
void deleteProfile(String userId,String fileName);
void updateProfile(String userId,String fileName);

}
