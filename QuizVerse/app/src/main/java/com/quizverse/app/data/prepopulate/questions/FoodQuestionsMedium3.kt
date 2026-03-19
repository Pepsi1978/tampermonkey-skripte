package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMedium3(): List<Question> = listOf(

    // Italian cuisine — correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Welche Pasta-Form bedeutet auf Italienisch 'Schmetterlinge'?",
        answerA = "Rigatoni",
        answerB = "Pappardelle",
        answerC = "Orecchiette",
        answerD = "Farfalle",
        correctAnswer = 3,
        explanation = "Farfalle sind die charakteristischen Pasta-Schleifen in Schmetterlingsform. Das Wort 'farfalla' bedeutet auf Italienisch 'Schmetterling'.",
        difficulty = 2,
        funFact = "Farfalle stammen ursprünglich aus den Regionen Emilia-Romagna und Lombardei in Norditalien."
    ),

    // correctAnswer 2
    Question(
        categoryId = 8,
        questionText = "Welcher Käse wird für eine echte Pasta Carbonara aus Rom verwendet?",
        answerA = "Parmesan (Parmigiano Reggiano)",
        answerB = "Mozzarella",
        answerC = "Pecorino Romano",
        answerD = "Grana Padano",
        correctAnswer = 2,
        explanation = "Die originale römische Carbonara wird mit Pecorino Romano hergestellt, einem Hartkäse aus Schafsmilch. Viele Köche mischen ihn auch mit Parmesan.",
        difficulty = 2,
        funFact = "Carbonara enthält keine Sahne — das Cremige entsteht ausschließlich aus Eiern, Käse und dem stärkehaltigen Nudelwasser."
    ),

    // correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Guanciale' in der italienischen Küche?",
        answerA = "Geräucherter Rinderschinken aus Kalabrien",
        answerB = "Gebratener Bauchspeck ähnlich wie Pancetta",
        answerC = "Gepökelter und luftgetrockneter Schweinebackenspeck",
        answerD = "Getrocknete Schweineschulter mit Rosmarin",
        correctAnswer = 2,
        explanation = "Guanciale ist gepökelter und gereifter Schweinebackenspeck. Er ist eine der Hauptzutaten in Carbonara und Amatriciana und hat einen intensiveren Geschmack als Pancetta.",
        difficulty = 2,
        funFact = null
    ),

    // correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Aus welcher Stadt stammt das Original-Rezept für Ragù alla Bolognese?",
        answerA = "Rom",
        answerB = "Mailand",
        answerC = "Neapel",
        answerD = "Bologna",
        correctAnswer = 3,
        explanation = "Ragù alla Bolognese stammt aus Bologna in der Emilia-Romagna. Das Original-Rezept der Handelskammer von 1982 sieht Rinderhackfleisch, Pancetta, Zwiebeln, Möhren, Sellerie und Weißwein vor.",
        difficulty = 2,
        funFact = "Im Original-Rezept wird Ragù alla Bolognese mit Tagliatelle serviert — niemals mit Spaghetti, wie im Ausland oft üblich."
    ),

    // correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Risotto alla Milanese' und welches besondere Gewürz macht es aus?",
        answerA = "Ein Reiseintopf mit Trüffeln aus der Toskana",
        answerB = "Ein cremiger Mailänder Reis, der mit Safran goldgelb gefärbt wird",
        answerC = "Ein Risotto mit Steinpilzen aus dem Piemont",
        answerD = "Gebratener Reis mit Meeresfrüchten aus Venedig",
        correctAnswer = 1,
        explanation = "Risotto alla Milanese ist das klassische Gericht Mailands: cremiger Arborio-Reis, der mit Safran goldgelb gefärbt wird. Safran verleiht ihm seinen charakteristischen Geschmack und die leuchtend gelbe Farbe.",
        difficulty = 2,
        funFact = "Risotto alla Milanese wird traditionell als Beilage zum Ossobuco (geschmorte Kalbshaxe) serviert."
    ),

    // French cuisine — correctAnswer 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Bouillabaisse' und aus welcher Stadt stammt sie?",
        answerA = "Eine cremige Zwiebelsuppe aus Paris",
        answerB = "Ein geschmortes Kalbsgericht aus Lyon",
        answerC = "Eine provenzalische Fischsuppe aus Marseille",
        answerD = "Eine Kartoffelsuppe aus dem Elsass",
        correctAnswer = 2,
        explanation = "Bouillabaisse ist eine traditionelle provenzalische Fischsuppe aus Marseille, zubereitet mit verschiedenen Mittelmeerfischen, Krustentieren, Safran und Kräutern.",
        difficulty = 2,
        funFact = "Ursprünglich war Bouillabaisse ein Arme-Leute-Gericht: Fischer kochten damit den unverkäuflichen Restfang des Tages."
    ),

    // correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Boeuf Bourguignon' und aus welcher Region Frankreichs stammt es?",
        answerA = "Gegrilltes Rinderfilet aus dem Périgord",
        answerB = "In Rotwein geschmortes Rindfleisch aus dem Burgund",
        answerC = "Rindfleisch-Ragout in Weißwein aus dem Elsass",
        answerD = "Gebratenes Rind mit Senfsauce aus der Normandie",
        correctAnswer = 1,
        explanation = "Boeuf Bourguignon ist ein klassisches französisches Schmorgericht: Rindfleisch wird stundenlang in Rotwein aus dem Burgund mit Speck, Zwiebeln und Champignons gegart.",
        difficulty = 2,
        funFact = null
    ),

    // correctAnswer 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ratatouille' klassischerweise?",
        answerA = "Ein gefülltes Gebäck aus der Bretagne",
        answerB = "Eine Käsefondue-Variante aus Savoyen",
        answerC = "Ein geschmortes Gemüsegericht aus der Provence",
        answerD = "Eine Fischterrine aus der Normandie",
        correctAnswer = 2,
        explanation = "Ratatouille ist ein geschmortes Gemüsegericht aus der Provence mit Zucchini, Auberginen, Paprika, Tomaten und Kräutern wie Thymian und Basilikum.",
        difficulty = 2,
        funFact = "Der Name 'Ratatouille' kommt vom französischen Verb 'touiller' (umrühren)."
    ),

    // correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Coq au Vin'?",
        answerA = "Ein Hahn, der in Rotwein mit Speck, Pilzen und Kräutern geschmort wird",
        answerB = "Ein Hähnchen mit Weißweinsauce aus der Bretagne",
        answerC = "Eine Hühnerbrühe mit Gemüse und Kräutern",
        answerD = "Gebratene Hühnerleber in Cognac flambiert",
        correctAnswer = 0,
        explanation = "Coq au Vin ist ein klassisches französisches Schmorgericht: Ein Hahn (oder Huhn) wird in Rotwein mit Speck, Pilzen, Perlzwiebeln und Kräutern langsam geschmort.",
        difficulty = 2,
        funFact = "Der ursprüngliche 'Coq' war ein alter, zäher Hahn — durch stundenlange Garzeit im Wein wird er butterweich."
    ),

    // Mexican cuisine — correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was sind 'Tamales' in der mexikanischen Küche?",
        answerA = "Frittierte Teigbällchen mit Käsefüllung",
        answerB = "In Maisblätter gewickelte gefüllte Maispasteten, die gedämpft werden",
        answerC = "Gegrillte Fleischspieße mit Maismehlbasis",
        answerD = "Gedämpfte Reisbällchen mit Chilisauce",
        correctAnswer = 1,
        explanation = "Tamales sind Maispasteten aus Masa (Maismehlteig), gefüllt mit Fleisch, Käse oder Chilisauce, die in Maisblätter oder Bananenblätter gewickelt und gedämpft werden.",
        difficulty = 2,
        funFact = "Tamales sind eines der ältesten Gerichte Mesoamerikas und wurden bereits von Azteken und Maya zubereitet."
    ),

    // correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Pozole' in der mexikanischen Küche?",
        answerA = "Eine traditionelle Suppe mit gequollenem Hominy-Mais und Fleisch",
        answerB = "Ein überbackener Käse-Chili-Auflauf",
        answerC = "Ein fermentiertes Maisgetränk",
        answerD = "Ein frittiertes Churro-Dessert",
        correctAnswer = 0,
        explanation = "Pozole ist eine traditionelle mexikanische Suppe aus gequollenem Hominy-Mais und Schweine- oder Hühnerfleisch, garniert mit Kohl, Zwiebeln, Oregano und Limette.",
        difficulty = 2,
        funFact = "Pozole war ein heiliges Gericht der Azteken und wurde bei religiösen Zeremonien geopfert."
    ),

    // correctAnswer 2
    Question(
        categoryId = 8,
        questionText = "Welche Chilisorte wird für die Herstellung von 'Chipotle' verwendet?",
        answerA = "Habanero",
        answerB = "Serrano",
        answerC = "Jalapeño",
        answerD = "Ancho",
        correctAnswer = 2,
        explanation = "Chipotle ist ein gereifter, geräucherter Jalapeño-Chili. Durch das Räuchern erhält er sein charakteristisches Raucharoma und eine dunkelrote Farbe.",
        difficulty = 2,
        funFact = "Der Name 'Chipotle' kommt aus dem Nahuatl und bedeutet 'geräucherter Chili'."
    ),

    // correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Was macht eine 'Quesadilla' aus?",
        answerA = "Eine weiche Tortilla mit Fleisch und Salsa, kalt gerollt",
        answerB = "Ein frittierter Maisfladen mit Guacamole",
        answerC = "Ein gefüllter Maisfladen mit Mole-Sauce",
        answerD = "Eine in der Pfanne gebratene Tortilla, gefüllt mit Käse und weiteren Zutaten",
        correctAnswer = 3,
        explanation = "Eine Quesadilla ist eine in der Pfanne oder auf dem Grill geröstete Maistortilla, die mit Käse gefüllt wird — manchmal ergänzt durch Fleisch, Gemüse oder Chili.",
        difficulty = 2,
        funFact = null
    ),

    // Indian cuisine — correctAnswer 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Biryani' und wie wird es traditionell zubereitet?",
        answerA = "Ein indisches Fladenbrot aus dem Tandoor-Ofen",
        answerB = "Ein Linsengericht mit Ghee und Gewürzen",
        answerC = "Ein aromatischer Reisgericht aus Basmati-Reis mit Fleisch, Safran und Gewürzen",
        answerD = "Eine Joghurt-Gurken-Beilage zu Currygerichten",
        correctAnswer = 2,
        explanation = "Biryani ist ein aromatischer Reisgericht aus Basmati-Reis, Fleisch (oder Gemüse), Safran und einer Gewürzmischung, oft in der 'Dum'-Methode luftdicht verschlossen auf kleiner Flamme gegart.",
        difficulty = 2,
        funFact = "Der Name 'Biryani' stammt aus dem Persischen und bedeutet 'gebraten' — der Reis wird vor dem Kochen kurz in Ghee geröstet."
    ),

    // correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Dal' in der indischen Küche?",
        answerA = "Eine Joghurtsuppe mit Gurken und Minze",
        answerB = "Ein in Ghee gebratenes Fladenbrot",
        answerC = "Eine Reisspeise mit getrockneten Früchten",
        answerD = "Ein Gericht aus gekochten und gewürzten Hülsenfrüchten wie Linsen oder Erbsen",
        correctAnswer = 3,
        explanation = "Dal bezeichnet sowohl die Hülsenfrüchte (Linsen, Erbsen, Bohnen) als auch das daraus zubereitete Gericht. Es ist ein Grundnahrungsmittel in Indien und wird täglich in fast allen Haushalten gekocht.",
        difficulty = 2,
        funFact = null
    ),

    // correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Tandoor' in der indischen Küche?",
        answerA = "Ein flaches Eisengitter zum Grillen von Gemüse",
        answerB = "Ein zylindrischer Lehm- oder Tontopfofen, der Temperaturen bis 480 °C erreicht",
        answerC = "Ein tiefer Kochtopf für Schmorgerichte",
        answerD = "Ein Dampfgarer für Reisgerichte",
        correctAnswer = 1,
        explanation = "Der Tandoor ist ein zylindrischer Lehmofen, der sehr hohe Temperaturen erreicht. Darin werden Naan-Brot an die Wand geklebt sowie mariniertes Fleisch (Tandoori-Gerichte) auf Spießen gegart.",
        difficulty = 2,
        funFact = "Das Wort 'Tandoor' bezeichnet seit Jahrtausenden diese Art von Lehmofen und kommt möglicherweise aus dem akkadischen 'tinuru'."
    ),

    // correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Paneer' in der indischen Küche?",
        answerA = "Ein frischer, nicht gereifter indischer Frischkäse aus Kuhmilch oder Büffelmilch",
        answerB = "Eine fermentierte Reiszubereitung aus Südindien",
        answerC = "Eine süße Milchcremespeise mit Rosenwasser",
        answerD = "Ein würziges Linsenmehl für Flatbreads",
        correctAnswer = 0,
        explanation = "Paneer ist ein indischer Frischkäse, der durch Ausfällen von Milch mit Zitronensaft oder Essig hergestellt wird. Er wird nicht gereift und hat eine feste, schneidbare Konsistenz — ideal zum Braten.",
        difficulty = 2,
        funFact = null
    ),

    // Japanese cuisine — correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Sushi' und 'Sashimi'?",
        answerA = "Sushi enthält immer rohen Fisch, Sashimi enthält keinen Fisch",
        answerB = "Sashimi wird warm serviert, Sushi ist immer kalt",
        answerC = "Sushi enthält immer Nori-Algen, Sashimi nicht",
        answerD = "Sashimi ist dünner aufgeschnittener roher Fisch ohne Reis; Sushi ist mit gewürztem Reis zubereitet",
        correctAnswer = 3,
        explanation = "Sashimi ist dünner aufgeschnittener roher Fisch oder Meeresfrüchte, der ohne Reis serviert wird. Sushi ist ein Gericht mit gewürztem Reis (Sushi-Meshi), der mit verschiedenen Zutaten kombiniert wird.",
        difficulty = 2,
        funFact = null
    ),

    // correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ramen' und welche vier Hauptstile gibt es in Japan?",
        answerA = "Eine Nudelsuppe mit vier regionalen Brühenstilen: Shoyu, Shio, Miso und Tonkotsu",
        answerB = "Ein Reistopf mit Fischbrühe in vier Geschmacksrichtungen",
        answerC = "Weizenteig-Knödel in vier verschiedenen Suppen",
        answerD = "Gebratene Reisnudeln in vier Regionalsaucen",
        correctAnswer = 0,
        explanation = "Ramen ist eine japanische Nudelsuppe mit vier klassischen Brühenstilen: Shoyu (Sojasoße), Shio (Salz), Miso (fermentierte Sojabohnenpaste) und Tonkotsu (Schweineknochenfond).",
        difficulty = 2,
        funFact = "Ramen wurde ursprünglich aus China eingeführt, entwickelte sich aber in Japan zu einer eigenständigen Küche mit regionalen Variationen."
    ),

    // correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Umeboshi' in der japanischen Küche?",
        answerA = "Eingelegte, gesalzene und getrocknete japanische Pflaumen",
        answerB = "Fermentierte Sojabohnenpaste mit Reisessig",
        answerC = "Gewürzte Algenblätter zum Einrollen von Sushi",
        answerD = "Ein süßer Reiswein als Dessert",
        correctAnswer = 0,
        explanation = "Umeboshi sind eingelegte japanische Pflaumen (Ume), die in Salz eingelegt und getrocknet werden. Sie sind sehr sauer und salzig und werden oft als Beilage zu Reis oder in Onigiri verwendet.",
        difficulty = 2,
        funFact = "Umeboshi gelten in Japan als traditionelles Heilmittel für Verdauungsprobleme und Übelkeit."
    ),

    // Chinese cuisine — correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Dim Sum' in der chinesischen Küche?",
        answerA = "Eine scharfe Suppe aus der Sichuan-Provinz",
        answerB = "Kleine Gerichte und Häppchen, die beim Yum-Cha-Tee-Brunch gereicht werden",
        answerC = "Ein gedämpftes Fischgericht aus der kantonesischen Küche",
        answerD = "Frittierte Frühlingsrollen mit Schweinefleischfüllung",
        correctAnswer = 1,
        explanation = "Dim Sum bezeichnet kleine Speisen wie Dumplings, Bao-Brötchen und kleine Gebäcke, die traditionell beim Yum Cha (Tee trinken) zum Brunch serviert werden — eine Tradition aus der kantonesischen Küche.",
        difficulty = 2,
        funFact = null
    ),

    // correctAnswer 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Peking-Ente' und was macht sie besonders?",
        answerA = "Gedämpfte Ente in Sojasauce mit Ingwer",
        answerB = "Eine frittierte Ente mit süß-saurer Sauce aus Kanton",
        answerC = "Eine Ente, die mit Luft aufgeblasen, mit Malzzucker glasiert und im Ofen knusprig gebraten wird",
        answerD = "Ente in einer scharfen Chilipaste aus Sichuan",
        correctAnswer = 2,
        explanation = "Bei der Peking-Ente wird die Ente zunächst mit Luft zwischen Haut und Fleisch aufgeblasen, dann mit Malzzucker eingerieben und getrocknet, bevor sie im Ofen gebraten wird — dadurch wird die Haut besonders knusprig.",
        difficulty = 2,
        funFact = "Peking-Ente wurde bereits in der kaiserlichen Küche der Ming-Dynastie zubereitet."
    ),

    // correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Mapo Tofu' und aus welcher chinesischen Region stammt es?",
        answerA = "Ein milder Tofu-Salat aus der kantonesischen Küche",
        answerB = "Scharfer Tofu mit Schweinehackfleisch in einer Bohnen-Chili-Sauce aus der Sichuan-Küche",
        answerC = "Gedämpfter Tofu mit Austernsoße aus Shanghai",
        answerD = "Gebratener Tofu mit Ingwer und Frühlingszwiebeln aus Peking",
        correctAnswer = 1,
        explanation = "Mapo Tofu ist ein Klassiker der Sichuan-Küche: seidiger Tofu mit Schweinegehacktem in einer scharf-würzigen Sauce aus Doubanjiang (fermentierter Chilibohnenpaste) und Sichuan-Pfeffer.",
        difficulty = 2,
        funFact = "Der Sichuan-Pfeffer erzeugt ein betäubendes Kribbeln auf der Zunge — dieses Gefühl heißt auf Chinesisch 'Má' (麻)."
    ),

    // Thai cuisine — correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Pad Thai' und welche Zutaten gehören zum Original?",
        answerA = "Gebratener Jasminreis mit Basilikum und Hühnchen",
        answerB = "Gebratene Reisnudeln mit Tofu oder Garnelen, Erdnüssen, Ei und Tamarindensauce",
        answerC = "Gedämpfte Glasnudeln mit Sojasauce und Chilipaste",
        answerD = "Weizenudeln in grüner Curry-Kokosmilch-Sauce",
        correctAnswer = 1,
        explanation = "Pad Thai sind gebratene Reisnudeln mit Tofu, Garnelen oder Hühnchen, Ei, Sojasprossen, Frühlingszwiebeln und Erdnüssen. Die Sauce besteht aus Tamarinde, Fischsauce, Palmzucker und Chilipaste.",
        difficulty = 2,
        funFact = null
    ),

    // correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Tom Yum' und was macht diese Suppe besonders?",
        answerA = "Eine milde Kokosmilchsuppe mit Galangal und Zitronengras",
        answerB = "Eine süße Suppe aus Palmzucker und Kokosmilch",
        answerC = "Eine Fischpastensauce über gegartem Reis",
        answerD = "Eine scharfe und saure Suppe mit Garnelen, Zitronengras, Galangal, Kaffir-Limettenblättern und Chili",
        correctAnswer = 3,
        explanation = "Tom Yum ist eine der bekanntesten thailändischen Suppen: scharf und sauer, typischerweise mit Garnelen (Tom Yum Goong), Pilzen, Zitronengras, Galangal, Kaffir-Limettenblättern und Chili.",
        difficulty = 2,
        funFact = "Tom Yum Goong wurde 2011 von CNN Travel zu einem der 50 köstlichsten Speisen der Welt gewählt."
    ),

    // Korean cuisine — correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Kimchi' und wie wird es hergestellt?",
        answerA = "Ein koreanisches Reisgebäck mit rotem Pfeffer",
        answerB = "Fermentiertes Gemüse — meist Chinakohl — mit Chili, Knoblauch, Ingwer und Fischsauce",
        answerC = "Ein gebratenes Fleischgericht in süß-scharfer Marinade",
        answerD = "Eine koreanische Sesamöl-Salatsauce",
        correctAnswer = 1,
        explanation = "Kimchi ist fermentiertes Gemüse — klassisch Chinakohl — das mit einer Paste aus Gochugaru (Chiliflakes), Knoblauch, Ingwer, Frühlingszwiebeln und Fischsauce eingerieben und fermentiert wird.",
        difficulty = 2,
        funFact = "In Südkorea liegt der jährliche Kimchi-Verbrauch bei über 1,7 Millionen Tonnen."
    ),

    // correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Bibimbap' in der koreanischen Küche?",
        answerA = "Eine Schüssel mit Reis, gemischtem Gemüse, Fleisch, einem Ei und Gochujang-Sauce",
        answerB = "Ein koreanischer Reisschnaps aus fermentierten Süßkartoffeln",
        answerC = "Ein koreanisches Suppengebäck aus Maismehl",
        answerD = "Gebratene Reisnudeln mit Sesam und Sojasoße",
        correctAnswer = 0,
        explanation = "Bibimbap (bedeutet 'gemischter Reis') ist eine Schüssel mit Dampfreis, sautierten Gemüsesorten, Fleisch, einem Spiegelei und Gochujang (koreanische Chilipaste), die vor dem Essen vermischt werden.",
        difficulty = 2,
        funFact = null
    ),

    // Middle Eastern cuisine — correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Hummus' und aus welchen Hauptzutaten besteht er?",
        answerA = "Eine türkische Joghurtcreme mit Minze und Gurken",
        answerB = "Eine libanesische Linsencreme mit Kreuzkümmel",
        answerC = "Eine Paste aus Kichererbsen, Tahini, Zitronensaft, Knoblauch und Olivenöl",
        answerD = "Eine arabische Auberginenpaste mit Sesam",
        correctAnswer = 2,
        explanation = "Hummus ist eine Paste aus pürierten Kichererbsen, Tahini (Sesampaste), Zitronensaft, Knoblauch und Olivenöl. Er ist ein Grundnahrungsmittel in der levantinischen und arabischen Küche.",
        difficulty = 2,
        funFact = "Der Name 'Hummus' kommt aus dem Arabischen und bedeutet schlicht 'Kichererbsen'."
    ),

    // correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Shakshuka' und aus welcher Region stammt es?",
        answerA = "Pochierte Eier in einer würzigen Tomatensauce mit Chili, ursprünglich aus Nordafrika und dem Nahen Osten",
        answerB = "Spiegelei auf getoastetem Fladenbrot aus dem Libanon",
        answerC = "Gerührte Eier mit Paprika und Labneh aus dem Iran",
        answerD = "Hartgekochte Eier in einer Joghurtsauce aus der Türkei",
        correctAnswer = 0,
        explanation = "Shakshuka sind in Tomatensauce pochierte Eier, gewürzt mit Paprika, Kreuzkümmel und Chili. Es stammt aus der nordafrikanischen und levantinischen Küche und ist heute ein weltweiter Frühstücksklassiker.",
        difficulty = 2,
        funFact = "In Israel gilt Shakshuka als eines der Nationalgerichte und ist fester Bestandteil des israelischen Frühstücks."
    ),

    // correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Falafel' und aus welchen Zutaten besteht es?",
        answerA = "Gebratene Linsenbällchen aus dem Irak",
        answerB = "Gebackene Teigbällchen mit Fleischfüllung aus dem Jemen",
        answerC = "Gedämpfte Reisklöße mit Sesampaste aus Palästina",
        answerD = "Frittierte Bällchen aus Kichererbsen oder Saubohnen mit Kräutern und Gewürzen",
        correctAnswer = 3,
        explanation = "Falafel sind frittierte Bällchen aus gemahlenen Kichererbsen (oder Saubohnen), gemischt mit Kräutern wie Koriander und Petersilie sowie Gewürzen. Sie sind ein verbreitetes Street Food im Nahen Osten.",
        difficulty = 2,
        funFact = null
    ),

    // Spanish cuisine — correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Paella' und aus welcher spanischen Region stammt das Originalgericht?",
        answerA = "Ein Schmorragout aus Katalonien mit Safran",
        answerB = "Ein Reisgericht aus der Region Valencia, ursprünglich mit Kaninchen, Huhn und Bohnen",
        answerC = "Ein Fischtopf aus Andalusien mit Paprika",
        answerD = "Ein gebratener Reiseintopf aus Madrid mit Chorizo",
        correctAnswer = 1,
        explanation = "Paella stammt aus der Region Valencia. Das Original (Paella Valenciana) enthält keine Meeresfrüchte, sondern Kaninchen, Huhn, grüne und weiße Bohnen sowie Safranreis.",
        difficulty = 2,
        funFact = "Der Name 'Paella' bezeichnet eigentlich die flache Pfanne, in der das Gericht zubereitet wird."
    ),

    // correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Gazpacho' und aus welcher Region Spaniens kommt es?",
        answerA = "Eine kalte Tomaten-Gemüsesuppe aus Andalusien",
        answerB = "Eine heiße Kartoffelsuppe aus dem Baskenland",
        answerC = "Ein kalter Fischfond aus Galicien",
        answerD = "Eine kalte Sahnesuppe mit Spargel aus Kastilien",
        correctAnswer = 0,
        explanation = "Gazpacho ist eine kalte Suppe aus Tomaten, Gurken, Paprika, Zwiebeln, Knoblauch, Olivenöl und Essig. Es stammt aus Andalusien und ist ein erfrischendes Sommergericht.",
        difficulty = 2,
        funFact = "Gazpacho wurde ursprünglich als Brot-Wasser-Suppe von andalusischen Bauern zubereitet — Tomaten kamen erst nach der Entdeckung Amerikas hinzu."
    ),

    // Greek cuisine — correctAnswer 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Moussaka' in der griechischen Küche?",
        answerA = "Ein gegrilltes Lammfleisch mit Joghurt-Dip",
        answerB = "Ein gedünstetes Gemüsegericht mit Feta-Käse",
        answerC = "Ein überbackener Auflauf aus Auberginen, Hackfleisch und Béchamelsauce",
        answerD = "Eine Weinblätter-Roullade gefüllt mit Reis und Kräutern",
        correctAnswer = 2,
        explanation = "Moussaka ist ein griechischer Auflauf aus geschichteten Auberginen, Hackfleisch (meist Lamm) mit Tomaten und Gewürzen, bedeckt mit einer dicken Béchamelsauce und im Ofen überbacken.",
        difficulty = 2,
        funFact = null
    ),

    // correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was sind 'Dolmades' in der griechischen und türkischen Küche?",
        answerA = "In Weinblätter gerollte Päckchen mit Reis, Kräutern und manchmal Fleisch",
        answerB = "Kleine frittierte Käsebällchen mit Honig",
        answerC = "Gegrillte Gemüsespieße mit Olivenöl und Oregano",
        answerD = "Überbackene Schafskäse-Häppchen mit Tomaten",
        correctAnswer = 0,
        explanation = "Dolmades (griechisch) oder Dolma (türkisch) sind in Weinblätter gerollte Füllungen aus Reis, Kräutern, Pinienkernen und manchmal Hackfleisch. Sie werden gedämpft oder in Brühe gegart.",
        difficulty = 2,
        funFact = "Das Wort 'Dolma' kommt aus dem Türkischen und bedeutet 'gefüllt' — es gibt Varianten mit Paprika, Zucchini, Tomaten oder Weinblättern."
    ),

    // Japanese — correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Tempura' und woher stammt diese Zubereitungsart?",
        answerA = "Eine Grillmethode für Fisch, entwickelt in Japan im 16. Jahrhundert",
        answerB = "In leichtem Ausbackteig frittierte Meeresfrüchte und Gemüse, ursprünglich von portugiesischen Missionaren eingeführt",
        answerC = "Ein Dampfgaren von Meeresfrüchten in Bambusdämpfern",
        answerD = "Eine Marinadenmethode mit Sojasoße und Mirin",
        correctAnswer = 1,
        explanation = "Tempura ist in einem hauchdünnen, kalt angerührten Teig frittiertes Gemüse und Meeresfrüchte. Die Technik wurde im 16. Jahrhundert von portugiesischen Missionaren nach Japan gebracht.",
        difficulty = 2,
        funFact = "Das Wort 'Tempura' leitet sich wahrscheinlich vom lateinischen 'tempora' (Fastenzeiten) ab."
    ),

    // correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Yakitori' in der japanischen Küche?",
        answerA = "Gedämpfte Hühnchen-Knödel mit Dashi-Brühe",
        answerB = "Frittiertes Hühnchen in einer süß-sauren Sauce",
        answerC = "Mariniertes Hähnchen in Miso-Paste, im Ofen überbacken",
        answerD = "Gegrillte Hähnchenspieße über Holzkohle, gewürzt mit Tare-Sauce oder Salz",
        correctAnswer = 3,
        explanation = "Yakitori sind kleine Hähnchenspieße, die über Binchotan-Holzkohle gegrillt werden. Sie werden entweder mit Tare (einer süß-herzhaften Sojasoßenglasur) oder Shio (Salz) gewürzt.",
        difficulty = 2,
        funFact = null
    ),

    // Vietnamese cuisine — correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Pho' und was macht die Brühe besonders?",
        answerA = "Ein gebratenes Reistopf-Gericht aus Südvietnam mit Kokosmilch",
        answerB = "Eine vietnamesische Nudelsuppe mit stundenlang gekochter Brühe und Gewürzen wie Sternanis und Zimt",
        answerC = "Eine saure Fischsuppe mit Tamarinde aus Nordvietnam",
        answerD = "Ein gebratenes Reisnudelgericht mit Zitronengras und Chilisauce",
        correctAnswer = 1,
        explanation = "Pho ist eine vietnamesische Nudelsuppe mit Reisnudeln und einer klaren, aromatischen Brühe, die viele Stunden aus Rinderknochen mit Sternanis, Zimt, Ingwer und Fischsauce gekocht wird.",
        difficulty = 2,
        funFact = "Pho stammt aus Nordvietnam (Hanoi). Die südvietnamesische Version (Pho Saigon) ist süßlicher und wird mit mehr Beilagen serviert."
    ),

    // Moroccan cuisine — correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Tajine' in der marokkanischen Küche?",
        answerA = "Ein flaches Fladenbrot aus Hartweizengrieß",
        answerB = "Eine Würzpaste aus Chili, Koriander und Kreuzkümmel",
        answerC = "Ein Minz-Teegetränk mit Zucker aus dem Atlas-Gebirge",
        answerD = "Ein Schmorgericht, das in einem konisch gedeckelten Tontopf gegart wird",
        correctAnswer = 3,
        explanation = "Tajine ist sowohl der Name des konischen Tontopfes als auch des darin zubereiteten Schmorgerichts. Durch den spitzen Deckel kondensiert der Dampf und fällt zurück — das Gericht schmort im eigenen Sud.",
        difficulty = 2,
        funFact = null
    ),

    // correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ras el Hanout' in der nordafrikanischen Küche?",
        answerA = "Eine komplexe Gewürzmischung aus bis zu 30 Gewürzen, typisch für die maghrebinische Küche",
        answerB = "Eine fermentierte Chilisauce aus Tunesien",
        answerC = "Eine getrocknete Rosenblüte zum Aromatisieren von Desserts",
        answerD = "Ein frisch zubereitetes Kräuteröl mit Minze und Zitrone",
        correctAnswer = 0,
        explanation = "Ras el Hanout ist eine marokkanische Gewürzmischung, die je nach Händler bis zu 30 verschiedene Gewürze enthält, darunter Kardamom, Zimt, Kurkuma, Nelken und Piment.",
        difficulty = 2,
        funFact = "Der Name bedeutet auf Arabisch 'Kopf des Ladens' — also die beste Auswahl des Gewürzhändlers."
    ),

    // Peruvian cuisine — correctAnswer 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ceviche' und welches Prinzip steckt hinter seiner Zubereitung?",
        answerA = "Gebratener Fisch in einer Limonenmarinade, traditionell aus Mexiko",
        answerB = "Gedämpfter Fisch mit Avocado und scharfer Salsa aus Ecuador",
        answerC = "Roher Fisch, der durch die Säure von Limettensaft chemisch 'gegart' wird, typisch für Peru",
        answerD = "Marinierter gebratener Fisch in Essigsud aus Chile",
        correctAnswer = 2,
        explanation = "Ceviche ist rohes Fischfleisch, das durch die Säure von Limettensaft denaturiert (chemisch 'gegart') wird. Das peruanische Nationalgericht enthält zudem rote Zwiebeln, Ají-Chili und Koriander.",
        difficulty = 2,
        funFact = "Der 28. Juni ist offizieller 'Ceviche-Tag' in Peru."
    ),

    // Ethiopian cuisine — correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Injera' in der äthiopischen Küche?",
        answerA = "Eine scharfe Linsensauce mit Chili und Zwiebeln",
        answerB = "Ein schwammartig-säuerliches Fladenbrot aus fermentiertem Teffmehl",
        answerC = "Ein mit Kräutern gefülltes Lammgericht",
        answerD = "Ein süßes Gebäck aus Honig und Gewürzen",
        correctAnswer = 1,
        explanation = "Injera ist ein schwammiges, leicht säuerliches Fladenbrot aus fermentiertem Teff-Mehl. Es dient gleichzeitig als Teller und Esswerkzeug — Speisen werden darauf gelegt und zusammen damit gegessen.",
        difficulty = 2,
        funFact = null
    ),

    // Turkish cuisine — correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Baklava' und in welchen Küchen ist es verbreitet?",
        answerA = "Ein süßes Gebäck aus hauchdünnen Filoteigschichten, gefüllt mit Nüssen und getränkt in Zuckersirup oder Honig",
        answerB = "Ein türkisches Reisdessert mit Pistazien und Rosenwasser",
        answerC = "Ein frittiertes Kichererbsengebäck mit Puderzucker",
        answerD = "Eine türkische Milchreis-Variante mit Mandeln",
        correctAnswer = 0,
        explanation = "Baklava ist ein vielschichtiges Gebäck aus Filoteig, gefüllt mit gehackten Nüssen (Pistazien, Walnüsse) und getränkt in Zuckersirup oder Honig. Es ist in der türkischen, griechischen, arabischen und persischen Küche verbreitet.",
        difficulty = 2,
        funFact = null
    ),

    // Japanese — Wagyu — correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Wagyu' und was macht dieses Rindfleisch besonders?",
        answerA = "Ein besonderes Zubereitungsverfahren für Rindfleisch mit Sojasoße",
        answerB = "Eine Rinderrasse aus Argentinien, die in Japan gezüchtet wird",
        answerC = "Ein Rindfleisch aus Hokkaido, das auf Grasweide aufwächst",
        answerD = "Japanische Rinderrassen mit genetisch bedingter hoher intramuskulärer Fettmarmorierung",
        correctAnswer = 3,
        explanation = "Wagyu bezeichnet japanische Rinderrassen (wa = japanisch, gyu = Rind), die eine genetisch bedingte starke intramuskuläre Fettmarmorierung aufweisen. Das Fett verleiht dem Fleisch eine buttrig-zarte Textur.",
        difficulty = 2,
        funFact = "Echtes Kobe-Rindfleisch ist eine spezifische Wagyu-Unterart (Tajima-Rind) aus der Präfektur Hyogo."
    ),

    // German regional — correctAnswer 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Sauerbraten' und wie wird er traditionell zubereitet?",
        answerA = "Saures Schweinebraten aus Bayern mit Weißbiersauce",
        answerB = "Gebratenes Rindfleisch mit saurer Gurkensauce aus dem Rheinland",
        answerC = "Rindfleisch, das mehrere Tage in Essig-Gewürz-Marinade eingelegt und dann geschmort wird",
        answerD = "In Buttermilch eingelegtes Kalbfleisch aus Schwaben",
        correctAnswer = 2,
        explanation = "Sauerbraten ist ein deutsches Schmorgericht: Rindfleisch wird 3–7 Tage in einer Marinade aus Essig, Rotwein, Lorbeer und Gewürzen eingelegt und dann in diesem Sud langsam geschmort.",
        difficulty = 2,
        funFact = null
    ),

    // Brazilian — correctAnswer 1
    Question(
        categoryId = 8,
        questionText = "Was ist 'Feijoada' in der brasilianischen Küche?",
        answerA = "Ein Cocktail aus Cachaça, Limette und Zucker",
        answerB = "Ein Schwarzbohneneintopf mit verschiedenen Schweinefleischstücken, das Nationalgericht Brasiliens",
        answerC = "Ein gebratenes Rindfleischgericht mit Maniokkruste",
        answerD = "Ein süßes Reisdessert mit Kokosmilch und Zimt",
        correctAnswer = 1,
        explanation = "Feijoada ist der brasilianische Schwarzbohneneintopf mit verschiedenen Schweinefleisch- und Wurststücken, serviert mit Reis, Farofa (Maniokmehl), Orangenscheiben und Kohl.",
        difficulty = 2,
        funFact = "Feijoada hat seinen Ursprung möglicherweise bei den versklavten Menschen Brasiliens, die die weniger begehrten Schweineteile verarbeiteten."
    ),

    // Swiss — correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Welches Gericht ist das bekannteste Nationalgericht der Schweiz und aus welchem Kanton stammt die Tradition?",
        answerA = "Rösti — ein Kartoffelgericht, das ursprünglich aus dem Kanton Bern kommt",
        answerB = "Fondue — ein Käsegericht aus Genf",
        answerC = "Zürcher Geschnetzeltes — ein Kalbfleischgericht aus Zürich",
        answerD = "Raclette — ein Käsegericht aus dem Wallis",
        correctAnswer = 0,
        explanation = "Rösti ist ein flaches, knuspriges Kartoffelgericht und gilt als inoffizielles Nationalgericht der Schweiz. Es stammt aus dem Kanton Bern, wo es traditionell ein einfaches Bauernfrühstück war.",
        difficulty = 2,
        funFact = "Der sogenannte 'Röstigraben' bezeichnet auch die kulturelle Trennlinie zwischen deutsch- und französischsprachiger Schweiz."
    ),

    // Jamaican — correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Jerk' in der jamaikanischen Küche?",
        answerA = "Ein Schnellgrill-Verfahren für Fisch aus der Karibik",
        answerB = "Eine süße Karamellisierungstechnik für karibische Früchte",
        answerC = "Ein fermentiertes Hühnchengewürz aus Barbados",
        answerD = "Eine traditionelle Marinier- und Räuchermethode mit Scotch-Bonnet-Chili und Piment",
        correctAnswer = 3,
        explanation = "Jamaican Jerk ist eine Methode, Fleisch (meist Hähnchen oder Schwein) in einer Paste aus Scotch-Bonnet-Chili, Piment (Allspice), Thymian, Knoblauch und Ingwer zu marinieren und über Pimentholz zu räuchern.",
        difficulty = 2,
        funFact = null
    ),

    // Italian — Prosciutto — correctAnswer 2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Prosciutto di Parma' und was macht ihn besonders?",
        answerA = "Ein gekochter Schinken aus der Toskana mit Kräutern",
        answerB = "Ein geräucherter Bergschinken aus dem Trentino",
        answerC = "Ein luftgetrockneter Rohschinken aus der Provinz Parma, der mindestens 12 Monate reift",
        answerD = "Ein gepökelter Schweinebauch ähnlich wie Pancetta",
        correctAnswer = 2,
        explanation = "Prosciutto di Parma ist ein luftgetrockneter Rohschinken aus der Provinz Parma in der Emilia-Romagna. Er wird nur mit Salz gewürzt und mindestens 12 Monate gereift.",
        difficulty = 2,
        funFact = "Echter Prosciutto di Parma trägt die Herzmarke des Parma-Konsortiums — nur Schinken aus einem definierten Gebiet darf diesen Namen tragen."
    ),

    // Canadian — correctAnswer 0
    Question(
        categoryId = 8,
        questionText = "Was ist 'Poutine' und aus welchem Land stammt es?",
        answerA = "Pommes Frites mit Käsekrümeln (Cheese Curds) und Bratensauce, ein Gericht aus dem kanadischen Québec",
        answerB = "Pommes Frites mit Fleischklößen, ein belgisches Straßenessen",
        answerC = "Gebratene Kartoffeln mit saurer Sahne und Kaviar aus Russland",
        answerD = "Frittierte Kartoffelwürfel mit Ketchup und Mayonnaise aus den USA",
        correctAnswer = 0,
        explanation = "Poutine ist ein kanadisches Gericht aus der Provinz Québec: Pommes Frites werden mit frischen Käsekrümeln (Cheddar Curds) bedeckt und mit heißer Bratensauce (Gravy) übergossen.",
        difficulty = 2,
        funFact = null
    ),

    // Spanish — Sofrito — correctAnswer 3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Sofrito' in der spanischen und lateinamerikanischen Küche?",
        answerA = "Eine Methode, Fleisch über Fruchtholz zu räuchern",
        answerB = "Ein würziges Brot aus Spanien, das mit Olivenöl bestrichen wird",
        answerC = "Ein spanischer Weißweinessig für Marinaden",
        answerD = "Eine Aromabasis aus langsam geröstetem Gemüse (Zwiebeln, Knoblauch, Tomaten, Paprika)",
        correctAnswer = 3,
        explanation = "Sofrito ist eine aromatische Gemüsebasis, die durch langsames Braten von Zwiebeln, Knoblauch, Tomaten und Paprika entsteht. Sie ist die Grundlage für Paella, Fabada und viele weitere Gerichte.",
        difficulty = 2,
        funFact = "Jede Küche Lateinamerikas hat ihre eigene Sofrito-Variante — in Puerto Rico wird sie mit Koriander und Ají Dulce zubereitet."
    ),

)
