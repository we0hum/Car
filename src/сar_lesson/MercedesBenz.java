package сar_lesson;

public class MercedesBenz extends Car {
    private String color;
    private String nameModel;
    private static final String BRAND = "Mercedes-Benz";
    private static final String CEO = "Ола Каллениус";

    @Override
    String infoCEO() {
        return String.valueOf(super.infoCEO() + " " + getCEO());
    }

    @Override
    void infoMotor() {
        System.out.println("У этой модели стоит модель двигателя " + getMotor() + " и его мощность равна " + getMotorPower());
    }

    @Override
    void allInfo () {
        System.out.println(getCEO());
        System.out.println("Цвет модели " + getColor());
        System.out.println("Название модели " + getNameModel());
        infoMotor();
        super.allInfo();
    }

    public void setColor (String color) {
        this.color = color;
    }

    public String getColor () {
        return color;
    }

    public void setNameModel (String nameModel) {
        this.nameModel = nameModel;
    }

    public String getNameModel () {
        return nameModel;
    }

    public static void main(String[] args) {

    }

    public String getBRAND () {
        return "Марка авто " + BRAND + ".";
    }

    public String getCEO () {
        return "Генеральный директор компании " + BRAND + " является " + CEO + ".";
    }
}
