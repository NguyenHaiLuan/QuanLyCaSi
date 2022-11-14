package nhl69.luansapp.quanlycasi;

public class CaSi {
    private String ten, nghedanh, quocgia;
    private int hinh, sosao;

    public CaSi(String ten, String nghedanh, String quocgia, int hinh, int sosao) {
        this.ten = ten;
        this.nghedanh = nghedanh;
        this.quocgia = quocgia;
        this.hinh = hinh;
        this.sosao = sosao;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public int getSosao() {
        return sosao;
    }

    public void setSosao(int sosao) {
        this.sosao = sosao;
    }
}
