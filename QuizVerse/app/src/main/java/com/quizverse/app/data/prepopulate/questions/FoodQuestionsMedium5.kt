package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMedium5(): List<Question> = listOf(

    // --- correctAnswer = 0 (13 Fragen) ---

    // Q1
    Question(
        categoryId = 8,
        questionText = "Aus welchem Teil der Pflanze wird Zimt gewonnen?",
        answerA = "Aus der getrockneten inneren Rinde des Zimtbaums",
        answerB = "Aus den getrockneten Früchten des Zimtstrauchs",
        answerC = "Aus dem Wurzelstock des Zimtbaums",
        answerD = "Aus den Samen der Zimtblüte",
        correctAnswer = 0,
        explanation = "Zimt wird aus der inneren Rinde des Zimtbaums (Cinnamomum verum für Ceylon-Zimt) gewonnen. Die Rinde wird abgeschält, getrocknet und rollt sich zu den typischen Zimtstangen.",
        difficulty = 2,
        funFact = "Ceylon-Zimt gilt als 'echter' Zimt. Der verbreitetere Cassia-Zimt aus China enthält mehr Cumarin, das in großen Mengen leberschädigend wirken kann."
    ),

    // Q2
    Question(
        categoryId = 8,
        questionText = "Was ist 'Pektin' und wozu wird es in der Lebensmittelherstellung eingesetzt?",
        answerA = "Ein pflanzliches Geliermittel aus Zellwänden von Früchten, das zum Eindicken von Marmeladen verwendet wird",
        answerB = "Ein tierisches Geliermittel aus Knochen und Sehnen",
        answerC = "Ein synthetisches Konservierungsmittel für Fruchtsäfte",
        answerD = "Ein Emulgator aus Sojalecithin",
        correctAnswer = 0,
        explanation = "Pektin ist ein natürlicher pflanzlicher Ballaststoff aus den Zellwänden von Früchten (besonders Äpfeln und Zitrusfrüchten). Es geliert beim Erhitzen mit Zucker und Säure und ist unverzichtbar für die Herstellung von Marmeladen.",
        difficulty = 2,
        funFact = "Äpfel und Zitrusschalen haben den höchsten Pektingehalt. Bevor kommerzielle Pektinpräparate verfügbar waren, gab man für die Marmelade immer eine Zitrone oder einen Apfel mit in den Topf."
    ),

    // Q3
    Question(
        categoryId = 8,
        questionText = "Was ist 'Miso' und wie lange dauert seine Herstellung?",
        answerA = "Eine fermentierte Paste aus Sojabohnen, Salz und Koji-Pilz – Reifezeit Wochen bis mehrere Jahre",
        answerB = "Eine Paste aus frischen Sojabohnen, die sofort verwendet werden kann",
        answerC = "Ein getrocknetes Sojaprodukt mit 2 Wochen Trocknungszeit",
        answerD = "Eine Sojasoße-Variante, die innerhalb von 3 Tagen fermentiert wird",
        correctAnswer = 0,
        explanation = "Miso entsteht durch Fermentation von Sojabohnen mit Koji (Aspergillus oryzae) und Salz. Helles Miso (Shiro Miso) reift nur wenige Wochen, dunkles Miso (Hatcho Miso) kann bis zu 3 Jahre reifen.",
        difficulty = 2,
        funFact = "Hatcho Miso aus Japan reift in riesigen Holzfässern, auf denen schwere Steine gestapelt werden. Es schmeckt intensiv-herzhaft und fast schokoladig."
    ),

    // Q4
    Question(
        categoryId = 8,
        questionText = "Was ist 'Lecithin' und in welchen Lebensmitteln kommt es als Emulgator vor?",
        answerA = "Ein Emulgator aus Ei- oder Sojaöl, der Wasser und Fett zusammenhält – z.B. in Schokolade und Mayonnaise",
        answerB = "Ein Konservierungsmittel aus Salz und Essig",
        answerC = "Ein natürlicher Süßstoff aus Rüben",
        answerD = "Ein Verdickungsmittel aus Algen",
        correctAnswer = 0,
        explanation = "Lecithin ist ein natürlicher Emulgator (E 322), der Wasser und Fett verbinden kann. Es kommt natürlich in Eigelb und Sojabohnen vor und wird in Schokolade, Mayonnaise, Margarine und Backwaren eingesetzt.",
        difficulty = 2,
        funFact = "Das Eigelb in Mayonnaise enthält so viel Lecithin, dass es die Öl-Wasser-Emulsion auch ohne weitere Zusätze stabil hält – das macht Mayonnaise so cremig."
    ),

    // Q5
    Question(
        categoryId = 8,
        questionText = "Was macht Kokosöl einzigartig unter den pflanzlichen Ölen?",
        answerA = "Es besteht zu über 90 % aus gesättigten Fettsäuren und ist bei Raumtemperatur fest – ungewöhnlich für pflanzliche Öle",
        answerB = "Es ist das einzige Pflanzenöl, das kein Cholesterin enthält",
        answerC = "Es enthält die meisten Omega-3-Fettsäuren unter allen Pflanzenölen",
        answerD = "Es ist hitzebeständiger als alle anderen Speiseöle",
        correctAnswer = 0,
        explanation = "Kokosöl enthält über 90 % gesättigte Fettsäuren – besonders viele mittelkettige Triglyceride (MCT). Dieser hohe Anteil gesättigter Fette macht es bei Raumtemperatur fest (Schmelzpunkt ca. 25 °C), was für pflanzliche Öle sehr ungewöhnlich ist.",
        difficulty = 2,
        funFact = "Die mittelkettigen Fettsäuren im Kokosöl werden im Körper schneller verwertet als langkettige. MCT-Öl aus Kokosöl wird im Sport daher als schnelle Energiequelle genutzt."
    ),

    // Q6
    Question(
        categoryId = 8,
        questionText = "Was ist 'Sauerkraut' und wie entsteht es?",
        answerA = "Fein gehobelter Weißkohl, der durch Milchsäuregärung (Lacto-Fermentation) ohne Essigzugabe konserviert wird",
        answerB = "Weißkohl, der in Essig und Salz eingelegt wird",
        answerC = "Rotkohl, der mit Äpfeln und Gewürzen gekocht wird",
        answerD = "Kohl, der durch Trocknung und Salzen haltbar gemacht wird",
        correctAnswer = 0,
        explanation = "Sauerkraut entsteht durch natürliche Milchsäuregärung: Fein gehobelte Weißkohlstreifen werden mit Salz gemischt, das Flüssigkeit entzieht. Milchsäurebakterien vergären den Zucker zu Milchsäure – ohne Essigzugabe.",
        difficulty = 2,
        funFact = "Sauerkraut rettete Seeleute vor Skorbut: James Cook führte auf seinen Entdeckungsreisen Fässer voller Sauerkraut mit, da dessen Vitamin C den Skorbut verhinderte."
    ),

    // Q7
    Question(
        categoryId = 8,
        questionText = "Was sind Trüffel botanisch gesehen und warum sind sie so teuer?",
        answerA = "Unterirdisch wachsende Pilze (Ascomyceten), teuer wegen mühsamer Suche und kurzer Saison",
        answerB = "Seltene Beeren aus dem Regenwald, teuer wegen langer Transportwege",
        answerC = "Knollengewächse aus dem Mittelmeerraum, teuer wegen aufwändigen Anbaus",
        answerD = "Eine seltene Algenart aus dem Tiefwasser, schwer zu ernten",
        correctAnswer = 0,
        explanation = "Trüffel sind unterirdisch wachsende Pilze der Gattung Tuber. Sie können nicht gezüchtet werden, wachsen in Symbiose mit bestimmten Bäumen und müssen von speziell ausgebildeten Hunden aufgespürt werden.",
        difficulty = 2,
        funFact = "Weiße Trüffel (Tuber magnatum) aus dem Piemont sind die teuersten der Welt – ein Kilogramm kann bis zu 15.000 Euro kosten. 2007 wurde eine einzelne 1,5 kg schwere Trüffel für 330.000 Dollar versteigert."
    ),

    // Q8
    Question(
        categoryId = 8,
        questionText = "Was ist 'Burrata' und wie unterscheidet sie sich von Mozzarella?",
        answerA = "Eine Mozzarella-Hülle, gefüllt mit Stracciatella (Sahne und Käsefäden) – beim Aufschneiden fließt die Füllung heraus",
        answerB = "Ein Hartkäse aus Apulien mit langer Reifezeit",
        answerC = "Gereifter Mozzarella mit einer essbaren Rinde",
        answerD = "Mozzarella aus Ziegenmilch mit cremigerer Textur",
        correctAnswer = 0,
        explanation = "Burrata ist eine Spezialität aus Apulien: Eine Hülle aus Mozzarella-Käse ist mit Stracciatella gefüllt – einer Mischung aus Sahne und feinen Mozzarella-Fäden. Beim Aufschneiden fließt die cremige Füllung heraus.",
        difficulty = 2,
        funFact = "Burrata wurde erst in den 1920ern in der Nähe von Andria in Apulien erfunden – als Methode, um Mozzarella-Reste (Stracciatella) zu verwerten."
    ),

    // Q9
    Question(
        categoryId = 8,
        questionText = "Was ist 'Asafoetida' (Asant) und in welcher Küche wird es hauptsächlich eingesetzt?",
        answerA = "Ein getrocknetes Harz aus einer Doldenblütlerwurzel, das als Knoblauch- und Zwiebelersatz in der indischen und persischen Küche dient",
        answerB = "Eine fermentierte Fischpaste aus Südostasien",
        answerC = "Ein afrikanisches Rindengewürz ähnlich wie Zimt",
        answerD = "Ein Gewürz aus Algenextrakt der japanischen Küche",
        correctAnswer = 0,
        explanation = "Asafoetida (Ferula assa-foetida) ist ein getrocknetes Harz aus der Wurzel einer Doldenblütlerpflanze. Roh riecht es intensiv-unangenehm, beim Kochen entwickelt es aber ein knoblauchähnliches Aroma.",
        difficulty = 2,
        funFact = "Asafoetida wird von vegetarischen Hindus als Ersatz für Zwiebeln und Knoblauch verwendet, da diese in bestimmten religiösen Traditionen verboten sind."
    ),

    // Q10
    Question(
        categoryId = 8,
        questionText = "Welche Nuss ist botanisch gesehen keine echte Nuss, sondern eine Steinfrucht?",
        answerA = "Mandel",
        answerB = "Walnuss",
        answerC = "Haselnuss",
        answerD = "Macadamia",
        correctAnswer = 0,
        explanation = "Die Mandel (Prunus dulcis) ist botanisch eine Steinfrucht wie Pfirsich und Kirsche – was wir essen, ist der Kern des Steins. Walnüsse und Haselnüsse sind ebenfalls keine 'echten' botanischen Nüsse im strengen Sinne.",
        difficulty = 2,
        funFact = "Echte botanische Nüsse sind selten: Die Haselnuss, Buchecker und Eichel sind tatsächlich botanische Nüsse. Was wir im Alltag 'Nuss' nennen (Erdnuss, Cashew, Walnuss), ist botanisch meist etwas anderes."
    ),

    // Q11
    Question(
        categoryId = 8,
        questionText = "Was ist 'Quinoa' botanisch gesehen und warum gilt es als besonders nahrhaft?",
        answerA = "Ein Pseudogetreide (Knöterichgewächs) aus den Anden mit vollständigem Aminosäureprofil",
        answerB = "Ein Getreide aus der Grasfamilie wie Weizen und Reis",
        answerC = "Eine Hülsenfrucht aus Südamerika ähnlich wie Linsen",
        answerD = "Ein Wurzelgemüse aus der Familie der Amarantgewächse",
        correctAnswer = 0,
        explanation = "Quinoa ist kein echtes Getreide, sondern ein Pseudogetreide aus der Familie der Fuchsschwanzgewächse. Die Samen enthalten alle essentiellen Aminosäuren und sind damit eines der wenigen pflanzlichen 'vollständigen' Proteine.",
        difficulty = 2,
        funFact = "Die Inka nannten Quinoa 'Mutter aller Körner' (Chisiya Mama). Die spanischen Conquistadoren verboten seinen Anbau, um die Inka-Kultur zu schwächen."
    ),

    // Q12
    Question(
        categoryId = 8,
        questionText = "Was ist 'Nutritional Yeast' (Nährhefe) und warum ist es in der veganen Küche beliebt?",
        answerA = "Deaktivierte Hefe mit käseartigem Umami-Geschmack, reich an B-Vitaminen und Protein – wird als Käseersatz verwendet",
        answerB = "Eine aktive Bäckerhefe für veganes Brotbacken",
        answerC = "Frische Hefe aus Bio-Anbau ohne tierische Bestandteile",
        answerD = "Eine Hefe, die Zucker durch glutenfreie Fermentation abbaut",
        correctAnswer = 0,
        explanation = "Nutritional Yeast ist deaktivierte Hefe (Saccharomyces cerevisiae) mit käsig-nussigem Umami-Geschmack. Sie wird oft mit Vitamin B12 angereichert und dient in der veganen Küche als Parmesan-Ersatz.",
        difficulty = 2,
        funFact = "Der Umami-Geschmack kommt von natürlichem Glutamat, das durch die Fermentation der Hefe entsteht – obwohl die Hefe danach abgetötet wird, bleibt das Glutamat erhalten."
    ),

    // Q13
    Question(
        categoryId = 8,
        questionText = "Was ist 'Manuka-Honig' und woher kommt er?",
        answerA = "Ein neuseeländischer Honig aus dem Nektar des Manukastrauchs mit nachgewiesenen antibakteriellen Eigenschaften",
        answerB = "Ein australischer Eucalyptushonig mit besonders mildem Geschmack",
        answerC = "Ein kanadischer Akazien-Honig mit besonders langer Haltbarkeit",
        answerD = "Ein hawaiianischer Honig aus Macadamia-Blüten",
        correctAnswer = 0,
        explanation = "Manuka-Honig stammt aus Neuseeland und Australien und wird von Bienen aus dem Nektar des Manukastrauchs (Leptospermum scoparium) hergestellt. Der Wirkstoff Methylglyoxal (MGO) verleiht ihm besondere antibakterielle Eigenschaften.",
        difficulty = 2,
        funFact = "Echter Manuka-Honig wird nach seinem UMF (Unique Manuka Factor) oder MGO-Gehalt bewertet. Hochqualitäts-Manuka-Honig mit UMF 20+ kostet über 100 Euro pro 250 Gramm."
    ),

    // --- correctAnswer = 1 (13 Fragen) ---

    // Q14
    Question(
        categoryId = 8,
        questionText = "Aus welchem Teil der Pflanze wird schwarzer Pfeffer gewonnen?",
        answerA = "Aus den Blättern der Pfefferpflanze",
        answerB = "Aus den getrockneten unreifen Früchten der Pfefferpflanze",
        answerC = "Aus der Wurzel der Pfefferpflanze",
        answerD = "Aus den Samen der Pfefferblüte",
        correctAnswer = 1,
        explanation = "Schwarzer Pfeffer wird aus den unreifen grünen Früchten der Pfefferpflanze (Piper nigrum) gewonnen, die nach der Ernte an der Sonne getrocknet werden und dabei ihre schwarze Farbe bekommen.",
        difficulty = 2,
        funFact = "Im Mittelalter war Pfeffer so wertvoll, dass er als 'schwarzes Gold' gehandelt wurde und manchmal als Währung diente."
    ),

    // Q15
    Question(
        categoryId = 8,
        questionText = "Aus welcher Pflanzenfamilie stammt Kardamom?",
        answerA = "Aus der Familie der Nachtschattengewächse",
        answerB = "Aus der Familie der Ingwergewächse (Zingiberaceae)",
        answerC = "Aus der Familie der Doldenblütler",
        answerD = "Aus der Familie der Lorbeergewächse",
        correctAnswer = 1,
        explanation = "Kardamom gehört zur Familie der Ingwergewächse (Zingiberaceae). Als Gewürz werden die Kapseln und Samen der Pflanze verwendet.",
        difficulty = 2,
        funFact = "Kardamom ist nach Safran und Vanille das drittteuerste Gewürz der Welt. Guatemala ist heute der größte Exporteur."
    ),

    // Q16
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz ist das teuerste der Welt und warum?",
        answerA = "Vanille – wegen der aufwändigen Handbestäubung",
        answerB = "Safran – wegen der extrem mühsamen Handarbeit bei der Ernte der Narben",
        answerC = "Kardamom – wegen der langen Reifezeit der Kapseln",
        answerD = "Muskatnuss – wegen der seltenen Anbaugebiete",
        correctAnswer = 1,
        explanation = "Safran ist das teuerste Gewürz der Welt: Für ein Kilogramm werden 150.000–200.000 Blüten benötigt, die alle per Hand geerntet werden müssen. Ein einziger Arbeiter schafft pro Tag nur 60–80 Gramm.",
        difficulty = 2,
        funFact = "Über 90 % des weltweit produzierten Safrans kommt aus dem Iran. Der Safran-Krokus (Crocus sativus) blüht nur einige Wochen im Herbst."
    ),

    // Q17
    Question(
        categoryId = 8,
        questionText = "Wann und durch wen kam die Tomate nach Europa?",
        answerA = "Im 15. Jahrhundert durch Vasco da Gama nach Portugal",
        answerB = "Im 16. Jahrhundert durch spanische Konquistadoren nach Spanien",
        answerC = "Im 17. Jahrhundert durch holländische Händler nach den Niederlanden",
        answerD = "Im 18. Jahrhundert durch englische Botaniker nach England",
        correctAnswer = 1,
        explanation = "Die Tomate gelangte im 16. Jahrhundert durch spanische Konquistadoren nach Spanien. Ursprünglich aus den Anden, war sie in Europa zunächst eine Zierpflanze und wurde erst Jahrhunderte später als Nahrungsmittel anerkannt.",
        difficulty = 2,
        funFact = "Bis ins 18. Jahrhundert galt die Tomate in Europa als giftig – sie gehört zur Familie der Nachtschattengewächse, zu denen tatsächlich giftige Pflanzen zählen."
    ),

    // Q18
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet weißen von schwarzem Pfeffer?",
        answerA = "Weißer und schwarzer Pfeffer sind verschiedene Pflanzenarten",
        answerB = "Weißer Pfeffer ist die reife, von der äußeren Schale befreite Frucht derselben Pflanze – schwarzer Pfeffer die unreife, ungeschälte getrocknete Frucht",
        answerC = "Schwarzer Pfeffer wächst in Asien, weißer Pfeffer nur in Afrika",
        answerD = "Weißer Pfeffer ist grundsätzlich schärfer als schwarzer Pfeffer",
        correctAnswer = 1,
        explanation = "Beide Pfeffersorten stammen von derselben Pflanze (Piper nigrum). Schwarzer Pfeffer: unreife Früchte geerntet und mit Schale getrocknet. Weißer Pfeffer: reife Früchte, von denen die äußere Schale entfernt wurde.",
        difficulty = 2,
        funFact = "Weißer Pfeffer wird bevorzugt in hellen Soßen verwendet, damit keine schwarzen Punkte sichtbar sind."
    ),

    // Q19
    Question(
        categoryId = 8,
        questionText = "Was ist 'Tamarinde' und in welchen Küchen der Welt wird sie eingesetzt?",
        answerA = "Ein Gewürz aus getrockneten Beeren, das nur in der arabischen Küche vorkommt",
        answerB = "Eine Frucht des Tamarindenbaums mit säuerlichem Fruchtfleisch, eingesetzt in der indischen, südostasiatischen und lateinamerikanischen Küche",
        answerC = "Eine Fermentationspaste aus Sojaöl, verbreitet in der ostasiatischen Küche",
        answerD = "Ein Wurzelgewürz ähnlich wie Ingwer, das in der afrikanischen Küche verwendet wird",
        correctAnswer = 1,
        explanation = "Tamarinde ist die Frucht des Tamarindenbaums (Tamarindus indica). Das säuerliche, klebrige Fruchtfleisch wird in der indischen, thailändischen, mexikanischen und karibischen Küche als Säuerungsmittel eingesetzt.",
        difficulty = 2,
        funFact = "Worcestershire-Sauce enthält als wichtige Zutat Tamarinde – sie verleiht der Sauce ihre charakteristische säuerliche Komponente."
    ),

    // Q20
    Question(
        categoryId = 8,
        questionText = "Was ist 'Harissa' und woher stammt es?",
        answerA = "Eine süße Zimtpaste aus Marokko",
        answerB = "Eine scharfe Chilipaste aus Nordafrika (besonders Tunesien) mit Chili, Knoblauch und Gewürzen",
        answerC = "Eine Kräutermarinade aus dem Libanon",
        answerD = "Eine fermentierte Sojagewürzpaste aus Äthiopien",
        correctAnswer = 1,
        explanation = "Harissa ist eine nordafrikanische Chilipaste, die besonders in der tunesischen Küche unentbehrlich ist. Sie besteht aus getrockneten Chilis, Knoblauch, Koriander, Kreuzkümmel und Olivenöl.",
        difficulty = 2,
        funFact = "Tunesien hat Harissa 2022 in die UNESCO-Liste des immateriellen Kulturerbes der Menschheit aufnehmen lassen."
    ),

    // Q21
    Question(
        categoryId = 8,
        questionText = "Was ist 'Umami' und welcher Stoff ist dafür verantwortlich?",
        answerA = "Der sechste Grundgeschmack, ausgelöst durch den Wirkstoff Capsaicin",
        answerB = "Der fünfte Grundgeschmack, ausgelöst durch Glutaminsäure (Glutamat) und Nucleotide",
        answerC = "Ein Geschmack, der nur durch Fermentation entsteht",
        answerD = "Die Kombination aus süß und salzig in der asiatischen Küche",
        correctAnswer = 1,
        explanation = "Umami ist der fünfte Grundgeschmack neben süß, sauer, salzig und bitter. Er wird hauptsächlich durch Glutaminsäure ausgelöst und beschreibt einen herzhaften, fleischigen Geschmack.",
        difficulty = 2,
        funFact = "Umami wurde 1908 vom japanischen Chemiker Kikunae Ikeda entdeckt, der den Geschmack von Kombu-Algen-Brühe untersuchte und Glutaminsäure als Verursacher identifizierte."
    ),

    // Q22
    Question(
        categoryId = 8,
        questionText = "Was ist 'Galgant' (Galangal) und womit wird es oft verwechselt?",
        answerA = "Eine seltene Pfeffersorte aus Indien, die mit weißem Pfeffer verwechselt wird",
        answerB = "Ein Wurzelgewürz aus der Ingwerfamilie, das oft mit Ingwer verwechselt wird, aber schärfer und kiefernharzig-zitronig schmeckt",
        answerC = "Eine Art Zimt aus Asien, das mit Cassia verwechselt wird",
        answerD = "Ein Gewürz aus getrockneten Blumen, ähnlich wie Safran",
        correctAnswer = 1,
        explanation = "Galgant (Alpinia galanga) gehört zur Familie der Ingwergewächse und sieht dem Ingwer ähnlich, schmeckt aber kiefernharzig, zitronig und schärfer. Es ist ein Grundgewürz der Thai- und indonesischen Küche.",
        difficulty = 2,
        funFact = "Tom Kha Gai, die berühmte Thai-Kokosmilchsuppe, enthält neben Zitronengras und Kaffirlimettenblättern auch Galgant – diese drei sind der aromatische Kern der Thai-Küche."
    ),

    // Q23
    Question(
        categoryId = 8,
        questionText = "Was ist 'Mirin' in der japanischen Küche?",
        answerA = "Ein Reisessig mit mildem Geschmack",
        answerB = "Ein süßer Reiswein mit niedrigem Alkoholgehalt, der ausschließlich zum Würzen verwendet wird",
        answerC = "Eine fermentierte Sojabohnenpaste",
        answerD = "Ein Sesamöl mit nussigem Aroma",
        correctAnswer = 1,
        explanation = "Mirin ist ein süßer japanischer Reiswein mit etwa 14 % Alkohol und hohem Zuckergehalt. Er wird nicht getrunken, sondern als Würzmittel eingesetzt und verleiht Gerichten eine glänzende Oberfläche und süßliche Note.",
        difficulty = 2,
        funFact = "Die Kombination aus Mirin, Sojasoße und Dashi bildet die Grundlage vieler klassischer japanischer Saucen und Tsuyu-Brühen."
    ),

    // Q24
    Question(
        categoryId = 8,
        questionText = "Was ist 'Arrowroot' und wofür wird es in der Küche verwendet?",
        answerA = "Eine Pfeilschwanzgarnele aus dem Indischen Ozean",
        answerB = "Eine Pfeilwurzelstärke aus tropischen Pflanzen – als glutenfreies Bindemittel und zum Eindicken klarer Saucen",
        answerC = "Ein Mehl aus Maniok, identisch mit Tapioka",
        answerD = "Ein Gemüse ähnlich wie Spargel aus der Karibik",
        correctAnswer = 1,
        explanation = "Arrowroot (Pfeilwurzelstärke) wird aus dem Rhizom der Pfeilwurzel (Maranta arundinacea) gewonnen. Es ist ein geschmacksneutrales, glutenfreies Verdickungsmittel, das klare Saucen und Gelees erzeugt.",
        difficulty = 2,
        funFact = "Arrowroot war historisch ein Gegenmittel gegen Pfeilgift – daher der Name. In der Viktorianischen Zeit war Arrowroot-Pudding ein typisches Krankenkost-Gericht."
    ),

    // Q25
    Question(
        categoryId = 8,
        questionText = "Was ist 'Agavensirup' und wie unterscheidet er sich von normalem Zucker?",
        answerA = "Agavensirup hat weniger Kalorien als Zucker und keinen Eigengeschmack",
        answerB = "Agavensirup besteht hauptsächlich aus Fructose (bis 90 %) und hat einen niedrigeren glykämischen Index als Haushaltszucker",
        answerC = "Agavensirup ist ein Zuckeralkohol und wird vom Körper kaum verdaut",
        answerD = "Agavensirup und Haushaltszucker sind chemisch identisch",
        correctAnswer = 1,
        explanation = "Agavensirup besteht zu 70–90 % aus Fructose und hat daher einen niedrigeren glykämischen Index als Saccharose. Allerdings ist hohe Fructosezufuhr belastend für die Leber.",
        difficulty = 2,
        funFact = "Agavensirup stammt aus dem eingedickten Saft verschiedener Agavenpflanzen in Mexiko. Die blaue Agave liefert auch den Ausgangsstoff für Tequila."
    ),

    // Q26
    Question(
        categoryId = 8,
        questionText = "Was ist 'Tahini' und aus welchen Zutaten wird es hergestellt?",
        answerA = "Eine Paste aus gemahlenen Kichererbsen und Knoblauch",
        answerB = "Eine Paste aus gerösteten und gemahlenen Sesamsamen",
        answerC = "Ein Aufstrich aus Auberginen und Olivenöl",
        answerD = "Ein Joghurtdip mit Gurke und Minze",
        correctAnswer = 1,
        explanation = "Tahini ist eine Paste aus gerösteten und gemahlenen Sesamsamen. Es ist eine wichtige Zutat in der levantinischen und nahöstlichen Küche und wird für Hummus, Baba Ganoush und direkt als Dip verwendet.",
        difficulty = 2,
        funFact = "Sesam ist eine der ältesten Ölpflanzen der Welt – archäologische Funde belegen seinen Anbau bereits 3.500 v. Chr. in Mesopotamien."
    ),

    // --- correctAnswer = 2 (12 Fragen) ---

    // Q27
    Question(
        categoryId = 8,
        questionText = "Aus welchem Teil der Pflanze wird Muskatnuss gewonnen?",
        answerA = "Aus der getrockneten Rinde des Muskatnussstrauchs",
        answerB = "Aus den getrockneten Blüten des Muskatbaums",
        answerC = "Aus dem Kern (Samen) der Frucht des Muskatnussbaums",
        answerD = "Aus der Wurzel der Muskatpflanze",
        correctAnswer = 2,
        explanation = "Die Muskatnuss ist der Samen des Muskatnussbaums (Myristica fragrans). Der rote, netzartige Samenmantel um den Kern ergibt das Gewürz Macis (Muskatblüte).",
        difficulty = 2,
        funFact = "Ein einziger Muskatnussbaum liefert zwei Gewürze: die Muskatnuss (Kern) und Macis (Samenmantel). Bis zu 2.000 Nüsse pro Jahr kann ein Baum tragen."
    ),

    // Q28
    Question(
        categoryId = 8,
        questionText = "Was ist 'Chili' botanisch gesehen und woher stammt es ursprünglich?",
        answerA = "Eine Beere aus der Familie der Pfeffergewächse, aus Asien",
        answerB = "Ein Samen aus der Familie der Ingwergewächse, aus Indien",
        answerC = "Eine Schote aus der Familie der Nachtschattengewächse, ursprünglich aus Mittel- und Südamerika",
        answerD = "Eine Frucht aus der Familie der Doldenblütler, aus Nordafrika",
        correctAnswer = 2,
        explanation = "Chili (Capsicum) gehört zur Familie der Nachtschattengewächse und stammt ursprünglich aus Mittel- und Südamerika. Durch spanische Entdecker gelangte die Pflanze im 16. Jahrhundert nach Europa und Asien.",
        difficulty = 2,
        funFact = "Chili verbreitete sich nach der Entdeckung Amerikas so schnell weltweit, dass viele Völker dachten, es sei ein einheimisches Gewürz."
    ),

    // Q29
    Question(
        categoryId = 8,
        questionText = "Woher stammt Vanille ursprünglich und wo wird sie heute hauptsächlich angebaut?",
        answerA = "Ursprung Indonesien – heute hauptsächlich in Indien",
        answerB = "Ursprung Brasilien – heute hauptsächlich in Mexiko",
        answerC = "Ursprung Mexiko – heute hauptsächlich in Madagaskar und Réunion",
        answerD = "Ursprung Indien – heute hauptsächlich in Sri Lanka",
        correctAnswer = 2,
        explanation = "Vanille stammt ursprünglich aus Mexiko, wird aber heute zu etwa 80 % in Madagaskar und auf der Insel Réunion angebaut. Madagaskar-Vanille heißt deshalb auch 'Bourbon-Vanille'.",
        difficulty = 2,
        funFact = "Außerhalb Mexikos muss die Vanilleblüte von Hand bestäubt werden, da die heimischen Bestäuber dort nicht vorkommen."
    ),

    // Q30
    Question(
        categoryId = 8,
        questionText = "Ist die Tomate botanisch ein Gemüse oder eine Frucht?",
        answerA = "Ein Gemüse – weil sie in herzhaften Gerichten verwendet wird",
        answerB = "Weder noch – Tomaten sind eine Sonderkategorie",
        answerC = "Eine Beere im botanischen Sinn, obwohl sie im Alltag als Gemüse gilt",
        answerD = "Eine Frucht mit offizieller EU-Klassifizierung als Obst",
        correctAnswer = 2,
        explanation = "Die Tomate ist botanisch gesehen eine Beere (fleischige Frucht mit Samen), wird aber im Alltag als Gemüse behandelt. 1893 entschied der US-Supreme Court, sie sei für Zollzwecke als Gemüse einzustufen.",
        difficulty = 2,
        funFact = "Auch Gurken, Zucchini, Paprika, Kürbis und Auberginen sind botanisch Früchte, werden aber in der Küche als Gemüse verwendet."
    ),

    // Q31
    Question(
        categoryId = 8,
        questionText = "Aus welchem Land stammt Kurkuma und aus welchem Pflanzenteil wird das Gewürz gewonnen?",
        answerA = "China – aus den Blättern",
        answerB = "Marokko – aus den Samen",
        answerC = "Indien – aus dem Wurzelstock (Rhizom)",
        answerD = "Thailand – aus den Blüten",
        correctAnswer = 2,
        explanation = "Kurkuma stammt aus Südasien (v.a. Indien) und wird seit über 4.000 Jahren kultiviert. Das Gewürz wird aus dem frischen oder getrockneten Wurzelstock (Rhizom) gewonnen.",
        difficulty = 2,
        funFact = "Kurkuma enthält den Wirkstoff Curcumin, der für die charakteristische gelbe Farbe verantwortlich ist und entzündungshemmende Eigenschaften besitzen soll."
    ),

    // Q32
    Question(
        categoryId = 8,
        questionText = "Was enthält 'Ras el Hanout' – die nordafrikanische Gewürzmischung?",
        answerA = "Ausschließlich Chili, Kreuzkümmel und Koriander",
        answerB = "Nur Safran und Salz in einer speziellen Proportion",
        answerC = "Eine komplexe Mischung aus bis zu 30 Gewürzen wie Kurkuma, Zimt, Kardamom, Muskat und Pfeffer",
        answerD = "Gewürze und getrocknetes Fleisch",
        correctAnswer = 2,
        explanation = "Ras el Hanout (arabisch: 'Kopf des Ladens') ist eine nordafrikanische Gewürzmischung aus Marokko mit 10–30 Gewürzen: typischerweise Kurkuma, Zimt, Kardamom, Muskat, Ingwer und manchmal Rosenblüten.",
        difficulty = 2,
        funFact = "Der Name 'Ras el Hanout' bedeutet 'Kopf des Ladens' – der Händler stellt seine besten Gewürze zusammen. Jeder Händler hat sein eigenes Geheimrezept."
    ),

    // Q33
    Question(
        categoryId = 8,
        questionText = "Was ist 'Szechuan-Pfeffer' und welche besondere Wirkung hat er im Mund?",
        answerA = "Ein Pfeffer aus China mit normaler Schärfe, aber intensivem Zitrusaroma",
        answerB = "Eine Pfeffersorte mit besonders hohem Capsaicingehalt",
        answerC = "Kein echter Pfeffer, sondern Beerenschalen (Zanthoxylum), die ein kribbelndes, taubendes Gefühl erzeugen",
        answerD = "Ein Mischgewürz aus Ingwer und schwarzem Pfeffer",
        correctAnswer = 2,
        explanation = "Szechuan-Pfeffer ist botanisch kein echter Pfeffer, sondern die Schalen von Beeren einer Rautengewächspflanze. Der Wirkstoff Hydroxy-alpha-Sanshool erzeugt ein kribbelndes, taubendes Gefühl (Parästhesie) im Mund.",
        difficulty = 2,
        funFact = "Das kribbelnde Mundgefühl nennt sich auf Chinesisch 'Ma' (taubend) – kombiniert mit 'La' (scharf durch Chili) ergibt das die typische Sichuan-Kombination 'Ma-La'."
    ),

    // Q34
    Question(
        categoryId = 8,
        questionText = "Wer brachte Kakao nach Europa und wann wurde Schokolade erstmals am Hof getrunken?",
        answerA = "Christoph Kolumbus 1492 – zuerst in Portugal",
        answerB = "Amerigo Vespucci 1500 – erstmals 1520 in Florenz",
        answerC = "Hernán Cortés 1528 – erstmals 1544 als Getränk am spanischen Hof",
        answerD = "Ferdinand Magellan 1519 – erstmals 1530 in London",
        correctAnswer = 2,
        explanation = "Hernán Cortés brachte Kakao 1528 nach Spanien. 1544 wurde Schokolade erstmals als Getränk am spanischen Hof getrunken.",
        difficulty = 2,
        funFact = "Die Azteken verwendeten Kakaobohnen auch als Zahlungsmittel. Das aztekische Wort 'xocolatl' bedeutet 'bitteres Wasser'."
    ),

    // Q35
    Question(
        categoryId = 8,
        questionText = "Was ist der Unterschied zwischen Kimchi und Sauerkraut?",
        answerA = "Beide sind identisch – Kimchi ist nur der koreanische Name für Sauerkraut",
        answerB = "Kimchi wird mit Essig hergestellt, Sauerkraut durch natürliche Gärung",
        answerC = "Kimchi ist ein koreanisches Fermentationsprodukt (meist Chinakohl) mit Chili, Knoblauch und Ingwer – Sauerkraut ist deutsches fermentiertes Weißkohl",
        answerD = "Sauerkraut enthält mehr Bakterienkulturen als Kimchi",
        correctAnswer = 2,
        explanation = "Beide sind lactofermentierte Kohlprodukte, aber Kimchi wird mit Chili, Knoblauch, Ingwer und Frühlingszwiebeln gewürzt und ist deutlich schärfer. Sauerkraut ist milder und enthält kaum Gewürze außer Salz.",
        difficulty = 2,
        funFact = "In Korea gibt es über 200 verschiedene Kimchi-Varianten – nicht nur aus Chinakohl, sondern auch aus Rettich, Gurken und sogar Wassermelone."
    ),

    // Q36
    Question(
        categoryId = 8,
        questionText = "Was ist 'Herbes de Provence' und welche Kräuter enthält diese Mischung?",
        answerA = "Eine Mischung aus Dill, Petersilie und Kerbel aus der Normandie",
        answerB = "Eine frische Kräutermischung aus der Bretagne mit Estragon und Schnittlauch",
        answerC = "Eine getrocknete Kräutermischung aus dem Süden Frankreichs mit Thymian, Rosmarin, Oregano und oft Lavendel",
        answerD = "Eine Gewürzmischung aus getrockneten Gemüsearten aus der Provence",
        correctAnswer = 2,
        explanation = "Herbes de Provence ist eine provenzalische Kräutermischung: Thymian, Rosmarin, Oregano (wilder Majoran), Majoran und oft Lavendel sowie Bohnenkraut.",
        difficulty = 2,
        funFact = "Lavendel in Herbes de Provence ist eigentlich eine amerikanische Erfindung – in der traditionellen französischen Kochpraxis wird Lavendel selten in Gewürzmischungen verwendet."
    ),

    // Q37
    Question(
        categoryId = 8,
        questionText = "Was ist 'Crème fraîche' und wie unterscheidet sie sich von Sauerrahm?",
        answerA = "Crème fraîche ist identisch mit Sauerrahm, nur der Name ist anders",
        answerB = "Sauerrahm wird pasteurisiert, Crème fraîche nicht",
        answerC = "Crème fraîche hat einen höheren Fettgehalt (30–40 %) und ist dadurch kochfest – Sauerrahm hat weniger Fett und ist säuerlicher",
        answerD = "Crème fraîche enthält keine Bakterienkulturen im Gegensatz zu Sauerrahm",
        correctAnswer = 2,
        explanation = "Crème fraîche hat mit 30–40 % einen deutlich höheren Fettgehalt als Sauerrahm (10–20 %), was sie kochfest macht – sie flockt beim Erhitzen nicht aus. Beide werden durch Milchsäurekulturen gesäuert.",
        difficulty = 2,
        funFact = "In Deutschland ist Crème fraîche als 'Schmand' (mit 24–28 % Fett) bekannt, während der Begriff 'Crème fraîche' für die fettreichere Variante gilt."
    ),

    // Q38
    Question(
        categoryId = 8,
        questionText = "Was ist 'Matcha' und wie unterscheidet es sich von normalem grünem Tee?",
        answerA = "Matcha ist ein chinesischer Weißtee mit besonders mildem Geschmack",
        answerB = "Matcha ist fermentierter grüner Tee ähnlich wie Pu-erh",
        answerC = "Matcha ist japanischer grüner Tee in Pulverform aus beschatteten Pflanzen mit höherem Koffein- und Chlorophyllgehalt",
        answerD = "Matcha ist getrockneter grüner Tee ohne Verarbeitung",
        correctAnswer = 2,
        explanation = "Matcha ist fein gemahlener japanischer Grüntee. Die Pflanzen werden 3–4 Wochen vor der Ernte beschattet, was den Chlorophyll- und L-Theanin-Gehalt erhöht. Der gesamte Teeblatt wird als Pulver getrunken.",
        difficulty = 2,
        funFact = "Für 30 Gramm Matcha werden etwa 100 Gramm Teeblätter benötigt. Zeremonieller Matcha der höchsten Qualität kostet mehrere Hundert Euro pro 100 Gramm."
    ),

    // --- correctAnswer = 3 (12 Fragen) ---

    // Q39
    Question(
        categoryId = 8,
        questionText = "Welcher Pflanzenteil des Lorbeerstrauchs wird als Gewürz verwendet?",
        answerA = "Die Beeren des Lorbeers",
        answerB = "Die Rinde des Lorbeerstrauchs",
        answerC = "Die Wurzeln des Lorbeers",
        answerD = "Die Blätter des echten Lorbeers (Laurus nobilis)",
        correctAnswer = 3,
        explanation = "Als Gewürz werden die Blätter des echten Lorbeers (Laurus nobilis) verwendet, frisch oder getrocknet in Suppen, Eintöpfen und Marinaden.",
        difficulty = 2,
        funFact = "Im antiken Griechenland und Rom wurden Lorbeerkränze als Zeichen des Sieges getragen – daher der Ausdruck 'auf seinen Lorbeeren ausruhen'."
    ),

    // Q40
    Question(
        categoryId = 8,
        questionText = "Welche Gemüsepflanzen gehören wie die Tomate zur Familie der Nachtschattengewächse?",
        answerA = "Karotte und Pastinake",
        answerB = "Zucchini und Kürbis",
        answerC = "Zwiebel und Knoblauch",
        answerD = "Kartoffel, Paprika und Aubergine",
        correctAnswer = 3,
        explanation = "Kartoffel, Paprika und Aubergine gehören wie die Tomate zur Familie der Nachtschattengewächse (Solanaceae). Diese Familie umfasst auch giftige Pflanzen wie Tollkirsche und Bilsenkraut.",
        difficulty = 2,
        funFact = "Die grünen Teile der Kartoffelpflanze sowie grüne Kartoffeln sind giftig und enthalten das Alkaloid Solanin – weshalb man Kartoffeln nicht roh oder grün essen sollte."
    ),

    // Q41
    Question(
        categoryId = 8,
        questionText = "Welche Lebensmittel kamen erst durch die Entdeckung Amerikas nach Europa?",
        answerA = "Reis, Ingwer und Pfeffer",
        answerB = "Zitrusfrüchte, Olivenöl und Mandeln",
        answerC = "Zimt, Vanille und Kardamom",
        answerD = "Tomate, Kartoffel, Kakao, Mais und Chili",
        correctAnswer = 3,
        explanation = "Tomate, Kartoffel, Kakao, Mais, Chili, Paprika, Erdnüsse und Kürbis kamen erst nach der Entdeckung Amerikas (1492) durch den 'Columbian Exchange' nach Europa.",
        difficulty = 2,
        funFact = "Ohne Kartoffeln und Tomaten wäre die europäische Küche – besonders die irische und süditalienische – heute kaum vorstellbar, obwohl diese Zutaten erst seit dem 16. Jahrhundert bekannt sind."
    ),

    // Q42
    Question(
        categoryId = 8,
        questionText = "Was ist 'Piment' (Nelkenpfeffer) und woher stammt er?",
        answerA = "Eine Mischung aus Pfeffer, Nelken und Zimt aus der Karibik",
        answerB = "Ein südamerikanisches Gewürz aus der Familie der Paprikagewächse",
        answerC = "Eine getrocknete Paprikasorte aus Spanien",
        answerD = "Die getrockneten unreifen Beeren des Pimentbaums aus der Karibik, die nach Nelken, Zimt und Muskat schmecken",
        correctAnswer = 3,
        explanation = "Piment (Allspice) sind die getrockneten, unreifen Beeren des Pimentbaums (Pimenta dioica) aus der Karibik. Der Geschmack erinnert an eine Kombination aus Nelken, Zimt und Muskat.",
        difficulty = 2,
        funFact = "Piment ist ein unverzichtbarer Bestandteil der jamaikanischen Jerk-Würzmischung und wächst hauptsächlich in Jamaika."
    ),

    // Q43
    Question(
        categoryId = 8,
        questionText = "Was ist 'Safran' chemisch betrachtet und warum färbt er gelb?",
        answerA = "Er enthält Curcumin wie Kurkuma",
        answerB = "Er enthält Anthocyane, die je nach pH-Wert die Farbe ändern",
        answerC = "Er enthält Chlorophyll, das sich beim Erhitzen gelb verfärbt",
        answerD = "Er enthält Crocin, ein wasserlösliches Carotinoid, das die gelbe Farbe erzeugt",
        correctAnswer = 3,
        explanation = "Die gelbe Farbe des Safrans kommt vom Crocin, einem wasserlöslichen Carotinoid-Glykosid. Das Aroma stammt vom Safranal, das beim Trocknen aus Picrocrocin entsteht.",
        difficulty = 2,
        funFact = "Safran war so wertvoll, dass seine Verfälschung in Deutschland im Mittelalter mit dem Tod bestraft wurde – darunter Verbrennung oder Lebendigbegraben."
    ),

    // Q44
    Question(
        categoryId = 8,
        questionText = "Was ist 'Fischsauce' und wie wird sie hergestellt?",
        answerA = "Eine schnell hergestellte Sauce aus frischem Fisch und Zitronensaft",
        answerB = "Eine Sauce aus gekochtem Fischfond und Stärke",
        answerC = "Ein Essig aus vergorenem Fisch",
        answerD = "Ein fermentiertes Würzmittel aus Fisch und Salz, das durch monatelangen Fermentationsprozess entsteht",
        correctAnswer = 3,
        explanation = "Fischsauce entsteht durch Einlegen von Fisch (meist kleinen Sardellen) in Salz und anschließende Fermentation über 12–18 Monate. Die entstehende Flüssigkeit ist die aromatische, salzige Fischsauce.",
        difficulty = 2,
        funFact = "Das antike römische Garum ist der Vorläufer der modernen Fischsauce und war in der Römerzeit das wichtigste Würzmittel – vergleichbar mit dem heutigen Salz."
    ),

    // Q45
    Question(
        categoryId = 8,
        questionText = "Was ist 'Za'atar' in der levantinischen Küche?",
        answerA = "Eine süße Granatapfel-Melasse",
        answerB = "Eine Marinade aus Joghurt und Minze",
        answerC = "Ein Kichererbsen-Dip ähnlich wie Hummus",
        answerD = "Eine Kräuter-Sesam-Mischung mit Thymian, Oregano, Sumach und Sesam",
        correctAnswer = 3,
        explanation = "Za'atar ist eine levantinische Gewürzmischung aus wildem Thymian, Oregano oder Majoran, Sumach und geröstetem Sesam. Es wird in der libanesischen, palästinensischen und israelischen Küche sehr häufig verwendet.",
        difficulty = 2,
        funFact = "Za'atar wird in der Levante traditionell mit Olivenöl gemischt und zum Frühstück mit Fladenbrot gegessen. Es gilt in der Region als Gehirnnahrung und Gedächtnismittel."
    ),

    // Q46
    Question(
        categoryId = 8,
        questionText = "Was ist 'Worcestershire-Sauce' und was sind ihre Hauptzutaten?",
        answerA = "Aus Japan – mit Sojasauce, Sake und Ingwer",
        answerB = "Aus Amerika – mit Tomaten, Mais und Chili",
        answerC = "Aus Frankreich – mit Wein, Schalotten und Estragon",
        answerD = "Aus England – mit Sardellen, Tamarinde, Melasse, Essig und Gewürzen",
        correctAnswer = 3,
        explanation = "Worcestershire-Sauce stammt aus der englischen Stadt Worcester und wurde in den 1830ern von Lea & Perrins entwickelt. Hauptzutaten sind Sardellen, Tamarinde, Melasse, Essig, Zwiebeln und Gewürze.",
        difficulty = 2,
        funFact = "Laut Legende soll die Sauce aus einem misslungenen Experiment entstanden sein – als das Ergebnis als schlecht befunden und im Keller gelagert wurde, entpuppte es sich Monate später als köstlich fermentiert."
    ),

    // Q47
    Question(
        categoryId = 8,
        questionText = "Was unterscheidet den botanischen Ursprung von Basilikum und Oregano?",
        answerA = "Basilikum stammt aus dem Mittelmeerraum, Oregano aus Indien",
        answerB = "Beide Kräuter stammen aus Südamerika",
        answerC = "Basilikum stammt aus China, Oregano aus Griechenland",
        answerD = "Basilikum stammt ursprünglich aus Indien, Oregano ist ein echtes Mittelmeergewächs",
        correctAnswer = 3,
        explanation = "Obwohl Basilikum heute eng mit der mediterranen Küche verbunden ist, stammt es ursprünglich aus Indien und Südostasien. Oregano ist dagegen ein echtes Mittelmeergewächs.",
        difficulty = 2,
        funFact = "In Indien wird Basilikum (Tulsi) als heilige Pflanze verehrt und wächst in vielen Tempeln."
    ),

    // Q48
    Question(
        categoryId = 8,
        questionText = "Was ist eine 'Erdnuss' botanisch gesehen?",
        answerA = "Eine unterirdisch wachsende Nuss aus der Familie der Rosengewächse",
        answerB = "Eine Knollenpflanze ähnlich wie Kartoffel",
        answerC = "Eine Walnussvariante, die ursprünglich aus Afrika stammt",
        answerD = "Eine Hülsenfrucht (Leguminose), die die Früchte im Boden reift",
        correctAnswer = 3,
        explanation = "Die Erdnuss (Arachis hypogaea) ist botanisch eine Hülsenfrucht aus der Familie der Leguminosae und damit enger mit Bohnen und Linsen verwandt als mit echten Nüssen. Nach der Befruchtung wächst die Pflanze aktiv in den Boden, wo die Früchte reifen.",
        difficulty = 2,
        funFact = "Erdnüsse stammen aus Südamerika und wurden von den Inkas seit mindestens 7.600 Jahren kultiviert. Heute ist China der größte Erdnussproduzent der Welt."
    ),

    // Q49
    Question(
        categoryId = 8,
        questionText = "Wie wird Apfelessig hergestellt und was macht Rohkostessig besonders?",
        answerA = "Rohkostessig wird aus rohen Äpfeln gemacht, normaler aus gekochten",
        answerB = "Normaler Apfelessig enthält mehr Essigsäure als Rohkostessig",
        answerC = "Rohkostessig wird ohne Hefe hergestellt",
        answerD = "Normaler Apfelessig: doppelte Fermentation mit anschließender Filterung. Rohkostessig: ungefiltert mit der 'Mutter des Essigs' (lebender Bakterienkultur)",
        correctAnswer = 3,
        explanation = "Beiden liegt eine doppelte Fermentation zugrunde. Rohkostessig ist ungefiltert und enthält die 'Mutter des Essigs' – die trübe Bakterienkultur (Biofilm aus Acetobacter-Bakterien).",
        difficulty = 2,
        funFact = "Die 'Mutter des Essigs' kann wie ein Sauerteig-Starter endlos weiterverwendet werden – manche Familien pflegen ihre Essig-Mutter über Generationen."
    ),

    // Q50
    Question(
        categoryId = 8,
        questionText = "Was ist 'Arabica' im Vergleich zu 'Robusta' bei Kaffeebohnen?",
        answerA = "Arabica wächst in Tieflagen und ist billiger, Robusta wächst in Bergen",
        answerB = "Robusta ist arabisch, Arabica ist brasilianisch",
        answerC = "Arabica ist immer dunkel geröstet, Robusta immer hell",
        answerD = "Arabica hat mehr Aroma und weniger Koffein, wächst in Höhenlagen – Robusta ist kräftiger, bitterer und hat mehr Koffein",
        correctAnswer = 3,
        explanation = "Arabica (Coffea arabica) wächst in höheren Lagen (600–2.000 m), hat ein komplexeres Aroma und weniger Koffein (1,2 %). Robusta (Coffea canephora) wächst in Tieflagen, hat mehr Koffein (2,7 %) und einen bittereren Geschmack.",
        difficulty = 2,
        funFact = "Der teuerste Kaffee der Welt – Kopi Luwak aus Indonesien – stammt aus Kaffeebohnen, die von Schleichkatzen gefressen und wieder ausgeschieden werden. Ein Kilogramm kostet bis zu 700 Euro."
    ),

)
