package array;
public class Searching {
    public static void main(String[] args) {
        int[] rollnum={10,20,30,40,50,60};
        int searchnum=40;
        int position=-1;
        for (int i=0;i<rollnum.length;i++){
            if(rollnum[i]==searchnum){
                position=i+1;
                break;
            }
        }
        if (position!=-1){
            System.out.println("Roll Number Found");
            System.out.println("Position: " + position);
        }else{
            System.out.println("Roll Number Not Found");
        }
    }
}