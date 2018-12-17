import java.util.Scanner;
import java.util.ArrayList;

class Stock implements Comparable<Stock> {
  private String company;
  private double change;
  Stock(String company9,double change9) {
    this.company = company9;
    this.change = change9;
  }
  public String getComp() {
    return company;
  }
  public double getChange() {
    return change;
  }
  public String toString() {
    return company + " " + change;
  }
  public int compareTo(final Stock that) {
    if (this.change > that.getChange()) {
      return 1;
    }
    if (this.change < that.getChange()) {
      return -1;
    }
    if (this.company.compareTo(that.getComp()) > 0) {
      return 1;
    }
    if (this.company.compareTo(that.getComp()) < 0) {
      return -1;
    } else {
      return 0;
    }
  }
}

public final class Solution {
  private Solution() {
  }

  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);

    int stockSize = Integer.parseInt(scan.nextLine());
    ArrayList<Stock> best = new ArrayList<Stock>();
    ArrayList<Stock> worst = new ArrayList<Stock>();
    MinPQ<Stock> hour1Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour1Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour1Max.insert(temp);
      hour1Min.insert(temp);
    }

    hour1Max.print(best);
    hour1Min.print(worst);

    MinPQ<Stock> hour2Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour2Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour2Max.insert(temp);
      hour2Min.insert(temp);
    }

    hour2Max.print(best);
    hour2Min.print(worst);

    MinPQ<Stock> hour3Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour3Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour3Max.insert(temp);
      hour3Min.insert(temp);
    }

    hour3Max.print(best);
    hour3Min.print(worst);

    MinPQ<Stock> hour4Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour4Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour4Max.insert(temp);
      hour4Min.insert(temp);
    }

    hour4Max.print(best);
    hour4Min.print(worst);

    MinPQ<Stock> hour5Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour5Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour5Max.insert(temp);
      hour5Min.insert(temp);
    }

    hour5Max.print(best);
    hour5Min.print(worst);

    MinPQ<Stock> hour6Min = new MinPQ<Stock>();
    MaxPQ<Stock> hour6Max = new MaxPQ<Stock>();

    for (int i = 0; i < stockSize; i++) {
      String[] inputs = scan.nextLine().split(",");
      Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
      hour6Max.insert(temp);
      hour6Min.insert(temp);
    }
    hour6Max.print(best);
    hour6Min.print(worst);
  }
}
