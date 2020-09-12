package lab7_carlosdiaz;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class hiloBarra extends Thread{
    private JProgressBar barra;
    private JTable tablita;
    private Carro carro;
    private int limite;
    private boolean vive;

    public hiloBarra(JProgressBar barra, JTable tablita, Carro carro, int limite) {
        this.barra = barra;
        this.tablita = tablita;
        this.carro = carro;
        this.limite = limite;
        vive=true;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
        while(vive){
            barra.setValue(barra.getValue()+1);
            
            if(barra.getValue()==limite){
                vive=false;
                //meter carro a la tabla
                Object[] newrow = {
                        carro.getPlaca(),
                        carro.getTamano(),
                        carro.getNivSuciedad(),
                        limite
                };
                DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
                modelo.addRow(newrow);
                tablita.setModel(modelo);
                barra.setValue(0);
                System.out.println("FIN con carro"+carro);
            }
            
            try {
                Thread.sleep(500);                 //cada medio segundo
            } catch (InterruptedException ex) {
            }
        }
        
            
    }
}
