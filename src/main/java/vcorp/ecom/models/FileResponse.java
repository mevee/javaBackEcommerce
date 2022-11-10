package vcorp.ecom.models;

import org.springframework.http.HttpStatus;

public class FileResponse {
    String fileName;
    String message;
    HttpStatus errorCode;

    public FileResponse(String fileName, String message, HttpStatus errorCode) {
        this.fileName = fileName;
        this.message = message;
        this.errorCode = errorCode;
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

    public HttpStatus getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(HttpStatus errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "FileRespnse{" +
                "fileName='" + fileName + '\'' +
                ", message='" + message + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
