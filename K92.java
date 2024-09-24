class Car{
    private String Make;
    private String Model;
    private  int Year;
    private String colour;
    Car(String mk, String md, int yr, String clr){  //constructor
        this.Make=mk;
        this.Model=md;
        this.Year=yr;
        this.colour=clr;
    }
    public void getCarDetails(){
        System.out.println(colour+" "+ Make +"-"+Model+" "+Year);
    }
}
public class K92{
    public static void main(String[] args){
        Car principalCar = new Car("Hyundai","i20",2022,"White");
        Car vprincipalCar = new Car("Maruti","Swift",2020, "Grey");
        System.out.println("The two cars parked in front of  are");
        principalCar.getCarDetails();
        vprincipalCar.getCarDetails();
    }
}