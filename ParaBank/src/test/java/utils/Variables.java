package utils;

import com.github.javafaker.Faker;

public class Variables {
    public Variables(){
        randomizer = new Faker();
    }
    public Faker randomizer;

    public String getUsername(){
        return randomizer.name().username();
    }
    public String getFirstName(){
        return randomizer.name().firstName();
    }
    public String getLastName(){
        return randomizer.name().lastName();
    }
    public String getAddress(){
        return randomizer.address().streetAddress();
    }
    public String getCity(){
        return randomizer.address().city();
    }
    public String getState(){
        return randomizer.address().state();
    }
    public String getZip(){
        return randomizer.address().zipCode();
    }
    public String getPhone(){
        return randomizer.phoneNumber().cellPhone();
    }
    public String getPwd(){
        return randomizer.dragonBall().character()+randomizer.pokemon().name()+randomizer.number().digits(3);
    }
    public String getSsn(){
        return String.valueOf(randomizer.number().numberBetween(111111111,999999999));
    }

}
