package lab;

import java.util.*;


class Over_riding_1{
public void array() {
int array[]=new int[10];
int even_mat[]=new int[10];
int odd_mat[]=new int[10];
int even=0,odd=0,j=0,k=0;
System.out.println("Enter 5 elements: ");
Scanner scan=new Scanner(System.in);
for(int i=0;i<5;i++) {
array[i]=scan.nextInt();
}
for(int i=0;i<5;i++)
{
if(array[i]%2==0)
{
even_mat[j++]=array[i];
even++;
}
else
{
odd_mat[k++]=array[i];
odd++;
}
}
System.out.println("Even numbers matrix: ");
for(int i=0;i<even;i++)
{
System.out.println(even_mat[i]);
}
System.out.println("odd numbers matrix: ");
for(int i=0;i<odd;i++)
{
System.out.println(odd_mat[i]);
}
}
}


public class Transpose extends Over_riding_1{
public void array() {
int array[][]=new int[5][5];
int rows=2,columns=2;
int transp[][]=new int[5][5];
Scanner scan=new Scanner(System.in);
System.out.println("Enter "+(rows*columns)+" elements: ");
for(int i=0;i<rows;i++) {
for(int j=0;j<columns;j++) {
array[i][j]=scan.nextInt();
}
}
for(int i=0;i<rows;i++) {
for(int j=0;j<columns;j++) {
transp[i][j]=array[j][i];
}
}
for(int i=0;i<columns;i++) {
for(int j=0;j<rows;j++) {
System.out.print(transp[i][j]+"\t");
}System.out.println();
}
super.array();
}
public static void main(String[] args) {
Transpose obj=new Transpose();
obj.array();
}
}