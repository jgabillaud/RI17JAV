package fr.eni.editions.heritage;

public class TestConversionType {

	public static void main(String[] args) {
		Object o;  
		Personne p;  
		Client c;  
		Fournisseur f;

	   o=new Object();  
	   p=new Personne();  
	   c=new Client();  
	   f=new Fournisseur();  

	   essai(o);
	   essai(p);
	   essai(c);
	   essai(f);
	}
	
	public static void essai(Object obj)  
	{  
	   Object o;  
	   o=obj;  
	   //Ancienne syntaxe de l'opérateur instanceof : nécessite de transtyper manuellement la variable après avoir effectué le test
	   if (obj instanceof Personne)  
	   {  
	       Personne p=(Personne)obj;  
	       //... 
	   }  
	   if (obj instanceof Client)  
	   {  
	       Client c=(Client)obj;  
	       //...  
	   }  
	   if (obj instanceof Fournisseur)  
	   {  
	       Fournisseur f=(Fournisseur)obj;  
	       //...;  
	   } 
	   //Nouvelle syntaxe de l'opérateur instanceof: le transtypage est réalisé implicitement en même temps que le test
	   if (obj instanceof Personne p)  
	   {  
	       //... 
	   }  
	   if (obj instanceof Client c)  
	   {  
	       //...  
	   }  
	   if (obj instanceof Fournisseur f)  
	   {  
	       //...;  
	   } 
	}


}
