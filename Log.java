class Log {
private String data;
private ArrayList <Appointment>appointments;

public Log()
{
        appointments = new ArrayList<>();
}

public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
}

public void display() {
        System.out.println("\nNo\tPatient Name\tAppointment #\tDate\tDoctor");
        for(int i = 0; i < appointments.size(); i++)
        {
                System.out.println((i + 1) + "\t" + appointments.get(i).toString());
        }
}
}
