/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _18090092;

/**
 *
 * @author Asus
 */
public class Data {
    private String nama;
    private String nim;
    private String kelas;
    private String dospem;

    public Data() {
        nama = "";
        nim = "";
        kelas = "";
        dospem = "";
    }

    public Data(String nama, String nim, String kelas, String dospem) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.dospem = dospem;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    public void setdospem(String dospem) {
        this.dospem = dospem;
    }

    public String getnama() {
        return nama;
    }

    public String getnim() {
        return nim;
    }

    public String getkelas() {
        return kelas;
    }

    public String getdospem() {
        return dospem;
    }
}
