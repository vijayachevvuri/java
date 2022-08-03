package demo;
import java.io.*;
import java.util.*;


public class HashTable
{

		public static void main(String args[])
		{
		
			Hashtable<Integer, String> ht1 = new Hashtable<>();
			Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

	
			ht1.put(11, "Vijaya");
			ht1.put(24, "Lohitha");
			ht1.put(33, "priyanka");

			ht2.put(40, "surekha");
			ht2.put(05, "lalitha");
			ht2.put(16, "lavanya");

			
			System.out.println("Student ID with Names : " + ht1);
			System.out.println("Student ID with Names : " + ht2);
		}
}
