package quiniela;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Equipos {
	public static String name;
	public static Integer[] scoredGoals= new Integer[100];
	public static Integer[] concededGoals= new Integer[100];
	public static String[] teams= new String[20];
	private static final int NUM_OF_TEAMS= 20;
	
	public Equipos() throws IOException
	{
//		scoredGoals= new ArrayList<Integer>();
//		concededGoals= new ArrayList<Integer>();
//		teams= new ArrayList<String>();
		chargeTeams("C:/Users/PabloD/Desktop/ProyectoQuiniela/Equipos.txt");
	}
	
	public static void main(String[] args) throws IOException {
//		chargeTeams("C:/Users/PabloD/Desktop/ProyectoQuiniela/Equipos.txt");
    }
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name= newName;
	}
	
	public Integer[] getScoredGoals()
	{
		return scoredGoals;
	}
	
	public void setScoredGoals(Integer[] newScoredGoals)
	{
		scoredGoals= newScoredGoals;
	}
	
	public Integer[] getConcededGoals()
	{
		return concededGoals;
	}
	
	public void setConcededGoals(Integer[] newConcededGoals)
	{
		concededGoals= newConcededGoals;
	}
	
	public String[] getTeams()
	{
		return teams;
	}
	
	public void setTeams(String[] newTeams)
	{
		teams= newTeams;
	}
	
	public static void chargeTeams(String fichero) throws IOException
	{
		BufferedReader file= new BufferedReader(
								new FileReader(fichero));
		int n= 0;
		while (n != NUM_OF_TEAMS)
		{
			teams[n]= file.readLine();
//			System.out.println(teams[n]);
			n++;
		} 
		file.close();
	}
	
}
