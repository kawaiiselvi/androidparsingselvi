package pulau.com.crudselvi;

/**
 * Created by Administrator on 11/30/2017.
 */

public class konfigurasi {
    public static final String URL_ADD="http://192.168.1.9/Android/selvi/tambahsiswa.php";
    public static final String URL_GET_ALL = "http://192.168.1.9/Android/selvi/tampilSemuaSiswa.php";
    public static final String URL_GET_EMP = "http://192.168.1.9/Android/selvi/tampilSiswa.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.1.9/Android/selvi/updateSiswa.php";
    public static final String URL_DELETE_EMP = "http://192.168.1.9/Android/selvi/hapusSiswa.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_KELAS = "class"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_NOHP = "number"; //salary itu variabel untuk gajih
    public static final String KEY_EMP_ALAMAT = "address";
    public static final String KEY_EMP_CITACITA = "ambition";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_KELAS = "class";
    public static final String TAG_NOHP = "number";
    public static final String TAG_ALAMAT = "address";
    public static final String TAG_CITA = "ambition";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
