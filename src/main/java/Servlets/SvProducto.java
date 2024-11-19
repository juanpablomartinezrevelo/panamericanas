
package Servlets;

import Logica.Controladora;
import Logica.Producto;
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


@WebServlet(name = "SvProducto", urlPatterns = {"/SvProducto"})
public class SvProducto extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Producto> listaProducto = new ArrayList<Producto>();
        
        listaProducto = control.getProducto();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaProducto", listaProducto);
        
        System.out.println("lista de materiales: " + listaProducto.get(0));
        
        response.sendRedirect("verProducto.jsp");
         
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreProduc=request.getParameter("nombreProduc");
        String materialProducto = request.getParameter("materialProducto");
        String descripcion= request.getParameter("descripcion");
        int cantidadRegistrada = Integer.parseInt(request.getParameter("cantidadRegistrada"));
        
        control.crearProducto(nombreProduc,materialProducto,descripcion,cantidadRegistrada);
        
        response.sendRedirect("index.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}