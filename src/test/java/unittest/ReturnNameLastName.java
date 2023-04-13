package unittest;

public class ReturnNameLastName {
    public String getNameLastname(int count) {
        if (count % 3 == 0 && count % 5 == 0) {
            return "Alex Khadasevich";
        } else if (count % 5 == 0) {
            return "Khadasevich";
        } else if (count % 3 == 0) {
            return "Alex";
        } else {
            return "Ошибка";
        }
    }
}
