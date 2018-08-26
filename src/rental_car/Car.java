package rental_car;

public abstract class Car{
    protected enum Transmicion{
        AUTOMATICA,
        MECANICA
    }
    protected String placa;
    protected double cilindraje;
    protected String marca;
    protected String color;
    protected Transmicion transmicion;

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the cilindraje
     */
    public double getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the cilindraje to set
     */
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the transmicion
     */
    public Transmicion getTransmicion() {
        return transmicion;
    }
    
    /**
     * @param transmicion the transmicion to set
     */
    public void setTransmicion(Transmicion transmicion) {
        this.transmicion = transmicion;
    }
}