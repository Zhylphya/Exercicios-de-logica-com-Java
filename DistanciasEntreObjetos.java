import java.util.Scanner;

public class DistanciasEntreObjetos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] objetos = new int[5];

        for (int i = 0; i < 5; i++) {

            objetos[i] = sc.nextInt();

        }

        int objeto1 = objetos[0] + (objetos[1] * objetos[4]);
        int objeto2 = (objetos[2] + (objetos[3]) * objetos[4]);
        int resultado = Math.abs(objeto1 - objeto2);

        System.out.println(resultado);
    }
}
