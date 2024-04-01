//Analisa Untuk Duck Tahap 3: Menggunakan Strategy Pattern

Analisa:

- Penerapan Strategy Pattern memungkinkan pemisahan perilaku bersuara dan terbang menjadi objek-objek terpisah.
- Memberikan fleksibilitas tinggi dalam mengubah perilaku bersuara atau terbang dengan mudah pada saat program dijalankan (runtime).
- Memungkinkan penggunaan berbagai macam perilaku bersuara dan terbang tanpa harus mengubah kelas bebek itu sendiri.

Kekurangan:

- Menambahkan kompleksitas tambahan ke dalam kode karena memerlukan lebih banyak kelas dan objek untuk mengelola strategi-strategi perilaku yang berbeda.
- Dapat menjadi terlalu abstrak untuk aplikasi sederhana, sehingga dapat menyulitkan pemahaman bagi pengembang yang kurang berpengalaman.

Dengan kata lain, Strategy Pattern memberikan fleksibilitas tinggi dalam mengelola dan mengubah perilaku secara dinamis pada saat runtime, serta memungkinkan penambahan perilaku baru tanpa perlu mengubah kelas utama. Namun, penerapannya menambah kompleksitas kode dan dapat menjadi terlalu abstrak untuk aplikasi sederhana, terutama bagi pengembang yang kurang berpengalaman.

//Analisa Untuk Tugas Shipping Strategy

Dalam pengembangan kode ini, pola desain Strategy Pattern digunakan untuk mengelola strategi pengiriman barang. Pemilihan pola desain ini karena kebutuhan untuk memungkinkan aplikasi memilih strategi pengiriman yang sesuai tanpa perlu mengubah struktur utama program. Setiap kelas strategi pengiriman seperti RegularShipping, ExpressShipping, DistanceBasedShipping, dan FlatRateShipping, diimplementasikan dengan mengikuti antarmuka ShippingStrategy yang memiliki metode calculateShippingCost untuk menghitung biaya pengiriman berdasarkan berat barang dan jarak pengiriman.

Kelas ShippingCostCalculator juga ditambahkan untuk melakukan perhitungan biaya pengiriman berdasarkan strategi yang dipilih. Program utama, yaitu kelas Main, didesain untuk menerima input dari pengguna berupa berat barang dan jarak pengiriman, kemudian melakukan perhitungan biaya pengiriman menggunakan berbagai strategi yang telah tersedia. Hasilnya ditampilkan dalam format mata uang indonesia untuk kenyamanan pengguna.

Dengan menggunakan pola desain Strategy Pattern, fleksibilitas aplikasi dipastikan dan memudahkan perubahan atau penambahan strategi pengiriman di masa mendatang. Kode juga dijaga agar mudah dipahami dan dikelola dengan mengikuti prinsip-prinsip desain yang baik. Dengan demikian, kode ini diharapkan dapat membantu pengguna dalam mengelola biaya pengiriman barang dengan lebih efisien dan mudah disesuaikan dengan kebutuhan bisnis mereka.