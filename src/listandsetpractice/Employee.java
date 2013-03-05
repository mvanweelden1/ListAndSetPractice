package listandsetpractice;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class Employee implements LivingBeing{
    
    private String name;
    private String dateOfHire;
    private int clockNumber;

    public Employee(String name, String dateOfHire, int clockNumber) {
        this.name = name;
        this.dateOfHire = dateOfHire;
        this.clockNumber = clockNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public int getClockNumber() {
        return clockNumber;
    }

    public void setClockNumber(int clockNumber) {
        this.clockNumber = clockNumber;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.clockNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.clockNumber != other.clockNumber) {
            return false;
        }
        return true;
    }
    
    

}
