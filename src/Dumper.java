public class Dumper {
    public static void main(String[] args) {
        int passed_one = 0;                                 //пройдено
        while (passed_one < 150) {
            passed_one++;
            System.out.println("km" + passed_one);
        }
        System.out.println();
        System.out.println("FUEL! осталось 50%");
        System.out.println();
        while (passed_one < 270) {
            passed_one++;
            System.out.println("km" + passed_one);
        }
        System.out.println();
        System.out.println("FUEL! warring!!!");
        System.out.println("refuel!");
        System.out.println();
        while (passed_one < 302) {
            passed_one++;
            System.out.println("km" + passed_one);
        }
        System.out.println();
        System.out.println("FUEL is OVER!!!");
        System.out.println("need refueling!!!");
    }
}

