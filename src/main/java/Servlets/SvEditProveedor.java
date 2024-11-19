
package Servlets;

import Logica.Controladora;
import Logica.Proveedor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "SvEditProveedor", urlPatterns = {"/SvEditProveedor"})
public class SvEditProveedor extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Proveedor proveedor = control.traerProveedor(id);
        
        HttpSession misession = request.getSession();
        misession.setAttribute("proveedorEditar", proveedor);
        
        System.out.println("El proveedor es: "+proveedor.getNombre());
        
        response.sendRedirect("editarProveedor.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int cedula = Integer.parseInt(request.getParameter("cedula"));
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String correoElectronico=request.getParameter("correoElectronica");
        String celular=request.getParameter("celular");
        String empresa=request.getParameter("empresa");
        String direccion=request.getParameter("direccion");
        Proveedor proveedor = (Proveedor)request.getSession().getAttribute("proveedorEditar");
        proveedor.setCedula(cedula);
        proveedor.setNombre(nombre);
        proveedor.setApellido(apellido);
        proveedor.setCorreoElectronico(correoElectronico);
        proveedor.setCelular(celular);
        proveedor.setEmpresa(empresa);
        proveedor.setDireccion(direccion);
        control.editarProveedor(proveedor);
        
        response.sendRedirect("SvProveedor");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
