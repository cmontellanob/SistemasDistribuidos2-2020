using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClienteSumaCSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            Servicio.wsAritmeticaJavaClient op = new Servicio.wsAritmeticaJavaClient();
            Console.WriteLine("la Suma es{0}",op.sumar(a,b));
            Console.ReadKey();
        }
    }
}
