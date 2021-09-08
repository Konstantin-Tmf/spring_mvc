package timofeev.mvc.model;

public class Car {

    private String model;
    private String series;
    private String color;

    public Car() {
    }

    public Car(String model, String series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return model;
    }


    public String getSeries() {
        return series;
    }


    public String getColor() {
        return color;
    }


}
