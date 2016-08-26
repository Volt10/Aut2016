using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrouverPalindrome
{
    class Program
    {
        static void Main(string[] args)
        {
            string mot;
            mot = "aaaaaaaaaaccaaaaaaaaaa";

            Console.WriteLine(TrouverPalindrome(mot, 0 , mot.Length -1));
            Console.ReadLine();

        }

        static string TrouverPalindrome(string mot, int debut, int fin)
        {
            if (mot[debut] != mot[fin])
                return "Pas palindrome";

            if (debut >= fin)
                return "Palindrome";

            return TrouverPalindrome(mot, debut + 1, fin - 1);
        }

        // Test
        //static bool Palindrome(string mot)
        //{
        //    if (mot.Length == 1 || mot.Length == 0)  
        //        return true;
        //    if (mot[0] != mot[mot.Length - 1])
        //        return false;

        //    return Palindrome(mot.Substring(1, mot.Length - 2));
        //}


    }
}
