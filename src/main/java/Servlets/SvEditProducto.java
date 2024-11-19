
package Servlets;

import Logica.Controladora;
import Logica.Gerente;
import Logica.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEditProducto", urlPatterns = {"/SvEditProducto"})
public class SvEditProducto extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Producto producto = control.traerProducto(id);
        
        HttpSession misession = request.getSession();
        misession.setAttribute("productoEditar", producto);
        
        System.out.println("El Producto es: "+producto.getNombre());
        
        response.sendRedirect("editarProducto.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreProduc=request.getParameter("nombreProduc");
        String materialProducto = request.getParameter("materialProducto");
        String descripcion= request.getParameter("descripcion");
        int cantidadRegistrada = Integer.parseInt(request.getParameter("cantidadRegistrada"));
        
        Producto producto = (Producto) request.getSession().getAttribute("productoEditar");
        
        producto.setNombre(nombreProduc);
        producto.setMaterialProducto(materialProducto);
        producto.setDescripcion(descripcion);
        producto.setCantidadRegistrada(cantidadRegistrada);
        control.editarProductor(producto);
        
        response.sendRedirect("SvProducto");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
