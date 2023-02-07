public class Main {
    public static void main(String []args){
        Writter writen = new Writter();
        Reader reade = new Reader();
        Creador_Datos datas = new Creador_Datos();
        datas.datos(writen);
        Controlador control = new Controlador();
        control.Inicio(reade);
        
        //C:\Users\Usuario\IdeaProjects\Prueba\src

    }
}