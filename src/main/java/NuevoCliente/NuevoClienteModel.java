package NuevoCliente;

import javafx.beans.property.*;

import java.time.LocalDate;


public class NuevoClienteModel {
    private StringProperty nombreCliente;
    private StringProperty apellidosCliente;
    private StringProperty dniCliente;
    private StringProperty telefonoCliente;
    private StringProperty mailCliente;
    private StringProperty observacionesCliente;
    private StringProperty genero;
    private StringProperty direccion;
    private ObjectProperty<LocalDate> nacimientoCliente;
    private BooleanProperty clienteHuefano;

    public NuevoClienteModel() {
        nombreCliente = new SimpleStringProperty(this, "nombreCliente");
        apellidosCliente = new SimpleStringProperty(this, "apellidosCliente");
        dniCliente = new SimpleStringProperty(this, "dniCliente");
        telefonoCliente = new SimpleStringProperty(this, "telefonoCliente");
        mailCliente = new SimpleStringProperty(this, "mailCliente");
        observacionesCliente = new SimpleStringProperty(this, "observacionesCliente");
        genero = new SimpleStringProperty(this, "genero");
        direccion = new SimpleStringProperty(this, "direccion");
        nacimientoCliente = new SimpleObjectProperty<>(this, "nacimientoCliente");
        clienteHuefano = new SimpleBooleanProperty(this, "clienteHuerfano");
    }

    public String getObservacionesCliente() {
        return observacionesCliente.get();
    }

    public StringProperty observacionesClienteProperty() {
        return observacionesCliente;
    }

    public void setObservacionesCliente(String observacionesCliente) {
        this.observacionesCliente.set(observacionesCliente);
    }

    public String getGenero() {
        return genero.get();
    }

    public StringProperty generoProperty() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero.set(genero);
    }

    public String getDireccion() {
        return direccion.get();
    }

    public StringProperty direccionProperty() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion.set(direccion);
    }

    public String getNombreCliente() {
        return nombreCliente.get();
    }

    public StringProperty nombreClienteProperty() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente.set(nombreCliente);
    }

    public String getApellidosCliente() {
        return apellidosCliente.get();
    }

    public StringProperty apellidosClienteProperty() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente.set(apellidosCliente);
    }

    public String getDniCliente() {
        return dniCliente.get();
    }

    public StringProperty dniClienteProperty() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente.set(dniCliente);
    }

    public String getTelefonoCliente() {
        return telefonoCliente.get();
    }

    public StringProperty telefonoClienteProperty() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente.set(telefonoCliente);
    }

    public String getMailCliente() {
        return mailCliente.get();
    }

    public StringProperty mailClienteProperty() {
        return mailCliente;
    }

    public void setMailCliente(String mailCliente) {
        this.mailCliente.set(mailCliente);
    }

    public LocalDate getNacimientoCliente() {
        return nacimientoCliente.get();
    }

    public ObjectProperty<LocalDate> nacimientoClienteProperty() {
        return nacimientoCliente;
    }

    public void setNacimientoCliente(LocalDate nacimientoCliente) {
        this.nacimientoCliente.set(nacimientoCliente);
    }

    public boolean isClienteHuefano() {
        return clienteHuefano.get();
    }

    public BooleanProperty clienteHuefanoProperty() {
        return clienteHuefano;
    }

    public void setClienteHuefano(boolean clienteHuefano) {
        this.clienteHuefano.set(clienteHuefano);
    }
}
