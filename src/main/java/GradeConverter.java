/**
 * Lớp GradeConverter dùng để chuyển đổi điểm số thành xếp loại chữ cái.
 */
public final class GradeConverter {
    /** Điểm tối đa hợp lệ. */
    private static final int MAX_SCORE = 100;
    /** Điểm tối thiểu hợp lệ. */
    private static final int MIN_SCORE = 0;
    /** Điểm tối thiểu để đạt loại A. */
    private static final int MIN_A_SCORE = 90;
    /** Điểm tối thiểu để đạt loại B. */
    private static final int MIN_B_SCORE = 80;
    /** Điểm tối thiểu để đạt loại C. */
    private static final int MIN_C_SCORE = 70;
    /** Điểm tối thiểu để đạt loại D. */
    private static final int MIN_D_SCORE = 60;
    /** Điểm tối thiểu để đạt loại E. */
    private static final int MIN_E_SCORE = 50;

    /**
     * Phương thức chuyển đổi điểm số thành xếp loại chữ cái.
     *
     * @param score Điểm số đầu vào (0-100).
     * @return Chuỗi xếp loại chữ cái tương ứng (A, B, C, D, E hoặc "Invalid").
     */
    public String convert(final int score) {
        if (score > MAX_SCORE || score < MIN_SCORE) {
            return "Invalid";
        } else if (score >= MIN_A_SCORE) {
            return "A";
        } else if (score >= MIN_B_SCORE) {
            return "B";
        } else if (score >= MIN_C_SCORE) {
            return "C";
        } else if (score >= MIN_D_SCORE) {
            return "D";
        } else if (score >= MIN_E_SCORE) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}
