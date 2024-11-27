package Package1;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private Date dateCreated;

    protected GeometricObject(String color) {
        this.color = color;
        this.dateCreated = new Date();
    }

    

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected Date getDateCreated() {
        return dateCreated;
    }

    protected abstract double getArea();
    protected abstract double getPerimeter();

    @Override
    public String toString() {
        return "\nColor: " + color + "\nDate Created: " + dateCreated;
    }
}
