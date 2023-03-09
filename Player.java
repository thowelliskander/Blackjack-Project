/**********************************************************
 * Program Name   : Player
 * Author         : Liam Donovan
 * Date           :
 * Course/Section : CSC-264-301
 * Program Description: This class will represent a player
 *
 * Methods:
 * -------
 * Player - creates a new Player object
 * inRange - determines if a quiz grade is valid or not
 *
 **********************************************************/
 import java.util.ArrayList;

public class Player
{
   //Local Constants - none

   //Local Variables
   private int dollars;
   private boolean busted;
   private boolean stay;
   private int buyInVal;
   private int stayLimit;
   private Player nextPlayer;
   private ArrayList<Card> hand;

   /**********************************************************
    * Method Name    : Player
    * Author         : Liam Donovan
 	* Date           : 9 Mar 2023
 	* Course/Section : CSC-264-301
    * Method Description: creates new Player object
    *
    * BEGIN Player
    *	Set dollars to money parameter
    *	Set busted to false
    * END Player
    **********************************************************/


	public Player(int money)
	{
		//local constants - none

		//local variables - none

		/********************   Start main method  *****************/
		this.dollars = money;
		this.busted = false;
		this.stay = false;
		this.hand = new ArrayList<Card>();
		this.newCard = 0;

	} //end Player method

	/**********************************************************
	* Method Name    : hit
	* Author         : Liam Donovan
 	* Date           : 9 Mar 2023
 	* Course/Section : CSC-264-301
	* Method Description: This method will allow the player to
	*	draw an additional card.
	*
	* BEGIN hit
	*	Call the deal one
	* END hit
	**********************************************************/
	public void hit()
	{
		//local constants - none

		//local variables - none

		/********************   Start main method  *****************/
		//Call dealOne method to add a card to the hand
		hand.add(DeckOfCards.dealOne());
	}//end

	/**********************************************************
	* Method Name    : buyIn
	* Author         : Liam Donovan
	* Date           : 9 Mar 2023
	* Course/Section : CSC-264-301
	* Method Description: This method will remove money from the
	*	player when the round starts
	*
	* BEGIN buyIn
	*	Subtract buyInVal from dollars
	* END buyIn
	**********************************************************/
	public void buyIn()
	{
		//local constants - none

		//local variables - none

		/********************   Start main method  *****************/
		//Subtract buyInVal from dollars
		this.dollars -= buyInVal;

	}//end BuyIn

	/**********************************************************
	* Method Name    : setMoney
	* Author         : Liam Donovan
	* Date           : 9 Mar 2023
	* Course/Section : CSC-264-301
	* Method Description: This method will give money to the
	*	player
	*
	* BEGIN buyIn
	*	Add money to dollars
	* END buyIn
	**********************************************************/
	public void setMoney(int money)
	{
		//local constants - none

		//local variables - none

		/********************   Start main method  *****************/
		this.dollars += money;
	}//end setMoney

	/**********************************************************
	* Method Name    : toString
	* Author         : Liam Donovan
	* Date           : 9 Mar 2023
	* Course/Section : CSC-264-301
	* Method Description: This method will return a String
	*	representation of the Player object
	*
	* BEGIN toString
	*
	* END toString
	**********************************************************/
	public void toString()
	{
		//local constants - none

		//local variables - none

		/********************   Start main method  *****************/

	}//end toString

} //end Player
