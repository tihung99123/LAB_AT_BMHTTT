package week_02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frm_Menu extends JFrame {

    private final JButton btn_des = new JButton("2.1 DES");
    private final JButton btn_tripledes = new JButton("2.2 TripleDES");
    private final JButton btn_aes = new JButton("2.3 AES + Login");
    private final JButton btn_rc4 = new JButton("2.4 RC4");
    private final JButton btn_twofish = new JButton("2.5 Twofish");
    private final JButton btn_aesctr = new JButton("2.6 Nâng cao - AES-CTR");
    private final JButton btn_sql = new JButton("Kết nối SQL Server");
    private final JButton btn_history = new JButton("Xem lịch sử");
    private final JLabel lbl_status = new JLabel("Bài nâng cao 02 (AES-CBC) viết bằng Python: chạy tệp aes_cbc_gui.py.");

    public frm_Menu() {
        super("LAB 2 - Mã hóa đối xứng hiện đại");
        JPanel fields = new JPanel(new java.awt.GridLayout(0, 1, 8, 6));
        fields.add(new JLabel("LAB 2 - MÃ HÓA ĐỐI XỨNG HIỆN ĐẠI"));
        fields.add(new JLabel("Chọn một bài để mở form tương ứng:"));
        btn_des.addActionListener(e -> btn_desActionPerformed());
        btn_tripledes.addActionListener(e -> btn_tripledesActionPerformed());
        btn_aes.addActionListener(e -> btn_aesActionPerformed());
        btn_rc4.addActionListener(e -> btn_rc4ActionPerformed());
        btn_twofish.addActionListener(e -> btn_twofishActionPerformed());
        btn_aesctr.addActionListener(e -> btn_aesctrActionPerformed());
        btn_sql.addActionListener(e -> btn_sqlActionPerformed());
        btn_history.addActionListener(e -> btn_historyActionPerformed());
        JPanel controls = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        controls.add(btn_des);
        controls.add(btn_tripledes);
        controls.add(btn_aes);
        controls.add(btn_rc4);
        controls.add(btn_twofish);
        controls.add(btn_aesctr);
        controls.add(btn_sql);
        controls.add(btn_history);
        FormSupport.show(this, fields, controls, lbl_status);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void btn_desActionPerformed() {
        new frm_DES().setVisible(true);
    }

    private void btn_tripledesActionPerformed() {
        new frm_TripleDES().setVisible(true);
    }

    private void btn_aesActionPerformed() {
        new frm_AES().setVisible(true);
    }

    private void btn_rc4ActionPerformed() {
        new frm_RC4().setVisible(true);
    }

    private void btn_twofishActionPerformed() {
        new frm_Twofish().setVisible(true);
    }

    private void btn_aesctrActionPerformed() {
        new frm_AES_CTR().setVisible(true);
    }

    private void btn_sqlActionPerformed() {
        new frm_KetNoiSQL().setVisible(true);
    }

    private void btn_historyActionPerformed() {
        new frm_LichSu().setVisible(true);
    }

    public static void main(String[] args) {
        new frm_Menu().setVisible(true);
    }
}