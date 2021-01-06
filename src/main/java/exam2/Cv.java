package exam2;
/*
CV
Egy önéletrajzot reprezentáló osztályt kell létrehozni, melyben van egy név,
 valamint skillek (hogy mihez ért az illető). A skill egy névvel és egy számmal (szint) rendelkezik,
  utóbbi 1 - 5 között.

Az önéletrajz a Cv osztály pár metódussal, a skill a Skill osztály.

A skillek megadása a nevével, valamint a szintjével történik, pl. programming (5).

A findSkillLevelByName() a skill neve alapján visszaadja annak szintjét.
 */

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }


    public List<Skill> getSkills() {
        return skills;
    }

    public String getName() {
        return name;
    }


    public int findSkillLevelByName(String paraName) throws SkillNotFoundException {
        for (Skill oi: skills) {
            if (oi.getName().equals(paraName)) {
                return oi.getLevel();
            }
        }
        throw new SkillNotFoundException();
    }

    public void addSkills(String... paraString) {
               // skills.add(paraString);

    }


}
