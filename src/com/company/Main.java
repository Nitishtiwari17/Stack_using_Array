package com.company;
import java.util.Scanner;
class stack
{
    int top=-1;
    int n=10;
    int a[]=new int[n];
    void push()
    {
        if(top==(n-1))
        {
            System.out.println("overflow");
        }
        else
        {
            System.out.println("enter data:");
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("item inserted");
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            top=top-1;
            System.out.println("item deleted");
        }
    }
    void display()
    {
        System.out.print("item are:");
        for(int j=top;j>=0;j--)
        {
            System.out.print(a[j]);
        }
    }
}
public class Main
{

    public static void main(String[] args)
    {
        int d,l;
        Scanner sc=new Scanner(System.in);
        stack s=new stack();
        do
            {
               System.out.println("Press 1 to push:");
               System.out.println("Press 2 to pop:");
               System.out.println("press 3 to display:");
               System.out.println("enter your choice:");
               d=sc.nextInt();
               switch(d)
               {
                   case 1:
                   {
                       s.push();
                       break;
                   }
                   case 2:
                   {
                       s.pop();
                       break;
                   }
                    case 3:
                   {
                       s.display();
                       break;
                   }
            }
            System.out.println("enter 0 to go back to the main menu:");
               System.out.println("enter any key to exit:");
               l=sc.nextInt();
        }
        while(l==0);
        System.out.print("Exit Successfully");
    }
}

