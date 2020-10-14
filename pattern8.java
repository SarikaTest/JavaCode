class Pattern8{
public static void main (String args [])
{
	/////int
int str = 5;
int alm = 8;
for (int i=1;i<=5;i++)
{
 if(i<=3){
 for(int j=1;j<=i;j++){
 System.out.print("* ");
 }
 }
else{
for(int k=str;k>=1;k--){
 System.out.print("* ");
}}
System.out.println();
str--;
}

}

}