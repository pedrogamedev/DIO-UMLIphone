package phone.telephone;

import java.util.ArrayList;

public class Contact {
    int id;
    String name;
    int phoneNumber;
    ArrayList<Call> callHistory;

    public Contact(int id, String name, int phoneNumber)
    {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Call> getCallHistory() {
        return callHistory;
    }
}
