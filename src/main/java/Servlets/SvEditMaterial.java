
package Servlets;

import Logica.Controladora;
import Logica.Material;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEditMaterial", urlPatterns = {"/SvEditMaterial"})
public class SvEditMaterial extends HttpServlet {
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Material matter = control.traerMaterial(id);
        
        HttpSession misession = request.getSession();
        misession.setAttribute("matterEditar", matter);
        
        System.out.println("El Material es: "+matter.getMaterial());
        
        response.sendRedirect("editarMaterial.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String material = request.getParameter("material");
        int cantidadMaterial = Integer.parseInt(request.getParameter("cantidadMaterial"));
        
        
        Material matter = (Material)request.getSession().getAttribute("matterEditar");
        matter.setMaterial(material);
        matter.setCantidadMaterial(cantidadMaterial);
        
        
        control.editarMaterial(matter);
        
        response.sendRedirect("SvMaterial");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
