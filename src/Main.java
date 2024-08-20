import java.util.*;

public class Main {
    public static void main(String[] args) {
        int op, nuev = 0, mIng, m20 = 0, m50 = 0, m100 = 0, m200 = 0, m500 = 0, tot = 0, ejec = 1;
        Scanner sc = new Scanner(System.in);
        while(ejec != 0) {
            System.out.println("ALCANCIA");
            System.out.println("Ingrese la accion de que desea hacer: ");
            System.out.println("1.Agregar moneda\n2.Contar monedas\n3.Calcular total dinero\n4.Mostrar dinero ahorrado");
            System.out.println("Si no desea realizar ninguna accion ingrese 0.");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Solo puede agregar monedas de $20, $50, $100, $200 y $500");
                    System.out.println("Ingrese el valor de la moneda que desea ingresar:");
                    mIng = sc.nextInt();
                    if (mIng == 20) {
                        m20 = m20 + 1;
                        System.out.println("Moneda de $20 ingresada correctamente.\n");
                    } else if (mIng == 50) {
                        m50 = m50 + 1;
                        System.out.println("Moneda de $50 ingresada correctamente.\n");
                    } else if (mIng == 100) {
                        m100 = m100 + 1;
                        System.out.println("Moneda de $100 ingresada correctamente.\n");
                    } else if (mIng == 200) {
                        m200 = m200 + 1;
                        System.out.println("Moneda de $200 ingresada correctamente.\n");
                    } else if (mIng == 500) {
                        m500 = m500 + 1;
                        System.out.println("Moneda de $500 ingresada correctamente.\n");
                    } else {
                        System.out.println("No se puede ingresar la moneda de valor $" + mIng + "\n");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Actualmente tiene:\n- " + m20 + " monedas de $20.");
                    System.out.println("- " + m50 + " monedas de $50.");
                    System.out.println("- " + m100 + " monedas de $100.");
                    System.out.println("- " + m200 + " monedas de $200.");
                    System.out.println("- " + m500 + " monedas de $500.\n");
                    break;
                }
                case 3: {
                    tot = (m20 * 20) + (m50 * 50) + (m100 * 100) + (m200 * 200) + (m500 * 500);
                    System.out.println("Se calculo el total de dinero ahorrado.");
                    System.out.println("El dinero total que ahorro fue $" + tot + "\n");
                    break;
                }
                case 4: {
                    tot = 0;
                    m20 = 0;
                    m50 = 0;
                    m100 = 0;
                    m200 = 0;
                    m500 = 0;
                    System.out.println("Alcancia rota, ahora no tiene dinero guardado.\n");
                    while (nuev != 1 && nuev != 2) {
                        System.out.println("Quiere iniciar una nueva alcancia?\n1. Si\n2. No");
                        nuev = sc.nextInt();
                        if (nuev == 1) {
                            System.out.println("Nueva alcancia iniciada...\n");
                        } else if (nuev == 2) {
                            ejec = 0;
                        } else {
                            System.out.println("Ingrese una opcion valida.");
                        }
                    }
                    break;
                }
                default : {
                    System.out.println("La opcion ingresada no es valida.\n");
                    break;
                }
            }
            if (op == 0) {
                ejec = 0;
            }
        }
    }
}