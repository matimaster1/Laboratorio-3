package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        /*ejercicio1
        int N= 2;
        double A= 0.2;
        char C= 'a';
        System.out.println("El valor de N es "+N+" y El valor de A es "+A+" y El valor de C es "+C);
        System.out.println("El valor de N+A es "+(N+A));
        System.out.println("El valor de N-A es "+(A-N));
        System.out.println("El valor Numerico de C es "+(int)C);*/
        /*ejercicio2
        int X=2;
        int Y=3;
        double N=0.5;
        double M=4.7;
        System.out.println(String.format("X+Y=%s", X+Y));
        System.out.println("X*M="+(X*M));
        System.out.println("Y/N="+(Y/N));*/
        /*ejercicio3
        int N = 2;
        System.out.println(N += 77);
        System.out.println(N -= 3);
        System.out.println(N *= 2);*/
        /*ejercicio4
        int A=1, B=2, C=3, D=4, E=B;
        B=C;
        System.out.println(B);
        C=A;
        System.out.println(C);
        A=D;
        System.out.println(A);
        D=E;
        System.out.println(D);*/
        /*ejercicio5
        int A= (int) (Math.random()*10);
        String par="par";
        if (A%2!=0){
            par="impar";
        }
        System.out.println("el numero "+A+" es "+par);*/
        /*ejercicio6
        int B= (int) (Math.random()*(10-(-10))+(-10));
        String pos="positivo";
        if (B<0){
            pos="negativo";
        }
        if (B==0){
            pos="neutral";
        }
        System.out.println("el numero "+B+" es "+pos);*/
        /*ejercicio7
        int C= (int) (Math.random()*(200-(-100))+(-100));
        String pos="positivo";
        String par="par";
        String mul10="no es multiplo de 10";
        String mul5="no es multiplo de 5";
        if (C<0){
            pos="negativo";
        }
        if (C==0){
            pos="neutral";
        }
        if (C%2!=0){
            par="impar";
        }
        if (C%10==0){
            mul10="multiplo de 10";
        }
        if (C%5==0){
            mul5="multiplo de 5";
        }
        String mayor=(C>100) ? "es mayor que 100" : "es menor que 100"; //es un if else abreviado re locooooo
        System.out.println("el numero "+C+" es "+pos+"/"+par+"/"+mul10+"/"+mul5+"/"+mayor);*/
        /*ejercicio8
        Scanner  entrada=new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre= entrada.nextLine();
        System.out.println("Nombre Ingresado: "+nombre);*/
        /*ejercicio9
        Scanner entradaentero=new Scanner(System.in);
        System.out.println("Ingrese un Numero: ");
        int A=entradaentero.nextInt();
        System.out.println("Valor ingresado: "+A+" X 2: "+A*2+" X 3: "+A*3);*/
        /*ejercicio10
        Scanner fahrenheit=new Scanner(System.in);
        System.out.print("Ingrese los grados fahrenheit a convertir: ");
        Double F= fahrenheit.nextDouble();
        System.out.println(F +" grado/s fahrenheit son: "+((F-32) * 5/9)+" grados centigrados");*/
        /*ejercicio11
        Scanner entradacircunferencia=new Scanner(System.in);
        System.out.println(" Ingrese el valor del radio de una circunferencia: ");
        double radio=entradacircunferencia.nextDouble();
        System.out.println("el area de  la circunferencia es: "+(Math.pow(radio, 2)*Math.PI)+
        " y la longitud es: "+ (2*Math.PI*radio));*/
        /*ejercicio12
        Scanner entradacircunferencia=new Scanner(System.in);
        System.out.println(" Ingrese km por hora: ");
        double km=entradacircunferencia.nextDouble();
        System.out.println(km+" km por hora son "+km/3.6);*/
        /*ejercicio13
        Scanner cateto=new Scanner(System.in);
        System.out.println("Ingrese la medida del primer cateto: ");
        double l1=cateto.nextDouble();
        System.out.println("Ingrese la medida del segundo cateto: ");
        double l2=cateto.nextDouble();
        System.out.println("longitud de la hipotenusa= "+Math.sqrt(Math.pow(l1, 2)+Math.pow(l2, 2)));*/
        /*ejercicio14
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa el diametro de la esfera: ");
        double diametro=scanner.nextDouble();
        double radio=diametro/2;
        double volumen=(double) 4/3 * Math.PI * Math.pow(radio, 3);
        System.out.println("el volumen de la esfera es: "+volumen);*/
        /*ejercicio15
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        Scanner scanner3=new Scanner(System.in);
        System.out.println("Ingresa un lado del triangulo: ");
        double l1=scanner.nextDouble();
        System.out.println("Ingresa un lado del triangulo: ");
        double l2=scanner2.nextDouble();
        System.out.println("Ingresa un lado del triangulo: ");
        double l3=scanner3.nextDouble();
        double P=(l1+l2+l3)/2;
        double A= Math.sqrt((P * (P - l1) *(P-l2)*(P-l3)));
        System.out.println("Area de su triangulo: "+A);*/
        /*ejercicio16
        Scanner numero=new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 cifras: ");
        int trescifras=numero.nextInt();

        System.out.println("primera cifra: "+trescifras/100+" segunda cifra: "+(trescifras/10)%10+" tercera cifra: "+(trescifras%10));
        */
        /*ejercicio17
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese un numero de 5 cifras: ");
        int cincocifras=scan.nextInt();
        int[] digitos=new int[5];
        int c=0;
        while (cincocifras>0){
            digitos[c]=cincocifras % 10;
            cincocifras=cincocifras/10;
            c++;
        }

        for (int i= digitos.length-1; i>=0; i--){
           if (digitos[i] % 2 != 0){
               System.out.println("Digitos separados "+digitos[i]);
           }
        }*/
        /*ejercicio18
        Scanner nuevo=new Scanner(System.in);
        int H,M,S;
        //se puede usar un boolean que es true o false para ahcer también
        do {
            System.out.println("Ingrese Hora: ");
            H=nuevo.nextInt();
            System.out.println("Ingrese Minutos: ");
            M=nuevo.nextInt();
            System.out.println("Ingrese Segundos: ");
            S=nuevo.nextInt();

            if (H>24 || H<0 || M>60 || M<0 || S>60 || S<0 ){
                System.out.println("Hora incorrecta vuelva a ingresarla");
            }
        }while (H>24 || H<0 || M>60 || M<0 || S>60 || S<0);

        System.out.println("Hora elegida: "+H+":"+M+":"+S);*/
        /*ejercicio2.1
        int mes;
        String[] mesesnombre={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el numero del mes: ");
        mes=scan.nextInt();
        if (mes<=12 && mes>0){
            if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                System.out.println("el mes "+mesesnombre[mes-1]+" tiene 31 días");
            }
            else if (mes==4 || mes==6 || mes==9 || mes==11){
                System.out.println("el mes "+mesesnombre[mes-1]+" tiene 30 días");
            }
            else {
                System.out.println("el mes "+mesesnombre[mes-1]+" tiene 28 días");
            }
        }
        else {
            System.out.println("Este mes no existe :v");
        }*/
        /*ejercicio2
        int numero=1;
        while (numero<=100){
            System.out.println("numero: "+numero);
            numero++;
        }*/
        /*ejercicio3
        int numero=1;
        do {
            System.out.println("numero: "+numero);
            numero++;
        }while (numero<=100);*/
        /*ejercicio4
        int[] numeraco= new int[100];
        for (int i=1; i<=100; i++){
            //System.out.println("numero: "+i);
            numeraco[i-1]=i;
        }///for normal
        //for each
        for (int i: numeraco){
            System.out.println("numero: "+i);
        }*/
        /*ejercicio5
        int neg=0;
        int pos=0;
        int cer=0;

        int numeros2[]={1,-4,6,-9,-10,0,21,0,-12,56};
        for (int i:numeros2){
            if (i<0){
                neg++;
            }
            else if(i>0){
                pos++;
            }
            else {
                cer++;
            }
        }
        System.out.println("El array tiene "+neg+" numeros negativos\n"+pos+" numeros positivos\n"+cer+" numero cero");*/
        /*ejercicio6

        int aleatorios[]=new int[20];

        for (int i=0; i<20; i++){
            int random=(int) (Math.random()*(100-(-100))+(-100));

            aleatorios[i]=random;
        }
        for (int i: aleatorios){
            System.out.println("numeros aleatorios: "+i);
        }*/
        /*ejercicio7

        int aleatorios[]=new int[20];
        int i=0;
        while (i<20){
            int random=(int) (Math.random()*(100-(-100))+(-100));
            if (random%2==0){
                aleatorios[i]=random;
                i++;
            }
        }
        for (int j: aleatorios){
            System.out.println("numeros aleatorios: "+j);
        }//forma1
        int aleatorios[]=new int[20];
        int i=0, j=0;
        while (i<20){
            if (j%2==0){
                aleatorios[i]=j;
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        for (int k: aleatorios){
            System.out.println("numeros aleatorios: "+k);
        }//forma2
        */
         /*ejercicio8
       double alum[]=new double[20];
        double suma=0;
        for (int i=0; i<20; i++){
            double random=(Math.random()*(2-0.6)+(0.6));
            alum[i]=random;
        }
        for (double i: alum){
            suma=suma+i;
        }
        System.out.printf("Promedio de altura de 20 alumnos: %1.2f",suma/20);*/
        /*ejercicio9
        Scanner teclado=new Scanner(System.in);
        int i=0;
        int suma=0;
        List<Integer> lista=new ArrayList<>();
        while (i!=-99){
            System.out.print("\nIngrese un valor: ");
            i=teclado.nextInt();
            if (i!=-99){
                lista.add(i);
                suma=suma+i;
            }
        }
        double promedio=0;
        int elementoslista=lista.size();
        promedio=suma/elementoslista;
        int k=0;
        for (int j=0; j<lista.size(); j++){
            if (lista.get(j)>promedio){
                k++;
            }
        }

        System.out.println("Usted Ingreso "+lista.size()+" numeros, el promedio fue: "+promedio+" la suma total es de: "+suma+" y "+k+" estan por encima del promedio");
        */
        /*ejercicio10
        Scanner scan=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();

        for (int i=0; i<6; i++){
            System.out.println("ingrese valores a la lista: ");
            int k=scan.nextInt();
            list.add(k);
        }

        for (int i=0; i< list.size(); i++){
            System.out.print(list.get(i)+" | ");
        }

        if (list.size()%2!=0){

            for (int i= list.size()-1, j=0; j!=i ; i--, j++){
                int auxlistafinal=list.get(i);
                int buxlistaprincipio=list.get(j);

                list.set(i, buxlistaprincipio);
                list.set(j, auxlistafinal);
            }
        }
        else{
            for (int i= list.size()-1, j=0; i>j ; i--, j++){
                int auxlistafinal=list.get(i);
                int buxlistaprincipio=list.get(j);

                list.set(i, buxlistaprincipio);
                list.set(j, auxlistafinal);
            }
        }
        System.out.println("\n");
        for (int i=0; i< list.size(); i++){
            System.out.print(list.get(i)+" | ");
        }*/
        /*ejercicio11
        Scanner scan=new Scanner(System.in);
        List<String> list=new ArrayList<>();

        for (int i=0; i<6; i++){
            System.out.println("ingrese palabras a la lista: ");
            String k=scan.next();
            list.add(k);
        }

        int palabramaslarga=0;
        for (int i= list.size()-1; i>0; i--){
            if (list.get(palabramaslarga).length()<list.get(i).length()){
                palabramaslarga=i;
            }
        }

        System.out.println("la cadena de texto mas larga es: "+list.get(palabramaslarga));*/



        /*ejercicios2.2*/
        /*ejercicio1
        String palabra="Contar el numero de palabras de una frase en espanol";
        StringTokenizer con=new StringTokenizer(palabra);
        System.out.println("Este texto tiene: "+con.countTokens()+" palabras");*/
        /*ejercicio3
        String palabra="Contar el numero de palabras de una frase en espanol";
        int pos=0;

        for (int i=palabra.length()-1; i>0; i--){

            if (palabra.charAt(i)==' '){
                pos=i+1;
                i=0;
            }
        }
        palabra=palabra.substring(0, pos);

        System.out.println(palabra);*/
        /*ejercicio4
        String palabra="Contar el numero de palabras de una frase en espanol";
        int cont=0;
        char letracontar='a';
        for (int i=0; i<palabra.length(); i++){
            if (palabra.charAt(i)==letracontar){
                cont++;
            }
        }

        System.out.println("en la frase: "+palabra+" se repite la letra "+letracontar+" "+cont+" veces");*/
        /*ejercicio2*/


        /*ejercicios2.3*/

        /*ejercicio1
        System.out.println("Cociente de la operación: "+cociente(582,2,0));*/
        /*ejercicio2
        System.out.print("\npasando numero a binario: ");
        binario(5);*/
        /*ejercicio3
        System.out.print("\npotencia de dos: "+potenciadedos(10));*/
        /*ejercicio4
        System.out.print("\nnumeros de cifra: "+cifras(104353567));*/
        /*ejercicio5//noentendielinciso
        System.out.print("\nnumeros de cifra: "+sumadesde(3, 1));*/
        /*ejercicio6
        System.out.println("Suma de dos numeros: "+suma(10,9));*/
        /*ejercicio7
        System.out.println("Resto dos numeros: "+resto(23,9));*/







    }
    public static int cociente(int a, int b, int result){
        if (a==0){
        }
        else {
            result=cociente(a-b, b, result+1);
        }
        return result;
    }

    public static void binario(int dec){
        if (dec<2){
            System.out.print(dec);
        }
        else {
            binario(dec/2);
            dec=dec%2;
            System.out.print(dec);
        }
    }

    public static int potenciadedos(int n){
        int result=0;
        if (n==1){
            result=2;
        }
        else {
            result=2*potenciadedos(n-1);
        }
        return result;
    }

    public static int cifras(int num){
        int i=0;
        if (num<10){
            i++;
        }
        else {
            i=1+cifras(num/10);
        }
        return i;
    }

    public static int sumadesde(int numf, int numi){
        if (numf==numi){
        }
        else {
            numi=numi+sumadesde(numf, numi+1);
        }
        return numi;
    }

    public static int suma(int numa, int numb){
        int i=0;
        if (numb==0 || numa==0){
            if (numa==0){
                i=numb;
            }
            else{
                i=numa;
            }
        }
        else {
            i=1+suma(numa, numb-1);
        }
        return i;
    }

    public static int resto(int a, int b){
        int i=0;
        if (a<b){
            i=a;
        }
        else {
            i=resto(a-b, b);
        }
        return i;
    }




}



