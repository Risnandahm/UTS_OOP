/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _18090092;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DimasShofaGunarso
 */
public class Mahasiswa {
    
    public void printMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Data Mahasiswa");
        System.out.println("------------------------------------");
        System.out.println("1. Tambah Data Mahasiswa" + "\n2. Ubah Data Mahasiswa" 
                + "\n3. Hapus Data Mahasiswa" + "\n4. Lihat Data Mahasiswa" + "\n5. Exit");
        System.out.print("Pilihan: ");
    }

    public void hapusData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Urutan data yang dihapus: ");
        int idx = Integer.parseInt(scan.nextLine());
        // proses hapus data
        Operasi.removeData(idx - 1);
    }

    public void ubahData() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang diubah: ");
        int idx = Integer.parseInt(scan.nextLine());
        System.out.println("--------------------------");
        System.out.print("nama       : ");
        String nama = scan.nextLine();
        System.out.print("nim      : ");
        String nim = scan.nextLine();
        System.out.print("kelas     : ");
        String kelas = scan.nextLine();
        System.out.print("dosen pembimbing    : ");
        String dospem = scan.nextLine();
        // proses ubah data
        Operasi.editData(new Data(nama, nim ,kelas, dospem), idx - 1);
    }

    public void listData() {
        List<Data> result = Operasi.getListData();
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i + 1));
            System.out.println("  nama       : " + result.get(i).getnama());
            System.out.println("  n im      : " + result.get(i).getnim());
            System.out.println("  kelas     : " + result.get(i).getkelas());
            System.out.println("  dosen pembimbing    : " + result.get(i).getdospem());
        }
    }

    public void addData() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("NIM : ");
        String nim = scan.nextLine();
        System.out.print("kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Dosen pembimbing : ");
        String dospem = scan.nextLine();
        
        // proses tambah data
        Operasi.addData(new Data(nama, nim, kelas, dospem));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mahasiswa app = new Mahasiswa();
        while (true) {
            app.printMenu();
            int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Formulir Tambah Data");
                    System.out.println("---------------------");
                    app.addData();
                    break;
                case 2:
                    System.out.println("-------------------");
                    System.out.println("Daftar Data");
                    app.listData();
                    System.out.println("Formulir Ubah Data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("-------------------");
                    System.out.println("Daftar Data");
                    app.listData();
                    System.out.println("Formulir Hapus Data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("-------------------");
                    System.out.println("Daftar Data");
                    app.listData();
                    break;
                case 5:
                    System.out.println("-------------------");
                    System.out.println("\nApakah anda yakin akan keluar dari form? ?");
                    System.out.println("1.Ya \t2.Tidak");
                    char persetuju = scan.next().charAt(0);
                    if (persetuju == '1') {
                        app.printMenu();
                        
                    } else if (persetuju == '2') {
                        System.out.println("thank you for coming.");
                        System.exit(0);
                    }
            }
        }
    }
}
