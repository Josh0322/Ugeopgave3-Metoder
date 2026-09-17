public class Ugeopgave3Metoder {

    // Opgave 1
    /*
    double balance;
    String accountName;

    void deposit100() {
        balance += 100;
    }

    void withdraw50() {
        balance -= 50;
    }

    void printBalance() {
        System.out.println(accountName + " har " + balance + " kr på kontoen.");
    }

     void main() {
        accountName = "Josh";
        deposit100();
        deposit100();
        withdraw50();
        printBalance();
    }
     */


    // Opgave 2
    /*
    int assignmentPoints;
    int examPoints;
    int projectPoints;

    void addAssignmentPoints (int points) {
        assignmentPoints += points;
    }

    void addExamPoints (int points) {
        examPoints += points;
    }

    void addProjectPoints (int points) {
        projectPoints += points;
    }

    void printTotal() {
       int total = assignmentPoints + examPoints + projectPoints;
        System.out.println("Total score: " + total);
    }

    void main() {
        addAssignmentPoints(25);
        addExamPoints(40);
        addProjectPoints(30);
        printTotal();
    }
     */


    // Opgave 3
    /*
    double applyDiscount(double price, double discountPercent) {
        return price * (1 - discountPercent / 100);
    }

    double addTax(double price) {
        return price * 1.25;
    }

    double calculateFinalPrice(double basePrice, double discount) {
        double priceAfterDiscount = applyDiscount(basePrice, discount);
        double finalPrice = addTax(priceAfterDiscount);
        return finalPrice;
    }

    void main() {
        double finalPrice = calculateFinalPrice(500, 20);
        System.out.println("Final price: " + finalPrice + " kr");
    }
     */



    // Opgave 4
    /*
    int calculateAverage(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total = total + data[i];
        }
        return total / data.length;
    }

    int findMax(int[] data) {
        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        return max;
    }

    int findMin(int[] data) {
        int min = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        return min;
    }

    int countAboveAverage(int[] data) {
        int average = calculateAverage(data);
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > average) {
                count++;
            }
        }

        return count;
    }

    void main() {
        int[] data = {45, 67, 23, 89, 34, 56, 78};
        System.out.println("Average number: " + calculateAverage(data));
        System.out.println("Max: " + findMax(data));
        System.out.println("Min: " + findMin(data));
        System.out.println("Count above average: " + countAboveAverage(data));
    }
     */



    // Opgave 5
    /*
    void main() {

            int a = 7, b = 42;

            int smaller = minimum(a, b); // Gemmer resultatet fra metoden minimum() i variablen smaller

            if (smaller == a) { // if skal have en betingelse i parentes
                System.out.println("a is the smallest!");
            } else {
                    System.out.println("b is the smallest!"); // tilføje else
                }
        }

        int minimum(int a, int b) { // Metoden skal have int som return type, fordi den returnerer et tal

            int smaller; // Opretter smaller uden for if/else, så den kan bruges bagefter

            if (a < b) {
                smaller = a; // Gemmer a som det mindste tal

            } else { // Man skriver ikke (a >= b) efter else
                smaller = b; // Hvis a ikke er mindre end b, er b det mindste tal
            }

            return smaller; // Returnerer det mindste tal
        }
     */

}