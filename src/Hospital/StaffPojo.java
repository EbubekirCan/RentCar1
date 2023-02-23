package Hospital;

public class StaffPojo {
    private String gender;
    private String title;
    private String professionalTitles;
    private String medicalCondition;
    private String department;
    private String name;
    private String lastName;
    private String BirthDay;
    private String BirthMonth;
    private String BirthYear;
    private String nationalHealthNumber;
    private String nationalWorkPermit;
    private String addressLine1;
    private String getAddressLine2;
    private String Postcode;
    private String username;
    private String password;
    private String accountNumber;
    private String age;

    public  StaffPojo(String gender, String title, String professionalTitles, String medicalCondition, String department,
                     String name, String lastName, String birthDay, String birthMonth, String birthYear,
                     String nationalHealthNumber, String nationalWorkPermit, String addressLine1,
                     String getAddressLine2, String postcode, String username, String password, String accountNumber,
                     String age) {
        this.gender = gender;
        this.title = title;
        this.professionalTitles = professionalTitles;
        this.medicalCondition = medicalCondition;
        this.department = department;
        this.name = name;
        this.lastName = lastName;
        BirthDay = birthDay;
        BirthMonth = birthMonth;
        BirthYear = birthYear;
        this.nationalHealthNumber = nationalHealthNumber;
        this.nationalWorkPermit = nationalWorkPermit;
        this.addressLine1 = addressLine1;
        this.getAddressLine2 = getAddressLine2;
        Postcode = postcode;
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    public StaffPojo(String gender, String title, String name, String lastName, String birthDay, String birthMonth,
                     String birthYear, String nationalHealthNumber, String addressLine1, String getAddressLine2,
                     String postcode, String username, String password, String accountNumber) {
        this.gender = gender;
        this.title = title;
        this.name = name;
        this.lastName = lastName;
        BirthDay = birthDay;
        BirthMonth = birthMonth;
        BirthYear = birthYear;
        this.nationalHealthNumber = nationalHealthNumber;
        this.addressLine1 = addressLine1;
        this.getAddressLine2 = getAddressLine2;
        Postcode = postcode;
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;


    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfessionalTitles() {
        return professionalTitles;
    }

    public void setProfessionalTitles(String professionalTitles) {
        this.professionalTitles = professionalTitles;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public String getBirthMonth() {
        return BirthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        BirthMonth = birthMonth;
    }

    public String getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(String birthYear) {
        BirthYear = birthYear;
    }

    public String getNationalHealthNumber() {
        return nationalHealthNumber;
    }

    public void setNationalHealthNumber(String nationalHealthNumber) {
        this.nationalHealthNumber = nationalHealthNumber;
    }

    public String getNationalWorkPermit() {
        return nationalWorkPermit;
    }

    public void setNationalWorkPermit(String nationalWorkPermit) {
        this.nationalWorkPermit = nationalWorkPermit;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getGetAddressLine2() {
        return getAddressLine2;
    }

    public void setGetAddressLine2(String getAddressLine2) {
        this.getAddressLine2 = getAddressLine2;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StaffPojo{" +
                "gender='" + gender + '\'' +
                ", title='" + title + '\'' +
                ", professionalTitles='" + professionalTitles + '\'' +
                ", medicalCondition='" + medicalCondition + '\'' +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", BirthDay='" + BirthDay + '\'' +
                ", BirthMonth='" + BirthMonth + '\'' +
                ", BirthYear='" + BirthYear + '\'' +
                ", nationalHealthNumber='" + nationalHealthNumber + '\'' +
                ", nationalWorkPermit='" + nationalWorkPermit + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", getAddressLine2='" + getAddressLine2 + '\'' +
                ", Postcode='" + Postcode + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
