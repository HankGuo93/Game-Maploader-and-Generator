/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapGen;

import mapGen.utils.Input;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author goust
 */
public class MapGenGUI extends javax.swing.JFrame {

    private class MapPairButton extends JButton {

        public Color color() {
            return color;
        }

        public String path() {
            return path;
        }

        public int iconW() {
            return iconW;
        }

        public int iconH() {
            return iconH;
        }

        public BufferedImage Image() {
            return bi;
        }

        public String name() {
            return name;
        }

        private String name;
        private Color color;
        private String path;
        private int iconW;
        private int iconH;
        private BufferedImage bi;

        public MapPairButton(String name, Color color, String path, int iconW, int iconH) {
            this.name = name;
            this.color = color;
            this.path = path;
            this.iconW = iconW;
            this.iconH = iconH;
            setBufferedImage();
        }

        private void setBufferedImage() {
            try {
                bi = ImageIO.read(new File(path)); // 讀檔案
            } catch (Exception e) {
            }
        }
    }

    public MapGenGUI() {
        initComponents();
        jScrollPane3.getViewport().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (bitmap != null) {
                    editAreaRepaint();
                }
            }
        });
        //設定初始按鈕顏色
        jButton8.setBackground(color);
        paintHeight = itemUnit;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jToolBar1 = new javax.swing.JToolBar();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        jFileChooser3 = new javax.swing.JFileChooser();
        jFileChooser4 = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        jMenu1.setText("jMenu1");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel3);

        jTextField1.setText("30");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("30");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("x");

        jButton3.setText("Import");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Export");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Zoom");

        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField3.setText("Name");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton8.setText("Color");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel3.setText("x");

        jTextField4.setText("1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setText("1");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton9.setText("Set");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel1MouseWheelMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel1);

        jTextField6.setText("32");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel4.setText("Unit: ");

        jLabel5.setText("map size:");

        jButton2.setText("eraser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2)
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(268, 268, 268)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(2, 2, 2)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jButton9)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jButton2)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //地圖寬度
        String tmpStr = Input.filterNumber(jTextField1.getText());
        int tmpi = (tmpStr.length() > 0) ? Integer.parseInt(tmpStr) : 0;
        mapW = (tmpi > 0) ? tmpi : mapW;
        jTextField1.setText(String.format("%d", mapW));
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        paintHeight++;
        //修正列印寬度
        mapParaCaculate();
        
        //修正畫布尺寸
        jPanel1.setPreferredSize(new Dimension((int) (mapW * 1.5) * paintHeight, (int)(mapH*1.5) * paintHeight));
        
        editAreaRepaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//補充取得資訊 避免遺漏
        name = this.jTextField3.getText();

        String str = Input.filterNumber(jTextField4.getText());
        int tmpW = (str.length() > 0) ? Integer.parseInt(str) : 0;
        iconW = (tmpW > 0) ? tmpW : iconW;
        jTextField4.setText(String.format("%d", iconW));

        str = Input.filterNumber(jTextField5.getText());
        int tmpH = (str.length() > 0) ? Integer.parseInt(str) : 0;
        iconH = (tmpH > 0) ? tmpH : iconH;
        jTextField5.setText(String.format("%d", iconH));

        //檢查資訊 黑色為預設位置為空 
        if ((name.length() > 0) && (path.length() > 1) && (iconW >= 1) && iconH >= 1 && color != Color.black) {
            //檢查items是否有重複(名稱、色號、路徑)
            ArrayList<MapPairButton> tmp = items.stream()
                    .filter(mapPair -> mapPair.name().equals(name)
                    || mapPair.path().equals(path)
                    || mapPair.color().equals(color))
                    .collect(Collectors.toCollection(ArrayList::new));
            if (tmp.isEmpty()) { //都沒查找到物件
                //若無則新增到Items內
                MapPairButton jb = new MapPairButton(name, color, path, iconW, iconH);
                jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editJB = jb;
                        System.out.println("Path = " + editJB.path());
                        System.out.println("Color = " + editJB.color());
                        System.out.println("(W,H) = (" + editJB.iconW() + "," + editJB.iconH() + ")");
                        System.out.println("name = " + editJB.name());
                    }
                });
                items.add(jb);
                paintItems(jb);

                //完成新增 重置編輯區
                initMapPairEditor();
                jTextField3.setText(name);
                jButton8.setBackground(color);
                setIcon(null, jButton7);
                jTextField4.setText(String.format("%d", iconW));
                jTextField5.setText(String.format("%d", iconH));

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    public void paintItems(MapPairButton jb) {
        int buttonSize = 80;
        int gap = (jScrollPane1.getWidth() - 18 - buttonSize * 3) / 4;
        int tmpi = items.size() - 1;
        int locationX = gap + (gap + buttonSize) * (tmpi % 3);
        int locationY = gap + (gap + buttonSize) * (tmpi / 3);
        jb.setBounds(locationX, locationY, buttonSize, buttonSize);  //自行決定元件位置與大小
        jb.setBackground(jb.color());
        setIcon(jb.path(), jb);
        if (locationY + (gap + buttonSize) > jPanel3.getHeight()) {
            jPanel3.setPreferredSize(new Dimension(jPanel3.getWidth(), locationY + (gap + buttonSize)));//修正panel高度
        }
        jPanel3.add(jb);
        jPanel3.repaint();
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("BMP,PNG and GIF images", "bmp", "png", "gif", "jpg");
        chooser.addChoosableFileFilter(filter);
        int flag = chooser.showOpenDialog(null);
        if (flag == JFileChooser.APPROVE_OPTION) {
            path = chooser.getSelectedFile().getPath();
            setIcon(path, jButton7);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        String str = Input.filterNumber(jTextField4.getText());
        int tmpW = (str.length() > 0) ? Integer.parseInt(str) : 0;
        iconW = (tmpW > 0) ? tmpW : iconW;
        jTextField4.setText(String.format("%d", iconW));
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        String str = Input.filterNumber(jTextField5.getText());
        int tmpH = (str.length() > 0) ? Integer.parseInt(str) : 0;
        iconH = (tmpH > 0) ? tmpH : iconH;
        jTextField5.setText(String.format("%d", iconH));
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        color = JColorChooser.showDialog(null, "color", Color.black);
        jButton8.setBackground(color);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //再次取得資訊
        //uint更新
        String tmpStr = Input.filterNumber(jTextField6.getText());
        int tmpi = (tmpStr.length() > 0) ? Integer.parseInt(tmpStr) : 0;
        itemUnit = (tmpi > 0) ? tmpi : itemUnit;
        jTextField6.setText(String.format("%d", itemUnit));

        //地圖寬度
        tmpStr = Input.filterNumber(jTextField1.getText());
        tmpi = (tmpStr.length() > 0) ? Integer.parseInt(tmpStr) : 0;
        mapW = (tmpi > 0) ? tmpi : mapW;
        jTextField1.setText(String.format("%d", mapW));
        // BMP 地圖高度
        tmpStr = Input.filterNumber(jTextField2.getText());
        tmpi = (tmpStr.length() > 0) ? Integer.parseInt(tmpStr) : 0;
        mapH = (tmpi > 0) ? tmpi : mapH;
        jTextField2.setText(String.format("%d", mapH));

        bitmap = map(mapW, mapH, Color.black);//若無 則新建(目前點set就全新)
        System.out.println("build bitmap");

        //調整jpanel1的尺寸
        jPanel1.setPreferredSize(new Dimension((int) (mapW * 1.5) * paintHeight, mapH * paintHeight));

        //繪製地圖區
        editAreaRepaint();

    }//GEN-LAST:event_jButton9ActionPerformed
    private void mapParaCaculate() {
        //繪製寬度 上下限
        paintHeight = (paintHeight > (int) (itemUnit * 1.5)) ? (int) (itemUnit * 1.5) : paintHeight;//最多放大到1.5倍
        paintHeight = (paintHeight < 10) ? 10 : paintHeight;

    }

    private void editAreaRepaint() {

        //修正列印寬度
        mapParaCaculate();

        Graphics g = jPanel1.getGraphics();
        g.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());//清除畫面

        for (int i = 0; i < bitmap.getWidth(); i++) {
            for (int j = 0; j < bitmap.getHeight(); j++) {
                int tmpi = bitmap.getRGB(i, j);
                ArrayList<MapPairButton> tmp = items.stream()
                        .filter(mapPair -> mapPair.color().getRGB() == tmpi)
                        .collect(Collectors.toCollection(ArrayList::new));
                if (!tmp.isEmpty()) {
                    //取得配對圖案
                    if (paintHeight < 20) {
                        //畫色塊
                        Color color = new Color(bitmap.getRGB(i, j));
                        BufferedImage c = map(paintHeight, paintHeight, color);
                        g.drawImage(c, i * paintHeight, j * paintHeight, paintHeight, paintHeight, null);
                    } else {
                        g.drawImage(tmp.get(0).Image(), i * paintHeight, j * paintHeight, tmp.get(0).iconW * paintHeight, tmp.get(0).iconH * paintHeight, null);
                    }
                }
            }
        }

        //畫框線
        g.setColor(Color.RED);

        for (int i = 0; i <= bitmap.getWidth(); i++) {
            g.drawLine(i * paintHeight, 0, i * paintHeight, bitmap.getHeight() * paintHeight);
        }
        for (int i = 0; i <= bitmap.getHeight(); i++) {
            g.drawLine(0, i * paintHeight, bitmap.getWidth() * paintHeight, i * paintHeight);
        }
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        name = this.jTextField3.getText();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // BMP 地圖高度
        String tmpStr = Input.filterNumber(jTextField2.getText());
        int tmpi = (tmpStr.length() > 0) ? Integer.parseInt(tmpStr) : 0;
        mapH = (tmpi > 0) ? tmpi : mapH;
        jTextField2.setText(String.format("%d", mapH));
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //選擇資料夾
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = chooser.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            String savePath = file.getAbsolutePath();

            //儲存BMP圖檔
            System.out.println(savePath + "/genMap.bmp");
            savePNG(bitmap, savePath + "/genMap.bmp");

            //儲存txt檔
            File writename = new File(savePath + "/genMap.txt"); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
            try {
                writename.createNewFile(); // 建立新檔案
                BufferedWriter out = new BufferedWriter(new FileWriter(writename));
                String str = "";
                for (int i = 0; i < items.size(); i++) {
                    MapPairButton mpb = items.get(i);
                    str += mpb.name() + ","
                            + mpb.color().getRGB() + ","
                            + mpb.path() + ","
                            + mpb.iconW() + ","
                            + mpb.iconH + "\r\n";
                }
                out.write(str); // \r\n即為換行
                out.flush(); // 把快取區內容壓入檔案
                out.close(); // 最後記得關閉檔案

            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        int x = evt.getX() / paintHeight;
        int y = evt.getY() / paintHeight;

        if (x > bitmap.getWidth()
                || y > bitmap.getHeight()
                || editJB == null) {//畫面外 或尚未選取左側圖案
            return;
        }
        //如果是同一個區塊 不再更新
        if (bitmap.getRGB(x, y) == editJB.color().getRGB()) {
            return;
        }

        for (int i = 0; i < editJB.iconH(); i++) {
            for (int j = 0; j < editJB.iconW(); j++) {
                if (i == 0 && j == 0) {
                    bitmap.setRGB(x + j, y + i, editJB.color().getRGB());
                } else {
                    bitmap.setRGB(x + j, y + i, Color.black.getRGB());
                }
            }
        }

        editAreaRepaint();

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseWheelMoved

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        paintHeight--;
        //修正列印寬度
        mapParaCaculate();
        //修正畫布尺寸
        jPanel1.setPreferredSize(new Dimension((int) (mapW * 1.5) * paintHeight, (int)(mapH*1.5) * paintHeight));
        
        editAreaRepaint();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        String str = Input.filterNumber(jTextField6.getText()); //正則表示式 過濾文字 只留數字
        int tmpi = (str.length() > 0) ? Integer.parseInt(str) : 0;
        itemUnit = (tmpi > 0) ? tmpi : itemUnit;
        jTextField6.setText(String.format("%d", itemUnit));
        
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getX() / paintHeight;
        int y = evt.getY() / paintHeight;

        if (x > bitmap.getWidth()
                || y > bitmap.getHeight()
                || editJB == null) {//畫面外 或尚未選取左側圖案
            return;
        }
        //如果是同一個區塊 不再更新
        if (bitmap.getRGB(x, y) == editJB.color().getRGB()) {
            return;
        }

        for (int i = 0; i < editJB.iconH(); i++) {
            for (int j = 0; j < editJB.iconW(); j++) {
                if (i == 0 && j == 0) {
                    bitmap.setRGB(x + j, y + i, editJB.color().getRGB());
                } else {
                    bitmap.setRGB(x + j, y + i, Color.black.getRGB());
                }
            }
        }
        editAreaRepaint();
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //擦布
        editJB = new MapPairButton("eraser", Color.black, null, 1, 1);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //import txt & bmp (需在同一區塊，且固定檔名，暫不更改成 檔案可選)    
        //讀取資料夾 取得資訊
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = chooser.showOpenDialog(null);
        if (option != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();
        String loadPath = file.getAbsolutePath();

        //讀取檔案
        //bmp
        BufferedImage tmpBmp = null;
        try {
            tmpBmp = ImageIO.read(new File(loadPath + "/genMap.bmp")); // 讀檔案
        } catch (Exception e) {
        }
        if (tmpBmp == null) {
            return;
        }
        System.out.println("BMP:(" + tmpBmp.getWidth() + "x" + tmpBmp.getHeight() + ")");
        //txt
        Scanner s = null;

        ArrayList<String> biItems = new ArrayList<>();
        try {
            s = new Scanner(new BufferedReader(new FileReader(loadPath + "/genMap.txt")));
            // 使用字串換行作為分隔
            s.useDelimiter("\r\n");
            while (s.hasNext()) {
                String tmpS = s.next();
                System.out.print(tmpS);
                biItems.add(tmpS);
            }
        } catch (FileNotFoundException ex) {
        }
        if (biItems.isEmpty()) {//空的文字檔案 則停止載入
            return;
        }

        //清除items  清除畫布
        //左方按鈕
        items.clear();
        jPanel3.removeAll();
        jPanel3.repaint();

        //bmp存入 並重新設定畫布尺寸 並更新
        bitmap = tmpBmp;
        mapW=bitmap.getWidth();
        mapH=bitmap.getHeight();
        editAreaRepaint();

        //重建items(目前僅一顆按鈕 需再確認)
        biItems.forEach((tmpStr) -> {
            String[] para = tmpStr.split(",");
            String tname = para[0];
            Color c = new Color(Integer.parseInt(para[1]));
            String tpath = para[2];
            int tw = Integer.parseInt(Input.filterNumber(para[3]));
            int th = Integer.parseInt(Input.filterNumber(para[4]));
            MapPairButton jb = new MapPairButton(tname, c, tpath, tw, th);//建按鈕
            jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editJB = jb;
                        System.out.println("Path = " + editJB.path());
                        System.out.println("Color = " + editJB.color());
                        System.out.println("(W,H) = (" + editJB.iconW() + "," + editJB.iconH() + ")");
                        System.out.println("name = " + editJB.name());
                    }
                });
            
            items.add(jb);
            paintItems(jb);//重畫最後一筆
        });
        System.out.println("資料重建完成!");

    }//GEN-LAST:event_jButton3ActionPerformed

    //iconButton add image
    public void setIcon(String path, JButton iconButton) {
        ImageIcon icon = new ImageIcon(path);

        icon = new ImageIcon(icon.getImage().getScaledInstance(iconButton.getWidth() - 10,
                iconButton.getHeight() - 10, icon.getImage().SCALE_DEFAULT));//露出邊框塗色用
        iconButton.setHorizontalAlignment(SwingConstants.CENTER);//icon水平置中
        iconButton.setVerticalAlignment(SwingConstants.CENTER);//icon垂直置中
        iconButton.setIcon(icon);//加入圖示
        iconButton.setBorderPainted(false);//不畫出邊界
        iconButton.setBorder(null);
    }

    //區塊塗色用
    private static BufferedImage map(int sizeX, int sizeY, Color c) {
        final BufferedImage res = new BufferedImage(sizeX, sizeY, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                res.setRGB(x, y, c.getRGB());
            }
        }
        return res;
    }

    //存檔
    private static void savePNG(final BufferedImage bi, final String path) {
        try {
            RenderedImage rendImage = bi;
            ImageIO.write(rendImage, "bmp", new File(path));
        } catch (IOException e) {
        }
    }

    //選定編輯區按鈕
    private static MapPairButton editJB;
    //編輯區變數
    private static String name;
    private static Color color;
    private static String path;
    private static int iconW;
    private static int iconH;

    //地圖種類 及 地圖檔 儲存位置 
    private static ArrayList<MapPairButton> items;
    BufferedImage bitmap;

    //items 繪製一格方形的大小
    private static int itemUnit;

    //地圖繪製區 根據格子數量 計算高度用
    private int paintHeight;

    //bitMap尺寸
    private static int mapW;
    private static int mapH;

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
            java.util.logging.Logger.getLogger(MapGenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapGenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapGenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapGenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //default setting
        initMapPairEditor();

        items = new ArrayList<>();

        //預設值
        itemUnit = 32;
        mapW = 30;
        mapH = 30;


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapGenGUI().setVisible(true);
            }
        });

    }

    //重置編輯區參數
    public static void initMapPairEditor() {
        name = "";
        color = Color.black;
        path = "";
        iconW = 1;
        iconH = 1;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFileChooser jFileChooser3;
    private javax.swing.JFileChooser jFileChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToolBar jToolBar1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables

}
