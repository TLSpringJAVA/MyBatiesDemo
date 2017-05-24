package model;

/**
 * Created by anlu on 2017/5/2.
 */
public class Girl {
    private Integer id;
    private Integer age;

    private String cupSize;
    private Student student;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCup_size() {
        return cupSize;
    }

    public void setCup_size(String cup_size) {
        this.cupSize = cup_size;
    }


    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", age=" + age +
                ", cupSize='" + cupSize + '\'' +
                '}';
    }
}
