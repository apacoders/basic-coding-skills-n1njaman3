package assignment1;

/**
 * Instructions for this assignment.  Download this template from GitHub, fill in
 * the author comment below with your name and implement the requirements below.
 * 
 * If code is turned in and cannot be compiled, you will receive 0 points.
 * If a requirement is not implemented, you will receive 0 points.
 * Requirements are worth 50 points each.
 * 
 * @author myname
 * 
 * Requirements for main method
 * 
 * REQUIREMENT 1 
 * 
 * Print numbers 1 through 5 on screen using a for loop
 * 
 * REQUIREMENT 2 
 * 
 * Print numbers 10 down to -1 on screen using a while loop.  The while loop
 * must use a boolean variable as the argument for the while statement.
 * 
 * REQUIREMENT 3 
 * 
 * Call the static method CallMeIf in a for loop with the arguments 1 through 6.
 * Print the results of the CallMeIf method on the screen
 * (see the REQUIREMENTS in that method)
 * 
 * REQUIREMENT 4 
 * 
 * Call the static method CallMeSwitch in a for loop with the arguments 1 through 6.
 * Print the results of the CallMeSwitch method on the screen
 * (see the REQUIREMENTS in that method)
 * 
 * DESIGN_REQUIREMENT
 * 
 * This must be handed in on paper - it must be neat!
 * 
 * Show a flow chart of the loop in REQUIREMENT 2
 * 
 * TEST_REQUIREMENT
 * 
 * Show a trace of REQUIREMENT 1
 * 
 */
public class Assignment1 {

    public static void main(String[] args) {
        
        System.out.println("Requirement 1");
        for(int i=0;i<5;i++){
            System.out.println(i+1);
        }
        System.out.println("Requirement 2");
        int a = 10;
        boolean stop = false;
        while(stop!=true){
            System.out.println(a);
            a-=1;
            if(a==-2){
                stop =true;
            }
        }
        System.out.println("Requirement 3");
        for(int b=0; b<6; b++){
            NewClass.callMeIf(b+1);
            
        }
        System.out.println("Requirement 4");
            System.out.println(NewClass.callMeSwitch());
    }
    
}
