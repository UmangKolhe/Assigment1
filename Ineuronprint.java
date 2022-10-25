package com.assignment1;

public class Ineuronprint {

	public static void main(String[] args) {
		int n = 8;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<=n; j++) {
				if(j == 0 && i<n-1 || i== n-1 && j>=0 && j<=n  || j== n && i<n-1 )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if(j == 0 || i==j && j<n/2 && j>0 || i+j==n && j>=n/2 || j==n  )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if(j==0 || i==n/2 && j>0 && j<n||i==0 && j>0 && j<n ||j==n )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if(j == 0 ||i==j || j==n )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if(j == 0 ||i== n-1 && j>0 && j<n || j==n && i>n/2||i==0 && j>0 && j<n || i==n/2 && j>n/2 )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if(i == 0 || i==n-1 || j==n/2 )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if(j == 0 ||i==j || j==n )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if( j==0 || i==n/2 && j>0 && j<n||i==0 && j>0 && j<n || i==n-1 )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if(j == 0 && i<n-1 || i== n-1 && j>=0 && j<=n  || j== n && i<n-1 )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if(j==0 || i==n/2 && j>0 && j<n||i == 0 || j==n && i<=n/2 || i-j == n/2  )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if(i==0  || j == 0  || i == n-1   || j==n )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.print(" ");
			for(int j = 0; j<=n; j++) {
				if(j == 0 ||i==j || j==n )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}

			
			
			
			
			
			System.out.println();
		}
		}
	}

	


