import java.io.IOException;
import java.util.ArrayList;

public class HiloChat implements Runnable {
    private ArrayList<String> chat = new ArrayList<String>();    
    private HiloChat otroChat;
    private String nombre;
    private boolean escribiendo;
            
    public HiloChat(String nombre, HiloChat otroChat, boolean escribiendo) throws IOException {
        Archivo archivos = new Archivo();        
        this.chat = archivos.leerArchivoChat(nombre + ".txt");
        this.nombre = nombre;
        this.otroChat = otroChat;
        this.escribiendo = escribiendo;
    }

    public void setOtroChat(HiloChat otroChat) {
        this.otroChat = otroChat;
    }
    
    public synchronized void setFlag(boolean escribiendo) {
        this.escribiendo = escribiendo;
        notify(); // Notificar al hilo que se detuvo en el método wait() para que continúe
    }
    
    @Override
    public void run() {        
        String mensaje;
        int contador = 0;
        final String SEPARADOR = " ";
        synchronized (this) {
            while (contador < chat.size()) {//Imprimir chat                
                try {//Efecto de escritura lenta                     
                    while (!escribiendo) {//Espera el hilo que no este escribiendo
                        wait();
                    }
                    mensaje = chat.get(contador);
                    String[] text = mensaje.split(SEPARADOR);
                    MainJFrame.jtaChat.append(nombre + ": ");
                    for (String t : text) {
                        MainJFrame.jtaChat.append(t + " ");
                        Thread.sleep(500);//Tiempo de espera entre cada palabra
                    }                    
                    MainJFrame.jtaChat.append("\n\n");                    
                    Thread.sleep(2000);//Tiempo de espera entre cada chat
                    otroChat.setFlag(true);
                    escribiendo = false;
                    contador++;
                } catch (InterruptedException ex) {
                }
            }
        }
        System.out.println(nombre + " finalizo su chat");
        MainJFrame.jbIniciarPrueba.setEnabled(true);
    }
}
