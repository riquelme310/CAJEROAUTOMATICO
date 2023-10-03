import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final int saldo_inicial=100000;
        int opcion;
        float dineroingresado,saldocuenta,retirodinero;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("bienvenido al cajero automatico coco loco\n"
                + "1.desea ingrsar dinero a su cuenta\n"
                + "2.desea sacar dinero de su cuenta\n"
                + "3.salir"));

        switch (opcion){
            case 1:dineroingresado=Float.parseFloat(JOptionPane.showInputDialog("dijite la cantidad de dinero que va a ingresar a su cuenta"));
                saldocuenta=saldo_inicial+dineroingresado;
                JOptionPane.showMessageDialog(null,"el dinero que tienes en tu cuenta es de"+saldocuenta);
                break;
            case 2:retirodinero=Float.parseFloat(JOptionPane.showInputDialog("dijite la cantidad de dinero que desea retirar de la cuenta"));
                if (retirodinero>saldo_inicial){
                    JOptionPane.showMessageDialog(null,"el dinero que desea ingresar no esta disponible trabaje mas");
                }
                else{
                    saldocuenta=saldo_inicial-retirodinero;
                    JOptionPane.showMessageDialog(null,"el saldo de la cuenta esta en"+saldocuenta);
                }
                break;
            case 3:break;
            default:JOptionPane.showMessageDialog(null,"la opcion que ingreso no exite por favor revise su vista");break;

        }
    }
}