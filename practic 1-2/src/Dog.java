public class Dog {
    private String name;
    private String race;
    private  int age;

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int change(){
        return age*7;
    }
    public String toString(){
        String s = "Name: " + name + "\n" + "Race: " + race + "\n" + "Age: " + age + "\n";
        return s;
    }
}
