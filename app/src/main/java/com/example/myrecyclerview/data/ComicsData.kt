package com.example.myrecyclerview.data

import com.example.myrecyclerview.data.model.Comic
import com.example.myrecyclerview.R

object ComicsData {
    private val comicTitles = arrayOf(
        "Attack on Titan",
        "Demon Slayer",
        "Gintama",
        "Kakegurui",
        "My Hero Academia",
        "One Piece",
        "One Punch Man",
        "Tensei Shittara Slime",
        "Tokyo Ghoul",
        "Tokyo Revenger"
    )
    private val comicInfos = arrayOf(
        "24 Episode | Fantasy",
        "48 Episode | Action",
        "252 Episode | Parody" ,
        "24 Episode | Shounen",
        "48 Episode | Action",
        "1007 Episode | Adventure",
        "24 Episode | Action",
        "24 Episode | Supranatural",
        "24 Episode | Action",
        "24 Episode | Action"
    )
    private val comicDetails = arrayOf(
        "Shingeki no Kyojin (bahasa Jepang: 進撃の巨人, terj. har. \"Raksasa [yang] Menyerang\"), yang diterbitkan di Indonesia dengan judul Attack on Titan, adalah sebuah seri manga shōnen asal Jepang yang ditulis dan diilustrasikan oleh Hajime Isayama. Ceritanya berlatar di dunia tempat umat manusia hidup di wilayah yang dikelilingi tiga lapis tembok besar, yang melindungi mereka dari makhluk pemakan manusia berukuran raksasa yang dikenal sebagai Titan. Manga ini dimuat berseri dalam majalah Bessatsu Shōnen Magazine terbitan Kodansha sejak bulan September 2009 hingga April 2021, dan telah diterbitkan menjadi 34 volume tankōbon per bulan Desember 2020.",
        "Kimetsu no Yaiba (bahasa Jepang: 鬼滅の刃, terj. har. \"Pedang Penghancur Iblis\"[4]), yang diterbitkan di Indonesia dengan judul Demon Slayer: Kimetsu no Yaiba, adalah sebuah seri manga Jepang yang ditulis dan diilustrasikan oleh Koyoharu Gotōge. Ceritanya mengisahkan tentang Tanjiro Kamado, seorang anak laki-laki yang menjadi pembasmi iblis setelah keluarganya dibunuh dan adik perempuannya yang bernama Nezuko diubah menjadi iblis.",
        "Gin Tama (銀魂, \"Jiwa Perak\"), juga dikenal sebagai Gintama, adalah manga Jepang yang ditulis dan diilustrasikan oleh Hideaki Sorachi. Bersetting di Edo yang telah ditaklukkan oleh alien bernama Amanto, cerita mengikuti kehidupan dari sudut pandang samurai Gintoki Sakata, yang bekerja sebagai freelancer bersama teman-temannya Shinpachi Shimura dan Kagura untuk membayar sewa bulanan.",
        "Kakegurui – Compulsive Gambler (bahasa Jepang: 賭ケグルイ Hepburn: Kakegurui) adalah sebuah seri manga Jepang yang ditulis oleh Homura Kawamoto dan diilustrasikan oleh Tōru Naomura. Manga tersebut diserialisasikan dalam Gangan Joker pada Maret 2014. Sebuah manga prekuel sempalan, Kakegurui Twin, mulai diserialisasikan dalam Gangan Joker pada September 2015.",
        "Boku no Hero Academia (bahasa Jepang: 僕のヒーローアカデミア Hepburn: Boku no Hīrō Akademia), yang diterbitkan di Indonesia dengan judul My Hero Academia, adalah sebuah seri manga shōnen Jepang bertema pahlawan super yang ditulis dan diilustrasikan oleh Kōhei Horikoshi. Manga ini mulai dimuat dalam majalah Weekly Shōnen Jump sejak bulan Juli 2014, dan telah dibundel menjadi 30 volume tankōbon hingga bulan April 2021. Ceritanya mengisahkan tentang Izuku Midoriya, seorang anak lelaki tanpa kekuatan super (yang disebut quirk) di dunia tempat hal seperti itu sudah menjadi sesuatu yang umum, tetapi masih bercita-cita untuk menjadi seorang pahlawan.",
        "One Piece (bahasa Jepang: ワンピース Hepburn: Wan Pīsu) adalah sebuah seri manga Jepang yang ditulis dan diilustrasikan oleh Eiichiro Oda. Manga ini telah dimuat di majalah Weekly Shōnen Jump milik Shueisha sejak tanggal 22 Juli 1997, dan telah dibundel menjadi 91 volume tankōbon. Ceritanya mengisahkan petualangan Monkey D. Luffy, seorang anak laki-laki yang memiliki kemampuan tubuh elastis seperti karet setelah memakan Buah Iblis secara tidak disengaja. Dengan kru bajak lautnya, yang dinamakan Bajak Laut Topi Jerami, Luffy menjelajahi Grand Line untuk mencari harta karun terbesar di dunia yang dikenal sebagai \"One Piece\" dalam rangka untuk menjadi Raja Bajak Laut yang berikutnya.",
        "One-Punch Man ( ワンパンマン Wanpanman) adalah sebuah serial manga Jepang yang menceritakan seorang superhero yang bernama Saitama. One-Punch Man dibuat oleh seorang penulis yang asal jepang dengan nama samaran ONE[1] yang mulai diterbitkan pada awal tahun 2009.[2] Serial ini segera menjadi viral sehingga mampu melampaui 7,9 juta hits pada bulan Juni 2012.[3] One-Punch Man merupakan kontraksi wanpanchi (\"One-Punch\") yang artinya satu pukulan",
        "That Time I Got Reincarnated as a Slime (bahasa Jepang: 転生したらスライムだった件 Hepburn: Tensei Shitara Suraimu Datta Ken), juga dikenal sebagai TenSura (bahasa Jepang: 転スラ Hepburn: Tensura)[4] atau Slime Isekai,[4] yang diterbitkan di Indonesia dengan judul Regarding Reincarnated to Slime oleh Elex Media Komputindo,[5] adalah sebuah seri novel ringan Jepang bergenre fantasi yang ditulis oleh Fuse dan diilustrasikan oleh Mitz Vah. Novel ini mulai diserialisasikan secara daring antara tahun 2013 dan 2016 di situs web penerbit novel buatan pengguna, Shōsetsuka ni Narō. Hak atas seri ini kemudian menjadi milik Micro Magazine, yang menerbitkan seri novel ringan volume pertama pada tahun 2014. ",
        "Tokyo Ghoul (bahasa Jepang: 東京喰種トーキョーグール Hepburn: Tōkyō Gūru) adalah sebuah seri manga seinen Jepang bergenre fantasi gelap yang ditulis dan diilustrasikan oleh Sui Ishida. Manga ini mulai dimuat dalam majalah Weekly Young Jump terbitan Shueisha sejak bulan September 2011 hingga September 2014, dan telah dibundel menjadi empat belas volume tankōbon hingga bulan Agustus 2014. Sebuah sekuel yang berjudul Tokyo Ghoul:re mulai dimuat di majalah yang sama antara bulan Oktober 2014 hingga Juli 2018, dan kemudian dibundel menjadi enam belas volume tankōbon. Sebuah cerita prekuel bertajuk Tokyo Ghoul [Jack] dirilis secara daring di Jump Live.",
        "Tokyo Revengers (bahasa Jepang: 東京卍リベンジャーズ Hepburn: Tōkyō Manji Ribenjāzu) adalah sebuah seri manga shōnen Jepang yang ditulis dan diilustrasikan oleh Ken Wakui. Manga ini dimuat berseri dalam majalah Weekly Shōnen Magazine terbitan Kodansha sejak bulan Maret 2017, dan telah dibundel menjadi tujuh belas volume tankōbon."
    )

    private val comicImages = intArrayOf(
        R.drawable.aot,
        R.drawable.demon_slayer,
        R.drawable.gintama,
        R.drawable.kakegurui,
        R.drawable.myheroacademia,
        R.drawable.one_piece,
        R.drawable.opm,
        R.drawable.tensura,
        R.drawable.tokyo_ghoul,
        R.drawable.tokyo_rev
    )

    val listData: ArrayList<Comic>
        get() {
            val list = arrayListOf<Comic>()
            for (position in comicTitles.indices) {
                val comic = Comic(
                    title = comicTitles[position],
                    info = comicInfos[position],
                    detail = comicDetails[position],
                    photo = comicImages[position]
                )
                list.add(comic)
            }
            return list
        }
}