public class Computador {

    int id;
    public static void main(String[] args) {
        Pc pc = new Pc(1);
        Notebook notebook = new Notebook(3);
        System.out.println(pc.tipo());
        System.out.println(notebook.tipo());
      
    }
    public Computador(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    protected String tipo(){
        return null;
    }
}

class Pc extends Computador{

    public Pc(int id){
        super(id);
    }

    @Override
    protected String tipo(){
        return "tipo fixo";
    }
} 

class Notebook extends Computador{
    public Notebook(int id){
        super(id);
    }

    @Override
    protected String tipo(){
        return "tipo portátil";
    }
} 