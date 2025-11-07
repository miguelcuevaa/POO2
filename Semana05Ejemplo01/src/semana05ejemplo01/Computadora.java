package semana05ejemplo01;

public class Computadora {
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
    
    //Constructor privado, solo puede ser invocado desde la clase ComputadoraBuilder
    //ello fuerza a que todos los objetos se construyan de manera controlada
    
    private Computadora(ComputadoraBuilder builder){
        this.marca = builder.getMarca();
        this.modelo = builder.getModelo();
        this.procesador = builder.getProcesador();
        this.tarjetaGrafica = builder.getTarjetaGrafica();
        this.memoriaRAM = builder.getMemoriaRAM();
        this.almacenamiento = builder.getAlmacenamiento();
        this.tipoAlmacenamiento = builder.getTipoAlmacenamiento();
        this.tieneBluetooth = builder.isTieneBluetooth();
        this.tieneWebCam = builder.isTieneWebCam();
        this.tieneWifi = builder.isTieneWifi();
        this.sistemaOperativo = builder.getSistemaOperativo();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public boolean isTieneBluetooth() {
        return tieneBluetooth;
    }

    public void setTieneBluetooth(boolean tieneBluetooth) {
        this.tieneBluetooth = tieneBluetooth;
    }

    public boolean isTieneWebCam() {
        return tieneWebCam;
    }

    public void setTieneWebCam(boolean tieneWebCam) {
        this.tieneWebCam = tieneWebCam;
    }

    public boolean isTieneWifi() {
        return tieneWifi;
    }

    public void setTieneWifi(boolean tieneWifi) {
        this.tieneWifi = tieneWifi;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public void mostrarDatos(){
        //muestra las características diferenciadas de cada objeto
        //System.out.println("Marca: "+(marca!=null ? marca : "No especificado"));
        //condicionamos la impresión de los atributos a que sean diferentes de null
        if(marca!=null) System.out.println("Marca: "+marca); 
        if(modelo!=null) System.out.println("Modelo: "+modelo);
        if(procesador!=null) System.out.println("Procesador: "+procesador);
        if(tarjetaGrafica!=null) System.out.println("Tarjeta gráfica: "+tarjetaGrafica);
        if(memoriaRAM!=0) System.out.println("MemoriaRAM: "+memoriaRAM);
        if(almacenamiento!=0) System.out.println("Almacenamiento: "+almacenamiento);
        if(tipoAlmacenamiento!=null) System.out.println("Tipo de almacenamiento: "+tipoAlmacenamiento);
        if(tieneBluetooth) System.out.println("Tiene Bluetooth: Sí");
        if(tieneWebCam) System.out.println("Tiene Webcam: Sí");
        if(tieneWifi) System.out.println("Tiene Wifi: Sí");
        if(sistemaOperativo!=null) System.out.println("Sistema operativo: "+sistemaOperativo);
    }
    
    //Método estático para crear un objeto de la clase Computadora desde ComputadoraBuilder
    public static Computadora crearDesdeBuilder(ComputadoraBuilder builder){
        return new Computadora(builder);
    }
    
}
