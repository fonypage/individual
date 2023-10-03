import java.util.Scanner;

public class ExtendAvto
{
    public static void main(String[] args)
    {
        Scanner sc_str = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        System.out.println("Введите данные машины на которой хотите поехать: ");
        System.out.println("Марка машины: ");
        String marka = sc_str.nextLine();
        System.out.println("Мощность машины: ");
        int power = sc_int.nextInt();
        System.out.println("Объём двигателя: ");
        double vol = sc_int.nextDouble();
        Avto a = new Avto(marka,power,vol);
        System.out.println("Данные вашей машины: ");
        System.out.println(a.toString());
        System.out.println("Введите жалательную стоимость за километр: ");
        int price = sc_int.nextInt();
        Taxi t = new Taxi(marka,power,vol,price);
        System.out.println("Введите дальность поезки в километрах: ");
        double km = sc_int.nextInt();
        System.out.println("Стоимость вашей поездки: "+t.tariff(km));
        System.out.println("Данные о тарифе в такси: ");
        System.out.println(t.toString());
    }
}