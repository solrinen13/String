public class Main {
    public static void main(String[] args) {

        // 1 задача
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("“ФИО сотрудника- " + fullName + "“");

        // 2 задача
        String result = fullName.toUpperCase();
        System.out.println("“Данные ФИО сотрудника для заполнения отчета — " + result + "“");

         // 3 задача
        String fullNameTwo = "Иванов Семён Семёнович";
        fullNameTwo = fullNameTwo.replace("ё","е");
        System.out.println("”Данные ФИО сотрудника — "+fullNameTwo+"”");
        char[] chars = fullName.toCharArray();
       for (int i = 0; i < chars.length; i++)
       {
           char c = chars[i];
           if (Character.isLowerCase(c))
           {
               chars[i] = Character.toUpperCase(c);

           }

        }







//        for (int i = 0; i < chars.length; i++) {
//            char c = chars[i];
//            if (Character.isUpperCase(c)) {
//                chars[i] = Character.toLowerCase(c);
//            } else if (Character.isLowerCase(c)) {
//                chars[i] = Character.toUpperCase(c);
//            }
//        }



    }
}