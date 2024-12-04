public class Main {
    public static void main(String[] args) {
        // Указываем путь к файлу с данными
        String filePath = "C:\\Фигня всякая\\Java Lab 7.2\\src\\data_school.txt";

        // Создаем экземпляр журнала
        SchoolJournal journal = new SchoolJournal(filePath);

        // 0. Вывод всех учеников по классам
        journal.printPupils();

        // 1. Вывод учеников с заданной оценкой (например, 4)
        journal.printGrade((byte) 4);

        // 2. Сортировка и вывод классов по средней успеваемости
        journal.printPerformance();

        // 3. Вывод учеников по предмету (например, "математика")
        journal.printSubject("математика");

        // 4. Запись данных по определенному классу (например, 5)
        journal.printFile((byte) 5);

        // 5. Поиск ученика по имени и фамилии (например, "Иванов Иван")
        journal.findPupil("Иванов", "Иван");

        // 6. Нахождение предмета с самой высокой средней успеваемостью
        journal.findBestSubject();
    }
}