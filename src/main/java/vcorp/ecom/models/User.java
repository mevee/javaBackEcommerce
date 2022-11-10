package vcorp.ecom.models;

public class User {
    int userId;
    String fName;
    String lName;
    String email;
    String mobile;
    String token;
    String userType;

    public User() {
    }

    public User(int userId, String fName, String lName, String email, String mobile, String token, String userType) {
        this.userId = userId;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.mobile = mobile;
        this.token = token;
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", token='" + token + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
