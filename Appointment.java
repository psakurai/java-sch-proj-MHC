abstract class Appointment implements Deposit{
	protected Patient patient;
	protected String date;
	protected String time;
	protected double totalCharge;
	
	public Appointment(Patient patient, String date, String time) {
		this.patient = patient;
		this.date = date;
		this.time = time;
	}
	
	public Patient getPatient() {
		return patient; }
	
	public String getDate() {
		return date; }

	public String getTime()
	{
		return time;
	} 
	
	public void displayAppointment() {
		System.out.println("\n--Appointment details--");
		System.out.println("Patient's name   : " + patient.getName());
        System.out.println("Doctor in charge : " + patient.getDoctor().getName());
		System.out.println("Date             : " + date);
		System.out.println("Time             : " + time);
	}

	public abstract void calculateCharge();
	
}
