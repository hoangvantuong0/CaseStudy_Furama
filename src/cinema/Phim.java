package cinema;

public class Phim {
    int idPhim;
    String maSuatChieu;
    String tenPhim;
    String ngayChieu;
    int soLuongVe;

    public Phim(String s, String s1, String s2, int i) {
    }

    public Phim(int idPhim, String maSuatChieu, String tenPhim, String ngayChieu, int soLuongVe) {
        this.idPhim = idPhim;
        this.maSuatChieu = maSuatChieu;
        this.tenPhim = tenPhim;
        this.ngayChieu = ngayChieu;
        this.soLuongVe = soLuongVe;
    }

    @Override
    public String toString() {
        return "Phim{" +
                "idPhim=" + idPhim +
                ", maSuatChieu='" + maSuatChieu + '\'' +
                ", tenPhim='" + tenPhim + '\'' +
                ", ngayChieu='" + ngayChieu + '\'' +
                ", soLuongVe=" + soLuongVe +
                '}';
    }

    public String thongTinPhim(){
        return this.idPhim +","+ this.maSuatChieu + "," + this.tenPhim + "," + this.ngayChieu +"," +this.soLuongVe;
    }
}
