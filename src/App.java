public class App {
    public static void main(String[] args) throws Exception {
        try{
            int a= 100/0;
            int b=10;
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("error : " + e.getMessage());
        }
    }
}
