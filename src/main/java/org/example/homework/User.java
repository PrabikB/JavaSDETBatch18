package org.example.homework;

public class User {
    /*Write program: User that has a constructor that initializes instance variable name and mobile number.
    Create a subclass/child class  userInfo that will have user address variable and it also being initialized
    through constructor call. Print users name, mobile number and address in userDetails method. Test your code.
*/
    private String name;
    private String mobileNo;

    public User(String name, String mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }
    public void userDetails() {
        System.out.println("Name: " + name + " Mobile No: " + mobileNo);
    }
}
class UserInfo extends User{
    private String address;
    public UserInfo(String name,String mobileNo,String address){
        super(name,mobileNo);
        this.address = address;
    }
    public void userDetails(){
        super.userDetails();
        System.out.println("Address: "+address);
    }
}


