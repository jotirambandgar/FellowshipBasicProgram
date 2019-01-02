package com.bridgelab.objectoriented;
import java.util.Arrays;

import com.bridgelab.utilit.*;

/**
 * 
 * @author bridgeit
 *
 */
public class DeckOfCard {

	public static void main(String[] args) 
	{
		String []suits = {"Clubs","Diamonds", "Hearts", "Spades"};
		String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
        String cards[]=getCard(suits,rank);       //  addition of  above two arrays element we get total number of cards
        Utility.prinStringArray(cards);           //Utility method for printing single dimensional array without shuffling
        System.out.println("Enter how many time shuffle cards");
        int times = Utility.intInput();             // taking how many time we shuffle cards
        System.out.println("Shuffle cards:");
        String shuffleCards[] = shuffleCard(cards,times);           // shuffle cards by using random function
        Utility.prinStringArray(cards);             //Utility method for printing single dimensional array without shuffling
        Arrays.sort(cards);
        String player[][] = distributeCards(cards);
        for(int i = 0 ; i < 4 ; i++)
        {
        	System.out.println("player"+(i+1)+":");
        	for(int j = 0; j< 9 ; j++)
        	{
        		System.out.print("    "+player[i][j]);
        	}
        System.out.println();
        }
        
	}
	//====================================================================================================================
	public static String[] getCard(String []suits,String []rank) //for creating 52 cards by adding two array
	{
		String []cards = new String[52];
		int i=0;
		for(String suit:suits)
		{
			for(String ran : rank)
			{
				cards[i]=ran+suit;
				i++;
			}
		}
		return cards;
	}
	
	
	public static String[] shuffleCard(String []cards,int times)
	{
		for(int i = 0; i < times;i++)
		{
		int random = (int)(Math.random()*(52-1))+1;
		String temp = cards[i];
		cards[i] = cards[random];
		cards[random] = temp;
		}
		return cards;
	}

	public static String[][] distributeCards(String cards[])
	{
		int count = 0;
		String playerCards[][] = new String[4][9];
		for(int i = 0; i < 4 ; i++)
		{
			for(int j = 0; j < 9 ; j++)
			{
				playerCards[i][j] = cards[count];
				count++;
			}
		}
		return playerCards;
	}

}
