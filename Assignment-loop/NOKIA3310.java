import java.util.Scanner;
public class NOKIA3310 {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
	String message = """
	                
                         ===========================
                         NOKIA 3310 - MAIN MENU
                         ===========================
                         1 - Phone  book
                         2 - Messages
                         3 - Chat
                         4 - Call register
                         5 - Tones
                         6 - Settings
                         7 - Call divert
                         8 - Games
                         9 - Calculator
                         10 - Reminders
                         11 - Clock
                         12 - Profiles
                         13 - Sim Service
                         ===========================
            		""";
		System.out.println(message);
		System.out.print("enter a number to select: ");
	        int number = input.nextInt();
		switch(number) {
	               case 1:
			
			String message2 = """
    ===============================
           PhoneBook Menu
    ===============================
    1  - Search
    2  - Service Nos.
    3  - Add name
    4  - Erase
    5  - Edit
    6  - Assign tone
    7  - Send b'card
    8  - Option
    9  - Speed dials
    10 - Voice tags
    ===============================
    """;
	                System.out.println(message2);
			System.out.print("enter a number to select: ");
			int number2 = input.nextInt();
			


			switch(number2) {
			 case 1:
			    System.out.println("search");
			      break;
			case 2:
			    System.out.println("Service Nos.");
			     break;
			case 3:
			    System.out.println("Add name");
			     break;
			case 4:
			    System.out.println("Erase");
			     break;
			case 5:
			    System.out.println("Edit");
			     break;
			case 6:
			    System.out.println("Assign tone");
			      break;
			case 8:
				String message3 = """
    ==============================
              Options Menu
    ==============================
    1 - Type of view
    2 - Memory status
    ==============================
    """;
			System.out.println(message3);
			int num3 = input.nextInt();
			switch(num3) {
			case 1:	
			    System.out.println("type of view");
			    break;
			case 2:
			   System.out.println("memory status");
			   break;
			default:
			    break;
			 }
			    break;
			case 9:
			    System.out.println("speed dials");
			    break;
			case 10:
			     System.out.println("voice tags");
			     break;
	
			default:
			     break;
			}
			     break;
			case 2:
			  
			String message3 = """
    ===============================
            Messaging Menu
    ===============================
    1  - Write messages
    2  - Inbox
    3  - Outbox
    4  - Picture messages
    5  - Templates
    6  - Smileys
    7  - Message settings
    8  - Info service
    9  - Voice mailbox number
    10 - Service command editor
    ===============================
    """;
				System.out.println(message3);
			System.out.print("enter a number to select: ");
			int number3 = input.nextInt();
			switch(number3) {
			case 1:
			  System.out.println("write messages: ");
			    break;
			case 2:
			  System.out.println("inbox ");
			    break;
			case 3:
			  System.out.println("outbox ");
			    break;
			case 4:
			  System.out.println("picture message ");
			    break;
			case 5:
			  System.out.println("Templates ");
			    break;
			case 6:
			  System.out.println("Smileys ");
			    break;
			case 7:
			  
			 String message31 = """
    ================================
          Message Settings Menu
    ================================
    1 - Set 1
    2 - Common
    ================================
    """;
			System.out.println(message31);
			System.out.print("enter a number to select: ");
			int number31 = input.nextInt();
			switch(number31) {
			case 1:
			String message32 = """
    ================================
          Message Settings(SET 1)
    ================================
    1. Message center number
    2. Message sent as
    3. Message validity
    ================================
    """;
			System.out.println(message32);
			System.out.print("enter a number to select: ");
			int number32 = input.nextInt();
			switch(number32) {
			case 1:
			  System.out.println("message center number");
			    break;
			case 2:
			   System.out.println("messages sent as");
			    break;
			case 3:
			   System.out.println("message validity");
			    break;
			default :
			    break;
			}
			    break;
			case 2:
			 
			   String message33 = """
    ================================
        Message Settings - Common
    ================================
    1. Delivery reports
    2. Reply via same centre
    3. Character support
    ================================
    """;
			System.out.println(message33);
			System.out.print("enter a number to select: ");
			int number33 = input.nextInt();
	                switch(number33) {
			 case 1:
			      System.out.println("delivery reports");
			      break;
			case 2:
			     System.out.println("Reply via same centre");
			      break;
			case 3:
			     System.out.println("Character Support");
		             break;
		        default:
			     break;
			}
			      break;
			default:
			      break;
			}
			      break;
			case 8:
			System.out.println("info service");
			      break;
			case 9:
			System.out.println("Voice mailbox number");
			       break;
			case 10:
			System.out.println("service command editor");
			       break;
			default:
			       break;
                        }
			       break;
			case 3:
			System.out.print(" chat with friends and connect with people all over the world");
			        break;
			case 4:
			 
			String message34 = """
    ================================
            Call Register Menu
    ================================
    1 - Missed call
    2 - Received call
    3 - Dialled numbers
    4 - Erase recent call lists
    5 - Show call duration
    6 - Show call cost
    7 - Call cost settings
    8 - Prepaid credit
    ================================
    """; 
			System.out.println(message34);
			System.out.print("enter a number to select: ");
			int number34 = input.nextInt();
	                switch(number34) {
			  case 1:
                             System.out.println("Missed call");
			      break;
			  case 2:
			     System.out.println("Received call");
			      break;
			   case 3:
			     System.out.println("Dialled numbers");
			      break;
			   case 4:
			     System.out.println("Erase recent call list");
			      break;
		           case 5:
			 String message35 = """
    ================================
           Call Duration Menu
    ================================
    1 - Last call duration
    2 - All calls duration
    3 - Received calls duration
    4 - Dialled calls duration
    5 - Clear timers
    ================================
    """;
				System.out.println(message35);
			System.out.print("enter a number to select: ");
			int number35 = input.nextInt();
	                switch(number35) {
			case 1: 
                       System.out.println("last call duration");
			  break;
			case 2:
			System.out.println("All calls duration");
			  break;
			case 3:
			System.out.println("Received calls duration");
		          break;
			case 4:
			System.out.println("Dialled calls duratio");
			  break;
			case 5:
			System.out.println("clear timers");
			  break;
			default:
			  break;
			}
			  break;
			case 6:
  			String message36 = """
    ================================
          Show All Cost Menu
    ================================
    1 - Last call cost
    2 - All calls cost
    3 - Clear counters
    ================================
    """;			System.out.println(message36);
			System.out.print("enter a number to select: ");
			int number36 = input.nextInt();
			switch(number36) {
			case 1:
                            System.out.println("Last call cost");
			    break;
			case 2:
			  System.out.println("All cals cost");
			    break;
			case 3:
			  System.out.println("clear counters");
			    break;
			default:
			    break;
			}
			break;
			case 7:
			
			String message37 = """
    ================================
         Call Cost Settings
    ================================
    1 - Call cost limit
    2 - Show cost in
    ================================
    """;
				System.out.println(message37);
			System.out.print("enter a number to select: ");
			int number37 = input.nextInt();
			switch(number37) {
			case 1: 
			System.out.println("Call cost limit");
			   break;
			case 2:
			System.out.println("Show cost in");
			  break;
			default:
			  break;
			}
			  break;
			case 8:
  			System.out.println("prepaid credit");
			  break;
			default:
			break;
			}
			break;
			case 5:
			String message38 = """
    ===============================
           Tones Settings Menu
    ===============================
    1 - Ringing tone
    2 - Ringing volume
    3 - Incoming call alert
    4 - Composer
    5 - Message alert tone
    6 - Keypad tones
    7 - Warning and game tones
    8 - Vibrating alert
    9 - Screen saver
    ===============================
    """;
			System.out.println(message38);
			System.out.print("enter a number to select: ");
			int number38 = input.nextInt();
			switch(number38) {
			case 1: 
			System.out.println("Ringing tone");
			break;
			case 2:
			System.out.println("Ringing volume");
			break;
			case 3:
			System.out.println("Incoming call alert");
			break;
			case 4:
			System.out.println("composer");
			break;
			case 5:
			System.out.println("message alert tone");
			break;
			case 6:
			System.out.println("Keypad tones");
			break;
			case 7:
			System.out.println("Warning and game tones");
			break;
			case 8:
			System.out.println("Vibrating alert");
			break;
			case 9:
			System.out.println("Screen saver");
			break;
			default:
			break;
			}
			break;
			case 6: 
				
				String message39 = """
    ================================
              Settings Menu
    ================================
    1 - Call settings
    2 - Phone settings
    3 - Security settings
    4 - Restore factory settings
    ================================
    """;

				System.out.println(message39);
			System.out.print("enter a number to select: ");
			int number39 = input.nextInt();
			switch(number39) {
			case 1:
                          
			  String message40 = """
    ================================
            Call Settings
    ================================
    1 - Automatic redial
    2 - Speed dialing
    3 - Call waiting options
    4 - Own number sending
    5 - Phone line in use
    6 - Automatic answer
    ================================
    """;

			System.out.println(message40);
			System.out.print("enter a number to select: ");
			int number40 = input.nextInt();
			switch(number40) {
			  case 1: 
				System.out.println("Automatic redial");
				break;
			  case 2:
				System.out.println("Speed dialing");
				break;
			  case 3:
				System.out.println("Call waiting options");
				break;
			  case 4:
				System.out.println("Own number sending");
				break;
			  case 5:
				System.out.println("phone line in use");
				break;
			  case 6:
				System.out.println("Automatic answer");
				break;
			  default:
				 break;
			  }
			  break;
		        case 2:
			String message01 = """
    ================================
           Phone Settings
    ================================
    1 - Language
    2 - Cell info display
    3 - Welcome note
    4 - Network selection
    5 - Lights
    6 - Confirm SIM service action
    ================================
    """;

			System.out.println(message01);
			System.out.print("enter a number to select: ");
			int number43 = input.nextInt();
			switch(number43) {
			case 1: 
			  System.out.println("Language");
			  break;
			case 2:
			System.out.println("Cell info display");
			   break;
			case 3:
			System.out.println("welcome note");
			   break;
			case 4:
			System.out.println("Network selection");
			   break;
			case 5:
			System.out.println("Lights");
			   break;
			case 6:
			System.out.println("Confirm SIM service action");
			   break;
			default:
			break;
			}
			break;
			case 3:
		        
			String message42 = """
    ================================
          Security Settings
    ================================
    1 - Pin code request
    2 - Call barring service
    3 - Fixed dialing
    4 - Closed user group
    5 - Phone security
    6 - Change access codes
    ================================
    """;

			System.out.println(message42);
			System.out.print("enter a number to select: ");
			int number41 = input.nextInt();
			switch(number41) {
			case 1: 
   			System.out.println("Pin code request");
			  break;
			case 2: 
   			System.out.println("Call Baring Service");
			  break;
			case 3: 
   			System.out.println("Fixed dialing");
			  break;
		        case 4: 
   			System.out.println("Closed user group");
			  break;
		        case 5: 
   			System.out.println("Phone security");
			  break;
		        case 6: 
   			System.out.println("Change access code");
			  break;
			default:
			  break;
			}
			  break;
			case 4:
			System.out.println("Restore Factory Settings");
			default:
			break;
			}
			  break;
			case 7:
			System.out.println("Call Divert");
			  break;
			case 8:
		        System.out.println("Games");
			  break;
			case 9:
		        System.out.println("Calculator");
			  break;
			case 10:
		        System.out.println("Reminders");
			  break;
			case 11:
		       
			String message44 = """
    ================================
             CLOCK MENU
    ================================
    1 - Alarm clock
    2 - Clock settings
    3 - Date setting
    4 - Stopwatch
    5 - Countdown timer
    6 - Auto update of date and time
    ================================
    """;

			System.out.println(message44);
			System.out.print("enter a number to select: ");
			int number44 = input.nextInt();
			switch(number44) {
			case 1:
                         System.out.println("Alarm clock");
			   break;
			case 2:
                         System.out.println("Clock settings");
			   break;
			case 3:
                         System.out.println("Date setting");
			   break;
			case 4:
                         System.out.println("Stopwatch");
			   break;
			case 5:
                         System.out.println("Countdown timer");
			   break;
			case 6:
                         System.out.println("Auto update of date and time");
			   break;
			default:
			break;
			}
			  break;
			case 12:
			System.out.println("Profiles");
			  break;
			case 13:
			System.out.println("Sim services");
			  break; 
			default:
			break;                       
                        }

			
}
}



































































































































































































			
			
			



			


		
		
			
				
				