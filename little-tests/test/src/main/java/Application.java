public class Application {
    public static void main(String[] args){
        int num = 123456789;
        String[] list = Integer.toString(num).split("");
        String str = "";

        for (int i = list.length-1; i>=0; i--){
            str += list[i];
        }
        System.out.println(str);
    }
}
