package com.example;

public class MyClass
{
    public static void main(String[] args)
    {
        String[] games = {"Dawn of War", "Dawn of War 2", "Civ5", "Civ: Beyond Earth", "Xcom",
                "TES2: Daggerfall", "TES3: Morrowind", "TES4: Oblivion", "TES5: Skyrim",
                "Fallout", "Fallout 2", "Fallout 3", "Fallout New Vegas", "Age of Mythology"};

        System.out.println("The Elder Scrolls games in my collection:");
        for(int i = 0; i < games.length; i++)
        {
            if(games[i].contains("TES"))
            {
                System.out.println(games[i]);
            }
        }
    }
}
