package com.example.moviedle2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Movie {

    static String filePath = "imdb_top_250.csv";

    public static void main(String[] args) {

        /*
        // findMovie() METOT TEST KISMI
        String movieName = "Sunset Blvd.";
        String[] rowValue = findMovie(filePath, movieName);

        for (int j = 0; j < rowValue.length - 1; j++) {
            String item = rowValue[j];
            System.out.print(item + " ");
        }
        */

        ///////////////----------------------------------------------------------------------------------------------------------------------------------------/////////////////////

        /*
        // Random Movie üretme metotunun işlevini yerine getirme testi
        String[] randomMovie = getRandomMovie(filePath);
        int j;
        String item ="";
        for (j = 0; j < randomMovie.length - 1; j++) {  // Ürettiği random sayıyı görebilmek adına filmlerin NO bilgisini de yazdırdım.
            item = randomMovie[j];
            System.out.print(item + " ");
        }
        */

        ///////////////----------------------------------------------------------------------------------------------------------------------------------------/////////////////////

        /*
        ArrayList<String[]> Movies = getMovieList(filePath);
        // OKUMA İŞLEMİNİN GERÇEKLEŞİP GERÇEKLEŞMEDİĞİNİ TEST ETMEK İÇİN YAZILMIŞTIR.
        //ARRAYLİST İÇİNDEKİ STRİNG DİZİLER İÇİNDEKİ ELEMANLARA ULAŞIP YAZDIRMA İŞLEMİ
        //ASLINDA 2 BOYUTLU BİR MATRİS TASARIMI SÖZ KONUSU, SATIRLAR BİRER SİTRİNG DİZİ SÜTUNLAR İSE STRİNG DİZİLERİN ELEMANLARINI TEMSİL EDİYOR.
        for (int i = 1; i < Movies.size(); i++) {   // Döngüdeki i değerinin 1'den başlama nedeni kaynak dosya içindeki başlık kısmından kurtulmak için.
            String[] Movie = Movies.get(i);
            for (int j = 0; j < Movie.length - 1; j++) {   // Döngüdeki j değerinin (data.lenght -1) ile kısıtlanma sebebi kaynak dosya içindeki link kısmından kurtulmak için.
                String item = Movie[j];
                System.out.print(item + " ");   // Okunurluğu arttırması için yazıldı.
            }
            System.out.println();

        }
        */

    } //------->>>>MAİN METOT KAPANIŞI

    /*
    // SCANNAR SINIFI İLE OKUMA YAPMAK İSTENİLİRSE
    public static ArrayList<String[]> getMovieList(String filePath) {

        ArrayList<String[]> Movielist = new ArrayList<>();

        try {
            InputStream inputStream = Movie.class.getClassLoader().getResourceAsStream(filePath);
            Scanner scanner = new Scanner(inputStream, StandardCharsets.ISO_8859_1);

            while ( scanner.hasNextLine() ) {       // Bir sonraki satır boş olmadığı müddetçe devam et.
                String line = scanner.nextLine();   // Satır okuma işlemini gerçekleştir.
                String[] subString = line.split(";");    //Verilen regex ifadeye göre parçalama işlemini yapıp String diziye ata.
                Movielist.add(subString);
            }
            scanner.close();

        }  catch (Exception exc) {
            exc.printStackTrace();
        }

        return Movielist;
    }
    */


    public static ArrayList<String[]> getMovieList(String filePath) {

        ArrayList<String[]> movieList = new ArrayList<>();   // String diziler tutan Arraylist tanımlanması

        try {
            InputStream inputStream = Movie.class.getClassLoader().getResourceAsStream(filePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.ISO_8859_1)); // StandartCharsets.ISO_8859_1 yazarak dosyamızdaki farklı karakterleri rahatlıkla okuyabileceğiz.

            String line;

            while ( ( line = reader.readLine() ) != null ) {    // Bir sonraki satır boş olmadığı sürece devam et. Ayrıca satır satır okuma işlemi gerçekleştiriyor.
                String[] movie = line.split(";");    // Verilen regex ifadeye göre parçalama işlemini yapıp String dizilere ata.

                movieList.add(movie);    // Oluşturduğumuz yeni ArrayList'e movie adlı dizileri ekliyoruz.
            }

        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        return movieList;    // Veri okuma ve işleme adımları sonrası oluşturulan movieList adlı içinde String diziler tutan ArrayList'i dönderiyoruz.
    }


    public static String[] getRandomMovie(String filePath) {

        ArrayList<String[]> movie = getMovieList(filePath);     // Dosyadan okunmuş ArrayList<String> tipteki List'imizi movie değişkeninde tutuyoruz.

        // [1-250](0 satırında title'lar var, alınmamalı, 0 dahil olmayacak) arasında üretilmiş i değeri sayesinde rastgele bir String dizisi elde etmiş olacağız.
        Random random = new Random();
        int i = random.nextInt(250) + 1;
        String[] rowValue = movie.get(i);

        return rowValue;    // Elde ettiğimiz bu rastgele üretilen String dizisini dönderiyoruz.
    }


    public static String[] findMovie(String filePath, String movieName) {

        ArrayList<String[]> movieList = Movie.getMovieList(filePath);    // String diziler tutan liste tanımlanması

        for (String[] movie : movieList) {
            if (movie.length > 0 && movie[1].equalsIgnoreCase(movieName)) {     //Dizinin 1. indexi film isimlerini tutuyor. 0. index No değerlerini tutuyor.
                return movie;
            }
        }


        String[] errorMessage = {"Movie Not Found"};  // Bu kısmı okunabilirlik açısından bu şekilde yazdım.
        return errorMessage;    // Verimizin içinde bulunmayan bir film ismi girdiğinde RunTimeException ile karşılaşılacak ama RUN işlemi devam edecek.
    }

}//SINIF KAPANIŞ
