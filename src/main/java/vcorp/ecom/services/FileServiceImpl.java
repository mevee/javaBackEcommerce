package vcorp.ecom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import vcorp.ecom.dao.ProfileDaoImpl;
import vcorp.ecom.enums.TABLES;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    ProfileDaoImpl profileDao;

    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        //File name
        String name = file.getOriginalFilename();

        //Full path
        String newName = UUID.randomUUID().toString().concat(name.substring(name.indexOf(".")));
        String filePath = path + File.pathSeparator + newName;

        //create a folder if not exist
        File f = new File(path);
        if (!f.exists()) {
            f.mkdirs();
        }
        Files.copy(file.getInputStream(), Paths.get(filePath));
        profileDao.saveProfile("TEST_USER_10",newName);
        return name;
    }
}
