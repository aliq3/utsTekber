package com.example.utstekber;

public class Buku {
    private String judul, sinopsis, publish, author;
    private int cover, back;

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }

    public Buku(int cover, int back, String judul, String sinopsis, String publish, String author) {
        this.cover = cover;
        this.back = back;
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.publish = publish;
        this.author = author;

    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
