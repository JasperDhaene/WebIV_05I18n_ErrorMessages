package domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class Registration {

    @NotEmpty
    @Size(min=3, max=60)
    private String firstName;
    
    @Pattern(regexp = "^[a-zA-Z]+", 
              message = "Username must be alphanumeric with no spaces")
    //@Pattern(regexp = "^[a-zA-Z]+", message="{validation.userName.Pattern.message}")
    private String userName;
    
    @NotEmpty
    @Size(min = 4, max = 20)
    //@Size(min=4, max=20, message="{validation.Size.message}")
    private String password;
    
    @NotEmpty
    private String confirmPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setConfirmPassword(String confirmPassword) {

        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

}