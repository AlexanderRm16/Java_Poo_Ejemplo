package ModeladoDeObjetos;

public class CuentaBancaria {

    private String numeroCuenta;
    private String nombreUsuario;
    private String apellidoUsuario;
    private double saldo;
    private boolean estadoCuenta;
    private String tipoMoneda;
    private char tipoCuenta;
    private double limiteRetiro;
    private double tasaInteres;
    private int yearApertura;

    public CuentaBancaria() {
        this.numeroCuenta = "0000";
        this.nombreUsuario = "";
        this.apellidoUsuario = "";
        this.saldo = 0.0;
        this.estadoCuenta = true;
        this.tipoMoneda = "COP";
        this.tipoCuenta = 'A';
        this.limiteRetiro = 0.0;
        this.tasaInteres = 0.0;
        this.yearApertura = 2026;
    }

    public CuentaBancaria(String numeroCuenta, String nombreUsuario, String apellidoUsuario,
                          double saldo, boolean estadoCuenta, String tipoMoneda,
                          char tipoCuenta, double limiteRetiro, double tasaInteres,
                          int yearApertura) {
        this.numeroCuenta = numeroCuenta;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.saldo = saldo;
        this.estadoCuenta = estadoCuenta;
        this.tipoMoneda = tipoMoneda;
        this.tipoCuenta = tipoCuenta;
        this.limiteRetiro = limiteRetiro;
        this.tasaInteres = tasaInteres;
        this.yearApertura = yearApertura;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getApellidoUsuario() {
        return apellidoUsuario;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean isEstadoCuenta() {
        return estadoCuenta;
    }
    public String getTipoMoneda() {
        return tipoMoneda;
    }
    public char getTipoCuenta() {
        return tipoCuenta;
    }
    public double getLimiteRetiro() {
        return limiteRetiro;
    }
    public double getTasaInteres() {
        return tasaInteres;
    }
    public int getYearApertura() {
        return yearApertura;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta.length() != 4) {
            System.out.println("El numero de cuenta debe tener exactamente 4 digitos.");
        } else {
            this.numeroCuenta = numeroCuenta;
        }
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    public void setEstadoCuenta(boolean estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public void setTipoCuenta(char tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setLimiteRetiro(double limiteRetiro) {
        if (limiteRetiro >= 0) {
            this.limiteRetiro = limiteRetiro;
        } else {
            System.out.println("El limite de retiro no puede ser negativo.");
        }
    }

    public void setTasaInteres(double tasaInteres) {
        if (tasaInteres >= 0) {
            this.tasaInteres = tasaInteres;
        } else {
            System.out.println("La tasa de interes no puede ser negativa.");
        }
    }

    public void setYearApertura(int yearApertura) {
        if (yearApertura > 1900 && yearApertura <= 2026) {
            this.yearApertura = yearApertura;
        } else {
            System.out.println("El año de apertura no es valido.");
        }
    }
}