package vcorp.ecom.models;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class FileResponse implements Serializable {
    String fileName;
    String message;

    public FileResponse(String fileName, String message) {
        this.fileName = fileName;
        this.message = message;
     }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FileRespnse{" +
                "fileName='" + fileName + '\'' +
                ", message='" + message + '\'' +
                 '}';
    }
}
