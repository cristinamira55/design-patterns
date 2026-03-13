package taller.mecanico;

class TallerMecanico {
    private final ReparacionMotor motor;
    private final CambioAceite aceite;
    private final AlineacionRuedas ruedas;


    public TallerMecanico( ReparacionMotor motor, CambioAceite aceite, AlineacionRuedas ruedas) {
        this.motor = motor;
        this.aceite = aceite;
        this.ruedas = ruedas;
    }

    public void realizarServicio() {
        motor.repararMotor();
        aceite.cambiarAceite();
        ruedas.alinearRuedas();
    }
}

