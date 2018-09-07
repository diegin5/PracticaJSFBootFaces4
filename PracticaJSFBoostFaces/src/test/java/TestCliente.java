
import com.mycompany.controllerimpl.ClienteCtrlImpl;
import com.mycompany.dao.ClienteDAO;
import com.mycompany.modell.Cliente;
import java.util.ArrayList;

public class TestCliente {
    static ArrayList<Cliente> list = new ArrayList<>();
    
    public static void main(String[] args) {
        ClienteDAO catdao;
        catdao = new ClienteCtrlImpl();
        /*list = catdao.readCategoria();
        for(Categoria item: list){
            System.out.println(""+item.getName_cat());
        }*/
        Cliente cat = new Cliente();
        cat.setId_cliente("3");
        cat.setNombres_razon_social("upeu");
            cat.setTelefono("937440609");
        cat.setEmail("goku@hotmail.com");
        cat.setDni_ruc("7233124");
        if(catdao.createCliente(cat)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
}