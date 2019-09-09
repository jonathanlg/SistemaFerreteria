package Componentes;

import java.lang.reflect.Method;

public class AbrirExplorador {

    public static void openURL(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("MacOS")) {
                Class nav = Class.forName("com.apple.eio.FileManager");
                Method openURL = nav.getDeclaredMethod("openURL", new Class[]{String.class});
                openURL.invoke(null, new Object[]{url});
            } else if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler   " + url);
            } else {
                String[] browsers = {"firefox", "opera", "mozilla"};
                String browser = null;
                for (int count = 0; count < browsers.length; count++) {
                    if (Runtime.getRuntime().exec(new String[]{"which", browsers[count]}).waitFor() == 0) {
                        browser = browsers[count];
                    }
                    if (browser == null) {
                        throw new Exception("No se puede abrir el navegador web");
                    } else {
                        Runtime.getRuntime().exec(new String[]{browser, url});
                    }
                }
            }
        } catch (Exception e) {
            Mensajes.error(e.getLocalizedMessage());
        }
    }

}
