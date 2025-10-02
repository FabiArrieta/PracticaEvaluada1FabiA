/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c3practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class C3PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Solicitar_nombre_de_persona
         String nombreEmpleado=JOptionPane.showInputDialog("Digite su nombre:");
         String apellidoEmpleado=JOptionPane.showInputDialog("Digite su apellido:");
        
        //Ingresar_salario_individual
         String salarioEmpleado=JOptionPane.showInputDialog("Ingrese el salario");
         double salario = Double.parseDouble(salarioEmpleado);
                
         //Calcular_SEM_CCSS
         double calculoSEM = salario * 0.925;
         
         //Calcular_IVM_CCSS
         double calculoIVM = salario * 0.508;
         
         //Calcular_impuestosalario_CCSS
        double impuestoSalario = 0;
        
        if (salario > 2373000) {
            impuestoSalario = (salario - 2373000) * 0.20;
        } else if (salario > 1352000) {
            impuestoSalario = (salario - 1352000) * 0.15;
        } else if (salario > 922000) {
            impuestoSalario = (salario - 922000) * 0.10;
        }
        
        //Calcular_asociacion
        double asociacion = salario * 0.025;
        
        //Calcular_variableMuestra_y_totales
        double variableMuestra = calculoSEM + calculoIVM + impuestoSalario + asociacion;
        double salarioFinal = salario - variableMuestra;
        double montoCCSS = calculoSEM + calculoIVM;
        
        //Mostrar_resultado
        String mensaje = "Empleado: " + nombreEmpleado + " " + apellidoEmpleado + "\n\n" +
                        "- La empresa deberá abonar a la CCSS el monto de ₡" + 
                        String.format("%.2f", montoCCSS) + " por concepto de SEM y IVM.\n" +
                        "- La empresa deberá abonar al gobierno un monto de ₡" + 
                        String.format("%.2f", impuestoSalario) + " por concepto impuesto al salario\n" +
                        "- Para la asociación de la empresa se le asigna un valor ₡" + 
                        String.format("%.2f", asociacion) + "\n" +
                        "- El salario del empleado es de ₡" + 
                        String.format("%.2f", salarioFinal);
        
        JOptionPane.showMessageDialog(null, mensaje);
        // TODO code application logic here
    }
    
}

         
         
         
         
        
         


                 
      
                 
         
        
         
         
         
         
         
         
                
                
        
                               
      
        
        
     

