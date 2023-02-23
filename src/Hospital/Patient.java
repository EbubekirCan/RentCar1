package Hospital;

public class Patient extends StaffPojo {
    public Patient(String gender, String title, String name, String lastName, String birthDay, String birthMonth,
                   String birthYear,
                   String nationalHealthNumber, String addressLine1, String getAddressLine2,
                   String postcode, String username, String password, String accountNumber) {
        super(gender, title, name, lastName, birthDay, birthMonth,
                birthYear, nationalHealthNumber, addressLine1, getAddressLine2, postcode, username,
                password, accountNumber);
    }



}
