public class Table {
    public static void main(String[] args){
       int i,j,ans;
        for (i=1; i<=10; i++){
            for(j=1; j<=12; j++){
                ans =i*j;
                System.out.println(i + "*"+j + "= "+ans);
            }
            System.out.println();
        }
    }
}
