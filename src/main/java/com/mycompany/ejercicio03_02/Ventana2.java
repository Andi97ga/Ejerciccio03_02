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
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Ventana2 extends JFrame {
    
    private JPanel jPanel2;
    private List<JPanel> jPanelList;
    private JTextField jTextField;
    private List<JLabel> jLabelList;

    public Ventana2(String title) throws HeadlessException {
        super(title);
        this.setSize(500,500);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel2);
    }
    
    public void iniciarComponentes(){
        this.jPanel2=new JPanel();
        this.jPanel2.setBackground(Color.WHITE);
        this.jPanel2.setBorder(BorderFactory.createTitledBorder("Personal"));
        this.jPanel2.setLayout(new GridLayout(9,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTexto();
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
       this.jPanelList.add(new JPanel());
       
       this.jPanelList.get(0).setBackground(Color.WHITE);
       this.jPanelList.get(1).setBackground(Color.WHITE);
       this.jPanelList.get(2).setBackground(Color.WHITE);
       this.jPanelList.get(3).setBackground(Color.WHITE);
       this.jPanelList.get(4).setBackground(Color.WHITE);
       this.jPanelList.get(5).setBackground(Color.WHITE);
       this.jPanelList.get(6).setBackground(Color.WHITE);
       this.jPanelList.get(7).setBackground(Color.WHITE);
       this.jPanelList.get(8).setBackground(Color.WHITE);
       
       this.jPanel2.add(this.jPanelList.get(0));
       this.jPanel2.add(this.jPanelList.get(1));
       this.jPanel2.add(this.jPanelList.get(2));
       this.jPanel2.add(this.jPanelList.get(3));
       this.jPanel2.add(this.jPanelList.get(4));
       this.jPanel2.add(this.jPanelList.get(5));
       this.jPanel2.add(this.jPanelList.get(6));
       this.jPanel2.add(this.jPanelList.get(7));
       this.jPanel2.add(this.jPanelList.get(8));
    }
   
    public void iniciarEtiquetas(){
         this.jLabelList= new ArrayList<>();
         this.jLabelList.add(new JLabel("Apellidos:                          "));
         this.jLabelList.add(new JLabel("             Garcia Arizaga "));
         this.jLabelList.add(new JLabel("Nombres:                            "));
         this.jLabelList.add(new JLabel("             José Andrés "));
         this.jLabelList.add(new JLabel("Nacionalidad:                       "));
         this.jLabelList.add(new JLabel("             ECUATORIANA"));
         this.jLabelList.add(new JLabel("Género:                             "));
         this.jLabelList.add(new JLabel("             Masculino "));
         this.jLabelList.add(new JLabel("Correo electrónico personal:        "));
         this.jLabelList.add(new JLabel("             andigarci97@hotmail.com"));
         this.jLabelList.add(new JLabel("Fecha Nacimiento:                   "));
         this.jLabelList.add(new JLabel("             22-06-1997 "));
         this.jLabelList.add(new JLabel("Teléfono Domicilio:                 "));
         this.jLabelList.add(new JLabel("             072893414 "));
         this.jLabelList.add(new JLabel("Teléfono Celular:                   "));
         this.jLabelList.add(new JLabel("             0990174418 "));
         this.jLabelList.add(new JLabel("Whatsapp:                           "));
         
         this.jPanelList.get(0).add(this.jLabelList.get(0));
         this.jPanelList.get(0).add(this.jLabelList.get(1));
         this.jPanelList.get(1).add(this.jLabelList.get(2));
         this.jPanelList.get(1).add(this.jLabelList.get(3));
         this.jPanelList.get(2).add(this.jLabelList.get(4));
         this.jPanelList.get(2).add(this.jLabelList.get(5));
         this.jPanelList.get(3).add(this.jLabelList.get(6));
         this.jPanelList.get(3).add(this.jLabelList.get(7));
         this.jPanelList.get(4).add(this.jLabelList.get(8));
         this.jPanelList.get(4).add(this.jLabelList.get(9));
         this.jPanelList.get(5).add(this.jLabelList.get(10));
         this.jPanelList.get(5).add(this.jLabelList.get(11));
         this.jPanelList.get(6).add(this.jLabelList.get(12));
         this.jPanelList.get(6).add(this.jLabelList.get(13));
         this.jPanelList.get(7).add(this.jLabelList.get(14));
         this.jPanelList.get(7).add(this.jLabelList.get(15));
         this.jPanelList.get(8).add(this.jLabelList.get(16));
    }
    
    public void iniciarTexto(){
        this.jTextField= new JTextField();
        this.jTextField.add(new JTextField ());
        this.jTextField.setColumns(10);
        
        this.jPanelList.get(8).add(this.jTextField);
        
    }
    
}
