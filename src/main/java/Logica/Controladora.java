
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;


public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //CRUD del Usuario
    public void crearUsuario( String nombreUsuario, String contraseña,String rol){
    
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContraseña(contraseña);
        usu.setRol(rol);
        controlPersis.crearUsuario(usu);
    }
    
    public List<Usuario> getUsuarios() {
       return controlPersis.getUsuarios();
    }

    public void borrarUsuario(int id) {
        controlPersis.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }

    
    //CRUD del producto
    public void crearProducto(String nombreProduc, String materialProducto, String descripcion, int cantidadRegistrada) {
        Producto produc = new Producto();
        produc.setNombre(nombreProduc);
        produc.setMaterialProducto(materialProducto);
        produc.setDescripcion(descripcion);
        produc.setCantidadRegistrada(cantidadRegistrada);
        controlPersis.crearProducto(produc);
        
    }

    public List<Producto> getProducto() {
        return controlPersis.getProducto();
    }
    
    public void borrarProducto(int id) {
        controlPersis.borrarProducto(id);
    }
    
    public Producto traerProducto(int id) {
        return controlPersis.traerProducto(id);
    }
    
    public void editarProductor(Producto producto) {
        controlPersis.editarproducto(producto);
    }
    
    //CRUD del Material
    public void crearMaterial(String material, int cantidadMaterial) {
        Material matter = new Material();
        matter.setMaterial(material);
        matter.setCantidadMaterial(cantidadMaterial);
        controlPersis.crearMaterial(matter);
        
    }
    
    public List<Material> getMateriales() {
        return controlPersis.getMateriales();
    }
    
    public void borrarMaterial(int id) {
        controlPersis.borrarMaterial(id);
    }
    
    public Material traerMaterial(int id) {
        return controlPersis.traerMaterial(id);
    }
    
    public void editarMaterial(Material matter) {
        controlPersis.editarMaterial(matter);
    }
    
    //CRUD del Almacenista
    public void crearAlmacenista(int cedula, String nombre, String apellido, String correoElectronico, String celular) {
        Almacenista almacenista= new Almacenista();
        almacenista.setCedula(cedula);
        almacenista.setNombre(nombre);
        almacenista.setApellido(apellido);
        almacenista.setCorreoElectronico(correoElectronico);
        almacenista.setCelular(celular);
        controlPersis.crearAlmacenista(almacenista);
    }
    
    public List<Almacenista> getAlmacenista() {
        return controlPersis.getAlmacenista();
    }
    
    
    public void borrarAlmacenista(int id) {
        controlPersis.borrarAlmacenista(id);
    }
    
    public Almacenista traerAlmacenista(int id) {
        return controlPersis.traerAlmacenista(id);
    }
    
    public void editarAlmacenista(Almacenista almacenista) {
     controlPersis.editarAlmacenista(almacenista);   
    }
    
    //CRUD del gerente
    public void crearGerente(int cedula, String nombre, String apellido, String correoElectronico, String celular) {
        Gerente gerente = new Gerente();
        gerente.setCedula(cedula);
        gerente.setNombre(nombre);
        gerente.setApellido(apellido);
        gerente.setCorreoElectronico(correoElectronico);
        gerente.setCelular(celular);
        controlPersis.crearGerente(gerente);
    }
    
    public List<Gerente> getGerente() {
        return controlPersis.getGerente();
    }
    
    public void borrarGerente(int id) {
        controlPersis.borrarGerente(id);
    }
    
    public Gerente traerGerente(int id) {
        return controlPersis.traerGerente(id);
    }

    public void editarGerente(Gerente gerente) {
     controlPersis.editarGerente(gerente);   
    }    
    //CRUD del Proveedor
    public void crearProveedor(int cedula, String nombre, String apellido, String correoElectronico, String celular, String empresa, String direccion) {
        Proveedor proveedor = new Proveedor();
        proveedor.setCedula(cedula);
        proveedor.setNombre(nombre);
        proveedor.setApellido(apellido);
        proveedor.setCorreoElectronico(correoElectronico);
        proveedor.setCelular(celular);
        proveedor.setEmpresa(empresa);
        proveedor.setDireccion(direccion);
        controlPersis.crearProveedor(proveedor);
    }

    public List<Proveedor> getProveedor() {
        return controlPersis.getProveedor();
    }

    public void borrarProveedor(int id) {
        controlPersis.borrarProveedor(id);
    }

    public Proveedor traerProveedor(int id) {
        return controlPersis.traerProveedor(id);
    }

    public void editarProveedor(Proveedor proveedor) {
        controlPersis.editarProveedor(proveedor);
    }
    //metodo para comprobar el inicio de sesión 
    public boolean ComprobarIngreso(String usuario, String contrasenia) {
        boolean ingreso = false;
        
        List<Usuario> listausuarios = new ArrayList<Usuario>();
        listausuarios = controlPersis.getUsuarios();
        
        for(Usuario usu : listausuarios){
            if(usu.getNombreUsuario().equals(usuario)){
               if(usu.getContraseña().equals(contrasenia)){
                   ingreso=true;
               } 
               else{
                   ingreso=false;
               }
            }
                    
        }
        return ingreso;
    }   
    
    //CRUD de las ventas
    public void crearVenta(String producto, String precio, String material,String descripcion, int cantidadVendida, String encargadoVenta, String fechaVentas) {
        Ventas venta = new Ventas();
        venta.setProducto(producto);
        venta.setPrecio(precio);
        venta.setMaterialProducto(material);
        venta.setDescripcion(descripcion);
        venta.setCantidadVendida(cantidadVendida);
        venta.setEncargadoVenta(encargadoVenta);
        venta.setFechaVenta(fechaVentas);
        controlPersis.crearVenta(venta);
    }

    public List<Ventas> getVentas() {
        return controlPersis.getVentas();
    }

    public void borrarVenta(int id) {
        controlPersis.borrarVenta(id);
    }

    public Ventas traerVenta(int id) {
        return controlPersis.traerVenta(id);
    }

    public void editarVenta(Ventas venta) {
        controlPersis.editarVenta(venta);
    }
    
}
