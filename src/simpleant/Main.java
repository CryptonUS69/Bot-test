package simpleant;
public class Main { 
    public void namaMhs(String nama) {
        System.out.println("Penilaian Mahasiswa");
        System.out.println("===============================================");
        System.out.println("Nama Mahasiswa  : " + nama);
    }

    public void nilai(int uas, int uts, int tugas) {
    	//variable
    	float Ruas;
    	float Ruts;
    	float Rtugas;
    	float rata;
    	
    	Ruas = uas*40/100;
    	Ruts = uts*30/100;
    	Rtugas = tugas*30/100;
    	rata = Ruas+Ruts+Rtugas;
    	
    	//output
        System.out.println("Nilai Tugas	: " + tugas);
        System.out.println("Nilai UTS	: " + uts);
        System.out.println("Nilai UAS	: " + uas);
        System.out.println("Nilai Average   : " + rata);
        if (rata >= 80 ) {
        	System.out.println("Nilai Huruf  	: A");
      		System.out.println("Nb: 'Pertahankan!'");
    	}
    	else if (rata >= 60 ) {
    		System.out.println("Nilai Huruf  	: B");
      		System.out.println("Nb: 'Harus lebih baik lagi'");
    	}
    	else if (rata >= 40 ) {
    		System.out.println("Nilai Huruf  	: C");
      		System.out.println("Nb: 'Perbanyak belajar'");
    	}
    	else if (rata >= 20 ) {
    		System.out.println("Nilai Huruf  	: D");
      		System.out.println("Nb: 'Jangan keseringan main'");
    	}
    	else {
      		System.out.println("Maaf, format nilai tidak sesuai");
    		}
    	System.out.println("===============================================");
        
    }
}
