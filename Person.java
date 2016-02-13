public class Person {
    int personDay;
    int personMonth;
    String personName;
    String personSurname;
    public Person(){

    }
    public Person(int personDay, int personMonth, String personName, String personSurname) {
        this.personDay = personDay;
        this.personMonth = personMonth;
        this.personName = personName;
        this.personSurname = personSurname;
    }

    public int getPersonDay() {
        return personDay;
    }

    public void setPersonDay(int personDay) {
        this.personDay = personDay;
    }

    public int getPersonMonth() {
        return personMonth;
    }

    public void setPersonMonth(int personMonth) {
        this.personMonth = personMonth;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }





}
