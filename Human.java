/**
 * Created by Роман on 15.10.2017.
 */
public class Human
{
    private String name;
    private Integer age;

    public void print_human ()
    {
        System.out.println(name + ": " + age);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Integer getAge()
    {
        return age;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }
}
