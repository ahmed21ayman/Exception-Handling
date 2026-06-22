public class App {
    public static void main(String[] args) throws Exception {
        try{
            int a= 100/0;
            int b=10;
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("error : " + e.getMessage());
        }

        try{
            int a= 100/0;
            int b=10;
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("error Arithmetic: " + e.getMessage());
        }

        try{
            int[] numbers = {10,20,50,80};
            System.out.println(numbers[9]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error: " + e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("error Arithmetic: " + e.getMessage());
        }
        finally{
            System.out.println("alawys run");
        }

        
    }
}
