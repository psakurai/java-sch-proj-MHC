class Appointment implements Deposit{
private Log log;
private Patient patient;
private Doctor doc;
private String date;
private float additionalFee;

public Appointment();
public Appointment(Log log, Doctor doc, String date, float additionalFee) {
}
public void addLog(Log log) {
}
public void register(Patient patient) {

}

public abstract void toString();
public abstract void calculateCharge();

public double getPayment()
{
    if (firstTimeUser)
    {
        return Deposit.firstCharge;
    }
    else
    {
        return Deposit.firstCharge+Deposit.followUpCharge;
    }
}
  
}
