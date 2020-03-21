
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerLibro {

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnRegistrarP;

    @FXML
    private Button btnRegistarDev;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblAutores;

    @FXML
    private Label lblEditorial;

    @FXML
    private Label lblAnio;

    @FXML
    private Label lblPrecio;

    @FXML
    private Label lblNumP;

    @FXML
    private Label lblNumCopy;

    @FXML
    private Label lblNumCopyD;

    @FXML
    private Label lblNumCopyP;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtAutores;

    @FXML
    private TextField txtEditorial;

    @FXML
    private TextField txtAnioEdicion;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtNumPaginas;

    @FXML
    private TextField txtNumCopias;

    @FXML
    private TextField txtNumCopyDisponibles;

    @FXML
    private TextField txtNumCopyPrestadas;
    
    private ModeloLibro modelo;
    public ControllerLibro(){
        modelo = new ModeloLibro();
    }
   

    @FXML
    void actualizarPantalla() {
        txtTitulo.setText(modelo.getTitulo());
        txtAutores.setText(modelo.getAutores());
        txtEditorial.setText(modelo.getEditorial());
        txtAnioEdicion.setText(Integer.toString(modelo.getAñoEdicion()));
        txtPrecio.setText(Integer.toString(modelo.getPrecio()));
        txtNumPaginas.setText(Integer.toString(modelo.getNumeroDePaginas()));
        txtNumCopias.setText(Integer.toString(modelo.getNumeroDeCopias()));
        txtNumCopyDisponibles.setText(Integer.toString(modelo.getNumeroDeCopiasDisponibles()));
        txtNumCopyPrestadas.setText(Integer.toString(modelo.getNumeroDeCopiasPrestadas()));

    }

    @FXML
    void guardarCambios() {
        modelo.setAutores(txtAutores.getText());
        modelo.setTitulo(txtTitulo.getText());
        modelo.setEditorial(txtEditorial.getText());
        modelo.setAñoEdicion(Integer.parseInt(txtAnioEdicion.getText()));
        modelo.setNumeroDePaginas(Integer.parseInt(txtNumPaginas.getText()));
        modelo.setPrecio(Integer.parseInt(txtPrecio.getText()));
        modelo.cambiarNumeroDeCopias(Integer.parseInt(txtNumCopias.getText()));
       

    }

    @FXML
    void registrarDevolucion() {
        modelo.devolver();
        actualizarPantalla();

    }

    @FXML
    void registrarPrestamo() {
        modelo.prestar();
        actualizarPantalla();

    }

}
