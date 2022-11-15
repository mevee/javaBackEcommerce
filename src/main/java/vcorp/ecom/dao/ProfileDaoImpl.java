package vcorp.ecom.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import vcorp.ecom.enums.TABLES;
@Service
public class ProfileDaoImpl implements FileDao{
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public void saveProfile(String userId, String fileName) {
        String sql = "INSERT INTO "+ TABLES.PROFILE_IMAGES +"(fileName, uploadBy) VALUES ( ?, ?)";
        int result = jdbcTemplate.update(sql, fileName, userId);
        if (result > 0) {
            System.out.println("A new row has been inserted.");
        }
    }

    @Override
    public void deleteProfile(String userId, String fileName) {

    }

    @Override
    public void updateProfile(String userId, String fileName) {

    }
}
