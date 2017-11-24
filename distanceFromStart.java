
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
      int r = 0;
    ArrayList<Double> al = new ArrayList<Double>();
    Random rand = new Random();
    double y = 0;
    double x = 0;
    for (int i = 0; i < 100000; i++)
    {
      r = rand.nextInt(4);
      if (r == 1) {x += 1;}
      if (r == 2) {x -= 1;}
      if (r == 3) {y += 1;}
      if (r == 0) {y -= 1;}
      double distance = Math.sqrt((x * x) + (y * y));
      al.add(distance);
      
     System.out.println(x + ", " + y);
    }  
    System.out.println(al.get(99999));
  }
}

