package Logica;

import Logica.Proveedor;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-4.0.4.v20240719-r059428cdd2583c46f1f3e50d235854840a6fa9a7", date="2024-11-18T16:19:05")
@StaticMetamodel(Material.class)
@SuppressWarnings({"rawtypes", "deprecation"})
public class Material_ { 

    public static volatile SingularAttribute<Material, String> material;
    public static volatile SingularAttribute<Material, Integer> idMaterial;
    public static volatile SingularAttribute<Material, Proveedor> proveedor;
    public static volatile SingularAttribute<Material, Integer> cantidadMaterial;

}