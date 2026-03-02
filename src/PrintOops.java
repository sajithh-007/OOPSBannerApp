public class PrintOops{
    public static String[] getO1Pattern(){
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }
    public static String[] getO2Pattern(){
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }
    public static String[] getPPattern(){
        return new String[]{
            "*****",
            "*   *",
            "*****",
            "*    ",
            "*    "
        };
    }
    public static String[] getSPattern(){
        return new String[]{
            "******",
            "*     ",
            "******",
            "     *",
            "******"
        };
    }
    public static void main(String[] args){
        
        String[] O1Pattern = getO1Pattern();
        String[] O2Pattern = getO2Pattern();
        String[] PPattern = getPPattern();
        String[] SPattern = getSPattern();

        for (int i=0;i<O1Pattern.length;i++){
            System.out.println(O1Pattern[i]+" "+O2Pattern[i]+" "+PPattern[i]+" "+SPattern[i]);
        }
    }
}