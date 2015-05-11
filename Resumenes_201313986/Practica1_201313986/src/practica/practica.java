package practica;
import java.util.Random;
import java.util.Scanner;
public class practica {

	public static void main(String[] args) {
		int switch1;
			System.out.println("Problema1(1)");
			System.out.println("Problema2(2)");
			System.out.println("Problema3(3)");
			System.out.println("Problema4(4)");
			System.out.println("Problema5(5)");
			Scanner sc = new Scanner(System.in);
			switch1=sc.nextInt();
			switch (switch1){
			case 1:
				for(int i=1; i<=9; i++) { 
					if (i==1)
						System.out.println("    *    "); 
					else if (i==2)
						System.out.println("   ***   ");
					else if (i==3)
						System.out.println("  *****  ");
					else if (i==4)
						System.out.println(" ******* ");
					else if (i==5)
						System.out.println("*********");
					else if (i==6)
						System.out.println(" ******* ");
					else if (i==7)
						System.out.println("  *****  ");
					else if (i==8)
						System.out.println("   ***   ");
					else
						System.out.println("    *    "); 
					}
				break;
			case 2:
				int n11,n22,n3,n4,n5,n6;
				System.out.println("ingrese las notas de IPC1A");
				Scanner aa = new Scanner(System.in);
			    n11=aa.nextInt();
				Scanner bb = new Scanner(System.in);
				n22=bb.nextInt();
				Scanner cc = new Scanner(System.in);
				n3=cc.nextInt();
				Scanner dd = new Scanner(System.in);
				n4=dd.nextInt();
				Scanner ee = new Scanner(System.in);
				n5=ee.nextInt();
				Scanner ff = new Scanner(System.in);
				n6=ff.nextInt();
				if ((n11<=100 && n11>=0)&&(n22<=100 && n22>=0)&&(n3<=100 && n3>=0)&&(n4<=100 && n4>=0)&&(n5<=100 && n5>=0)&&(n6<=100 && n6>=0)){
					int promedio;
					promedio=((n11+n22+n3+n4+n5+n6)/6);
					System.out.println("El promedio del alumnos es:"+promedio);
					System.out.println("Media		Puntuación");
					System.out.println("90-100			A");
					System.out.println("80-89			B");
					System.out.println("70-79			C");
					System.out.println("60-69			D");
					System.out.println(" 0-59			E");
				}else{
							System.out.println("No es el rango de las notas");
				}
				
				System.out.println("fin");
				break;
			case 3:
				String hora;
				System.out.println("Ingrese una hora en formato 24hrs");
					Scanner tl=new Scanner (System.in);
					hora=tl.next();
					String delims = "[:]";
					String[] tokens = hora.split(delims);
					String cad;
					cad = tokens[0]; 
					if (cad.equals("13")){
						System.out.println("1"+":"+tokens[1]+"pm");}
					else if (cad.equals("14")){
							System.out.println("2"+":"+tokens[1]+"pm");}
					else if (cad.equals("15")){
							System.out.println("3"+":"+tokens[1]+"pm");}
					else if (cad.equals("16")){
							System.out.println("4"+":"+tokens[1]+"pm");}
					else if (cad.equals("17")){
							System.out.println("5"+":"+tokens[1]+"pm");}
					else if (cad.equals("18")){
							System.out.println("6"+":"+tokens[1]+"pm");}
					else if (cad.equals("19")){
							System.out.println("7"+":"+tokens[1]+"pm");}
					else if (cad.equals("20")){
							System.out.println("8"+":"+tokens[1]+"pm");}
					else if (cad.equals("21")){
							System.out.println("9"+":"+tokens[1]+"pm");}
					else if (cad.equals("22")){
							System.out.println("10"+":"+tokens[1]+"pm");}
					else if (cad.equals("23")){
							System.out.println("11"+":"+tokens[1]+"pm");}
					else if (cad.equals("00")){
							System.out.println("12"+":"+tokens[1]+"+am");}
					else if ((cad.equals("01"))||(cad.equals("02"))||(cad.equals("03"))||(cad.equals("04"))||(cad.equals("05"))||(cad.equals("06"))||(cad.equals("07"))||(cad.equals("08"))||(cad.equals("09"))||(cad.equals("10"))||(cad.equals("11"))||(cad.equals("12"))){
						System.out.println(tokens[0]+":"+tokens[1]+"am");}
					else
						System.out.println("No es una entrada valida");
					break;
			case 4:
				String formula;
				System.out.println("c,x:circulo");
				System.out.println("u,x:cuadro");
				System.out.println("t,x:triangulo");
				System.out.println("x es cualquier numero entero o decimal");
				Scanner s1 =new Scanner (System.in);
				formula=s1.next();
				String ddd = "[,]";
				String s2, s3;
				String[] tk = formula.split(ddd);
				s2=tk[0];
				s3=tk[1];
				int entero = Integer.parseInt(s3);
				if (s2.equals("c")){
					float r;
					r= (float) (entero/2.0);
					System.out.println("su radio es:"+(entero/2.0));
					System.out.println("Su perimetro es:"+(2*3.1416*r));
					System.out.println("Su area es:"+(3.1416*r*r));
				}
					else if (s2.equals("u")){
					System.out.println("Su area es de:"+(entero*entero));
					System.out.println("Su perimetro es de:"+(4*entero));
						}
				
					else if(s2.equals("t")){
						System.out.println("Su perimetro es:"+(entero+entero+entero));
						System.out.println("Su altura es:"+(Math.sqrt(Math.pow(entero, 2)+Math.pow(entero/2, 2))));
					}
				break;
			case 5:
				String f1,f2;
				String delim = "[/]";
				System.out.println("ingrese la fecha 1");
				Scanner n1=new Scanner (System.in);
				f1 = n1.next();
				System.out.println("ingrese la fecha 2");
				Scanner n2=new Scanner (System.in);
				f2 = n2.next();
				String[] fe1=f1.split(delim);
				String[] fe2=f2.split(delim);
				int dia1,mes1,año1;
				int dia2,mes2,año2;
				dia1=Integer.parseInt(fe1[0]);
				mes1=Integer.parseInt(fe1[1]);
				año1=Integer.parseInt(fe1[2]);
				dia2=Integer.parseInt(fe2[0]);
				mes2=Integer.parseInt(fe2[1]);
				año2=Integer.parseInt(fe2[2]);
				if (año1<año2){
					int dias1,años1,suma1,dias2;
					dias1=((mes1*30)+dia1); 
					dias2=((mes2*30)+dia2);
					años1=año2-año1;
					suma1=((años1*360)-dias1+dias2);
					System.out.println("los dias transcurridos entre las dos fechas son:"+suma1);
				}
					else if (año2<año1){
						int dias3,dias4,años2,suma2;
						dias3=((mes2*30)+dia2);
						dias4=((mes1*30)+dia1);
						años2=(año1-año2);
						suma2=((años2*360)-dias4+dias3);
					System.out.println("los dias transcurridos entre las dos fechas son:"+suma2);
					}
				break;
			case 6:
				int x,z;
				String d;
				System.out.println("Ingrese sus dos numeros");
				Scanner xx=new Scanner(System.in);
				x=xx.nextInt();
				Scanner zz=new Scanner(System.in);
				z=zz.nextInt();
				System.out.println("Ingrese su caracter, s=suma , r=diferencia , m=producto , d=cosiente");
				Scanner d1 = new Scanner(System.in);
				d=d1.next();
				if(d.equals("s"))
					System.out.println("Su suma es: "+(x+z));
				else if (d.equals("r")){
					System.out.println("Su diferencia es: "+(x-z));
				}
				else if (d.equals("m")){
					System.out.println("Su producto es: "+(x*z));
				}	
				else if (d.equals("d")){
					System.out.println("Su cosiente es: "+(x/z));
				}
			break;
			case 7:
				int table;
				System.out.println("ingrese un numero para mostrar su tabla de multiplicar");
				Scanner tbl=new Scanner(System.in);
				table=tbl.nextInt();
				for(int i=10; i>=1; i--){
					System.out.println(table+" x "+ i +" = "+ table*i );
				}
			break;
			case 8:
				double zx, xz;
				System.out.println("ingrese el limite inferior");
				Scanner lz = new Scanner(System.in);
				zx=lz.nextDouble();
				System.out.println("ingrese el limite superior");
				Scanner lx=new Scanner(System.in);
				xz=lx.nextDouble();
				Random rand = new Random();
				int xx1 = (int) (Math.random()*((zx-xz)+zx));
				int y= (-1*xx1);
				System.out.println(y);
				System.out.println(xx1);
				switch(y){
				case 1:
					System.out.println("uno");break;
				case 2:
					System.out.println("dos");break;
				case 3:
					System.out.println("tres");break;
				case 4:
					System.out.println("cuatro");break;
				case 5:
					System.out.println("cinco");break;
				case 6:
					System.out.println("seis");break;
				case 7:
					System.out.println("siete");break;
				case 8:
					System.out.println("ocho");break;
				case 9:
					System.out.println("nueve");break;
				case 10: 
					System.out.println("diez");break;
				case 11:
					System.out.println("once");break;
				case 12:
					System.out.println("doce");break;
				case 13:
					System.out.println("trece");break;
				case 14:
					System.out.println("catorce");break;
				case 15:
					System.out.println("quince");break;
				case 16:
					System.out.println("dieciseis");break;
				case 17:
					System.out.println("diecisiete");break;
				case 18:
					System.out.println("diciocho");break;
				case 19:
					System.out.println("diecinueve");break;
				case 20: 
					System.out.println("veinte");break;
				case 21:
					System.out.println("veintiuno");break;
				case 22:
					System.out.println("veintidos");break;
				case 23:
					System.out.println("veintitres");break;
				case 24:
					System.out.println("veinticuatro");break;
				case 25:
					System.out.println("veinticinco");break;
				case 26:
					System.out.println("veintiseis");break;
				case 27:
					System.out.println("veintisiete");break;
				case 28:
					System.out.println("veintiocho");break;
				case 29:
					System.out.println("veintinueve");break;
				case 30: 
					System.out.println("treinta");break;
				case 31:
					System.out.println("treinta y uno");break;
				case 32:
					System.out.println("treinta y dos");break;
				case 33:
					System.out.println("treinta y tres");break;
				case 34:
					System.out.println("treinta y cuatro");break;
				case 35:
					System.out.println("treinta y cinco");break;
				case 36:
					System.out.println("treinta y seis");break;
				case 37:
					System.out.println("treinta y siete");break;
				case 38:
					System.out.println("treinta y ocho");break;
				case 39:
					System.out.println("treinta y nueve");break;
				case 40: 
					System.out.println("cuarenta");break;
				case 41:
					System.out.println("cuarenta y uno");break;
				case 42:
					System.out.println("cuarenta y dos");break;
				case 43:
					System.out.println("cuarenta y tres");break;
				case 44:
					System.out.println("cuarenta y cuatro");break;
				case 45:
					System.out.println("cuarenta y cinco");break;
				case 46:
					System.out.println("cuarenta y seis");break;
				case 47:
					System.out.println("cuarenta y siete");break;
				case 48:
					System.out.println("cuarenta y ocho");break;
				case 49:
					System.out.println("cuarenta y nueve");break;
				case 50: 
					System.out.println("cincuenta");break;
				case 51:
					System.out.println("cincuenta y uno");break;
				case 52:
					System.out.println("cincuenta y dos");break;
				case 53:
					System.out.println("cincuenta y tres");break;
				case 54:
					System.out.println("cincuenta y cuatro");break;
				case 55:
					System.out.println("cincuenta y cinco");break;
				case 56:
					System.out.println("cincuenta y seis");break;
				case 57:
					System.out.println("cincuenta y siete");break;
				case 58:
					System.out.println("cincuenta y ocho");break;
				case 59:
					System.out.println("cincuenta y nueve");break;
				case 60: 
					System.out.println("sesenta");break;
				case 61:
					System.out.println("sesenta y uno");break;
				case 62:
					System.out.println("sesenta y dos");break;
				case 63:
					System.out.println("sesenta y tres");break;
				case 64:
					System.out.println("sesenta y cuatro");break;
				case 65:
					System.out.println("sesenta y cinco");break;
				case 66:
					System.out.println("sesenta y seis");break;
				case 67:
					System.out.println("sesenta y siete");break;
				case 68:
					System.out.println("sesenta y ocho");break;
				case 69:
					System.out.println("sesenta y nueve");break;
				case 70: 
					System.out.println("setents");break;
				case 71:
					System.out.println("setenta y uno");break;
				case 72:
					System.out.println("setenta y dos");break;
				case 73:
					System.out.println("setenta y tres");break;
				case 74:
					System.out.println("setenta y cuatro");break;
				case 75:
					System.out.println("setenta y cinco");break;
				case 76:
					System.out.println("setenta y seis");break;
				case 77:
					System.out.println("setenta y siete");break;
				case 78:
					System.out.println("setenta y ocho");break;
				case 79:
					System.out.println("setenta y nueve");break;
				case 80: 
					System.out.println("ochenta");break;
				case 81:
					System.out.println("ochenta y uno");break;
				case 82:
					System.out.println("ochenta y dos");break;
				case 83:
					System.out.println("ochenta y tres");break;
				case 84:
					System.out.println("ochenta y cuatro");break;
				case 85:
					System.out.println("ochenta y cinco");break;
				case 86:
					System.out.println("ochenta y seis");break;
				case 87:
					System.out.println("ochenta y siete");break;
				case 88:
					System.out.println("ochenta y ocho");break;
				case 89:
					System.out.println("ochenta y nueve");break;
				case 90: 
					System.out.println("noventa");break;
				case 91:
					System.out.println("noventa y uno");break;
				case 92:
					System.out.println("noventa y dos");break;
				case 93:
					System.out.println("noventa y tres");break;
				case 94:
					System.out.println("noventa y cuatro");break;
				case 95:
					System.out.println("noventa y cinco");break;
				case 96:
					System.out.println("noventa y seis");break;
				case 97:
					System.out.println("noventa y siete");break;
				case 98:
					System.out.println("noventa y ocho");break;
				case 99:
					System.out.println("noventa y nueve");break;
				case 100: 
					System.out.println("cien");
				break;
				}
			break;
			case 9:
				String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
			      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
			      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};  
			      String Milecima[]={"", "M", "MM", "MMM"};
			      System.out.println("Ingresa numero entre 1 y 3999");  
			      int N = sc.nextInt();  
			      int u=N%10;  
			      System.out.println(u);
			      int ddd=(N/10)%10;  
			      System.out.println(d);
			      int c=(N/100)%10;  
			      System.out.println(c);
			      int m=N/1000;
			      System.out.println(m);
			      if(N>=1000){
			    	  System.out.println(Milecima[m]+Centena[c]+Decena[ddd]+Unidad[u]);
			      }
			      else if(N>=100){           
			          System.out.println(Centena[c]+Decena[ddd]+Unidad[u]);  
			      }
			      else if(N>=10){  
			          System.out.println(Decena[ddd]+Unidad[u]);            
			      }
			      else{  
			              System.out.println(Unidad[N]);            
			          }            
			break;		
			case 10:
				int n,a,b;
		          Scanner cal=new Scanner(System.in);
		          System.out.println("Ingrese un numero");
		          n=cal.nextInt();
		            
		           for(a=n; a>=1; a--){
		               for(b=a; b>=1; b--){
		                   System.out.print(" "+(n-(a-1)));
		               }
		               System.out.println("");
		            }
			break;
			case 11:
			break;
			case 12:
			break;
			case 13:
			break;
			case 14:
			break;
			case 15:
			break;
			}

	}

}
