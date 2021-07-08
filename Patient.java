class Patient {
	private Doctor doctor;
        private String firstName;
        private String lastName;
        private String IC;
        private String address;
        private String contact;
	private String gender;
        private int age;
	private int visitCount;
       
        public Patient(String firstName, String lastName, String IC, String address, String contact, String gender, int age, Doctor doctor)
        {
                this.firstName = firstName;
                this.lastName = lastName;
                this.IC = IC;
                this.address = address;
                this.contact = contact;
                this.gender = gender;
		this.age = age;
		this.doctor = doctor;
                visitCount = 1;
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

        public String getContact()
        {
                return contact;
        }

        public int getVisitCount()
        {
                return visitCount;
        }

	 public void updateVisitCount()
        {
                visitCount++;
        }

	public Doctor getDoctor() {
		return doctor;
	}

        public void displayInfo()
        {
		System.out.println("\n--Patient Details--\n");
                System.out.println("Name: " + getName());
                System.out.println("Age: " + age);
                System.out.println("IC Number: " + IC);
                System.out.println("Address: " + address);
                System.out.println("Contact: " + contact);
                System.out.println("Gender: " + gender);
        }

