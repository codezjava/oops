package aggergation;
class China
{
 
	String femalepop;
	String malepop;
	String topop;

China(	String femalepop,String malepop,String topop)
{

	this.femalepop=femalepop;
	this.malepop=malepop;
	this.topop=topop;
}
public void populationDetailes()//population details about china
{
	System.out.println("population Detailes about China");
	System.out.println("female population in China:\t"+femalepop);
	System.out.println("male population in China:\t"+malepop);
	System.out.println("total population in China:t"+topop+"\n");
}
}
class India
{

	String femalepop;
	String malepop;
	String topop;
	China ch;

India(String femalepop,String malepop,String topop,China ch)
{

	this.femalepop=femalepop;
	this.malepop=malepop;
	this.topop=topop;
	this.ch=ch;

	
}
public void IndiapopulationDetailes()//population details about india
{
	System.out.println("-----------------population Detailes about China---------------");
	System.out.println("female population in China:\t"+ch.femalepop);
	System.out.println("male population in China:\t"+ch.malepop);
	System.out.println("total population in China:\t"+ch.topop);
    System.out.println("\n");
	
	System.out.println("-----------population Details about India-------------");
	System.out.println("female population in India:\t"+femalepop);
	System.out.println("male population in India:\t"+malepop);
	System.out.println("total population in India:\t"+topop);

}
public void  totalpop()//total population of both country
{
	int a=Integer.parseInt(ch.topop);
	int b=Integer.parseInt(this.topop);
	int c;
	c=a+b;
	String str=String.valueOf(c);
	System.out.println("\ntotal population of two countrys:\t"+"\n"+str);
}

}

public class Aggergation {
public static void main(String[] arg)
{
	China ch=new China("677,578,045","731,641,997","1409220059");
	India in=new India("671,805,912","717,159,536","138896549",ch);
	in.IndiapopulationDetailes();
	in.totalpop();
}
}
