
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Enki
 */
public class BSim extends javax.swing.JFrame {
    ArrayList<Personagem> array = new ArrayList<Personagem>();
    String[] d_nomes = {"Fulaninho22","WesleySafadão1"};
    
    
    /**
     * Creates new form BSim
     */
    public BSim() {
        Stats st = new Stats();
            st.setVisible(true);
        initComponents();

        for (int i = 0; i < 2; i++) {
                        
		String Nome = JOptionPane.showInputDialog(null,
        		"Nome do personagem " + st.getName1() +(i + 1), d_nomes[i]);
		if (Nome == null)
			Nome = "Fulano";

		String aux = JOptionPane.showInputDialog("HP Máximo do personagem ["
				+ Nome +"]", 250);
		if (aux == null)
			aux = "100";
		int MAXHP = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("ATK do personagem ["
				+ Nome+"]", (int) Math.floor(Math.random()*10));
		if (aux == null)
			aux = "1";
		double ATK = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("DEF do personagem ["
				+ Nome+"]", (int) Math.floor(Math.random()*10));
		if (aux == null)
			aux = "0";
		double DEF = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("CRÍTICO do personagem ["
				+ Nome+"]", (int) Math.floor(Math.random()*100));
			if (aux == null)
				aux = "0";
			double CRIT = Integer.parseInt(aux);

			array.add(new Personagem(MAXHP, ATK, DEF, CRIT, Nome));
	}
      Name1.setText("[" + array.get(0).getName() + "]");
      MAXHP1.setText("/ " + array.get(0).getMAXHP());
      AtualHP1.setText(""+array.get(0).getMAXHP());
      ATK1.setText("• ATK : " + array.get(0).getATK());
      DEF1.setText("• DEF : " + array.get(0).getDEF());
      CRIT1.setText("• Crítico : " + array.get(0).getCRIT());
      HPBar1.setMaximum(array.get(0).getMAXHP());
      HPBar1.setValue(array.get(0).getHPATUAL());
      Name2.setText("[" + array.get(1).getName() + "]");
      AtualHP2.setText(""+array.get(1).getMAXHP());
      MAXHP2.setText("/ " + array.get(1).getMAXHP());
      ATK2.setText("• ATK : " + array.get(1).getATK());
      DEF2.setText("• DEF : " + array.get(1).getDEF());
      CRIT2.setText("• Crítico : " + array.get(1).getCRIT());
      HPBar2.setMaximum(array.get(1).getMAXHP());
      HPBar2.setValue(array.get(1).getHPATUAL());
    
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name1 = new javax.swing.JLabel();
        Name1.setText("Hello");
        MAXHP1 = new javax.swing.JLabel();
        Name1.setText("Hello");
        Char1 = new javax.swing.JLabel();
        ATK1 = new javax.swing.JLabel();
        Name1.setText("Hello");
        DEF1 = new javax.swing.JLabel();
        Name1.setText("Hello");
        CRIT1 = new javax.swing.JLabel();
        Name1.setText("Hello");
        ATK2 = new javax.swing.JLabel();
        Name1.setText("Hello");
        DEF2 = new javax.swing.JLabel();
        Name1.setText("Hello");
        CRIT2 = new javax.swing.JLabel();
        Name1.setText("Hello");
        Name2 = new javax.swing.JLabel();
        Name1.setText("Hello");
        Char2 = new javax.swing.JLabel();
        BattleButton = new javax.swing.JButton();
        AtualHP1 = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        MAXHP2 = new javax.swing.JLabel();
        Name1.setText("Hello");
        AtualHP2 = new javax.swing.JLabel();
        HPBar2 = new javax.swing.JProgressBar();
        HPBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fulano Simulator");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(490, 339));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 255, 255));
        Name1.setText("[Fulano]");
        getContentPane().add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 139, 101, -1));

        MAXHP1.setLabelFor(MAXHP1);
        MAXHP1.setText("/ 250");
        getContentPane().add(MAXHP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 160, 48, -1));

        Char1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/knight1.png"))); // NOI18N
        Char1.setPreferredSize(new java.awt.Dimension(240, 120));
        getContentPane().add(Char1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 11, 101, -1));

        ATK1.setBackground(new java.awt.Color(204, 204, 255));
        ATK1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ATK1.setForeground(new java.awt.Color(255, 255, 255));
        ATK1.setText("jLabel1");
        getContentPane().add(ATK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 80, -1));

        DEF1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DEF1.setForeground(new java.awt.Color(255, 255, 255));
        DEF1.setText("jLabel1");
        getContentPane().add(DEF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 80, -1));

        CRIT1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CRIT1.setForeground(new java.awt.Color(255, 255, 255));
        CRIT1.setText("jLabel1");
        getContentPane().add(CRIT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 80, -1));

        ATK2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ATK2.setForeground(new java.awt.Color(255, 255, 255));
        ATK2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ATK2.setText("jLabel1");
        getContentPane().add(ATK2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 10, 80, -1));

        DEF2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DEF2.setForeground(new java.awt.Color(255, 255, 255));
        DEF2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DEF2.setText("jLabel1");
        getContentPane().add(DEF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 30, 80, -1));

        CRIT2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CRIT2.setForeground(new java.awt.Color(255, 255, 255));
        CRIT2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CRIT2.setText("jLabel1");
        getContentPane().add(CRIT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 50, 80, -1));

        Name2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Name2.setForeground(new java.awt.Color(255, 255, 255));
        Name2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Name2.setText("[Fulano]");
        getContentPane().add(Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 139, 101, -1));

        Char2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Char2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/crusader1.png"))); // NOI18N
        getContentPane().add(Char2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 120, 140));

        BattleButton.setText("Battle!");
        BattleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BattleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BattleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        AtualHP1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AtualHP1.setText("250");
        getContentPane().add(AtualHP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 160, 50, -1));

        ResetButton.setText("Restart");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        MAXHP2.setLabelFor(MAXHP1);
        MAXHP2.setText("/ 250");
        getContentPane().add(MAXHP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 160, 48, -1));

        AtualHP2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AtualHP2.setText("250");
        getContentPane().add(AtualHP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 160, 50, -1));
        getContentPane().add(HPBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 159, 101, -1));
        getContentPane().add(HPBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 159, 101, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Poring.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 430, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 490, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BattleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BattleButtonActionPerformed
      array.get(0).dano();
      array.get(1).dano();
      array.get(0).setHPATUAL(array.get(1).getDANOATUAL());
      array.get(1).setHPATUAL(array.get(0).getDANOATUAL());
      AtualHP1.setText(""+array.get(0).getHPATUAL());
      AtualHP2.setText(""+array.get(1).getHPATUAL());
      HPBar1.setValue(array.get(0).getHPATUAL());
      HPBar2.setValue(array.get(1).getHPATUAL());
      if (array.get(1).getULTIMODANO()>0) {
      jTextArea1.append("["+array.get(0).getName()+"] causou "+array.get(1).getULTIMODANO()+" de dano em ["
              +array.get(1).getName()+"]      ");
      
      if(array.get(0).getACCRIT()) {
          jTextArea1.append("»Dano Crítico!«");
      }
      
      jTextArea1.append("\n");
      }
            if (array.get(0).getULTIMODANO()>0) {
      jTextArea1.append("["+array.get(1).getName()+"] causou "+array.get(0).getULTIMODANO()+" de dano em ["
              +array.get(0).getName()+"]      ");
      
      if(array.get(1).getACCRIT()) {
          jTextArea1.append("»Dano Crítico!«");
      }
      
      jTextArea1.append("\n");
      }
      
      if (HPBar1.getValue() <= 0 | HPBar2.getValue() <=0){
          BattleButton.setEnabled(false);
      }
      
      if(HPBar1.getValue() <= 0) {
          Char1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/knightd.png")));
          Char2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/crusadersit.png")));
          jTextArea1.append(array.get(1).getName()+ " venceu!");
      } else if (HPBar2.getValue() <= 0){
          Char1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/knightsit.png")));
          Char2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/crusaderd.png")));
          jTextArea1.append(array.get(0).getName()+ " venceu!");
      } else if (HPBar1.getValue() <= 0 | HPBar2.getValue() <=0) {
          jTextArea1.append("Os dois perderam!");
          Char1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/knightd.png")));
          Char2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/crusaderd.png")));
      }
    }//GEN-LAST:event_BattleButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        BattleButton.setEnabled(true);
        Char1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/knight1.png")));
        Char2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/crusader1.png")));
        jTextArea1.setText("");
        array.get(0).renovaHP();
        array.get(1).renovaHP();
    }//GEN-LAST:event_ResetButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BSim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ATK1;
    private javax.swing.JLabel ATK2;
    private javax.swing.JLabel AtualHP1;
    private javax.swing.JLabel AtualHP2;
    private javax.swing.JButton BattleButton;
    private javax.swing.JLabel CRIT1;
    private javax.swing.JLabel CRIT2;
    private javax.swing.JLabel Char1;
    private javax.swing.JLabel Char2;
    private javax.swing.JLabel DEF1;
    private javax.swing.JLabel DEF2;
    private javax.swing.JProgressBar HPBar1;
    private javax.swing.JProgressBar HPBar2;
    private javax.swing.JLabel MAXHP1;
    private javax.swing.JLabel MAXHP2;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
