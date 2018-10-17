
package model;


public class model {
    private String nombre;  
    private String papellido;
    private String sapellido;
    private String fecha;
    private String mail;
    private String pass;

    public model(String nombre, String papellido, String sapellido, String fecha, String mail, String pass) {
        this.nombre = nombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.fecha = fecha;
        this.mail = mail;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPapellido() {
        return papellido;
    }
    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }

    public String getSapellido() {
        return sapellido;
    }
    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
