public class numeros_dowhile {
    public static void main(String[] args) {
    
int i = 1;        

do{
    if(i % 5==0){
    i++;
    continue;

       } else {
          System.out.println(+i);
        i++;  
    }


} while(i<300);



    }
}
