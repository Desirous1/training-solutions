package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();
    private List<Mail> result = new ArrayList<>();

    public List<Mail> findByCriteria(String criteria) {
        String[] split = criteria.split(":");
        if (split.length == 1) {
            findMessage(criteria);
        } else {
            if (split[0].equals("from")) {
                findFrom(split[1]);
            } else {
                findTo(split[1]);
            }
        }
        return result;
    }

    public List<Mail> findFrom(String crit) {
        for (Mail oi : mails) {
            System.out.println(oi.getFrom().getEmail().contains(crit));
            if (oi.getFrom().getEmail().contains(crit)) {
                result.add(new Mail(oi.getFrom(), oi.getTo(), oi.getSubject(), oi.getMessage()));
            }
        }
        return result;
    }

    public List<Mail> findTo(String crit) {
        for (Mail oi : mails) {
            for (int i = 0; i < oi.getTo().size(); i++) {
                if ((oi.getTo().get(i).getName().equals(crit)) || (oi.getTo().get(i).getEmail().equals(crit))) {
                    result.add(oi);
                }
            }
        }
        return result;
    }

    private List<Mail> findMessage(String criteria) {
        for (Mail oi : mails) {
            if ((oi.getSubject().contains(criteria)) || (oi.getMessage().contains(criteria))) {
                result.add(oi);
            }
        }
        return result;
    }

    public void addMail(Mail paraMail) {
        mails.add(paraMail);
    }

    public List<Mail> getMails() {
        return mails;
    }
}
