public class Ages {

    public static void main(String[] args) {
        int vasyaAge = 25;
        int katyaAge = 16;
        int mishaAge = 33;

        int min = 0;
        int middle = 0;
        int max = 0;

        // Минимум================================================================
        if (vasyaAge < katyaAge) {
            min = vasyaAge;
        }
        else {
            min = katyaAge;
        }
        if (min > mishaAge) {
            min = mishaAge;
        }

        // Среднее================================================================
        if (vasyaAge > katyaAge && vasyaAge < mishaAge || vasyaAge < katyaAge && vasyaAge > mishaAge) {
            middle = vasyaAge;
        }
        else if (katyaAge > vasyaAge && katyaAge < mishaAge|| katyaAge < vasyaAge && katyaAge > mishaAge){
            middle = katyaAge;
        }
        else {
            middle = mishaAge;
        }

        // Максимум===========================================================
        if (vasyaAge > katyaAge) {
            max = vasyaAge;
        }
        else {
            max = katyaAge;
        }
        if (max < mishaAge ){
            max = mishaAge;
        }
        System.out.println("Минимальный возраст - " + min + " Средний возраст - " + middle + " Максимальный возраст - " + max);
    }
}
