import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Empresa {
    Map<String,EmpleadoAsalariado> EmpleadosAsalariados = new HashMap();
    Map<String,EmpleadoHora> EmpleadosHora = new HashMap();
    Map<String,EmpleadoComision> EmpleadosComision = new HashMap();
    Map<String,EmpleadoComisionyBase> EmpleadosComisionyBase = new HashMap();
    Map<String,Pasante> pasantes = new HashMap();
    double porcentajeComision = 0.4;

    public void agregarEmpleadoAsalariado(String nombre, String apellido, String cuil, String telefono,LocalDate cumpleaños){
        EmpleadosAsalariados.put(nombre,new EmpleadoAsalariado(nombre, apellido, cuil, telefono,cumpleaños));
    }

    public void agregarEmpleadosHora(String nombre,String apellido,String cuil,String telefono,LocalDate cumpleaños){
        EmpleadosHora.put(nombre,new EmpleadoHora(nombre, apellido, cuil, telefono,cumpleaños));
    }

    public void agregarEmpleadosComision(String nombre,String apellido,String cuil,String telefono,LocalDate cumpleaños){
        EmpleadosComision.put(nombre,new EmpleadoComision(nombre, apellido, cuil, telefono,cumpleaños));
    }

    public void agregarEmpleadosComisionyBase(String nombre,String apellido,String cuil,String telefono,LocalDate cumpleaños){
        EmpleadosComisionyBase.put(nombre,new EmpleadoComisionyBase(nombre, apellido, cuil, telefono,cumpleaños));
    }

    public void agregarPasante(String nombre,String apellido,String cuil,String telefono,LocalDate cumpleaños){
        pasantes.put(nombre,new Pasante(nombre, apellido, cuil, telefono,cumpleaños));
    }

    public void calcularSalarioPasante(String nombre){
        Pasante p =  pasantes.get(nombre);
        System.out.println("el sueldo del empleado asalariado es: " +  p.calcularSueldo());
    }

    public void CalcularSalarioEmpleadoAsalariado (String nombre,int monto){
        EmpleadoAsalariado empleasa =  EmpleadosAsalariados.get(nombre);
        System.out.println("el sueldo del empleado asalariado es: " +  empleasa.calcularSueldo(monto));
    }

    public void CalcularSalarioEmpleadoHora (String nombre,int horas,int montos){
        EmpleadoHora empleoHora =  EmpleadosHora.get(nombre);
        System.out.println("el sueldo del empleado por Hora es: " +  empleoHora.calcularSueldo(montos,horas));
    }

    public void CalcularSalarioEmpleadoComision (String nombre,int venta,int cantidad){
        EmpleadoComision emplecomi =  EmpleadosComision.get(nombre);
        System.out.println("el sueldo del empleado por por comision es: " +  emplecomi.calcularSueldo(venta,cantidad,porcentajeComision));
    }

    public void CalcularSalarioEmpleadoComisionyBase (String nombre,int base,int ventas,int cantidad){
        EmpleadoComisionyBase emplecomiBase =  EmpleadosComisionyBase.get(nombre);
        System.out.println("el sueldo del empleado por Hora es: " +  emplecomiBase.calcularSueldo(base,ventas,cantidad,porcentajeComision));
    }



}
