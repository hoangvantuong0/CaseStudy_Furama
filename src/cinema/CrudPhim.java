package cinema;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import static cinema.DocTenPhim.docTenPhim;
import static cinema.VietTenPhim.vietTenPhim;
import static utils.Regex.checkRegex;

public class CrudPhim {
    public static final String DAY_REGEX = "\\d{1,2}/\\d{1,2}/\\d{4}";
    private static final String REGEX_ID = "^\\d{2}$";
    private static final String REGEX_NAME = "^\\w*$";
    private static final String SHOW_FORMAT = "^CI-\\d{4}$";
    private static final String TIME_FORMAT = "^\\d{2}-\\d{2}-\\d{4}$";
    public static final String PHIM_PATH = "src/cinema/data/phim.csv";
    List<Phim> danhSachPhim = docTenPhim(PHIM_PATH);
    Scanner scanner = new Scanner(System.in);

    public void themPhim() {
        Phim phim = new Phim(Integer.parseInt(addIdPhim()), addMaSuatChieu(),
                addTenPhim(), addNgayChieu(), Integer.parseInt(addSoLuongVe()));
        danhSachPhim.add(phim);
        File file = new File(PHIM_PATH);
        file.delete();
        vietTenPhim(danhSachPhim, PHIM_PATH, true);
    }

    public String addIdPhim() {
        System.out.println("Id phim (2 chữ số): ");
        String idPhim = scanner.nextLine();
        return checkRegex(idPhim, REGEX_ID, "Wrong input!");
    }

    public String addMaSuatChieu() {
        System.out.println("Mã suất chiếu (CI-0000): ");
        String maSuatChieu = scanner.nextLine();
        return checkRegex(maSuatChieu, SHOW_FORMAT, "Error input");
    }

    public String addTenPhim() {
        System.out.println("Tên phim: ");
        String tenPhim = scanner.nextLine();
        return checkRegex(tenPhim, REGEX_NAME, "Error");
    }

    public String addNgayChieu() {
        System.out.println("Ngày chiếu: ");
        String ngayChieu = scanner.nextLine();
        return checkRegex(ngayChieu, DAY_REGEX, "Error");
    }

    public String addSoLuongVe() {
        System.out.println("Nhập số lượng vé: ");
        String soLuongVe = scanner.nextLine();
        return checkRegex(soLuongVe, REGEX_ID, "error");
    }

    public void hienThiPhim() {
        for (Phim phim2 : danhSachPhim) {
            System.out.println(phim2);
        }
    }

    public void xoaPhim() {
        hienThiPhim();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id tên phim cần xoá: ");
        int idPhim1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < danhSachPhim.size(); i++) {
            if (idPhim1 == danhSachPhim.get(i).idPhim) {
                danhSachPhim.remove(danhSachPhim.get(i));
                System.out.println("Xoá phim thành công!");
                vietTenPhim(danhSachPhim, PHIM_PATH, false);
            } else {
                System.out.println("Không trùng Id tên phim! xoá thất bại");
            }
        }
    }
}
