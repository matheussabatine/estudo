// See https://aka.ms/new-console-template for more information


// criação de projeto template
// dotnet new console
//rodar app
// dotnet run

//tipos variaveis

// bool
// char
// byte
// int
// long
// float
// double
// decimal
// string
class Program{

    static void Main(){


        Console.ForegroundColor = ConsoleColor.Green;
        Console.WriteLine("Parabéns!");

        /*
        bool acesso = false;

        // operador ternário: expressao ? valor1 : valor2;
        // se expressao for verdade, é realizado valor1
        // se expressao for falsa, é realizado valor2
        int i;
        i = 5 > 10 ? 5 : 15;

        Console.WriteLine(i);

        //programa simples
        Console.WriteLine("digite o nome...");
        // Nullable Types: possiveis nulos, usa ?
        string? nome;
        nome = Console.ReadLine();
        Console.WriteLine("seu nome é " + nome);
        Console.WriteLine($"seu nome é {nome}");

        Console.WriteLine("digite um numero...");
        int? numero;
        numero = int.Parse(Console.ReadLine());
        Console.WriteLine($"seu numero é {numero}");
        */
        string[] lista = new string[4];
        Console.WriteLine(lista.Length);

        //coversao explicita
        long i = 1;
        int j = 3;

        //para conversões para baixo, de long(64bits) para int(32bits), deve-se explicitamente converte-lo.
        
        j = (int)i;

        //para conversões para cima, conversões implicitas
        i = j;


    }
}
