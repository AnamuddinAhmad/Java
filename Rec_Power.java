public class Rec_Power {
    public static void main(String[] args) {
        int num=2;
        int pow=10;
        System.out.println(power(num,pow));
        System.out.println(calculatePower(num,pow,1));
    }

     public static int power(int num,int pow){
        if (pow ==0) {
            return 1;
        }
        int nm1=power(num, pow-1);
        System.out.println(nm1);
        return num*nm1;
    }
    
    private static int calculatePower(int num, int pow,int calculate_Value) {
        if(pow==1){
            return calculate_Value=calculate_Value*num; 
        }
        
        
        return calculatePower(num, pow-1,calculate_Value=calculate_Value*num);

    }
}
