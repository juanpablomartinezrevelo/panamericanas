
package Servlets;

import Logica.Almacenista;
import Logica.Controladora;
import Logica.Gerente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEditAlmacenista", urlPatterns = {"/SvEditAlmacenista"})
public class SvEditAlmacenista extends HttpServlet {

    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Almacenista almacenista = control.traerAlmacenista(id);
        
        HttpSession misession = request.getSession();
        misession.setAttribute("almacenistaEditar", almacenista);
        
        System.out.println("El Gerente es: "+almacenista.getNombre());
        
        response.sendRedirect("editarAlmacenista.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int cedula = Integer.parseInt(request.getParameter("cedula"));
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String correoElectronico=request.getParameter("correoElectronica");
        String celular=request.getParameter("celular");
        
        Almacenista almacenista = (Almacenista)request.getSession().getAttribute("almacenistaEditar");
        almacenista.setCedula(cedula);
        almacenista.setNombre(nombre);
        almacenista.setApellido(apellido);
        almacenista.setCorreoElectronico(correoElectronico);
        almacenista.setCelular(celular);
        control.editarAlmacenista(almacenista);
        
        response.sendRedirect("SvAlmacenista");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
