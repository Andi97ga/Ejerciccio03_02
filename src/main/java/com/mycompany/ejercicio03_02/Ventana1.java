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
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Ventana1 extends JFrame{
    private JPanel jPanel1;
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private JTextField jTextField;
    private List<JComboBox> jComboBoxList;
    private JButton jButton;
    
    
    
    
    public Ventana1(String title) throws HeadlessException {
        super(title);
        this.setSize(400,300);
        this.setLocation(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
     public void iniciarComponentes(){
        this.jPanel1=new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(4,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTexto();
        this.inicarCombo();
        this.iniciarBoton();    
     }
     
     public void iniciarPaneles(){
       this.jPanelList=new ArrayList<>();
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       
       this.jPanelList.get(0).setBackground(Color.WHITE);
       this.jPanelList.get(1).setBackground(Color.WHITE);
       this.jPanelList.get(2).setBackground(Color.WHITE);
       this.jPanelList.get(3).setBackground(Color.WHITE);
       
       this.jPanel1.add(this.jPanelList.get(0));
       this.jPanel1.add(this.jPanelList.get(1));
       this.jPanel1.add(this.jPanelList.get(2));
       this.jPanel1.add(this.jPanelList.get(3));  
     }
     
     public void iniciarEtiquetas(){
         this.jLabelList= new ArrayList<>();
         this.jLabelList.add(new JLabel("Seleccione una Sede: *"));
         this.jLabelList.add(new JLabel("Tipo Documento"));
         this.jLabelList.add(new JLabel("Ingrese su Identificación: *"));
         
         this.jPanelList.get(0).add(this.jLabelList.get(0));
         this.jPanelList.get(1).add(this.jLabelList.get(1));
         this.jPanelList.get(2).add(this.jLabelList.get(2));
     }
    
     public void iniciarTexto(){
        this.jTextField= new JTextField();
        this.jTextField.add(new JTextField ());
        this.jTextField.setColumns(10);
        
        this.jPanelList.get(2).add(this.jTextField);
        
    }
      public void inicarCombo(){
        this.jComboBoxList= new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        
        this.jComboBoxList.get(0).addItem("Seleccione una opción");
        this.jComboBoxList.get(0).addItem("Matriz Cuenca");
        this.jComboBoxList.get(0).addItem("Matriz Guayaquil");
        this.jComboBoxList.get(0).addItem("Matriz Quito");
        this.jComboBoxList.get(1).addItem("Seleccione una opción");
        this.jComboBoxList.get(1).addItem("Cedula");
        this.jComboBoxList.get(1).addItem("Pasaporte");
        
        this.jPanelList.get(0).add(this.jComboBoxList.get(0));
        this.jPanelList.get(1).add(this.jComboBoxList.get(1)); 
      } 
      
      public void iniciarBoton(){
          this.jButton= new JButton();
          this.jButton.setText("Ingresar");
          this.jPanelList.get(3).add(this.jButton);
      }
         

}
