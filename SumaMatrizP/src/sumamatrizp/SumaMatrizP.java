
package sumamatrizp;

import javax.swing.JOptionPane;


public class SumaMatrizP {
    public void ingresaM(int matriz[][]){
        for (int i=0;i<matriz.length;i++)
            for (int j=0;j<matriz[i].length;j++)
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
    }

    public void imprimirM(int matriz[][]){
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int devuelve(int matriz[][]){
        int suma=0;
        for (int i=0;i<matriz.length;i++)
            for (int j=1;j<matriz[i].length;j+=2)
               if (matriz[i][j]%2==0)
                   suma=suma+matriz[i][j];
        
        return suma;
    }
    
    public void imprimirTrascuesta(int matriz[][]){
        System.out.println("traspuesta");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       SumaMatrizP x =new SumaMatrizP();
       int valores[][]=new int [3][3];
          x.ingresaM(valores);
          x.imprimirM(valores);
          System.out.println("la suma de los indices pares: "+x.devuelve(valores));
          x.imprimirTrascuesta(valores);
    }
    
}
