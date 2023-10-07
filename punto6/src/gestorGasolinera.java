import java.util.*;
import java.util.HashMap;

public class gestorGasolinera {
    Map<Integer, Empleado> empleados = new HashMap<>();
    Map<Integer, venta> ventas = new HashMap<>();
    Map<Integer, cliente> clientes = new HashMap<>();
    Map<Integer, expendedor> expendedoras = new HashMap<>();
    ArrayList<cliente> top10cliente = new ArrayList<>();
    int querosenPorDolar = 1;
    int naftaPorDolar = 5;
    int gasoilPorDolar = 10;
    int idEmpleado = 0;
    int idVenta = 0;
    int idCliente = 0;
    int idExpendedora = 0;


    public void VentasPorCombustible(){
        int ventasNafta = 0;
        int ventasGasoil = 0;
        int ventasquerosen = 0;
        for (Map.Entry<Integer, venta> entry :ventas.entrySet()){
            venta v = entry.getValue();
            if (Objects.equals(v.getTipoCombustible(), "Nafta")){
                ventasNafta += v.getPago();
            }else if(Objects.equals(v.getTipoCombustible(), "Gasoil")){
                ventasGasoil = v.getPago();
            }else{
                ventasquerosen += v.getPago();
            }
        }
        int totalVentas = ventasGasoil + ventasNafta + ventasquerosen;
        System.out.println("el total de ventas del gasoil es: " + ventasGasoil / totalVentas);
        System.out.println("el total de ventas del querosen es: " + ventasquerosen / totalVentas);
        System.out.println("el total de ventas del nafta es: " + ventasNafta / totalVentas);
    }

    public void surtidoresPorLitros(){
        ArrayList<expendedor> expededorasOrdenadas = new ArrayList<>();
        for (Map.Entry<Integer,expendedor> expe : expendedoras.entrySet()){
            expendedor e = expe.getValue();
            expededorasOrdenadas.add(e);
        }
        quickSortExpendedores(expededorasOrdenadas, 0, expededorasOrdenadas.size() - 1,0);
        for (expendedor exp : expededorasOrdenadas) {
            exp.mostrar();
        }
    }

    public void surtidoresPorVentas (){
        ArrayList<expendedor> expededorasOrdenadas = new ArrayList<>();
        for (Map.Entry<Integer,expendedor> expe : expendedoras.entrySet()){
            expendedor e = expe.getValue();
            expededorasOrdenadas.add(e);
        }
        quickSortExpendedores(expededorasOrdenadas, 0, expededorasOrdenadas.size() - 1,1);
        for (expendedor exp : expededorasOrdenadas) {
            exp.mostrar();
        }

    }

    public void empleadorPorVentas(){
        ArrayList<Empleado> empleadosOrdenados = new ArrayList<>();
        for (Map.Entry<Integer,Empleado> emple : empleados.entrySet()){
            Empleado e = emple.getValue();
            empleadosOrdenados.add(e);
        }
        quickSortEmpleados(empleadosOrdenados, 0, empleadosOrdenados.size() - 1);
        for (Empleado emple : empleadosOrdenados) {
            emple.mostrar();
        }
    }


    public void agregarVenta(int idEmpleado,int idCliente, String patente, int codigoExpendora, int pago,String tipocombustible) {
        venta nuevaVenta = new venta(idVenta, idEmpleado, patente, codigoExpendora, pago,tipocombustible);
        expendedor expe = expendedoras.get(codigoExpendora);
        if(expe.getTipoCombustible().equals(tipocombustible)){
            Empleado emple = empleados.get(idEmpleado);
            cliente clien = clientes.get(idCliente);
            ventas.put(idVenta, nuevaVenta);
            idVenta++;
            boolean clienteNuevo = true;
            int valor = 0;
            if (Objects.equals(tipocombustible, "Nafta")){
                valor += naftaPorDolar;
            }else if(Objects.equals(tipocombustible, "Gasoil")){
                valor = gasoilPorDolar;
            }else{
                valor += querosenPorDolar;
            }

            expe.setLitrosExpendidos(expe.getLitrosExpendidos() + pago * valor);
            expe.setGanancias(expe.getGanancias() + pago);
            emple.setVentasTotales(emple.getVentasTotales() + pago);
            clien.setGasto(clien.getGasto() + pago);
            for(int i = 0;i<top10cliente.size();i++){
                if (top10cliente.get(i).getIdcliente() == idCliente){
                    clienteNuevo = false;
                }
            }
            if (clienteNuevo){
                top10cliente.add(clien);
            }
        }else{
            System.out.println("error esa expendedora no tiene ese combustible tiene: " + expe.getTipoCombustible() );
        }
    }


    public void top10(){
        quickSort(top10cliente,0, top10cliente.size() - 1);
        for(int i = 0;i<top10cliente.size();i++){
            top10cliente.get(i).mostrarCliente();
        }

    }

    public void agregarExpendedora(String tipoCombustible) {
        expendedor nuevaExpendedora = new expendedor(idExpendedora, tipoCombustible);
        expendedoras.put(idExpendedora, nuevaExpendedora);
        idExpendedora++;
    }

    public void agregarEmpleado(String nombre) {
        Empleado nuevoEmpleado = new Empleado(nombre,idEmpleado);
        empleados.put(idEmpleado, nuevoEmpleado);
        idEmpleado++;
    }

    public void agregarCliente(String nombre, String patente) {
        cliente nuevoCliente = new cliente(idCliente, nombre, patente);
        clientes.put(idCliente, nuevoCliente);
        idCliente++;
    }


    public void mostrarVentas(){
        for(Map.Entry<Integer,venta> v :ventas.entrySet()){
            v.getValue().mostrar();
        }
    }

    public void mostrarExpendedorass(){
        for(Map.Entry<Integer,expendedor> expen :expendedoras.entrySet()){
            expen.getValue().mostrar();
        }
    }

    public static void quickSortExpendedores(List<expendedor> expendedores, int low, int high , int ordenador) {
        if (low < high) {
            int pivotIndex = partition(expendedores, low, high,ordenador);
            quickSortExpendedores(expendedores, low, pivotIndex - 1,ordenador);
            quickSortExpendedores(expendedores, pivotIndex + 1, high,ordenador);
        }
    }

    public static int partition(List<expendedor> expendedores, int low, int high,int ordenador) {
        expendedor pivot = expendedores.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (ordenador == 0){
                if (expendedores.get(j).getLitrosExpendidos() > pivot.getLitrosExpendidos()) {
                    i++;
                    swap(expendedores, i, j);
                }
            }else if(ordenador == 1){
                if (expendedores.get(j).getGanancias() > pivot.getGanancias()) {
                    i++;
                    swap(expendedores, i, j);
                }
            }

        }

        swap(expendedores, i + 1, high);
        return i + 1;
    }

    public static void swap(List<expendedor> expendedores, int i, int j) {
        expendedor temp = expendedores.get(i);
        expendedores.set(i, expendedores.get(j));
        expendedores.set(j, temp);
    }

    public static void quickSortEmpleados(List<Empleado> empleados, int low, int high) {
        if (low < high) {
            int pivotIndex = low + (high - low) / 2;
            Empleado pivot = empleados.get(pivotIndex);
            int i = low;
            int j = high;

            while (i <= j) {
                while (empleados.get(i).getVentasTotales() > pivot.getVentasTotales()) {
                    i++;
                }

                while (empleados.get(j).getVentasTotales() < pivot.getVentasTotales()) {
                    j--;
                }

                if (i <= j) {
                    Empleado temp = empleados.get(i);
                    empleados.set(i, empleados.get(j));
                    empleados.set(j, temp);
                    i++;
                    j--;
                }
            }

            if (low < j) {
                quickSortEmpleados(empleados, low, j);
            }
            if (high > i) {
                quickSortEmpleados(empleados, i, high);
            }
        }
    }


    public static void swapVentas(List<expendedor> expendedores, int i, int j) {
        expendedor temp = expendedores.get(i);
        expendedores.set(i, expendedores.get(j));
        expendedores.set(j, temp);
    }


        private static void quickSort(List<cliente> listaClientes, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(listaClientes, low, high);
                quickSort(listaClientes, low, pivotIndex - 1);
                quickSort(listaClientes, pivotIndex + 1, high);
            }
        }

        private static int partition(List<cliente> listaClientes, int low, int high) {
            int pivot = listaClientes.get(high).getGasto();
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (listaClientes.get(j).getGasto() >= pivot) {
                    i++;
                    // Intercambiar elementos en la posición i y j
                    cliente temp = listaClientes.get(i);
                    listaClientes.set(i, listaClientes.get(j));
                    listaClientes.set(j, temp);
                }
            }
            // Intercambiar el pivote con el elemento en la posición i+1
            cliente temp = listaClientes.get(i + 1);
            listaClientes.set(i + 1, listaClientes.get(high));
            listaClientes.set(high, temp);
            return i + 1;
        }




}
