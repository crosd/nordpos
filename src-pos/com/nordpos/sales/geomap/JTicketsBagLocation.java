/**
 *
 * NORD POS is a fork of Openbravo POS.
 *
 * Copyright (C) 2009-2016 Nord Trading Ltd. <http://www.nordpos.com>
 *
 * This file is part of NORD POS.
 *
 * NORD POS is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * NORD POS is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * NORD POS. If not, see <http://www.gnu.org/licenses/>.
 */
package com.nordpos.sales.geomap;

import javax.swing.*;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.forms.AppView;

public class JTicketsBagLocation extends javax.swing.JPanel {

    private AppView m_App;
    private JTicketsBagLocationMap m_location;

    public JTicketsBagLocation(AppView app, JTicketsBagLocationMap location) {

        m_App = app;
        m_location = location;

        initComponents();
    }

    public void activate() {

        // Authorization
        m_jDelTicket.setEnabled(m_App.getAppUserView().getUser().hasPermission("com.openbravo.pos.sales.JPanelTicketEdits"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m_jDelTicket = new javax.swing.JButton();
        m_jMovTicket = new javax.swing.JButton();
        m_jLocationMap = new javax.swing.JButton();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        m_jDelTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/list-remove.png"))); // NOI18N
        m_jDelTicket.setFocusPainted(false);
        m_jDelTicket.setFocusable(false);
        m_jDelTicket.setMargin(new java.awt.Insets(0, 4, 0, 4));
        m_jDelTicket.setRequestFocusEnabled(false);
        m_jDelTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jDelTicketActionPerformed(evt);
            }
        });
        add(m_jDelTicket);

        m_jMovTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/redo16.png"))); // NOI18N
        m_jMovTicket.setFocusPainted(false);
        m_jMovTicket.setFocusable(false);
        m_jMovTicket.setMargin(new java.awt.Insets(0, 4, 0, 4));
        m_jMovTicket.setRequestFocusEnabled(false);
        m_jMovTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jMovTicketActionPerformed(evt);
            }
        });
        add(m_jMovTicket);

        m_jLocationMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/applications-internet.png"))); // NOI18N
        m_jLocationMap.setFocusPainted(false);
        m_jLocationMap.setFocusable(false);
        m_jLocationMap.setMargin(new java.awt.Insets(0, 4, 0, 4));
        m_jLocationMap.setRequestFocusEnabled(false);
        m_jLocationMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jLocationMapActionPerformed(evt);
            }
        });
        add(m_jLocationMap);
    }// </editor-fold>//GEN-END:initComponents

    private void m_jMovTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jMovTicketActionPerformed

        //m_location.moveTicket();

    }//GEN-LAST:event_m_jMovTicketActionPerformed

    private void m_jDelTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jDelTicketActionPerformed

        int res = JOptionPane.showConfirmDialog(this, AppLocal.getIntString("message.wannadelete"), AppLocal.getIntString("title.editor"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res == JOptionPane.YES_OPTION) {
            m_location.deleteTicket();
        }

    }//GEN-LAST:event_m_jDelTicketActionPerformed

    private void m_jLocationMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jLocationMapActionPerformed

        //m_location.newTicket();

    }//GEN-LAST:event_m_jLocationMapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton m_jDelTicket;
    private javax.swing.JButton m_jLocationMap;
    private javax.swing.JButton m_jMovTicket;
    // End of variables declaration//GEN-END:variables

}