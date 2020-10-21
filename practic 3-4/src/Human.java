public class Human {
    private Hair hair;
    private Eye eye;
    private int hight;
    private int weight;

    public Hair getHair(){
        return hair;
    }
    public Eye getEye(){
        return eye;
    }

    Human()
    {
        hair = new Hair();
        eye = new Eye();
    }


    public int getHight() {
        return hight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return "Hair color: " + hair.getColor() + "\n" + "Hair legth: " + hair.getLength() + "\n" + "Eyes color: " + eye.getColor() + "\n" + "Hight: " + hight + "\n" + "Weight: " + weight + "\n";
    }
}
