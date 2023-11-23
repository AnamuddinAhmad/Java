public class Rec_Power {
    public static void main(String[] args) {
        int num=2;
        int pow=10;
        System.out.println(calculatePower(num,pow,1));
    }

    private static int calculatePower(int num, int pow,int calculate_Value) {
        if(pow==1){
            return calculate_Value=calculate_Value*num; 
        }
        
        
        return calculatePower(num, pow-1,calculate_Value=calculate_Value*num);

    }
}
