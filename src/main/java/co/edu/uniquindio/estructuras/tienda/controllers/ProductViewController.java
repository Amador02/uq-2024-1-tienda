package co.edu.uniquindio.estructuras.tienda.controllers;

import co.edu.uniquindio.estructuras.tienda.logicviewcontrollers.ProductViewLogicController;
import co.edu.uniquindio.estructuras.tienda.model.Producto;
import co.edu.uniquindio.estructuras.tienda.services.IProductoController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class ProductViewController implements IProductoController {
	private ProductViewLogicController logicController;

	@FXML
	private Label lblNombre, lblPrecio, lblStock;

	@FXML
	private TextField tfCantidad;

	@FXML
	void masEvent(ActionEvent event) {
		logicController.masAction();
	}

	@FXML
	void menosEvent(ActionEvent event) {
		logicController.menosAction();
	}

	@FXML
	private BorderPane root;

	@FXML
	void ordenarEvent(ActionEvent event) {
		ordenarAction();
	}

	@Override
	public void setProducto(Producto p) {
		if (logicController == null)
			cargarLogica();
		logicController.setProducto(p);
	}

	private void ordenarAction() {
	}

	public void cargarLogica() {
		logicController = new ProductViewLogicController();
		logicController.cargarLabels(lblNombre, lblPrecio, lblStock, root, tfCantidad);
	}

}
