package IO;

import Model.SinhVien;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite<E> {
//    public void write(ArrayList<E> list, String path) {
//        File file = new File(path);
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(list);
//            objectOutputStream.close();
//            fileOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public ArrayList<E> read(String path){
//        File file = new File(path);
//        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            return (ArrayList<E>) objectInputStream.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            System.err.println("Lỗi!");
//        }
//        return new ArrayList<>();
//    }
static File file = new File("D:\\IntelliJ IDEA Community Edition 2022.2.1\\projects\\ThiModule2\\src\\File\\sinhviens.csv");

    public static void write (ArrayList<SinhVien> ListSinhVien) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SinhVien sinhVien : ListSinhVien ) {
                bufferedWriter.write(sinhVien.getmSV()+ "," + sinhVien.getHoTen() + "," + sinhVien.getTuoi()+ ","+ sinhVien.getGioiTinh()+ "," + sinhVien.getDiaChi() + "," + sinhVien.getdTB());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static ArrayList<SinhVien> read (){
        ArrayList<SinhVien> ListSinhVien =new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = bufferedReader.readLine();
            while (str != null) {
                String[] arr = str.split(",");
                String mSV = arr[0];
                String hoTen = arr[1];
                int tuoi = Integer.parseInt(arr[2]);
                String gioiTinh = arr[3];
                String diaChi = arr[4];
                double dTB = Double.parseDouble(arr[5]);
                SinhVien student = new SinhVien(mSV, hoTen, tuoi, gioiTinh, diaChi,dTB);
                ListSinhVien.add(student);
                str = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListSinhVien;
    }


}

