import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private int birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, int birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        setName(name);
        setSurname(surname);
        setBirthDate(birthDate);
        setAnotherCompanyOwner(anotherCompanyOwner);
        setPensioner(pensioner);
        setPublicServer(publicServer);
    }

    public String fullName(){
        return getName() + " " + getSurname();
    }

    public float calculateYearlySalary() {
        return salary * 12;
    }

    public int age() {
        return LocalDate.now().getYear() - birthDate;
    }

    public boolean isMei(){
        if(calculateYearlySalary() < 130000 &&
                age() >= 18 &&
                anotherCompanyOwner == false &&
                pensioner == false &&
                publicServer == false
        )
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
