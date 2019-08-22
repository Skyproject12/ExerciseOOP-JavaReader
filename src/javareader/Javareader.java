package javareader;
import java.io.*;
public class Javareader {
    public static void main(String[] args) throws IOException {
        System.out.println("Masukkan isi file ");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String isi= br.readLine();
        File FAwal = new File ("fawal.txt");
        File FAkhir= new File("Fakhir.txt");
        
        FileOutputStream fos= new FileOutputStream(FAwal);
        DataOutputStream dos= new DataOutputStream(fos);
        dos.writeBytes(isi);
        
        FileInputStream fis = new FileInputStream(FAwal);
        DataInputStream dis = new DataInputStream(fis);
        String isiFAwal= dis.readLine();
        System.out.println("isi file awal"+isiFAwal);
        
        FileOutputStream foe2= new FileOutputStream (FAkhir);
        DataOutputStream dos2= new DataOutputStream(foe2);
        dos2.writeBytes(isiFAwal);
        System.out.println("isi file akhir"+isiFAwal);
    }
    
}
