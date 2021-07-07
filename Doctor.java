class Doctor {
private String doctorName;
private String contact;
private String department;

public Doctor(String doctorName, String contact, String department) {
	this.doctorName = doctorName;
	this.contact = contact;
	this.department = department;
	}

public String getName() {
	return doctorName;
	}

public String getContact() {
		return contact;
	}

public String getDepartment() {
		return department;
	}
	
public void displayInfo() {
	System.out.println("\n--Doctor Details--\n");
	System.out.println("Name: " + doctorName);
	System.out.println("Contact Number: " + contact);
	System.out.println("Department: " + department);

	}
}

