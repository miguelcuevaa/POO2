package semana05ejemplo01;

public class ComputadoraBuilder {
    private String marca;
    private String modelo;
    private String procesador;
    private String tarjetaGrafica;
    private int memoriaRAM;
    private int almacenamiento;
    private String tipoAlmacenamiento;
    private boolean tieneBluetooth;
    private boolean tieneWebCam;
    private boolean tieneWifi;
    private String sistemaOperativo;

    public ComputadoraBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public ComputadoraBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ComputadoraBuilder setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public ComputadoraBuilder setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
        return this;
    }

    public ComputadoraBuilder setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
        return this;
    }

    public ComputadoraBuilder setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
        return this;
    }

    public ComputadoraBuilder setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        return this;
    }

    public ComputadoraBuilder setTieneBluetooth(boolean tieneBluetooth) {
        this.tieneBluetooth = tieneBluetooth;
        return this;
    }

    public ComputadoraBuilder setTieneWebCam(boolean tieneWebCam) {
        this.tieneWebCam = tieneWebCam;
        return this;
    }

    public ComputadoraBuilder setTieneWifi(boolean tieneWifi) {
        this.tieneWifi = tieneWifi;
        return this;
    }

    public ComputadoraBuilder setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public boolean isTieneBluetooth() {
        return tieneBluetooth;
    }

    public boolean isTieneWebCam() {
        return tieneWebCam;
    }

    public boolean isTieneWifi() {
        return tieneWifi;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public Computadora build(){
        return Computadora.crearDesdeBuilder(this);
    }
    
}
