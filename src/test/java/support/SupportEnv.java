package support;

public class SupportEnv {

    public static String getEnv(){
        String env = System.getProperty("env");
        String URL = "";

        switch (env){
            case "dev":
                URL = "http://automationpratice.com.br/";
                break;
        }

        return URL;
    }
}
