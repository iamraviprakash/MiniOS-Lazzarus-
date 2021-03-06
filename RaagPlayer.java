
import java.io.File;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravi
 */
public class RaagPlayer extends javax.swing.JInternalFrame {
       static MP3  song;
    /**
     * Creates new form RaagPlayer
     */
    public RaagPlayer() {
        initComponents();
        song=null;
        addInternalFrameListener(new InternalFrameAdapter(){
            public void internalFrameClosed(InternalFrameEvent e) {
               // System.out.print("hello");
                song.close();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filechooser = new javax.swing.JFileChooser();
        label = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        open = new javax.swing.JButton();
        play = new javax.swing.JButton();
        stop = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("RaagPlayer");

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giphy.jpg"))); // NOI18N

        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open.jpg"))); // NOI18N
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play(1).jpg"))); // NOI18N
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stop.jpg"))); // NOI18N
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(stop, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(play))
                    .addComponent(open))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        int returnVal = filechooser.showOpenDialog(this);
        File file = filechooser.getSelectedFile();
        song=new MP3(file.getAbsolutePath());
        l2.setText(file.getName());
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giphy.jpg")));
    }//GEN-LAST:event_openActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        if(song!=null)
        song.play();

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giph.gif")));
    }//GEN-LAST:event_playActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        if(song!=null)
        song.close();
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giphy.jpg")));
    }//GEN-LAST:event_stopActionPerformed
    public static void playsong(String s){
        song=new MP3(s);
        song.play();
        l2.setText(s.substring(s.lastIndexOf('/')+1));
        //label.setIcon(new javax.swing.ImageIcon(this.getResource("/giphy.jpg")));
        
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser filechooser;
    private static javax.swing.JLabel l2;
    private static javax.swing.JLabel label;
    private javax.swing.JButton open;
    private javax.swing.JButton play;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}
