public class Pessoa {

    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
        
    }

    

    //static pertence a classe, e não a instancia/objetos()
    //public = visivel para todos
    //private = visivel somente para a classe
    //protected = visivel para classes no mesmo pacote
    public static void main() {
        Pessoa pessoa = new Pessoa("Sergio");
        System.out.println(pessoa.getNome());
   

    }

    String getNome(){
        return nome;
    }
    
}

class Funcionario extends Pessoa{
    public Funcionario(String nome){
        super(nome);
    }

}
