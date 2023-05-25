import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo {
    public ArrayList<String> leerArchivoChat(String nombreArchivo) throws IOException {
        ArrayList<String> chat = new ArrayList<String>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(nombreArchivo));
            String linea = br.readLine();
            while (null != linea) {                
                chat.add(linea);
                linea = br.readLine();                
            }            
        } catch (IOException e) {
        } finally {
            if (null != br) {
                br.close();
            }
        }
        return chat;
    }
    
    private final String SEPARADOR = ";";     
    public ArrayList<String[]> leerArchivoPreguntas(String nombreArchivo) throws IOException {
        ArrayList<String[]> preguntas = new ArrayList<String[]>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(nombreArchivo));
            String linea = br.readLine();
            while (null != linea) {
                preguntas.add(linea.split(SEPARADOR));
                linea = br.readLine();
            }
        } catch (IOException e) {
        } finally {
            if (null != br) {
                br.close();
            }
        }
        return preguntas;
    }
}
