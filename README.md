**Project Description**
Proyek ini merupakan API Automation Testing Framework yang dibangun menggunakan Java, Gradle, TestNG, dan Rest Assured.
Framework ini bertujuan untuk melakukan pengujian otomatis API pada Reqres API sebagai studi kasus, dengan struktur yang terorganisir dan mengikuti best practice automation testing.

Framework ini mendukung:

Positive Test

Negative Test

Boundary / Edge Case Test

Pemisahan antara logic request dan test case


**Tools**

Java (minimal Java 8)

Gradle (Build Automation Tool)

TestNG (Testing Framework)

Rest Assured (API Testing Library)

Reqres API (Dummy REST API)


**Dependency**

Rest Assured → untuk HTTP request & response validation

TestNG → sebagai test runner

Gson & JSON Schema Validator → pendukung pengolahan data JSON

Gradle dikonfigurasi agar menjalankan TestNG XML sebagai test suite.


**Best Test**
Setting Base URL untuk menjalankan semua tes (menggunakan base URL yang sama) yaitu di https://reqres.in/api


**Request Layer**
Logic pemanggilan API dipisahkan ke dalam class UserRequest supaya kode lebih rapi, mudah digunakan ulang, test fokus ke **validasi**, bukan **request**

Request yang tersedia:

1. Get user by ID

2. Create user


**Utility**

TestDataUtil digunakan untuk menyimpan data uji, seperti:

Data valid

Data kosong

Data yang sering digunakan

Tujuannya agar test case lebih bersih dan mudah dibaca.


**Test Case**
1. Positive Test :

Mengambil user dengan ID valid

Membuat user dengan data valid

2. Negative Test :

Mengambil user dengan ID tidak valid

Membuat user dengan data kosong (validasi logic)

3. Boundary Test :

Pengujian dengan nilai batas, seperti ID = 0


**Test Runner (TestNG XML)**

Seluruh test dijalankan melalui file testng.xml, yang berfungsi sebagai test suite runner untuk Gradle maupun IDE.


**Test Report Access**
build/reports/tests/test/index.html

