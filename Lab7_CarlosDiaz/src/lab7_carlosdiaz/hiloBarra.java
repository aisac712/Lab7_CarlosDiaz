package lab7_carlosdiaz;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class hiloBarra extends Thread{
    private JProgressBar barra;
    private JTable tablita;
    private Carro carro;
    private int limite;

    public hiloBarra(JProgressBar barra, JTable tablita, Carro carro, int limite) {
        this.barra = barra;
        this.tablita = tablita;
        this.carro = carro;
        this.limite = limite;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    @Override
    public void run(){
        while(barra.getValue()<limite){
            barra.setValue(barra.getValue()+1);
            
            try {
                Thread.sleep(500);                 //cada medio segundo
            } catch (InterruptedException ex) {
            }
        }
        
        //meter carro a la tabla
        Object[] newrow = {
                carro.getPlaca(),
                carro.getTamano(),
                carro.getNivSuciedad(),
                12
        };
        DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
        modelo.addRow(newrow);
        tablita.setModel(modelo);
        barra.setValue(0);
        System.out.println("FIN");
    }
}
