package phone.telephone;

public class Call {

    int id;
    double lenght;
    Contact contact;

    public Call(int id, double lenght, Contact contact) {}

    public int getId() {
        return id;
    }

    public double getLenght() {
        return lenght;
    }

    public Contact getContact() {
        return contact;
    }

    public String displayCallInfo()
    {
        return "";
    }

}
