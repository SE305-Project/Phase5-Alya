
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test001"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", 100);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 10);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test002"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 0);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test003"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test004"); }

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
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test005"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test006"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)10);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test007"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'a');

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test008"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)-1);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test009"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 1);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test010"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test011"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test012"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((-1), "", 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test013"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'4', "", 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test014"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "", 100);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test015"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(1, "", (int)'4');

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test016"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(1, "", 1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test017"); }

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
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test018"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)10);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test019"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test020"); }

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
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)100);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test021"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'#');

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test022"); }

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
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)1);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test023"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test024"); }

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
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)' ');

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test025"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test026"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test027"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test028"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test029"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test030"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 10);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test031"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)-1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test032"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)100);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test033"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)10);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test034"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test035"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)1);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test036"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test037"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "", 1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test038"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'4');

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test039"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest(10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test040"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test041"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)' ');

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test042"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test043"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'#');

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test044"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test045"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)-1);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test046"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)100);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test047"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)100);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test048"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 1);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "", (int)'a');

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test049"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (-1));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test050"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)1);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test051"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)100);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test052"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test053"); }

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
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)100);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test054"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test055"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'a');

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test056"); }

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
    pharmacySystem0.addMedicationRequest(10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test057"); }

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
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'4');

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test058"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'4');

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test059"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (-1));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test060"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 1);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test061"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)10);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test062"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)100);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test063"); }

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
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test064"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(1, "", 1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test065"); }

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
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)-1);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test066"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", 10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test067"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test068"); }

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
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)100);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test069"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test070"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'#');

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test071"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)1);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test072"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test073"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 10);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test074"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 10);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test075"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test076"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)10);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test077"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)1);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test078"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test079"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)' ');

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test080"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)100);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test081"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test082"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test083"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)100);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test084"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test085"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 1);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test086"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test087"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test088"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test089"); }

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
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((-1), "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test090"); }

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
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(100, "", (int)'4');

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test091"); }

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
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test092"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)1);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test093"); }

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
    pharmacySystem0.addMedicationRequest((int)'a', "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", 0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test094"); }

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
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test095"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test096"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test097"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)1);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test098"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 10);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test099"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test100"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)' ');

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test101"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)10);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test102"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test103"); }

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
    pharmacySystem0.addMedicationRequest(10, "", (int)' ');

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test104"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test105"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)1);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test106"); }

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
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test107"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test108"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)10);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test109"); }

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
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)10);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test110"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 10);
    pharmacySystem0.addMedicationRequest((-1), "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)10);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test111"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 100);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test112"); }

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
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test113"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test114"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)100);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test115"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test116"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test117"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)1);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test118"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test119"); }

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
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test120"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)100);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test121"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test122"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)100);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test123"); }

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
    pharmacySystem0.addMedicationRequest((int)'a', "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test124"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test125"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test126"); }

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
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test127"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'#');

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test128"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)-1);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test129"); }

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
    pharmacySystem0.addMedicationRequest(10, "", 10);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test130"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)100);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test131"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test132"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'#');
    pharmacySystem0.addMedicationRequest(10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test133"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)-1);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test134"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'a', "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test135"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 1);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test136"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test137"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test138"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test139"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test140"); }

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
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test141"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)10);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test142"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'#');

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test143"); }

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
    pharmacySystem0.addMedicationRequest(1, "", (int)'#');
    pharmacySystem0.addMedicationRequest(10, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "", 100);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test144"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 10);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test145"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest(1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test146"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)10);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test147"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 1);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test148"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)10);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test149"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)100);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test150"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)-1);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test151"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)1);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test152"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)1);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test153"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test154"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test155"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 10);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test156"); }

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
    pharmacySystem0.addMedicationRequest((-1), "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'a', "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)-1);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test157"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test158"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)-1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test159"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)10);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test160"); }

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
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(byte)100);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test161"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'a', "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)' ');

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test162"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (-1));
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)1);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test163"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((-1), "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", 1);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test164"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 10);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test165"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)-1);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test166"); }

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
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)0);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test167"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)1);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test168"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'a', "", 1);
    pharmacySystem0.addMedicationRequest(100, "", 10);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)10);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test169"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (-1));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test170"); }

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
    pharmacySystem0.addMedicationRequest(0, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 10);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test171"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'a');

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test172"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 0);
    pharmacySystem0.addMedicationRequest(100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)10);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test173"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test174"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'a');

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test175"); }

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
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'4');

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test176"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 10);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test177"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)' ');

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test178"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'a');

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test179"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)100);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test180"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 100);
    pharmacySystem0.addMedicationRequest(1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)'#');

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test181"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test182"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(1, "", (int)'a');

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test183"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 0);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test184"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)10);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test185"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)100);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test186"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test187"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'#');

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test188"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'#');

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test189"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test190"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(1, "", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test191"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)' ');

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test192"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(100, "", (int)'4');

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test193"); }

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
    pharmacySystem0.addMedicationRequest(10, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)1);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test194"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)-1);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test195"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)1);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test196"); }

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
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test197"); }

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
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test198"); }

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
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test199"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test200"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'a');

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test201"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test202"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'a', "", 10);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test203"); }

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
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)-1);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test204"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test205"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)1);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test206"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "", (-1));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test207"); }

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
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)10);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test208"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(byte)100);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test209"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (-1));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test210"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)1);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test211"); }

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
    pharmacySystem0.addMedicationRequest((-1), "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)10);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test212"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 0);
    pharmacySystem0.addMedicationRequest(10, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)' ');

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test213"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);
    pharmacySystem0.addMedicationRequest((-1), "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "", (int)'a');

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test214"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 100);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test215"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (-1));
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'4');

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test216"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)-1);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test217"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test218"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(byte)0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test219"); }

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
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)0);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test220"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)' ');

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test221"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)0);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test222"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)10);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test223"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)10);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test224"); }

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
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 10);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test225"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test226"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 1);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)'4');

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test227"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)100);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test228"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(100, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(byte)0);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test229"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 100);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test230"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 0);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test231"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)1);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test232"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(10, "", 100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 0);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test233"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "", (int)(short)-1);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test234"); }

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
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)1);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test235"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)1);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test236"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test237"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 100);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)10);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test238"); }

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
    pharmacySystem0.addMedicationRequest((int)'a', "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)-1);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test239"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)'4');

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test240"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 1);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test241"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test242"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(short)100);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test243"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest(1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)-1);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test244"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test245"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test246"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)100);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test247"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'#', "", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test248"); }

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
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)100);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test249"); }

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
    pharmacySystem0.addMedicationRequest(100, "", (-1));
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test250"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'4');

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test251"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)-1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test252"); }

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
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (-1));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test253"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)' ');

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test254"); }

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
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test255"); }

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
    pharmacySystem0.addMedicationRequest((-1), "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", 0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test256"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "", 1);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test257"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test258"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)' ');

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test259"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test260"); }

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
    pharmacySystem0.addMedicationRequest(10, "", 1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(short)100);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test261"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((-1), "", 1);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test262"); }

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
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)100);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test263"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(short)-1);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test264"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (-1));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test265"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 10);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test266"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest(100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(10, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 100);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test267"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);
    pharmacySystem0.addMedicationRequest(100, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);
    pharmacySystem0.addMedicationRequest((-1), "", 0);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test268"); }

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
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test269"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test270"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 10);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test271"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", 0);
    pharmacySystem0.addMedicationRequest(10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(10, "", 0);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test272"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest(100, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (-1));
    pharmacySystem0.addMedicationRequest(100, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)-1);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test273"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(10, "hi!", 10);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test274"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'a', "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)-1);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test275"); }

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
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(byte)1);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test276"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)-1);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test277"); }

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
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (-1));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test278"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'4');

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test279"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", 0);
    pharmacySystem0.addMedicationRequest(10, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'4');

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test280"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)' ');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)0);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test281"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)100);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test282"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test283"); }

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
    pharmacySystem0.addMedicationRequest(1, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "", (-1));
    pharmacySystem0.addMedicationRequest((-1), "", 0);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)0);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test284"); }

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
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)100);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test285"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)'4');

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test286"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)10);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test287"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'a');

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test288"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)100);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test289"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)-1);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test290"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 100);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest(10, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)' ');

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test291"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)(short)-1);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test292"); }

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
    pharmacySystem0.addMedicationRequest(0, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)1);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test293"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest(100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(byte)10);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test294"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", 1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", 0);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test295"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", 100);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(100, "", (int)'#');
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", 100);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test296"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 10);
    pharmacySystem0.addMedicationRequest(0, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 0);
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'a', "", 100);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test297"); }

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
    pharmacySystem0.addMedicationRequest((int)'#', "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", 1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test298"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (-1));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test299"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((-1), "", 0);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test300"); }

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
    pharmacySystem0.addMedicationRequest(1, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (-1));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test301"); }

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
    pharmacySystem0.addMedicationRequest(0, "", 100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)100);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test302"); }

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
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)' ');

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test303"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest((-1), "", (int)(byte)10);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test304"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", 1);
    pharmacySystem0.addMedicationRequest(10, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)100);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test305"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(1, "", 1);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "hi!", 0);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test306"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)(short)1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest(10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 10);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test307"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)' ');
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'a', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(100, "", 10);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test308"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "hi!", 1);
    pharmacySystem0.addMedicationRequest(1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", 0);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", (int)(short)-1);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test309"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(short)1);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test310"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest(10, "hi!", 100);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "", 10);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "hi!", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", 0);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test311"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)' ');
    pharmacySystem0.addMedicationRequest(0, "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(byte)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "hi!", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)'4');
    pharmacySystem0.addMedicationRequest((int)'4', "", 10);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test312"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)' ');
    pharmacySystem0.addMedicationRequest(1, "hi!", 1);
    pharmacySystem0.addMedicationRequest((int)'a', "", (-1));
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(short)-1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test313"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)10, "hi!", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(short)100, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)0, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(100, "hi!", 100);
    pharmacySystem0.addMedicationRequest(10, "hi!", (int)(byte)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", 0);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test314"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)0, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)'#', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(0, "", (int)(short)0);
    pharmacySystem0.addMedicationRequest((int)(byte)1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", 10);
    pharmacySystem0.addMedicationRequest(10, "hi!", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)1, "", 1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (int)(short)1);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test315"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest(1, "", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "", 10);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(short)1, "", (-1));
    pharmacySystem0.addMedicationRequest((-1), "", (int)'a');
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(byte)0);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test316"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(byte)-1, "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(byte)0);
    pharmacySystem0.addMedicationRequest((int)' ', "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((-1), "hi!", (int)(byte)-1);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test317"); }

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
    pharmacySystem0.addMedicationRequest((int)(short)-1, "hi!", 0);
    pharmacySystem0.addMedicationRequest((int)'#', "", 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test318"); }

    PharmacySystem pharmacySystem0 = new PharmacySystem();
    pharmacySystem0.addMedicationRequest((int)(short)-1, "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest((int)(byte)10, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest((int)'4', "hi!", (int)(byte)-1);
    pharmacySystem0.addMedicationRequest((int)'a', "hi!", 100);
    pharmacySystem0.addMedicationRequest(1, "hi!", (int)'#');
    pharmacySystem0.addMedicationRequest(0, "", (int)'a');
    pharmacySystem0.addMedicationRequest(100, "hi!", (int)(short)10);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)(short)10);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test319"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)1, "hi!", (int)(byte)10);
    pharmacySystem0.addMedicationRequest((int)(short)0, "hi!", (int)(short)-1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (int)(short)0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test320"); }

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
    pharmacySystem0.addMedicationRequest((int)(byte)100, "", (int)' ');
    pharmacySystem0.addMedicationRequest(100, "", (-1));
    pharmacySystem0.addMedicationRequest((int)(short)100, "", 0);
    pharmacySystem0.addMedicationRequest(0, "hi!", (int)'4');
    pharmacySystem0.addMedicationRequest((int)(short)10, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest(1, "", (int)(byte)0);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test321"); }

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
    pharmacySystem0.addMedicationRequest((int)'a', "", 1);
    pharmacySystem0.addMedicationRequest((int)(short)0, "", (int)(short)100);
    pharmacySystem0.addMedicationRequest((int)' ', "", (int)(short)1);
    pharmacySystem0.addMedicationRequest((int)'4', "", (-1));

  }

}
