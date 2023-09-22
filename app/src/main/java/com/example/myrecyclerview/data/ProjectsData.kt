package com.example.myrecyclerview.data

import com.example.myrecyclerview.data.model.Project

object ProjectsData {
    val name = arrayOf("Suka Ngaji", "Proxsis Workspace", "Kerjatim")
    private val desc = arrayOf(
        "Suka ngaji merupakan aplikasi untuk membaca surat-surat al-quran dan pengingat waktu shalat",
        "Proxsis workspace merupakan aplikasi monitoring presensi karyawan berbasis cloud",
        "Kerjatim merupakan aplikasi manajemen tugas sederhana yang dibuat menggunakan bahasa Kotlin"
    )
    private val stars = intArrayOf(231, 302, 1020)
    private val issues = intArrayOf(21, 11, 45)
    private val languages = arrayOf("Dart", "Dart", "Kotlin")


    val favoriteProject = arrayListOf(Project(
        id = "1",
        name = name[0],
        description = desc[0],
        stars = stars[0],
        issues = issues[0],
        language = languages[0]
    ))
    val listData: List<Project>
        get() {
            return name.mapIndexed { index, data ->
                Project(
                    id = index.toString(),
                    name = data,
                    description = desc[index],
                    stars = stars[index],
                    issues = issues[index],
                    language = languages[index]
                )
            }
        }
}