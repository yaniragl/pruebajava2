/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;

/**************************************************************
 Nombre yanira Galeas Rojas
 Fecha 06 11 2017
 Clase Pruebajava2
 Responsabilidad
 * @author ceduc
 */
public class Pruebajava2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        float mes = Float.parseFloat(JOptionPane.showInputDialog("Ingrese   mes "));
        switch(Math.round(mes))
        {
            
        
       case 1:
        JOptionPane.showMessageDialog(null,"Mes enero ");
            case 2:
        JOptionPane.showMessageDialog(null,"Mes febrer");
        break;
            case 3:
        JOptionPane.showMessageDialog(null,"Mes marzo");
       
         break;
         case 4:
        JOptionPane.showMessageDialog(null,"Mes abril "); 
        
         break;
         case 5:
        JOptionPane.showMessageDialog(null,"Mes mayo"); 
           
             break;
              case 6:
        JOptionPane.showMessageDialog(null,"Mes junio ");
            
         break;
         case 7:
        JOptionPane.showMessageDialog(null,"Mes julio ");    
         
          break;
          case 8:
        JOptionPane.showMessageDialog(null,"Mes agosto ");
         
          break;
          case 9:
        JOptionPane.showMessageDialog(null,"Mes septiembre "); 
         
          break;
          case 10:
        JOptionPane.showMessageDialog(null,"Mes octubre");
         
             break;
             case 11:
            JOptionPane.showMessageDialog(null,"Mes noviembre ");
          
           break;
           case 12:
            JOptionPane.showMessageDialog(null,"Mes diciembre ");
             break;
             
    }
        
    }
}
