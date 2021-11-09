package com.baa.boost.CodingMarathon.SchoolApplication.mainClasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baa.boost.CodingMarathon.SchoolApplication.Utils.GltnUtils;
import com.baa.boost.CodingMarathon.SchoolApplication.employers.Officer;
import com.baa.boost.CodingMarathon.SchoolApplication.employers.Servant;
import com.baa.boost.CodingMarathon.SchoolApplication.employers.Teacher;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.ClassName;
import com.baa.boost.CodingMarathon.SchoolApplication.students.Student;

public class SchoolMainSystem {
	
	public static Map<Integer, String> menuItems() {
		
		Map<Integer, String> mapList = new HashMap<Integer, String>();
		
		mapList.put(1, "Yeni calışan");
		mapList.put(2, "calışan Listesi");
		mapList.put(3, "Eski calışanlar");
		mapList.put(4, "Yeni Sınıf");
		mapList.put(5, "Öğrenci Atama");
		mapList.put(6, "Öğrenci Listesi");
		mapList.put(7, "Öğrencinin Sınıfları");
		mapList.put(8, "Hediye Listesi");
		mapList.put(9, "Maaş Listesi");
		mapList.put(10, "Uygulamadan cıkış");
		mapList.put(11, "BONUS - Dosya Verileri Local Dosyaya Yazdırma işlemi");
		return mapList;
		
	}
	
	public static void writeTheFile() { // mevcut bılgılerı file olarak local e kaydetme olusturma
		
		// sozlu anlatım;
		// ooncelıkle kullanıcadan bır fıle yolu ısteyerek dosya olusturuldu.
		// Olusturulan dosyada buffereWriter ile mevcut bilgiler yazdılırdı.
		// Yazdırma ıslemı ıcın olusturulmus Teacher - Student Servent ve Officer
		// in
		// bilgilerinin olduğu array listeler string e
		// donusturuldu.
		
		String path = "";
		try {
			path = GltnUtils.readString(
					"Lütfen dosya oluşturmak istediğiniz yolu (D:\\bilgeAdamDeneme\\folder\\homework.txt) şeklinde belirtiniz");
			File myFile = new File(path);
			
			if (myFile.createNewFile()) {
				System.out.println("Dosya oluşturuldu: " + myFile.getName());
				
			} else {
				System.out.println("Dosya olusturulamadı,zaten mevcut.");
			}
			
		} catch (IOException e) {
			System.out.println("Hata mevcut.");
			e.printStackTrace();
		}
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
			
			bufferedWriter.write((String) ListOfPeople.Officer()); // array List i String e convert etmek gerekli
			bufferedWriter.flush();
			System.out.println("Yazma işlemi başarılı");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void sortOfStudent(List<Student> mapStudentList) {
		
		mapStudentList.forEach(System.out::println);
		
	}
	
	public static void sortOfWorker(List<Teacher> mapTeacherList, List<Officer> mapOfficerList,
			List<Servant> mapServantList) {
		
		mapTeacherList.forEach(System.out::println);
		mapOfficerList.forEach(System.out::println);
		mapServantList.forEach(System.out::println);
		
	}
	
	public static void sortOfOldWorker() {
		
		//
		// List<Object> mapList1 = ListOfPeople.teacher().stream().filter(Teacher ->
		// ).collect(Collectors.toList());
		//
		//
		// workerList.forEach(System.out::println);
	}
	
	private static void filterClassList() {
		
		Student className = null;
		className = ListOfPeople.student().stream().filter(p -> ClassName.CLASS_A.equals(p.getClassNum())).findAny()
				.orElse(null);
		
		System.out.println(className.toString());
	}
	
	public static void action() {
		boolean isloop = true;
		
		do {
			
			switch (GltnUtils.showMenu("OKUL YÖNETİM SİSTEMİ", menuItems())) {
				case 1:
					System.out.println("Yeni çalışan için lütfen yetkili olarak giriş yapınız.");
					break;
				case 2:
					
					System.out.println("calışan Listesi:\n");
					sortOfWorker(ListOfPeople.teacher(), ListOfPeople.Officer(), ListOfPeople.servant());
					break;
				case 3:
					System.out.println("Eski calışanlar:\n");
					break;
				case 4:
					System.out.println("Yeni sınıf için lütfen yetkili olarak giriş yapınız.");
					break;
				case 5:
					System.out.println("Öğrenci Atama için lütfen yetkili giriş yapınız.");
					break;
				case 6:
					System.out.println("Sınıf Listesi:\n");
					sortOfStudent(ListOfPeople.student());
					break;
				case 7:
					System.out.println("Öğrencinin Sınıfları:\n");
					filterClassList();
					break;
				case 8:
					System.out.println("Hediye Listesi:\n");
					break;
				case 9:
					System.out.println("Maaş Listesi:\n");
					break;
				case 10:
					System.out.println("Sistemden çıkılıyor.\nIyı Günler Dileriz.");
					isloop = false;
					break;
				case 11:
					System.out.println("Bonus- Mevcut bilgileri dosyaya yazdırma.");
					
					writeTheFile();
					
					break;
			}
		} while (isloop);
		
	}
	
	public static void main(String[] args) {
		
		// GlobalStrings globalization;
		//
		// if (args.length == 1) {
		// globalization = new GlobalStrings(args[0]);
		// } else if (args.length == 2) {
		// globalization = new GlobalStrings(args[0], args[1]);
		// } else {
		// globalization = new GlobalStrings();
		// }
		
		action();
		
	}
	
}
