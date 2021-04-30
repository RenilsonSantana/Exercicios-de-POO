
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BmnGamer
 */
public class testaExercicio {
    public static void main(String[]args){
    
    try {
    Superior superior = new Superior();
    superior.pegaNotas();

    
    double media = superior.CalculaMedia();
    superior.imprimirMedia(media);
    
    Tecnico tecnico = new Tecnico();
    tecnico.pegaNotas();

    double mediaTecnico = tecnico.CalculaMedia();
    tecnico.imprimirMedia(mediaTecnico);

    } catch(Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage() + "Erro");
    }
  }
}
