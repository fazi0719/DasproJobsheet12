PERCOBAAN 1
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
Jawab: Tidak, fungsi tanpa parameter tidak harus bertipe void. Void wajib digunakan saat tanpa returnn value nilai data kembalian(sebuah fungsi tidak mengembalikan nilai)

2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
Jawab: Ya,daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu(). Contoh modifikasinya cukup ganti bagian fungsi Menu() dengan public static void main(String[] args) {

3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
Jawab:  1. Keterbacaan yang Lebih Baik (mudah dibaca daripada blok perintah printf())
        2. Dapat dipanggil berulang kali
        3. Pemeliharaan dan Debugging yang Lebih Mudah. Jika ingin memutuskan untuk mengubah tata letak menu (misalnya, menambahkan opsi baru atau mengubah teks), cukup melakukan perubahan di satu tempat saja

4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar)
Jawab:  1. Java mulai eksekusi dengan mencari dan mengeksekusi fungsi utama: public static void main (String[] args).
        2. Ketika eksekusi sampai pada baris Menu(); di dalam main, program akan menghentikan sementara eksekusi fungsi main.
        3. Kontrol program berpindah ke fungsi Menu().
        4.Semua baris kode di dalam fungsi Menu() dieksekusi secara berurutan, yaitu semua perintah System.out.println yang menampilkan daftar menu ke layar.
        5. Setelah baris terakhir di fungsi Menu() selesai dieksekusi, kontrol program kembali ke fungsi main(), tepat di baris setelah pemanggilan Menu();.
        6. Karena tidak ada baris kode lain di main setelah Menu();, eksekusi program berakhir.


PERCOBAAN 2
1. Apakah kegunaan parameter di dalam fungsi?
Jawab: Tempat penyimpanan sementara yang bertugas menerima informasi (data) dari luar fungsi saat fungsi tersebut dipanggil

2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
Jawab:  namaPelanggan: Untuk mengirim nama tamu agar program bisa menyapa
        isMember: Untuk mengirim informasi status member (T/F). Program akan otomatis menampilkan pesan diskon jika statusnya true

3. Apakah parameter sama dengan variabel? Jelaskan.
Jawab:  Parameter: Dibuat dan ditulis di depan pintu fungsi (di dalam tanda kurung ()), bertugas menyambut data yang datang.
        Contoh: Menu(String a, boolean b)
        Variabel: Dibuat dan digunakan di dalam ruangan (di dalam badan {}) fungsi, bertugas menyimpan data selama fungsi bekerja.
        Contoh: int totalHarga = 0;

4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
Jawab: Cara kerja: Parameter isMember bekerja sebagai input kondisi yang menerima nilai true atau false. Nilai ini kemudian diuji oleh struktur kontrol if (isMember),maka jika bernilai true akan menampilkan pesan diskon 10%, sedangakan jika bernilai false maka tidak akan menampilkan pesan diskon.

5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
Jawab: Akan terjadi error karena fungsi Menu telah didefinisikan untuk menerima 2 argumen (String dan Boolean).

6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.

7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.
Jawab: Ya, penggunaan parameter (namaPelanggan dan isMember) membuat program jauh lebih mudah dibaca dan dikembangkan daripada menuliskannya langsung di dalam fungsi, karena parameter menjaga fleksibilitas (mudah diubah): Parameter membuat fungsi Menu() menjadi seperti cetakan kosong yang bisa diisi data apa pun dan keterbacaan kode (lebih rapi): Dengan parameter, fungsi utama (main) menjadi ringkas. Akan langsung tahu siapa yang dilayani dan statusnya hanya dengan membaca baris panggilannya, sementara fungsi Menu() tetap fokus pada tugas utamanya: menampilkan daftar menu.

PERCOBAAN 3
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
Jawab:  -Fungsi membutuhkan nilai kembalian (return value) saat tujuannya adalah untuk menghitung atau memproses sesuatu dan memberikan
        hasilnya kembali ke bagian program yang memanggilnya untuk digunakan lebih lanjut. 
        Contoh: public static int hitungTotalHarga (int pilihanMenu, int banyakItem ) {
                int [] hargaItems = {15000, 20000, 22000,12000, 10000, 18000};
                int hargaTotal = hargaItems[pilihanMenu-1]*banyakItem;
                return hargaTotal;
                }
        -Fungsi tidak perlu mengembalikan nilai jika tujuannya hanya untuk melakukan tindakan atau "prosedur" tanpa perlu menghasilkan nilai, seperti mencetak teks ke layar, mengubah state sebuah objek
        Contoh: public static void Menu (String namaPelanggan, boolean isMember, String kodePromo) {
                System.out.println(" Selamat datang " + namaPelanggan + "!");

2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
Jawab: Tipe Data Nilai Kembalian:
        - int: Fungsi ini mengembalikan nilai berupa angka bulat, yaitu Total Harga pesanan.
        - Parameter 1 : Int pilihanMenu : Angka yang mewakili menu yang dipilih pelanggan (misalnya, 1 untuk Kopi Hitam dan 3 untuk Latte). Nilai ini digunakan untuk mencari harga satuan item yang dipesan dari array harga.
        - Parameter 2 : Int banyakItem : Jumlah porsi atau kuantitas menu yang dipesan oleh pelanggan. Digunakan sebagai pengali harga item tunggal untuk mendapatkan total harga (Harga x Porsi).


PERCOBAAN 4
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...namaPengunjung!
Jawab:Penulisan String... namaPengunjung adalah sintaks Java untuk Varargs (Variable Arguments).Tujuan utama penggunaan varargs adalah untuk menghindari kebutuhan membuat array secara manual setiap kali Anda memanggil suatu metode. Lebih mudah digunakan ketika jumlah input string tidak pasti atau bervariasi.

3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
Jawab: Tidak,karena jika memiliki dua Varargs (String... dan int...), Java tidak akan bisa menentukan dengan pasti argumen mana yang termasuk Varargs pertama dan argumen mana yang termasuk Varargs kedua saat fungsi dipanggil. Ini akan menyebabkan program error.
Contoh: 1. program yang benar = public static void detailPengunjung (int nomorMeja, String... namaPengunjung) { } // Benar: int         (parameter biasa) diikuti Varargs di akhir.
        2. program yang salah= public static void detailPengunjung (String... nama, int... usia) {  } 
        
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?
Jawab: Jika fungsi daftarPengunjung dipanggil tanpa argumen (misalnya: daftarPengunjung();), program akan tetap berjalan dan tidak akan terjadi error saat dijalankan.
output ---> Daftar Nama Pengunjung:

PERCOBAAN 5
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
Jawab:  1. Program dijalankan = mengeksekusi fungsi main() terlebih dahulu.
        2. Program membuat objek Scanner untuk menerima input dari keyboard.
        2. Program menampilkan pesan “Masukkan panjang:” 
        3. Program menampilkan pesan “Masukkan lebar:” 
        4. Program menampilkan pesan “Masukkan tinggi:"
        5. Program memanggil fungsi hitungLuas(p, l) → rumus p * l dihitung → hasil dikembalikan ke main.
        6. Program memanggil fungsi hitungVolume(t, p, l) → fungsi ini memanggil hitungLuas() → lalu mengalikan hasil luas dengan tinggi.
        7. Hasil dari kedua fungsi tersebut dikembalikan ke main().
        8. main() menampilkan:
        • luas persegi panjang
        • volume balok
        9. Program selesai.

2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
jawab: Proses perhitungan
        - Luas = 4 × 3 = 12
        - Volume = (4 × 3) × 5 = 12 × 5 = 60
       Output program
        - Luas persegi panjang: 12
        - Volume balok adalah: 60
        Program menerima input panjang, lebar, dan tinggi kemudian memanggil fungsi hitungLuas() untuk menghitung luas setelah menghitung luas akan menampilkan luas kemudian memanggil hitungVolume() untuk menghitung volume dengan memanggil hitungLuas() di dalamnya setelah mengitung volume akan menampilkan volume.

3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
Jawab: Alur Program :
        - Program mulai dari main().
        - temp = Jumlah(1,1) 
        - Hitung Jumlah(1, 1) → hasil 2
	- Panggil TampilJumlah(2, 5)
	- Dalam TampilJumlah → hitung Jumlah(2, 5) → hasil 7
	- Panggil TampilHinggaKei(7)
	- Cetak angka 1 sampai 7
       Output = 1234567

4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
Jawab:  - fungsi harus menggunakan parameter saat:
          1. Fungsi membutuhkan data untuk diolah. Contohnya, fungsi untuk menghitung luas persegi panjang membutuhkan nilai panjang dan lebar sebagai parameter.
          2. Fungsi perlu bersifat dinamis dan dapat digunakan kembali dengan masukan yang berbeda-beda.
          3. Fungsi didefinisikan dengan variabel yang nilainya akan diisi saat fungsi dipanggil (argumen).
        - Fungsi Tidak perlu parameter saat:
          1. Fungsi hanya menjalankan tugas tertentu tanpa memproses data eksternal.
          2. Semua data yang dibutuhkan sudah tersedia dalam cakupan fungsi itu sendiri. 
     Kapan memiliki nilai kembalian (return value)
        - Gunakan nilai kembalian saat:
          - Hasil pemrosesan di dalam fungsi akan digunakan kembali di tempat lain dalam program.
          - Anda perlu menyimpan hasil dari fungsi ke dalam variabel lain.
          - Fungsi tersebut memiliki tujuan untuk menghitung atau menghasilkan suatu nilai.
     Tidak perlu nilai kembalian (void function) saat:
         - Tujuan utama fungsi adalah untuk melakukan sebuah aksi atau efek samping, seperti mencetak pesan ke layar.
         - Hasil dari fungsi tidak akan digunakan oleh bagian kode lain. 

5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.
Jawab: Pakai parameter 
        - hitungLuas(p, l), karena perlu nilai panjang & lebar
        - hitungVolume(t, p, l), karena menghitung berdasarkan tinggi, panjang, dan lebar
       Tidak pakai parameter 
        - main, karena tidak bertugas menghitung, hanya menjalankan alur program dan memanggil fungsi lain
        - Jika fungsi hanya menampilkan teks
        - Membersihkan layer
        - Menampilkan menu
        - Reset data tertentu

6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.
Jawab: Menggunakan return       
        - hitungLuas karena hasil perhitungan perlu dipakai di main
        - hitungVolume karena hasil volume perlu ditampilkan
        - Fungsi perhitungan harus return
       Tidak menggunakan return
        - main karena main tidak mengembalikan nilai, hanya menjalankan program
        - Dipakai ketika fungsi hanya melakukan tindakan, misalnya menampilkan teks atau proses lain yang tidak perlu mengembalikan nilai.