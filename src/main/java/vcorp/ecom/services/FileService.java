package vcorp.ecom.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    String uploadImage(String filerName, MultipartFile file) throws IOException;
}
