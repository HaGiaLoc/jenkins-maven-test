package org.example;

/**
 * Lớp Main chứa phương thức main để chạy chương trình.
 * Đây là lớp tiện ích không nên khởi tạo.
 */
public final class Main {

    /**
     * Constructor private để ngăn không cho khởi tạo lớp tiện ích.
     */
    private Main() {
        // Ngăn không cho tạo đối tượng
    }

    /**
     * Phương thức main để chạy chương trình.
     *
     * @param args Tham số dòng lệnh (không sử dụng).
     */
    public static void main(final String[] args) {
        System.out.println("Hello world!");
    }
}
