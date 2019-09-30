import java.util.Scanner;

public class Display_types {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("1:In hình chữ nhật");
        System.out.println("2. In hình tam giác");
        System.out.println("3.In hình tam giác cân");
        System.out.println("0. Thoát");
        int choose = sc.nextInt();
        switch(choose){
            case 1:
                rectangle();
                break;
            case 2 :
                square_triangle();
                break;
            case 3 :
                isosceles_Triangle();
                break;
            case 0 :
                System.exit(0);

            default:
                System.out.println("No programs you choose");


        }
    }

    public static void isosceles_Triangle() {
        for (int i=0;i<5;i++){
            for(int j =0;j< 8;j++){
                System.out.printf("*"+"/n");
            }
        }
    }

    public static void square_triangle() {
    }

    public static void rectangle() {

    }
}
