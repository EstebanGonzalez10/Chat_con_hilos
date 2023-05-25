import java.io.IOException;
import java.util.ArrayList;

public class HiloCuestionario extends Thread {
    private ArrayList<String[]> preguntas = new ArrayList<String[]>();    
    private String respuesta;
    private int contador;
    
    public HiloCuestionario(String preguntas) throws IOException {
        Archivo archivo = new Archivo();
        this.preguntas = archivo.leerArchivoPreguntas(preguntas);        
        this.contador = 0;
        this.respuesta = "";
    }
    
    public void setRespuesta(String respuesta){
        this.respuesta = respuesta;        
    }

    @Override
    public void run() {
        String preguntaActual, respuestaActual, historia;
        while (true) {
            try {        
                if (contador >= preguntas.size()){
                    MainJFrame.jtaHistorial.append("\nCompleted questionnaire");
                    MainJFrame.jlPregunta.setText("Completed questionnaire");
                    break;
                }
                preguntaActual = preguntas.get(contador)[0];
                respuestaActual = preguntas.get(contador)[1];
                MainJFrame.jlPregunta.setText(preguntaActual);                
                Thread.sleep(500);
                                
                if(!"".equals(respuesta)){                    
                    historia = "\n\nSentence: " + preguntaActual;
                    historia += "\nYour answer: " + respuesta;
                    if(respuesta.toLowerCase().equals(respuestaActual.toLowerCase()))
                        historia += "\nBOT: Your answer is correct :)";
                    else {
                        historia += "\nBOT: Your answer is not correct :(";
                        historia += "\nBOT: The correct answer is " + respuestaActual;
                    }                    
                    MainJFrame.jtaHistorial.append(historia);
                    respuesta = "";                    
                    contador ++;
                }
            } catch (InterruptedException e) {
            }
        }
    }
}

