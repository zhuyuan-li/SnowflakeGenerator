/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snowflakegenerator;

import java.util.Random;

/**
 *
 * @author lij8204
 */
public class SGGUI extends javax.swing.JFrame {
    
    drawHandler screen;
    
    double branchLength = 50;
    double offAngle = Math.PI/3;
    
    int numBranches = 2;
    int snowDepth = 3;
    
    int numMainArms = 6;
    
    int xVal = 250;
    int yVal = 250;
    
    boolean initialized = false;
    
    //Utilizes Random() for drawing snowflakes at a random location
    Random r = new Random();
    
    public SGGUI() {
        initComponents();
        screen = new drawHandler(mainPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        mainPanel = new javax.swing.JPanel();
        drawButtonC = new javax.swing.JButton();
        oA = new javax.swing.JSlider();
        OverallSnowflakeSize = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Note = new javax.swing.JLabel();
        SnowflakeBranchingAngle = new javax.swing.JLabel();
        bL = new javax.swing.JSlider();
        BG2 = new javax.swing.JButton();
        DepthofSnowflake = new javax.swing.JLabel();
        nB = new javax.swing.JSlider();
        NumberofBranches = new javax.swing.JLabel();
        sD = new javax.swing.JSlider();
        NumberofSnowflakeArms = new javax.swing.JLabel();
        nMA = new javax.swing.JSlider();
        BG1 = new javax.swing.JButton();
        xV = new javax.swing.JSpinner();
        xValue = new javax.swing.JLabel();
        yV = new javax.swing.JSpinner();
        yValue = new javax.swing.JLabel();
        drawButtonR = new javax.swing.JButton();
        ZerotoFourFifty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                mainPanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        drawButtonC.setText("Draw w/Coords");
        drawButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonCActionPerformed(evt);
            }
        });

        oA.setMajorTickSpacing(2);
        oA.setMaximum(8);
        oA.setMinimum(2);
        oA.setMinorTickSpacing(1);
        oA.setPaintLabels(true);
        oA.setPaintTicks(true);
        oA.setToolTipText("");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, oA, org.jdesktop.beansbinding.ELProperty.create("${value}"), oA, org.jdesktop.beansbinding.BeanProperty.create("value"), "sizeValue");
        bindingGroup.addBinding(binding);

        oA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                oAStateChanged(evt);
            }
        });

        OverallSnowflakeSize.setText("Overall Snowflake Size");

        Title.setText("Set General Snowflake Parameters");

        SnowflakeBranchingAngle.setText("Snowflake Branching Angle (PI/x)");

        bL.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bL.setMajorTickSpacing(25);
        bL.setMaximum(75);
        bL.setMinimum(25);
        bL.setMinorTickSpacing(5);
        bL.setPaintLabels(true);
        bL.setPaintTicks(true);
        bL.setPaintTrack(false);
        bL.setSnapToTicks(true);
        bL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bLStateChanged(evt);
            }
        });

        BG2.setText("BG 2/Clear");
        BG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BG2ActionPerformed(evt);
            }
        });

        DepthofSnowflake.setText("Depth of Snowflake (5 not recommended)");

        nB.setMajorTickSpacing(1);
        nB.setMaximum(4);
        nB.setMinimum(2);
        nB.setMinorTickSpacing(1);
        nB.setPaintLabels(true);
        nB.setPaintTicks(true);
        nB.setSnapToTicks(true);
        nB.setToolTipText("");
        nB.setValue(2);
        nB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nBStateChanged(evt);
            }
        });

        NumberofBranches.setText("Number of Branch Pairs");

        sD.setMajorTickSpacing(1);
        sD.setMaximum(5);
        sD.setMinimum(2);
        sD.setMinorTickSpacing(1);
        sD.setPaintLabels(true);
        sD.setPaintTicks(true);
        sD.setSnapToTicks(true);
        sD.setToolTipText("");
        sD.setValue(3);
        sD.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sDStateChanged(evt);
            }
        });

        NumberofSnowflakeArms.setText("Number of Snowflake Arms");

        nMA.setMajorTickSpacing(1);
        nMA.setMaximum(8);
        nMA.setMinimum(3);
        nMA.setMinorTickSpacing(1);
        nMA.setPaintLabels(true);
        nMA.setPaintTicks(true);
        nMA.setSnapToTicks(true);
        nMA.setToolTipText("");
        nMA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nMAStateChanged(evt);
            }
        });

        BG1.setText("BG 1/Clear");
        BG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BG1ActionPerformed(evt);
            }
        });

        xV.setModel(new javax.swing.SpinnerNumberModel(250, 100, 400, 10));
        xV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                xVStateChanged(evt);
            }
        });

        xValue.setText("x-Value");

        yV.setModel(new javax.swing.SpinnerNumberModel(250, 100, 400, 10));
        yV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                yVStateChanged(evt);
            }
        });

        yValue.setText("y-Value");

        drawButtonR.setText("Draw at Random Location");
        drawButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonRActionPerformed(evt);
            }
        });

        ZerotoFourFifty.setText("(100-400)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(OverallSnowflakeSize)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(drawButtonR)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(BG1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BG2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(xV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(xValue))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(yValue)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ZerotoFourFifty))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(yV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(drawButtonC))))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Note)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SnowflakeBranchingAngle)
                            .addComponent(oA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumberofBranches)
                            .addComponent(nB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DepthofSnowflake)
                            .addComponent(sD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumberofSnowflakeArms)
                            .addComponent(nMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OverallSnowflakeSize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SnowflakeBranchingAngle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumberofBranches)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DepthofSnowflake)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumberofSnowflakeArms)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Note)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(yValue)
                                .addComponent(xValue)
                                .addComponent(ZerotoFourFifty)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drawButtonC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drawButtonR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BG1)
                            .addComponent(BG2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonCActionPerformed
        
        //If the program hasn't drawn anything yet, draw the first snowflake with a background
        if (initialized == false) {
            screen.drawBG(1);
            initialized = true;
        }
        
        Snowflake S = new Snowflake(branchLength, offAngle, numBranches, snowDepth, numMainArms);
        screen.drawSnow(xVal, yVal, S);
        
    }//GEN-LAST:event_drawButtonCActionPerformed

    private void mainPanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mainPanelAncestorAdded
        
    }//GEN-LAST:event_mainPanelAncestorAdded

    private void oAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_oAStateChanged
        int denom = oA.getValue();
        offAngle = Math.PI/denom;
    }//GEN-LAST:event_oAStateChanged

    private void bLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bLStateChanged
        branchLength = bL.getValue();
    }//GEN-LAST:event_bLStateChanged

    private void BG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BG2ActionPerformed
        initialized = true;
        screen.drawBG(2);
    }//GEN-LAST:event_BG2ActionPerformed

    private void nBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nBStateChanged
        numBranches = nB.getValue();
    }//GEN-LAST:event_nBStateChanged

    private void sDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sDStateChanged
        snowDepth = sD.getValue();
    }//GEN-LAST:event_sDStateChanged

    private void nMAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nMAStateChanged
        numMainArms = nMA.getValue();
    }//GEN-LAST:event_nMAStateChanged

    private void BG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BG1ActionPerformed
        initialized = true;
        screen.drawBG(1);
    }//GEN-LAST:event_BG1ActionPerformed

    private void xVStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_xVStateChanged
        xVal = (int)xV.getValue();
    }//GEN-LAST:event_xVStateChanged

    private void drawButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonRActionPerformed
        //If the program hasn't drawn anything yet, draw the first snowflake with a background
        if (initialized == false) {
            screen.drawBG(1);
            initialized = true;
        }
        
        Snowflake S = new Snowflake(branchLength, offAngle, numBranches, snowDepth, numMainArms);
        
        //The limited range ensures that outer snowflake branches aren't cut off by the JPanel
        int tempX = r.nextInt(349) + 100;
        int tempY = r.nextInt(349) + 100;
        
        screen.drawSnow(tempX, tempY, S);
    }//GEN-LAST:event_drawButtonRActionPerformed

    private void yVStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_yVStateChanged
        yVal = (int)yV.getValue();
    }//GEN-LAST:event_yVStateChanged

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
            java.util.logging.Logger.getLogger(SGGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SGGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SGGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SGGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SGGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BG1;
    private javax.swing.JButton BG2;
    private javax.swing.JLabel DepthofSnowflake;
    private javax.swing.JLabel Note;
    private javax.swing.JLabel NumberofBranches;
    private javax.swing.JLabel NumberofSnowflakeArms;
    private javax.swing.JLabel OverallSnowflakeSize;
    private javax.swing.JLabel SnowflakeBranchingAngle;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel ZerotoFourFifty;
    private javax.swing.JSlider bL;
    private javax.swing.JButton drawButtonC;
    private javax.swing.JButton drawButtonR;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JSlider nB;
    private javax.swing.JSlider nMA;
    private javax.swing.JSlider oA;
    private javax.swing.JSlider sD;
    private javax.swing.JSpinner xV;
    private javax.swing.JLabel xValue;
    private javax.swing.JSpinner yV;
    private javax.swing.JLabel yValue;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}