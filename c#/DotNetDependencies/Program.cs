﻿using Humanizer;
using System;


namespace DotNetDependencies
{   //class
    class Program
    {   //main method
        static void Main(string[] args)
        {
             Console.WriteLine("Quantities:");
    HumanizeQuantities();

    Console.WriteLine("\nDate/Time Manipulation:");
    HumanizeDates();
        }
        //method
        static void HumanizeQuantities()
{
    Console.WriteLine("case".ToQuantity(0));
    Console.WriteLine("case".ToQuantity(1));
    Console.WriteLine("case".ToQuantity(5));
}
    //method
static void HumanizeDates()
{
    Console.WriteLine(DateTime.UtcNow.AddHours(-24).Humanize());
    Console.WriteLine(DateTime.UtcNow.AddHours(-2).Humanize());
    Console.WriteLine(TimeSpan.FromDays(1).Humanize());
    Console.WriteLine(TimeSpan.FromDays(16).Humanize());
}
    }

}
