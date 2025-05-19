# 📦 Modelo de Entidades - Buen Sabor

Este repositorio contiene la definición del **modelo de entidades** para el sistema *Buen Sabor*. A continuación se detalla la **división de trabajo** y las **responsabilidades** asignadas a cada integrante del equipo.

---

## 👥 División de Trabajo

### 🧑‍💼 Johana Quiroga - Usuarios y Clientes

**Responsabilidades:**
- Modelar la autenticación y roles del sistema.
- Gestionar los datos personales de los clientes.
- Definir cómo se relacionan los usuarios con el sistema.

**Entidades a desarrollar:**
- `Usuario`
- `Rol` (Enum)
- `Cliente`

---

### 🏢 Lucas Ledesma - Empresa y Sucursales

**Responsabilidades:**
- Modelar la estructura de la empresa y su ubicación geográfica.
- Relacionar sucursales con domicilios y ubicación completa.

**Entidades a desarrollar:**
- `Empresa`
- `Sucursal`
- `Domicilio`
- `Localidad`
- `Provincia`
- `Pais`

---

### 🧾 Gianina Crespo - Pedidos y Facturación

**Responsabilidades:**
- Modelar cómo se realizan y procesan los pedidos.
- Incluir medios de pago, tipos de envío y facturación.

**Entidades a desarrollar:**
- `Pedido`
- `DetallePedido`
- `Factura`
- `Estado` (Enum)
- `FormaPago` (Enum)
- `TipoEnvio` (Enum)

---

### 🛒 Constanza Trubiano - Artículos y Categorías

**Responsabilidades:**
- Modelar los productos, ya sean insumos o manufacturados.
- Incluir detalles de elaboración y su clasificación.

**Entidades a desarrollar:**
- `Articulo`
- `ArticuloInsumo`
- `ArticuloManufacturado`
- `ArticuloManufacturadoDetalle`
- `UnidadMedida`
- `Categoria`

---

### 🎯 Juan Pablo Gomez - Promociones e Imágenes

**Responsabilidades:**
- Modelar campañas de descuentos y promociones.
- Asociar imágenes a productos u otras entidades.

**Entidades a desarrollar:**
- `Promocion`
- `TipoPromocion` (Enum)
- `Imagen`
