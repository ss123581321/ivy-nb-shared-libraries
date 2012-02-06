package com.munian.ivy.module.ui.options;

import com.munian.ivy.module.options.IvyRetrieveSettings;
import javax.swing.JComboBox;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.NbBundle;

final class IvyPanel extends javax.swing.JPanel {

    private final IvyOptionsPanelController controller;
    private String selectedRetrieveTemplateName;

    IvyPanel(IvyOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        overridableOptions = new com.munian.ivy.module.ui.options.OverridableOptions();
        ivySettingsTemplatesCombo = new javax.swing.JComboBox();
        settingTemplatesLbl = new javax.swing.JLabel();
        newTemplateButton = new javax.swing.JButton();
        deleteTemplateButton = new javax.swing.JButton();
        organizationLbl = new javax.swing.JLabel();
        organizationURLLbl = new javax.swing.JLabel();
        organizationText = new javax.swing.JTextField();
        organizationURLText = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(overridableOptions, gridBagConstraints);

        ivySettingsTemplatesCombo.setModel(new javax.swing.DefaultComboBoxModel(controller.getIvyOptionsLookup().getRetrieveSettingsTemplateNames().toArray()));
        ivySettingsTemplatesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ivySettingsTemplatesComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(ivySettingsTemplatesCombo, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(settingTemplatesLbl, org.openide.util.NbBundle.getMessage(IvyPanel.class, "IvyPanel.settingTemplatesLbl.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 10);
        add(settingTemplatesLbl, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(newTemplateButton, org.openide.util.NbBundle.getMessage(IvyPanel.class, "IvyPanel.newTemplateButton.text")); // NOI18N
        newTemplateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTemplateButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 0);
        add(newTemplateButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(deleteTemplateButton, org.openide.util.NbBundle.getMessage(IvyPanel.class, "IvyPanel.deleteTemplateButton.text")); // NOI18N
        deleteTemplateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTemplateButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 0);
        add(deleteTemplateButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(organizationLbl, org.openide.util.NbBundle.getMessage(IvyPanel.class, "IvyPanel.organizationLbl.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 10);
        add(organizationLbl, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(organizationURLLbl, org.openide.util.NbBundle.getMessage(IvyPanel.class, "IvyPanel.organizationURLLbl.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 10);
        add(organizationURLLbl, gridBagConstraints);

        organizationText.setText(org.openide.util.NbBundle.getMessage(IvyPanel.class, "IvyPanel.organizationText.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(organizationText, gridBagConstraints);

        organizationURLText.setText(org.openide.util.NbBundle.getMessage(IvyPanel.class, "IvyPanel.organizationURLText.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(organizationURLText, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void newTemplateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTemplateButtonActionPerformed
        NotifyDescriptor.InputLine input = new NotifyDescriptor.InputLine(NbBundle.getMessage(IvyPanel.class, "IvyPanel.newSettings.text"), NbBundle.getMessage(IvyPanel.class, "IvyPanel.newSettings.title"));
        Object result = DialogDisplayer.getDefault().notify(input);
        String newName = input.getInputText();
        if (result == NotifyDescriptor.OK_OPTION) {
            if (newName != null && !newName.isEmpty()) {
                if (controller.getIvyOptionsLookup().getRetrieveSettingsTemplateNames().contains(newName)) {
                    NotifyDescriptor.Message alreadyExistsMessage = new NotifyDescriptor.Message(NbBundle.getMessage(IvyPanel.class, "IvyPanel.templateExists.text"));
                    DialogDisplayer.getDefault().notify(alreadyExistsMessage);
                } else {
                    ivySettingsTemplatesCombo.addItem(newName);
                    ivySettingsTemplatesCombo.setSelectedIndex(ivySettingsTemplatesCombo.getItemCount()-1);
                }
            } else {
                NotifyDescriptor.Message invalidNameMessage = new NotifyDescriptor.Message(NbBundle.getMessage(IvyPanel.class, "IvyPanel.templateInvalidName.text"));
                DialogDisplayer.getDefault().notify(invalidNameMessage);
            }
        }
     }//GEN-LAST:event_newTemplateButtonActionPerformed

    private void deleteTemplateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTemplateButtonActionPerformed
        controller.getIvyOptionsLookup().deleteRetrieveSettingsTemplate(selectedRetrieveTemplateName);
        String itemToRemove = selectedRetrieveTemplateName;
        selectedRetrieveTemplateName=null;
        ivySettingsTemplatesCombo.removeItem(itemToRemove);
        ivySettingsTemplatesCombo.setSelectedIndex(0);
    }//GEN-LAST:event_deleteTemplateButtonActionPerformed

    private void ivySettingsTemplatesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ivySettingsTemplatesComboActionPerformed
        JComboBox comboBox = (JComboBox) evt.getSource();
        saveCurrentRetrieveSettingsSelection();

        selectedRetrieveTemplateName = (String) comboBox.getSelectedItem();

        loadCurrentRetrieveSettingsSelection();
        
    }//GEN-LAST:event_ivySettingsTemplatesComboActionPerformed

    void load() {
        selectedRetrieveTemplateName = (String) ivySettingsTemplatesCombo.getSelectedItem();
        organizationText.setText(controller.getIvyOptionsLookup().getOrganization());
        organizationURLText.setText(controller.getIvyOptionsLookup().getOrganizationURL());
        loadCurrentRetrieveSettingsSelection();
    }

    void store() {
        controller.getIvyOptionsLookup().setOrganization(organizationText.getText());
        controller.getIvyOptionsLookup().setOrganizationURL(organizationURLText.getText());
        saveCurrentRetrieveSettingsSelection();
        controller.getIvyOptionsLookup().saveIvyOptions();
    }

    private void loadCurrentRetrieveSettingsSelection() {
        IvyRetrieveSettings retrieveSettings = controller.getIvyOptionsLookup().getIvyRetrieveSettingsTemplate(selectedRetrieveTemplateName);
        overridableOptions.loadPanel(retrieveSettings);
        deleteTemplateButton.setEnabled(ivySettingsTemplatesCombo.getItemCount()>1);
    }

    private void saveCurrentRetrieveSettingsSelection() {
        if (selectedRetrieveTemplateName!=null) {
            IvyRetrieveSettings retrieveSettings = controller.getIvyOptionsLookup().getIvyRetrieveSettingsTemplate(selectedRetrieveTemplateName);
            if (overridableOptions.readPanel(retrieveSettings) || !retrieveSettings.isPersisted()) {
                controller.getIvyOptionsLookup().saveIvyRetrieveSettingsTemplate(selectedRetrieveTemplateName, retrieveSettings);
            }
        }
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteTemplateButton;
    private javax.swing.JComboBox ivySettingsTemplatesCombo;
    private javax.swing.JButton newTemplateButton;
    private javax.swing.JLabel organizationLbl;
    private javax.swing.JTextField organizationText;
    private javax.swing.JLabel organizationURLLbl;
    private javax.swing.JTextField organizationURLText;
    private com.munian.ivy.module.ui.options.OverridableOptions overridableOptions;
    private javax.swing.JLabel settingTemplatesLbl;
    // End of variables declaration//GEN-END:variables
}