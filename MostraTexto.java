import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MostraTexto extends JFrame{
   private JLabel textoLabel;
   private JTextField textoText;
   private JButton mostrarButton, limparButton, sairButton;
   private Observador observador;

   public MostraTexto(){
      super("Mostrar Texto");
      textoLabel = new JLabel("Texto: ");
      textoText = new JTextField(10);
      mostrarButton = new JButton ("Mostrar");
      limparButton = new JButton ("Limpar");
      sairButton = new JButton("Sair");

      JPanel painelNorte = new JPanel (new GridLayout(1,2));
      painelNorte.add(textoLabel);
      painelNorte.add(textoText);

      JPanel painelSul = new JPanel (new FlowLayout());
      painelSul.add(mostrarButton);
      painelSul.add(limparButton);
      painelSul.add(sairButton);

      Container caixa = getContentPane();
      caixa.setLayout(new BorderLayout());
      caixa.add(painelNorte, BorderLayout.NORTH);
      caixa.add(painelSul, BorderLayout.CENTER);

      setSize(300, 100);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      observador = new Observador();
      mostrarButton.addActionListener(observador);
      limparButton.addActionListener(observador);
      sairButton.addActionListener(observador);
   }

   class Observador implements ActionListener{
      public void actionPerformed(ActionEvent e){
         if(e.getSource() == mostrarButton){
            JOptionPane.showMessageDialog(null, textoText.getText());
         }else if(e.getSource() == limparButton){
            textoText.setText("");
         }else{
            System.exit(0);
         }
      }
   }

}