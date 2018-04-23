package parsecsei;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class LoginForm extends javax.swing.JFrame {
    
    private APIConnect api;
    private SurveyForm survey;
    private HashMap<String, char[]> users;
    private HashMap<String, Course> courses;
    private String userName = "";

    /**
     * Creates new form LoginInterface
     */
    public LoginForm() {
        initComponents();
        cardPanel.add(loginPanel);
        cardPanel.add(coursePanel);
        invalidLabel.setVisible(false);
        selectionLabel.setVisible(false);
        
        api = new APIConnect();
        survey = new SurveyForm();
        users = api.retrieveLogin();
        courses = new HashMap<>();
        
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logo.png"));
        } catch (IOException e) {
            System.err.println("[System] Image Not Found");
        }
        Image dimg = img.getScaledInstance(logoImage.getWidth(), logoImage.getHeight(),
            Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        logoImage.setIcon(imageIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        invalidLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        logoImage = new javax.swing.JLabel();
        coursePanel = new javax.swing.JPanel();
        courseTitle = new javax.swing.JLabel();
        activeUser = new javax.swing.JLabel();
        courseScrollPane = new javax.swing.JScrollPane();
        courseList = new javax.swing.JList<>();
        courseBtn = new javax.swing.JButton();
        selectionLabel = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();

        loginTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        loginTitle.setText("College of Monongalia County SEI");

        userLabel.setText("Username:");

        passLabel.setText("Password:");

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        invalidLabel.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        invalidLabel.setText("Error: Invalid Login Credentials");

        logoImage.setText("[College Logo]");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userLabel)
                            .addComponent(passLabel))
                        .addGap(18, 18, 18)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userText)
                            .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(loginTitle))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(invalidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(logoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(loginTitle)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(invalidLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoImage, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        courseTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        courseTitle.setText("Course Selection");
        courseTitle.setLocation(new java.awt.Point(0, -32740));

        activeUser.setText("Active User:");

        courseList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        courseList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        courseScrollPane.setViewportView(courseList);

        courseBtn.setText("Select Course");
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });

        selectionLabel.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        selectionLabel.setText("Error: No Course Selected");

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(activeUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(courseBtn)
                .addGap(15, 15, 15))
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coursePanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(courseTitle))
                    .addGroup(coursePanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectionLabel)
                            .addComponent(courseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(courseTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(courseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseBtn)
                    .addComponent(activeUser))
                .addGap(18, 18, 18))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEI Login");
        setResizable(false);

        cardPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        if (this.verifyLogin()) {
            User user = api.retrieveUser(userText.getText());
            userName = user.getName();
            activeUser.setText(activeUser.getText() + " " + userName);
            api.retrieveCourses(user.getCRNList()).forEach((course) -> {
                courses.put(course.getName(), course);
            });
            this.displayCourses();
            if (user.getPosition() == User.Position.STUDENT)
                cardLayout.next(cardPanel);
            else throw new RuntimeException("Not Student");
        } else invalidLabel.setVisible(true);
        passField.setText("");
    }//GEN-LAST:event_loginBtnActionPerformed

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBtnActionPerformed
        if (courseList.isSelectionEmpty())
            selectionLabel.setVisible(true);
        else if (courseList.getSelectedValue().split("'")[1].equals("red")) { // Closed
            selectionLabel.setText("Error: Course Closed");
            selectionLabel.setVisible(true);
        }
        else {
            this.setVisible(false);
            String selectedCourse = courseList.getSelectedValue().split(">")[3];
            selectedCourse = selectedCourse.split("<")[0];
            String instructorName = courses.get(selectedCourse).getInstructor();
            survey.setCourse(selectedCourse, userName, instructorName);
            survey.setVisible(true);
        }
    }//GEN-LAST:event_courseBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activeUser;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JButton courseBtn;
    private javax.swing.JList<String> courseList;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JScrollPane courseScrollPane;
    private javax.swing.JLabel courseTitle;
    private javax.swing.JLabel invalidLabel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel logoImage;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel selectionLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables

    private boolean verifyLogin() {
        String username = userText.getText();
        return users.containsKey(username) && 
                Arrays.equals(users.get(username), passField.getPassword());
    }
    
    private void displayCourses() {
        DefaultListModel<String> model = new DefaultListModel<>();
        courses.values().forEach((course) -> {
            String status = course.getDateTime().isOpen() ? "[Open]" : "[Closed]";
            String color = course.getDateTime().isOpen() ? "green" : "red";
            model.addElement("<html><font color='" + color + "'>" + 
                    status + " </font>" + course.getName() + "</html>");
        });
        courseList.setModel(model);
    }
}
