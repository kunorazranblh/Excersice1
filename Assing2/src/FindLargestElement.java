
public class FindLargestElement {
	public void largestElement () {
		double multiDimArray[][]= {
				{3.2, 3.4, 2.7},
				{2.5, 3.0, 2.8}
			};
		double largest;
		for (int i = 0; i < multiDimArray.length; i++) {
			 largest = multiDimArray[i][0];
		      for (int y= 1; y < multiDimArray[i].length; y++) {
		        if (largest < multiDimArray[i][y]) {
		          largest =multiDimArray[i][y];
		        }
		      }
		      System.out.println("The largest element of row" + (i+1) + "=" + largest);
		    }
		  }
		}
