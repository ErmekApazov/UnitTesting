package contact;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.NoSuchElementException;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public void validateFirstName(){
        if(this.firstName.isBlank()){
            throw new RuntimeException("First name cannot be null or empty");
        }
    }

    public void validateLastName(){
        if(this.lastName.isBlank()){
            throw new RuntimeException("Last name cannot be null or empty");
        }
    }

    public void validatePhoneNUmber(){
        if(this.phoneNumber.isBlank()){
            throw new RuntimeException("Phone number cannot be null or empty");
        }

        if(this.phoneNumber.length() != 10){
            throw new RuntimeException("Phone number should be 10 digits long");
        }

        if(!this.phoneNumber.startsWith("0")){
            throw new RuntimeException("Phone number should start with zero");
        }

        if(!this.phoneNumber.matches("\\d+")){
            throw new RuntimeException("Phone number contain only digits");
        }
    }





}
