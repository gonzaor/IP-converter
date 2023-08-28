package Vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

public class FrmIp {

    public FrmIp(){
        initComponents();

    }

    private static boolean esValidoelInput(char c) {
        String aceptados = "0123456789.";
        return aceptados.indexOf(c) != -1;
    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private void btnConvertirMouseClicked(MouseEvent e) {
        
         
        if(txtIP != null){

            
            
            
        }
        
        
        
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Gonzalo O
        createUIComponents();

        var label1 = new JLabel();
        label2 = new JLabel();
        txtIP = new JTextField();
        label3 = new JLabel();
        txtBin = new JTextField();
        btnConvertir = new JButton();
        btnInvertir = new JButton();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            panel1.setLayout(null);

            //---- label1 ----
            label1.setFont(new Font("Arial Black", label1.getFont().getStyle(), 27));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setHorizontalTextPosition(SwingConstants.CENTER);
            label1.setText("Convertidor de IP a Binario");
            panel1.add(label1);
            label1.setBounds(0, 0, 578, label1.getPreferredSize().height);

            //---- label2 ----
            label2.setText("Ingrese la IP:");
            label2.setFont(new Font("Arial Black", Font.PLAIN, 22));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(label2);
            label2.setBounds(195, 60, 190, 40);
            panel1.add(txtIP);
            txtIP.setBounds(180, 105, 230, txtIP.getPreferredSize().height);

            //---- label3 ----
            label3.setText("Resultado en Binario:");
            label3.setFont(new Font("Arial Black", Font.PLAIN, 22));
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(label3);
            label3.setBounds(150, 170, 305, 40);

            //---- txtBin ----
            txtBin.setEditable(false);
            panel1.add(txtBin);
            txtBin.setBounds(185, 215, 225, 30);

            //---- btnConvertir ----
            btnConvertir.setText("Convertir");
            btnConvertir.setFont(new Font("Arial Black", Font.PLAIN, 16));
            btnConvertir.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnConvertirMouseClicked(e);
                }
            });
            panel1.add(btnConvertir);
            btnConvertir.setBounds(235, 275, 135, 45);

            //---- btnInvertir ----
            btnInvertir.setText("Invertir");
            btnInvertir.setFont(new Font("Arial Black", Font.PLAIN, 16));
            panel1.add(btnInvertir);
            btnInvertir.setBounds(440, 415, 135, 45);

            panel1.setPreferredSize(new Dimension(578, 471));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Gonzalo O
    private JPanel panel1;
    private JLabel label2;
    private JTextField txtIP;
    private JLabel label3;
    private JTextField txtBin;
    private JButton btnConvertir;
    private JButton btnInvertir;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
