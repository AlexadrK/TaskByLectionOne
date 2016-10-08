/**
 * Created by Aleksandr on 08.10.2016.
 */
public class Arrays {
   public static  void main(String[] args) {
        int[] mass = new int[21];
       int max=mass[0];
       int imax=0;
       int min=mass[0];
       int imin=0;
        for (int i=0; i<mass.length; i++){
            mass[i]=i-10;
            /*if (mass[i]>max){
                max=mass[i];
                imax=i;
            }
            if (mass[i]<min){
                min=max[i];
                imin=i;
            }
        }
        mass[imin]=max;
       mass[imax]=min;

        for (int i=0; i<mass.length; i++){*/
           System.out.print(mass[i]);
           // System.out.println("i=" +i+"mass["+i+"]="+mass[i]);
        }
    }
}
