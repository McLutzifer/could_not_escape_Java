package LinkedInJavaEssential;

import java.util.ArrayList;
import java.util.List;

public class DiseaseSorter {

    public static void main(String[] args) {
        Disease polio = new Disease("polio", false);
        Disease flu = new Disease("influenza", true);
        Disease malaria = new Disease("malaria", true);
        Disease cancer = new Disease("cancer", false);

        List<Disease> diseases = new ArrayList<Disease>();
        diseases.add(polio);
        diseases.add(flu);
        diseases.add(malaria);
        diseases.add(cancer);

        /*print all incurable deseases */
        for (Disease disease : diseases) {
            System.out.println(disease.curable);
        }
    }
}
