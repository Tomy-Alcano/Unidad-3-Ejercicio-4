# Unidad-3-Ejercicio-4
Programacion 3 unidad 3 Ejercicio 4
Ejercicio 4 — Tabla con selección y formulario
Este ejercicio trabaja el patrón más común en aplicaciones de gestión: seleccionar una fila de la tabla para cargar sus datos en un formulario. Es la base del ABM que construiremos más adelante.

Construí una ventana con la siguiente estructura:

Una JTable en la zona CENTER con las columnas: Legajo, Nombre, Apellido, Carrera
La tabla debe iniciar con al menos 4 filas de datos cargadas en el código
Un panel en la zona SOUTH con los siguientes campos:
Etiqueta y campo de texto para Legajo (no editable)
Etiqueta y campo de texto para Nombre
Etiqueta y campo de texto para Apellido
Etiqueta y campo de texto para Carrera
Un botón con el texto "Limpiar campos"
El comportamiento esperado es el siguiente:

Cuando el usuario haga clic sobre una fila de la tabla, los datos de esa fila deben cargarse automáticamente en los campos del formulario
Al presionar "Limpiar campos", todos los campos del formulario deben vaciarse
💡 Tip: para detectar el clic sobre la tabla usá addMouseListener. Dentro del evento, obtené la fila seleccionada con tabla.getSelectedRow() y luego leé cada celda con modelo.getValueAt(fila, columna).
<img width="855" height="616" alt="image" src="https://github.com/user-attachments/assets/4557f9c4-08f6-434d-8878-3197eadfbf0f" />
<img width="858" height="620" alt="image" src="https://github.com/user-attachments/assets/4e2b233d-5052-4bea-a909-b442c05985c4" />

