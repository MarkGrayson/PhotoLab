package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Grayson Palesh
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  
  
  public static void testMirrorGull()
  {
	  Picture Gull = new Picture("seagull.jpg");
	  Gull.explore();
	  Gull.mirrorGulls();
	  Gull.explore();
	  Gull.mirrorDiagonalUphill();
	  Gull.explore();
	  Gull.mirrorHorizontalBottomToTop();
	  Gull.explore();
	  Gull.edgeDetection(12);
	  Gull.explore();
	  Gull.write("Mark Glitch.jpg");
  }
  
  public static void testSteganography()
  {
	  Picture source = new Picture("Doge.jpeg");
	  source.explore();
	  Picture hidden = new Picture("Harambe.jpeg");
	  source.encode(hidden);
	  source.explore();
	  hidden.explore();
	  source.decode();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorHorizontalBottomToTop();
	  snowman.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture scooter = new Picture("blueMotorcycle.jpg");
	  Picture koala = new Picture("koala.png");
	  scooter.explore();
	  koala.explore();
	  scooter.mirrorDiagonal();
//	  koala.mirrorDiagonal();
	  koala.mirrorDiagonalUphill();
//    koala.mirrorHorizontalBottomToTop();
//    koala.mirrorDiagonalBottomRightToTopLeft();
	  
	  koala.explore();
	  koala.write("fancyMirror.jpg");
	  scooter.explore();
  }
  
  
  
  public static void testMirrorHorizontalTopToBottom()
  {
	  Picture code = new Picture("code.png");
	  code.explore();
	  code.mirrorHorizontalTopToBottom();
	  code.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorHorizontalBottomToTop();
    //testMirrorTemple();
    //testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}