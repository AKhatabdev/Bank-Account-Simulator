/*
Author: Awais Khatab
Title: Bank Account Simulator, Practice, Testing and Prototyping
Version: 1.1.0

Note:
Basic Banking App Simulator is a small project I created to help you learn some Java programming :)

Quick tip to start:
Look around at the Account classes and make sure to read the comments carefully,
they will help you try to understand the code.

Once you have had a look around try creating some accounts and make some transfers between them!
 */
public interface Transfer 
{
	boolean transferFrom(Account from, double amount);
	boolean transferTo(Account to, double amount);
}
