package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.util.regex.*;

public class Dorking extends JFrame{

    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox checkBox1;
    private JTextField textField3;
    private JCheckBox checkBox2;
    private JTextField textField4;
    private JCheckBox checkBox3;
    private JTextField textField5;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JTextField textField6;
    private JTextField textField7;
    private JCheckBox checkBox6;
    private JTextField textField8;
    private JCheckBox checkBox7;
    private JTextField textField9;
    private JCheckBox checkBox8;
    private JCheckBox checkBox9;
    private JCheckBox checkBox10;
    private JTextField textField10;
    private JTextField textField11;
    private JPanel mainDork;
    private JTextField result;
    private JLabel cache;
    private JLabel related;
    private JLabel info;
    private JLabel site;
    private JLabel intitle;
    private JLabel filetype;
    private JLabel intext;
    private JLabel inanchor;
    private JLabel book;
    private JLabel maps;

    public Dorking (){
        setContentPane(mainDork);
        setTitle("Dork Strings");
        setSize(400,450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        result.setEditable(false);

        String cachetip="Shows the version of the web page from the search engine’s cache.";
        cache.setToolTipText(cachetip);
        String relatedtip="Finds web pages that are similar to the specified web page.";
        related.setToolTipText(relatedtip);
        String infotip="Presents some information that Google has about a web page, including similar pages, the cached version of the page, and sites linking to the page.";
        info.setToolTipText(infotip);
        String sitetip="Finds pages only within a particular domain and all its subdomains.";
        site.setToolTipText(sitetip);
        String intitletip="Finds pages that include a specific keyword as part of the indexed title tag";
        intitle.setToolTipText(intitletip);
        filetype.setToolTipText("Searches for specific file types");
        intext.setToolTipText("Searches text of page");
        inanchor.setToolTipText("Search link anchor text");
        book.setToolTipText("Searches for book titles related to keywords");
        maps.setToolTipText("Searches for maps related to keywords");




        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText=textField1.getText();
                result.setText(inputText);
            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox1.isSelected())
                {
                    String intext=textField2.getText();
                    intext=" cache:"+intext;
                    result.setText(result.getText()+intext);
                    textField2.setEnabled(false);
                }
                else{
                    String intext=result.getText();
                    String in2=" cache:"+textField2.getText();

                    intext=intext.replaceAll(in2,"");

                    result.setText(intext);
                    textField2.setEnabled(true);
                }
            }
        });
        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox2.isSelected())
                {
                    String intext=textField3.getText();
                    intext=" related:"+intext;
                    result.setText(result.getText()+intext);
                    textField3.setEnabled(false);
                }
                else{
                    String intext=result.getText();
                    String in2=" related:"+textField3.getText();
                    intext=intext.replaceAll(in2,"");
                    result.setText(intext);
                    textField3.setEnabled(true);
                }
            }
        });
        checkBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox3.isSelected())
                {
                    String intext=textField4.getText();
                    intext=" info:"+intext;
                    result.setText(result.getText()+intext);
                    textField4.setEnabled(false);
                }
                else{
                    String intext=result.getText();
                    String in2=" info:"+textField4.getText();
                    intext=intext.replaceAll(in2,"");
                    textField4.setEnabled(true);
                    result.setText(intext);
                }
            }
        });

        checkBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox4.isSelected())
                {
                    String intext=textField5.getText();
                    intext=" site:"+intext;
                    result.setText(result.getText()+intext);
                    textField5.setEnabled(false);
                }
                else{
                    String intext=result.getText();
                    String in2=" site:"+textField5.getText();
                    intext=intext.replaceAll(in2,"");
                    textField5.setEnabled(true);
                    result.setText(intext);
                }
            }
        });
        checkBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox5.isSelected())
                {
                    String intext=textField6.getText();
                    intext=" intitle:"+intext;
                    result.setText(result.getText()+intext);
                    textField6.setEnabled(false);
                }
                else{
                    String intext=result.getText();
                    String in2=" intitle:"+textField6.getText();
                    intext=intext.replaceAll(in2,"");
                    textField6.setEnabled(true);
                    result.setText(intext);
                }
            }
        });
        checkBox6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox6.isSelected())
                {
                    String intext=textField7.getText();
                    intext=" filetype:"+intext;
                    result.setText(result.getText()+intext);
                    textField7.setEnabled(false);
                }
                else{
                    String intext=result.getText();
                    String in2=" filetype:"+textField7.getText();
                    intext=intext.replaceAll(in2,"");
                    textField7.setEnabled(true);
                    result.setText(intext);
                }
            }
        });
        checkBox7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox7.isSelected())
                {
                    String intext=textField8.getText();
                    intext=" intext:"+intext;
                    result.setText(result.getText()+intext);
                    textField8.setEnabled(false);
                }
                else{
                    String intext=result.getText();
                    String in2=" intext:"+textField8.getText();
                    intext=intext.replaceAll(in2,"");
                    textField8.setEnabled(true);
                    result.setText(intext);
                }
            }
        });
        checkBox8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox8.isSelected())
                {
                    String intext=textField9.getText();
                    intext=" inanchor:"+intext;
                    result.setText(result.getText()+intext);
                    textField9.setEnabled(false);
                }
                else{
                    String intext=result.getText();
                    String in2=" inanchor:"+textField9.getText();
                    intext=intext.replaceAll(in2,"");
                    textField9.setEnabled(true);
                    result.setText(intext);
                }
            }
        });
        checkBox9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox9.isSelected())
                {
                    String intext=textField10.getText();
                    intext=" book:"+intext;
                    result.setText(result.getText()+intext);
                    textField10.setEnabled(false);
                }
                else{
                    String intext=result.getText();
                    String in2=" book:"+textField10.getText();
                    intext=intext.replaceAll(in2,"");
                    textField10.setEnabled(true);
                    result.setText(intext);
                }
            }
        });
        checkBox10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox10.isSelected())
                {
                    String intext=textField11.getText();
                    intext=" maps:"+intext;
                    result.setText(result.getText()+intext);
                    textField11.setEnabled(false);
                }
                else{
                    String intext=result.getText();
                    String in2=" maps:"+textField11.getText();
                    intext=intext.replaceAll(in2,"");
                    textField11.setEnabled(true);
                    result.setText(intext);
                }
            }
        });


    }

    public static void main(String[] args) {
        Dorking dork=new Dorking();
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
