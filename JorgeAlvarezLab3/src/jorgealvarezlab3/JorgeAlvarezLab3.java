/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarezlab3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ofici
 */
public class JorgeAlvarezLab3 {

    static ArrayList<Carro> Carros = new ArrayList();
    static ArrayList<Cliente> Clientes = new ArrayList();
    static ArrayList<Empleado> Empleados = new ArrayList();
    static ArrayList<Venta> Ventas = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opc;
        do {
            opc = JOptionPane.showInputDialog(
                    "Menu Principal\n"
                    + "1. Agregar\n"
                    + "2. Modificar\n"
                    + "3. Eliminar\n"
                    + "4. Venta\n"
                    + "5. Reporte de ventas\n"
                    + "6. Salir");
            switch (opc) {
                case "1":
                    menuAgregar();
                    break;
                case "2":
                    menuModificar();
                    break;
                case "3":
                    menuEliminar();
                    break;
                case "4":
                    venta();
                    break;
                case "5":
                    listar(Ventas);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No es una opción válida");
            }
        } while (!opc.equals("6"));

    }

    public static void venta() {
        int posEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el empleado al que asignarle un cliente\n" + listar(Empleados)));
        if (Empleados.get(posEmpleado).getClient() != null) {
            Clientes.add(Empleados.get(posEmpleado).getClient());
        }
        int posCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cliente que desea asignarle al empleado\n" + listar(Clientes)));
        ((Empleado) (Empleados.get(posEmpleado))).setClient(Clientes.get(posCliente));
        Clientes.remove(posCliente);
        int posCarro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición del carro\n" + listar(Carros)));
        if (Empleados.get(posEmpleado).getClient().getDinero() >= Carros.get(posCarro).getPrecio()) {
            Empleados.get(posEmpleado).getClient().addCarro(Carros.get(posCarro));
            Ventas.add(new Venta(Carros.get(posCarro), Empleados.get(posEmpleado), Clientes.get(posCliente), Carros.get(posCarro).getPrecio(), leeFecha()));
        } else {
            JOptionPane.showMessageDialog(null, "No cuenta con dinero suficiente");
        }

    }

    public static void menuAgregar() {
        String opc = JOptionPane.showInputDialog(
                "¿Qué desea agregar?\n"
                + "1. Carro\n"
                + "2. Cliente\n"
                + "3. Empleado\n");
        switch (opc) {
            case "1":
                menuAgregarCarro();
                break;
            case "2":
                addmodCliente(-1);
                break;
            case "3":
                addmodEmpleado(-1);
                break;
        }

    }

    public static void menuAgregarCarro() {
        String opc = JOptionPane.showInputDialog(
                "Ingrese el tipo de carro que desea agregar\n"
                + "1. MayBach\n"
                + "2. Morgan Aero 8\n"
                + "3. Fisker Automotive\n"
                + "4. Tramontana\n");
        switch (opc) {
            case "1":
                addmodMayBach(-1);
                break;
            case "2":
                addmodMorganAero8(-1);
                break;
            case "3":
                addmodFiskerAutomotive(-1);
            case "4":
                addmodTramontana(-1);
            default:
                JOptionPane.showInputDialog("No es una opción válida");
        }

    }

    public static void menuModificar() {
        String opc = JOptionPane.showInputDialog(
                "¿Qué desea agregar?\n"
                + "1. Carro\n"
                + "2. Cliente\n"
                + "3. Empleado\n");
        switch (opc) {
            case "1":
                menuModificarCarro();
                break;
            case "2":
                int pos = Integer.parseInt(JOptionPane.showInputDialog(listar(Clientes) + "Ingrese la posicion de lo que desea modificar"));
                if (pos >= 0 || pos < Clientes.size()) {
                    addmodCliente(pos);
                } else {
                    JOptionPane.showMessageDialog(null, "No es una opción válida");
                }
                break;
            case "3":
                int pos2 = Integer.parseInt(JOptionPane.showInputDialog(listar(Empleados) + "Ingrese la posicion de lo que desea modificar"));
                if (pos2 >= 0 || pos2 < Empleados.size()) {
                    addmodEmpleado(pos2);
                } else {
                    JOptionPane.showMessageDialog(null, "No es una opción válida");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
        }
    }

    public static void menuModificarCarro() {
        String opc = JOptionPane.showInputDialog(
                "Ingrese el tipo de carro que desea agregar\n"
                + "1. MayBach\n"
                + "2. Morgan Aero 8\n"
                + "3. Fisker Automotive\n"
                + "4. Tramontana\n");
        switch (opc) {
            case "1":
                int pos = Integer.parseInt(JOptionPane.showInputDialog(listarMayBach(Carros) + "Ingrese la posicion de lo que desea modificar"));
                if (Carros.get(pos) instanceof MayBach && (pos >= 0 || pos < Carros.size())) {
                    addmodMayBach(pos);
                } else {
                    JOptionPane.showMessageDialog(null, "No es una opción válida");
                }
                break;
            case "2":
                int pos2 = Integer.parseInt(JOptionPane.showInputDialog(listarMorganAero8(Carros) + "Ingrese la posicion de lo que desea modificar"));
                if (Carros.get(pos2) instanceof MorganAero8 && (pos2 >= 0 || pos2 < Carros.size())) {
                    addmodMayBach(pos2);
                } else {
                    JOptionPane.showMessageDialog(null, "No es una opción válida");
                }
                break;
            case "3":
                int pos3 = Integer.parseInt(JOptionPane.showInputDialog(listarFiskerAutomotive(Carros) + "Ingrese la posicion de lo que desea modificar"));
                if (Carros.get(pos3) instanceof FiskerAutomotive && (pos3 >= 0 || pos3 < Carros.size())) {
                    addmodMayBach(pos3);
                } else {
                    JOptionPane.showMessageDialog(null, "No es una opción válida");
                }
            case "4":
                int pos4 = Integer.parseInt(JOptionPane.showInputDialog(listarTramontana(Carros) + "Ingrese la posicion de lo que desea modificar"));
                if (Carros.get(pos4) instanceof Tramontana && (pos4 >= 0 || pos4 < Carros.size())) {
                    addmodMayBach(pos4);
                } else {
                    JOptionPane.showMessageDialog(null, "No es una opción válida");
                }
            default:
                JOptionPane.showInputDialog("No es una opción válida");
        }
    }

    public static void menuEliminar() {
        String opc = JOptionPane.showInputDialog("Ingrese lo que desea eliminar\n"
                + "1. Carro\n"
                + "2. Cliente\n"
                + "3. Carro");
        switch (opc) {
            case "1":
                int pos = Integer.parseInt(JOptionPane.showInputDialog(listar(Carros) + "Ingrese el carro que desea eliminar"));
                Carros.remove(pos);
                break;
            case "2":
                int pos2 = Integer.parseInt(JOptionPane.showInputDialog(listar(Empleados) + "Ingrese el empleado que desea eliminar"));
                Empleados.remove(pos2);
                break;
            case "3":
                int pos3 = Integer.parseInt(JOptionPane.showInputDialog(listar(Carros) + "Ingrese el carro que desea eliminar"));
                Carros.remove(pos3);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
        }
    }

    public static void addmodMayBach(int pos) {
        String opc = "1";
        boolean agregar = false;
        if (pos == -1) {
            Carros.add(new MayBach());
            pos = Carros.size() - 1;
            agregar = true;
        } else {
            opc = JOptionPane.showInputDialog("Ingrese lo que desea modificar\n"
                    + "1. Color\n"
                    + "2. Fecha\n"
                    + "3. Kilometros por galón\n"
                    + "4. Marca de llantas\n"
                    + "5. No. de serie\n"
                    + "6. Polarizado\n"
                    + "7. Precio\n"
                    + "8. Velocidad máxima\n"
                    + "9. Cantidad de llantas de repuesto\n");
        }

        switch (opc) {
            //Clase Carro
            case "1":
                Carros.get(pos).setColor(leeColor());
                if (!agregar) {
                    break;
                }
            case "2":
                Carros.get(pos).setFechaEnsamblado(leeFecha());
                if (!agregar) {
                    break;
                }
            case "3":
                Carros.get(pos).setKMxGalon(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }
                break;
            case "4":
                Carros.get(pos).setMarcaDeLlantas(JOptionPane.showInputDialog("Ingrese la marca de llantas"));
                if (!agregar) {
                    break;
                }
                break;
            case "5":
                Carros.get(pos).setNoSerie(JOptionPane.showInputDialog("Ingrese número de serie"));
                if (!agregar) {
                    break;
                }
                break;
            case "6":
                Carros.get(pos).setPolarizado(JOptionPane.showInputDialog("Ingrese si es polarizado o no"));
                if (!agregar) {
                    break;
                }
                break;
            case "7":
                Carros.get(pos).setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de venta")));
                if (!agregar) {
                    break;
                }
                break;
            case "8":
                Carros.get(pos).setVelocidadMax(Float.parseFloat(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }

            //Clase Carro
            case "9":
                ((MayBach) (Carros.get(pos))).setLlantasRepuesto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
        }
    }

    public static void addmodMorganAero8(int pos) {
        String opc = "1";
        boolean agregar = false;
        if (pos == -1) {
            Carros.add(new MayBach());
            pos = Carros.size() - 1;
            agregar = true;
        } else {
            opc = JOptionPane.showInputDialog("Ingrese lo que desea modificar\n"
                    + "1. Color\n"
                    + "2. Fecha\n"
                    + "3. Kilometros por galón\n"
                    + "4. Marca de llantas\n"
                    + "5. No. de serie\n"
                    + "6. Polarizado\n"
                    + "7. Precio\n"
                    + "8. Velocidad máxima\n"
                    + "9. Si es convertible\n"
                    + "10. Cabina");
        }

        switch (opc) {
            //Clase Carro
            case "1":
                Carros.get(pos).setColor(leeColor());
                if (!agregar) {
                    break;
                }
            case "2":
                Carros.get(pos).setFechaEnsamblado(leeFecha());
                if (!agregar) {
                    break;
                }
            case "3":
                Carros.get(pos).setKMxGalon(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }
                break;
            case "4":
                Carros.get(pos).setMarcaDeLlantas(JOptionPane.showInputDialog("Ingrese la marca de llantas"));
                if (!agregar) {
                    break;
                }
                break;
            case "5":
                Carros.get(pos).setNoSerie(JOptionPane.showInputDialog("Ingrese número de serie"));
                if (!agregar) {
                    break;
                }
                break;
            case "6":
                Carros.get(pos).setPolarizado(JOptionPane.showInputDialog("Ingrese si es polarizado o no"));
                if (!agregar) {
                    break;
                }
                break;
            case "7":
                Carros.get(pos).setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de venta")));
                if (!agregar) {
                    break;
                }
                break;
            case "8":
                Carros.get(pos).setVelocidadMax(Float.parseFloat(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }
            //Clase Carro
            case "9":
                ((MorganAero8) (Carros.get(pos))).setConvertible(JOptionPane.showInputDialog("Ingrese si es CONVERTIBLE o SENCILLO"));
                if (!agregar) {
                    break;
                }
            case "10":
                ((MorganAero8) (Carros.get(pos))).setCabina(JOptionPane.showInputDialog("Ingrese si es cabina UNICA o DOBLE"));
                if (!agregar) {
                    break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
        }
    }

    public static void addmodFiskerAutomotive(int pos) {
        String opc = "1";
        boolean agregar = false;
        if (pos == -1) {
            Carros.add(new MayBach());
            pos = Carros.size() - 1;
            agregar = true;
        } else {
            opc = JOptionPane.showInputDialog("Ingrese lo que desea modificar\n"
                    + "1. Color\n"
                    + "2. Fecha\n"
                    + "3. Kilometros por galón\n"
                    + "4. Marca de llantas\n"
                    + "5. No. de serie\n"
                    + "6. Polarizado\n"
                    + "7. Precio\n"
                    + "8. Velocidad máxima\n"
                    + "9. Si es camioneta o turismo\n"
                    + "10. Si es convertible");
        }

        switch (opc) {
            //Clase Carro
            case "1":
                Carros.get(pos).setColor(leeColor());
                if (!agregar) {
                    break;
                }
            case "2":
                Carros.get(pos).setFechaEnsamblado(leeFecha());
                if (!agregar) {
                    break;
                }
            case "3":
                Carros.get(pos).setKMxGalon(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }
                break;
            case "4":
                Carros.get(pos).setMarcaDeLlantas(JOptionPane.showInputDialog("Ingrese la marca de llantas"));
                if (!agregar) {
                    break;
                }
                break;
            case "5":
                Carros.get(pos).setNoSerie(JOptionPane.showInputDialog("Ingrese número de serie"));
                if (!agregar) {
                    break;
                }
                break;
            case "6":
                Carros.get(pos).setPolarizado(JOptionPane.showInputDialog("Ingrese si es polarizado o no"));
                if (!agregar) {
                    break;
                }
                break;
            case "7":
                Carros.get(pos).setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de venta")));
                if (!agregar) {
                    break;
                }
                break;
            case "8":
                Carros.get(pos).setVelocidadMax(Float.parseFloat(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }
            //Clase Carro
            case "9":
                ((FiskerAutomotive) (Carros.get(pos))).setCamionetaOTurismo(JOptionPane.showInputDialog("Ingrese si es CAMIONETA o TURISMO"));
                if (!agregar) {
                    break;
                }
            case "10":
                ((FiskerAutomotive) (Carros.get(pos))).setConvertible(JOptionPane.showInputDialog("Ingrese si es CONVERTIBLE o SENCILLO"));
                if (!agregar) {
                    break;
                }
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
        }
    }

    public static void addmodTramontana(int pos) {
        String opc = "1";
        boolean agregar = false;
        if (pos == -1) {
            Carros.add(new MayBach());
            pos = Carros.size() - 1;
            agregar = true;
        } else {
            opc = JOptionPane.showInputDialog("Ingrese lo que desea modificar\n"
                    + "1. Color\n"
                    + "2. Fecha\n"
                    + "3. Kilometros por galón\n"
                    + "4. Marca de llantas\n"
                    + "5. No. de serie\n"
                    + "6. Polarizado\n"
                    + "7. Precio\n"
                    + "8. Velocidad máxima\n"
                    + "9. Peso\n"
                    + "10. Transmisión\n");
        }

        switch (opc) {
            //Clase Carro
            case "1":
                Carros.get(pos).setColor(leeColor());
                if (!agregar) {
                    break;
                }
            case "2":
                Carros.get(pos).setFechaEnsamblado(leeFecha());
                if (!agregar) {
                    break;
                }
            case "3":
                Carros.get(pos).setKMxGalon(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }
                break;
            case "4":
                Carros.get(pos).setMarcaDeLlantas(JOptionPane.showInputDialog("Ingrese la marca de llantas"));
                if (!agregar) {
                    break;
                }
                break;
            case "5":
                Carros.get(pos).setNoSerie(JOptionPane.showInputDialog("Ingrese número de serie"));
                if (!agregar) {
                    break;
                }
                break;
            case "6":
                Carros.get(pos).setPolarizado(JOptionPane.showInputDialog("Ingrese si es polarizado o no"));
                if (!agregar) {
                    break;
                }
                break;
            case "7":
                Carros.get(pos).setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de venta")));
                if (!agregar) {
                    break;
                }
                break;
            case "8":
                Carros.get(pos).setVelocidadMax(Float.parseFloat(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }
            //Clase Carro
            case "9":
                ((Tramontana) (Carros.get(pos))).setPeso(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso")));
                if (!agregar) {
                    break;
                }
            case "10":
                ((Tramontana) (Carros.get(pos))).setTransmision(Integer.parseInt(JOptionPane.showInputDialog("Ingrese los cambios de transmisión")));
                if (!agregar) {
                    break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
        }
    }

    public static void addmodEmpleado(int pos) {
        String opc = "1";
        boolean agregar = false;
        if (pos == -1) {
            Empleados.add(new Empleado());
            pos = Empleados.size() - 1;
            agregar = true;
        } else {
            opc = JOptionPane.showInputDialog("Ingrese lo que desea modificar\n"
                    + "1. Altura\n"
                    + "2. Edad\n"
                    + "3. Ingrese ID\n"
                    + "4. Ingrese el peso\n"
                    + "5. Peso\n"
                    + "6. Ingrese la cantidad de horas laborales\n");
        }

        switch (opc) {
            //Clase Persona
            case "1":
                Empleados.get(pos).setAltura(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura")));
                if (!agregar) {
                    break;
                }
            case "2":
                Empleados.get(pos).setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
                if (!agregar) {
                    break;
                }
            case "3":
                Empleados.get(pos).setID(JOptionPane.showInputDialog("Ingrese el ID"));
                if (!agregar) {
                    break;
                }
            case "4":
                Empleados.get(pos).setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
                if (!agregar) {
                    break;
                }
            case "5":
                Empleados.get(pos).setPeso(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso")));
                if (!agregar) {
                    break;
                }
            //Clase Persona
            case "9":
                ((Empleado) (Empleados.get(pos))).setHorasLaborales(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de horas laborales")));
                if (!agregar) {
                    break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
        }
    }

    public static void addmodCliente(int pos) {
        String opc = "1";
        boolean agregar = false;
        if (pos == -1) {
            Clientes.add(new Cliente());
            pos = Clientes.size() - 1;
            agregar = true;
        } else {
            opc = JOptionPane.showInputDialog("Ingrese lo que desea modificar\n"
                    + "1. Altura\n"
                    + "2. Edad\n"
                    + "3. Ingrese ID\n"
                    + "4. Ingrese el peso\n"
                    + "5. Peso\n");
        }

        switch (opc) {
            //Clase Persona
            case "1":
                Clientes.get(pos).setAltura(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura")));
                if (!agregar) {
                    break;
                }
            case "2":
                Clientes.get(pos).setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
                if (!agregar) {
                    break;
                }
            case "3":
                Clientes.get(pos).setID(JOptionPane.showInputDialog("Ingrese el ID"));
                if (!agregar) {
                    break;
                }
            case "4":
                Clientes.get(pos).setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
                if (!agregar) {
                    break;
                }
            case "5":
                Clientes.get(pos).setPeso(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso")));
                if (!agregar) {
                    break;
                }
            //Clase Persona
            case "9":
                ((Cliente) (Clientes.get(pos))).setDinero(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de dinero")));
                if (!agregar) {
                    break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
        }
    }

    public static Cliente escogerCliente() {
        int pos = Integer.parseInt(JOptionPane.showInputDialog(listar(Clientes) + "\n Ingrese el cliente que desea agregar."));
        return Clientes.get(pos);
    }

    public static Date leeFecha() {
        Date fecha = new Date();
        return fecha;
    }

    public static Color leeColor() {
        Color color = null;
        color = color.yellow;
        return color;
    }

    public static String listar(ArrayList Array) {
        String lista = "";
        for (int i = 0; i < Array.size(); i++) {
            lista += i + ". " + Array.get(i).toString() + "\n";
        }
        return lista;
    }

    public static String listarMayBach(ArrayList Array) {
        String lista = "";
        for (int i = 0; i < Array.size(); i++) {
            if (Array.get(i) instanceof MayBach) {
                lista += i + ". " + Array.get(i).toString() + "\n";
            }
        }
        return lista;
    }

    public static String listarMorganAero8(ArrayList Array) {
        String lista = "";
        for (int i = 0; i < Array.size(); i++) {
            if (Array.get(i) instanceof MorganAero8) {
                lista += i + ". " + Array.get(i).toString() + "\n";
            }
        }
        return lista;
    }

    public static String listarFiskerAutomotive(ArrayList Array) {
        String lista = "";
        for (int i = 0; i < Array.size(); i++) {
            if (Array.get(i) instanceof FiskerAutomotive) {
                lista += i + ". " + Array.get(i).toString() + "\n";
            }
        }
        return lista;
    }

    public static String listarTramontana(ArrayList Array) {
        String lista = "";
        for (int i = 0; i < Array.size(); i++) {
            if (Array.get(i) instanceof Tramontana) {
                lista += i + ". " + Array.get(i).toString() + "\n";
            }
        }
        return lista;
    }

}
