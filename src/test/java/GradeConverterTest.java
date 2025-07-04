/**
 * Package chứa các lớp kiểm thử cho lớp GradeConverter.
 */

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * Lớp kiểm thử cho lớp GradeConverter.
 */
public class GradeConverterTest {

    /** Đối tượng chuyển đổi điểm. */
    private GradeConverter converter;

    /** Hằng số điểm dùng cho kiểm thử. */
    private static final int SCORE_A1 = 100;
    private static final int SCORE_A2 = 90;
    private static final int SCORE_B = 80;
    private static final int SCORE_C = 70;
    private static final int SCORE_D = 60;
    private static final int SCORE_E = 50;
    private static final int SCORE_INVALID_HIGH = 101;
    private static final int SCORE_INVALID_LOW_1 = -10;
    private static final int SCORE_INVALID_LOW_2 = -20;

    /**
     * Thiết lập đối tượng GradeConverter trước mỗi test.
     *
     * @throws Exception Nếu có lỗi khởi tạo.
     */
    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    /**
     * Kiểm thử điểm 100 → A.
     *
     * @throws Exception Nếu có lỗi kiểm thử.
     */
    @Test
    public void testConvertA1() throws Exception {
        String expected = "A";
        String actual = converter.convert(SCORE_A1);
        assertEquals(expected, actual);
    }

    /**
     * Kiểm thử điểm 90 → A.
     *
     * @throws Exception Nếu có lỗi kiểm thử.
     */
    @Test
    public void testConvertA2() throws Exception {
        String expected = "A";
        String actual = converter.convert(SCORE_A2);
        assertEquals(expected, actual);
    }

    /**
     * Kiểm thử điểm 80 → B.
     *
     * @throws Exception Nếu có lỗi kiểm thử.
     */
    @Test
    public void testConvertB() throws Exception {
        String expected = "B";
        String actual = converter.convert(SCORE_B);
        assertEquals(expected, actual);
    }

    /**
     * Kiểm thử điểm 70 → C.
     *
     * @throws Exception Nếu có lỗi kiểm thử.
     */
    @Test
    public void testConvertC() throws Exception {
        String expected = "C";
        String actual = converter.convert(SCORE_C);
        assertEquals(expected, actual);
    }

    /**
     * Kiểm thử điểm 60 → D.
     *
     * @throws Exception Nếu có lỗi kiểm thử.
     */
    @Test
    public void testConvertD() throws Exception {
        String expected = "D";
        String actual = converter.convert(SCORE_D);
        assertEquals(expected, actual);
    }

    /**
     * Kiểm thử điểm 50 → E.
     *
     * @throws Exception Nếu có lỗi kiểm thử.
     */
    @Test
    public void testConvertE() throws Exception {
        String expected = "E";
        String actual = converter.convert(SCORE_E);
        assertEquals(expected, actual);
    }

    /**
     * Kiểm thử điểm 101 → Invalid.
     *
     * @throws Exception Nếu có lỗi kiểm thử.
     */
    @Test
    public void testConvertInvalidHigh() throws Exception {
        String expected = "Invalid";
        String actual = converter.convert(SCORE_INVALID_HIGH);
        assertEquals(expected, actual);
    }

    /**
     * Kiểm thử điểm -10 → Invalid.
     *
     * @throws Exception Nếu có lỗi kiểm thử.
     */
    @Test
    public void testConvertInvalidLow1() throws Exception {
        String expected = "Invalid";
        String actual = converter.convert(SCORE_INVALID_LOW_1);
        assertEquals(expected, actual);
    }

    /**
     * Kiểm thử điểm -20 → Invalid.
     *
     * @throws Exception Nếu có lỗi kiểm thử.
     */
    @Test
    public void testConvertInvalidLow2() throws Exception {
        String expected = "Invalid";
        String actual = converter.convert(SCORE_INVALID_LOW_2);
        assertEquals(expected, actual);
    }
}
