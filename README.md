# LlanquihueTourApp – Semana 5

# Descripción

# Proyecto Java de consola para gestionar guías turísticos de Llanquihue Tour. Carga los registros desde un archivo de texto externo, muestra el catálogo completo y permite consultar guías por especialidad y ciudad.

# Estructura del proyecto

# LlanquihueTour\_ReinerTurra\_Semana5

# ├── src

# │   ├── app

# │   │   └── Main.java

# │   ├── model

# │   │   ├── Direccion.java

# │   │   └── GuiaTuristico.java

# │   ├── resources

# │   │   └── guias.txt

# │   ├── service

# │   │   └── GestorGuias.java

# │   └── util

# │       └── LectorArchivos.java

# ├── nbproject

# │   ├── build-impl.xml

# │   ├── genfiles.properties

# │   ├── project.properties

# │   └── project.xml

# ├── build.xml

# ├── manifest.mf

# ├── .gitignore

# └── README.md

# Estructura de paquetes

# \- app: contiene Main.java, punto de entrada del programa y demostración de las operaciones.

# \- model: contiene GuiaTuristico.java y Direccion.java, que representan al guía y su dirección.

# \- service: contiene GestorGuias.java, que mantiene la colección de guías y realiza listados y búsquedas.

# \- util: contiene LectorArchivos.java, responsable de leer y convertir los registros del archivo de texto.

# \- resources: contiene guias.txt, los registros de ejemplo cargados por la aplicación.

# Funcionalidades

# 1\. Carga guías desde src/resources/guias.txt.

# 2\. Almacena guías en una colección ArrayList.

# 3\. Muestra el catálogo completo.

# 4\. Filtra por especialidad (ejemplo: Excursiones Lacustres).

# 5\. Filtra por ciudad (ejemplo: Puerto Varas).

# 6\. Usa composición: GuiaTuristico contiene un objeto Direccion.

# 7\. Incluye validaciones básicas para campos y experiencia, y omite registros inválidos al cargar.

# Formato del archivo guias.txt

# Cada registro tiene 7 campos separados por punto y coma, en este orden:

# 

# RUT;Nombre;Especialidad;Años de experiencia;Calle;Ciudad;Región

# 

# Ejemplo:

# 

# 12345678-9;Daniel Silva;Excursiones Lacustres;5;Los Colonos 145;Puerto Varas;Los Lagos

# Cómo abrir y ejecutar en NetBeans

# 1\. Descomprimir el ZIP del proyecto.

# 2\. Abrir Apache NetBeans.

# 3\. Seleccionar File > Open Project.

# 4\. Buscar y seleccionar la carpeta LlanquihueTour\_ReinerTurra\_Semana5 (la carpeta que contiene build.xml y nbproject).

# 5\. Abrir el proyecto y ejecutar con F6 (Run Project).

# 6\. La salida de las operaciones se mostrará en la ventana Output.

# Autor

# Reiner Turra

# Asignatura

# Desarrollo Orientado a Objetos I

