package ModeladoDeObjetos;

public class PruebaBanco {
    public static void main(String[] args) {

        System.out.println("=== PROBANDO CONSTRUCTOR POR DEFECTO ===");
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Moneda: " + cuenta1.getTipoMoneda());
        System.out.println("Saldo inicial: " + cuenta1.getSaldo());

        System.out.println("\n=== PROBANDO CONSTRUCTOR PARAMETRIZADO ===");
        CuentaBancaria cuenta2 = new CuentaBancaria("1234", "Carlos", "Pérez", 2500.00, true, "COP", 'A', 1000.0, 1.5, 2026);
        System.out.println("Titular: " + cuenta2.getNombreUsuario() + " " + cuenta2.getApellidoUsuario());
        System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Saldo actual: " + cuenta2.getSaldo());

        System.out.println("\n=== PROBANDO SETTERS Y VALIDACIONES ===");

        System.out.println("Intentando asignar saldo negativo (-500):");
        cuenta2.setSaldo(-500.0);

        System.out.println("Asignando saldo válido (5000.0):");
        cuenta2.setSaldo(5000.0);
        System.out.println("Nuevo saldo verificado con Get: " + cuenta2.getSaldo());

        System.out.println("\nIntentando número de cuenta corto ('123'):");
        cuenta2.setNumeroCuenta("123");
        System.out.println("Asignando número de cuenta válido ('9876'):");
        cuenta2.setNumeroCuenta("9876");
        System.out.println("Nuevo número de cuenta verificado con Get: " + cuenta2.getNumeroCuenta());
    }
}