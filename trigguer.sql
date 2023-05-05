CREATE DEFINER=`root`@`localhost` TRIGGER `detalle_venta_BEFORE_INSERT` BEFORE INSERT ON `detalle_venta` FOR EACH ROW BEGIN
declare stock_temp int;
set stock_temp=(select cantidad from productos where new.id_producto = productos.codigo)-new.cantidad;
if (stock_temp>=0) then
 update productos set cantidad = stock_temp where codigo=new.id_producto;
 set new.totalDetalle = new.cantidad * (select precio from productos where new.id_producto = codigo);
 update factura set totalFactura= totalFactura+new.totalDetalle where numero_factura=new.id_numeroFactura;
else
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'No tiene suficiente stock';
END if;
END