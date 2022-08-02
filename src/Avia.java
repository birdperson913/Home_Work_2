public class Avia {
    public static void main(String[] args) {
        int ticketPrice = 15800;
        int bonusPoint = 20;
        int mile = 0;
        if (ticketPrice > 0) {
            mile = ticketPrice / bonusPoint;
        } else {
            System.out.println("Сумма покупки не достааточнаа для начисления бонусных баллов");
        }
        System.out.println("Количество бонусных баллов соcтавляет: " + mile);
    }
}
