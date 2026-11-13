package dev.abdulslam.fulan.providers;

import dev.abdulslam.fulan.entities.Name;
import dev.abdulslam.fulan.utils.DataLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class NameProvider {
    private final List<Name> maleNames;
    private final List<Name> femaleNames;
    private final List<Name> lastNames;
    private final Random random = new Random();

    public NameProvider(){
        Function<String[], Name> mapper = f -> new Name(f[0], f[1]);

        maleNames = new ArrayList<>(DataLoader.loadData("data/male_names.csv",mapper));
        femaleNames = new ArrayList<>(DataLoader.loadData("data/female_names.csv",mapper));
        lastNames = new ArrayList<>(DataLoader.loadData("data/last_names.csv",mapper));
    }

    public Name getMaleName(){
        int index = random.nextInt(maleNames.size());
        return maleNames.get(index);
    }

    public Name getFemaleName(){
        int index = random.nextInt(femaleNames.size());
        return femaleNames.get(index);
    }

    public Name getLastName(){
        int index = random.nextInt(lastNames.size());
        return lastNames.get(index);
    }

}
