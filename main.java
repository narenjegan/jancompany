import java.util.*;
import java.util.concurrent.TimeUnit;

public class main {

    //GLOBAL VARIABLE
    static ArrayList<order> orders = new ArrayList<order>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to tic tac toe! Enter your username and passcode:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Username:");
        String user = scanner.nextLine();
        System.out.println("Password:");
        String pass = scanner.nextLine();

        if (user.equals("bigbrother") && pass.equals("1984")) {
            app(args);
        } else {

            String one = "1";
            String two = "2";
            String three = "3";
            String four = "4";
            String five = "5";
            String six = "6";
            String seven = "7";
            String eight = "8";
            String nine = "9";
            System.out.println(one + " " + two + " " + three);
            System.out.println(four + " " + five + " " + six);
            System.out.println(seven + " " + eight + " " + nine);
            int turn = 0;

        /*
        //ROWS THAT ARE ==
        if(one.equals(two)&&two.equals(three)){
            System.out.println("Congrats! Game Over"); System.exit(0);
        }
        if(four.equals(five)&&five.equals(six)){
            System.out.println("Congrats! Game Over"); System.exit(0);
        }
        if(seven.equals(eight)&&eight.equals(nine)){
            System.out.println("Congrats! Game Over"); System.exit(0);
        }

        //COLUMNS THAT ARE ==
        if(one.equals(four)&&four.equals(seven)){
            System.out.println("Congrats! Game Over. ");
        }
        if(two.equals(five)&&five.equals(eight)){
            System.out.println("Congrats! Game Over"); System.exit(0);
        }
        if(three.equals(six)&&six.equals(nine)){
            System.out.println("Congrats! Game Over"); System.exit(0);
        }

        //DIAGONALS THAT ARE ==
        if(one.equals(five)&&five.equals(nine)){
            System.out.println("Congrats! Game Over"); System.exit(0);
        }
        if(three.equals(five)&&five.equals(seven)){
            System.out.println("Congrats! Game Over"); System.exit(0);
        }

         */

            while (turn < 9) {
                {// A GAME OF TTT IS 9 TURNS. THE WHILE LOOP MAKES IT LAST FOR ONLY 9 TURNS.

                    boolean noWin = false;
                    while (noWin = true) {
                        if (turn % 2 == 0) {// PLAYER 1 TURN
                            System.out.println("Player 1: Insert number");

                            String p1turn = scanner.nextLine();
                            // FIRST ROW
                            if (p1turn.equals(one)) {
                                one = "X";
                                System.out.println(one + " " + two + " " + three);
                                System.out.println(four + " " + five + " " + six);
                                System.out.println(seven + " " + eight + " " + nine);
                                //ROWS THAT ARE ==

                                if (one.equals(two) && two.equals(three)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (four.equals(five) && five.equals(six)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (seven.equals(eight) && eight.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //COLUMNS THAT ARE ==
                                if (one.equals(four) && four.equals(seven)) {
                                    System.out.println("Congrats! Game Over. ");
                                }
                                if (two.equals(five) && five.equals(eight)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(six) && six.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //DIAGONALS THAT ARE ==
                                if (one.equals(five) && five.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(five) && five.equals(seven)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                            }
                            if (p1turn.equals(two)) {
                                two = "X";
                                System.out.println(one + " " + two + " " + three);
                                System.out.println(four + " " + five + " " + six);
                                System.out.println(seven + " " + eight + " " + nine);

                                if (one.equals(two) && two.equals(three)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (four.equals(five) && five.equals(six)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (seven.equals(eight) && eight.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //COLUMNS THAT ARE ==
                                if (one.equals(four) && four.equals(seven)) {
                                    System.out.println("Congrats! Game Over. ");
                                }
                                if (two.equals(five) && five.equals(eight)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(six) && six.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //DIAGONALS THAT ARE ==
                                if (one.equals(five) && five.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(five) && five.equals(seven)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                            }
                            if (p1turn.equals(three)) {
                                three = "X";
                                System.out.println(one + " " + two + " " + three);
                                System.out.println(four + " " + five + " " + six);
                                System.out.println(seven + " " + eight + " " + nine);

                                if (one.equals(two) && two.equals(three)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (four.equals(five) && five.equals(six)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (seven.equals(eight) && eight.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //COLUMNS THAT ARE ==
                                if (one.equals(four) && four.equals(seven)) {
                                    System.out.println("Congrats! Game Over. ");
                                }
                                if (two.equals(five) && five.equals(eight)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(six) && six.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //DIAGONALS THAT ARE ==
                                if (one.equals(five) && five.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(five) && five.equals(seven)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                            }
                            // SECOND ROW
                            if (p1turn.equals(four)) {
                                four = "X";
                                System.out.println(one + " " + two + " " + three);
                                System.out.println(four + " " + five + " " + six);
                                System.out.println(seven + " " + eight + " " + nine);

                                if (one.equals(two) && two.equals(three)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (four.equals(five) && five.equals(six)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (seven.equals(eight) && eight.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //COLUMNS THAT ARE ==
                                if (one.equals(four) && four.equals(seven)) {
                                    System.out.println("Congrats! Game Over. ");
                                }
                                if (two.equals(five) && five.equals(eight)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(six) && six.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //DIAGONALS THAT ARE ==
                                if (one.equals(five) && five.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(five) && five.equals(seven)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                            }
                            if (p1turn.equals(five)) {
                                five = "X";
                                System.out.println(one + " " + two + " " + three);
                                System.out.println(four + " " + five + " " + six);
                                System.out.println(seven + " " + eight + " " + nine);

                                if (one.equals(two) && two.equals(three)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (four.equals(five) && five.equals(six)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (seven.equals(eight) && eight.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //COLUMNS THAT ARE ==
                                if (one.equals(four) && four.equals(seven)) {
                                    System.out.println("Congrats! Game Over. ");
                                }
                                if (two.equals(five) && five.equals(eight)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(six) && six.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //DIAGONALS THAT ARE ==
                                if (one.equals(five) && five.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(five) && five.equals(seven)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }


                            }
                            if (p1turn.equals(six)) {
                                six = "X";
                                System.out.println(one + " " + two + " " + three);
                                System.out.println(four + " " + five + " " + six);
                                System.out.println(seven + " " + eight + " " + nine);

                                if (one.equals(two) && two.equals(three)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (four.equals(five) && five.equals(six)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (seven.equals(eight) && eight.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //COLUMNS THAT ARE ==
                                if (one.equals(four) && four.equals(seven)) {
                                    System.out.println("Congrats! Game Over. ");
                                }
                                if (two.equals(five) && five.equals(eight)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(six) && six.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //DIAGONALS THAT ARE ==
                                if (one.equals(five) && five.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(five) && five.equals(seven)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                            }
                            // THIRD ROW
                            if (p1turn.equals(seven)) {
                                seven = "X";
                                System.out.println(one + " " + two + " " + three);
                                System.out.println(four + " " + five + " " + six);
                                System.out.println(seven + " " + eight + " " + nine);

                                if (one.equals(two) && two.equals(three)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (four.equals(five) && five.equals(six)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (seven.equals(eight) && eight.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //COLUMNS THAT ARE ==
                                if (one.equals(four) && four.equals(seven)) {
                                    System.out.println("Congrats! Game Over. ");
                                }
                                if (two.equals(five) && five.equals(eight)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(six) && six.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //DIAGONALS THAT ARE ==
                                if (one.equals(five) && five.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(five) && five.equals(seven)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                            }
                            if (p1turn.equals(eight)) {
                                eight = "X";
                                System.out.println(one + " " + two + " " + three);
                                System.out.println(four + " " + five + " " + six);
                                System.out.println(seven + " " + eight + " " + nine);

                                if (one.equals(two) && two.equals(three)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (four.equals(five) && five.equals(six)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (seven.equals(eight) && eight.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //COLUMNS THAT ARE ==
                                if (one.equals(four) && four.equals(seven)) {
                                    System.out.println("Congrats! Game Over. ");
                                }
                                if (two.equals(five) && five.equals(eight)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(six) && six.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                                //DIAGONALS THAT ARE ==
                                if (one.equals(five) && five.equals(nine)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }
                                if (three.equals(five) && five.equals(seven)) {
                                    System.out.println("Congrats! Game Over");
                                    System.exit(0);
                                }

                            }

                            if (p1turn.equals(nine)) {
                                nine = "X";
                                System.out.println(one + " " + two + " " + three);
                                System.out.println(four + " " + five + " " + six);
                                System.out.println(seven + " " + eight + " " + nine);
                            }
                            turn++;
                        }
                        if (turn % 2 != 0) {// PLAYER 2 TURN
                            if (turn <= 7) { // PLAYER 2 ONLY PLAYS FOR T1, 3, 5, AND 7, NOT 0, 2, 4, 6, 8
                                System.out.println("Player 2: Insert number");
                                String p2turn = scanner.nextLine();
                                // FIRST ROW
                                if (p2turn.equals(one)) {
                                    one = "O";
                                    System.out.println(one + " " + two + " " + three);
                                    System.out.println(four + " " + five + " " + six);
                                    System.out.println(seven + " " + eight + " " + nine);

                                    if (one.equals(two) && two.equals(three)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (four.equals(five) && five.equals(six)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (seven.equals(eight) && eight.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //COLUMNS THAT ARE ==
                                    if (one.equals(four) && four.equals(seven)) {
                                        System.out.println("Congrats! Game Over. ");
                                    }
                                    if (two.equals(five) && five.equals(eight)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(six) && six.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //DIAGONALS THAT ARE ==
                                    if (one.equals(five) && five.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(five) && five.equals(seven)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                }
                                if (p2turn.equals(two)) {
                                    two = "O";
                                    System.out.println(one + " " + two + " " + three);
                                    System.out.println(four + " " + five + " " + six);
                                    System.out.println(seven + " " + eight + " " + nine);

                                }
                                if (p2turn.equals(three)) {
                                    three = "O";
                                    System.out.println(one + " " + two + " " + three);
                                    System.out.println(four + " " + five + " " + six);
                                    System.out.println(seven + " " + eight + " " + nine);

                                }
                                // SECOND ROW
                                if (p2turn.equals(four)) {
                                    four = "O";
                                    System.out.println(one + " " + two + " " + three);
                                    System.out.println(four + " " + five + " " + six);
                                    System.out.println(seven + " " + eight + " " + nine);

                                    if (one.equals(two) && two.equals(three)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (four.equals(five) && five.equals(six)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (seven.equals(eight) && eight.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //COLUMNS THAT ARE ==
                                    if (one.equals(four) && four.equals(seven)) {
                                        System.out.println("Congrats! Game Over. ");
                                    }
                                    if (two.equals(five) && five.equals(eight)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(six) && six.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //DIAGONALS THAT ARE ==
                                    if (one.equals(five) && five.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(five) && five.equals(seven)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }


                                }
                                if (p2turn.equals(five)) {
                                    five = "O";
                                    System.out.println(one + " " + two + " " + three);
                                    System.out.println(four + " " + five + " " + six);
                                    System.out.println(seven + " " + eight + " " + nine);

                                    if (one.equals(two) && two.equals(three)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (four.equals(five) && five.equals(six)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (seven.equals(eight) && eight.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //COLUMNS THAT ARE ==
                                    if (one.equals(four) && four.equals(seven)) {
                                        System.out.println("Congrats! Game Over. ");
                                    }
                                    if (two.equals(five) && five.equals(eight)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(six) && six.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //DIAGONALS THAT ARE ==
                                    if (one.equals(five) && five.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(five) && five.equals(seven)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                }
                                if (p2turn.equals(six)) {
                                    six = "O";
                                    System.out.println(one + " " + two + " " + three);
                                    System.out.println(four + " " + five + " " + six);
                                    System.out.println(seven + " " + eight + " " + nine);

                                    if (one.equals(two) && two.equals(three)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (four.equals(five) && five.equals(six)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (seven.equals(eight) && eight.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //COLUMNS THAT ARE ==
                                    if (one.equals(four) && four.equals(seven)) {
                                        System.out.println("Congrats! Game Over. ");
                                    }
                                    if (two.equals(five) && five.equals(eight)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(six) && six.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //DIAGONALS THAT ARE ==
                                    if (one.equals(five) && five.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(five) && five.equals(seven)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                }

                                // THIRD ROW
                                if (p2turn.equals(seven)) {
                                    seven = "O";
                                    System.out.println(one + " " + two + " " + three);
                                    System.out.println(four + " " + five + " " + six);
                                    System.out.println(seven + " " + eight + " " + nine);

                                    if (one.equals(two) && two.equals(three)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (four.equals(five) && five.equals(six)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (seven.equals(eight) && eight.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //COLUMNS THAT ARE ==
                                    if (one.equals(four) && four.equals(seven)) {
                                        System.out.println("Congrats! Game Over. ");
                                    }
                                    if (two.equals(five) && five.equals(eight)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(six) && six.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //DIAGONALS THAT ARE ==
                                    if (one.equals(five) && five.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(five) && five.equals(seven)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }


                                }
                                if (p2turn.equals(eight)) {
                                    eight = "O";
                                    System.out.println(one + " " + two + " " + three);
                                    System.out.println(four + " " + five + " " + six);
                                    System.out.println(seven + " " + eight + " " + nine);

                                    if (one.equals(two) && two.equals(three)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (four.equals(five) && five.equals(six)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (seven.equals(eight) && eight.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //COLUMNS THAT ARE ==
                                    if (one.equals(four) && four.equals(seven)) {
                                        System.out.println("Congrats! Game Over. ");
                                    }
                                    if (two.equals(five) && five.equals(eight)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(six) && six.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //DIAGONALS THAT ARE ==
                                    if (one.equals(five) && five.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(five) && five.equals(seven)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                }
                                if (p2turn.equals(nine)) {
                                    nine = "O";
                                    System.out.println(one + " " + two + " " + three);
                                    System.out.println(four + " " + five + " " + six);
                                    System.out.println(seven + " " + eight + " " + nine);


                                    if (one.equals(two) && two.equals(three)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (four.equals(five) && five.equals(six)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (seven.equals(eight) && eight.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //COLUMNS THAT ARE ==
                                    if (one.equals(four) && four.equals(seven)) {
                                        System.out.println("Congrats! Game Over. ");
                                    }
                                    if (two.equals(five) && five.equals(eight)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(six) && six.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                    //DIAGONALS THAT ARE ==
                                    if (one.equals(five) && five.equals(nine)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }
                                    if (three.equals(five) && five.equals(seven)) {
                                        System.out.println("Congrats! Game Over");
                                        System.exit(0);
                                    }

                                }
                                turn++;
                            }
                        }
                    }
                }
                System.out.println("STALEMATE");
            }
        }


    }

    public static void app(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER A USERNAME");
        String username = scanner.nextLine();
        System.out.println("ENTER A PASSCODE");
        String passcode = scanner.nextLine();

        settings account = new settings(username, passcode);

        for (int i = 5; i >= 1; i--) {
            System.out.println("ENTER YOUR USERNAME");
            String loginuser = scanner.nextLine();
            System.out.println("ENTER YOUR PASSCODE");
            String loginpass = scanner.nextLine();

            settings login = new settings(loginuser, loginpass);

            if ((login.getUsername().equals(account.getUsername())) && (login.getPasscode().equals(account.getPasscode()))) {

                System.out.println("WELCOME BACK");
                entranceMessage();
                i = 0;

                if (login.getUsername().equals("LUCKY")) {
                    entranceMessage();
                    secret(account);
                }

                if(login.getUsername().equals("SYSTEM OVERRIDE")){
                    Logsmenu(account);
                    System.out.println("Aol vul dov spclk.");
                    String theonewholived = scanner.nextLine();
                    if(theonewholived.equals("The one who lived.")){
                        briefing();

                        Thread.sleep(10000);
                        System.out.println("UPDATE: 1 NEW MESSAGE");
                        System.out.println("1. Open");
                        System.out.println("2. Ignore");
                        int option = scanner.nextInt();
                        scanner.nextLine();
                        if(option == 1){
                            mission();
                            updatedMessage();
                        }
                    }
                    else {
                        System.out.println("SECURITY BREACH. SHUTTING DOWN");
                        System.exit(0);
                    }
                }

            } else {
                System.out.println("INCORRECT. YOU HAVE " + i + " TRIES LEFT.");
            }
        }
        mainMenu(account);
    }

    public static void mainMenu(settings account) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MAIN MENU");
        System.out.println("1. SETTINGS");
        System.out.println("2. SHOWROOM");
        System.out.println("3. ORDER HISTORY");
        System.out.println("4. LOGOUT");

        int response = scanner.nextInt();
        if (response == 1) {
            settingsMenu(account);
        }
        if (response == 2) {
            showroomMenu(account);
        }
        if (response == 3) {
            orderHistory(account);
        }
        if (response == 4) {
            if (account.getUsername().equals("LUCKY")) {
                goodBye();
            } else {
                System.out.println("GOODBYE.");
            }
        }
    }

    public static void orderHistory(settings account) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= orders.size(); i++) {
            System.out.println(i + ". " + orders.get(i - 1).getName() + "\t" + (orders.get(i - 1).getPrice() * orders.get(i - 1).getQuantity()));
        }

        System.out.println("1. RETURN");
        int op = scanner.nextInt();
        scanner.nextLine();

        if (op == 1) {
            mainMenu(account);
        }
    }

    public static void settingsMenu(settings account) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SETTINGS");
        System.out.println("1. CHANGE USERNAME");
        System.out.println("2. CHANGE PASSCODE");
        System.out.println("3. ADD MONEY");
        System.out.println("4. RETURN TO MAIN MENU");

        int response = scanner.nextInt();
        scanner.nextLine();
        if (response == 1) {
            changeUsername(account);
        }
        if (response == 2) {
            changePasscode(account);
        }
        if (response == 3) {
            addMoney(account);
        }
        if (response == 4) {
            mainMenu(account);
        }
    }

    public static void changeUsername(settings account) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 3; i >= 1; i--) {
            System.out.println("ENTER PASSCODE");
            String pass = scanner.nextLine();
            if (pass.equals(account.getPasscode())) {
                System.out.println("ENTER NEW USERNAME");
                String newUsername = scanner.nextLine();
                account.setUsername(newUsername);

                System.out.println("RETURN?");
                System.out.println("1. YES");
                System.out.println("2. NO");
                int response = scanner.nextInt();
                scanner.nextLine();

                if (response == 1) {
                    settingsMenu(account);
                }
            } else {
                System.out.println("YOU HAVE " + i + " TRIES LEFT");
            }
        }
    }

    public static void changePasscode(settings account) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 5; i >= 1; i--) {
            System.out.println("ENTER PASSCODE");
            String pass = scanner.nextLine();
            if (pass.equals(account.getPasscode())) {
                System.out.println("ENTER NEW PASSWORD");
                String newPasscode = scanner.nextLine();
                account.setPasscode((newPasscode));

                System.out.println("RETURN?");
                System.out.println("1. YES");
                System.out.println("2. NO");
                int response = scanner.nextInt();
                if (response == 1) {
                    settingsMenu(account);
                }
            } else {
                System.out.println("YOU HAVE " + i + " TRIES LEFT.");
            }
        }
    }

    public static void addMoney(settings account) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            System.out.println("ENTER PASSCODE");
            String pass = scanner.nextLine();

            if (pass.equals(account.getPasscode())) {
                System.out.println("CURRENT BALANCE: $" + account.getBalance());
                System.out.println("HOW MUCH TO ADD?");
                int addToBalance = scanner.nextInt();
                scanner.nextLine();

                account.setBalance(account.getBalance() + addToBalance);
                System.out.println("NEW BALANCE: $" + account.getBalance());

                System.out.println("RETURN?");
                System.out.println("1. YES");
                System.out.println("2. NO");

                int response = scanner.nextInt();
                if (response == 1) {
                    settingsMenu(account);
                }
                if (response == 2) {
                    addMoney(account);
                }
            } else {
                System.out.println("INVALID. YOU HAVE " + i + " TRIES LEFT.");
            }
        }
    }

    public static void showroomMenu(settings account) {

        Scanner scanner = new Scanner(System.in);

        if (account.getWca().equals("Standard")) {
            System.out.println("1. RIFLES");
            System.out.println("2. SHOTGUNS");
            System.out.println("3. HANDGUNS");
            System.out.println("4. GRENADES");
            System.out.println("5. RETURN TO MAIN MENU");

            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                rifleRoom(account);
            }
            if (option == 2) {
                shotgunRoom(account);
            }
            if (option == 3) {
                handgunRoom(account);
            }
            if (option == 4) {
                grenadeRoom(account);
            }
            if (option == 5) {
                mainMenu(account);
            }
        } else {
            System.out.println("1. RIFLES");
            System.out.println("2. SHOTGUNS");
            System.out.println("3. HANDGUNS");
            System.out.println("4. GRENADES");
            System.out.println("5. SPY GEAR");
            System.out.println("6. MYTHICAL");
            System.out.println("7. RETURN TO MAIN MENU");

            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                rifleRoom(account);
            }
            if (option == 2) {
                shotgunRoom(account);
            }
            if (option == 3) {
                handgunRoom(account);
            }
            if (option == 4) {
                grenadeRoom(account);
            }
            if (option == 5) {
                mainMenu(account);
            }
            if (option == 5) {
                spyRoom(account);
            }
            if (option == 6) {
                mythicalRoom(account);
            }
            if (option == 7) {
                mainMenu(account);
            }
        }
    }

    public static void rifleRoom(settings account) {

        //Rifles
        supplies Muzzleloader = new supplies("Muzzleloader", 800, "The shooter must load this type\n" +
                "of rifle from the front end of its barrel – i.e. the muzzle. For every shot fired the shooter must \n" +
                "insert powder and a ball or bullet down the barrel, as well as insert a new percussion cap to provide \n" +
                "ignition.\n" +
                "\n" +
                "The muzzleloader works on a similar principle to Revolutionary War era rifles. Its slow rate of fire \n" +
                "and relatively complex reloading process make it totally obsolete as far as combat and self-defense are\n" +
                "concerned. Modern muzzleloader rifles are usually favored by hunters who seek a more challenging or \n" +
                "old-fashioned experience.");

        supplies SingleShot = new supplies("Single-Shot Rifle", 600, "A single shot rifle holds a \n" +
                "single round of ammunition, and it holds it right in its chamber. The shooter must manually reload a \n" +
                "single shot rifle after firing every single shot. Its simplistic design means that a single-shot rifle \n" +
                "does not need a very large receiver. It also has very few moving parts that could fail. Common types of\n" +
                " single shot rifles are the bolt-action, break-action, muzzleloader, and lever-action. Less common \n" +
                "types of rifles that are single shot include the rolling block, trapdoor, and drop blocks/falling block.\n" +
                "\n" +
                "Their slow rate of fire (which can be significantly sped up by a skilled shooter) restricts single-shot\n" +
                "rifles to precision shooting and hunting applications, although survival and plinking single-shot \n" +
                "rifles are commonly chambered for 22 LR. A single-shot rifle is also a good choice for teaching a \n" +
                "younger shooter, partly because an unintentional discharge cannot fire multiple rounds of ammo.");

        supplies BoltAction = new supplies("Bolt-Action Rifle", 1300, "This type of rifle has a manual action. By pulling its bolt backward, you eject the spent case. By returning the bolt forward, you chamber a new round. A bolt-action rifle may feed rounds from a magazine or require the shooter to insert each new round into the chamber by hand.\n" +
                "\n" +
                "A bolt-action rifle has a very slow rate of fire compared to more modern rifle designs. But it is highly reliable, and its action’s solid and minimalistic design promotes better accuracy than an automatic or a semi-automatic can typically achieve. As such, bolt-action rifles are favored by precision shooters and hunters. That’s because they want to do the job with a single shot.");

        supplies leveraction = new supplies("Lever-Action Rifle", 1235, "A lever-action rifle’s name is self-explanatory: In order to eject the spent round and chamber the next one, the shooter pulls down and pushes up on a ringed lever positioned next to the trigger. A lever-action rifle stores its cartridges in a tubular magazine that runs parallel to the barrel, and typically requires ammunition loaded with flat nose bullets.\n" +
                "\n" +
                "Lever-action rifles have a slower rate of fire than semi-autos, but like bolt actions they are more reliable. Operating a lever action is a great deal of fun and reminiscent of the cowboy days. While a lever action can be handled effectively during combat, it is far from an optimal choice for self-defense. In fact, the U.S. Army never issued lever-action rifles because shooters cannot operate them while in prone position.");
        supplies autorifle = new supplies("Automatic", 1300, "Often called a machine gun, an automatic rifle is capable of firing for as long as its trigger is pulled (and as long as it has ammo to fire). The M4 carbine issued by the U.S. Army has an automatic firing mode, in addition to semi-automatic and burst firing modes.\n" +
                "\n" +
                "It is not impossible for a civilian to own an automatic rifle in the United States. The manufacturer must have produced the rifle itself prior to May 19th, 1986, and there is a considerable amount of red tape involved in the process. Though, an automatic rifle can be affordable if you avoid one of the more popular models like the M16 or the Uzi.");
        supplies semiautorifle = new supplies("Semi-Automatic Rifle", 1100, "A semi-automatic rifle may be identical to an automatic rifle save for one exception: it will fire exactly one round for every trigger pull. Two of the most common semi-automatic rifles are the Ruger 10-22 which shoots .22LR ammo, and the AR-15 which most commonly shoots .223 ammo. Semi-auto rifles may use different operating systems, the two most common being the direct impingement and gas piston.\n" +
                "\n" +
                "America’s beloved AR-15 is a semi-automatic rifle. A semi-auto rifle offers the same ballistic and terminal performance as an analogous automatic, which is to say rate of fire has no effect on each individual round’s performance. If you’re shopping for a rifle for home defense, a semi-auto is the best way to go.");
        supplies breakaction = new supplies("Break-Action", 230, "Break-action rifles are similar to break-action shotguns. The gun hinges open where the action and barrel meet. This allows the shooter to load rounds and eject spent casings. The Thompson Center Contender and CVA Scout rifle are two popular break-action rifles available today.");
        supplies pumpaction = new supplies("Pump-Action", 1000, "Pump-action rifles function like pump-action shotguns. The shooter moves the rifle’s forend forward and backward in order to eject a spent casing and chamber a new round. Although pump-action rifles date back to the late 1800s, there are manufacturers still producing them today. Two examples of modern pump-action rifles include the Remington 7600 and the Henry Pump Action Octagon.");

        ArrayList<supplies> riflesList = new ArrayList<supplies>();
        riflesList.add(Muzzleloader);
        riflesList.add(SingleShot);
        riflesList.add(BoltAction);
        riflesList.add(leveraction);
        riflesList.add(autorifle);
        riflesList.add(semiautorifle);
        riflesList.add(breakaction);
        riflesList.add(pumpaction);
        showroom rifles = new showroom(riflesList, "RIFLES");

        //ACTUAL CODE

        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECT A NUMBER");
        for (int i = 1; i < riflesList.size(); i++) {
            System.out.println(i + ". " + riflesList.get(i - 1).getName());
        }
        System.out.println((riflesList.size() + 1) + ". RETURN TO SHOWROOM MENU");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option >= 1 && option <= 7) {
            System.out.println(riflesList.get(option - 1));
        } else {
            showroomMenu(account);
        }

        boolean run = true;
        while (run == true) {
            System.out.println("1. BUY\n2. RETURN TO RIFLE SHOWROOM");

            int op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1) {
                System.out.println("ENTER QUANTITY");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                order newOrder = new order(riflesList.get(option - 1).getName(), riflesList.get(option - 1).getPrice(), riflesList.get(option - 1).getDescription(), quantity);

                if ((newOrder.getPrice() * newOrder.getQuantity()) < account.getBalance()) {
                    System.out.println("INVALID REQUEST. CHECK BALANCE");
                } else if ((newOrder.getPrice() * newOrder.getQuantity()) >= account.getBalance()) {
                    System.out.println("ORDER PLACED");
                    main.orders.add(newOrder);
                    account.setBalance
                            ((int) ((account.getBalance()) - (newOrder.getPrice()) * newOrder.getQuantity()));
                }
            }

            if (op == 2) {
                run = false;
                rifleRoom(account);
            }

        }
    }

    public static void shotgunRoom(settings account) {
        //Declaration of all variables:
        supplies pumpActionShot = new supplies("Pump-Action Shotgun", 800, "Pump-action shotguns are\n similar to semi-automatic shotguns, but they require two hands. The user must pump the action manually after every shot. Some pumps are gas-operated, while others utilize spring power.\n");
        supplies leverActionShot = new supplies("Lever-Action Shotgun", 700, "Lever action shotguns \nare usually considered the fastest shooting type of shotgun. The lever-action system cycles through each shell quickly.\n" +
                "\n" +
                "\n" +
                "This type of shotguns is excellent for shooting birds because you can load it with multiple shots before \nbeing released.\n" +
                "\n" +
                "However, the drawback to lever-action shotguns is that the shells tend to fall out of the magazine faster \nthan others because the covers slide down the tube rather than being held in place.");
        supplies boltActionShot = new supplies("Bolt-Action Shotgun", 700, "Bolt action shotguns are \none of the oldest firearms still in production today. Many of these weapons were designed during the Civil War era.\n" +
                "\n" +
                "These guns feature a rotating bolt that moves back and forth inside the barrel chamber. As the bolt rotates, \nit pushes cartridges down the barrel. Once the last cartridge has been made out of the barrel, the bolt locks open and allows the next round to move forward.\n" +
                "\n" +
                "Bolt actions are generally slower to shoot than other types of shotguns. They do not cycle through each shell-like \nsemi-autos or pump action. Instead, the user must pull the trigger once per shell.\n" +
                "\n" +
                "Bolt action shotguns are the most popular among athletes. They are easy to use and maintain.b Also, the bolt action \ndesign makes them more reliable than pump-action firearms.");
        supplies sidebyside = new supplies("Side-by-Side Shotgun", 800, "Side-by-side shotguns are also known as double-barreled shotguns. These guns are designed to allow the user to fire two rounds at once.\n" +
                "\n" +
                "The gun consists of two barrels that lie next to each other. Side-by-side shotguns are also known as \nside-by-side doubles. These guns are similar to over/under, except the barrels are positioned next.\n" +
                "\n" +
                "Side-by-side shotguns are typically smaller versions of double-barreled shotguns. They are often found \nmounted on a tripod stand so that the shooter can position himself correctly.");
        supplies semiAutoShot = new supplies("Semi-Automatic Shotgun", 800, "The most common type \nof a shotgun is the semi-automatic shotgun. These weapons are easy to use and require no special skills or training. Semi-automatic shotguns use the recoil energy stored in the shell casing to reload each shell after being fired.\n" +
                "\n" +
                "The shells are loaded into a magazine that holds up to 12 rounds of ammunition. The action cycles \nthrough all the chambers when the trigger is pulled until the last shell is fired. After the last shell has been fired, the magazine will automatically eject and load another shell.\n" +
                "\n" +
                "The semi-automatic shotgun is very versatile. They are great for both home defense and recreational \nshooting. Most models come equipped with either a pistol grip or a stock, giving the shooter an improved hold on the weapon.");
        supplies singleShotShot = new supplies("Single-Shot Shotgun", 300, "Single-shot shotguns \nare the simplest form of shotgun. There is only one chamber in the barrel. This means that only one bullet can be fired at any given time.\n" +
                "\n" +
                "Unlike double-barrel shotguns, single-shot shotguns do not have any revolving cylinders.\n" +
                "\n" +
                "A single-shot shotgun is ideal for close-range combat. The advantage of this type of firearm is that it \ndoes not jam easily and can be used when there is no time to reload.\n" +
                "\n" +
                "Single-shot shotguns aren’t accurate and are not best for hunting small game like rabbits and squirrels.");
        supplies doubleBarrelShot = new supplies("Double-Barrel Shotgun", 700, "Double barrel \nshotguns are similar to pump actions, except they have two barrels and two separate triggers instead of just one. One trigger fires the left barrel, and the other fires the right barrel. It fires twice as many shots per pull of the trigger.  \n" +
                "\n" +
                "This type of shotgun is best suited for those who want to shoot two shots at once. It allows the user \nto hit two targets simultaneously without switching between the two barrels.\n" +
                "\n" +
                "Double-barrel shotgun has a revolving cylinder that holds all the shells in place until it’s ready to \nshoot. After each pull of the trigger, the shell slides out of the chamber and into the barrel, where it is fired.");
        supplies overunder = new supplies("Over/Under Shotgun", 800, "Over/under shotguns are \ndesigned so that the barrel lies above the receiver. The top barrel is located farther away from the shooter than the bottom.\n" +
                "\n" +
                "Over/under shotguns are designed to allow the shooter to choose whether he wants to shoot over or under \nthe intended target. The shells are placed above or below the barrel’s centerline, depending on the user’s preference.\n" +
                "\n" +
                "It is designed so that the barrel is above the receiver. This allows the shooter to see if the shot is \ngoing high or low without looking down the barrel.");
        ArrayList<supplies> shotgunsList = new ArrayList<supplies>();
        shotgunsList.add(pumpActionShot);
        shotgunsList.add(leverActionShot);
        shotgunsList.add(boltActionShot);
        shotgunsList.add(sidebyside);
        shotgunsList.add(semiAutoShot);
        shotgunsList.add(singleShotShot);
        shotgunsList.add(doubleBarrelShot);
        shotgunsList.add(overunder);
        showroom shotguns = new showroom(shotgunsList, "SHOTGUNS");

        //ACTUAL CODE

        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECT A NUMBER");
        for (int i = 1; i < shotgunsList.size(); i++) {
            System.out.println(i + ". " + shotgunsList.get(i - 1).getName());
        }
        System.out.println((shotgunsList.size() + 1) + ". RETURN TO SHOWROOM MENU");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option >= 1 && option <= 7) {
            System.out.println(shotgunsList.get(option - 1));
        } else {
            showroomMenu(account);
        }

        boolean run = true;
        while (run == true) {
            System.out.println("1. BUY\n2. RETURN TO SHOTGUN SHOWROOM");

            int op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1) {
                System.out.println("ENTER QUANTITY");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                order newOrder = new order(shotgunsList.get(option - 1).getName(), shotgunsList.get(option - 1).getPrice(), shotgunsList.get(option - 1).getDescription(), quantity);

                if (newOrder.getPrice() * newOrder.getQuantity() < account.getBalance()) {
                    System.out.println("ORDER NOT VALID");
                } else {
                    System.out.println("ORDER PLACED");
                    main.orders.add(newOrder);
                    account.setBalance((int) ((account.getBalance()) - (newOrder.getPrice()) * newOrder.getQuantity()));
                }
            }

            if (op == 2) {
                run = false;
                shotgunRoom(account);
            }

        }
    }

    public static void handgunRoom(settings account) {
        //HANDGUNS
        supplies glock19 = new supplies("Glock-19", 650, "The Glock 19 is a popular semi-automatic handgun known for its reliability and ease of use. It has a polymer frame and a 9mm caliber.");
        supplies mandP = new supplies("M&P", 500, "The M&P (Military and Police) is a semi-automatic handgun produced by Smith & Wesson. It is available in several calibers and has a polymer frame.");
        supplies sr9 = new supplies("Ruger SR9", 550, "The Ruger SR9 is a semi-automatic handgun with a stainless steel slide and a polymer frame. It is chambered in 9mm and is known for its accuracy and durability.");
        supplies p226 = new supplies("P226", 950, "The P226 is a semi-automatic handgun produced by SIG Sauer. It is widely used by military and law enforcement agencies around the world and is available in several calibers.");
        supplies xd = new supplies("XD", 450, "The XD is a semi-automatic handgun produced by Springfield Armory. It has a polymer frame and is available in several calibers. It is known for its reliability and ease of use. ");
        ArrayList<supplies> handgunsList = new ArrayList<supplies>();
        handgunsList.add(glock19);
        handgunsList.add(mandP);
        handgunsList.add(sr9);
        handgunsList.add(p226);
        handgunsList.add(xd);
        showroom handguns = new showroom(handgunsList, "HANDGUNS");
        //ACTUAL CODE

        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECT A NUMBER");
        for (int i = 1; i < handgunsList.size(); i++) {
            System.out.println(i + ". " + handgunsList.get(i - 1).getName());
        }
        System.out.println((handgunsList.size() + 1) + ". RETURN TO SHOWROOM MENU");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option >= 1 && option <= 7) {
            System.out.println(handgunsList.get(option - 1));
        } else {
            showroomMenu(account);
        }

        boolean run = true;
        while (run == true) {
            System.out.println("1. BUY\n2. RETURN TO HANDGUNS SHOWROOM");

            int op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1) {
                System.out.println("ENTER QUANTITY");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                order newOrder = new order(handgunsList.get(option - 1).getName(), handgunsList.get(option - 1).getPrice(), handgunsList.get(option - 1).getDescription(), quantity);

                if (newOrder.getPrice() * newOrder.getQuantity() < account.getBalance()) {
                    System.out.println("ORDER NOT VALID");
                } else {
                    System.out.println("ORDER PLACED");
                    main.orders.add(newOrder);
                    account.setBalance((int) ((account.getBalance()) - (newOrder.getPrice()) * newOrder.getQuantity()));
                }
            }

            if (op == 2) {
                run = false;
                handgunRoom(account);
            }
        }
    }

    public static void grenadeRoom(settings account) {
        supplies smoke = new supplies("Smoke Grenade", 200, "Releases smoke, clouding enemy vision\n");
        supplies frag = new supplies("Frag Grenade", 500, "Detonates and shoots high-velocity projectiles");
        supplies flash = new supplies("Flashbang", 250, "Blinds the enemy");
        supplies chem = new supplies("Chemical Grenade", 1000, "releases harmful chemicals that can kill the enemy");
        ArrayList<supplies> grenadeList = new ArrayList<supplies>();
        grenadeList.add(smoke);
        grenadeList.add(frag);
        grenadeList.add(flash);
        grenadeList.add(chem);
        showroom grenades = new showroom(grenadeList, "GRENADES");

        //END OF DECLARING ALL SUPPLIES

        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECT A NUMBER");
        for (int i = 1; i < grenadeList.size(); i++) {
            System.out.println(i + ". " + grenadeList.get(i - 1).getName());
        }
        System.out.println((grenadeList.size() + 1) + ". RETURN TO SHOWROOM MENU");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option >= 1 && option <= 7) {
            System.out.println(grenadeList.get(option - 1));
        } else {
            showroomMenu(account);
        }

        boolean run = true;
        while (run == true) {
            System.out.println("1. BUY\n2. RETURN TO GRENADE SHOWROOM");

            int op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1) {
                System.out.println("ENTER QUANTITY");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                order newOrder = new order(grenadeList.get(option - 1).getName(), grenadeList.get(option - 1).getPrice(), grenadeList.get(option - 1).getDescription(), quantity);
                if (newOrder.getPrice() * newOrder.getQuantity() < account.getBalance()) {
                    System.out.println("ORDER NOT VALID");
                } else {
                    System.out.println("ORDER PLACED");
                    main.orders.add(newOrder);
                    account.setBalance((int) ((account.getBalance()) - (newOrder.getPrice()) * newOrder.getQuantity()));
                }
            }

            if (op == 2) {
                run = false;
                grenadeRoom(account);
            }

        }
    }

    public static void spyRoom(settings account) {
        supplies goldfinger = new supplies("Goldfinger", 1000000, "In the film \"Goldfinger,\" James Bond's watch serves as a communication device, a laser cutter, and a detonator.");
        supplies shoes = new supplies("Ethan Hunt's Shoes", 10000000, "In the film \"Mission: Impossible - Ghost Protocol,\" Ethan Hunt's shoes are equipped with magnets that allow him to walk on the outside of buildings.");
        supplies multitool = new supplies("Jason Bourne's Multitool", 99999, "In the film \"The Bourne Identity,\" Jason Bourne's multi-tool serves as a lock pick, a glass cutter, and a handcuff key.");
        supplies hook = new supplies("BRUCE WAYNE'S GRAPPLING HOOK", 9999, "In the film \"The Dark Knight,\" Bruce Wayne's grappling hook is used as a means of transportation and as a weapon.");
        ArrayList<supplies> spyList = new ArrayList<supplies>();
        spyList.add(goldfinger);
        spyList.add(shoes);
        spyList.add(hook);
        spyList.add(multitool);
        showroom spygear = new showroom(spyList, "SPY GEAR");

        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECT A NUMBER");
        for (int i = 1; i < spyList.size(); i++) {
            System.out.println(i + ". " + spyList.get(i - 1).getName());
        }
        System.out.println((spyList.size() + 1) + ". RETURN TO SHOWROOM MENU");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option >= 1 && option <= 7) {
            System.out.println(spyList.get(option - 1));
        } else {
            showroomMenu(account);
        }

        boolean run = true;
        while (run == true) {
            System.out.println("1. BUY\n2. RETURN TO SPY GEAR SHOWROOM");

            int op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1) {
                System.out.println("ENTER QUANTITY");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                order newOrder = new order(spyList.get(option - 1).getName(), spyList.get(option - 1).getPrice(), spyList.get(option - 1).getDescription(), quantity);
                if (newOrder.getPrice() * newOrder.getQuantity() < account.getBalance()) {
                    System.out.println("ORDER NOT VALID");
                } else {
                    System.out.println("ORDER PLACED");
                    main.orders.add(newOrder);
                    account.setBalance((int) ((account.getBalance()) - (newOrder.getPrice()) * newOrder.getQuantity()));
                }
            }

            if (op == 2) {
                run = false;
                spyRoom(account);
            }
        }
    }

    public static void mythicalRoom(settings account) {
        supplies hammer = new supplies("Mjolnir", 1000000000, "Mjolnir is a mythical hammer wielded by Thor, the Norse god of thunder. In the MCU, it is depicted as a powerful weapon that can only be wielded by those deemed worthy.");
        supplies axe = new supplies("Stormbreaker", 1000000000, "Stormbreaker is another mythical weapon wielded by Thor in the MCU. It is an axe that can summon the Bifrost, a bridge that connects the nine realms.");
        supplies shield = new supplies("Captain America's Shield", 1000000000, "Captain America's shield is a fictional weapon wielded by Steve Rogers in the MCU. It is made of Vibranium, a rare and indestructible metal, and is used as a defensive and offensive weapon.");
        supplies glove = new supplies("Infinity Gauntlet", 1000000000, "The Infinity Gauntlet is a fictional weapon that appears in the MCU. It is a gauntlet that houses six Infinity Stones, which give the wielder immense power and control over the universe.");
        supplies sword = new supplies("Excalibur", 1000000000, "Excalibur is a mythical sword that appears in Arthurian legend. It is said to be the most powerful weapon in the world and is wielded by King Arthur.");
        ArrayList<supplies> mythicalList = new ArrayList<supplies>();
        mythicalList.add(hammer);
        mythicalList.add(axe);
        mythicalList.add(shield);
        mythicalList.add(glove);
        mythicalList.add(sword);
        showroom mythical = new showroom(mythicalList, "MYTHICAL GEAR");

        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECT A NUMBER");
        for (int i = 1; i < mythicalList.size(); i++) {
            System.out.println(i + ". " + mythicalList.get(i - 1).getName());
        }
        System.out.println((mythicalList.size() + 1) + ". RETURN TO SHOWROOM MENU");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option >= 1 && option <= 7) {
            System.out.println(mythicalList.get(option - 1));
        } else {
            showroomMenu(account);
        }

        boolean run = true;
        while (run == true) {
            System.out.println("1. BUY\n2. RETURN TO MYTHICAL SHOWROOM");

            int op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1) {
                System.out.println("ENTER QUANTITY");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                order newOrder = new order(mythicalList.get(option - 1).getName(), mythicalList.get(option - 1).getPrice(), mythicalList.get(option - 1).getDescription(), quantity);
                if (newOrder.getPrice() * newOrder.getQuantity() < account.getBalance()) {
                    System.out.println("ORDER NOT VALID");
                } else {
                    System.out.println("ORDER PLACED");
                    main.orders.add(newOrder);
                    account.setBalance((int) ((account.getBalance()) - (newOrder.getPrice()) * newOrder.getQuantity()));
                }
            }

            if (op == 2) {
                run = false;
                mythicalRoom(account);
            }

        }
    }
    public static void entranceMessage() {
        System.out.println(",,,,,,*,****#@&#(/((%&#&###%%(/**///////%%#**,,,,,,,,,,,,,,,,,,,............................                                                          \n" +
                ",,,***(&%(###&@@@&&%%&%%&&&%%&%%&&%%(#&#/(&@@@@&(/*/#*,,,,,,,,,,,,,.......................... .  .                                                    \n" +
                "#%&&&&&&&@&@&@&&&&@@@@@@@@@@@@@@@@@@@@@@@&&#&###%@@@#/*/,,,,,,,,,,,,,..................... .........                                                  \n" +
                "@&&%&&&&@@&@@@@&#&%%%&&&&&%%%%&&&&&&&&@@@@@@@&&%%#((%&@&**,,,,,,,,,,,..................................                                               \n" +
                "@@@&%%&&@%%(#&%%%&#((((&@@@@@@@@@@@@@@%#&@&&&@@@@&%#%/(&%&%*,,,,,,,,....................................                                              \n" +
                "#%%&@@@&&&@%%%///%&&@%##*,..,.......,,,(/@@&#&&%&@@@&%%%(#&&&/#,,,,.......................................    .                                       \n" +
                "//(&(#%&@@%(/(%&((%*,,.....................,(%@#%&%&@@@%#&//&@&/*,,,.........................................  .                                      \n" +
                "/#%#%&@&#%&&@#%%*,.....,#,...........,//......./#@#%&%&@@%%&//&%/&,,,,.......................................                                         \n" +
                "#&%&&&##&%@(@(,,...**.....................,(.....*#&#%&&@@@%%#/(&(%*,,........................................                                        \n" +
                "&@&&%#%&%(&#,,.,(@,...........................%,.../&%#&%&@@%%%//@%%*,.................................. .......                                      \n" +
                "@@@@@@@&%@(**/%/...............................,%...,(%%&%&@@%%%//@%&*,............................. .......... ..                                    \n" +
                "&&@@@@@@@@@#*#,..................................#...*#/#&&&&&&%%*(@@&,,,.............................. . ........  .                                 \n" +
                "*(&@@@@@@@@@&#(/*,................................#...,//#%%&&&&#%/&*@%,........................... ..... ..... ......                                \n" +
                "*(%%%%@///#&%&&@&%%##*.............................,...,//&%&&@&##/##&#,,,................................... ...  .                                  \n" +
                "*/%%/(%....*,,*/&#%@@@&%%(,........................,...(//%%&&@&@&(#(@#,,,............................... ........  ..                                \n" +
                "(#%%/*&,.../......,*(&#&&&&%#&/,.................,,....&&(%&&&@&%&###&%*,,,.......................................  .                                 \n" +
                "(%%&(%@,....,..........,*%&%&&@@%&&**,............(...,%%%@@@@@@&%%%%#%#(,,,...................................... .                                  \n" +
                "/%%&#/&#....................,/&&&@@@@@@&/*,,,...,#...*&#&%@@@%@@&#(%@%((#//,,,.....................................                                   \n" +
                "/(%%%%/((...../.,...............,*/&@@@@@@@@&//*/,,,*&(%%@@&%%%&#(/*/%&#(/*#*,,.....................................                                  \n" +
                "//%%&#%/#@,....,*....................,*#&@@@@@@@&%(@@&%%&@&##%(//%//**,%&&#/##*,,,...............................                                     \n" +
                ",/(%%&#%//(#......#.....................,,*%%@@@@@@@@@@@@%#%&/*****,,**,,/#&%%#(#&*,,,.........................     .                                 \n" +
                "/*//%%&(#%**&#&,......(,...............#,..,,*#@@@@@@@@@@@@@%//**,,,,,/%(**/#%&&(&///#,,................ ...                                          \n" +
                ",(,(/%%&%(%%//#&(&%,,,,..,.,,.,,........,,#@@@%(&@%%%%&@@@@@@@&&#(//***,,,,,,,,/%#&##//*/,,...............    .                                       \n" +
                ",,,,///%#%&((%%//*#@@%&&%(////*//(#%@@&%%@#/###%(((/***/(#%%&&&&@&%%%((//*******,,,%#@%##/*(,........... .                                            \n" +
                "...,,,///%%#%&#(%%%#////(%&@@@@@@@&#////#%%%%(//%***,,,,,,,**//(((#%&&&%%%(/**,,,,,,/*/(@#(#/*&,..... . ..                                            \n" +
                ".....,#,*/*/%%%#&&%###%@@@@&&&&&#((#%%#((%//#%****,,,,..........,,,,%#///###(%##*,,,,,,,**#@%#%*//.....                                               \n" +
                ".......,/,,*////#&&%%%%%%%%%%%###(%%#///((*****,,,,.......................,,/*(%%%*#&%%%%**,/@@((#/,,...                                              \n" +
                "..........,,/,,*(////////////***//(((/**,,,,,,,,,...................... ........,*(&&&&##(#//#%@#&*,*,...                                             \n" +
                ".............,,,,,,#&&(/**,*((**,,,,,,,,,,........................   .    .   .......,,*%@@@%//(//%@#.,* ..                                           \n" +
                ".............,,,,,,,,,,,,,,,,,,,,,,.............................                    ......*((*/#%%#&@&/*,,.                                           \n" +
                "..............,,,,,,,,,................................... ..                       .        ...**,*,......,  ..                                      \n" +
                "...............,,,,.........................................                                  ..       .,,*(.  .                                      \n" +
                " ...............,,.................................                                           .                   .                                   \n" +
                ". ........................................ ..                                                                     ..                                  \n" +
                "   ....................................                                                                                                               \n" +
                "      ...............................                                                                                                                 \n" +
                "       . .......................                                                                                                                      \n" +
                "         ................ .  .                                                                                                                        \n" +
                "           .................                                                                                                                          \n" +
                "              ...........                                                                                                                             \n" +
                "                  ... .   ");
        System.out.println("W E L C O M E   T O   V O R T E X   T E C H N O L O G I E S ");
    }
    public static void goodBye() {
        System.out.println("" +
                ",,,,,,*,****#@&#(/((%&#&###%%(/**///////%%#**,,,,,,,,,,,,,,,,,,,............................                                                          \n" +
                ",,,***(&%(###&@@@&&%%&%%&&&%%&%%&&%%(#&#/(&@@@@&(/*/#*,,,,,,,,,,,,,.......................... .  .                                                    \n" +
                "#%&&&&&&&@&@&@&&&&@@@@@@@@@@@@@@@@@@@@@@@&&#&###%@@@#/*/,,,,,,,,,,,,,..................... .........                                                  \n" +
                "@&&%&&&&@@&@@@@&#&%%%&&&&&%%%%&&&&&&&&@@@@@@@&&%%#((%&@&**,,,,,,,,,,,..................................                                               \n" +
                "@@@&%%&&@%%(#&%%%&#((((&@@@@@@@@@@@@@@%#&@&&&@@@@&%#%/(&%&%*,,,,,,,,....................................                                              \n" +
                "#%%&@@@&&&@%%%///%&&@%##*,..,.......,,,(/@@&#&&%&@@@&%%%(#&&&/#,,,,.......................................    .                                       \n" +
                "//(&(#%&@@%(/(%&((%*,,.....................,(%@#%&%&@@@%#&//&@&/*,,,.........................................  .                                      \n" +
                "/#%#%&@&#%&&@#%%*,.....,#,...........,//......./#@#%&%&@@%%&//&%/&,,,,.......................................                                         \n" +
                "#&%&&&##&%@(@(,,...**.....................,(.....*#&#%&&@@@%%#/(&(%*,,........................................                                        \n" +
                "&@&&%#%&%(&#,,.,(@,...........................%,.../&%#&%&@@%%%//@%%*,.................................. .......                                      \n" +
                "@@@@@@@&%@(**/%/...............................,%...,(%%&%&@@%%%//@%&*,............................. .......... ..                                    \n" +
                "&&@@@@@@@@@#*#,..................................#...*#/#&&&&&&%%*(@@&,,,.............................. . ........  .                                 \n" +
                "*(&@@@@@@@@@&#(/*,................................#...,//#%%&&&&#%/&*@%,........................... ..... ..... ......                                \n" +
                "*(%%%%@///#&%&&@&%%##*.............................,...,//&%&&@&##/##&#,,,................................... ...  .                                  \n" +
                "*/%%/(%....*,,*/&#%@@@&%%(,........................,...(//%%&&@&@&(#(@#,,,............................... ........  ..                                \n" +
                "(#%%/*&,.../......,*(&#&&&&%#&/,.................,,....&&(%&&&@&%&###&%*,,,.......................................  .                                 \n" +
                "(%%&(%@,....,..........,*%&%&&@@%&&**,............(...,%%%@@@@@@&%%%%#%#(,,,...................................... .                                  \n" +
                "/%%&#/&#....................,/&&&@@@@@@&/*,,,...,#...*&#&%@@@%@@&#(%@%((#//,,,.....................................                                   \n" +
                "/(%%%%/((...../.,...............,*/&@@@@@@@@&//*/,,,*&(%%@@&%%%&#(/*/%&#(/*#*,,.....................................                                  \n" +
                "//%%&#%/#@,....,*....................,*#&@@@@@@@&%(@@&%%&@&##%(//%//**,%&&#/##*,,,...............................                                     \n" +
                ",/(%%&#%//(#......#.....................,,*%%@@@@@@@@@@@@%#%&/*****,,**,,/#&%%#(#&*,,,.........................     .                                 \n" +
                "/*//%%&(#%**&#&,......(,...............#,..,,*#@@@@@@@@@@@@@%//**,,,,,/%(**/#%&&(&///#,,................ ...                                          \n" +
                ",(,(/%%&%(%%//#&(&%,,,,..,.,,.,,........,,#@@@%(&@%%%%&@@@@@@@&&#(//***,,,,,,,,/%#&##//*/,,...............    .                                       \n" +
                ",,,,///%#%&((%%//*#@@%&&%(////*//(#%@@&%%@#/###%(((/***/(#%%&&&&@&%%%((//*******,,,%#@%##/*(,........... .                                            \n" +
                "...,,,///%%#%&#(%%%#////(%&@@@@@@@&#////#%%%%(//%***,,,,,,,**//(((#%&&&%%%(/**,,,,,,/*/(@#(#/*&,..... . ..                                            \n" +
                ".....,#,*/*/%%%#&&%###%@@@@&&&&&#((#%%#((%//#%****,,,,..........,,,,%#///###(%##*,,,,,,,**#@%#%*//.....                                               \n" +
                ".......,/,,*////#&&%%%%%%%%%%%###(%%#///((*****,,,,.......................,,/*(%%%*#&%%%%**,/@@((#/,,...                                              \n" +
                "..........,,/,,*(////////////***//(((/**,,,,,,,,,...................... ........,*(&&&&##(#//#%@#&*,*,...                                             \n" +
                ".............,,,,,,#&&(/**,*((**,,,,,,,,,,........................   .    .   .......,,*%@@@%//(//%@#.,* ..                                           \n" +
                ".............,,,,,,,,,,,,,,,,,,,,,,.............................                    ......*((*/#%%#&@&/*,,.                                           \n" +
                "..............,,,,,,,,,................................... ..                       .        ...**,*,......,  ..                                      \n" +
                "...............,,,,.........................................                                  ..       .,,*(.  .                                      \n" +
                " .........  ");
        System.out.println("Half a league, half a league,\n" +
                "Half a league onward,\n" +
                "All in the valley of Death\n" +
                "   Rode the six hundred.\n" +
                "“Forward, the Light Brigade!\n" +
                "Charge for the guns!” he said.\n" +
                "Into the valley of Death\n" +
                "   RODE THE SIX HUNDRED.");
        System.out.println();
        System.out.println("GOODBYE");

    }
    public static void secret(settings account) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        String tennyson = ("Half a league, half a league,\n" +
                "Half a league onward,\n" +
                "All in the valley of Death\n" +
                "   Rode the six hundred.\n" +
                "“Forward, the Light Brigade!\n" +
                "Charge for the guns!” he said.\n" +
                "Into the valley of Death\n");

        for (int i = 0; i < tennyson.length(); i++) {
            System.out.print(tennyson.substring(i, i + 1));
            Thread.sleep(50);
        }

        String answer = scanner.nextLine();

        if (answer.equals("Rode the six hundred.")) {
            System.out.println("WELCOME BACK LUCKY. WE'VE MISSED YOU...");
            mainMenu(account);
        } else {
            System.out.println("LUCKY WAS NOT FOUND.");

            System.exit(0);
        }

    }
    public static void Logsmenu(settings account) throws InterruptedException {
        System.out.println("MISSION LOGS:\n" +
                "1. LUCKY\n" +
                "2. DO (REDACTED)\n" +
                "3. TI (REDACTED)\n" +
                "4. MISSION BRIEFING");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();
        if(option == 1){
            luckysLogs(account);
        }
        else if (option == 2 || option == 3){
            System.out.println("INVALID.");
            Logsmenu(account);
        }
    }
    public static void luckysLogs(settings account) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("LUCKY'S LOGS:");
        System.out.println("1. ON ROUTE");
        System.out.println("2. ORBITING");
        System.out.println("3. LANDED");
        System.out.println("4. ROUTINE CHECK 1");
        System.out.println("5. ROUTINE CHECK 2");
        System.out.println("6. REDACTED");
        System.out.println("7. SOMETHING ODD...");
        System.out.println("8. UNUSUAL TRACES");
        System.out.println("9. THE SIGN");
        System.out.println("10. IT CAME CLOSER");
        System.out.println("11. ---------------");
        System.out.println("12. RETURN");
        System.out.println("END OF LOGS.");


        int option = scanner.nextInt();
        scanner.nextLine();

        if(option == 1){
           String message = ("6-20-50\nAll systems activated. Trajectory stable. Everyone is safe. Will hibernate.");

           for(int i = 0; i<message.length(); i++){
               System.out.print(message.substring(i,i+1));
               Thread.sleep(25);
           }

            System.out.println("RETURN? Y/N");
            String returnBack = scanner.nextLine();
            if(returnBack.equals("y") || returnBack.equals("Y")){
                luckysLogs(account);
            }
        }
        if(option == 2){
            String message = ("4-3-122\nPathing successful, on approach to orbit.\nOrbiting planet, ETA to contact: 3 hours");
            for(int i = 0; i<message.length(); i++){
                System.out.print(message.substring(i,i+1));
                Thread.sleep(25);
            }

            System.out.println("RETURN? Y/N");
            String returnBack = scanner.nextLine();
            if(returnBack.equals("y") || returnBack.equals("Y")){
                luckysLogs(account);
            }
        }
        if(option == 3){
            String message = "4-4-122\nLANDING SUCCESSFUL\nExploring surface and proceeding with caution";
            for(int i = 0; i<message.length(); i++){
                System.out.print(message.substring(i,i+1));
                Thread.sleep(25);
            }

            System.out.println("RETURN? Y/N");
            String returnBack = scanner.nextLine();
            if(returnBack.equals("y") || returnBack.equals("Y")){
                luckysLogs(account);
            }
        }
        if(option == 4){
            String message = "5-4-122\nROUTINE CHECKUP: Mission going well.\nAll life support systems at full capacity.\n" +
                    "Extraction and research yielding promising results.\nI MISS HOME.";
            for(int i = 0; i<message.length(); i++){
                System.out.print(message.substring(i,i+1));
                Thread.sleep(25);
            }

            System.out.println("RETURN? Y/N");
            String returnBack = scanner.nextLine();
            if(returnBack.equals("y") || returnBack.equals("Y")){
                luckysLogs(account);
            }
        }
        if(option == 5){
            String message = "6-4-122\n" +
                    "NO NEW UPDATES. MISSION PROCEEDING AS PLANNED.";
            for(int i = 0; i<message.length(); i++){
                System.out.print(message.substring(i,i+1));
                Thread.sleep(25);
            }

            System.out.println("RETURN? Y/N");
            String returnBack = scanner.nextLine();
            if(returnBack.equals("y") || returnBack.equals("Y")){
                luckysLogs(account);
            }
        }
        if(option == 6){
            String message = "REDACTED.";
            for(int i = 0; i<message.length(); i++){
                System.out.print(message.substring(i,i+1));
                Thread.sleep(25);
            }

            System.out.println("RETURN? Y/N");
            String returnBack = scanner.nextLine();
            if(returnBack.equals("y") || returnBack.equals("Y")){
                luckysLogs(account);
            }
        }
        if(option == 7){
            String message = "7-8-122\n" +
                    "Personal log #1: I've been noticing something odd.\n" +
                    "At certain times, the others will freeze up like a deer in headlights.\n" +
                    "I tell them to snap out of it, but it takes a few tries.\n" +
                    "I try to see what they are seeing, but once I stand next to them they break out.\n" +
                    "This is really weird...";
            for(int i = 0; i<message.length(); i++){
                System.out.print(message.substring(i,i+1));
                Thread.sleep(25);
            }

            System.out.println("RETURN? Y/N");
            String returnBack = scanner.nextLine();
            if(returnBack.equals("y") || returnBack.equals("Y")){
                luckysLogs(account);
            }
        }
        if(option == 8){
            String message = "?-?-?\n" +
                    "UNUSUAL TRACKS FOUND. NOTHING LIKE FOOTPRINTS\n" +
                    "NOTHING LIKE CLAWS.\n"+
                    "NOTHING LIKE HOOVES EITHER\n"+
                    "APPEARS TO BE MOVING TOWARDS EAST.";
            for(int i = 0; i<message.length(); i++){
                System.out.print(message.substring(i,i+1));
                Thread.sleep(25);
            }

            System.out.println("RETURN? Y/N");
            String returnBack = scanner.nextLine();
            if(returnBack.equals("y") || returnBack.equals("Y")){
                luckysLogs(account);
            }
        }
        if(option == 9){
            String message = "?-?-?\n" +
                    "SENT THE DRONE TO EXPLORE.\n" +
                    "FOUND A SIGN. THIS IS WHAT IS WRITTEN:\n" +
                    "\"⏚⟒⍙⏃⍀⟒ ⏁⊑⟒ ⟟⋏⎐⏃⎅⟒⍀⌇ ⍙⊑⍜ ☊⍜⋔⟒ ⟟⋏ ⏁⊑⟒ ⌇⊑⏃⎅⍜⍙⌇.\"\n" +
                    "CAMERA IMMEDIATELY BLACKED OUT.";
            for(int i = 0; i<message.length(); i++){
                System.out.print(message.substring(i,i+1));
                Thread.sleep(25);
            }

            System.out.println("RETURN? Y/N");
            String returnBack = scanner.nextLine();
            if(returnBack.equals("y") || returnBack.equals("Y")){
                luckysLogs(account);
            }

        }
        if(option == 10){
            String message = "IT CAME CLOSER.\n" +
                    "IT WAS 5 CLICKS AWAY LAST TIME.\n" +
                    "NOW ITS 1." +
                    "\nIT'S BEEN HOURS SINCE THE TEAM WAS AT BASE.";
            for(int i = 0; i<message.length(); i++){
                System.out.print(message.substring(i,i+1));
                Thread.sleep(25);
            }

            System.out.println("RETURN? Y/N");
            String returnBack = scanner.nextLine();
            if(returnBack.equals("y") || returnBack.equals("Y")){
                luckysLogs(account);
            }

        }
        if(option == 11){
            String message = "\"⏚⟒⍙⏃⍀⟒ ⏁⊑⟒ ⟟⋏⎐⏃⎅⟒⍀⌇ ⍙⊑⍜ ☊⍜⋔⟒ ⟟⋏ ⏁⊑⟒ ⌇⊑⏃⎅⍜⍙⌇.\"\n" +
                    "⏁⊑⟒⊬ ⏁⊑⏃⏁ ☊⍜⋏⌇⟟⎅⟒⍀ ⏁⊑⟒⋔⌇⟒⌰⎐⟒⌇ ⏁⊑⟒ ⌇☍⊬ ⌿⟒⍜⌿⌰⟒ ⊑⏃⎐⟒ ☊⍜⋔⟒ ⏁⍜ ⏁⟒⍀⍀⍜⍀⟟⋉⟒ ⎍⌇.\n" +
                    " \n" +
                    "⊑⏃⎐⟒ ⎎⎍⋏.";
            for(int i = 0; i<message.length(); i++){
                System.out.print(message.substring(i,i+1));
                Thread.sleep(25);
            }

            System.out.println("D O O G B Y E\n" +
                    "O G D O B Y E\n" +
                    "O D O G B Y E\n" +
                    "G D O O B Y E\n" +
                    "D O G O B Y E\n" +
                    "G O O D B Y E\n" +
                    "B Y E D O O G\n" +
                    "O B Y E D O G\n" +
                    "O G B Y E D O\n" +
                    "Y E D O O G B");
            System.exit(0);

        }
        if(option == 12){
            Logsmenu(account);
        }


    }

    public static void mission(){

        System.out.println("\n\nIn order to find an alternative solution to killing off the population, we (who shall not be named for our security) took\n" +
                "matters into our own hands. For years, we have observed a planet in a distant system, along the path of\n" +
                "Comet Hale-Bopp. We plan to secretly launch a rocket in a secluded location to avoid any radio trackers from jamming\n" +
                "and shooting us down, latch on to the comet, hibernate, and explore the planet. Lucky, Do, and Ti are the astronauts\n" +
                "responsible for undertaking this extensive mission. Hopefully, if all goes well, we will see them soon.");
    }
    public static void briefing(){

        System.out.println("PROJECT 880");
        System.out.println("In a world where the Malthusian theory had come to pass, the population had grown beyond the\n capacity of the planet to sustain it. Food production struggled to keep up with the demands of the ever-growing population, and as a result, widespread famine and poverty were the norm.\n" +
                "\n" +
                "The government, desperate to find a solution to the crisis, implemented strict population control \nmeasures. Birthrates were heavily regulated, and families were only allowed to have a certain number of children. Those who broke the rules were punished severely.\n" +
                "\n" +
                "Despite these efforts, the population continued to grow, and the resources of the planet were stretched\n to their limits. The government was forced to make even more drastic measures, including forced sterilizations and euthanasia for the elderly and disabled.\n" +
                "\n" +
                "As the situation worsened, social unrest and violence broke out. People fought over scraps of food and \nclean water, and the streets became dangerous as desperate individuals turned to crime to survive.\n" +
                "\n" +
                "The government, unable to bring the situation under control, retreated into fortified compounds, \nleaving the rest of the population to fend for themselves. The once-great cities became desolate wastelands, ruled by gangs and marauders.\n" +
                "\n" +
                "The Malthusian apocalypse had arrived, and there seemed to be no way out.");

        System.out.println(
                "Project 880 is a government supported project, to exterminate the weak population of the planet. \n" +
                "Students who fail to excel according to national standards will be executed along with their direct family.\n" +
                "The Population Law was put in place. Shadow children, children who are the 3rd and onward offspring will be taken away and killed.\n"+
                "Doctors are ordered to serve only a selected amount of patients. In some areas of the world, doctors are ordered to administer\n" +
                        "vaccines which half of them contain a toxic chemical, designed to kill patients in a mere 3 hours.\n");

        System.out.println("" +
                "The weapons and munition industry is a multi-trillion dollar industry. Governments all over the world hire assassins and buy lethal\n" +
                "weapons for the sole purpose of attacking and to killing the population. In order to disguise these weapons, many weapons companies have\n" +
                "created special apps that can be played at arcades or on everyday smartphones. At first glance, these apps look like simple games, but once you enter a \n" +
                "special code, you have access to some of the world's most lethal weaposns at your fingertips.");

    }

    public static void updatedMessage() throws InterruptedException {
        System.out.println("NEW MESSAGE FROM LUCKY\n");


        String firstpart = "THIS IS MY LAST MESSAGE.";


        String secondpart =
                "WE ARE NOW A PART OF THE AWAY TEAM.\n" +
                        "WE ARE NOW PART OF THE NEXT LEVEL.\n" +
                        "WE ARE THE SECOND COMING.\n" +
                        "FOLLOW APPLE AND NETTLES.\n" +
                        "THEY ARE THE ONES WHO BROUGHT US HERE.\n" +
                        "THEY WILL SAVE HUMANITY.";

        for (int i = 0; i < firstpart.length(); i++) {
            System.out.print(firstpart.substring(i, i + 1));
            Thread.sleep(25);
        }
        Thread.sleep(2500);
        System.out.println();
        for (int i = 0; i < secondpart.length(); i++) {
            System.out.print(secondpart.substring(i, i + 1));
            Thread.sleep(25);
        }

        Thread.sleep(5000);

        System.out.println("                                                  \n" +
                "                                                  \n" +
                "                     .%(*,,***/(#%(               \n" +
                "                  .#,.....,,*//(#%&&&%            \n" +
                "                 %*.  ...,,**/(#%&@@@@@           \n" +
                "                (*.. ......,**/(%&&@@@@/          \n" +
                "                %,.. .......,**/#%&&@@@(          \n" +
                "                #,.........,**/((#&#%%&&          \n" +
                "                 (,. .....,/**(*,,#/&#%/          \n" +
                "                  (,........*/#&&&/*(&@           \n" +
                "                    /,......,/(((//(%&.           \n" +
                "                     ,/..,,,*/((//(%&*            \n" +
                "                     .(..,**/##(((#&(             \n" +
                "                     /*,,*/(#%&@@                 \n" +
                "                  /*,,,,*/(#%&&@@&@(.             \n" +
                "              ,/,,,**//(##%%%&&&&&&&&&&.          \n" +
                "           ./,.,*/((#%%%%&&&&&&&&&&&@@&&@         \n" +
                "          /,.,*/(#%%%%&&&&&@@@@&&&&@@@@&&@.       \n" +
                "         (, .,*(#%%##%%%&&&@@@@@@@@@@@@@%&@.      \n" +
                "        ./. .,*(#%%((((#%&&&@@@@@@@@@@@&%%&&      \n" +
                "        ,/. ..,/(#%#*//(#%%&&@@@@@@@@@@&%#&@/     \n" +
                "        ./. ..,*/#%&/*/((#%&&&@@@@@@@@@@%(%&@.    ");

        System.exit(0);
    }
}
