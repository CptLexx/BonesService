public class Main {

    public static void main(String[] args) {
        int price = 13_345;

        BonusService service = new BonusService();
        int miles = service.calculate(price);

        System.out.println(miles);
    }

}
