import java.lang.Math; // headers MUST be above the first class
import java.util.*;
import java.net.*;
import static com.googlecode.charts4j.Color.*;
import static com.googlecode.charts4j.UrlUtil.normalize;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;

import com.googlecode.charts4j.AxisLabels;
import com.googlecode.charts4j.AxisLabelsFactory;
import com.googlecode.charts4j.AxisStyle;
import com.googlecode.charts4j.AxisTextAlignment;
import com.googlecode.charts4j.Color;
import com.googlecode.charts4j.Data;
import com.googlecode.charts4j.DataUtil;
import com.googlecode.charts4j.Fills;
import com.googlecode.charts4j.GCharts;
import com.googlecode.charts4j.Line;
import com.googlecode.charts4j.LineChart;
import com.googlecode.charts4j.LineStyle;
import com.googlecode.charts4j.LinearGradientFill;
import com.googlecode.charts4j.Plots;
import com.googlecode.charts4j.Shape;


public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {

      Line line1 = Plots.newLine(Data.newData(mywebsite), Color.newColor("CA3D05"), "My Website.com");
      line1.setLineStyle(LineStyle.newLineStyle(3, 1, 0));
      line1.addShapeMarkers(Shape.DIAMOND, Color.newColor("CA3D05"), 12);
      line1.addShapeMarkers(Shape.DIAMOND, Color.WHITE, 8);
      Line line2 = Plots.newLine(Data.newData(competition), SKYBLUE, "Competition.com");
      line2.setLineStyle(LineStyle.newLineStyle(3, 1, 0));
      line2.addShapeMarkers(Shape.DIAMOND, SKYBLUE, 12);
      line2.addShapeMarkers(Shape.DIAMOND, Color.WHITE, 8);

      final int NUM_POINTS = 10000;
      LineChart chart = GCharts.newLineChart(line1, line2);
      chart.setSize(600, 450);
      chart.setTitle("Distace", WHITE, 14);
      chart.addHorizontalRangeMarker(40, 60, Color.newColor(RED, 30));
      chart.addVerticalRangeMarker(70, 90, Color.newColor(GREEN, 30));
      chart.setGrid(25, 25, 3, 2);



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

