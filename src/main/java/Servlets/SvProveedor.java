
package Servlets;

import Logica.Controladora;
import Logica.Proveedor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvProveedor", urlPatterns = {"/SvProveedor"})
public class SvProveedor extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Proveedor> listaProveedor = new ArrayList<Proveedor>();
        
        listaProveedor = control.getProveedor();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaProveedor", listaProveedor);
        
        System.out.println("lista de materiales: " + listaProveedor.get(0));
        
        response.sendRedirect("verProveedor.jsp");
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
        control.crearProveedor(cedula,nombre,apellido,correoElectronico,celular,empresa,direccion);
        
        response.sendRedirect("index.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
