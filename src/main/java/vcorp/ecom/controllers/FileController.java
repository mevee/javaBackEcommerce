package vcorp.ecom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import vcorp.ecom.models.FileResponse;
import vcorp.ecom.services.FileService;

import java.io.IOException;

//import org.springframework.web.bind.annotation.GetMapping;


//
//import javax.websocket.server.PathParam;
//
@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    FileService fileService;
    @Value("${project.image}")
    private String path;


    @PostMapping("/upload")
    ResponseEntity<FileResponse> uploadImage(@RequestParam("image") MultipartFile file) {
        System.out.println("FileController-> uploadImage() image : " + file);
        String fileName = null;
        try {
            fileName = this.fileService.uploadImage(path, file);
        } catch (IOException exception) {
            return new ResponseEntity<>(new FileResponse(null, "Error white uploading " + exception.getMessage()), HttpStatus.OK);
        }

        return new ResponseEntity<>(new FileResponse(path+fileName, "Uploaded file successfully"), HttpStatus.OK);
    }


}
