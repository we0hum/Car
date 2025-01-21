package сar_lesson;

public class RollsRoyce extends Car {
    private String color;
    private String nameModel;
    private static final String BRAND = "Rolls-Royce";
    private static final String CEO = "Крис Браунридж";

    public RollsRoyce(int doors, String gearBox, String color, String nameModel, Engine engine) {
        super(doors, gearBox, new Car.Engine(engine.getMotor(), engine.getMotorPower(), engine.getHorsePower()));
        this.color = color;
        this.nameModel = nameModel;
    }

    public RollsRoyce() {
        super();
        this.color = "Значение отсутствует";
        this.nameModel = "Значение отсутствует";
    }

    @Override
    String infoCEO() {
        return String.valueOf(super.infoCEO() + " " + getCEO());
    }

    @Override
    void infoMotor() {
        super.infoMotor();
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

    public String getBRAND () {
        return "Марка авто " + BRAND + ".";
    }

    public String getCEO () {
        return "Генеральный директор компании " + BRAND + " является " + CEO + ".";
    }
}
