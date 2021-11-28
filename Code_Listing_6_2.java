package ch6java6thedition;

/**
 * This is the code listing 6.2, an example of a class called 
 * rectangle. 
 * 
 * @author craig
 */
public class Code_Listing_6_2 {
		// Fields
		private double length;
		private double width;

		/**
		 * The setLength method stores a value in the 
		 * length field. 
		 * @param len The length of the rectangle.
		 */
		public void setLength (double len) {
			length = len;
		}
		/**
		 * The setWidth method stores a value in the 
		 * width field.
		 * @param w The width of the rectangle.
		 */
		public void setWidth (double w) {
			width = w;
		}
		/**
		 * The getLength method returns the value in 
		 * the length field.
		 * @return length
		 */
		public double getLength () {
			return length;
		}
		/**
		 * The getWidth method returns the value in
		 * the width field. 
		 * @return length
		 */
		public double getWidth () {
			return width;
		}
		/**
		 * The getArea method returns the rectangle's 
		 * area.
		 * @return The product of length times width.
		 */
		public double getArea() {
			return length * width;
		}
}
