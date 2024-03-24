package com.ndelifa.recycleview;

public class Mahasiswa {
        private String nama;
        private String nim;
        private int gambarResource;

        public Mahasiswa(String nama, String nim, int gambarResource) {
            this.nama = nama;
            this.nim = nim;
            this.gambarResource = gambarResource;
        }

        public String getNama() {
            return nama;
        }

        public String getNim() {
            return nim;
        }

        public int getGambarResource() {
            return gambarResource;
        }
    }


