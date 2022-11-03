public class Student {
    private String name;
    private long phoneNumber;

    private String address;

    private long bankAccount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void change(String name, int age){
        this.name = name;
        this.phoneNumber = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void showIfo(){
       System.out.printf("""
               Student:
               name - %s
               phone number - %d
               address - %s 
               bank account - %d
               --------------------
            
               """, name, phoneNumber, address, bankAccount);
    }
}
