# AddressBookProject
Agenda
Sistema de Administracion de Citas

Repositorio: https://github.com/albertorochel-svg/AddressBookProject.git

Descripcion general

Este proyecto es una aplicacion en Java que permite administrar citas medicas de manera sencilla.
El sistema permite registrar doctores con su especialidad, crear citas con fecha y hora, listar, eliminar y guardar toda la informacion en un archivo CSV.
Fue desarrollado como parte del curso Computacion en Java en la Universidad Tecmilenio.

Instalacion y configuracion

Requisitos previos

Java SE 8 o superior

NetBeans IDE 12 o superior

Sistema operativo Windows, Linux o macOS

Clonar o descargar el repositorio

git clone https://github.com/albertorochel-svg/AddressBookProject.git


Abrir en NetBeans

Abre NetBeans

Selecciona File -> Open Project

Busca la carpeta descargada AddressBookProject y abre el proyecto

Configurar la ruta del archivo CSV
El sistema utiliza archivos CSV para guardar los datos de doctores y citas.
Asegurate de tener creada la siguiente ruta:

C:\Users\PPC\Desktop\Tecmilenio\java\


Los archivos generados seran:

doctores.csv

citas.csv

Ejecucion

Compila y ejecuta el proyecto desde la clase principal:

ClinicaApp.java


En consola aparecera el siguiente menu interactivo:

===== Sistema de administracion de citas =====
1. Agregar doctor
2. Lista de doctores
3. Crear cita
4. Citas registradas
5. Eliminar cita
6. Guardar (CSV)
7. Cargar (CSV)
8. Salir
Selecciona una opcion (1-8):

Funcionalidades
Opcion	Descripcion
1	Agregar doctor: registra un nuevo doctor con su especialidad
2	Lista de doctores: muestra los doctores registrados
3	Crear cita: permite registrar una cita indicando paciente, doctor, fecha y hora
4	Citas registradas: lista todas las citas guardadas
5	Eliminar cita: elimina una cita usando su ID
6	Guardar (CSV): guarda toda la informacion en archivos CSV
7	Cargar (CSV): recarga la informacion desde los archivos CSV
8	Salir: finaliza el programa
Estructura del proyecto
AddressBookProject/
│
├── src/
│   └── Clinica/
│       ├── ClinicaApp.java
│       ├── Clinica.java
│       ├── Doctor.java
│       ├── Cita.java
│       ├── Paciente.java
│       └── Administrador.java
│
├── C:\Users\PPC\Desktop\Tecmilenio\java\
│       ├── doctores.csv
│       └── citas.csv
│
├── .gitignore
├── README.md
└── LICENSE (opcional)

Creditos

Autor: Alberto Rochel
Curso: Computacion en Java
Institucion: Universidad Tecmilenio
Fecha: Octubre 2025

Licencia

Este proyecto se distribuye bajo la licencia MIT, permitiendo su uso con fines educativos, academicos y de aprendizaje, citando al autor original.

Control de versiones (Git)

Branch principal: master (version estable)

Branch de desarrollo: develop (version en desarrollo)

Branchs de funcionalidad: feature/agregar-doctor, feature/crear-cita, etc.

Version estable: v1.0

Ultima actualizacion: Octubre 2025

Carpetas complementarias
Carpeta	Contenido
/bin	Archivo JAR exportado del sistema
/lib	Librerias adicionales (si aplica)
/config	Archivos de configuracion
/logs	Carpeta vacia para logs de ejecucion
Resumen tecnico

El programa usa clases Java para modelar doctores y citas

Los datos se almacenan en archivos CSV mediante clases de lectura y escritura (BufferedReader y BufferedWriter)
