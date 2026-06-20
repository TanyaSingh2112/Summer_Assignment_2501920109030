import java.util.Random;
public class TestCompartment {
    public static void main(String [] args){
         Compartment [] c = new Compartment[10];
    Random r = new Random();
    for(int i=0; i<10; i++){
        int num = r.nextInt(4)+1;
        if(num == 1){
            c[i] = new FirstClass();

        }
        else if(num ==2){
            c[i] = new Ladies();
        }
        else if(num ==3){
            c[i] = new General();
        }
        else if(num ==4){
            c[i] = new Luggage();
        }

    }
    for(int i=0; i<10; i++){
        System.out.println(c[i].notice());
    }
    }
}
