import java.util.Arrays;
import java.util.Random;

public class Arrayss{
    public static void main(String[] args){
int[] arrays = {1,2,3,4,5,6,7};
Random r=new Random();
for(int i=0; i<arrays.length; i++){
    int rindex= r.nextInt(arrays.length);
    int temp=arrays[rindex];
    arrays[rindex]=arrays[i];
    arrays[i]=temp;
}
System.out.println(Arrays.toString(arrays));
    }
}