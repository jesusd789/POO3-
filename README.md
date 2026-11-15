# POO - Unidad 3

Talleres 18 (Principio de Segregación de Interfaces, ISP) y 19 (Principio de Inversión de Dependencias, DIP).
Cada carpeta es un ejemplo o ejercicio independiente.

## Carpetas

- `t18-ejemplo1-restaurante/`
- `t18-ejemplo2-notificaciones/`
- `t18-violacion1-empleado/`
- `t18-violacion2-notificacion/`
- `t18-ejercicio1-mantenimiento/`
- `t18-ejercicio2-operaciones-bancarias/`
- `t18-ejercicio3-vehiculos/`
- `t19-ejemplo1-pagos/`
- `t19-ejemplo2-notificaciones/`
- `t19-violacion1-procesador-concreto/`
- `t19-violacion2-notificador-concreto/`
- `t19-ejercicio1-autenticacion/`
- `t19-ejercicio2-almacenamiento/`
- `t19-ejercicio3-reportes/`

## Como ejecutar

```bash
cd t19-ejemplo1-pagos
javac *.java
java Main
```

En los ejercicios del Taller 18, las subcarpetas `antes/` (interfaz grande, viola ISP) y `despues/` (interfaces segregadas) se compilan y ejecutan por separado.
Las carpetas `*-violacion*` muestran el mal diseño a propósito: compilan, pero rompen el principio.
