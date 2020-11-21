package cl.santotomas.iniciosesion.modelo;

public class Usuario {

    private String nombre;
    private String email;
    private String telefono;
    private String password;

    public String getPassword() {
        return password;   // transformar MD5 hash
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean esVacio(){
        if( this.nombre.isEmpty() || this.email.isEmpty() || this.password.isEmpty() )
            return true;
        return false;
    }

    public boolean claveIgual(String repetir){
        if(this.password.equals(repetir))
            return true;
        return false;
    }


    public boolean emailIgual(String otroemail){
        if( this.email.equals(otroemail))
            return true;
        return false;
    }

    public boolean login(String email, String password){
        if( this.email.equals(email) && this.password.equals(password)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
