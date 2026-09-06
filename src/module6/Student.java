package module6;

public class Student {

    // every student will have a roll number, name, and address.
    private int rollno;
    private String name;
    private String address;

    // Constructor initializes a new student object.
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Getter methods provide controlled access to private fields.
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // toString() controls how the Student object prints in the console.
    // This makes output readable and helps verify sorting results.
    @Override
    public String toString() {
        return rollno + " --- " + name + " --- " + address;
    }

    // Added Improvement: Added equals() to distinguish object identity from sorting criteria.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;

        Student other = (Student) obj;

        return this.rollno == other.rollno &&
               this.name.equals(other.name) &&
               this.address.equals(other.address);
    }

    // Added Improvement: Added hashCode() to stay consistent with equals().
    @Override
    public int hashCode() {
        int result = Integer.hashCode(rollno);
        result = 31 * result + name.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}
