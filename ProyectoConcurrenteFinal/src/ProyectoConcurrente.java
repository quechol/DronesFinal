/**
 * @author Gerardo Miguel Quechol Zarate        201768662
 * @version final 2
 * 
 */
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProyectoConcurrente extends javax.swing.JFrame {
    private boolean dr1=false,dr2=false,dr3=false,dr4=false,dr5=false,dr6=false,dr7=false,dr8=false,dr9=false,dr10=false;
    private PanelDron p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    private MiX x1,x2,x3,x4,x5,x6,x7,x8,x9,x10;
    private MiY y1,y2,y3,y4,y5,y6,y7,y8,y9,y10;
    //private MiX x;
    //private MiX y;
    private Dron d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
    private int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
    private int cont=0,cont2=0;
    private XYComp rc;
    private IPC ipc;
    public ProyectoConcurrente() {
        rc = new XYComp();
        ipc = new IPC();
        
        x1 = new MiX(0);
        y1 = new MiY(0);
        n1 = 1;
        p1 = new PanelDron(x1,y1,n1);
        p1.setBounds(0,0,830,600);
        p1.setOpaque(false);
        add(p1);  
        //d1 = new Dron(p1,x1,y1,800,550,rc);
        p1.setVisible(false);
        
        x2 = new MiX(0);
        y2 = new MiY(0);
        n2 = 2;
        p2 = new PanelDron(x2,y2,n2);
        p2.setBounds(400,0,830,600);
        p2.setOpaque(false);
        add(p2);
        //d2 = new Dron(p2,x2,y2,370,560,rc);
        p2.setVisible(false);
        
        x3 = new MiX(0);
        y3 = new MiY(0);
        n3 = 3;
        p3 = new PanelDron(x3,y3,n3);
        p3.setBounds(0,300,400,300);
        p3.setOpaque(false);
        add(p3);
        //d3 = new Dron(p3,x3,y3,370,260,rc);
        p3.setVisible(false);
        
        x4 = new MiX(0);
        y4 = new MiY(0);
        n4 = 4;
        p4 = new PanelDron(x4,y4,n4);
        p4.setBounds(400,300,400,300);
        p4.setOpaque(false);
        add(p4);
        //d4 = new Dron(p4,x4,y4,370,260,rc);
        p4.setVisible(false);
        
        x5 = new MiX(0);
        y5 = new MiY(0);
        n5 = 5;
        p5 = new PanelDron(x5,y5,n5);
        p5.setBounds(0,400,400,200);
        p5.setOpaque(false);
        add(p5);
        //d5 = new Dron(p5,x5,y5,370,160,rc);
        p5.setVisible(false);
        
        x6 = new MiX(0);
        y6 = new MiY(0);
        n6 = 6;
        p6 = new PanelDron(x6,y6,n6);
        p6.setBounds(400,400,400,200);
        p6.setOpaque(false);
        add(p6);              
        //d6 = new Dron(p6,x6,y6,370,160,rc); 
        p6.setVisible(false);
        
        x7 = new MiX(0);
        y7 = new MiY(0);
        n7 = 7;
        p7 = new PanelDron(x7,y7,n7);
        p7.setBounds(400,300,200,300);
        p7.setOpaque(false);
        add(p7);
        //d7 = new Dron(p7,x7,y7,170,260,rc);
        p7.setVisible(false);
        
        x8 = new MiX(0);
        y8 = new MiY(0);
        n8 = 8;
        p8 = new PanelDron(x8,y8,n8);
        p8.setBounds(600,300,200,300);
        p8.setOpaque(false);
        add(p8);
        //d8 = new Dron(p8,x8,y8,170,260,rc);
        p8.setVisible(false);
        
        x9 = new MiX(0);
        y9 = new MiY(0);
        n9 = 9;
        p9 = new PanelDron(x9,y9,n9);
        p9.setBounds(480,300,160,300);
        p9.setOpaque(false);
        add(p9);
        //d9 = new Dron(p9,x9,y9,130,260,rc);
        p9.setVisible(false);
        
        x10 = new MiX(0);
        y10 = new MiY(0);
        n10 = 10;
        p10 = new PanelDron(x10,y10,n10);
        p10.setBounds(640,300,160,300);
        p10.setOpaque(false);
        add(p10);
        //d10 = new Dron(p10,x10,y10,130,260,rc);
        p10.setVisible(false);   
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Red de Drones");
        setBounds(new java.awt.Rectangle(0, 0, 830, 630));
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(830, 630));
        setMinimumSize(new java.awt.Dimension(830, 630));
        setPreferredSize(new java.awt.Dimension(830, 630));
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MapaCUBUAP.png"))); // NOI18N
        jLabel2.setName(""); // NOI18N

        jMenu1.setText("Más");

        jMenuItem2.setText("Acerca");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Drones");

        jMenuItem4.setText("1");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("2");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("4");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("6");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("8");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("10");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("parar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem14.setText("limpiar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("Algoritmos");

        jMenuItem12.setText("Semaforos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenuItem11.setText("MUTEX");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuItem13.setText("Monitores");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuItem15.setText("VC");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenuItem16.setText("Barreras");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem16);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //JOptionPane.showMessageDialog(this,"Gracias por usar.","Proyecto Final Programación Concurrente y Paralela",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:           
        if(cont==0){
            crea1();
            cont=1;
            cont2=1;
        }else {
            System.out.println("No se puede inicializar el dron sin parar el actual");
            para(cont);
            limpia(cont2);
            crea1();
            cont=1;
            cont2=1;
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        //jMenuItem4.setEnabled(false);
        if(cont==0){
            crea1();
            crea2();
            cont=2;
            cont2=2;
        }else {
            System.out.println("No se puede inicializar el dron sin parar el actual");
            para(cont);
            limpia(cont2);
            crea1();
            crea2();
            cont=2;
            cont2=2;
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        //jMenuItem4.setEnabled(false);
        //jMenuItem5.setEnabled(false);
        if(cont==0){
            crea1();
            crea2();
            crea4();
            cont=4;
            cont2=4;
        }else {
            System.out.println("No se puede inicializar el dron sin parar el actual");
            para(cont);
            limpia(cont2);
            crea1();
            crea2();
            crea4();
            cont=4;
            cont2=4;
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        //jMenuItem4.setEnabled(false);
        //jMenuItem5.setEnabled(false);
        //jMenuItem6.setEnabled(false);
        if(cont==0){
            crea1();
            crea2();
            crea4();
            crea6();
            cont=6;
            cont2=6;
        }else {
            System.out.println("No se puede inicializar el dron sin parar el actual");
            para(cont);
            limpia(cont2);
            crea1();
            crea2();
            crea4();
            crea6();
            cont=6;
            cont2=6;
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        //jMenuItem4.setEnabled(false);
        //jMenuItem5.setEnabled(false);
        //jMenuItem6.setEnabled(false);
        //jMenuItem7.setEnabled(false);
        if(cont==0){
            crea1();
            crea2();
            crea4();
            crea6();
            crea8();
            cont=8;
            cont2=8;
        }else {
            System.out.println("No se puede inicializar el dron sin parar el actual");
            para(cont);
            limpia(cont2);
            crea1();
            crea2();
            crea4();
            crea6();
            crea8();
            cont=8;
            cont2=8;
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        //jMenuItem4.setEnabled(false);
        //jMenuItem5.setEnabled(false);
        //jMenuItem6.setEnabled(false);
        //jMenuItem7.setEnabled(false);
        //jMenuItem8.setEnabled(false);
        if(cont==0){
            crea1();
            crea2();
            crea4();
            crea6();
            crea8();
            crea10();
            cont=10;
            cont2=10;
        }else {
            System.out.println("No se puede inicializar el dron sin parar el actual");
            para(cont);
            limpia(cont2);
            crea1();
            crea2();
            crea4();
            crea6();
            crea8();
            crea10();
            cont=10;
            cont2=10;
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Gerardo Miguel Quechol Zarate   201768662","Programacion Concurrente y Paralela",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        para(cont);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        //Mutex
        if(cont == 0){
            JOptionPane.showMessageDialog(this,"Se ha seleccionado MUTEX","Mutex",JOptionPane.PLAIN_MESSAGE);
            ipc.setIpc(2);
            System.out.println("Algoritmo: "+ipc.getIpc());
        }else if (cont > 0){
            JOptionPane.showMessageDialog(this,"Se ha seleccionado MUTEX\nDebes iniciar de nuevo","Mutex",JOptionPane.PLAIN_MESSAGE);
            para(cont);
            ipc.setIpc(2);
            System.out.println("Algoritmo: "+ipc.getIpc());
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        //Semaforos 
        if(cont == 0){
            JOptionPane.showMessageDialog(this,"Se ha seleccionado semaforos","Semaforos",JOptionPane.PLAIN_MESSAGE);
            ipc.setIpc(1);
            System.out.println("Algoritmo: "+ipc.getIpc());
        }else if (cont > 0){
            JOptionPane.showMessageDialog(this,"Se ha seleccionado semaforos\nDebes iniciar de nuevo","Semaforos",JOptionPane.PLAIN_MESSAGE);
            para(cont);
            ipc.setIpc(1);
            System.out.println("Algoritmo: "+ipc.getIpc());
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        //Monitores
        if(cont == 0){
            JOptionPane.showMessageDialog(this,"Se ha seleccionado monitores","Monitores",JOptionPane.PLAIN_MESSAGE);
            ipc.setIpc(3);
            System.out.println("Algoritmo: "+ipc.getIpc());
        }else if (cont > 0){
            JOptionPane.showMessageDialog(this,"Se ha seleccionado monitores\nDebes iniciar de nuevo","Monitores",JOptionPane.PLAIN_MESSAGE);
            para(cont);
            ipc.setIpc(3);
            System.out.println("Algoritmo: "+ipc.getIpc());
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        //Limpiar
        para(cont);
        limpia(cont2);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        //VC
        if(cont == 0){
            JOptionPane.showMessageDialog(this,"Se ha seleccionado VC","Monitores",JOptionPane.PLAIN_MESSAGE);
            ipc.setIpc(4);
            System.out.println("Algoritmo: "+ipc.getIpc());
        }else if (cont > 0){
            JOptionPane.showMessageDialog(this,"Se ha seleccionado VC\nDebes iniciar de nuevo","Monitores",JOptionPane.PLAIN_MESSAGE);
            para(cont);
            ipc.setIpc(4);
            System.out.println("Algoritmo: "+ipc.getIpc());
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        //Barreras
        JOptionPane.showMessageDialog(this,"En construccion","Barreras",JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProyectoConcurrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoConcurrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoConcurrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoConcurrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoConcurrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
    public void crea1(){
        System.out.println("Drones: 1");
        p1.setVisible(true);
        
        x1.setMiX(0);
        y1.setMiY(0);
        d1 = new Dron(p1,x1,y1,800,550,rc,ipc); 
        
        modifica(p1,x1,y1,d1,0,0,830,600,0,800,550);
        
        d1.start();
    }
    public void crea2(){
        System.out.println("Drones: 2");
        p2.setVisible(true);
        
        d2 = new Dron(p2,x2,y2,370,560,rc,ipc);
        x2.setMiX(0);
        y2.setMiY(0);
        
        modifica(p1,x1,y1,d1,0,0,400,600,0,370,560);
        
        modifica(p2,x2,y2,d2,400,0,830,600,0,370,560);
        
        d2.start();
    }
    public void crea4(){
        System.out.println("Drones: 4");
        p3.setVisible(true);
        p4.setVisible(true);
        
        d3 = new Dron(p3,x3,y3,370,260,rc,ipc);
        d4 = new Dron(p4,x4,y4,370,260,rc,ipc);
        x3.setMiX(0);
        y3.setMiY(0);
        x4.setMiX(0);
        y4.setMiY(0);
        
        modifica(p1,x1,y1,d1,0,0,400,300,0,370,260);

        modifica(p2,x2,y2,d2,400,0,400,300,0,370,260);
        
        modifica(p3,x3,y3,d3,0,300,400,300,0,370,260);
        
        modifica(p4,x4,y4,d4,400,300,400,300,0,370,260);
        
        d3.start();
        d4.start();
    }
    public void crea6(){
        System.out.println("Drones: 6");
        p5.setVisible(true);
        p6.setVisible(true); 
        
        d5 = new Dron(p5,x5,y5,370,160,rc,ipc);
        d6 = new Dron(p6,x6,y6,370,160,rc,ipc);
        x5.setMiX(0);
        y5.setMiY(0);
        x6.setMiX(0);
        y6.setMiY(0);
        
        modifica(p1,x1,y1,d1,0,0,400,200,0,370,160);

        modifica(p2,x2,y2,d2,400,0,400,200,0,370,160);

        modifica(p3,x3,y3,d3,0,200,400,200,0,370,160);

        modifica(p4,x4,y4,d4,400,200,400,200,0,370,160);
        
        modifica(p5,x5,y5,d5,0,400,400,200,0,370,160);

        modifica(p6,x6,y6,d6,400,400,400,200,0,370,160);
        
        d5.start();
        d6.start();
    }
    public void crea8(){
        System.out.println("Drones: 8");
        p7.setVisible(true);
        p8.setVisible(true);  
        
        d7 = new Dron(p7,x7,y7,170,260,rc,ipc);
        d8 = new Dron(p8,x8,y8,170,260,rc,ipc);
        x7.setMiX(0);
        y7.setMiY(0);
        x8.setMiX(0);
        y8.setMiY(0);
        
        modifica(p1,x1,y1,d1,0,0,200,300,0,170,260);

        modifica(p2,x2,y2,d2,200,0,200,300,0,170,260);

        modifica(p3,x3,y3,d3,400,0,200,300,0,170,260);

        modifica(p4,x4,y4,d4,600,0,200,300,0,170,260);

        modifica(p5,x5,y5,d5,0,300,200,300,0,170,260);

        modifica(p6,x6,y6,d6,200,300,200,300,0,170,260);
        
        modifica(p7,x7,y7,d7,400,300,200,300,0,170,260);

        modifica(p8,x8,y8,d8,600,300,200,300,0,170,260);
        
        d7.start();
        d8.start();
    }
    public void crea10(){
        System.out.println("Drones: 10");
        p9.setVisible(true);
        p10.setVisible(true);
        
        d9 = new Dron(p9,x9,y9,130,260,rc,ipc);
        d10 = new Dron(p10,x10,y10,130,260,rc,ipc);
        x9.setMiX(0);
        y9.setMiY(0);
        x10.setMiX(0);
        y10.setMiY(0);
        
        modifica(p1,x1,y1,d1,0,0,160,300,0,130,260);

        modifica(p2,x2,y2,d2,160,0,160,300,0,130,260);

        modifica(p3,x3,y3,d3,320,0,160,300,0,130,260);

        modifica(p4,x4,y4,d4,480,0,160,300,0,130,260);

        modifica(p5,x5,y5,d5,640,0,160,300,0,130,260);

        modifica(p6,x6,y6,d6,0,300,160,300,0,130,260);

        modifica(p7,x7,y7,d7,160,300,160,300,0,130,260);

        modifica(p8,x8,y8,d8,320,300,160,300,0,130,260);
        
        modifica(p9,x9,y9,d9,480,300,160,300,0,130,260);

        modifica(p10,x10,y10,d10,640,300,160,300,0,130,260);
        
        d9.start();
        d10.start();
    }
    public void modifica(PanelDron auxP, MiX auxX, MiY auxY, Dron auxD, int xpos, int ypos, int xtam, int ytam, int ini, int borX, int borY ){
        auxP.setBounds(xpos,ypos,xtam,ytam);
        auxX.setMiX(ini);
        auxY.setMiY(ini);
        auxD.setBordeX(borX);
        auxD.setBordeY(borY);
    }
    public void para(int contAux){
        if(contAux==0){
            System.out.println("No hay Drones a Parar");
            JOptionPane.showMessageDialog(this,"No hay Drones a Parar","ERROR",JOptionPane.PLAIN_MESSAGE);
        }else if(contAux==1){
            System.out.println("Parar Drones: 1");
            d1.setReinicio(true);
            d1.stop();
            cont=0;
        }else if(contAux==2){
            System.out.println("Parar Drones: 2");
            d1.setReinicio(true);
            d2.setReinicio(true);
            d1.stop();
            d2.stop();
            cont=0;
        }else if(contAux==4){
            System.out.println("Parar Drones: 4");
            d1.setReinicio(true);
            d2.setReinicio(true);
            d3.setReinicio(true);
            d4.setReinicio(true);
            d1.stop();
            d2.stop();
            d3.stop();
            d4.stop();
            cont=0;
        }else if(contAux==6){
            System.out.println("Parar Drones: 6");
            d1.setReinicio(true);
            d2.setReinicio(true);
            d3.setReinicio(true);
            d4.setReinicio(true);
            d5.setReinicio(true);
            d6.setReinicio(true);
            d1.stop();
            d2.stop();
            d3.stop();
            d4.stop();
            d5.stop();
            d6.stop();
            cont=0;
        }else if(contAux==8){
            System.out.println("Parar Drones: 8");
            d1.setReinicio(true);
            d2.setReinicio(true);
            d3.setReinicio(true);
            d4.setReinicio(true);
            d5.setReinicio(true);
            d6.setReinicio(true);
            d7.setReinicio(true);
            d8.setReinicio(true);
            d1.stop();
            d2.stop();
            d3.stop();
            d4.stop();
            d5.stop();
            d6.stop();
            d7.stop();
            d8.stop();
            cont=0;
        }else if(contAux==10){
            System.out.println("Parar Drones: 10");
            d1.setReinicio(true);
            d2.setReinicio(true);
            d3.setReinicio(true);
            d4.setReinicio(true);
            d5.setReinicio(true);
            d6.setReinicio(true);
            d7.setReinicio(true);
            d8.setReinicio(true);
            d9.setReinicio(true);
            d10.setReinicio(true);
            d1.stop();
            d2.stop();
            d3.stop();
            d4.stop();
            d5.stop();
            d6.stop();
            d7.stop();
            d8.stop();
            d9.stop();
            d10.stop();
            cont=0;
        }
    }
    public void limpia(int contAux){
        if(contAux==0){
            System.out.println("No hay Nada a Limpiar");
            JOptionPane.showMessageDialog(this,"No hay Nada a Limpiar","ERROR",JOptionPane.PLAIN_MESSAGE);
        }else if(contAux==1){
            System.out.println("Borrar Panel: 1");
            p1.setVisible(false);
            cont2=0;
        }else if(contAux==2){
            System.out.println("Borrar Panel: 2");
            p1.setVisible(false);
            p2.setVisible(false);
            cont2=0;
        }else if(contAux==4){
            System.out.println("Borrar Panel: 4");
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);
            cont2=0;
        }else if(contAux==6){
            System.out.println("Borrar Panel: 6");
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);
            p5.setVisible(false);
            p6.setVisible(false);
            cont2=0;
        }else if(contAux==8){
            System.out.println("Borrar Panel: 8");
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);
            p5.setVisible(false);
            p6.setVisible(false);
            p7.setVisible(false);
            p8.setVisible(false);
            cont2=0;
        }else if(contAux==10){
            System.out.println("Borrar Panel: 10");
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);
            p5.setVisible(false);
            p6.setVisible(false);
            p7.setVisible(false);
            p8.setVisible(false);
            p9.setVisible(false);
            p10.setVisible(false);
            cont2=0;
        }
    }
}
