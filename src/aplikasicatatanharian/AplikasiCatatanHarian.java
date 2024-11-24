
package aplikasicatatanharian;


import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class AplikasiCatatanHarian extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiCatatanHarian
     */
    public AplikasiCatatanHarian() {
        initComponents();
        loadNotes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scrollPaneNotes = new javax.swing.JScrollPane();
        listNotes = new javax.swing.JList<>();
        btnDelete = new javax.swing.JButton();
        calendar = new com.toedter.calendar.JCalendar();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldTitle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaInput = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("APLIKASI CATATAN HARIAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DAFTAR CATATAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        scrollPaneNotes.setMinimumSize(new java.awt.Dimension(37, 70));
        scrollPaneNotes.setPreferredSize(new java.awt.Dimension(37, 70));

        listNotes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listNotes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listNotesValueChanged(evt);
            }
        });
        scrollPaneNotes.setViewportView(listNotes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 0, 6);
        jPanel2.add(scrollPaneNotes, gridBagConstraints);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 0);
        jPanel2.add(btnDelete, gridBagConstraints);

        calendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 28, 2, 29);
        jPanel2.add(calendar, gridBagConstraints);

        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 38, 6, 0);
        jPanel2.add(btnImport, gridBagConstraints);

        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 37);
        jPanel2.add(btnExport, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("EDITOR CATATAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 77, 6);
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Judul");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(8, 6, 16, 29);
        jPanel3.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 6, 16, 6);
        jPanel3.add(textFieldTitle, gridBagConstraints);

        jLabel5.setText("Catatan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 11, 29);
        jPanel3.add(jLabel5, gridBagConstraints);

        jScrollPane2.setMinimumSize(new java.awt.Dimension(226, 86));

        textAreaInput.setColumns(20);
        textAreaInput.setRows(5);
        jScrollPane2.setViewportView(textAreaInput);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 11, 6);
        jPanel3.add(jScrollPane2, gridBagConstraints);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(11, 16, 11, 6);
        jPanel3.add(btnAdd, gridBagConstraints);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 11, 13);
        jPanel3.add(btnUpdate, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("ISI CATATAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        jPanel4.add(jLabel6, gridBagConstraints);

        jScrollPane3.setMinimumSize(new java.awt.Dimension(450, 130));
        jScrollPane3.setOpaque(false);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(450, 130));

        textAreaDisplay.setColumns(20);
        textAreaDisplay.setRows(5);
        textAreaDisplay.setDragEnabled(true);
        textAreaDisplay.setFocusable(false);
        jScrollPane3.setViewportView(textAreaDisplay);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        jPanel4.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jPanel4, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 // Fungsi untuk menghubungkan ke database SQLite
    private Connection connect() {
        String url = "jdbc:sqlite:daily_notes.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    // Fungsi untuk memuat daftar catatan ke dalam JList
    private void loadNotes() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        
        try (Connection conn = connect()) {
            String sql = "SELECT id, title, date FROM notes";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String date = rs.getString("date");
                listModel.addElement(id + " - " + title + " (" + date + ")");
            }
            
            listNotes.setModel(listModel);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Fungsi untuk memuat detail catatan berdasarkan ID
    private void loadNoteDetails(int id) {
        try (Connection conn = connect()) {
            String sql = "SELECT content FROM notes WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                String content = rs.getString("content");
                textAreaDisplay.setText(content);  // Menampilkan isi catatan
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Fungsi untuk menambah atau mengedit catatan
    private void saveNote() {
        String title = textFieldTitle.getText();
        String content = textAreaInput.getText();
        String currentDate = LocalDate.now().toString();
        
        if (title.isEmpty() || content.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Judul dan isi catatan tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try (Connection conn = connect()) {
            String sql;
            if (listNotes.getSelectedValue() == null) {
                // Menambahkan catatan baru
                sql = "INSERT INTO notes (title, content, date) VALUES (?, ?, ?)";
            } else {
                // Mengedit catatan yang dipilih
                int id = Integer.parseInt(listNotes.getSelectedValue().split(" - ")[0]);
                sql = "UPDATE notes SET title = ?, content = ?, date = ? WHERE id = ?";
                
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, title);
                pstmt.setString(2, content);
                pstmt.setString(3, currentDate);
                pstmt.setInt(4, id);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Catatan berhasil diperbarui!");
                return;
            }

            // Eksekusi SQL untuk insert catatan baru
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setString(3, currentDate);
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Catatan berhasil disimpan!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Fungsi untuk menghapus catatan
    private void deleteNote() {
        String selected = listNotes.getSelectedValue();
        if (selected != null) {
            int id = Integer.parseInt(selected.split(" - ")[0]);
            try (Connection conn = connect()) {
                String sql = "DELETE FROM notes WHERE id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Catatan berhasil dihapus!");
                loadNotes();  // Update daftar setelah dihapus
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Fungsi untuk mencari catatan berdasarkan tanggal
    private void searchByDate(String searchDate) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        
        try (Connection conn = connect()) {
            String sql = "SELECT id, title, date FROM notes WHERE date = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, searchDate);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String date = rs.getString("date");
                listModel.addElement(id + " - " + title + " (" + date + ")");
            }
            
            listNotes.setModel(listModel);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void exportToCSV() {
    String filePath = "catatan.csv"; // Nama file langsung
    try (Connection conn = connect();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT id, title, content, date FROM notes")) {

        // Membuka file untuk menulis
        try (PrintWriter writer = new PrintWriter(new File(filePath))) {
            // Menulis header kolom
            writer.println("id,title,content,date");

            // Menulis data baris per baris
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                String date = rs.getString("date");

                // Menulis ke file CSV dalam format: id,title,content,date
                writer.printf("%d,\"%s\",\"%s\",\"%s\"\n", id, title, content.replace("\"", "\"\""), date);
            }
        }

        JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke " + filePath);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengekspor data.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void importFromCSV() {
    String filePath = "catatan.csv"; // Nama file langsung
    try (Connection conn = connect()) {
        // Membaca file CSV
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;

            // Lewati baris header
            if ((line = br.readLine()) != null) {
                System.out.println("Header ditemukan: " + line);
            }

            // Persiapkan statement SQL untuk memasukkan data
            String sql = "INSERT INTO notes (id, title, content, date) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Membaca setiap baris data
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",", -1); // Memisahkan berdasarkan koma
                int id = Integer.parseInt(values[0]);
                String title = values[1].replace("\"", "");
                String content = values[2].replace("\"", "");
                String date = values[3];

                // Menambahkan data ke statement
                pstmt.setInt(1, id);
                pstmt.setString(2, title);
                pstmt.setString(3, content);
                pstmt.setString(4, date);
                pstmt.executeUpdate();
                count++;
            }

            JOptionPane.showMessageDialog(this, count + " catatan berhasil diimpor dari " + filePath);
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengimpor data.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    deleteNote();        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void listNotesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listNotesValueChanged
       listNotes.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selected = listNotes.getSelectedValue();
                if (selected != null) {
                    int id = Integer.parseInt(selected.split(" - ")[0]);
                    loadNoteDetails(id);
                }
            }
        });  // TODO add your handling code here:
    }//GEN-LAST:event_listNotesValueChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    saveNote(); 
    loadNotes();// TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    saveNote();  
    loadNotes();// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void calendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarPropertyChange
    // Event listener untuk JCalendar
        calendar.addPropertyChangeListener("date", e -> {
            LocalDate selectedDate = calendar.getDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            searchByDate(selectedDate.toString());  // Pencarian berdasarkan tanggal yang dipilih di JCalendar
        });        // TODO add your handling code here:
    }//GEN-LAST:event_calendarPropertyChange

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
     importFromCSV();
     loadNotes();// TODO add your handling code here:
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
     exportToCSV();   // TODO add your handling code here:
    }//GEN-LAST:event_btnExportActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiCatatanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiCatatanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiCatatanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiCatatanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiCatatanHarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listNotes;
    private javax.swing.JScrollPane scrollPaneNotes;
    private javax.swing.JTextArea textAreaDisplay;
    private javax.swing.JTextArea textAreaInput;
    private javax.swing.JTextField textFieldTitle;
    // End of variables declaration//GEN-END:variables
}
