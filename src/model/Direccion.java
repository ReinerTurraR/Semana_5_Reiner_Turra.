package model;

/** Representa la direccion de residencia o trabajo del guia. */
public class Direccion {
    private String calle;
    private String ciudad;
    private String region;

    public Direccion() {
        this.calle = "";
        this.ciudad = "";
        this.region = "";
    }

    public Direccion(String calle, String ciudad, String region) {
        setCalle(calle);
        setCiudad(ciudad);
        setRegion(region);
    }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle == null ? "" : calle.trim(); }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad == null ? "" : ciudad.trim(); }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region == null ? "" : region.trim(); }

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}
