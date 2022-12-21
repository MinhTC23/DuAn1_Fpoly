/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HoaDon;
import service.HoaDonChiTietLuongbanHangService;
import service.HoaDonService;
import service.impl.HoaDonChiTietLuongbanHangServiceIplm;
import service.impl.HoaDonServiceImpl;
import static view.FormBanHang.maHD;
import viewModel.HoaDonChiTietBanHangViewModel;
import viewModel.HoaDonChiTietLuongbanHangViewModel;

/**
 *
 * @author ADMIN
 */
public class HoaDonn extends javax.swing.JPanel {

    private final HoaDonService hoaDonService = new HoaDonServiceImpl();
    private final HoaDonChiTietLuongbanHangService hoaDonChiTietLuongBanHangServices = new HoaDonChiTietLuongbanHangServiceIplm();
    private DefaultTableModel dtmgioHang;

    public HoaDonn() {
        initComponents();
        loadHD(hoaDonService.getHistoryHD());
        cbNgayTao.getSettings().setAllowKeyboardEditing(false);
        cbDenNgay.getSettings().setAllowKeyboardEditing(false);
        //locRadio(hoaDonService.getDaThanhToan());
        //loadHD(hoaDonService.getList());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rdoDaThanhToan = new javax.swing.JRadioButton();
        rdoChuaThanhToan = new javax.swing.JRadioButton();
        cbNgayTao = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        cbDenNgay = new com.github.lgooddatepicker.components.DatePicker();
        rdoTatCa = new javax.swing.JRadioButton();
        btnTimKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonHang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAllHoaDonHomNay = new javax.swing.JButton();
        cbLocNgayHomNay = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblImeiKT = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txtSDT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(158, 195, 192));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(158, 195, 192));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HÓA ĐƠN");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Trạng Thái");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Từ ngày");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(rdoDaThanhToan);
        rdoDaThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        rdoDaThanhToan.setText("Đã Thanh Toán");
        rdoDaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDaThanhToanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoChuaThanhToan);
        rdoChuaThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        rdoChuaThanhToan.setText("Chưa Thanh Toán");
        rdoChuaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChuaThanhToanActionPerformed(evt);
            }
        });

        jLabel4.setText("Đến ngày");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(rdoTatCa);
        rdoTatCa.setSelected(true);
        rdoTatCa.setText("Tất cả");
        rdoTatCa.setForeground(new java.awt.Color(255, 255, 255));
        rdoTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTatCaActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tblDonHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số Lượng", "Giá Bán", "Mức Giảm Giá", "SL Imei", "Tổng Tiền"
            }
        ));
        tblDonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDonHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDonHang);
        if (tblDonHang.getColumnModel().getColumnCount() > 0) {
            tblDonHang.getColumnModel().getColumn(1).setHeaderValue("Tên SP");
            tblDonHang.getColumnModel().getColumn(2).setHeaderValue("Số Lượng");
            tblDonHang.getColumnModel().getColumn(3).setHeaderValue("Giá Bán");
            tblDonHang.getColumnModel().getColumn(4).setHeaderValue("Mức Giảm Giá");
            tblDonHang.getColumnModel().getColumn(5).setHeaderValue("SL Imei");
            tblDonHang.getColumnModel().getColumn(6).setHeaderValue("Tổng Tiền");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HĐ", "Mã NV", "Ngày tạo", "Số lượng", "Ngày thanh toán", "Phương thức thanh toán", "Tên KH", "Tổng tiển", "Trạng thái"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kiểm Tra Hóa Đơn Hôm Nay", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btnAllHoaDonHomNay.setText("Hóa Đơn Hôm Nay");
        btnAllHoaDonHomNay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllHoaDonHomNayActionPerformed(evt);
            }
        });

        cbLocNgayHomNay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa Thanh Toán", "Đã Thanh Toán", "Đang Giao", "Đã Giao", "Đã Đổi", "Chờ Lấy Hàng", "Chưa Đổi" }));
        cbLocNgayHomNay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLocNgayHomNayItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAllHoaDonHomNay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbLocNgayHomNay, 0, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAllHoaDonHomNay)
                    .addComponent(cbLocNgayHomNay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imei sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel5.setName(""); // NOI18N
        jPanel5.setToolTipText("");

        tblImeiKT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Imei"
            }
        ));
        jScrollPane3.setViewportView(tblImeiKT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm hóa đơn theo SĐT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(rdoDaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(rdoChuaThanhToan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(cbNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cbDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoTatCa)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiem)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdoDaThanhToan)
                                .addComponent(rdoChuaThanhToan)
                                .addComponent(rdoTatCa))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnTimKiem)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdoDaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDaThanhToanActionPerformed
        locRadio(hoaDonService.getDaThanhToan());
    }//GEN-LAST:event_rdoDaThanhToanActionPerformed

    private void rdoChuaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChuaThanhToanActionPerformed
        locRadioCTT(hoaDonService.getChuaThanhToan());
    }//GEN-LAST:event_rdoChuaThanhToanActionPerformed

    private void rdoTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTatCaActionPerformed
        loadHD(hoaDonService.getHistoryHD());
    }//GEN-LAST:event_rdoTatCaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        if (cbNgayTao.getDate() == null || cbDenNgay.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Chưa chọn ngày");
            return;
        } else if (cbNgayTao.getDate().compareTo(cbDenNgay.getDate()) > 0) {
            JOptionPane.showMessageDialog(this, "Ngày cuối không thể bé hơn ngày đầu");
            return;
        } else {
            Date ngayTao = java.sql.Date.valueOf(cbNgayTao.getDate());
            Date denNgay = java.sql.Date.valueOf(cbDenNgay.getDate());
            loadHD(hoaDonService.locNgay(ngayTao, denNgay));
        }

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        // TODO add your handling code here:
        maHD = tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 0).toString();
        loadSanPham(hoaDonChiTietLuongBanHangServices.getAllHDCT(maHD));
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void btnAllHoaDonHomNayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllHoaDonHomNayActionPerformed
        // TODO add your handling code here:
        loadHD(hoaDonService.getAllHoaDonHomNay());
        //loadSanPham(hoaDonService.getAllHDCTHoaDonHomNay());
    }//GEN-LAST:event_btnAllHoaDonHomNayActionPerformed

    private void cbLocNgayHomNayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLocNgayHomNayItemStateChanged
        // TODO add your handling code here:

        loadHD(hoaDonService.getAllHoaDonHomNayLocCB(cbLocNgayHomNay.getSelectedIndex()));

    }//GEN-LAST:event_cbLocNgayHomNayItemStateChanged

    private void loadTableListImeiBanHang(ArrayList<HoaDonChiTietLuongbanHangViewModel> list) {
        DefaultTableModel model = (DefaultTableModel) tblImeiKT.getModel();
        model.setRowCount(0);
        for (HoaDonChiTietLuongbanHangViewModel x : list) {
            model.addRow(new Object[]{x.getMaImei(), x.getMaSanPham(), x.getTenSanPham()});
        }
    }

    private void tblDonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonHangMouseClicked
        // TODO add your handling code here:
        String maSP = tblDonHang.getValueAt(tblDonHang.getSelectedRow(), 0).toString();
        loadTableListImeiBanHang(hoaDonChiTietLuongBanHangServices.getAllListImeiKTHDCTJDialog(maSP, maHD));
    }//GEN-LAST:event_tblDonHangMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pater = "([0-9]{10,11})";
        if (txtSDT.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống số điện thoại");
            return;
        }
        else if(!txtSDT.getText().trim().matches(pater)){
            JOptionPane.showMessageDialog(this, "Sai định dạng số điện thoại");
            return;
        }else {
            loadHD(hoaDonService.getHoaDonSDT(txtSDT.getText()));
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void loadSanPham(ArrayList<HoaDonChiTietLuongbanHangViewModel> list) {// load sản pham của hóa đơn - Hiếu
        //   BigDecimal sum = new BigDecimal(0);
        dtmgioHang = (DefaultTableModel) tblDonHang.getModel();
        dtmgioHang.setRowCount(0);
        for (HoaDonChiTietLuongbanHangViewModel chiTietHoaDon : list) {
//            BigDecimal tong = chiTietHoaDon.getDonGia().multiply(BigDecimal.valueOf(chiTietHoaDon.getSoLuong()));
            BigDecimal tong = chiTietHoaDon.getTongTien();
            dtmgioHang.addRow(new Object[]{
                chiTietHoaDon.getMaSanPham(),
                chiTietHoaDon.getTenSanPham(),
                chiTietHoaDon.getSoLuongSanPham(),
                chiTietHoaDon.getDonGia(),
                chiTietHoaDon.getMucGiamGia(),
                chiTietHoaDon.getSoLuongImeiSanPhamKT(),
                //chiTietHoaDon.getDoiTra() == 10 ? true : false,
                chiTietHoaDon.getTongTien(),});
//            sum = sum.add(tong);
        }
    }

    private void loadHD(ArrayList<HoaDon> list) {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        for (HoaDon hoaDonn : list) {
            model.addRow(new Object[]{
                hoaDonn.getMaHD(),
                hoaDonn.getMaNV(),
                hoaDonn.getNgayTao(),
                hoaDonn.getSoLuong(),
                hoaDonn.getNgayThanhToan(),
                hoaDonn.getTenHTTT(),
                hoaDonn.getTenKH(),
                hoaDonn.getTongTien(),
                hoaDonn.TrangThai2()
            });
        }
    }

    private void locRadio(ArrayList<HoaDon> list) {
        rdoChuaThanhToan.isSelected();
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        for (HoaDon hoaDonn : list) {
            model.addRow(new Object[]{
                hoaDonn.getMaHD(),
                hoaDonn.getMaNV(),
                hoaDonn.getNgayTao(),
                hoaDonn.getSoLuong(),
                hoaDonn.getNgayThanhToan(),
                hoaDonn.getTenHTTT(),
                hoaDonn.getTenKH(),
                hoaDonn.getTongTien(),
                hoaDonn.TrangThai2()
            });
        }

    }

    private void locRadioCTT(ArrayList<HoaDon> list) {
        rdoChuaThanhToan.setSelected(true);
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        for (HoaDon hoaDonn : list) {
            model.addRow(new Object[]{
                hoaDonn.getMaHD(),
                hoaDonn.getMaNV(),
                hoaDonn.getNgayTao(),
                hoaDonn.getSoLuong(),
                hoaDonn.getNgayThanhToan(),
                hoaDonn.getTenHTTT(),
                hoaDonn.getTenKH(),
                hoaDonn.getTongTien(),
                hoaDonn.TrangThai2()
            });
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllHoaDonHomNay;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.github.lgooddatepicker.components.DatePicker cbDenNgay;
    private javax.swing.JComboBox<String> cbLocNgayHomNay;
    private com.github.lgooddatepicker.components.DatePicker cbNgayTao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdoChuaThanhToan;
    private javax.swing.JRadioButton rdoDaThanhToan;
    private javax.swing.JRadioButton rdoTatCa;
    private javax.swing.JTable tblDonHang;
    public javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblImeiKT;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
