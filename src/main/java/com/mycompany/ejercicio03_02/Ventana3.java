/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Ventana3 extends JFrame{
    private JPanel jPanel3;
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JComboBox> jComboBoxList;
    private JButton jButton;

    
    public Ventana3(String title) throws HeadlessException {
        super(title);
        this.setSize(500,600);
        this.setLocation(600, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel3);
    }
    
     public void iniciarComponentes(){
        this.jPanel3=new JPanel();
        this.jPanel3.setBackground(Color.WHITE);
        this.jPanel3.setLayout(new GridLayout(7,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarCombo();
        this.iniciarBoton();
     }
     
     public void iniciarPaneles(){
         this.jPanelList=new ArrayList<>();
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         
         this.jPanelList.get(0).setBackground(Color.WHITE);
         this.jPanelList.get(1).setBackground(Color.WHITE);
         this.jPanelList.get(2).setBackground(Color.WHITE);
         this.jPanelList.get(3).setBackground(Color.WHITE);
         this.jPanelList.get(4).setBackground(Color.WHITE);
         this.jPanelList.get(5).setBackground(Color.WHITE);
         this.jPanelList.get(6).setBackground(Color.WHITE);
         this.jPanelList.get(7).setBackground(Color.WHITE);
         
         this.jPanel3.add(this.jPanelList.get(0));
         this.jPanel3.add(this.jPanelList.get(1));
         this.jPanel3.add(this.jPanelList.get(2));
         this.jPanel3.add(this.jPanelList.get(3));
         this.jPanel3.add(this.jPanelList.get(4));
         this.jPanel3.add(this.jPanelList.get(5));
         this.jPanel3.add(this.jPanelList.get(6)); 
         //this.jPanel3.add(this.jPanelList.get(7));
     }
     
     public void iniciarEtiquetas(){
         this.jLabelList= new ArrayList<>();
         this.jLabelList.add(new JLabel("Periodo Académico: "));
         this.jLabelList.add(new JLabel("             2022-2022 "));
         this.jLabelList.add(new JLabel("Carrera:* "));
         this.jLabelList.add(new JLabel("Modalidad:* "));
         this.jLabelList.add(new JLabel("Sede:* "));
         this.jLabelList.add(new JLabel("Campus:* "));
         this.jLabelList.add(new JLabel("Jornada:* "));
         this.jLabelList.add(new JLabel("Fecha de Registro: "));
         this.jLabelList.add(new JLabel("            20/05/2022 "));         
         
         this.jPanelList.get(0).add(this.jLabelList.get(0));
         this.jPanelList.get(0).add(this.jLabelList.get(1));
         this.jPanelList.get(1).add(this.jLabelList.get(2));
         this.jPanelList.get(2).add(this.jLabelList.get(3));
         this.jPanelList.get(3).add(this.jLabelList.get(4));
         this.jPanelList.get(4).add(this.jLabelList.get(5));
         this.jPanelList.get(5).add(this.jLabelList.get(6));
         this.jPanelList.get(6).add(this.jLabelList.get(7));
         this.jPanelList.get(6).add(this.jLabelList.get(8));
     }
     
     public void iniciarCombo(){
         this.jComboBoxList= new ArrayList<>();
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
         this.jComboBoxList.add(new JComboBox());
        
         this.jComboBoxList.get(0).addItem("Seleccione una opción");
         this.jComboBoxList.get(0).addItem("ARQUITECTURA");
         this.jComboBoxList.get(0).addItem("INGENIERIA ELECTRONICA Y AUTOMATIZACION");
         this.jComboBoxList.get(0).addItem("INGENIERIA EN TELECOMUNICACIONES");
         this.jComboBoxList.get(1).addItem("Seleccione una opción");
         this.jComboBoxList.get(1).addItem("PRESENCIAL");
         this.jComboBoxList.get(1).addItem("SEMIPRESENCIAL");
         this.jComboBoxList.get(2).addItem("Seleccione una opción");
         this.jComboBoxList.get(2).addItem("MATRIZ CUENCA");
         this.jComboBoxList.get(2).addItem("MATRIZ GUAYAQUIL");
         this.jComboBoxList.get(2).addItem("MATRIZ QUITO");
         this.jComboBoxList.get(3).addItem("EL VECINO");
         this.jComboBoxList.get(4).addItem("Seleccione una opción");
         this.jComboBoxList.get(4).addItem("DIURNO");
         this.jComboBoxList.get(4).addItem("DESPERTINO");
         this.jComboBoxList.get(4).addItem("NOCTURNO");
        
        this.jPanelList.get(1).add(this.jComboBoxList.get(0));
        this.jPanelList.get(2).add(this.jComboBoxList.get(1)); 
        this.jPanelList.get(3).add(this.jComboBoxList.get(2));
        this.jPanelList.get(4).add(this.jComboBoxList.get(3));
        this.jPanelList.get(5).add(this.jComboBoxList.get(4));
     }
     
     public void iniciarBoton(){
         this.jButton= new JButton();
          this.jButton.setText("Siguiente");
          this.jPanelList.get(6).add(this.jButton);
     }
}
     
