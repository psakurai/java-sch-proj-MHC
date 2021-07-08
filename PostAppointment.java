class PostAppointment extends Appointment{

private double discount;

public PostAppointment(Patient patient, String date, String time) {
	super(patient,date, time);
	getDiscount();
	calculateCharge();
}

public void getDiscount() {
	discount = followUpCharge * (followUpDiscountPerVisit * patient.getVisitCount());
	
}

public void displayAppointment() {
		super.displayAppointment();
        System.out.printf("\nDiscount: RM %.2f\n", discount);
        System.out.printf("Price after discount: RM %.2f\n\n", totalCharge);
}

public void calculateCharge() {
	totalCharge = followUpCharge - discount;
}

}
