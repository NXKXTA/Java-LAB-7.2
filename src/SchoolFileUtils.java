import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class SchoolFileUtils {

    // Метод для вывода информации о школьнике в консоль
    public static void printSchoolBoy(SchoolBoy schoolBoy) {
        System.out.printf("%s %s, ", schoolBoy.getSurname(), schoolBoy.getName());
    }

    // Метод для чтения данных о школьниках из файла
    public static void readFile(String fileName, TreeMap<Byte, ArrayList<SchoolBoy>> journal) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String str;
            while ((str = reader.readLine()) != null) {
                String[] word = str.split("\\s+");

                String surname = word[0];
                String name = word[1];
                byte numClass = Byte.parseByte(word[2]);
                String subject = word[3];
                byte grade = Byte.parseByte(word[4]);

                SchoolBoy schoolBoy = new SchoolBoy(surname, name, numClass, subject, grade);
                journal.computeIfAbsent(numClass, key -> new ArrayList<>()).add(schoolBoy);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    // Метод для записи списка школьников определенного класса в файл
    public static void writeClassToFile(ArrayList<SchoolBoy> schoolBoys, byte numClass) {
        try (FileWriter writer = new FileWriter("class" + numClass + ".txt")) {
            for (SchoolBoy schoolBoy : schoolBoys) {
                writer.write(schoolBoy.getSurname() + " " + schoolBoy.getName() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    // Метод для записи списка школьников и их оценок по предметам в файл
    public static void writeClassDetailsToFile(TreeSet<String> subjects, ArrayList<SchoolBoy> schoolBoys, byte numClass) {
        try (FileWriter writer = new FileWriter("Your class" + numClass + ".txt")) {
            for (String subject : subjects) {
                writer.write(subject + ":\n");
                for (SchoolBoy schoolBoy : schoolBoys) {
                    if (schoolBoy.getSubject().equals(subject)) {
                        writer.write(schoolBoy.getSurname() + " " + schoolBoy.getName() + " " + schoolBoy.getGrade() + "\n");
                    }
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}