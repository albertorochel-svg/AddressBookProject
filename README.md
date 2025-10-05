# AddressBookProject
Agenda
Sistema de Administración de Citas

Proyecto en Java SE – Universidad Tecmilenio
Aplicación de consola en Java para administrar doctores y citas médicas:
- Alta de doctores con especialidad
- Creación de citas por doctor, paciente, fecha y hora
- Listado y eliminación de citas
- Persistencia en **CSV** (doctores y citas) en una ruta local de Windows

Instalación y Configuración

Clonar el repositorio desde GitHub:

git clone https://github.com/albertorochel-svg/AddressBookProject.git


Abrir el proyecto en NetBeans (o cualquier IDE compatible con Java SE 8+).

Verificar la ruta del archivo CSV utilizada por el sistema:

C:\Users\PPC\Desktop\Tecmilenio\java\citas.csv


Compilar y ejecutar la clase principal:

Clinica.ClinicaApp

Uso del Programa

Al ejecutar el sistema, aparecerá un menú interactivo con opciones numeradas:

===== Sistema de Administración de Citas =====
Archivo CSV: C:\Users\PPC\Desktop\Tecmilenio\java\citas.csv

1. Agregar doctor
2. Lista de doctores
3. Crear cita
4. Citas registradas
5. Eliminar cita
6. Guardar a CSV
7. Cargar desde CSV
8. Salir
Selecciona una opción:

Funcionalidades:
Opción	Comando	Descripción
1	adddoctor	Da de alta un nuevo doctor con su especialidad.
2	doctores	Muestra la lista completa de doctores registrados.
3	create	Crea una nueva cita médica asignando doctor, paciente y hora.
4	citas	Lista todas las citas registradas.
5	delcita	Elimina una cita existente por su ID.
6	save	Guarda todos los cambios en el archivo CSV.
7	load	Carga la información desde el archivo CSV.
8	exit	Finaliza la aplicación.
Estructura del Proyecto
AddressBookProject/
│
├── src/
│   └── Clinica/
│       ├── ClinicaApp.java        # Clase principal (main)
│       ├── Doctor.java            # Clase para registro de doctores
│       ├── Cita.java              # Clase que representa una cita médica
│       ├── Administrador.java     # Clase que gestiona doctores y citas
│
├── C:\Users\PPC\Desktop\Tecmilenio\java\citas.csv   # Archivo CSV con los datos
│
├── bin/        # Contiene el archivo JAR ejecutable
├── lib/        # Dependencias del proyecto
├── config/     # Archivos de configuración
├── logs/       # Archivos de registro (vacío)
│
├── .gitignore
├── README.md
└── LICENSE (opcional)

Créditos

Autor: Alberto Rochel
Curso: Computación en Java®
Institución: Universidad Tecmilenio
Fecha: Octubre 2025

Licencia

Este proyecto se distribuye bajo la licencia MIT, permitiendo su uso educativo y de aprendizaje, citando al autor original.

Control de Versiones

Branch principal: master (versión estable)

Branch de desarrollo: develop (en progreso)

Cada funcionalidad (por ejemplo feature/crear_cita) tiene su propio branch que se integra en develop.

La versión final v1.0 está etiquetada en el branch master.

Requisitos Técnicos

Java SE 8 o superior

NetBeans IDE 12+ o IntelliJ IDEA
Sistema operativo Windows, Linux o macOS
