import java.util.*;
class Emp{
int id;
String name;
int salary;
Emp(){
}
void acceptE(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter ID: ");
id=sc.nextInt();
System.out.print("Enter Name: ");
name=sc.next();

System.out.print("Enter Salary: ");
salary=sc.nextInt();
}
void displayE(){
System.out.println("ID: "+id);
System.out.println("Name: "+name);
System.out.println("Salary: "+salary);
}
double sal(){
return salary;
}
}
class Manager extends Emp{
private int bonus;
void acceptM(){
Scanner sc =new Scanner(System.in);
System.out.print("Enter Bonus: ");
bonus=sc.nextInt();
}
void displayM(){
System.out.println("Worker Bonus: "+bonus);
}

static int max(Manager m[],int n){
double tmax=0;
int ts=0;
for(int i=0;i<n;i++){
if(tmax<(m[i].sal()+m[i].bonus)){
tmax=m[i].sal()+m[i].bonus;
ts=i;
}
}
System.out.println("\nMax Total Salary: "+tmax);
return ts;
}
public static void main(String[] args){
int n,i,ts;
Scanner sc=new Scanner (System.in);
System.out.print("Enter how many Records you to enter: ");
n=sc.nextInt();
Manager m[]=new Manager[n];
for(i=0;i<n;i++){
m[i]=new Manager();
m[i].acceptE();
m[i].acceptM();

}
System.out.println("\n----Details Of Worker Having Maximum Total Salary----");
ts=Manager.max(m,n);
m[ts].displayE();
m[ts].displayM();
}
}
