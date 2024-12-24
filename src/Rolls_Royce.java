public class Rolls_Royce extends Car {
    private static final String BRAND = "Rolls-Royce";

    public String getBRAND () {
        return "Марка авто " + BRAND + ".";
    }

    private static final String CEO = "Крис Браунридж";

    public String getCEO () {
        return "Генеральный директор компании " + BRAND + " является " + CEO + ".";
    }

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

    private String color;
    private String nameModel;

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
}
