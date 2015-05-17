package modelo;

import java.util.ArrayList;
import java.util.Date;

public class ListaUsuarios {

    private ListaUsuarios() {
        listaUsuarios = new ArrayList<Usuario>();
    }

    public ArrayList<Usuario> obtenerInstancia() {
        if (listaUsuarios == null) {
            listaUsuarios = new ArrayList<Usuario>();
        }
        return listaUsuarios;
    }

    public void ingresarUsuario(String nombre, String apellido, String correo, String telefono,
            String contrasena, Date fechaNacimiento, Date fechaUltimoAcceso, boolean administrador) {
        listaUsuarios.add(new Usuario(nombre, apellido, correo, telefono, contrasena, fechaNacimiento,
                fechaUltimoAcceso, administrador));

    }

    //primero se busca el que quien va a eliminar sea adminstrador, luego se busca quien se eliminara
    public boolean eliminarUsuario(String correo, String correoAdministrador) {
        boolean administrador = false;
        boolean eliminado = false;
        for (int k = 0; k < listaUsuarios.size(); k++) {
            if (listaUsuarios.get(k).getCorreoElectronico() == correoAdministrador) {
                if (listaUsuarios.get(k).getAdministrador() == true) {
                    administrador = true;
                }
            }
        }
        if (administrador) {
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (listaUsuarios.get(i).getCorreoElectronico() == correo) {
                    listaUsuarios.remove(listaUsuarios.get(i));
                }
                eliminado = true;
            }
        }
        return eliminado;
    }

    public boolean esAdministrador(String correo) {// este metodo te sirve para ver si un usuario es administrador
        boolean administrador = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCorreoElectronico() == correo) {
                administrador = true;
            }
        }
        return administrador;
    }

    public boolean verificarContrasena(String contrasena) {// este metodo te sirve para ver si un usuario es administradpr
        boolean contra = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getContrasena() == contrasena) {
                contra = true;
            }
        }
        return contra;
    }

    //metodos para cambiar atributos de los usuarios
    public boolean modificarNombre(String correo, String nuevoNombre) {
        boolean modificado = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCorreoElectronico() == correo) {
                listaUsuarios.get(i).setNombre(nuevoNombre);
                modificado = true;
            }
        }
        return modificado;
    }

    public boolean modificarApellido(String correo, String nuevoApellido) {
        boolean modificado = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCorreoElectronico() == correo) {
                listaUsuarios.get(i).setApellido(nuevoApellido);
                modificado = true;
            }
        }
        return modificado;
    }

    public boolean modificarTelefono(String correo, String nuevoTelefono) {
        boolean modificado = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCorreoElectronico() == correo) {
                listaUsuarios.get(i).setTelefono(nuevoTelefono);
                modificado = true;
            }
        }
        return modificado;
    }

    public boolean modificarContrasena(String correo, String nuevaContrasena) {
        boolean modificado = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCorreoElectronico() == correo) {
                listaUsuarios.get(i).setContrasena(nuevaContrasena);
                modificado = true;
            }
        }
        return modificado;
    }

    public boolean modificarfechaUltimoAcceso(String correo, Date nuevoAcceso) {
        boolean modificado = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCorreoElectronico() == correo) {
                listaUsuarios.get(i).setFechaUltimoAcceso(nuevoAcceso);
                modificado = true;
            }
        }
        return modificado;
    }

    public boolean modificarCorreo(String correo, String nuevoCorreo) {
        boolean modificado = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCorreoElectronico() == correo) {
                listaUsuarios.get(i).setCorreoElectronico(nuevoCorreo);
                modificado = true;
            }
        }
        return modificado;
    }

    public String toString() {
        return listaUsuarios.toString();
    }

    private ArrayList<Usuario> listaUsuarios;
}
