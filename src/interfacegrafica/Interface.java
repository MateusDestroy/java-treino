


package interfacegrafica;


import javax.swing.JFrame;



    public class Interface extends JFrame {

        public Interface() {

            setTitle("Calculo");
            setSize(700, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);

        }

        public static void main(String[] args) {
            new Interface();
        }

    }
    

