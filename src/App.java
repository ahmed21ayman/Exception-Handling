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

        try{
            String[] names = {"ahmed", "ayman", "abdelfatah"};
            System.out.println(names[3]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic error: " + e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array error: " + e.getMessage());
        }finally{
            System.out.println("Always run");
        }

        try {
            int age = 17;
            if (age < 18){
                throw new Exception("under age");
            }else{
                System.out.println("can enter");
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
