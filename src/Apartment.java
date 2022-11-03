public class Apartment {

    private String title;
    private int price;
    private String address;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double payPerMonth(int maxGuest){
        double pay = (double) price / maxGuest;
        System.out.println("Бул квартирада "+maxGuest+" студент бар," +
                " ар бири "+pay +" сомдон кварплата берет!");

        return pay;
    }


    public void liveIn(Student student , double pay){
        int month  = (int) ((int) student.getBankAccount() / pay);
        System.out.printf("""
                %s банк эсеби %d акча .
                %s квартирасында %d ай жашай алат!
                """, student.getName(), student.getBankAccount(), title, month);
    }

    public void showInfo(){
        System.out.printf("""
                Apartment:
                title - %s
                price - %d
                address - %s
                ----------------
                
                """, title, price, address);
    }


}
