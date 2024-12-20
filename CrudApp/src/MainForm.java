
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jakos
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        b5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Property ID", "Property Address", "Property Type", "Tenant Name", "Tenant Phone Number", "Rental Start Date", "Rental End Date", "Payment Status", "Monthly Rent", "Payment Amount", "Last Payment  Date", "Property Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab1);

        jLabel1.setText("Property ID:");

        jLabel2.setText("Property Address:");

        jLabel3.setText("Property Type:");

        jLabel4.setText("Tenant Name:");

        jLabel5.setText("Tenant Phone Number:");

        jLabel6.setText("Rental Start Date:");

        jLabel7.setText("Rental End Date:");

        jLabel8.setText("Payment Status:");

        jLabel9.setText("Monthly Rent:");

        jLabel10.setText("Payment Amount:");

        jLabel11.setText("Last Payment Date:");

        jLabel12.setText("Property Status:");

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });

        b1.setText("Save");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("Update");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("Delete");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("Search");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel13.setText("House Rental Management System");

        b5.setText("Exit");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(b1)
                                .addGap(18, 18, 18)
                                .addComponent(b2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(t3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(t5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t10, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(t11)
                                    .addComponent(t12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(b4)
                    .addComponent(b5))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    Connection conn = DBconnection.getConnection();
if (conn != null) {
    try {
        // Validate input fields
        String propertyAddress = t2.getText().trim();
        String propertyType = t3.getText().trim();
        String tenantName = t4.getText().trim();
        String tenantPhoneNumber = t5.getText().trim();
        String rentalStartDate = t6.getText().trim();
        String rentalEndDate = t7.getText().trim();
        String paymentStatus = t8.getText().trim();
        String monthlyRent = t9.getText().trim();
        String paymentAmount = t10.getText().trim();
        String lastPaymentDate = t11.getText().trim();
        String propertyStatus = t12.getText().trim();

        // Input validation
        if (propertyAddress.isEmpty() || propertyType.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Both Property Address and Property Type are required.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (tenantName.isEmpty() || tenantPhoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tenant Name and Phone Number are required.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (rentalStartDate.isEmpty() || rentalEndDate.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rental Start Date and End Date are required.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prepare SQL query to insert all fields
        String sql = "INSERT INTO rental_properties (property_address, property_type, tenant_name, tenant_phone, rental_start_date, rental_end_date, payment_status, monthly_rent, payment_amount, last_payment_date, property_status) "
                     + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // Set the parameters for the query
        pstmt.setString(1, propertyAddress);
        pstmt.setString(2, propertyType);
        pstmt.setString(3, tenantName);
        pstmt.setString(4, tenantPhoneNumber);

        // Convert rentalStartDate and rentalEndDate to SQL Date
        pstmt.setDate(5, Date.valueOf(rentalStartDate)); // Assumes format yyyy-MM-dd
        pstmt.setDate(6, Date.valueOf(rentalEndDate));   // Assumes format yyyy-MM-dd

        pstmt.setString(7, paymentStatus);
        pstmt.setDouble(8, Double.parseDouble(monthlyRent)); // Assuming monthlyRent is a numeric field
        pstmt.setDouble(9, Double.parseDouble(paymentAmount)); // Assuming paymentAmount is a numeric field

        // Convert lastPaymentDate to SQL Date
        pstmt.setDate(10, Date.valueOf(lastPaymentDate));  // Assumes format yyyy-MM-dd
        pstmt.setString(11, propertyStatus);

        // Execute the insert statement
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "A new property was inserted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert the property.", "Insertion Failed", JOptionPane.WARNING_MESSAGE);
        }

        pstmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, "Invalid date format. Please use yyyy-MM-dd format.", "Date Format Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        DBconnection.closeConnection(conn);
    }
} else {
    JOptionPane.showMessageDialog(null, "Failed to connect to the database.", "Connection Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
  Connection conn = DBconnection.getConnection();
        
        if (conn != null) {
            try {
                // Step 2: Create the SQL update statement
                String sql = "UPDATE rental_properties SET property_address = ?, property_type = ?, tenant_name = ?, tenant_phone = ?, rental_start_date = ?, rental_end_date = ?, payment_status = ?, monthly_rent = ?, payment_amount = ?, last_payment_date = ?, property_status = ? WHERE property_id = ?";
                
                // Step 3: Create a PreparedStatement to execute the update
                PreparedStatement pstmt = conn.prepareStatement(sql);
                
                // Step 4: Set the parameters for the PreparedStatement
              
                pstmt.setString(1, t2.getText());  // Set the new Property Address
                pstmt.setString(2, t3.getText());     // Set the new Property Type
                pstmt.setString(3, t4.getText());       // Set the new Tenant Name
                pstmt.setString(4, t5.getText());      // Set the new Tenant Phone
                pstmt.setString(5, t6.getText());  // Set the new Rental Start Date
                pstmt.setString(6, t7.getText());    // Set the new Rental End Date
                pstmt.setString(7, t8.getText());    // Set the new Payment Status
                pstmt.setString(8, t9.getText());      // Set the new Monthly Rent
                pstmt.setString(9, t10.getText());    // Set the new Payment Amount
                pstmt.setString(10, t11.getText()); // Set the new Last Payment Date
                pstmt.setString(11, t12.getText());  // Set the new Property Status
                pstmt.setInt(12, Integer.parseInt(t1.getText())); // Set the Property ID to locate the record
                
                // Step 5: Execute the update query
                int rowsUpdated = pstmt.executeUpdate();
                
                if (rowsUpdated > 0) {
                    System.out.println("The property details were updated successfully!");
                } else {
                    System.out.println("No record found with the specified Property ID.");
                }
                
                // Step 6: Close the PreparedStatement
                pstmt.close();
                
            } catch (SQLException e) {
                System.out.println("SQL Error: " + e.getMessage());
            } finally {
                // Step 7: Close the database connection
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    System.out.println("Error closing connection: " + e.getMessage());
                }
            }
        } else {
            System.out.println("Failed to connect to the database.");
        }
    



    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        Connection conn = DBconnection.getConnection();
        if (conn != null) {
            try {
                // Prepare SQL query with WHERE clause to delete based on tenant_name and tenant_phone
                String sql = "DELETE FROM rental_properties WHERE property_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                // Set the parameters for tenant_name and tenant_phone
              pstmt.setInt(1, Integer.parseInt(t1.getText()));
              

                // Execute the DELETE query
                int rowsDeleted = pstmt.executeUpdate();
                if (rowsDeleted > 0) {
                    // Success: Property deleted
                    JOptionPane.showMessageDialog(null, "A property was deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Error: No record found with the specified tenant_name and tenant_phone
                    JOptionPane.showMessageDialog(null, "No record found with the specified tenant_name and tenant_phone.", "Error", JOptionPane.WARNING_MESSAGE);
                }

                // Close PreparedStatement
                pstmt.close();
            } catch (SQLException e) {
                // SQL error handling
                JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                // Close the connection
                DBconnection.closeConnection(conn);
            }
        } else {
            // Connection error
            JOptionPane.showMessageDialog(null, "Failed to connect to the database.", "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
      Connection conn = DBconnection.getConnection();
        if (conn != null){
            try {
                String sql;
                PreparedStatement pstmt ;

             if (t1.getText().trim().isEmpty()) {
                 sql = "SELECT * FROM rental_properties";
                 pstmt = conn.prepareStatement(sql);
             } else {
                     sql = "SELECT * FROM rental_properties WHERE property_id = ?";
                       pstmt = conn.prepareStatement(sql);
                     pstmt.setInt(1, Integer.parseInt(t1.getText()));
                     } 
             ResultSet rs = pstmt.executeQuery();
             
             DefaultTableModel model = (DefaultTableModel) tab1.getModel();
             model.setRowCount(0);
             while(rs.next ()){
                 int t1 = rs.getInt("property_id");               
                 String t2 = rs.getString("property_address");                   
                 String t3 = rs.getString("property_type");
                 String t4 = rs.getString("tenant_name");
                 String t5 = rs.getString("tenant_phone");
                 String t6 = rs.getString("rental_start_date");
                 String t7 = rs.getString("rental_end_date");
                 String t8 = rs.getString("monthly_rent");
                 String t9 = rs.getString("payment_status");
                 String t10 = rs.getString("last_payment_date");
                 String t11 = rs.getString("payment_amount");
                 String t12 = rs.getString("property_status");
                    model.addRow(new Object[]{t1, t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12});
                    
             }
               rs.close();
               pstmt.close();

                      
            } catch (SQLException e) {
                System.out.println("SQL Error:" + e.getMessage());
            } finally{
                DBconnection.closeConnection(conn);

            }

        }    

    }//GEN-LAST:event_b4ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t11ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_b5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JTable tab1;
    // End of variables declaration//GEN-END:variables
}
