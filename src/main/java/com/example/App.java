package com.example;

public class App 
{
    public int add(int a,int b){
	return a+b;
    }

    public static void main( String[] args )
    {
	App app=new App();
	int result=app.add(2,3);
	System.out.println("the result of add of 2 and 3 :" +result);
        System.out.println( "App executed success!" );
    }
}
