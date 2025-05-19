import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {


        Localidad localidad1 = new Localidad("Guaymallen", "Mendoza", "Argentina");
        Localidad localidad2 = new Localidad("Providencia", "Santiago", "Chile");


        Domicilio domicilio1 = new Domicilio("Belgrano", 123, 5501, "Godoy Cruz", "Mendoza", "Argentina");
        Domicilio domicilio2 = new Domicilio("Bolivar", 43, 204, localidad2);

        Sucursal sucursal1 = new Sucursal("Centro", LocalTime.of(9, 0), LocalTime.of(18, 0));
        sucursal1.setDomicilio(domicilio1);

        Sucursal sucursal2 = new Sucursal("Campo", LocalTime.of(9, 0), LocalTime.of(18, 0), domicilio2);

        Empresa empresa1 = new Empresa("Empresa1", "Arcor S.A", 777888456);
        empresa1.addSucursal(sucursal1);
        Empresa empresa2 = new Empresa("Empresa2", "Microsoft Inc", 32452355, sucursal2);

        Categoria categoria1 = new Categoria("Bebidas");
        Categoria categoria2 = new Categoria("Comidas");

        UnidadMedida um1 = new UnidadMedida("Litros");
        UnidadMedida um2 = new UnidadMedida("Unidades");

        Promocion promocion1 = new Promocion("Jueves de Pizza", LocalDate.of(2025, 05, 30), LocalDate.of(2025, 06, 30), LocalTime.of(12, 30), LocalTime.of(22, 30), "Descuento en pizzas los Jueves", 60.0, TipoPromocion.promocion1);
        Promocion promocion2 = new Promocion("Happy Hour", LocalDate.of(2025, 05, 30), LocalDate.of(2025, 06, 30), LocalTime.of(21, 30), LocalTime.of(22, 30), "Descuento en bebidas", 15.0, TipoPromocion.happyHour);

        Usuario usuario1 = new Usuario("123", "juancliente");
        Usuario usuario2 = new Usuario("456", "adminuser");
        Cliente cliente1 = new Cliente("Juan", "Pérez", "123456789", "juan@mail.com", LocalDate.of(1990, 1, 1));
        Cliente cliente2 = new Cliente("Ana", "Gomez", "987654321", "ana@mail.com", LocalDate.of(2000, 2, 5));

        Imagen img1 = new Imagen("promo_pizza.jpg");
        Imagen img2 = new Imagen("promo_empanada.jpg");


        ArticuloInsumo insumo1harina = new ArticuloInsumo(150.0, 100, 300, true, "Harina", 250.0);
        ArticuloInsumo insumo2sal = new ArticuloInsumo(80.0, 50, 150, false, "Sal", 100.0);
        ArticuloInsumo insumo3carnemolida = new ArticuloInsumo(120.0, 10, 50, true, "Carne molida", 200);
        ArticuloInsumo insumo5masaempanada = new ArticuloInsumo(40.0, 50, 100, true, "Masas para preparar empanadas", 100);
        ArticuloInsumo insumo6cebolla = new ArticuloInsumo(30.0, 10, 30, true, "Cebolla", 40);
        ArticuloInsumo insumo4morron = new ArticuloInsumo(20.0,20,100,true, "morron", 20 );
        ArticuloInsumo insumo7aceite = new ArticuloInsumo(25.0, 10, 30, false, "Aceite", 30);
        ArticuloInsumo insumo8queso = new ArticuloInsumo(100.0,20,100,true,"queso",100);
        ArticuloInsumo insumo9tomate = new ArticuloInsumo(15.0, 10, 30, false, "Tomate", 25);
        ArticuloInsumo insumo10oregano = new ArticuloInsumo(10.0,20,50,true,"oregano",10);
        ArticuloInsumo insumo11cervezacorona = new ArticuloInsumo(100.0, 20, 40, false, "Cerveza corona 1 litro", 200);
        ArticuloManufacturado manufacturado1 = new ArticuloManufacturado("Pizza Napolitana", 1200.0, "Pizza con queso, tomate y oregano", 15, "Hornear a 220°C por 15 minutos");
        ArticuloManufacturado manufacturado2 = new ArticuloManufacturado("Empanada de Carne", 100.0, "Empanada rellena de carne picada", 10, "Hornear a 200°C por 10 minutos");


        manufacturado1.addDetalle(3, insumo8queso);
        manufacturado1.addDetalle(2,insumo9tomate);
        manufacturado2.addDetalle(1,insumo3carnemolida);

        manufacturado2.addDetalle(2, insumo4morron);
        manufacturado2.addDetalle(48, insumo5masaempanada);


        ArticuloManufacturadoDetalle detalle1 = new ArticuloManufacturadoDetalle(1, insumo1harina);
        manufacturado1.addDetalle(detalle1);
        ArticuloManufacturadoDetalle detalle2 = new ArticuloManufacturadoDetalle(1, insumo7aceite);
        manufacturado1.addDetalle(detalle2);



        Pedido pedido1 = new Pedido(LocalTime.of(22, 00),1600, 1000, TipoEnvio.delivery, FormaPago.MercadoPago, LocalDate.of(2025, 05, 16));
        DetallePedido detallePedido1 = new DetallePedido(1, 1000, manufacturado1);
        DetallePedido detallePedido2 = new DetallePedido(3, 600, insumo11cervezacorona);
        pedido1.addDetallePedido(detallePedido1);
        pedido1.addDetallePedido(detallePedido2);
        Pedido pedido2 = new Pedido(LocalTime.of(21, 30),1000, 500, TipoEnvio.TakeAway, FormaPago.efectivo, LocalDate.of(2025, 05, 17));
        DetallePedido detallePedido3= new DetallePedido(6, 600, manufacturado2);
        DetallePedido detallePedido4 = new DetallePedido(1, 200, insumo11cervezacorona);
        pedido2.addDetallePedido(detallePedido3);
        pedido2.addDetallePedido(detallePedido4);

        Factura factura1 = new Factura(LocalDate.of(2025, 5, 16), 4534, 92340, "3045A", "Efectivo", FormaPago.efectivo, 1800.0);
        Factura factura2 = new Factura(LocalDate.of(2025,6,2), 5567, 1234, "5564","Mercado Pago",FormaPago.MercadoPago, 1000.0);



        pedido1.setFactura(factura1);
        pedido2.setFactura(factura2);


        System.out.println(pedido1);

    }

}