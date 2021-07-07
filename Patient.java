class Patient {
private String firstName;
private String lastName;
private String address;
private int contact;
private int age;
private String gender;
private boolean firstTimeUser;

public Patient(String firstName, String lastName, String address, int contact, int age, String gender, boolean firstTimeUser)
{
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.gender = gender;
        this.gender = firstTimeUser;
}

public String getName()
{
        return firstName + " " + lastName;
}

public String getAddress()
{
        return address;
}

public int getContact()
{
        return contact;
}
        
private List <Doctor> doctor;
public List <Doctor> getDoctor()
{
        return doctor;
} 

public Patient(String firstName, List <Doctor> doctor)
{
        this.firstName=firstName;
        this.doctor=doctor;
}
        
}
