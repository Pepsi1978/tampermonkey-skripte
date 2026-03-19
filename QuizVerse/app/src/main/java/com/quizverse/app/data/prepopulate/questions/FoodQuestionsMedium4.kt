package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMedium4(): List<Question> = listOf(

    // Wein – Rebsorten & Regionen
    Question(
        categoryId = 8,
        questionText = "Welche Rebsorte dominiert den deutschen Weinbau flächenmäßig?",
        answerA = "Riesling",
        answerB = "Müller-Thurgau",
        answerC = "Chardonnay",
        answerD = "Spätburgunder",
        correctAnswer = 0,
        explanation = "Riesling ist die bedeutendste deutsche Weißweinsorte und macht rund 23 % der deutschen Rebfläche aus. Deutschland ist weltweit der größte Riesling-Produzent.",
        difficulty = 2,
        funFact = "Der beste deutsche Riesling wächst an steilen Schieferhängen der Mosel, wo die dunklen Steine die Sonnenwärme speichern."
    ),

    Question(
        categoryId = 8,
        questionText = "Aus welcher Region stammt der berühmte Barolo-Wein?",
        answerA = "Toskana, Italien",
        answerB = "Piemont, Italien",
        answerC = "Burgund, Frankreich",
        answerD = "Rioja, Spanien",
        correctAnswer = 1,
        explanation = "Barolo ist ein Rotwein aus der Region Piemont im Nordwesten Italiens und wird aus der Nebbiolo-Traube hergestellt. Er gilt als einer der größten Rotweine der Welt.",
        difficulty = 2,
        funFact = "Barolo wird oft als 'König der Weine und Wein der Könige' bezeichnet – er war im 19. Jahrhundert am Hof des Hauses Savoyen beliebt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was bezeichnet man beim Wein als 'Terroir'?",
        answerA = "Die Technik des Weinkelterers",
        answerB = "Die Reifedauer im Eichenfass",
        answerC = "Das Zusammenspiel von Boden, Klima, Lage und menschlichem Einfluss auf den Wein",
        answerD = "Den Restzuckergehalt eines Weines",
        correctAnswer = 2,
        explanation = "Terroir beschreibt das komplexe Zusammenspiel von Bodenbeschaffenheit, Kleinklima, Hanglage, Sonnenexposition und Weinbautradition, das jedem Wein seinen einzigartigen Charakter verleiht.",
        difficulty = 2,
        funFact = "Das Konzept des Terroir ist vor allem im Burgund (Frankreich) ausgeprägt – einzelne Weinberge werden seit Jahrhunderten parzelliert und benannt."
    ),

    Question(
        categoryId = 8,
        questionText = "Welche Traube ist die Basis für den Wein Amarone della Valpolicella?",
        answerA = "Sangiovese",
        answerB = "Montepulciano",
        answerC = "Primitivo",
        answerD = "Corvina",
        correctAnswer = 3,
        explanation = "Amarone wird hauptsächlich aus der Corvina-Traube gekeltert. Die Besonderheit: Die Trauben werden nach der Ernte auf Rosten getrocknet (Appassimento), wodurch sie konzentrierter werden.",
        difficulty = 2,
        funFact = "Amarone kann durch die Appassimento-Methode Alkoholwerte von 15–17 % erreichen und bis zu 5 Jahre Kelterung benötigen."
    ),

    // Sekt, Champagner & Schaumwein
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet die 'Méthode Champenoise' von der Charmat-Methode bei der Sektherstellung?",
        answerA = "Bei der Méthode Champenoise gärt der Wein ein zweites Mal in der Flasche, bei Charmat im Drucktank",
        answerB = "Bei der Méthode Champenoise gärt der Wein ein zweites Mal im Tank, bei Charmat in der Flasche",
        answerC = "Beide Methoden sind identisch, nur der Name unterscheidet sich",
        answerD = "Bei der Charmat-Methode wird Kohlensäure künstlich zugesetzt",
        correctAnswer = 0,
        explanation = "Die traditionelle Flaschengärung lässt den Wein in der Flasche ein zweites Mal gären, was feinere Perlen und komplexere Aromen erzeugt. Charmat nutzt geschlossene Drucktanks – schneller und günstiger.",
        difficulty = 2,
        funFact = "Prosecco wird fast ausschließlich nach der Charmat-Methode hergestellt, während Champagner zwingend die Flaschengärung erfordert."
    ),

    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Brut Nature' bei Champagner?",
        answerA = "Champagner aus biologisch-dynamischem Anbau",
        answerB = "Champagner ohne jede Dosage – weniger als 3 g Restzucker pro Liter",
        answerC = "Champagner ohne Schwefelzusatz",
        answerD = "Champagner aus unbehandelten Trauben vor der Lese",
        correctAnswer = 1,
        explanation = "Brut Nature (auch Zero Dosage) bedeutet, dass dem Champagner nach der Degorgierung keine Zucker-Lösung (Dosage) zugefügt wurde. Er enthält weniger als 3 g Restzucker pro Liter.",
        difficulty = 2,
        funFact = "Die Dosage bestimmt maßgeblich den Süßegrad: von Brut Nature (trockenst) über Brut, Extra Dry bis hin zu Demi-Sec (halbsüß)."
    ),

    Question(
        categoryId = 8,
        questionText = "Aus welchen Rebsorten darf echter Champagner hauptsächlich hergestellt werden?",
        answerA = "Nur aus Chardonnay und Pinot Noir",
        answerB = "Ausschließlich aus Chardonnay",
        answerC = "Vor allem Chardonnay, Pinot Noir und Pinot Meunier",
        answerD = "Aus Sauvignon Blanc und Pinot Gris",
        correctAnswer = 2,
        explanation = "Champagner darf offiziell aus sieben Rebsorten hergestellt werden, die drei wichtigsten sind aber Chardonnay, Pinot Noir und Pinot Meunier.",
        difficulty = 2,
        funFact = null
    ),

    // Bier – Sorten & Wissen
    Question(
        categoryId = 8,
        questionText = "Was ist das Besondere an einem 'Weizenbier'?",
        answerA = "Es wird ausschließlich aus Weizen ohne Gerste gebraut",
        answerB = "Es wird kalt vergoren wie ein Lagerbier",
        answerC = "Es enthält kein Hopfen und ist daher süßer",
        answerD = "Es wird mit mindestens 50 % Weizenmalz und obergäriger Hefe gebraut",
        correctAnswer = 3,
        explanation = "Weizenbier (Weißbier) wird mit mindestens 50 % Weizenmalz gebraut und verwendet obergärige Hefe. Die charakteristische Phenol- und Bananennote entsteht durch spezielle Hefestämme.",
        difficulty = 2,
        funFact = "In Bayern war das Recht, Weizenbier zu brauen, bis 1798 ausschließlich dem Herzoghaus vorbehalten."
    ),

    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'obergäriger' und 'untergäriger' Hefe beim Bierbrauen?",
        answerA = "Obergärige Hefe arbeitet bei wärmeren Temperaturen (15–25 °C) und steigt auf, untergärige bei kälteren (4–12 °C) und sinkt ab",
        answerB = "Obergärige Hefe produziert mehr Alkohol als untergärige",
        answerC = "Untergärige Hefe verleiht dem Bier mehr Bitterkeit",
        answerD = "Obergärige Hefe wird nur für dunkle Biere verwendet",
        correctAnswer = 0,
        explanation = "Obergärige Hefen (Saccharomyces cerevisiae) arbeiten bei 15–25 °C und steigen nach der Gärung auf. Untergärige Hefen (S. pastorianus) arbeiten bei 4–12 °C und sinken auf den Boden.",
        difficulty = 2,
        funFact = "Ales (z.B. Stout, Weizen) verwenden obergärige Hefe; Lager und Pils verwenden untergärige."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist ein 'India Pale Ale' (IPA) und woher stammt der Name?",
        answerA = "Ein leichtes indisches Reisbier",
        answerB = "Ein stark gehopftes Ale, das ursprünglich für den Transport nach Indien mit viel Hopfen haltbar gemacht wurde",
        answerC = "Ein dunkles Bier aus der englischen Brauereitradition",
        answerD = "Ein belgisches Bier mit indischen Gewürzen",
        correctAnswer = 1,
        explanation = "IPAs entstanden in England, um Bier für den langen Seetransport nach Indien haltbar zu machen – Hopfen wirkt konservierend. Die hohe Hopfenmenge gibt dem IPA seine charakteristische Bitterkeit.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Stout' und wofür ist Guinness bekannt?",
        answerA = "Ein helles Lagerbier aus Irland mit wenig Alkohol",
        answerB = "Ein belgisches Trappistenbier mit dunkler Farbe",
        answerC = "Ein dunkles, obergäriges Bier mit Röstnoten aus geröstetem Malz oder Gerste",
        answerD = "Ein Weizenbier mit Schokoladengeschmack",
        correctAnswer = 2,
        explanation = "Ein Stout ist ein dunkles, obergäriges Bier, das seine typische schwarze Farbe und den Röstkaffeegeschmack durch geröstetes Malz oder ungemälzte Gerste erhält. Guinness ist das bekannteste irische Dry Stout.",
        difficulty = 2,
        funFact = "Guinness gab früher medizinische Ratschläge in Anzeigen – 'Guinness is good for you' war ein bekannter Werbeslogan der 1920er Jahre."
    ),

    // Spirituosen – Whisky, Rum, Gin
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen 'Scotch Whisky' und 'Irish Whiskey'?",
        answerA = "Scotch wird mindestens 3 Jahre gereift, Irish mindestens 5 Jahre",
        answerB = "Es gibt keinen wesentlichen Unterschied außer der Schreibweise",
        answerC = "Irish Whiskey enthält immer Weizen, Scotch nie",
        answerD = "Scotch wird oft aus Gerstenmalz mit Torfrauch hergestellt; Irish Whiskey ist meist leichter und dreifach destilliert",
        correctAnswer = 3,
        explanation = "Scotch Whisky (ohne 'e') stammt aus Schottland, wird mindestens 3 Jahre gereift und verwendet oft Torfrauch. Irish Whiskey (mit 'e') ist meistens dreifach destilliert, weicher und wird ebenfalls mindestens 3 Jahre gereift.",
        difficulty = 2,
        funFact = "Die Schreibweise verrät oft die Herkunft: Schottland und Japan schreiben 'Whisky', Irland und Amerika 'Whiskey'."
    ),

    Question(
        categoryId = 8,
        questionText = "Aus welchem Ausgangsstoff wird Rum hergestellt?",
        answerA = "Aus Zuckerrohr – entweder Zuckerrohrmelasse oder frischem Zuckerrohrsaft",
        answerB = "Aus fermentiertem Mais",
        answerC = "Aus Agave",
        answerD = "Aus vergorenem Reissirup",
        correctAnswer = 0,
        explanation = "Rum wird ausschließlich aus Produkten des Zuckerrohrs hergestellt: entweder aus Melasse (dem Nebenprodukt der Zuckerherstellung) oder aus frisch gepresstem Zuckerrohrsaft (Rhum Agricole).",
        difficulty = 2,
        funFact = "Rhum Agricole aus frischem Zuckerrohrsaft, vor allem aus Martinique und Guadeloupe, hat eine geschützte Herkunftsbezeichnung."
    ),

    Question(
        categoryId = 8,
        questionText = "Was macht einen 'London Dry Gin' besonders?",
        answerA = "Er muss in London hergestellt werden",
        answerB = "Er darf keine künstlichen Aromen enthalten und muss Wacholder als dominante Note haben",
        answerC = "Er wird aus Londoner Leitungswasser destilliert",
        answerD = "Er enthält keinen Zucker und weniger als 37,5 % Alkohol",
        correctAnswer = 1,
        explanation = "London Dry Gin ist eine Stilbezeichnung, kein geografischer Herkunftsschutz. Er darf nach der Destillation keine künstlichen Aromen, Farbstoffe oder Süßungsmittel erhalten. Wacholder (Juniper) muss dominieren.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Aus welcher Pflanze wird Tequila hergestellt?",
        answerA = "Aus dem Kaktus",
        answerB = "Aus Zuckerrohr",
        answerC = "Aus der Blauen Weber-Agave",
        answerD = "Aus Mais und Agave",
        correctAnswer = 2,
        explanation = "Tequila darf nur aus dem Herzen (Piña) der Blauen Weber-Agave (Agave tequilana) hergestellt werden und nur in bestimmten Regionen Mexikos, hauptsächlich im Bundesstaat Jalisco.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Cognac' und wie unterscheidet er sich von gewöhnlichem Brandy?",
        answerA = "Cognac ist ein spanischer Brandy mit geschützter Herkunft",
        answerB = "Cognac ist ein Apfelbrand aus der Normandie",
        answerC = "Cognac wird aus Calvados und Weinbrand verschnitten",
        answerD = "Cognac ist ein geschützter französischer Weinbrand aus der Region Cognac, der in Eichenfässern gereift wird",
        correctAnswer = 3,
        explanation = "Cognac ist ein geschützter Weinbrand (AOC) aus der Region Cognac im Département Charente in Frankreich. Er wird zweifach destilliert und in Eichenfässern aus dem Limousin oder der Tronçais-Region gereift.",
        difficulty = 2,
        funFact = "VS bedeutet mindestens 2 Jahre, VSOP mindestens 4 Jahre und XO mindestens 10 Jahre Mindestreifezeit."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Mezcal' und wie unterscheidet er sich von Tequila?",
        answerA = "Mezcal kann aus verschiedenen Agavensorten hergestellt werden und hat oft eine Rauchnote durch das Garen in Erdöfen",
        answerB = "Mezcal wird aus Kaktusfrüchten destilliert",
        answerC = "Mezcal ist ein anderer Name für Tequila",
        answerD = "Mezcal ist ein süßerer Likör aus Agave",
        correctAnswer = 0,
        explanation = "Mezcal ist der Oberbegriff für alle Agavenbrände in Mexiko. Tequila ist ein Untertyp. Mezcal darf aus über 30 Agavensorten hergestellt werden. Die Erdöfen-Methode verleiht vielen Mezcals ihren charakteristischen Rauch.",
        difficulty = 2,
        funFact = "Die Raupe im Mezcal-Flasche ist kein traditionelles Qualitätsmerkmal, sondern ein Marketingtrick aus den 1950er Jahren."
    ),

    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Bourbon Whiskey'?",
        answerA = "Ein irischer Whiskey, der in Bourbon-Fässern reift",
        answerB = "Ein amerikanischer Whiskey mit mindestens 51 % Mais, der in neuen ausgekohlten Eichenholzfässern reift",
        answerC = "Ein Bourbon aus der Stadt Bourbon in Frankreich",
        answerD = "Ein Whiskey, der mit Karamell gefärbt wurde",
        correctAnswer = 1,
        explanation = "Bourbon ist ein amerikanischer Whiskey, der mindestens 51 % Mais enthält, bei maximal 80 % Vol. in neue ausgekohlte Eichenfässer gefüllt und auf mindestens 62,5 % Vol. abgefüllt wird. Er muss in den USA hergestellt werden.",
        difficulty = 2,
        funFact = "Über 95 % aller Bourbon-Produktion findet in Kentucky statt."
    ),

    // Cocktails & Mixologie
    Question(
        categoryId = 8,
        questionText = "Was sind die Zutaten eines klassischen 'Negroni'?",
        answerA = "Vodka, Campari, Rosso Vermouth",
        answerB = "Bourbon, Aperol, Weißwermut",
        answerC = "Gin, Campari, roter Wermut – zu gleichen Teilen",
        answerD = "Rum, Campari, Prosecco",
        correctAnswer = 2,
        explanation = "Der Negroni besteht aus gleichen Teilen Gin, Campari und rotem Wermut. Er wird auf Eis gerührt und mit einer Orangenscheibe garniert.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Old Fashioned'?",
        answerA = "Ein Cocktail aus Rum, Zucker und Zitronensaft",
        answerB = "Ein viktorianischer Brandy-Cocktail mit Tawny Port",
        answerC = "Ein Gin-Cocktail mit Holunderblütenlikör",
        answerD = "Einer der ältesten Cocktails: Bourbon oder Rye Whiskey mit Zuckerwürfel, Angostura Bitters und Orangenschale",
        correctAnswer = 3,
        explanation = "Der Old Fashioned gilt als einer der ältesten Cocktails überhaupt (ca. 1880er). Er besteht aus Bourbon oder Rye Whiskey, einem Zuckerwürfel, Angostura Bitters und wird mit Orangenschale aromatisiert.",
        difficulty = 2,
        funFact = "Don Draper aus der Serie Mad Men machte den Old Fashioned wieder berühmt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Angostura Bitters' und wofür wird es verwendet?",
        answerA = "Ein hochkonzentriertes aromatisches Bittermittel aus Venezuela/Trinidad, das in kleinen Mengen Cocktails würzt",
        answerB = "Ein Erfrischungsgetränk aus Trinidad",
        answerC = "Ein Kräuterlikör wie Jägermeister",
        answerD = "Eine alkoholfreie Cocktailzutat aus Orangenschalen",
        correctAnswer = 0,
        explanation = "Angostura Bitters ist ein hochprozentiger (44,7 %) aromatischer Bitterextrakt aus Kräutern und Gewürzen. Er wird in kleinen Mengen (Dashes) als Aromaverstärker in Cocktails wie Old Fashioned verwendet.",
        difficulty = 2,
        funFact = null
    ),

    // Kaffee – Wissen & Zubereitung
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Arabica und Robusta Kaffee?",
        answerA = "Arabica enthält mehr Koffein und ist daher stärker",
        answerB = "Arabica wächst in höheren Lagen, hat weniger Koffein und feinere Aromen; Robusta ist kräftiger und bitterer",
        answerC = "Robusta ist die Premium-Sorte für Spezialitätenkaffee",
        answerD = "Beide Sorten sind botanisch identisch, nur der Anbauort unterscheidet sich",
        correctAnswer = 1,
        explanation = "Arabica wächst auf 600–2100 m, enthält ca. 1–1,5 % Koffein und hat komplexe Frucht- und Blumenaromen. Robusta wächst tiefer, enthält 2–4 % Koffein und schmeckt kräftiger und bitterer.",
        difficulty = 2,
        funFact = "Robusta wird oft Espresso-Blends beigemischt – er sorgt für mehr Crema und einen intensiveren Körper."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Espresso' technisch gesehen?",
        answerA = "Sehr stark konzentrierter Filterkaffee",
        answerB = "Kaffee aus besonders dunklem Röstgrad ohne Filtration",
        answerC = "Kaffee, der durch Druck (ca. 9 bar) heißes Wasser durch fein gemahlenes Kaffeepulver treibt",
        answerD = "Kaffee aus einer Bialetti-Mokkakanne",
        correctAnswer = 2,
        explanation = "Espresso entsteht durch Hochdruckextraktion: ca. 9 Bar Druck treibt 90 °C heißes Wasser in ca. 25–30 Sekunden durch 7–9 g fein gemahlenes Kaffeepulver, was 25–30 ml konzentriertes Getränk ergibt.",
        difficulty = 2,
        funFact = "Die goldene Crema auf dem Espresso besteht aus emulgierten Kaffeeölen und CO₂-Blasen."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Kopi Luwak' und warum ist er so teuer?",
        answerA = "Ein seltener äthiopischer Kaffee aus Bergregionen über 3000 m",
        answerB = "Ein Kaffee, der aus einer einzigen Plantage auf Java stammt",
        answerC = "Ein indonesischer Kaffee mit besonderer Trockenmethode",
        answerD = "Ein Kaffee, dessen Bohnen vom Luwak (Zibetkatze) gefressen und unverdaut ausgeschieden werden – einer der teuersten Kaffees der Welt",
        correctAnswer = 3,
        explanation = "Kopi Luwak kommt aus Indonesien. Der Palmroller (Luwak) frisst Kaffeekirschen, verdaut das Fruchtfleisch, scheidet aber die Bohnen aus. Die Enzyme sollen die Bohnen milder und weniger bitter machen.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was versteht man unter der 'dritten Kaffeewelle'?",
        answerA = "Eine Bewegung, die Kaffee als handwerkliches Produkt behandelt, mit Fokus auf Herkunft, Röstung und Zubereitung",
        answerB = "Die Entstehung von Café-Ketten wie Starbucks",
        answerC = "Die Einführung von Instant-Kaffee in den 1950er Jahren",
        answerD = "Die Einführung von Kaffeekapseln",
        correctAnswer = 0,
        explanation = "Die dritte Kaffeewelle (ab ca. 2000er) behandelt Kaffee ähnlich wie Wein: Herkunft, Anbauregion, Verarbeitungsmethode und Röstprofil werden in den Vordergrund gestellt.",
        difficulty = 2,
        funFact = "Die erste Welle war der Aufstieg des Massenkaffees (Folgers, Nescafé), die zweite die Entstehung von Coffee-House-Ketten wie Starbucks."
    ),

    // Tee – Wissen & Sorten
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen grünem und schwarzem Tee?",
        answerA = "Grüner Tee stammt von einer anderen Pflanze als schwarzer Tee",
        answerB = "Grüner Tee wird nicht oxidiert, schwarzer Tee wird vollständig oxidiert – beide kommen von Camellia sinensis",
        answerC = "Schwarzer Tee enthält mehr Koffein durch eine andere Erntesaison",
        answerD = "Grüner Tee wird kalt aufgebrüht, schwarzer Tee heiß",
        correctAnswer = 1,
        explanation = "Beide Teesorten kommen von Camellia sinensis. Grüner Tee wird sofort fixiert (keine Oxidation). Schwarzer Tee wird vollständig oxidiert, was die dunkle Farbe und kräftigen Aromen ergibt.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Matcha' und wie unterscheidet er sich von normalem grünen Tee?",
        answerA = "Matcha enthält kein Koffein und ist daher für den Abend geeignet",
        answerB = "Matcha ist ein chinesischer Tee aus der Provinz Yunnan",
        answerC = "Matcha ist ein japanischer Tee, bei dem die Teepflanzen vor der Ernte beschattet werden und der zu feinem Pulver gemahlen wird",
        answerD = "Matcha ist einfach sehr stark aufgebrühter grüner Tee",
        correctAnswer = 2,
        explanation = "Matcha-Teepflanzen werden 3–4 Wochen vor der Ernte beschattet, was den Chlorophyll- und L-Theanin-Gehalt erhöht. Die Blätter werden zu feinem Pulver gemahlen und direkt im Wasser aufgelöst.",
        difficulty = 2,
        funFact = "Matcha enthält durch die Beschattung mehr Koffein als normaler grüner Tee, wirkt aber durch L-Theanin ruhiger."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Earl Grey' und woher kommt das charakteristische Aroma?",
        answerA = "Ein chinesischer Tee mit natürlichem Bergamottegeschmack",
        answerB = "Ein Kräutertee aus Bergamotte und Schwarzem Johannisbeerblatt",
        answerC = "Ein englischer Tee aus der Grafschaft Grey",
        answerD = "Ein schwarzer Tee, der mit Bergamottenöl aromatisiert wird",
        correctAnswer = 3,
        explanation = "Earl Grey ist ein schwarzer Tee, der mit Bergamottenöl (aus der Bergamotte-Orange) aromatisiert wird. Das ätherische Öl verleiht ihm sein charakteristisches zitrusblumiges Aroma.",
        difficulty = 2,
        funFact = "Der Name soll auf Charles Grey, den 2. Earl Grey und britischen Premierminister (1830–1834), zurückgehen."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Rooibos' und was macht ihn besonders?",
        answerA = "Ein koffeinfreier südafrikanischer Kräutertee aus den Blättern des Aspalathus linearis Strauchs",
        answerB = "Ein indischer Chai-Tee mit Gewürzen",
        answerC = "Ein chinesischer roter Tee ähnlich wie Oolong",
        answerD = "Ein japanischer Tee mit roter Farbe durch spezielle Fermentation",
        correctAnswer = 0,
        explanation = "Rooibos ('Rotbusch') stammt aus der Cederberg-Region in Südafrika und enthält kein Koffein. Er ist reich an Antioxidantien und hat einen natürlich süßlichen, erdigen Geschmack ohne Tannine.",
        difficulty = 2,
        funFact = null
    ),

    // Weinausbau & Prädikatswein
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Ausbau im Barrique' beim Wein?",
        answerA = "Die Vergärung in einem speziellen Betonbehälter",
        answerB = "Lagerung des Weines in kleinen Eichenfässern (225 Liter), die dem Wein Vanille-, Röst- und Holzaromen verleihen",
        answerC = "Die Nutzung von gekühlten Stahltanks für fruchtbetonten Ausbau",
        answerD = "Die Lagerung in Tonkrügen nach georgischer Tradition",
        correctAnswer = 1,
        explanation = "Ein Barrique ist ein kleines Eichenholzfass mit 225 Liter Inhalt. Durch den Kontakt mit dem Holz nimmt der Wein Tannine, Vanillin und Röstaromen auf. Je neuer das Fass, desto stärker der Holzeinfluss.",
        difficulty = 2,
        funFact = "Die 225-Liter-Größe entstand, weil ein Händler genau 300 Flaschen Wein in ein Fass dieser Größe füllen konnte."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist Trockenbeerenauslese (TBA)?",
        answerA = "Der günstigste Einstiegswein in Deutschland",
        answerB = "Ein trockener Spätlese-Wein ohne Restzucker",
        answerC = "Die höchste Prädikatsweinstufe in Deutschland – aus eingetrockneten, mit Edelfäule befallenen Beeren",
        answerD = "Ein Sekt aus überreifen Trauben",
        correctAnswer = 2,
        explanation = "TBA ist die höchste und seltenste Qualitätsstufe im deutschen Weinrecht. Die Trauben müssen von Botrytis cinerea (Edelfäule) befallen und fast eingetrocknet sein, was extrem konzentrierte, süße Weine ergibt.",
        difficulty = 2,
        funFact = null
    ),

    // Bier – Spezialitäten
    Question(
        categoryId = 8,
        questionText = "Was ist ein 'Lambic' und wo wird es gebraut?",
        answerA = "Ein englisches Mild Ale mit milchsaurer Note",
        answerB = "Ein deutsches Sauerteigbier aus Bayern",
        answerC = "Ein niederländisches Klosterbier mit Honig",
        answerD = "Ein belgisches Bier, das spontan vergärt – die Hefe kommt aus der Luft",
        correctAnswer = 3,
        explanation = "Lambic wird in der Brüsseler Region (Payottenland, Belgien) gebraut und nutzt wilde Hefe und Bakterien aus der Umgebungsluft zur spontanen Vergärung. Das Ergebnis ist säuerlich, komplex und einzigartig.",
        difficulty = 2,
        funFact = "Geuze ist ein Blend aus alten und jungen Lambics; Kriek ist Lambic, das auf Sauerkirschen gereift wurde."
    ),

    Question(
        categoryId = 8,
        questionText = "Was unterscheidet 'Kölsch' von anderen deutschen Bierstilen?",
        answerA = "Kölsch ist ein helles, obergäriges Bier mit geschützter Herkunftsbezeichnung, das nur in und um Köln gebraut werden darf",
        answerB = "Es ist ein untergäriges Lagerbier aus Köln",
        answerC = "Es ist ein Weizenbier mit besonders wenig Hefe",
        answerD = "Kölsch darf nur in 0,5-Liter-Gläsern serviert werden",
        correctAnswer = 0,
        explanation = "Kölsch ist ein helles, hopfenbetontes Bier mit obergäriger Hefe, das durch die Kölsch-Konvention von 1986 eine geschützte Herkunftsbezeichnung hat.",
        difficulty = 2,
        funFact = "Das Altbier und das Kölsch sind die beiden Rivalen am Niederrhein – in Düsseldorf trinkt man Alt, in Köln Kölsch."
    ),

    // Schaumwein & Aperitif
    Question(
        categoryId = 8,
        questionText = "Was ist 'Cava' und woher kommt er?",
        answerA = "Ein französischer Schaumwein aus dem Elsass",
        answerB = "Ein spanischer Schaumwein, der nach der Champagner-Methode hergestellt wird, hauptsächlich aus Katalonien",
        answerC = "Ein portugiesischer Schaumwein aus Vinho Verde",
        answerD = "Ein italienischer Schaumwein wie Prosecco",
        correctAnswer = 1,
        explanation = "Cava ist ein spanischer Qualitätsschaumwein mit geschützter Herkunftsbezeichnung, der nach der traditionellen Flaschengärung hergestellt wird. Er stammt hauptsächlich aus dem Penedès (Katalonien).",
        difficulty = 2,
        funFact = "Cava ist bedeutend günstiger als Champagner, wird aber nach identischer Methode hergestellt."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Aperol Spritz' und welche Zutaten enthält er?",
        answerA = "Aperol, Vodka und Tonic Water",
        answerB = "Aperol, Weißwein und Zitronensaft",
        answerC = "Aperol, Prosecco und Sprudelwasser – klassisch 3:2:1",
        answerD = "Aperol, Champagner und Orangensaft",
        correctAnswer = 2,
        explanation = "Der klassische Aperol Spritz besteht aus Prosecco, Aperol und einem Spritzer Sodawasser im Verhältnis 3:2:1. Er wird auf viel Eis mit einer Orangenscheibe serviert.",
        difficulty = 2,
        funFact = null
    ),

    // Weinbau weltweit & Weinarten
    Question(
        categoryId = 8,
        questionText = "Was ist 'Malbec' und in welchem Land wurde er besonders berühmt?",
        answerA = "Eine Rebsorte aus dem Burgund, die in Chile erfolgreich wurde",
        answerB = "Eine spanische Rebsorte, die in Rioja als Hauptsorte gilt",
        answerC = "Eine südafrikanische Neuzüchtung aus Cabernet und Syrah",
        answerD = "Eine ursprünglich südwestfranzösische Rebsorte, die in Argentinien (besonders Mendoza) ihre bedeutendste Heimat gefunden hat",
        correctAnswer = 3,
        explanation = "Malbec stammt ursprünglich aus Cahors (Südfrankreich) und kam im 19. Jahrhundert nach Argentinien. In Mendoza am Fuße der Anden, auf 800–1500 m Höhe, gedeiht er besonders gut.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Eiswein' und wie werden die Trauben für ihn geerntet?",
        answerA = "Ein Prädikatswein aus gefrorenen Trauben, die bei mindestens -7 °C gelesen und gekeltert werden",
        answerB = "Ein leichter, kühler Weißwein aus norddeutschen Regionen",
        answerC = "Ein Wein aus Trauben, die im Kühlhaus gefroren wurden",
        answerD = "Ein Wein, der in Eis gelagert und dadurch konzentriert wird",
        correctAnswer = 0,
        explanation = "Eiswein wird aus natürlich gefrorenen Trauben gewonnen, die bei mindestens -7 °C geerntet werden müssen. Beim Pressen bleibt das Eis (Wasser) zurück, nur der konzentrierte Saft läuft ab.",
        difficulty = 2,
        funFact = "Eiswein erfordert perfekte Bedingungen – ein Jahrgang ohne ausreichenden Frost ergibt keinen Eiswein."
    ),

    // Alkoholfreie & fermentierte Getränke
    Question(
        categoryId = 8,
        questionText = "Was ist 'Kombucha' und wie wird es hergestellt?",
        answerA = "Ein japanischer Algenextrakt",
        answerB = "Ein fermentiertes Teegetränk, das mithilfe eines SCOBY (symbiotische Kultur aus Bakterien und Hefen) hergestellt wird",
        answerC = "Ein chinesischer Kräutersirup auf Teebasis",
        answerD = "Ein russisches Birkenwassergetränk",
        correctAnswer = 1,
        explanation = "Kombucha entsteht durch Fermentation von gesüßtem Tee mit einem SCOBY (Symbiotic Culture of Bacteria and Yeast). Das Ergebnis ist ein leicht sprudelndes, säuerliches Getränk mit wenig Alkohol (0,5–3 %).",
        difficulty = 2,
        funFact = "Kombucha hat Wurzeln in der chinesischen Medizin (ca. 220 v. Chr.) und wurde als 'Tee der Unsterblichkeit' bezeichnet."
    ),

    // Likör & Digestif
    Question(
        categoryId = 8,
        questionText = "Was ist 'Grappa' und aus was wird er destilliert?",
        answerA = "Ein italienischer Weinbrand aus frischen Trauben",
        answerB = "Ein südtiroler Obstbrand aus Äpfeln",
        answerC = "Ein italienischer Tresterbrand aus den Rückständen der Weinpresse (Traubenschalen und -kerne)",
        answerD = "Ein Grappa ist dasselbe wie Brandy, nur aus Italien",
        correctAnswer = 2,
        explanation = "Grappa ist ein italienischer Tresterbrand (Pomace Brandy), der aus den Rückständen der Weinherstellung destilliert wird – also aus Traubenschalen, -kernen und -stielen. Er ist ein typischer Digestif.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Absinthe' und warum war er lange verboten?",
        answerA = "Ein französischer Kräuterlikör, der wegen seines hohen Zuckergehalts verboten war",
        answerB = "Ein Gin-Typ mit besonders viel Wacholder",
        answerC = "Ein belgisches Bier mit Kräuternoten",
        answerD = "Ein hochprozentiger Kräuterbrand auf Anis- und Wermutbasis, der wegen Thujon im Wermut als halluzinogen galt",
        correctAnswer = 3,
        explanation = "Absinthe ist ein hochprozentiger (50–75 %) Kräuterschnaps aus Anis, Fenchel und Wermutkraut. Er wurde um 1900 in vielen Ländern verboten, da man dem Thujon im Wermut halluzinogene Wirkung zuschrieb.",
        difficulty = 2,
        funFact = "In der Belle Époque war Absinthe das Lieblingsgetränk von Künstlern wie Toulouse-Lautrec, Van Gogh und Hemingway."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Amaretto' und woraus wird er hergestellt?",
        answerA = "Ein italienischer Mandellikör aus bitteren Mandeln oder Aprikosenkernen",
        answerB = "Ein französischer Kräuterlikör mit Bitterkeit",
        answerC = "Ein spanischer Haselnusslikör",
        answerD = "Ein österreichischer Obstbrand aus Marillen",
        correctAnswer = 0,
        explanation = "Amaretto ist ein süßer italienischer Likör mit Mandelaroma. Er wird oft aus Aprikosenkernen oder bitteren Mandeln hergestellt. Der Name bedeutet 'ein wenig bitter' (ital. amaro = bitter).",
        difficulty = 2,
        funFact = "Amaretto di Saronno (heute Disaronno) ist der bekannteste Vertreter."
    ),

    // Wein & Service
    Question(
        categoryId = 8,
        questionText = "Was bedeutet 'Dekantieren' beim Wein und warum macht man es?",
        answerA = "Das Kühlen des Weins auf Serviertemperatur",
        answerB = "Das Umfüllen des Weins in einen Glasgefäß, um Sauerstoffkontakt zu ermöglichen und Sediment zu trennen",
        answerC = "Das Filtrieren des Weins vor dem Abfüllen",
        answerD = "Das Mischen verschiedener Jahrgänge",
        correctAnswer = 1,
        explanation = "Beim Dekantieren wird Wein in einen Dekanter umgefüllt, um ihn zu belüften (Sauerstoff öffnet Aromen) und Bodensatz (Sediment) vom Wein zu trennen. Besonders junge Rotweine profitieren davon.",
        difficulty = 2,
        funFact = "Sehr alte Weine sollten nur kurz dekantiert werden, da sie sonst schnell oxidieren."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Sherry' und aus welchem Land stammt er?",
        answerA = "Ein portugiesischer Süßwein ähnlich wie Portwein",
        answerB = "Ein französischer Likörwein aus dem Languedoc",
        answerC = "Ein spanischer Fortifikationswein aus der Region Jerez de la Frontera in Andalusien",
        answerD = "Ein britischer Weinverschnitt nach iberischem Vorbild",
        correctAnswer = 2,
        explanation = "Sherry (span. Jerez) ist ein fortifizierter Wein aus der Region Jerez de la Frontera in Südspanien. Er wird mit Weinbrand aufgespritet und durch das Solera-System ausgebaut.",
        difficulty = 2,
        funFact = "Sherry reift unter einem Hefeschleier ('Flor'), der ihn vor Oxidation schützt – das ist einzigartig in der Weinwelt."
    ),

    // Fermentierte Getränke weltweit
    Question(
        categoryId = 8,
        questionText = "Was ist 'Sake' und wie unterscheidet er sich von Wein?",
        answerA = "Sake ist ein süßer Reislikör",
        answerB = "Sake ist ein destillierter Reisbrand wie Vodka",
        answerC = "Sake ist ein japanisches Reisbier auf Basis von Hopfen",
        answerD = "Sake ist ein japanischer Reiswein, der durch Fermentation von gedämpftem Reis mit Koji-Pilz und Hefe entsteht",
        correctAnswer = 3,
        explanation = "Sake entsteht durch Fermentation von Reis mit Koji (Aspergillus oryzae) und Hefe. Trotz des Namens 'Reiswein' ähnelt die Herstellung eher dem Bierbrauen. Alkoholgehalt: ca. 14–16 %.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Calvados'?",
        answerA = "Ein französischer Apfelbrand aus der Normandie",
        answerB = "Ein belgischer Bierbrand",
        answerC = "Ein Apfelwein aus dem Elsass",
        answerD = "Ein bretonischer Obstlikör aus Birnen",
        correctAnswer = 0,
        explanation = "Calvados ist ein geschützter französischer Apfelbrand (AOC) aus der Normandie, der aus vergorenem Apfelmost (Cidre) destilliert und mindestens 2 Jahre in Eichenfässern gereift wird.",
        difficulty = 2,
        funFact = "In der Normandie gibt es die Tradition des 'Trou Normand' – ein kleines Glas Calvados mitten im Menü, um Platz für weitere Gänge zu schaffen."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Cidre' (Cider) und wie unterscheidet er sich von Apfelsaft?",
        answerA = "Cidre ist pasteurisierter Apfelsaft mit Kohlensäure",
        answerB = "Cidre ist vergorener Apfelsaft mit Alkohol (meist 2–8 %), bei dem der Zucker durch Hefe in Alkohol umgewandelt wird",
        answerC = "Cidre und Apfelsaft sind identisch, nur der Name unterscheidet sich",
        answerD = "Cidre ist ein destillierter Apfelwein",
        correctAnswer = 1,
        explanation = "Cidre (frz.) / Cider (engl.) entsteht durch alkoholische Gärung von Apfelsaft mit Hefe. Der natürliche Zucker wird in Alkohol umgewandelt. Harter Cider (4–8 % Vol.) ist in der Normandie und in England traditionell.",
        difficulty = 2,
        funFact = "In der Bretagne und Normandie ist Cidre ein traditionelles Begleitgetränk zur galette (Buchweizenpfannkuchen)."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Mead' (Met) und wie wird er hergestellt?",
        answerA = "Ein gesüßtes Bier mit Honig",
        answerB = "Ein Likör auf Honigbasis ohne Fermentation",
        answerC = "Ein alkoholisches Getränk, das durch Fermentation von Honig in Wasser entsteht – eines der ältesten Getränke der Menschheit",
        answerD = "Ein Obstmost aus Honigmelonen",
        correctAnswer = 2,
        explanation = "Met (englisch: Mead) entsteht durch Fermentation von Honig in Wasser mit Hefe. Er gilt als eines der ältesten alkoholischen Getränke der Menschheit und war in vielen Kulturen ein Festgetränk.",
        difficulty = 2,
        funFact = "Der Begriff 'Honeymoon' soll auf den alten Brauch zurückgehen, dass frisch Verheiratete einen Monat lang Met bekamen, um die Fruchtbarkeit zu fördern."
    ),

    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'IBU' (International Bitterness Units) bei Bier?",
        answerA = "Die Messung des Alkoholgehalts in Bier",
        answerB = "Die Farbe des Bieres nach der EBC-Skala",
        answerC = "Die Menge an Kohlensäure im Bier",
        answerD = "Eine Maßeinheit für die Hopfenbitterkeit durch die Konzentration von Iso-Alpha-Säuren",
        correctAnswer = 3,
        explanation = "IBU (International Bitterness Units) misst die Konzentration von Iso-Alpha-Säuren aus dem Hopfen im Bier. Je höher der IBU-Wert, desto bitterer das Bier. Ein Pils hat ca. 25–45 IBU, ein Double IPA 60–100+.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Single Malt Scotch Whisky'?",
        answerA = "Whisky aus einer einzigen Destillerie, ausschließlich aus Gerstenmalz in Pot Stills destilliert",
        answerB = "Whisky aus einer einzigen Ernte und einem einzigen Fass",
        answerC = "Der teuerste Scotch aus dem Hochland",
        answerD = "Whisky aus einer Blended-Malt-Mischung einer einzigen Region",
        correctAnswer = 0,
        explanation = "Single Malt Scotch muss aus einer einzigen Brennerei stammen, ausschließlich aus gemälzter Gerste hergestellt und in traditionellen Pot Stills destilliert werden. Er muss mindestens 3 Jahre in Schottland in Eichenfässern reifen.",
        difficulty = 2,
        funFact = "Die bekanntesten Single Malt Regionen sind Speyside (fruchtig), Islay (torfig-rauchig), Highlands und Lowlands."
    ),

    Question(
        categoryId = 8,
        questionText = "Was ist 'Kvass' und aus welcher Region stammt es?",
        answerA = "Ein polnischer Beerenwein aus vergorenem Obst",
        answerB = "Ein fermentiertes Brotgetränk aus Russland und Osteuropa, traditionell aus Schwarzbrot",
        answerC = "Ein finnisches Bier aus Roggenmalz",
        answerD = "Ein ukrainischer Wodka auf Getreidebasis",
        correctAnswer = 1,
        explanation = "Kvass ist ein traditionelles osteuropäisches Getränk, das durch Fermentation von Schwarzbrot oder Roggenmehl entsteht. Es ist sehr leicht alkoholisch (0,5–2,5 %) und hat eine brotartige, süßsäuerliche Note.",
        difficulty = 2,
        funFact = "In Russland und der Ukraine wird Kvass von Straßenverkäufern aus Fässern verkauft und gilt als Volksgetränk für heiße Sommertage."
    ),

)
