package algorithmscount.trainers;

import java.util.List;

public class AgeCondicionCounter {

    public int countElderly(List<Trainer> trainers, int minAge) {
        int count = 0;
        for (Trainer trainer: trainers ) {
            if (trainer.getAge()>= minAge) {
                count ++;
            }
        }
        return count;
    }
}
