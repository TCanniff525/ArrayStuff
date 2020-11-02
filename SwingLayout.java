ICS3U
Period 2
Stream
Classwork
People
ICS3U
Period 2
Upcoming
Due tomorrow
#038 - Problem 06 - PurchaseReceipt
#037 - Exercise 14 - MultiplyNumberList
Project Planning
View all

Share something with your class…

Announcement: "SWING TEMPLATE Use this template when…"
Casey Devet
Created 12:16 PM12:16 PM
SWING TEMPLATE

Use this template when creating GUI programs

SwingTemplate.java
Java


Announcement: "PROFESSIONAL ENGINEERS OF ONTARIO…"
Casey Devet
Created Oct 20Oct 20
PROFESSIONAL ENGINEERS OF ONTARIO CODING CONTEST

The Professional Engineers of Ontario is hosting a virtual coding contest for high school students on Saturday.  A poster is attached if you are interested in participating.

Coding Contest Flyer 2020_v3.pdf
PDF


Announcement: "THE SOCIAL DILEMMA RESPONSE Your…"
Casey Devet
Created Oct 19Oct 19
THE SOCIAL DILEMMA RESPONSE

Your response to "The Social Dilemma" will now be due on Thursday.  If you are having trouble submitting, please talk to me during class about it.


Announcement: "TEST MOVED TO WEDNESDAY The test will…"
Casey Devet
Created Oct 19Oct 19
TEST MOVED TO WEDNESDAY

The test will be on Wednesday morning.  It covers Lessons 08 to 12.  Please spend some time doing the Quizizz questions and reading the lessons on the website.


Announcement: "CHANGE TO PROBLEM 04 I will be changing…"
Casey Devet
Created Oct 8Oct 8
CHANGE TO PROBLEM 04

I will be changing Problem 04 (HigherOrLower) because I want us to practice strings a bit more.  Please halt any progress on this program until tomorrow morning.


Announcement: "TEST TOMORROW (TUESDAY) The test will…"
Casey Devet
Created Oct 5Oct 5
TEST TOMORROW (TUESDAY)

The test will cover Lessons 01 to 07.  Excellent ways to study:
- Complete Quizizz
- Read lessons on the course website
- Review your programs

ICS3U Period 2
// Import the GUI libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingTemplate {
	/**
	 * MAIN METHOD
	 * This main method starts the GUI and runs the createMainWindow() method.
     * This method should not be changed.
	 */
	public static void main (String [] args) {
		javax.swing.SwingUtilities.invokeLater (new Runnable () {
			public void run () {
				createMainWindow ();
			}
		});
	}


	/**
	 * STATIC VARIABLES AND CONSTANTS
	 * Declare the objects and variables that you want to access across
     * multiple methods.
	 */



	/**
	 * CREATE MAIN WINDOW
     * This method is called by the main method to set up the main GUI window.
	 */
	private static void createMainWindow () {
		// Create and set up the window.
		JFrame frame = new JFrame ("Frame Title");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setResizable (false);

		// The panel that will hold the components in the frame.
		JPanel contentPane = new JPanel ();

        // TODO: Add components to the content pane panel


		// Add the panel to the frame
		frame.setContentPane(contentPane);

		//size the window.
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}


    /**
     * HELPER METHODS
     * Methods that you create to manage repetitive tasks.
     */



    /**
     * EVENT LISTENERS
     * Subclasses that handle events (button clicks, mouse clicks and moves,
     * key presses, timer expirations)
     */

