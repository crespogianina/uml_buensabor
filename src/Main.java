import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        //Instanciamos pais,provincia,localidad,domicilio
        Pais pais = new Pais("Argentina");
        Pais pais2 = new Pais("Chile");

        Provincia provincia = new Provincia("Mendoza", pais);
        Provincia provincia2 = new Provincia("Santiago", pais2);


        Localidad localidad1 = new Localidad("Guaymallen", provincia);
        Localidad localidad2 = new Localidad("Providencia", provincia2);
        Localidad localidad3 = new Localidad("Lujan de cuyo", provincia2);

        Domicilio domicilio1 = new Domicilio("Bandera de los Andes", 43, 204, localidad1);
        Domicilio domicilio2 = new Domicilio("Bolivar", 42, 534, localidad2);
        Domicilio domicilio3 = new Domicilio("Shetland del sur", 43, 657, localidad3);

        //Instanciamos sucursal y añadicos categorias
        Sucursal sucursal1 = new Sucursal("Centro", LocalTime.of(9, 0), LocalTime.of(18, 0), domicilio1);
        Sucursal sucursal2 = new Sucursal("Campo", LocalTime.of(9, 0), LocalTime.of(18, 0), domicilio2);

        Categoria categoria1 = new Categoria("Bebidas");
        Categoria categoria2 = new Categoria("Comidas");
        sucursal1.addCategoria(categoria1);
        sucursal1.addCategoria(categoria2);
        sucursal2.addCategoria(categoria1);
        sucursal2.addCategoria(categoria2);

        //Instanciamos empresas y añadimos sucursales
        Empresa empresa1 = new Empresa("Empresa1", "Arcor S.A", 777888456);
        empresa1.addSucursal(sucursal1);
        Empresa empresa2 = new Empresa("Empresa2", "Microsoft Inc", 32452355, sucursal2);


        UnidadMedida um1 = new UnidadMedida("Litros");
        UnidadMedida um2 = new UnidadMedida("Unidades");
        UnidadMedida um3 = new UnidadMedida("Gramos");
        UnidadMedida um4 = new UnidadMedida("Kilos");

        //Instanciamos articulos
        ArticuloInsumo insumo1harina = new ArticuloInsumo(200, "Harina", 1500, um4, 5, 20, true);
        ArticuloInsumo insumo2sal = new ArticuloInsumo(80.0, "Sal", 1500, um3, 10, 20, false);
        ArticuloInsumo insumo3carnemolida = new ArticuloInsumo(600, "Carne_molida", 1500, um3, 5, 20, true);
        ArticuloInsumo insumo6cebolla = new ArticuloInsumo(600, "Cebolla", 2500, um4, 5, 20, true);
        ArticuloInsumo insumo4morron = new ArticuloInsumo(600, "Morron", 1500, um4, 5, 20, true);
        ArticuloInsumo insumo7aceite = new ArticuloInsumo(600, "Aceite", 1500, um1, 5, 20, true);
        ArticuloInsumo insumo8queso = new ArticuloInsumo(600, "Queso", 1500, um1, 5, 20, true);
        ArticuloInsumo insumo9tomate = new ArticuloInsumo(15.0, "Tomate", 1500, um4, 10, 30, false);
        ArticuloInsumo insumo10oregano = new ArticuloInsumo(10.0, "oregano", 1500, um3, 10, 50, true);
        ArticuloInsumo insumo11cervezacorona = new ArticuloInsumo(100.0, "Cerveza corona 1 litro", 1500, um1, 3, 50, false);

        ArticuloManufacturado manufacturado1 = new ArticuloManufacturado("Pizza Napolitana", um2, 1500.0, "Pizza con queso, tomate y oregano", 15, "Hornear a 220°C por 15 minutos");
        ArticuloManufacturado manufacturado2 = new ArticuloManufacturado("Empanada de Carne", um2, 1500.0, "Empanada rellena de carne picada", 10, "Hornear a 200°C por 10 minutos");

        ArticuloManufacturadoDetalle detalle = new ArticuloManufacturadoDetalle(8, insumo9tomate);
        ArticuloManufacturadoDetalle detalle2 = new ArticuloManufacturadoDetalle(8, insumo4morron);
        ArticuloManufacturadoDetalle detalle3 = new ArticuloManufacturadoDetalle(8, insumo1harina);

        manufacturado1.addDetalle(detalle);
        manufacturado1.addDetalle(detalle2);
        manufacturado2.addDetalle(detalle3);

        //Creamos promiciones y la agregamos a las sucursales
        Promocion promocion1 = new Promocion("Jueves de Pizza", LocalDate.of(2025, 05, 30), LocalDate.of(2025, 06, 30), LocalTime.of(12, 30), LocalTime.of(22, 30), "Descuento en pizzas los Jueves", 60.0, TipoPromocion.PROMOCION1);
        promocion1.addArticulo(insumo1harina);
        promocion1.addArticulo(insumo8queso);
        promocion1.addArticulo(insumo9tomate);

        Promocion promocion2 = new Promocion("Happy Hour", LocalDate.of(2025, 05, 30), LocalDate.of(2025, 06, 30), LocalTime.of(21, 30), LocalTime.of(22, 30), "Descuento en bebidas", 15.0, TipoPromocion.HAPPYHOUR);
        promocion2.addArticulo(insumo11cervezacorona);
        sucursal1.addPromocion(promocion2);
        sucursal2.addPromocion(promocion1);

        Imagen img1 = new Imagen("promo_pizza.jpg");
        Imagen img2 = new Imagen("promo_empanada.jpg");

        promocion1.addImagen(img1);
        promocion2.addImagen(img2);

        Pedido pedido1 = new Pedido(LocalTime.of(22, 00), 1600, 1000, TipoEnvio.DELIVERY, FormaPago.MERCADO_PAGO, LocalDate.of(2025, 05, 16));
        DetallePedido detallePedido1 = new DetallePedido(1, 1000, manufacturado1);
        DetallePedido detallePedido2 = new DetallePedido(3, 600, insumo11cervezacorona);
        pedido1.addDetallePedido(detallePedido1);
        pedido1.addDetallePedido(detallePedido2);
        pedido1.setSucursal(sucursal1);
        pedido1.setDomicilio(domicilio3);

        Pedido pedido2 = new Pedido(LocalTime.of(21, 30), 1000, 500, TipoEnvio.TAKEAWAY, FormaPago.EFECTIVO, LocalDate.of(2025, 05, 17));
        DetallePedido detallePedido3 = new DetallePedido(6, 600, manufacturado2);
        DetallePedido detallePedido4 = new DetallePedido(1, 200, insumo11cervezacorona);
        pedido2.setSucursal(sucursal2);
        pedido2.setDomicilio(domicilio1);

        pedido2.addDetallePedido(detallePedido3);
        pedido2.addDetallePedido(detallePedido4);

        Factura factura1 = new Factura(LocalDate.of(2025, 5, 16), 4534, 92340, "3045A", "Efectivo", FormaPago.EFECTIVO, 1800.0);
        Factura factura2 = new Factura(LocalDate.of(2025, 6, 2), 5567, 1234, "5564", "Mercado Pago", FormaPago.MERCADO_PAGO, 1000.0);


        pedido1.setFactura(factura1);
        pedido2.setFactura(factura2);

        Imagen imgUsuario1 = new Imagen("usuario1.jpg");
        Imagen imgUsuario2 = new Imagen("usuario2.jpg");

        Usuario usuario1 = new Usuario("123", "juancliente");
        Usuario usuario2 = new Usuario("456", "adminuser");

        Cliente cliente1 = new Cliente("Juan", "Pérez", "123456789", "juan@mail.com", LocalDate.of(1990, 1, 1));
        cliente1.setImagen(imgUsuario1);
        cliente1.setUsuario(usuario1);
        cliente1.addDomicilio(domicilio3);

        Cliente cliente2 = new Cliente("Ana", "Gomez", "987654321", "ana@mail.com", LocalDate.of(2000, 2, 5));
        cliente2.setUsuario(usuario2);
        cliente2.setImagen(imgUsuario2);
        cliente1.addDomicilio(domicilio2);

        cliente1.addPedido(pedido1);
        cliente2.addPedido(pedido2);


        System.out.println("---------------------CLIENTE 1------------------------");
        System.out.println(cliente1);
        System.out.println("----------------------CLIENTE2--------------------------");
        System.out.println(cliente2);


    }

}
