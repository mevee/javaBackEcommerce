package vcorp.ecom.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        //File name
        String name = file.getOriginalFilename();

        //Full path
        String filePath = path + File.pathSeparator + name;
        //create a folder if not exist
        File f = new File(path);
        if (!f.exists()){
            f.mkdirs();
        }
        Files.copy(file.getInputStream(), Paths.get(filePath));
        return name;
    }
}
