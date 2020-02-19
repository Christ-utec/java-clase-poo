import java.util.InputMismatchException;
import java.io.IOException;
import todaslasclases.*;
import java.util.Scanner;

class ClasePrincipal {

    // Metodo para mostrar los datos de una mejor forma
    public static void Mostrardatos() {
        System.out.println("Seleccione del 1 al 21 la clase cual quiere consultar:" + "\n");
        System.out.println("############################################################");
        System.out.println(
                "1- Casa" + "\t" + "2- Producto" + "\t" + "3- Celular" + "\t" + "4- Fiesta" + "\t" + "5- Universidad");
        System.out.println("6- Familia" + "\t" + "7- Salon de Clases" + "\t" + "8- Carrera" + "\t" + "9- Banco" + "\t"
                + "10- Farmacia");
        System.out.println("11- Hotel" + "\t" + "12- Iglesia" + "\t" + "13- Asignatura" + "\t" + "14- Libros" + "\t"
                + "15- Parque");
        System.out.println("16- " + "\t" + "17- " + "\t" + "18-" + "\t" + "19-" + "\t" + "20-");
        System.out.println("21- Salir");
        System.out.println("############################################################");
    }

    // Metodo para limpiar la pantalla del cmd al momento de ejecutarce
    public static void Limpiar() {
        try {
            // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            final String os = System.getProperty("os.name");
            if (os.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");

        } catch (Exception e) {
            /* No hacer nada */
        }
    }

    public static void main(final String[] args) throws IOException, InterruptedException {
        // Creacion de Objetos de las clases a utilizar
        Scanner sc = new Scanner(System.in);
        /* Clases Inicio */
        ModCasa cas = new ModCasa();
        ModProducto prod = new ModProducto();
        ModCelular celular = new ModCelular();
        ModFiesta fiesta = new ModFiesta();
        ModUniversidad univ = new ModUniversidad();
        ModFamilia Familia = new ModFamilia();
        ModSalonClases salonClases = new ModSalonClases();
        ModCarrera carrera = new ModCarrera();
        Banco banco = new Banco();
        Farmacia farmacia = new Farmacia();
        Hotel hotel = new Hotel();
        Iglesia iglesia = new Iglesia();
        ModAsignatura asignatura = new ModAsignatura();
        ModLibros libros = new ModLibros();
        Parque parque = new Parque();

        /* Clases Fin */
        int wardito;// Para guardar la oppcion seleccionada
        Boolean ward = false;// Its a ward no pregunten
        String comparacion;

        Mostrardatos();
        wardito = sc.nextInt();
        // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Limpiar();

        while (!ward) {

            try {

                switch (wardito) {

                    case 1:

                        System.out.println("Usted selecciono Casa como opcion");
                        System.out.println("Tomando datos de la clase Casa...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();
                        // Capturando datos de la clase...
                        System.out.println("Ingrese la Direccion:");
                        cas.direccion = sc.nextLine();
                        System.out.println("Ingrese la ubicacion:");
                        cas.ubicacion = sc.nextLine();
                        System.out.println("Ingrese el color de la casa:");
                        cas.color = sc.nextLine();
                        System.out.println("Ingrese si la casa tiene cochera:");
                        cas.cocheraDsp = sc.nextLine();
                        System.out.println("Ingrese el numero de cuartos en la casa:");
                        cas.numCuartos = sc.nextInt();
                        System.out.println("Ingrese el numero de banios de la casa:");
                        cas.numBanios = sc.nextInt();
                        System.out.println("Ingrese el numero de pisos en la casa:");
                        cas.numPisos = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el estado de la casa:");
                        cas.stado = sc.nextLine();

                        // Mostrando Datos de la clase:

                        System.out.println("\n" + "\n" + "Mostrando Datos de la clase Casa...." + "\n");
                        System.out.println("Direccion de la casa: " + cas.direccion);
                        System.out.println("Ubicacion de la casa: " + cas.ubicacion);
                        System.out.println("Color de la casa: " + cas.color);
                        System.out.println("Cochera disponible: " + cas.cocheraDsp);
                        System.out.println("El numero de cuartos es: " + cas.numCuartos);
                        System.out.println("El numero de banios es: " + cas.numBanios);
                        System.out.println("El numero de pisos es: " + cas.numPisos);
                        System.out.println("El estado de la casa es: " + cas.stado);
                        System.out.println("\n");

                        // Continue....
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 2:

                        System.out.println("Usted selecciono Producto como opcion");
                        System.out.println("Tomando datos de la clase Producto...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();
                        System.out.println("Ingrese el nombre del producto:");
                        prod.nombreP = sc.nextLine();
                        System.out.println("Ingrese los detalles del producto:");
                        prod.detalles = sc.nextLine();
                        System.out.println("Ingrese el tipo de producto:");
                        prod.tipoP = sc.nextLine();
                        System.out.println("Ingrese la cantidad de productos:");
                        prod.cantidadP = sc.nextInt();
                        System.out.println("Ingrese el numero de lote del producto:");
                        prod.lote = sc.nextInt();
                        System.out.println("Ingrese el precio del producto:");
                        prod.precio = sc.nextDouble();
                        System.out.println("Ingrese la fecha de entrega del producto:");
                        prod.Fechaentrega = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Ingrese el proveedor:");
                        prod.proveedor = sc.nextLine();

                        // Mostrando Datos de la clase:

                        System.out.println("\n" + "\n" + "Mostrando Datos de la clase Producto...." + "\n");
                        System.out.println("Producto:   " + prod.nombreP);
                        System.out.println("Detalles:   " + prod.detalles);
                        System.out.println("Tipo:       " + prod.tipoP);
                        System.out.println("cantidad:   " + prod.cantidadP);
                        System.out.println("Numero Lote: " + prod.lote);
                        System.out.println("Precio:       $" + prod.precio);
                        System.out.println("Fecha entrega: " + prod.Fechaentrega);
                        System.out.println("Proveedor: " + prod.proveedor);
                        System.out.println("\n");

                        // Continue....
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 3:
                        // Encabezado de la toma de datos y seleccion
                        System.out.println("Usted selecciono Celular como opcion");
                        System.out.println("Tomando datos de la clase Celular...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("Ingrese Modelo del celular:");
                        celular.modelo = sc.nextLine();
                        System.out.println("Ingrese la marca:");
                        celular.marca = sc.nextLine();
                        System.out.println("Ingrese el color:");
                        celular.color = sc.nextLine();
                        System.out.println("Ingrese la resolucion de la pantalla:");
                        celular.resolucion = sc.nextLine();
                        System.out.println("Ingrese el procesador:");
                        celular.procesador = sc.nextLine();
                        System.out.println("Ingrese el tipo de sistema operativo:");
                        celular.sysO = sc.nextLine();
                        System.out.println("Ingrese la cantidad de ram:");
                        celular.cantRam = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el precio:");
                        celular.precio = sc.nextDouble();

                        // Mostrando Datos de la clase:

                        System.out.println("\n" + "\n" + "Mostrando Datos de la clase Celular...." + "\n");
                        System.out.println("Modelo:   " + celular.modelo);
                        System.out.println("Marca:   " + celular.marca);
                        System.out.println("Color:       " + celular.color);
                        System.out.println("Resolucion:   " + celular.resolucion);
                        System.out.println("Procesador:" + celular.procesador);
                        System.out.println("Sistema Operativo: " + celular.sysO);
                        System.out.println("Cantidad de ram:" + celular.cantRam);
                        System.out.println("Precio : $" + celular.precio);
                        System.out.println("\n");

                        // Continue....
                        sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 4:
                        // Encabezado de la toma de datos y seleccion
                        System.out.println("Usted seleccion Fiesta como opcion");
                        System.out.println("Tomando datos de la clase Fiesta...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        // Tomando Datos de la Clase
                        System.out.println("Hora de inicio:");
                        fiesta.hora = sc.nextLine();
                        System.out.println("Ingrese la fecha:");
                        fiesta.fecha = sc.nextLine();
                        System.out.println("Ingrese el lugar:");
                        fiesta.lugar = sc.nextLine();
                        System.out.println("Ingrese que tipo de fista sera:");
                        fiesta.tipo = sc.nextLine();
                        System.out.println("Ingrese si habra parqueos disponibles:");
                        fiesta.parqueoDisp = sc.nextLine();
                        System.out.println("Ingrese si requiere invitacion:");
                        fiesta.invitacion = sc.nextLine();
                        System.out.println("Ingrese si habra barra libre:");
                        fiesta.barraLibre = sc.nextLine();

                        System.out.println("Ingese si habra baile:");
                        fiesta.baile = sc.nextLine();

                        // Mostrando Datos de la clase:
                        System.out.println("\n" + "\n" + "Mostrando Datos de la clase Fiesta...." + "\n");
                        System.out.println("Hora:" + fiesta.hora);
                        System.out.println("Fecha:" + fiesta.fecha);
                        System.out.println("Lugar:       " + fiesta.lugar);
                        System.out.println("Tipo de fiesta:   " + fiesta.tipo);
                        System.out.println("Parqueo disponible:" + fiesta.parqueoDisp);
                        System.out.println("Requiere invitacion: " + fiesta.invitacion);
                        System.out.println("Habra barra libre: " + fiesta.barraLibre);
                        System.out.println("Habra baile: " + fiesta.baile);
                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 5:
                        // Encabezado de la toma de datos y seleccion
                        System.out.println("Usted seleccion Universidad como opcion");
                        System.out.println("Tomando datos de la clase Universidad...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        // Tomando Datos de la Clase
                        System.out.println("Nombre:");
                        univ.nombre = sc.nextLine();
                        System.out.println("Ingrese la region:");
                        univ.region = sc.nextLine();
                        System.out.println("Ingrese el tipo de universidad:");
                        univ.tipo = sc.nextLine();
                        System.out.println("Ingrese las carreras:");
                        univ.carreras = sc.nextLine();
                        System.out.println("Ingrese las facultades disponibles:");
                        univ.facultades = sc.nextLine();
                        System.out.println("Ingrese los edificios:");
                        univ.edificios = sc.nextLine();
                        System.out.println("Ingrese si hay campus:");
                        univ.campus = sc.nextLine();

                        System.out.println("Ingese los laboratorios disponibles:");
                        univ.laboratorios = sc.nextLine();

                        // Mostrando Datos de la clase:
                        System.out.println("\n" + "\n" + "Mostrando Datos de la clase Universidad...." + "\n");
                        System.out.println("Nombre:" + univ.nombre);
                        System.out.println("Region:" + univ.region);
                        System.out.println("Tipo:       " + univ.tipo);
                        System.out.println("Carreras:   " + univ.carreras);
                        System.out.println("Facultades:" + univ.facultades);
                        System.out.println("Edificios: " + univ.edificios);
                        System.out.println("Campus: " + univ.campus);
                        System.out.println("Laboratorios: " + univ.laboratorios);
                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 6:
                        System.out.println("Usted seleccion Familia como opcion");
                        System.out.println("Tomando datos de la clase Familia...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("Ingrese la cantidad de miembros de la familia");
                        Familia.cantidad = sc.nextInt();
                        System.out.println("Ingrese el apellido de la Familia");
                        Familia.apellidos = sc.nextLine();
                        System.out.println("Ingrese si es Familia: Grande, Mediana o Small");
                        Familia.size = sc.nextLine();
                        System.out.println("Ingrese un breve resumen de los eventos que hacen en familia:");
                        Familia.descripcion = sc.nextLine();

                        System.out.println("Cantidad de Miembros: " + Familia.cantidad);
                        System.out.println("Apellidos de la Familia: " + Familia.apellidos);
                        System.out.println("El tamano de la familia es: " + Familia.size);
                        System.out.println("Que hace tu familia juntos: " + Familia.descripcion);

                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }
                        break;

                    case 7:
                        System.out.println("Usted seleccion Salon de clases como opcion");
                        System.out.println("Tomando datos de la clase Salon de clases...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("Ingrese el piso del edificio");
                        salonClases.piso = sc.nextLine();
                        System.out.println("Ingrese el numero de cuantos alumnos caben");
                        salonClases.capacidad = sc.nextInt();
                        System.out.println("Ingrese el estado del salon");
                        salonClases.estado = sc.nextLine();
                        System.out.println("Ingrese el numero de edificio");
                        salonClases.numero = sc.nextLine();

                        System.out.println("El piso del salon de clase es: " + salonClases.piso);
                        System.out.println("Capacidad de alumnos: " + salonClases.capacidad);
                        System.out.println("Estado del salon del clases: " + salonClases.estado);
                        System.out.println("Numero de edificio que pertenece: " + salonClases.numero);
                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }
                        break;

                    case 8:
                        System.out.println("Usted seleccion Carrera como opcion");
                        System.out.println("Tomando datos de la clase Carrera...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("Ingrese el nombre de la Carrera: ");
                        carrera.nombre = sc.nextLine();
                        System.out.println("Ingrese la cantidad de materias para esta tarea");
                        carrera.cantidadMaterias = sc.nextInt();
                        System.out.println("Ingrese si esta disponible la materia");
                        carrera.estado = sc.nextLine();
                        System.out.println("Ingrese el tipo de carrera. Por ejemp. Lic, Ing, etc...");
                        carrera.tipo = sc.nextLine();

                        System.out.println("La carrera ingresada es: " + carrera.nombre);
                        System.out.println("Cantidad de materias para esta carrera" + carrera.cantidadMaterias);
                        System.out.println("La carrera esta disponible? " + carrera.estado);
                        System.out.println("Ingrese el tipo de carrera: " + carrera.tipo);

                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }
                    case 9:
                        System.out.println("Usted seleccion Banco como opcion");
                        System.out.println("Tomando datos de la clase Banco...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("Ingrese nombre del banco");
                        banco.nombreBa = sc.nextLine();
                        System.out.println("Ingrese la direccion del banco");
                        banco.direccion = sc.nextLine();
                        System.out.println("Ingrese el horario de atencion");
                        banco.horario = sc.nextLine();
                        System.out.println("Ingrese los tipos de servicio");
                        banco.tiposServicio = sc.nextLine();
                        System.out.println("");
                        System.out.println("===========================");
                        System.out.println("INFORMACION DEL BANCO");
                        System.out.println("El nombre del banco es : " + banco.nombreBa);
                        System.out.println("La direccion es : " + banco.direccion);
                        System.out.println("El horario de atencion es : " + banco.horario);
                        System.out.println("Los tipos de servicio son : " + banco.tiposServicio);

                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 10:
                        System.out.println("Usted seleccion Farmacia como opcion");
                        System.out.println("Tomando datos de la clase Farmacia...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("Ingrese el nombre de la farmacia");
                        farmacia.nombreFa = sc.nextLine();
                        System.out.println("Ingrese la direccion de la farmacia");
                        farmacia.direccion = sc.nextLine();
                        System.out.println("Ingrese el numero de telefono de la farmacia");
                        farmacia.nuTelefono = sc.nextLine();
                        System.out.println("Ingrese el nombre de la medicina");
                        farmacia.medicina = sc.nextLine();
                        System.out.println("==============================");
                        System.out.println("La farmacia se llama : " + farmacia.nombreFa);
                        System.out.println("La direccion es : " + farmacia.direccion);
                        System.out.println("El numero de telefono es : " + farmacia.nuTelefono);
                        System.out.println("El medicamento es : " + farmacia.medicina);

                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 11:
                        System.out.println("Usted seleccion Hotel como opcion");
                        System.out.println("Tomando datos de la clase Hotel...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("INFORMACION DE HOTEL");
                        System.out.println("");
                        System.out.println("Ingrese el nombre del hotel");
                        hotel.nombreHotel = sc.nextLine();
                        System.out.println("Donde esta ubicado el hotel");
                        hotel.ubicacion = sc.nextLine();
                        System.out.println("Numero de telefono");
                        hotel.nuTelefono = sc.nextLine();
                        System.out.println("Precio por estadia");
                        hotel.precio = sc.nextLine();
                        System.out.println("");
                        System.out.println("LOS DATOS INGRESADOS SON");
                        System.out.println("El nombre del Hotel es :" + hotel.nombreHotel);
                        System.out.println("La ubicacion es :" + hotel.ubicacion);
                        System.out.println("El numero de telefono es :" + hotel.nuTelefono);
                        System.out.println("El precio es :" + hotel.precio);

                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 12:
                        System.out.println("Usted seleccion Iglesia como opcion");
                        System.out.println("Tomando datos de la clase Iglesia...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("Ingrese la ubicacion de la iglesia");
                        iglesia.ubicacion = sc.nextLine();
                        System.out.println("Ingrese el horario de la iglesia");
                        iglesia.horario = sc.nextLine();
                        System.out.println("Ingrese la religion que es");
                        iglesia.religion = sc.nextLine();
                        System.out.println("Ingrese el nombre del pastor");
                        iglesia.pastor = sc.nextLine();
                        System.out.println("");
                        System.out.println("================================");
                        System.out.println("INFORMACION DE LA IGLESIA");
                        System.out.println("La iglesia esta ubicada en : " + iglesia.ubicacion);
                        System.out.println("Los horarios son : " + iglesia.horario);
                        System.out.println("La religion es : " + iglesia.religion);
                        System.out.println("El pastor es : " + iglesia.pastor);

                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 13:
                        System.out.println("Usted seleccion Asignatura como opcion");
                        System.out.println("Tomando datos de la clase Asignatura...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("Nombre de la asignatura");
                        asignatura.nombre = sc.nextLine();
                        System.out.println("Escriba la aula donde se imparte");
                        asignatura.aula = sc.nextLine();
                        System.out.println("Escriba el horario de la asignatura");
                        asignatura.horario = sc.nextLine();
                        System.out.println("Escriba la carrera a la que pertenece");
                        asignatura.carrera = sc.nextLine();

                        System.out.println("Nombre de la asignatura: " + asignatura.nombre);
                        System.out.println("Aula en la que se imparte: " + asignatura.aula);
                        System.out.println("Horario para la asignatura: " + asignatura.horario);
                        System.out.println("Carrera que pertence: " + asignatura.carrera);

                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 14:
                        System.out.println("Usted seleccion Libros como opcion");
                        System.out.println("Tomando datos de la clase Libros...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("Ingrese el nombre del libro");
                        libros.nombre = sc.nextLine();
                        System.out.println("Autor del libro");
                        libros.autor = sc.nextLine();
                        System.out.println("Ingrese la fecha de lanzamiento del libro");
                        libros.fechaLanzamiento = sc.nextLine();
                        System.out.println("Ingrese le valor del libro. Ejemp: 100.11");
                        libros.precio = sc.nextFloat();

                        System.out.println("Nombre del libro: " + libros.nombre);
                        System.out.println("Fecha de lazanmiento: " + libros.fechaLanzamiento);
                        System.out.println("Autor: " + libros.autor);
                        System.out.println("Precio: " + libros.precio);

                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                        break;

                    case 15:
                        System.out.println("Usted seleccion Parque como opcion");
                        System.out.println("Tomando datos de la clase Parque...");
                        System.out.println("#########################################################" + "\n");
                        sc.nextLine();

                        System.out.println("Ingrese el nombre del parque");
                        parque.nombrePar = sc.nextLine();
                        System.out.println("Ingrese la ubicacion del parque");
                        parque.ubicacion = sc.nextLine();
                        System.out.println("Ingrese el horario de atencion");
                        parque.horario = sc.nextLine();
                        System.out.println("Ingrese las reglas del parque");
                        parque.reglas = sc.nextLine();
                        System.out.println("==================================");
                        System.out.println("El nombre del parque es : " + parque.nombrePar);
                        System.out.println("La ubicacion del parque es : " + parque.ubicacion);
                        System.out.println("El horario de atencion es : " + parque.horario);
                        System.out.println("Las reglas son : " + parque.reglas);

                        System.out.println("\n");

                        // Continue....
                        // sc.nextLine();
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }
                        
                        break;

                    case 21:
                        ward = true;
                        break;
                    default:
                        System.out.println("Solo datos validos, no se pasen...");
                        sc.nextLine();
                        // Continue....
                        System.out.println("Desea continuar S o N?");
                        comparacion = sc.nextLine();

                        if (comparacion.equals("s")) {
                            Mostrardatos();
                            wardito = sc.nextInt();
                            Limpiar();
                        } else {
                            ward = true;
                        }

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número...");
                sc.next();
            }

        }
    }

}