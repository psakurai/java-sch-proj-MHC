class Doctor {
private String doctorName;
private int contact;
private String department;

public Doctor(String doctorName, int contact, String department)
{
    this.doctorName=doctorName;
    this.contact=contact;
    this.department=department;
}


public void display() 
{
    System.out.println("***************DOCTOR's DETAILS***************");
    System.out.println("Name: " + doctorName);
    System.out.println("Contact: " + contact);
    System.out.println("Department: " + department);
}
}

