package javaapplication20;
public class Empleado {
    public String nombre;
    public String categoria; //(Master,Senior,Junior)
    public String productividad;//(Alta,Media,Baja)
    public double Salario;
    public Empleado(String nombre, String categoria, String productividad, double Salario){
        this.nombre = nombre;
        this.categoria = categoria;
        this.productividad = productividad;
        this.Salario= Salario;     
    }
    public double getSalario(){
        return getSalario();
    }    
    public void setSalario(double Salario){
        this.Salario = Salario;
    }
    public String despido(){      
        if (productividad.equals("Baja")){
            return "Empleado despedido";
        }       
            return null;
    }
    public String aumentoSalarial(){
        return categoria;
    }
    public String jubilacion(int edad){
        if (edad>65){                
            return "Jubilado";
        }else
            return "Empleado Activo";
    }
}
    class Administrativo extends Empleado{
        public Administrativo(String nombre, String categoria, String productividad,double Salario){
            super(nombre,categoria,productividad,Salario);            
        }
        @Override
        public String aumentoSalarial(){            
            if (productividad.equals("Alta")){
                return "El empleado esta para un Aumento Salarial";
            }else
                return"El empleado NO esta para un Aumento Salarial";
        }       
    }
    class Supervisor extends Empleado{
        public Supervisor(String nombre, String categoria, String productividad,double Salario){
            super (nombre,categoria,productividad,Salario);
        }
        @Override
        public String aumentoSalarial(){            
            if (productividad.equals("Alta")){
                return "El empleado esta para un Aumento Salarial";
            }else
                return"El empleado NO esta para un Aumento Salarial";
        }
        private double primas(double comision){
            double ganancia = Salario;
            if (categoria.equals("Master")){
                ganancia = ganancia +(getSalario()*0.10);
                return comision ;
            }else 
                return Salario;
        }
    }