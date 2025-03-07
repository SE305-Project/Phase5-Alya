
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test001"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 1);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test002"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(10, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test003"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test004"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'4');

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test005"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)10);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test006"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test007"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 10);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)10);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test008"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'4');

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test009"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)100);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test010"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 10);
    pharmacySystem0.addMedicationRequest(100, "hi!", (-1));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test011"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);
    pharmacySystem0.addMedicationRequest(100, "", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)10);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test012"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test013"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test014"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test015"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)-1);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test016"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)'4');

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test017"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test018"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 1);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test019"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'#');

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test020"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)-1);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test021"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test022"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)10);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test023"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test024"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 10);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test025"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test026"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test027"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (-1));
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test028"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test029"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 100);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test030"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test031"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "hi!", 10);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)100);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test032"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)' ');

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test033"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 10);
    pharmacySystem0.addMedicationRequest(1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test034"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 10);
    pharmacySystem0.addMedicationRequest((-1), "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test035"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)-1);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test036"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)' ');

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test037"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", 100);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)-1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test038"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test039"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)1);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test040"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", 0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test041"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)1);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test042"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test043"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)-1);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test044"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test045"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)10);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test046"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'#');

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test047"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test048"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)0);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test049"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)100);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test050"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)-1);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test051"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)100);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test052"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'a');

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test053"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest(1, "hi!", 10);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test054"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'#', "", 100);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)-1);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test055"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)10);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test056"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)10);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test057"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)10);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test058"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", 100);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'#');
    pharmacySystem0.addMedicationRequest(10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)-1);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test059"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test060"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test061"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(100, "", (int)'4');

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test062"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test063"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test064"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 100);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test065"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)-1);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test066"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "", (int)'a');

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test067"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "hi!", 100);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test068"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 100);
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)'4');

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test069"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test070"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)' ');

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test071"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)100);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test072"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test073"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test074"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(10, "", 1);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test075"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)-1);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test076"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 10);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test077"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test078"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((-1), "", 100);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)'4');

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test079"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)' ');

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test080"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)100);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test081"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)' ');

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test082"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (-1));
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test083"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test084"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test085"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest((int)' ', "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'4');

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test086"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'#');

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test087"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (-1));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test088"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test089"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test090"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)' ');

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test091"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest(1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)1);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test092"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test093"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", 0);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)10);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test094"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)-1);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test095"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)' ');

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test096"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test097"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test098"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)100);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test099"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)' ');
    pharmacySystem0.addMedicationRequest((-1), "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "", 100);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test100"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)1);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test101"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)' ');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test102"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)100);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test103"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test104"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)'4');

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test105"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 100);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test106"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test107"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test108"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "", 1);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test109"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test110"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)1);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test111"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (-1));
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'4');

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test112"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)-1);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test113"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 10);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test114"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)' ');

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test115"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 10);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test116"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'4');

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test117"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test118"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test119"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)' ');

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test120"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test121"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)1);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test122"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test123"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)100);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test124"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'#');

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test125"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)100);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test126"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)10);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test127"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 100);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test128"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test129"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)10);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test130"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 0);
    pharmacySystem0.addMedicationRequest(10, "", 1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test131"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)-1);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test132"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test133"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "hi!", 10);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test134"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test135"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'#');
    pharmacySystem0.addMedicationRequest(10, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)-1);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test136"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 100);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test137"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)'#');

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test138"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)-1);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test139"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test140"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test141"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)' ');

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test142"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)1);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test143"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 100);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test144"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)-1);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test145"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 1);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test146"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test147"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test148"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)1);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test149"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test150"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test151"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test152"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)-1);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test153"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", 100);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)1);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test154"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 100);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)1);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test155"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'4');

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test156"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)-1);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test157"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)-1);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test158"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'#');

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test159"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'a');

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test160"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 100);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)10);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test161"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)10);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test162"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test163"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)1);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test164"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test165"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "", (-1));
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test166"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)10);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test167"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest(1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'a', "", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", 10);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test168"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((-1), "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)-1);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test169"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)0);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test170"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)10);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test171"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'#');

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test172"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test173"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)10);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test174"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest(100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test175"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)'a');
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest(10, "", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 100);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test176"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)100);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test177"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test178"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)-1);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test179"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)10);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test180"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)10);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test181"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)10);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test182"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test183"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test184"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test185"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "", (int)'#');

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test186"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)100);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test187"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "", 1);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test188"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", 10);
    pharmacySystem0.addMedicationRequest(1, "", 0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test189"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test190"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)1);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test191"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)1);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test192"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test193"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test194"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)100);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test195"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 1);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test196"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest(10, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 1);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test197"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "", 100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)1);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test198"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)100);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test199"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'a', "", 0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test200"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "", 10);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test201"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test202"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (-1));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test203"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'#');

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test204"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((-1), "", 1);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test205"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)1);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test206"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)-1);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test207"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", 1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)'#');

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test208"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)100);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test209"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)-1);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test210"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 10);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test211"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)0);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test212"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test213"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 100);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test214"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test215"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", 0);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test216"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'4');

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test217"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)10);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test218"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test219"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)10);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test220"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "", 1);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test221"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 1);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test222"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'a');

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test223"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)100);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test224"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "", 10);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test225"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(1, "hi!", 1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test226"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test227"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test228"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "", 100);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test229"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test230"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)1);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test231"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test232"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 10);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test233"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)1);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test234"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test235"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)' ');

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test236"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'4');

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test237"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 10);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test238"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test239"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest((-1), "", (-1));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test240"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test241"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)1);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test242"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test243"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)10);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test244"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test245"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test246"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)1);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test247"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)-1);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test248"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test249"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'a');

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test250"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)100);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test251"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 100);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test252"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "", 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test253"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'a');

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test254"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test255"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test256"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 1);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test257"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test258"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 0);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test259"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)' ');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'a');

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test260"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", (-1));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test261"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'4');

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test262"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)1);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test263"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)10);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test264"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'a');

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test265"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test266"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test267"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", 0);
    pharmacySystem0.addMedicationRequest(100, "", (-1));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test268"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'4', "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test269"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)10);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test270"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)' ');

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test271"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 100);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test272"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)1);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test273"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)'a');
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest(10, "", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test274"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 10);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test275"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 1);
    pharmacySystem0.addMedicationRequest((int)'4', "", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)-1);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test276"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 1);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test277"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest(10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 100);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)1);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test278"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 10);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test279"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test280"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test281"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)0);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test282"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)10);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test283"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'#');

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test284"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)'4');

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test285"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)100);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test286"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)100);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test287"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'#', "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test288"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)100);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test289"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)-1);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test290"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test291"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 100);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test292"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)' ');

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test293"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)-1);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test294"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 100);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test295"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)100);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test296"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "", (int)'a');

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test297"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 100);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test298"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 0);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test299"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'#');

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test300"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest(1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'4');

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test301"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)' ');

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test302"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 100);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test303"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest(100, "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 100);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test304"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test305"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test306"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 1);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test307"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 100);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test308"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)10);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test309"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)10);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test310"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test311"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)0);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test312"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test313"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)1);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test314"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test315"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)0);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test316"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)-1);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test317"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)-1);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test318"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)10);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test319"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)-1);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test320"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test321"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'4');

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test322"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (-1));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test323"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)0);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test324"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 0);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test325"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)0);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test326"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 1);
    pharmacySystem0.addMedicationRequest(1, "", 1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)'a');

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test327"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "", (int)' ');

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test328"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test329"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test330"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)10);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test331"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (-1));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test332"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 10);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test333"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "", 10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 1);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test334"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)100);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test335"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test336"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)100);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test337"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test338"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'#');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)-1);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test339"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test340"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)100);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test341"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test342"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)-1);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test343"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((-1), "hi!", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 1);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test344"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test345"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test346"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test347"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'4');

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test348"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)1);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test349"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)'a');

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test350"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(1, "", (-1));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test351"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'4');

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test352"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)10);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test353"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)' ');

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test354"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'4');

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test355"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'4', "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'#');

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test356"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)1);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test357"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)10);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test358"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'#');

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test359"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)10);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test360"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest(100, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test361"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)'#');

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test362"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test363"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test364"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", 1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 100);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test365"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test366"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test367"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 100);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test368"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 1);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test369"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)1);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test370"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)100);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test371"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'a');

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test372"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test373"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'4', "", 100);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test374"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(1, "", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)-1);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test375"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test376"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'4');

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test377"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)1);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test378"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test379"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", 100);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test380"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test381"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", 100);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test382"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test383"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test384"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)-1);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test385"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(10, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test386"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)10);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test387"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest(100, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)100);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test388"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'#');

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test389"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)1);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test390"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "", 100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)100);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test391"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)100);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test392"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test393"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest(1, "", (int)'4');

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test394"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 10);
    pharmacySystem0.addMedicationRequest((-1), "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)-1);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test395"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test396"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test397"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)1);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test398"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test399"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)-1);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test400"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)'4');

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test401"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test402"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)0);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test403"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 1);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test404"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test405"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test406"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", 100);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test407"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "", (-1));
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 0);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)0);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test408"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)'#');

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test409"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'a');

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test410"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test411"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)1);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test412"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test413"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test414"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (-1));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test415"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test416"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((-1), "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 1);
    pharmacySystem0.addMedicationRequest(1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)100);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test417"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(100, "", 1);
    pharmacySystem0.addMedicationRequest(10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)-1);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test418"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (-1));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test419"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test420"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)1);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test421"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)-1);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test422"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 100);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test423"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)-1);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test424"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)10);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test425"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)100);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test426"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test427"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test428"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)-1);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test429"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 100);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test430"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 1);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test431"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 10);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test432"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)100);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test433"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test434"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test435"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'4');

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test436"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)0);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test437"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)0);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test438"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 10);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test439"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)-1);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test440"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)100);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test441"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)10);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test442"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test443"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (-1));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test444"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 1);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test445"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)' ');

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test446"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 100);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test447"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)1);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test448"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test449"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)0);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test450"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (-1));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test451"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)' ');

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test452"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)100);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test453"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 100);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test454"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'a');

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test455"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(100, "", 1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'#');

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test456"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 1);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test457"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test458"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 0);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test459"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", 100);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 0);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test460"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)' ');
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test461"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 100);
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)-1);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test462"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)10);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test463"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 100);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test464"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 0);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test465"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)100);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test466"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 1);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test467"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 100);
    pharmacySystem0.addMedicationRequest(1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'#');

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test468"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)10);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test469"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 1);
    pharmacySystem0.addMedicationRequest((int)'4', "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)' ');

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test470"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)1);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test471"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", 100);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (-1));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test472"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test473"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "", 0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test474"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", 1);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test475"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 100);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)1);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test476"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'a');

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test477"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'4');

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test478"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)10);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test479"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)-1);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test480"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'4', "", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)100);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test481"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test482"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "", 1);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test483"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'a');

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test484"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 1);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test485"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)-1);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test486"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 100);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)10);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test487"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test488"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)100);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test489"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)'a');

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test490"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (-1));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test491"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)'#');

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test492"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test493"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test494"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test495"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)1);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test496"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'4');

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test497"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)1);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test498"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)' ');

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test499"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(100, "", 1);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test500"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');

  }

}
