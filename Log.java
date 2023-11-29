public class Log  
{
    private static boolean debug = false;

    public Log()
    {
    }

    public static void info(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static void info(boolean text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static void info(int text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static void info(Object text) {
        if (debug) {
            System.out.println(text);
        }
    }
}
