
public class Main {
    int x = 15;
    void sum(){
        x=x+15;
        System.out.println(x);
    }
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        myObj.sum();
    }
}