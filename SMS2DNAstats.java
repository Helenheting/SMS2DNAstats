import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SMS2DNAstats {
private static BufferedReader br;

public static void main(String[] args) throws IOException{
FileReader f=new FileReader("/home/hheting/Downloads/rosalind_ini.txt");
br = new BufferedReader(f);
String str=br.readLine();
	int a=0,g=0,c=0,t=0;
	int counta=0,countg=0,countc=0,countt=0;
	
	a=str.indexOf('A');
	while(a!=-1){
		a=str.indexOf('A',a+1);
		counta=counta+1;
	}
	
	g=str.indexOf('G');
	while(g!=-1){
		g=str.indexOf('G',g+1);
		countg=countg+1;
	}
	
	c=str.indexOf('C');
	while(c!=-1){
		c=str.indexOf('C',c+1);
		countc=countc+1;
	}
	
	t=str.indexOf('T');
	while(t!=-1){
		t=str.indexOf('T',t+1);
		countt=countt+1;
	}

System.out.print(counta+" ");
System.out.print(countc+" ");
System.out.print(countg+" ");
System.out.print(countt);

}

}
