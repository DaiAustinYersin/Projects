/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import JSupport.Validator;
import Object.Employee;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JFrame_LogIn extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_LogIn
     */
    ArrayList<Employee> list = new ArrayList<>();

    public JFrame_LogIn() {
        initComponents();
        setTitle("Log in form");
        setLocationRelativeTo(null);
        setResizable(false);

        khoiTao();
    }

    public void khoiTao() {
        list.add(new Employee("01", "Đỗ Thiện Thế Anh", "Nam", 28, "anhdtt@fpt.edu.vn", 9500000, "Trưởng phòng", "Nhân sự", "Hòa đồng, dễ gần, tuy nhiên cần chăm chỉ và chú tâm hơn trong \ncông việc"));
        list.add(new Employee("02", "Lương Minh Đức", "Nam", 25, "duclm@fpt.edu.vn", 9500000, "Trưởng phòng", "Kỹ thuật - Công nghệ", "Nhanh nhẹn, hào đồng, vui tính, cần cù trong công việc"));
        list.add(new Employee("03", "Nguyễn Ngọc Ánh", "Nữ", 24, "anhnn@fpt.edu.vn", 8000000, "Nhân viên", "Marketing", "Chăm chỉ, thân thiện, chịu học hỏi"));
        list.add(new Employee("04", "Vũ Chí Bằng", "Nam", 25, "bangvc@fpt.edu.vn", 5000000, "Nhân viên", "Kỹ thuật - Công nghệ", "Hòa đồng, dễ gần, tuy nhiên còn hơi nóng tính và cần chăm chỉ \nhơn trong công việc"));
        list.add(new Employee("05", "Nguyễn Thị Thoan", "Nữ", 27, "thoannt@fpt.edu.vn", 7500000, "Nhân viên", "Tài chính - Kế toán", "Thân thiện, hòa đồng, chịu khó trong công việc"));
        list.add(new Employee("06", "Nguyễn Thị Quỳnh Anh", "Nữ", 29, "anhntq@fpt.edu.vn", 9500000, "Trưởng phòng", "Marketing", "Tận tụy với công việc, nhanh nhẹn, hoạt bát, chịu học hỏi"));
        list.add(new Employee("07", "Nguyễn Trí Kiên", "Nam", 26, "kiennt@fpt.edu.vn", 5000000, "Nhân viên", "Nhân sự", "Dễ gần, thân thiện, vui tính, tuy nhiên cần chăm chỉ hơn trong \ncông việc"));
        list.add(new Employee("08", "Trần Văn Quân", "Nam", 28, "quantv@fpt.edu.vn", 9500000, "Trưởng phòng", "Tài chính - Kế toán", "Chăm chỉ, cần cù chịu khó trong công việc tuy nhiên cần \nhòa đồng hơn"));
        list.add(new Employee("09", "Trần Minh Quân", "Nam", 24, "quantm@fpt.edu.vn", 8500000, "Nhân viên", "Kỹ thuật - Công nghệ", "Hoạt bát, nhanh nhẹn, hòa đồng, vui tính, cần chăm chỉ hơn \ntrong công việc"));
        list.add(new Employee("10", "Nguyễn Thị Minh Huyền", "Nữ", 23, "huyenntm@fpt.edu.vn", 9000000, "Nhân viên", "Kỹ thuật - Công nghệ", "Chăm chỉ, tận tụy với công việc, chịu học hỏi tiếp thu, cần \nhòa đồng hơn"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_hoTen = new javax.swing.JTextField();
        txt_MSSV = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btn_signIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Log in");

        jLabel2.setText("Employee ID");

        jLabel3.setText("Fullname");

        jCheckBox1.setText("Remeber me?");

        btn_signIn.setText("Submit");
        btn_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MSSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btn_signIn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_MSSV, txt_hoTen});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_MSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_signIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signInActionPerformed
        String code = txt_MSSV.getText().trim();
        String name = txt_hoTen.getText().trim();
        StringBuilder sb = new StringBuilder();
        try {
            Validator.checkNull(txt_MSSV, "Mã sinh viên không được để trống", sb);
            Validator.checkNull(txt_hoTen, "Tên sinh viên không được để trống",sb);
            
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString(), "Dữ liệu không hợp lệ", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            for (Employee nv : list) {
                if (code.equalsIgnoreCase(nv.getEmployeeID()) && name.equals(nv.getFullName())) {
                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                    new JFrame_EmployeeManagement().setVisible(true);
                    this.dispose();
                    //System.exit(0);
                    return;
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Đăng nhập thất bại");
        } catch (Exception e) {
            System.out.println("Lỗi: " + e);
        }
    }//GEN-LAST:event_btn_signInActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame_LogIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_signIn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_MSSV;
    private javax.swing.JTextField txt_hoTen;
    // End of variables declaration//GEN-END:variables
}
