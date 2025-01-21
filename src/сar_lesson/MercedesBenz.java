package сar_lesson;

public class MercedesBenz extends Car {
    private String color;
    private String nameModel;
    private static final String BRAND = "Mercedes-Benz";
    private static final String CEO = "Ола Каллениус";

    public MercedesBenz(int doors, String gearBox, String color, String nameModel, Engine engine) {
        super(doors, gearBox, new Car.Engine(engine.getMotor(), engine.getMotorPower(), engine.getHorsePower()));
        this.color = color;
        this.nameModel = nameModel;
    }

    public MercedesBenz() {
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
