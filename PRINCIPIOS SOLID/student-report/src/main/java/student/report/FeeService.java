package student.report;

import java.text.NumberFormat;
import java.util.Locale;


public class FeeService {

     public String calculateFee(Student student) {

        long fee = student.getTotalCredits() * 100L;
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale.forLanguageTag("es", "ES"));
        return currencyFormatter.format(fee);
    }

}
