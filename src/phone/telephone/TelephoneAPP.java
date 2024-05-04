package phone.telephone;

import phone.Iphone;

import java.util.ArrayList;

public class TelephoneAPP extends Iphone {
    ArrayList<Contact> savedContacts;
    ArrayList<Call> callHistory;

    public void call(int phoneNumber) {}

    public void endCall(){}

    public void saveCall(int callId, double callLenght, Contact callContact){}

    public void deleteCall(Call call){}

    public void displayCallHistory() {}
    public void displayCallHistory(ArrayList<Call> callHistory) {}

    public void nextCall() {}
    public void nextCall(ArrayList<Call> callHistory){}

    public void previousCall(){}
    public void previousCall(ArrayList<Call> callHistory){}

    public void displayCallInfo(Call call) {}

    public void saveContact(int phoneNumber) {}

    public void deleteContact(Contact contact) {}

    public void updateContactInfo(Contact contact, Call call) {}

    public void displayContactInfo(Contact contact) {}

    public void displayContactHistory(Contact contact) {}

    public void displayContactList() {}

    public void nextContact() {}

    public void previousContact() {}

}
