class Tabungan {
    
    private String nama;
    private double saldo;
    public Tabungan(String nama, double saldoAwal) {
        this.nama = nama;          
        this.saldo = saldoAwal;
    }

   
    public void setor(double jumlah) {
        this.saldo += jumlah;
        System.out.println("Setor berhasil: " + jumlah);
    }

    
    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            this.saldo -= jumlah;
            System.out.println("Tarik berhasil: " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }

    
    public void tampilkanSaldo() {
        System.out.println("Nama Nasabah: " + this.nama);
        System.out.println("Saldo: " + this.saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Tabungan t1 = new Tabungan("Kaye", 100000);

        t1.tampilkanSaldo();
        t1.setor(50000);
        t1.tarik(30000);
        t1.tampilkanSaldo();
    }
}
