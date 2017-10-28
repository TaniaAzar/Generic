
public class AppStatsHome {
    public static void main(String[] args) {
        Integer ar[] = {1,2,3,2,2};
        StatsHome<Integer> r = new StatsHome<>(ar);
        double rez = r.mean();
        System.out.println("Среднее значение = " + rez);
        System.out.println("Максимальное = " + r.max());
        System.out.println("Минимальное = " + r.min());
    }
}
