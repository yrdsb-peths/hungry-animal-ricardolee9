public class Log  
{
    private static boolean debug = true;
    
    public Log()
    {
    }
    
    public static void info(String text) {
        if (debug) {
            System.out.println(text);
        }
    }
}
