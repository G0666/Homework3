package ALL;
public class Sample3_24 {
    public static void main(String[] args){
        Car24 car1[] = new Car24[3];
        for(int i = 0; i < car1.length; i++){
            car1[i] = new Car24();
        }
        car1[0].setCar(1989, 12.13);
        car1[1].setCar(1988, 03.14);
        car1[2].setCar(1994, 03.01);

        for(int i = 0; i < car1.length; i++){
            car1[i].show();
        }
    }
}
class Car24{
    int num;
    double gas;

    public Car24(){
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }
    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}