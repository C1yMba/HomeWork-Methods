import java.time.LocalDate;

public class Main {

    public static void checkingYear(int year){
        int yearStart = 1584;
        if ((year - yearStart) % 4 == 0 && year >= 1584 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkingCustomersPhoneYear(int clientOSCheck, int clientDeviceYearCheck){
        int currentYear = LocalDate.now().getYear();
        String iosType = clientOSCheck == 0 ? "IOS": "Android";
        String msg = clientDeviceYearCheck >= currentYear ? "":"Облегченную";
        System.out.println(String.format("Установите %s версию приложения для %s по ссылке", msg, iosType));
    }

    public static /*int*/ void deliveryDistance(int distance){
        int deliveryTime = 0;
        if (distance < 20 && distance > 0) {
            deliveryTime += 1;
        } else if (distance >= 20 && distance < 60) {
            deliveryTime += 2;
        } else if (distance >= 60 && distance < 100) {
            deliveryTime += 3;
        }
        System.out.println("Потребуется дней: " + deliveryTime);
       // return deliveryTime; если что не совсем понял задание когда пошла речь про возвращает поэтому закоментил все что должно быть в случае если надо чтоб метод возвращал значение
    }

    public static void main(String[] args) {

        //Task 1
        int year = 2026;
        checkingYear(year);

        //Task 2
        int clientOS = 0;
        int clientDeviceYear = 2022;
        checkingCustomersPhoneYear(clientOS,clientDeviceYear);

        // Task 3
        int deliveryDistance = 95;
        deliveryDistance(deliveryDistance);
        // System.out.println("Потребуется дней: " + deliveryDistance(deliveryDistance));
    }
}