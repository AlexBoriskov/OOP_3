package task0203;

public class Figura {
    
    private Integer height;
    private Integer  widht;
    private double area;
    private double perimetr;
    private Integer varior;

    public Figura(Integer  height, Integer  widht, Integer varior){
        this.height = height;
        this.widht = widht;
        this.varior = varior;
        if ((varior == 0) && (height == widht)){
            this.area = 3.14*height*height/4;
            this.perimetr = 3.14*height;
        }
        else {
            this.varior = 1;
            this.area = height*widht;
            this.perimetr = 2*(height+widht);
        }
    }

    public Integer  getHeight() {
        return height;
    }

    public void setHeight(Integer  height) {
        this.height = height;
    }

    public Integer getWidht() {
        return widht;
    }

    public void setWidht(Integer  widht) {
        this.widht = widht;
    }

    public Integer getVarior() {
        return varior;
    }

    public void setVarior(Integer varior) {
        this.varior = varior;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetr() {
        return perimetr;
    }

    
}
