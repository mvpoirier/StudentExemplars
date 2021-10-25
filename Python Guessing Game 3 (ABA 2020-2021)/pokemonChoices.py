""""
DATE 2020-10-21
NAME: A.K - ABA Guessing Game Example
PURPOSE: Pokemon choices
"""
pokeNames=["Bulbasaur",
           "Ivysaur",
           "Venasuar",
           "Charmander",
           "Charmeleon",
           "Charizard",
           "Squirtle",
           "Wartortle",
           "Blastoise",
           "Caterpie",
           "Metapdod",
           "Butterfree",
           "Weedle",
           "Kakuna",
           "Beedrill",
           "Pidgey",
           "Pidgeotto",
           "Pidgeot",
           "Rattata",
           "Raticate",
           "Spearow",
           "Fearow",
           "Ekans",
           "Arbok",
           "Pikachu",
           "Raichu",
           "Sandshrew",
           "Sandslash",
           "Nidoran F",
           "Nidorina",
           "Nidoqueen",
           "Nidoran M",
           "Nidorino",
           "Nidoking",
           "Clefairy",
           "Clefable",
           "Vulpix",
           "Ninetales",
           "Jigglytuff",
           "Wigglytuff",
           "Zubat",
           "Golbat",
           "Oddish",
           "Gloom",
           "Vileplume",
           "Paras",
           "Parasect",
           "Venonat",
           "Venomoth",
           "Diglett",
           "Dugtrio",
           "Meowth",
           "Persian",
           "Psyduck",
           "Golduck",
           "Mankey",
           "Primeape",
           "Growlithe",
           "Arcanine",
           "Poliwag",
           "Poliwhirl",
           "Poliwrath",
           "Abra",
           "Kadabra",
           "Alakazam",
           "Machop",
           "Machoke",
           "Machamp",
           "Bellsprout",
           "Weepinbell",
           "Victreebel",
           "Tentacool",
           "Tentacruel",
           "Geodude",
           "Graveler",
           "Golem",
           "Ponyta",
           "Rapidash",
           "Slowpoke",
           "Slowbro",
           "Magnemite",
           "Magneton",
           "Farfetch'd",
           "Duduo",
           "Dodrio",
           "Seel",
           "Dewgong",
           "Grimer",
           "Muk",
           "Shellder",
           "Cloyster",
           "Gastly",
           "Haunter",
           "Gengar",
           "Onix",
           "Drowzee",
           "Hypno",
           "Krabby",
           "Kingler",
           "Voltorb",
           "Electrode",
           "Exggcute",
           "Exeggutor",
           "Cubone",
           "Marowak",
           "Hitmonlee",
           "Hitmonchan",
           "Lickitung",
           "Koffing",
           "Weezing",
           "Rhyhorn",
           "Rhydon",
           "Chansey",
           "Tangela",
           "Kangaskhan",
           "Horsea",
           "Seadra",
           "Goldeen",
           "Seaking",
           "Staryu",
           "Starmie",
           "Mr.Mime",
           "Scyther",
           "Jynx",
           "Electabuzz",
           "Magmar",
           "Pinsir",
           "Tauros",
           "Magikarp",
           "Gyarados",
           "Lapras",
           "Ditto",
           "Eevee",
           "Vaporeon",
           "Jolteon",
           "Flareon",
           "Porygon",
           "Omanyte",
           "Omastar",
           "Kabuto",
           "Kabutops",
           "Aerodactly",
           "Snorlax",
           "Articuno",
           "Zapdos",
           "Moltres",
           "Dratini",
           "Dragonair",
           "Dragonite",
           "Mewtwo",
           "Mew",]

powerPok=["Venusaur","Charizard","Blastoise","Pidgeot","Raticate","Fearow","Arbok","Raichu",
          "Sandslash","Nidoking","Nidoqueen","Clefable","Ninetales","Wigglytuff","Golbat",
          "Vileplume","Venomoth","Dugtrio","Persian","Golduck","Primeape","Arcanine","Poliwrath",
          "Alakazam","Machamp","Victreebel","Tentacruel","Golem","Rapidash","Slowbro","Magneton","Dodrio","Dewgong","Muk","Cloyster","Gengar","Hypno","Kingler","Electrode",
          "Exeggutor","Marowak","Hitmonlee","Hitmonchan","Weezing","Rhydon","Chansey","Tangela",
          "Kangaskhan","Seadra","Seaking","Starmie","Mr.Mime","Scyther","Jynx","Electabuzz","Magmar",
          "Pinsir","Tauros","Gyarados","Lapras","Jolteon","Vaporeon","Flareon","Porygon",
          "Omastar","Kabutops","Aerodactyl","Snorlax","Articuno","Zapdos","Moltres","Dragonair",
          "Dragonite","Mewtwo","Mew"]

weakPok=["Squirtle","Wartortle","Bulbasaur","Ivysaur","Charmander","Charmeleon","Caterpie",
         "Metapod","Weedle","Kakuna","Pidgey","Rattata","Butterfree","Beedrill","Pidgeotto",
         "Spearow","Ekans","Pikachu","Sandshrew","Nidoran M", "Nidorino","Nidoran F", "Nidorina",
         "Clefairy","Vulpix","Jigglypuff","Zubat","Oddish","Gloom","Paras","Parasect","Venonat",
         "Diglet","Meowth","Psyduck","Mankey","Growlithe","Poliwag","Poliwhirl","Abra","Kadabra",
         "Machop","Machoke","Bellsprout","Weepinbell","Tentacool","Geodude","Graveler",
         "Ponyta","Slowpoke","Magnemite","Farfetch'd","Duduo","Seel","Grimer","Shellder",
         "Gastly","Haunter","Onix","Drowzee","Krabby","Voltorb","Exeggcute","Cubone","Lickitung",
         "Koffing","Rhyhorn","Horsea","Goldeen","Staryu","Magikarp","Ditto","Eevee","Omanyte",
         "Kabuto","Dratini"]

fireType=["Ponyta","Vulpix","Growlithe","Magmar","Charmander","Charmeleon",
          "Charizard","Ninetales","Arcanine","Rapidash","Flareon","Moltres"]

waterType=["Squirtle","Wartortle","Blastoise","Psyduck","Golduck","Poliwag",
           "Poliwhirl","Poliwrath","Seel","Shellder","Krabby","Kingler","Horsea","Seadra",
           "Goldeen","Seaking","Staryu","Starmie","Magikarp","Gyarados",
           "Omanyte","Omastar","Slowpoke", "Slowbro","Kabuto", "Kabutops","Vaporeon"]

grassType=["Paras","Bellsprout","Oddish","Exggcute","Parasect","Weepinbell",
           "Gloom","Victreebel","Tangela","Exegguter","Bulbasaur","Ivysaur",
           "Vileplume","Venasaur"]

normalType=["Pidgey","Pidgeotto","Pidgeot","Rattata","Raticate","Spearow","Fearow","Jigglypuff",
            "Wigglytuff","Meowth","Persian","Farfetch'd","Doduo","Dodrio","Lickitung","Chansey",
            "Kangaskhan","Tauros","Ditto","Eevee","Porygon","Snorlax","Clefable","Celfairy"]

flyingType=["Charizard","Butterfree","Pidgey","Pidgeotto","Pidgeot","Spearow",
            "Fearow","Zubat","Golbat","Farfetch'd","Doduo","Dodrio","Scyther",
            "Pinsir","Gyarados","Aerodactyl","Articuno","Zapdos","Moltres","Dragonite"]

rockType=["Geodude","Graveler","Golem","Onix","Rhyhorn","Rhydon","Omanyte",
          "Omastar","Kabutops","Aerodactyl"]

groundType=["Geodude","Graveler","Golem","Onix","Sandshrew","Sandslash","Nidoqueen",
            "Nidoking","Diglet","Dugtrio","Cubone","Marowak","Rhyhorn","Rhydon"]

poisonType=["Bulbasaur","Ivysaur","Venasuar","Weedle', Kakuna","Beedrill","Ekans",
            "Arbok","Nidoran M","Nidorina","Nidoqueen","Nidoran F","Nidorino",
            "Nidoking","Zubat","Golbat","Oddish","Gloom","Vileplume","Venonat",
            "Venomoth","Bellsprout","Weepinbell","Victreebel","Tentacool","Tentacruel",
            "Grimer","Muk","Gastly","Haunter","Gengar","Koffing","Weezing"]

ghostType=["Gastly","Haunter","Gengar"]

iceType=["Dewgong","Cloyster","Jynx","Lapras","Articuno"]

psychicType=["Arba","Kadabra","Alakazam","Slowpoke","Slowbro","Drowzee","Hypno",
             "Exeggute","Exeggutor","Starmie","Mr.Mime","Jynx","Mewtwo","Mew"]

bugType=["Caterpie","Metapod","Butterfree","Weedle","Kakuna","Beedrill","Paras",
         "Parasect","Venonat","Venomoth","Scyther","Pinsir"]

electricType=["Pikachu","Raichu","Magnemite","Magneton","Voltorb","Electrode",
              "Electrabuzz","Jolteon","Zapdos"]

fightingType=["Mankey","Primeape","Poliwrath","Machop","Machoke","Machamp","Hitmonlee",
              "Hitmonlee","Hitmonchan"]

dragonType=["Dratini","Dragonair","Dragonite",]

            
smallSize=["Bulbasaur","Ivysaur","Charmander","Squirtle","Wartortle","Caterpie","Metapod",
           "Weedle","Kakuna","Pidgey","Rattata","Spearow","Ekans","Pikachu","Sandshrew","Nidoran M",
           "Nidorina","Nidoran F","Nidorino","Clefairy","Vulpix","Jigglypuff","Zubat","Oddish",
           "Paras","diglet","Meowth","Psyduck","Mankey","Growlithe","Poliwag","Abra","Machop","Bellsprout",
           "Geodude","Ponyta","Magnemite","Farfetch'd","Doduo","Shellder","Gastly","Drowzee","Krabby",
           "Exeggcute","Cubone","Tangela","Horsea","Goldeen","Staryu","Magikarp","Eevee","Omanyte",
           "Kabuto","Dratini","Mew"]

           
mediumSize=["Charmeleon","Butterfree","Pidgeotto","Raticate","Raichu","Sandslash","Clefable","Golbat"
            "Gloom","Vileplume","Parasect","Venonat","Golduck","Poliwhirl","Kadabra","Machoke","Weepinbell",
            "Tentacool","Graveler" ,"Slowpoke","Magneton","Seel","Grimer","Haunter","Hypno","Voltorb",
            "Exeggutor","Lickitung","Koffing","Rhyhorn","Chansey","Seadra","Electabuzz","Magmar","Pinsir",
            "Ditto","Vaporeon","Jolteon","Flareon","Porygon","Omastar","Dragonair"]
            

bigSize=["Venasaur","Charizard","Blastoise","Pidgeot","Fearow","Arbok","Nidoqueen","Nidoking",
         "Ninetales","Wigglytuff","Venomoth","Dugtrio","Persian","Primeape","Arcanine","Poliwrath",
         "Alakazam","Machamp","Victreebel","Tentacruel","Golem","Rapidash","Slowbro","Dodrio","Dewgong",
         "Muk","Cloyster","Gengar","Onix","Kingler","Electrode","Marowak","Hitmonlee","Hitmonchan","Weezing",
         "Rhydon","Kangaskhan","Seaking","Starmie","Mr.Mime","Scyther","Jynx","Tauros","Gyarados","Lapras",
         "Kabutops","Aerodactyl","Snorlax","Articuno","Zapdos","Moltres","Dragonite","Mewtwo"]

fourLegs=["Bulbasaur","Ivysaur","Venusaur","Rattata","Raticate","Pikachu","Raichu","Sandshrew","Sandslash","Nidoran M","Nidorina",
          "Nidoran","Nidorino","Vulpix","Ninetales","Paras","Paresect","Persian","Growlithe","Arcanine","Ponyta","Rapidash",
          "Slowpoke","Krabby","Kingler","Rhyhorn","Starmie","Tauros","Lapras","Eevee","Vaporeon","Jolteon","Flareon","Omanyte",
          "Omastar","Kabuto"]

twoLegs=["Charmander","Charmeleon","Charizard","Squirtle","Wartortle","Blastoise","Nidoking","Nidoqueen","Clefairy",
         "Clefable","Jigglpuff","Wigglytufff","Oddish","Gloom","Vileplume","Venonat","Meowth","Psyduck","Golduck,"
         "Mankey","Primeape","Poliwag","Poliwhirl","Poliwrath","Kadabra","Alakazam","Machop","Machoke","Machamp",
         "Bellsprout","Graveler","Golem","Slowbro","Farfecth'd","Doduo","Dodrio","Gengar","Drowzee","Hypno","Exeggutor",
         "Cubone","Marowak","Hitmonlee","Hitmonchan","Lickitung","Rhydon","Chansey","Tangela","Kangaskhan","Mr.Mime",
         "Scyther","Jynx","Electabuzz","Magmar","Pinsir","Porygon","Kabutops","Snorlax","Articuno","Zapdos","Moltres",
         "Dragonite","Mewtwo"]

noLegs=["Caterpie","Metapod","Weedle","Kakuna","Ekans","Arbok","Diglet","Dugtrio","Weepinbell","Victreebell","Tentacool",
        "Tentacruel","Geodude","Seel","Dewgong","Grimer","Muk","Shellder","Cloyster","Gastly","Haunter","Onix","Voltorb",
        "Electrode","Exeggcute","Horsea","Seadra","Goldeen","Seaking","Staryu","Magikarp","Gyarados","Ditto","Dratini",
        "Dragonair","Mew",]

lev=["Butterfree","Beedrill","Pidgey","Pidgeotto","Pidgeot","Spearow","Fearow","Zubat","Golbat","Venomoth","Abra","Magnemite",
     "Magneton","Koffing","Weezing","Aerodactyl"]
         
primStage=["Bulbasaur","Charmander","Squirtle","Caterpie","Weedle","Pidgey","Rattata","Spearow",
            "Ekans","Pikachu","Sandshrew","Nidoran M","Nidoran F","Clefairy","Vulpix","Jigglypuff",
            "Zubat","Oddish","Paras","Venonat","Diglet","Meowth","Psyduck","Mankey","Growlithe",
            "Poliwag","Abra","Machop","Bellsprout","Tentacool","Geodude","Ponyta","Slowpoke",
            "Magnemite","Farfecth'd","Doduo","Seel","Grimer","Shellder","Gastly","Drowzee","Krabby",
            "Voltorb","Exeggcute","Cubone","Koffing","Rhyhorn","Tangela","Horsea","Staryu","Magikarp",
            "Eevee","Omanyte","Kabuto","Dratini"]
            
middleStage=["Ivysaur","Charmeleon","Wartortle","Metapod","Kakuna","Pidgeotto","Nidorina","Nidorino",
             "Gloom","Poliwhirl","Kadabra","Machoke","Weepinbell","Graveler","Haunter","Dragonair"]

finalStage=["Venusaur","Charizard","Blastoise","Butterfree","Beedrill","Pidgeot","Raticate",
            "Fearow","Arbok","Raichu","Sandslash","Nidoqueen","Nidoking","Clefable","Ninetales",
            "Wigglytuff","Golbat","Vileplume","Parasect","Venomoth","Dugtrio","Persian",
            "Golduck","Primeape","Arcanine","Poliwrath","Alakazam","Machamp","Victreebel",
            "Tentacruel","Golem","Rapidash","Slowbro","Magneton","Dodrio","Dewgong","Muk","Cloyster",
            "Gengar","Onix","Hypno","Kingler","Electrode","Exeggutor","Marowak","Hitmonchan","Hitmonlee",
            "Lickitung","Weezing","Rhydon","Chansey","Kangaskhan","Seadra","Goldeen","Seaking","Starmie",
            "Mr.Mime","Scyther","Jynx","Electabuzz","Magmar","Pinsir","Tauros","Gyarados","Lapras","Ditto","Jolteon",
            "Vaporeon","Flareon","Porygon","Omastar","Kabutops","Aerodactyl","Snorlax","Articuno","Zapdos",
            "Moltres","Dragonite","Mewtwo","Mew"]
            









          
