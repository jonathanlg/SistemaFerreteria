package Controladores;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class CabecerasTablas {

    String articulos[] = {"Código", "Descripción", "Marca", "Proveedor", "Efectivo", "$ Calculad.", "Tarjeta", "Costo",
        "Fec. Compra", "Unidad", "Rubro", "Stock", "Stock Min."};
    String rubro[] = {"Código", "Rubro"};
    String marca[] = {"Código", "Marca"};
    String unidades[] = {"Código", "Unidades"};
    String vendedores[] = {"Código", "Nombre", "Dirección", "Teléfono", "Celular", "Sueldo", "Provincia", "Zona", "% Comision", "Email", "Observacion"};
    String clientes[] = {"Código", "Razón Social", "Contacto", "Vendedor", "Teléfono", "Celular", "Fax", "Rubro", "RUC", "Lmte.Cta",
        "Dirección", "Email", "Web", "Transporte", "Provincia"};
    String provedores[] = {"Código", "Razón Social", "Contacto", "Celular", "Teléfono", "Fax", "Dirección",
        "Provincia", "Email", "Web"};
    String tablaStock[] = {"Código", "Marca", "Descripción", "Stock"};
    String tablaAuxiliarArticulo[] = {"Codigo", "Rubro", "Descripcion", "Marca", "Precio"};
    String provincia[] = {"Código", "Provincia"};
    String transporte[] = {"Código", "Transporte"};
    String zona[] = {"Código", "Zona"};
    String detalleGasto[] = {"Código", "Descripción"};
    String motivo[] = {"Código", "Motivo"};
    String salidas[] = {"codArtículo", "Descripcion", "codMotivo", "Motivo", "Cant.", "Precio", "Importe", "sActual"};
    String conSalidas[] = {"Salida N°", "Fecha", "Hora", "Monto", "Indicador"};
    String detalleSalida[] = {"Motivo", "Cant.", "Codigo", "Desripción", "Precio"};
    String compras[] = {"Cant.", "Cod.", "Descripción", "Marca", "Precio", "Total"};
    String categoria[] = {"Código", "Categoría"};
    String factura[] = {"Cant.", "Cod.", "Descripción", "Precio", "Total", "sActual"};
    String presupuestos[] = {"Cant.", "Cod.", "Descripción", "Precio", "Total"};
    String conFactura[] = {"N° Factura", "Nombre Cliente", "Fecha", "Cód.Cli", "Desc.", "Total", "codVende"};
    String detalleFactura[] = {"Cant.", "Cód.", "Descripción", "Unidad", "Precio", "Total"};
    String consPresupuesto[] = {"N°", "Fecha", "Razon Social", "Cód. Clie", "Desc", "Total"};
    String detallePresupuestoF[] = {"Cant.", "Código", "Descripción", "Precio", "Total"};
    String busEmpleado[] = {"Cód", "Nombre Usuario", "Observación"};
    String consNotaCredito[] = {"N°", "Fecha", "Razon Social", "Cod. Clie", "Total", "Desc", "Fac"};
    String detalleNotaCredito[] = {"Cant.", "Cód", "Descripción", "Precio", "Total"};
    String usuario[] = {"Código", "Nombre Usuario", "Perfil", "Usuario", "Contraseña"};
    String comisiones[] = {"Fecha", "Fact.", "Cliente", "Total", "%Com.", "Comision"};
    String consCompras[] = {"Nro", "Fecha", "Proveedor", "Cod. Prov", "Total"};
    String consDetalleCompras[] = {"Cant.", "Cód.", "Descripción", "Precio", "Total"};
    String datos[][] = {};
    static DefaultTableModel modelo;
    TableColumn colum = null;

    public static void limpiarTablas(JTable tabla) {
        tabla.setModel(modelo);
        int filas = tabla.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

    public void consCompras(JTable tabla) {
        modelo = new DefaultTableModel(datos, consCompras);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(30);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(300);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(80);

    }

    public void consDetalleCompras(JTable tabla) {
        modelo = new DefaultTableModel(datos, consDetalleCompras);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(300);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(80);
    }

    public void usuario(JTable tabla) {
        modelo = new DefaultTableModel(datos, usuario);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(100);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void comision(JTable tabla) {
        modelo = new DefaultTableModel(datos, comisiones);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(60);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(60);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(250);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(60);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(80);
    }

    public void busEmpleado(JTable tabla) {
        modelo = new DefaultTableModel(datos, busEmpleado);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(200);
    }

    public void consNotaCredito(JTable tabla) {
        modelo = new DefaultTableModel(datos, consNotaCredito);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void detalleNotasCredito(JTable tabla) {
        modelo = new DefaultTableModel(datos, detalleNotaCredito);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(70);
    }

    public void consFacturasNotas(JTable tabla) {
        modelo = new DefaultTableModel(datos, conFactura);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void detallePresupuesto(JTable tabla) {
        modelo = new DefaultTableModel(datos, detallePresupuestoF);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(70);
    }

    public void consPresupuesto(JTable tabla) {
        modelo = new DefaultTableModel(datos, consPresupuesto);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void consFacturas(JTable tabla) {
        modelo = new DefaultTableModel(datos, conFactura);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void consFacturasA(JTable tabla) {
        modelo = new DefaultTableModel(datos, conFactura);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void detalleFactura(JTable tabla) {
        modelo = new DefaultTableModel(datos, detalleFactura);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(280);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(70);
    }

    public void detalleFacturaA(JTable tabla) {
        modelo = new DefaultTableModel(datos, detalleFactura);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(280);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(70);
    }

    public void presupuesto(JTable tabla) {
        modelo = new DefaultTableModel(datos, presupuestos);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(220);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(70);
    }

    public void factura(JTable tabla) {
        modelo = new DefaultTableModel(datos, factura);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(220);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(80);
    }

    public void buscarCliente(JTable tabla) {
        modelo = new DefaultTableModel(datos, clientes);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(130);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(150);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(100);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(100);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(100);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(7);
        colum.setPreferredWidth(100);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(8);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(9);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(10);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(11);
        colum.setPreferredWidth(200);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(12);
        colum.setPreferredWidth(200);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(13);
        colum.setPreferredWidth(80);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(14);
        colum.setPreferredWidth(80);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void categoria(JTable tabla) {
        modelo = new DefaultTableModel(datos, categoria);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(150);
    }

    public void busProveedor(JTable tabla) {
        modelo = new DefaultTableModel(datos, provedores);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(60);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(50);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(200);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(7);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(8);
        colum.setPreferredWidth(180);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(9);
        colum.setPreferredWidth(200);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void compras(JTable tabla) {
        modelo = new DefaultTableModel(datos, compras);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(60);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(60);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(190);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(60);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(60);
    }

    public void detalleSalidas(JTable tabla) {
        modelo = new DefaultTableModel(datos, detalleSalida);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(190);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(80);
    }

    public void consultaSalidas(JTable tabla) {
        modelo = new DefaultTableModel(datos, conSalidas);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(100);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(80);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void tablaArticuloAuxiliar(JTable tabla) {
        modelo = new DefaultTableModel(datos, articulos);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(150);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(200);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(130);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(7);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(8);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(9);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(10);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(11);
        colum.setPreferredWidth(60);
        colum = tabla.getColumnModel().getColumn(12);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void salidas(JTable tabla) {
        modelo = new DefaultTableModel(datos, salidas);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(80);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(80);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(150);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(7);
        colum.setPreferredWidth(80);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void motivo(JTable tabla) {
        modelo = new DefaultTableModel(datos, motivo);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(150);
    }

    public void provincias(JTable tabla) {
        modelo = new DefaultTableModel(datos, provincia);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(150);
    }

    public void transporte(JTable tabla) {
        modelo = new DefaultTableModel(datos, transporte);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(150);
    }

    public void zona(JTable tabla) {
        modelo = new DefaultTableModel(datos, zona);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(150);
    }

    public void detalleGasto(JTable tabla) {
        modelo = new DefaultTableModel(datos, detalleGasto);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(150);
    }

    public void ajusteStock(JTable tabla) {
        modelo = new DefaultTableModel(datos, articulos);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(60);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(150);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(200);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(130);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(7);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(8);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(9);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(10);
        colum.setPreferredWidth(90);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(11);
        colum.setPreferredWidth(130);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(12);
        colum.setPreferredWidth(90);
    }

    public void Articulos(JTable tabla) {
        modelo = new DefaultTableModel(datos, articulos);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(230);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(7);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(8);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(9);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(10);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(11);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(11);
        colum.setPreferredWidth(70);
    }

    public void rubro(JTable tabla) {
        modelo = new DefaultTableModel(datos, rubro);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(150);
    }

    public void marcas(JTable tabla) {
        modelo = new DefaultTableModel(datos, marca);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(150);
    }

    public void unidades(JTable tabla) {
        modelo = new DefaultTableModel(datos, unidades);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(150);
    }

    public void proveedor(JTable tabla) {
        modelo = new DefaultTableModel(datos, provedores);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(60);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(7);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(8);
        colum.setPreferredWidth(180);
        colum = tabla.getColumnModel().getColumn(9);
        colum.setPreferredWidth(200);
    }

    public void vendedor(JTable tabla) {
        modelo = new DefaultTableModel(datos, vendedores);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(50);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(7);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(8);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(9);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
        colum = tabla.getColumnModel().getColumn(10);
        colum.setPreferredWidth(70);
        colum.setMaxWidth(0);
        colum.setMinWidth(0);
        colum.setPreferredWidth(0);
    }

    public void cliente(JTable tabla) {
        modelo = new DefaultTableModel(datos, clientes);
        tabla.setModel(modelo);
        colum = tabla.getColumnModel().getColumn(0);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(1);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(2);
        colum.setPreferredWidth(130);
        colum = tabla.getColumnModel().getColumn(3);
        colum.setPreferredWidth(150);
        colum = tabla.getColumnModel().getColumn(4);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(5);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(6);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(7);
        colum.setPreferredWidth(100);
        colum = tabla.getColumnModel().getColumn(8);
        colum.setPreferredWidth(90);
        colum = tabla.getColumnModel().getColumn(9);
        colum.setPreferredWidth(70);
        colum = tabla.getColumnModel().getColumn(10);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(11);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(12);
        colum.setPreferredWidth(200);
        colum = tabla.getColumnModel().getColumn(13);
        colum.setPreferredWidth(80);
        colum = tabla.getColumnModel().getColumn(14);
        colum.setPreferredWidth(80);
    }
}
