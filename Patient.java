class Patient {
private String firstName;
private String lastName;
private String IC;
private String address;
private int contact;
private int age;
private String gender;
private boolean firstTimeUser;

public Patient(String firstName, String lastName, String address, int contact, int age, String gender, boolean firstTimeUser)
{
        this.firstName = firstName;
        this.lastName = lastName;
        this.IC = IC;
        this.address = address;
        this.contact = contact;
        this.gender = gender;
        this.firstTimeUser = firstTimeUser;
}

public String getName()
{
        return firstName + " " + lastName;
}

public int getAge()
{
        return age;
}

public String getIC()
{
        return IC;
}

public String getAddress()
{
        return address;
}

public int getContact()
{
        return contact;
}

public boolean isFirst()
{
        return firstTimeUser;
}

public void displayInfo()
{
        System.out.println("Patient's name: " + getName());
        System.out.println("Patient's age: " + age);
        System.out.println("Patient's IC: " + IC);
        System.out.println("Patient's address: " + address);
        System.out.println("Patient's contact: " + contact);
        System.out.println("Patient's gender: " + gender);
}

}
