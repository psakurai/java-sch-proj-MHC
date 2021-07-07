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
	patient.displayInfo();
	(patient.getDoctor()).displayInfo();
        System.out.printf("Total price: RM%.2f\n", followUpCharge);
        System.out.printf("Discount: RM%.2f\n", discount);
        System.out.printf("Price after discount: RM%.2f", totalCharge);
}

public void calculateCharge() {
	totalCharge = followUpCharge - discount;
}

}
