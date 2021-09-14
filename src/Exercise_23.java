/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_23{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String answer_silent_turn = scanner.nextLine().toLowerCase();

        if(answer_silent_turn.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            String answer_battery_terminals = scanner.nextLine().toLowerCase();
            if(answer_battery_terminals.equals("y")){
                System.out.println("Clean terminals and try starting again.");
                return;
            }
            else{
                System.out.println("Replace cables and try again.");
                return;
            }
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            String answer_slicking_noise = scanner.nextLine().toLowerCase();
            if(answer_slicking_noise.equals("y")){
                System.out.println("Replace the battery. ");
                return;
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                String answer_crank_but_fail = scanner.nextLine().toLowerCase();
                if(answer_crank_but_fail.equals("y")){
                    System.out.println("Check spark plug connections.");
                    return;
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    String answer_start_then_die = scanner.nextLine().toLowerCase();
                    if(answer_start_then_die.equals("y")){
                        System.out.print("Does your car have fuel injection? ");
                        String answer_fuel_injection = scanner.nextLine().toLowerCase();
                        if(answer_fuel_injection.equals("y")){
                            System.out.println("Get it in for service");
                            return;
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                        return;
                    }
                }
            }
        }

    }
}
