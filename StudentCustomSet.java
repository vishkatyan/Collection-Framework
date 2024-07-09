import java.util.Objects;

public class StudentCustomSet {
    int rollNo;
    String name;
    public StudentCustomSet(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;

    }

    @Override
    public String toString() {
        return "StudentCustomSet{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCustomSet that = (StudentCustomSet) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}

