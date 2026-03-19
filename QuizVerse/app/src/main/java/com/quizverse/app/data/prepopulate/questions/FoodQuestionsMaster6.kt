package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsMaster6(): List<Question> = listOf(

    // ── TRÜFFEL ───────────────────────────────────────────────────────────────

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Welcher Trüffel wird als wertvollster und teuerster der Welt gehandelt und erzielt Kilopreise von bis zu 15.000 Euro?",
        answerA = "Weißer Alba-Trüffel (Tuber magnatum)",
        answerB = "Schwarzer Périgord-Trüffel (Tuber melanosporum)",
        answerC = "Burgundertrüffel (Tuber aestivum)",
        answerD = "Chinesischer Sommertrüffel (Tuber indicum)",
        correctAnswer = 0,
        explanation = "Der Weiße Alba-Trüffel (Tuber magnatum pico) aus dem Piemont in Norditalien ist der wertvollste Trüffel der Welt. Je nach Qualität und Marktlage kostet ein Kilogramm zwischen 9.000 und 15.000 Euro. Er lässt sich nicht kultivieren und wächst nur wild.",
        difficulty = 5,
        funFact = "Der bisher teuerste einzelne Trüffel wurde 2007 versteigert: ein weißer Alba-Trüffel von 1,5 kg für 330.000 Dollar."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "In welcher Region Frankreichs wächst der berühmte schwarze Périgord-Trüffel, der als 'Diamant der Küche' bezeichnet wird?",
        answerA = "Normandie",
        answerB = "Dordogne (Périgord)",
        answerC = "Champagne",
        answerD = "Provence",
        correctAnswer = 1,
        explanation = "Der schwarze Périgord-Trüffel (Tuber melanosporum) gedeiht vor allem im Périgord, der historischen Landschaft im Département Dordogne in Südwestfrankreich. Auguste Escoffier nannte ihn 'den Diamanten der Küche'. Die Hauptsaison liegt von November bis März.",
        difficulty = 5,
        funFact = "Frankreich produziert heute nur noch etwa 30-50 Tonnen schwarze Trüffel pro Jahr — vor 100 Jahren waren es noch über 1.000 Tonnen."
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "Mit welchem Tier werden Trüffel traditionell in Frankreich gesucht, obwohl heute häufig Hunde eingesetzt werden?",
        answerA = "Ziegen",
        answerB = "Ratten",
        answerC = "Schweine (Sauen)",
        answerD = "Dachsen",
        correctAnswer = 2,
        explanation = "Traditionell wurden in Frankreich Schweine — insbesondere Sauen — zur Trüffelsuche eingesetzt, da diese den Duft von reifem Trüffel besonders gut erschnüffeln. Das Problem: Sie fressen die Trüffel oft sofort auf. Deshalb sind heute speziell ausgebildete Hunde die bevorzugten Suchhilfen.",
        difficulty = 5,
        funFact = "Der Grund, warum Schweine Trüffel so gut riechen können: Trüffel enthalten Androstenol, ein Pheromon das auch im Speichel von Ebern vorkommt."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Wie lautet der lateinische Artname des weißen Alba-Trüffels, der in der Küche des Piemonts als 'tartufo bianco' bekannt ist?",
        answerA = "Tuber melanosporum",
        answerB = "Tuber aestivum",
        answerC = "Tuber brumale",
        answerD = "Tuber magnatum",
        correctAnswer = 3,
        explanation = "Der weiße Alba-Trüffel trägt den wissenschaftlichen Namen Tuber magnatum pico. Er wächst ausschließlich in bestimmten Regionen Italiens (Piemont, Toskana, Umbrien) und Kroatiens und lässt sich trotz jahrzehntelanger Versuche nicht künstlich kultivieren.",
        difficulty = 5,
        funFact = "Das Wort 'tartufo' stammt vom lateinischen 'terrae tufer' (Erdknollen). In der Schweiz heißt die Eisspezialität 'Tartufo' nach dem Trüffel wegen ihrer ähnlichen Form."
    ),

    // ── SAFRAN ───────────────────────────────────────────────────────────────

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Wie viele Blüten der Safran-Krokuspflanze werden benötigt, um ein einziges Kilogramm Safran zu gewinnen?",
        answerA = "Etwa 200.000 Blüten",
        answerB = "Etwa 50.000 Blüten",
        answerC = "Etwa 500.000 Blüten",
        answerD = "Etwa 1.000.000 Blüten",
        correctAnswer = 0,
        explanation = "Für ein Kilogramm Safran werden rund 200.000 Blüten des Krokus sativus benötigt. Jede Blüte hat nur drei Staubfäden (Stigmata), die in mühsamer Handarbeit gepflückt werden müssen. Aus diesem Grund kostet ein Gramm Safran rund 30 Euro.",
        difficulty = 5,
        funFact = "Die gesamte Weltjahresproduktion von Safran beträgt nur etwa 300 Tonnen — davon stammen über 90% aus dem Iran, besonders aus der Region Chorasan."
    ),

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Aus welchem Teil der Safran-Krokuspflanze (Crocus sativus) wird das Gewürz gewonnen?",
        answerA = "Aus den Blütenblättern",
        answerB = "Aus den Narben (Stempeln) der Blüte",
        answerC = "Aus der Zwiebel (Knolle)",
        answerD = "Aus den Blättern",
        correctAnswer = 1,
        explanation = "Safran wird aus den drei tiefroten Narben (Stigmata) des Stempels der Safranblüte gewonnen. Diese werden vorsichtig per Hand gepflückt und anschließend getrocknet. Dabei verdichtet sich der Gehalt der Aromastoffe erheblich.",
        difficulty = 5,
        funFact = "Safran wird seit über 3.500 Jahren kultiviert — Fresken aus dem minoischen Kreta zeigen bereits Safranpflücker um 1600 v. Chr."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "Welches Land ist heute mit Abstand der weltgrößte Produzent von Safran?",
        answerA = "Spanien",
        answerB = "Griechenland",
        answerC = "Iran",
        answerD = "Indien",
        correctAnswer = 2,
        explanation = "Der Iran produziert über 90% des weltweiten Safrans, hauptsächlich in der Region Chorasan. Spanien ist der zweitgrößte Produzent, bekannt für den La-Mancha-Safran (D.O.P.). Indien (Kashmir) und Griechenland (Krokos/Kozani) sind ebenfalls bedeutende Erzeuger.",
        difficulty = 5,
        funFact = "Das spanische Paella-Gericht, das als Nationalgericht gilt, verwendet Safran als charakteristisches Gewürz — obwohl spanischer Safran selbst größtenteils aus dem Iran importiert wird."
    ),

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Welche chemische Verbindung ist hauptverantwortlich für die charakteristische goldgelbe Farbe, die Safran an Speisen verleiht?",
        answerA = "Safranal",
        answerB = "Picrocrocin",
        answerC = "Crocetin",
        answerD = "Crocin",
        correctAnswer = 3,
        explanation = "Crocin, ein wasserlösliches Carotinoid-Glykosid, ist für die intensive goldgelbe Farbe von Safran verantwortlich. Safranal hingegen ist hauptverantwortlich für das charakteristische Aroma, während Picrocrocin den bitteren Geschmack beisteuert.",
        difficulty = 5,
        funFact = "Schon die alten Römer nutzten Safran nicht nur als Gewürz, sondern auch als Parfüm, Farbstoff für Kleidung und als Medizin gegen Melancholie."
    ),

    // ── KAVIAR ───────────────────────────────────────────────────────────────

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Von welcher Fischart stammt der legendäre Almas-Kaviar, der als teuerster Kaviar der Welt gilt und bis zu 33.000 Euro pro Kilogramm kostet?",
        answerA = "Albino-Beluga-Stör",
        answerB = "Ossietra-Stör",
        answerC = "Sevruga-Stör",
        answerD = "Sibirischer Stör",
        correctAnswer = 0,
        explanation = "Almas-Kaviar (persisch: Diamant) stammt vom äußerst seltenen Albino-Beluga-Stör (Huso huso) aus dem Kaspischen Meer. Diese weißen oder cremefarbenen Eier werden von Stören produziert, die 60-100 Jahre alt sein müssen. Ein Kilogramm kostet zwischen 15.000 und 33.000 Euro.",
        difficulty = 5,
        funFact = "Almas-Kaviar wird traditionell in einer 24-Karat-Golddose verkauft. Das Londoner Restaurant 'The Petrus' bot eine 100g-Dose für etwa 1.250 Pfund an."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "In welchem Meer wurden traditionell die größten Mengen an Beluga-Kaviar gefangen, bevor strenge Exportverbote eingeführt wurden?",
        answerA = "Schwarzes Meer",
        answerB = "Kaspisches Meer",
        answerC = "Aralsee",
        answerD = "Mittelmeer",
        correctAnswer = 1,
        explanation = "Das Kaspische Meer zwischen Russland, Kasachstan, Aserbaidschan, Turkmenistan und dem Iran war das Zentrum der Beluga-Kaviar-Produktion. Die Überfischung führte zum drastischen Rückgang der Störpopulation. Seit 2005 gilt ein Exportmoratorium für Beluga-Kaviar aus dem Kaspischen Meer.",
        difficulty = 5,
        funFact = "Der Beluga-Stör ist das größte Süßwasser- bzw. Wanderfischlebewesen: Er kann bis zu 7 Meter lang und über 1.000 kg schwer werden und über 100 Jahre alt werden."
    ),

    // Question 11
    Question(
        categoryId = 8,
        questionText = "Wie nennt man die Methode zur Kaviar-Gewinnung, bei der der Stör am Leben bleibt und die Eier durch Massage entnommen werden?",
        answerA = "Aquakultur-Methode",
        answerB = "Laich-Extraktion",
        answerC = "Stripping-Methode",
        answerD = "No-Kill-Methode",
        correctAnswer = 2,
        explanation = "Die 'Stripping-Methode' (auch C-section-Methode) erlaubt die Kaviar-Gewinnung ohne Tötung des Störs. Der Fisch wird betäubt, die Eier werden vorsichtig durch Massage oder einen kleinen Schnitt entnommen, dann wird der Stör vernäht und zurück ins Wasser gesetzt. Dies ermöglicht Nachhaltigkeits-Zertifizierungen.",
        difficulty = 5,
        funFact = "Traditionell wurden Störe getötet, um an den Kaviar zu gelangen. Die Stripping-Methode revolutioniert seit den 2000er Jahren die nachhaltige Kaviar-Produktion."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Welcher Kaviartyp wird von Kennern am meisten geschätzt und stammt vom Ossietra-Stör, der eine Reife von 12-14 Jahren benötigt?",
        answerA = "Sevruga-Kaviar",
        answerB = "Beluga-Kaviar",
        answerC = "Sterlet-Kaviar",
        answerD = "Ossietra-Kaviar",
        correctAnswer = 3,
        explanation = "Ossietra-Kaviar (auch Osietra oder Osetra) vom Russischen Stör (Acipenser gueldenstaedtii) gilt unter Kaviar-Kennern oft als der aromatisch ausgewogenste Kaviar. Die Körner sind mittelgroß, goldbraun bis grünlich, mit einem nussigen Geschmack. Preis: ca. 2.000-4.000 Euro pro Kilogramm.",
        difficulty = 5,
        funFact = "Ossietra ist persisch/russisch für 'Fisch'. Der Ossietra-Stör kann bis zu 80 Jahre alt werden und erst mit 12-14 Jahren liefern die Weibchen erstmals Eier."
    ),

    // ── WAGYU / KOBE-RIND ─────────────────────────────────────────────────────

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Was bedeutet der Begriff 'Wagyu' auf Japanisch wörtlich?",
        answerA = "Japanisches Rind",
        answerB = "Marmoriertes Fleisch",
        answerC = "Gottesvieh",
        answerD = "Edelrind",
        correctAnswer = 0,
        explanation = "'Wagyu' (和牛) bedeutet wörtlich 'japanisches Rind' — 'Wa' (和) steht für Japan, 'Gyu' (牛) bedeutet Rind/Kuh. Es ist ein Oberbegriff für vier japanische Rinderrassen: Japanese Black (Kuroge Washu), Japanese Brown, Japanese Polled und Japanese Shorthorn.",
        difficulty = 5,
        funFact = "Wagyu-Rinder wurden in Japan ursprünglich als Arbeitstiere in der Landwirtschaft eingesetzt, nicht für Fleischproduktion. Erst in der Meiji-Ära (ab 1868) begann die Züchtung für Fleisch."
    ),

    // Question 14
    Question(
        categoryId = 8,
        questionText = "Was ist der entscheidende Unterschied zwischen 'Wagyu' als Oberbegriff und 'Kobe'-Rindfleisch als geschützte Herkunftsbezeichnung?",
        answerA = "Kobe-Rinder werden länger gemästet als andere Wagyu-Rinder",
        answerB = "Kobe ist eine geschützte Herkunftsbezeichnung nur für Tajima-Rinder aus der Präfektur Hyogo",
        answerC = "Kobe-Rinder erhalten täglich Bier und werden regelmäßig massiert",
        answerD = "Kobe bezieht sich ausschließlich auf weibliche Tiere, Wagyu auf alle Geschlechter",
        correctAnswer = 1,
        explanation = "Kobe ist eine streng geschützte Herkunftsbezeichnung (ähnlich wie Champagner) für Tajima-Rinder, die ausschließlich in der Präfektur Hyogo geboren, aufgezogen und geschlachtet werden müssen. Sie müssen zudem strenge Qualitätskriterien erfüllen (BMS ≥ 6, A4/A5 Grade). Nur ca. 4.000 Tiere pro Jahr werden zertifiziert.",
        difficulty = 5,
        funFact = "Bis 2012 war der Export von echtem Kobe-Rindfleisch aus Japan komplett verboten. Selbst heute landen nur winzige Mengen außerhalb Japans — die meisten 'Kobe-Burger' in Deutschland verwenden andere Wagyu-Kreuzungen."
    ),

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Welches Bewertungssystem wird in Japan zur Qualitätsbeurteilung von Wagyu-Fleisch verwendet, wobei A5 die höchste Stufe darstellt?",
        answerA = "Das JAS-Bewertungssystem",
        answerB = "Das JMGA-Bewertungssystem (BMS-Skala)",
        answerC = "Das Miyazaki-Qualitätssystem",
        answerD = "Das Kobe-Zertifizierungssystem",
        correctAnswer = 2,
        explanation = "Das japanische Beef Marbling Standard (BMS) der Japan Meat Grading Association (JMGA) bewertet Wagyu auf einer Skala von 1-12 für die Marmorierung. Kombiniert mit dem Ertragswert (A, B oder C) ergibt sich eine Gesamtbewertung von A1 bis A5. A5/BMS 12 ist die Höchststufe.",
        difficulty = 5,
        funFact = "Ein A5-Wagyu-Steak aus Japan kann bei Körpertemperatur (37°C) anfangen zu schmelzen — das Fett hat einen ungewöhnlich niedrigen Schmelzpunkt durch hohe Ölsäuregehalte."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Wie lange dauert die Mästungsperiode eines Kobe-Rindes in der Regel, bevor es zur Schlachtung freigegeben wird?",
        answerA = "12-18 Monate",
        answerB = "18-24 Monate",
        answerC = "24-28 Monate",
        answerD = "30-32 Monate",
        correctAnswer = 3,
        explanation = "Kobe-Rinder werden 30-32 Monate lang gemästet, deutlich länger als normale Rinder (18-24 Monate). In dieser Zeit erhalten sie hochwertige Kombinationsfutter aus Reis, Mais, Getreide und Biertreber in stressfreier Umgebung. Die lange Mästzeit ist ein Hauptgrund für den hohen Preis.",
        difficulty = 5,
        funFact = "Der Mythos, dass Kobe-Rinder täglich Bier trinken und Massagen bekommen, ist größtenteils Marketing-Legende. In Wirklichkeit erhalten sie nur bei Bedarf Massagen als Entspannung bei Bewegungsmangel."
    ),

    // ── FOIE GRAS & SELTENE DELIKATESSEN ──────────────────────────────────────

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Was bedeutet der französische Begriff 'Foie Gras' wörtlich übersetzt?",
        answerA = "Fette Leber",
        answerB = "Fette Gans",
        answerC = "Gänseleber",
        answerD = "Stopfleber",
        correctAnswer = 0,
        explanation = "'Foie Gras' bedeutet auf Französisch wörtlich 'fette Leber' (foie = Leber, gras = fett). Es handelt sich um die vergrößerte Leber von speziell gefütterten Enten oder Gänsen. Die Leber kann dabei auf das 6-10-fache ihrer normalen Größe anschwellen.",
        difficulty = 5,
        funFact = "Die Geschichte der Foie-Gras-Produktion reicht bis ins alte Ägypten zurück (ca. 2500 v. Chr.). Wandmalereien zeigen Geflügel-Mästung mit Feigen. Die Römer übernahmen diese Praxis und stopften Gänse mit Feigen — daher 'jecur ficatum' (Feigenleber)."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Welche französische Region gilt als Hauptzentrum der traditionellen Foie-Gras-Produktion mit der Bezeichnung IGP (geschützte geografische Angabe)?",
        answerA = "Périgord/Gascogne (Südwestfrankreich)",
        answerB = "Normandie",
        answerC = "Elsass",
        answerD = "Bretagne",
        correctAnswer = 0,
        explanation = "Der Südwesten Frankreichs — insbesondere Périgord, Gascogne und Landes — ist das Herzstück der französischen Foie-Gras-Produktion. Die Region produziert rund 80% der französischen Foie Gras. Elsass ist historisch bekannt, hat aber deutlich weniger Volumen. Foie Gras du Périgord und Canard à Foie Gras du Sud-Ouest tragen IGP-Status.",
        difficulty = 5,
        funFact = "Frankreich produziert und konsumiert über 75% der weltweiten Foie Gras. Das Gericht ist in Frankreich offiziell als 'Teil des kulinarischen und gastronomischen Erbes' gesetzlich geschützt."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "Der Matsutake-Pilz, eine der teuersten Pilzsorten der Welt, wächst in Symbiose mit welchem Baum?",
        answerA = "Eiche",
        answerB = "Buche",
        answerC = "Kiefer (Pinus)",
        answerD = "Zeder",
        correctAnswer = 2,
        explanation = "Der Matsutake (Tricholoma matsutake) lebt in mykorrhizaler Symbiose mit bestimmten Kiefernarten, vor allem der Roten Kiefer (Pinus densiflora) in Japan. Er kann nicht künstlich gezüchtet werden und wächst nur in älteren Kiefernwäldern unter sehr spezifischen Bodenbedingungen. Dies macht ihn extrem selten und teuer (1.400-2.000 Euro/kg).",
        difficulty = 5,
        funFact = "In Japan gilt Matsutake als Symbol des Herbstes und der Vergänglichkeit. Die Matsutake-Ernte hat in Japan durch Kiefernwaldsterben und invasive Schädlinge seit den 1950ern um 99% abgenommen."
    ),

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Welcher spanische Schinken gilt als teuerster der Welt und stammt von Ibérico-Schweinen, die ausschließlich mit Eicheln gemästet werden?",
        answerA = "Jamón Serrano Reserva",
        answerB = "Jamón Ibérico de Cebo",
        answerC = "Jamón Ibérico de Recebo",
        answerD = "Jamón Ibérico de Bellota Pata Negra",
        correctAnswer = 3,
        explanation = "Jamón Ibérico de Bellota Pata Negra ('schwarze Pfote') ist die höchste Qualitätsstufe des iberischen Schinkens. Die Schweine sind reinrassige Ibérico-Rassen, weiden ausschließlich in der Dehesa (Eichenwald), fressen in der Saison nur Eicheln (Bellota) und Kräuter, und die Reifung dauert 36-48 Monate. Preis: bis zu 4.500 Euro für eine ganze Keule.",
        difficulty = 5,
        funFact = "Der Ibérico-Schwarzfußschwein ist einzigartig unter Schweinen: Es kann dank seiner einzigartigen Genetik und Ernährung Olivensäure im Fett einlagern — ähnlich wie Olivenöl. Deshalb gilt das Fett als herzgesund."
    ),

    // ── TEUERSTE LEBENSMITTEL & REKORDE ───────────────────────────────────────

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Für wie viel Dollar wurde eine einzelne Flasche Château Pétrus 1945 bei einer Auktion versteigert, was als Rekordpreis für diese Sorte gilt?",
        answerA = "310.700 Dollar",
        answerB = "195.000 Dollar",
        answerC = "475.000 Dollar",
        answerD = "89.000 Dollar",
        correctAnswer = 0,
        explanation = "Eine Flasche Château Pétrus 1945 wurde 2018 bei einer Christie's-Auktion in Genf für 310.700 Dollar versteigert, was einen Weltrekord für diesen Wein darstellte. Pétrus vom berühmten Jahrgang 1945 gilt als 'Wein des Jahrhunderts'. Eine gewöhnliche Flasche des aktuellen Jahrgangs kostet bereits 3.000-5.000 Euro.",
        difficulty = 5,
        funFact = "Pétrus liegt im Pomerol-Gebiet im Bordeaux und ist das einzige Château ohne Klassifizierungsstatus — und trotzdem eines der teuersten Weine der Welt, weil es nur rund 30.000 Flaschen pro Jahr produziert."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Welcher Käse aus Serbien gilt als teuerster der Welt, wird ausschließlich aus Eselsmilch hergestellt und kostet rund 1.000 Euro pro Kilogramm?",
        answerA = "Sremski Sir",
        answerB = "Pule (Магарећи сир)",
        answerC = "Zlatar Sir",
        answerD = "Kaçkavall",
        correctAnswer = 1,
        explanation = "Pule (serbisch für 'Fohlen') ist ein weißer krümeliger Käse, der ausschließlich auf der Zasavica-Spezialreservat-Farm in Serbien produziert wird. Er wird aus der Milch von Balkan-Eselinnen hergestellt. Da eine Eselin täglich nur 0,2 Liter Milch gibt, benötigt man für 1 kg Käse etwa 25 Liter Milch von 3 Tieren. Preis: ca. 1.000 Euro/kg.",
        difficulty = 5,
        funFact = "Eselsmilch enthält kaum Kasein und kein Lab, weshalb der Käse ohne Zusätze kaum gerinnt. Pule wird deshalb oft mit Schafsmilch gemischt oder mit besonderen Techniken verarbeitet."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Was macht den Kopi-Luwak-Kaffee so einzigartig und teuer (bis zu 700 Euro pro Kilogramm)?",
        answerA = "Er wird auf einem einzigen Vulkan auf Bali angebaut",
        answerB = "Die Kaffeebohnen wurden vom Weißbauchmaki-Affen vorgeknabbert",
        answerC = "Die Kaffeebohnen werden im Magen des Asiatischen Zibetkatze (Luwak) fermentiert",
        answerD = "Er wird nur alle 10 Jahre geerntet, wenn die Kaffeepflanze blüht",
        correctAnswer = 2,
        explanation = "Kopi Luwak (indonesisch: 'Zibetkatzen-Kaffee') ist der Kaffee, dessen Bohnen zuvor vom Asiatischen Palmroller (Paradoxurus hermaphroditus, lokal 'Luwak') gefressen und verdaut wurden. Enzyme im Magen des Tieres verändern die Proteinstruktur der Bohnen und verringern die Bitterkeit. Die unverdauten Bohnen werden aus dem Kot gewonnen.",
        difficulty = 5,
        funFact = "Noch teurer ist Black Ivory Coffee aus Thailand: Elefanten fressen die Kaffeebohnen, und ihr langer Verdauungsprozess (15-70 Stunden) fermentiert die Bohnen. Preis: über 2.500 Euro/kg."
    ),

    // Question 24
    Question(
        categoryId = 8,
        questionText = "Welche japanische Melonenvarietät erzielte 2019 bei einer Auktion in Sapporo einen Rekordpreis von 3,5 Millionen Yen (ca. 27.000 Euro) für nur zwei Melonen?",
        answerA = "Yubari King Melone",
        answerB = "Shizuoka Crown Melone",
        answerC = "Andes Melone",
        answerD = "Hokkaido Muscat Melone",
        correctAnswer = 3,
        explanation = "Zwei Yubari King Melonen wurden 2019 in Sapporo für 5 Millionen Yen (ca. 40.000 Euro) versteigert — ein neuer Rekord. Die Yubari King ist eine Kreuzung aus Earl's Favourite und Burpee's Spicy Cantaloupe und wird nur in der Stadt Yubari auf Hokkaido angebaut. Perfekte Melonen werden in Netze gehängt und handgepflegt.",
        difficulty = 5,
        funFact = "In Japan werden teure Früchte als Luxusgeschenke verschenkt. Ein einzelner Kyoho-Weintraubencluster (bis zu 100 Euro) oder eine perfekte Erdbeere (10+ Euro) gelten als hochgeschätzte Präsente."
    ),

    // ── GUINNESS-REKORDE & KULINARISCHE EXTREME ───────────────────────────────

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Welche Fläche hatte die größte Pizza der Welt, die 2023 vom YouTuber Airrack zusammen mit Pizza Hut hergestellt wurde?",
        answerA = "1.300 Quadratmeter",
        answerB = "800 Quadratmeter",
        answerC = "2.000 Quadratmeter",
        answerD = "500 Quadratmeter",
        correctAnswer = 0,
        explanation = "Die größte Pizza der Welt wurde Anfang 2023 in Los Angeles vom YouTuber Airrack in Kooperation mit Pizza Hut hergestellt und vom Guinness World Records anerkannt. Sie maß 1.296,37 Quadratmeter. Die Herstellung dauerte mehrere Tage und erforderte Hunderte von Köchen.",
        difficulty = 5,
        funFact = "Zum Vergleich: Eine Standard-Pizzeria-Pizza hat etwa 0,07 Quadratmeter. Die Rekordpizza war also etwa 18.500 Pizzen in einer — genug um eine ganze Schule zu sättigen."
    ),

    // Question 26
    Question(
        categoryId = 8,
        questionText = "Was wog der bisher größte jemals gegrillte Hamburger laut Guinness World Records, der 2012 in Minnesota, USA, hergestellt wurde?",
        answerA = "352 Kilogramm",
        answerB = "913 Kilogramm",
        answerC = "1.164 Kilogramm",
        answerD = "488 Kilogramm",
        correctAnswer = 1,
        explanation = "Der schwerste gegrillte Hamburger wog 913,54 kg und wurde am 2. August 2012 beim Black Bear Casino Resort in Carlton, Minnesota, USA hergestellt. Das Fleischpatty allein wog über 777 kg. Der Burger war vollständig essbar und wurde nach der Rekordanerkennung an Besucher verteilt.",
        difficulty = 5,
        funFact = "Das Braten dieses Riesen-Burgers dauerte über 17 Stunden. Dafür wurde ein spezieller Maßschneider-Grill gebaut. Die Temperatur im Inneren wurde kontinuierlich überwacht."
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Wie lange dauerte das Kochen der größten Paella der Welt, die 1992 in Valencia von Juan Carlos Galbis und seinem Team hergestellt wurde und über 100.000 Menschen sättigte?",
        answerA = "6 Stunden",
        answerB = "2 Stunden",
        answerC = "8 Stunden",
        answerD = "12 Stunden",
        correctAnswer = 2,
        explanation = "Die größte Paella der Welt wog fast 30 Tonnen und wurde 1992 in Valencia gekocht. Sie enthielt 6.000 kg Reis, 12.000 kg Hühnerfleisch, 5.000 kg Kaninchen und 400 Liter Olivenöl. Die Zubereitung dauerte ca. 8 Stunden in einem Paellera mit 21,5 Metern Durchmesser.",
        difficulty = 5,
        funFact = "Valencia, die Heimat der Paella, hat sehr strikte Regeln: Eine echte valencianische Paella enthält nur Hähnchen, Kaninchen, grüne Bohnen, Bachata-Bohnen, Tomaten, Öl, Salz, Safran und Reis — kein Meeresfrüchte, keine Chorizo!"
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Welcher Rekord wurde beim 'Golden Boy'-Burger erzielt, der am 28. Juni 2021 für 5.000 Euro verkauft wurde und aus Wagyu-Patty, Kaviar und Blattgold bestand?",
        answerA = "Größter Burger der Welt",
        answerB = "Schwerster Burger der Welt",
        answerC = "Teuerster kommerziell verkaufter Burger der Welt",
        answerD = "Burger mit den meisten Zutaten",
        correctAnswer = 3,
        explanation = "Der 'Golden Boy'-Burger, kreiert vom niederländischen Chef Robert Jan de Veen, wurde am 28. Juni 2021 als teuerster kommerziell erhältlicher Burger der Welt vom Guinness World Records anerkannt. Er enthielt ein Wagyu-Patty, in Champagner gebackene Zwiebelringe, Königskrabben-Beine, Weißen Trüffel, Beluga-Kaviar, ein Blattgold-Brötchen und Safran-Aioli.",
        difficulty = 5,
        funFact = "Der Erlös des Golden Boy-Burgers (5.000 Euro) ging vollständig an einen gemeinnützigen Zweck. Der Burger war als Werbegag konzipiert und nur an einem einzigen Tag erhältlich."
    ),

    // ── LUXUS-WEINE & GETRÄNKE ────────────────────────────────────────────────

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Welcher Weinjahrgang aus dem Château Cheval Blanc (Bordeaux) erzielte bei einer Christie's-Auktion in Genf einen Rekordpreis von über 300.000 Dollar für eine einzige Flasche?",
        answerA = "1961",
        answerB = "1947",
        answerC = "1945",
        answerD = "1959",
        correctAnswer = 1,
        explanation = "Eine 6-Liter-Imperial-Flasche Château Cheval Blanc 1947 wurde bei einer Christie's-Auktion 2010 in Genf für 304.375 Dollar versteigert und stellte damals einen Weltrekord für eine einzelne Flasche bei einer regulären Versteigerung auf. Der Jahrgang 1947 gilt wegen außergewöhnlicher Bedingungen als legendär.",
        difficulty = 5,
        funFact = "Château Cheval Blanc liegt im Saint-Émilion-Gebiet und ist eine der beiden Premier Grand Cru Classé A Lagen (neben Ausone). Trotz seiner Exklusivität fehlt ihm der Ersten-Cru-Status der Médoc-Klassifizierung von 1855."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Wie heißt der älteste noch existierende trinkfähige Wein der Welt, der im Historischen Museum der Pfalz in Speyer ausgestellt wird?",
        answerA = "Der Falerner",
        answerB = "Der Speyerer Wein",
        answerC = "Der Römer-Wein",
        answerD = "Der Speyer-Wein (Römerwein)",
        correctAnswer = 1,
        explanation = "Der 'Speyer-Wein' (auch Römerwein) befindet sich seit seiner Entdeckung 1867 in einer versiegelten Glasflasche im Museum der Pfalz in Speyer. Er stammt aus dem 4. Jahrhundert n. Chr. (ca. 325 AD) und ist damit ca. 1.700 Jahre alt. Ob er noch trinkbar wäre, ist umstritten — Experten raten von einem Versuch ab.",
        difficulty = 5,
        funFact = "Die Flasche Speyer-Wein ist mit Olivenöl als luftdichter Versiegelung und einem Ton-Korken verschlossen. Analysen zeigen, dass noch Alkohol vorhanden ist, aber die Zusammensetzung unbekannt ist."
    ),

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Aus welcher Traubensorte wird der berühmte Château d'Yquem hergestellt, der als weltbester Süßwein gilt und von Bordeaux als einziger 'Premier Cru Supérieur' klassifiziert ist?",
        answerA = "Riesling und Gewürztraminer",
        answerB = "Muscadelle",
        answerC = "Sémillon und Sauvignon Blanc",
        answerD = "Chenin Blanc",
        correctAnswer = 2,
        explanation = "Château d'Yquem, der legendäre Sauternais-Süßwein, wird aus Sémillon (ca. 80%) und Sauvignon Blanc (ca. 20%) hergestellt. Das Geheimnis ist Botrytis cinerea ('Edelfäule'), ein Pilz, der die Beeren schrumpfen lässt und den Zuckergehalt konzentriert. Für eine einzige Flasche (75 cl) werden die Trauben eines ganzen Rebstocks benötigt.",
        difficulty = 5,
        funFact = "In schlechten Jahren verzichtet Château d'Yquem komplett auf die Produktion. Zwischen 1910 und 2010 gab es 9 Jahre ohne Abfüllung, zuletzt 1992. Preis für einen guten Jahrgang: 500-1.000 Euro pro Flasche."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Welche japanische Whisky-Marke erzielte 2019 bei einer Bonhams-Auktion für eine einzelne Flasche des 52-jährigen Yamazaki einen Rekordpreis von über 300.000 Euro?",
        answerA = "Hibiki 30 Years",
        answerB = "Nikka Yoichi",
        answerC = "Hakushu",
        answerD = "Yamazaki 55 Years (Suntory)",
        correctAnswer = 3,
        explanation = "Eine Flasche Yamazaki 55 Years Old (Destilleriejahrgang 1960, abgefüllt 2020) von Suntory wurde 2021 bei einer Bonhams-Auktion für umgerechnet über 600.000 Euro versteigert und stellte damit einen Rekord für japanischen Whisky auf. Weltweit wurden nur 100 Flaschen abgefüllt.",
        difficulty = 5,
        funFact = "Japanischer Whisky wurde lange Zeit als minderwertige Kopie schottischen Whiskys belächelt. Seit Yamazaki 2015 vom britischen Magazin 'Whisky Bible' als weltbester Whisky ausgezeichnet wurde, sind Preise und weltweites Interesse explodiert."
    ),

    // ── EXOTISCHE ZUTATEN & GEWÜRZE ───────────────────────────────────────────

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Was ist 'Long Pepper' (Langer Pfeffer, Piper longum) und warum war er in der Antike teurer als schwarzer Pfeffer?",
        answerA = "Er ist nicht schärfer als schwarzer Pfeffer und kostete mehr wegen seiner medizinischen Verwendung",
        answerB = "Er war das Grundgewürz der römischen Küche, kam nur aus Indien und kostete mehr als schwarzer Pfeffer",
        answerC = "Er wurde ausschließlich für medizinische Zwecke eingesetzt und nicht zum Kochen",
        answerD = "Er wuchs nur in China und wurde auf der Seidenstraße transportiert",
        correctAnswer = 0,
        explanation = "Langer Pfeffer war im antiken Rom und im Mittelalter tatsächlich teurer als schwarzer Pfeffer, obwohl er auch aus Indien kam. Der Grund: Er enthält Piperin in höherer Konzentration und galt als komplexer im Geschmack. Außerdem wurde er intensiv in der Galenischen Medizin als 'wärmend' geschätzt. Er war im 16. Jahrhundert üblich, bevor Chili ihn verdrängte.",
        difficulty = 5,
        funFact = "Pfeffer war im Mittelalter so wertvoll, dass er oft direkt als Währung eingesetzt wurde. 'Pfeffersäcke' war ein spöttischer Begriff für reiche Kaufleute in hanseatischen Städten."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz wird als 'Tonka-Bohne' bezeichnet, enthält den natürlichen Aromastoff Cumarin und war in der EU-Lebensmittelindustrie lange verboten?",
        answerA = "Samen des Tonkabaums (Dipteryx odorata)",
        answerB = "Schote des Vanillebaums (Vanilla tahitensis)",
        answerC = "Frucht des Kumquatbaums",
        answerD = "Samen des Kubebenpfeffers",
        correctAnswer = 1,
        explanation = "Die Tonka-Bohne ist der Samen des Tonkabaums (Dipteryx odorata) aus Südamerika und enthält Cumarin, einen intensiven Aromastoff mit Noten von Vanille, Mandel und Heu. Wegen seines hohen Cumarin-Gehalts (der in großen Mengen leberschädlich ist) war Tonka in der EU als Lebensmittelzusatz verboten, ist aber als Aroma in kleinen Mengen erlaubt.",
        difficulty = 5,
        funFact = "Spitzenköche wie Ferran Adrià und Heston Blumenthal haben Tonka-Bohnen als 'geheime Zutat' populär gemacht. In den USA sind sie als Lebensmittelzutat verboten — in vielen EU-Ländern in kleinen Mengen erlaubt."
    ),

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Welche seltene Pilzsorte wird auf japanischen Eichen gezüchtet, kostet bis zu 1.000 Euro pro Kilogramm und ist für ihren erdigen Umami-Geschmack bekannt?",
        answerA = "Steinpilz (Boletus edulis)",
        answerB = "Enoki-Pilz",
        answerC = "Shiitake-Pilz",
        answerD = "Maitake (Klapperschwamm, Grifola frondosa)",
        correctAnswer = 2,
        explanation = "Obwohl Shiitake heute weit kultiviert wird, können wild gewachsene, auf natürlichen japanischen Eichen (Shii = Steineiche, Take = Pilz) gedeihen und besondere Qualitäten entwickeln. Premium-Wild-Shiitake kann sehr hohe Preise erzielen. Der Maitake (Klapperschwamm) ist jedoch eher bekannt für große Exemplare und Preise bis 1.000 Euro/kg in der Wildform.",
        difficulty = 5,
        funFact = "Der Maitake heißt auf Japanisch 'tanzender Pilz', weil Menschen angeblich vor Freude tanzten, wenn sie ihn fanden — wegen seines Wertes. Er enthält Beta-Glucane, die immunstimulierend wirken sollen."
    ),

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ras el Hanout' und aus welchem nordafrikanischen Land stammt diese Gewürzmischung ursprünglich?",
        answerA = "Eine marokkanische Gewürzmischung mit bis zu 30+ Zutaten, darunter Rose, Safran, Muskat und Anis",
        answerB = "Eine ägyptische Gewürzmischung mit Koriander, Kumin und Zimt",
        answerC = "Eine algerische Gewürzmischung aus Chili, Sumach und Knoblauch",
        answerD = "Eine tunesische Gewürzmischung aus Harissa-Basis und Fenchel",
        correctAnswer = 3,
        explanation = "Ras el Hanout bedeutet auf Arabisch 'Kopf des Ladens' und bezeichnet die beste Gewürzmischung, die ein Händler zu bieten hat. Es stammt ursprünglich aus Marokko und kann 10 bis über 30 verschiedene Gewürze enthalten, darunter oft Rose, Safran, Galgant, Muskat, Nelken, Anis, Piment und mehr. Jeder Händler hat sein eigenes Rezept.",
        difficulty = 5,
        funFact = "Historische Ras-el-Hanout-Rezepte enthielten auch Cannabis-Blüten, getrocknete Rosen und spanische Fliege (ein Aphrodisiakum). Moderne kommerzielle Versionen enthalten diese Zutaten nicht mehr."
    ),

    // ── TEUERSTE LEBENSMITTEL DER WELT (BESONDERE FÄLLE) ──────────────────────

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Was ist 'Edible Gold' (essbares Gold, E175) und in welcher Form wird es in der Haute Cuisine am häufigsten verwendet?",
        answerA = "Als 23-24 Karat Blattgold, Pulver oder Flocken auf Desserts, Cocktails und Fleisch",
        answerB = "Als goldene Paste in Saucen gelöst",
        answerC = "Als vergoldete Keramik auf der das Essen serviert wird",
        answerD = "Als goldene Flüssigkeit in Spirituosen",
        correctAnswer = 0,
        explanation = "Essbares Gold (E175) wird als 23-24 Karat Blattgold (sehr dünn gehämmerte Goldplättchen), Pulver oder Flocken auf Speisen aufgetragen. Es hat keinen Geschmack, ist biologisch inert (verändert sich nicht im Körper) und dient rein der Optik. In der Haute Cuisine findet es Verwendung auf Desserts, Schokoladen-Trüffeln, Fleisch und in Cocktails.",
        difficulty = 5,
        funFact = "Ein Blatt Blattgold (ca. 8x8 cm) wiegt nur 0,1 Milligramm und kostet etwa 0,20-0,50 Euro. Der teuerste 'Gold-Burger' der Welt im Serendipity 3 Restaurant in New York kostete 295 Dollar und war mit 23-Karat-Blattgold bedeckt."
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Welches außergewöhnliche Verfahren wird zur Herstellung des 'Vinaigre de Xérès' (Sherry-Essig) genutzt, das ihn zu einer der teuersten Essig-Sorten macht?",
        answerA = "Das Solera-Verfahren mit bis zu 40 Jahre alten Fässern",
        answerB = "Das Barrique-Verfahren mit amerikanischer Eiche",
        answerC = "Das Orleans-Verfahren mit langsamer Oberflächen-Fermentation",
        answerD = "Das Balsam-Verfahren aus Trevisio",
        correctAnswer = 0,
        explanation = "Echter Sherry-Essig aus Jerez (DO Vinagre de Jerez) wird nach dem Solera-Verfahren in gestapelten Eichenfässern gereift: Jüngerer Essig wird kontinuierlich zu älterem Essig hinzugefügt. Premium-Varianten reifen 40+ Jahre in this cascading system. Ähnlich wie beim Aceto Balsamico Tradizionale konzentriert die lange Reifung Aromen und Komplexität.",
        difficulty = 5,
        funFact = "Der echte Aceto Balsamico Tradizionale di Modena (mit D.O.P.) muss mindestens 12 Jahre (oder 25 Jahre für 'Extravecchio') in immer kleineren Fässern aus verschiedenen Holzarten reifen. 100 ml kosten 60-100 Euro."
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Was ist 'Fugu' und welche Substanz macht diesen japanischen Kugelfisch zur gefährlichsten Delikatesse der Welt?",
        answerA = "Ciguatoxin in der Haut",
        answerB = "Histamin im Fleisch",
        answerC = "Tetrodotoxin in Leber, Hoden und Haut",
        answerD = "Saxitoxin in der Muskulatur",
        correctAnswer = 2,
        explanation = "Fugu (Kugelfisch) enthält Tetrodotoxin (TTX) vor allem in Leber, Eierstöcken, Hoden und Haut — eines der stärksten nicht-eiweißhaltigen Giftstoffe der Welt (1.200-mal giftiger als Zyankali). In Japan dürfen nur lizenzierte Köche Fugu zubereiten, nach einer 2-3-jährigen Ausbildung und strenger Prüfung. Trotzdem gibt es jährlich Todesfälle.",
        difficulty = 5,
        funFact = "In Japan gibt es über 3.700 lizenzierte Fugu-Restaurants. Der Fugu-Liver ist das verbotene Highlight: Er enthält die höchste TTX-Konzentration und war bis 1984 in einigen Regionen erlaubt. Einige Feinschmecker beschreiben ein leichtes Kribbeln auf den Lippen als 'Teil des Erlebnisses'."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Welches Fermentationsprodukt ist 'Garum' und warum erlebt es in der modernen Haute Cuisine eine Renaissance?",
        answerA = "Ein fermentierter Getreidebrei aus dem alten Ägypten, als Vorstufe der Würzsoße",
        answerB = "Eine Paste aus fermentiertem Soja und Weizen, Vorläufer der asiatischen Sojasaucen",
        answerC = "Eine fermentierte Fischsauce aus der römischen Antike, als hochkonzentriertes Umami-Gewürz",
        answerD = "Ein alter griechischer Weinessig mit Honig und Kräutern",
        correctAnswer = 3,
        explanation = "Garum war die allgegenwärtige fermentierte Fischsauce des Römischen Reiches — eine Art antike Worcestershire-Sauce. Fisch (oft Makrele) wurde mit Salz in großen Tonkrügen fermentiert, die entstehende Flüssigkeit gefiltert. Sie enthielt extrem viel Glutaminsäure (Umami). Spitzenköche wie René Redzepi (Noma) haben es wiederentdeckt und machen Garum aus allem: Rindfleisch, Heuschrecken, Rosen.",
        difficulty = 5,
        funFact = "Das berühmteste Garum-Zentrum der Antike war Pompeji. Bei Ausgrabungen wurden ganze Garum-Fabriken und versiegelte Amphoren mit noch erkennbaren Inhalten gefunden. Einige moderne Analytiker haben die alten Rezepte rekonstruiert."
    ),

    // ── AUSSERGEWÖHNLICHE KÜCHENTECHNIKEN & LUXUS-RESTAURANTS ──────────────────

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Was versteht man unter 'Spherification' als kulinarische Technik der Molekularküche, die von Ferran Adrià am elBulli entwickelt wurde?",
        answerA = "Das Einfrieren von Flüssigkeiten in kugelförmigen Formen mit Stickstoff",
        answerB = "Die Technik, Flüssigkeiten durch Alginat-Kalzium-Reaktion in gelierte Kugeln mit flüssigem Kern zu verwandeln",
        answerC = "Das Formen von Schokolade in perfekte Kugeln durch Temperieren",
        answerD = "Das Aufschäumen von Saucen mit Lecithin zu stabilen Schäumen",
        correctAnswer = 1,
        explanation = "Spherification (Sphärifizierung) ist eine von Ferran Adrià am elBulli popularisierte Technik, bei der Natriumalginat in eine Flüssigkeit eingemischt und diese in ein Kalziumbad getropft wird — oder umgekehrt (inverse Spherification). Die Alginat-Kalzium-Reaktion erzeugt eine dünne Gelatinehülle, die einen flüssigen Kern einschließt — wie 'falsche Eier' oder Olivenöl-Perlen.",
        difficulty = 5,
        funFact = "Ferran Adriàs elBulli bei Roses (Katalonien) wurde 5 Mal zur besten Restaurant der Welt gewählt und hatte trotz nur 50 Plätzen über 2 Millionen Reservierungsanfragen jährlich. Es schloss 2011 und wurde zu einem kulinarischen Forschungszentrum."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Was ist der 'Aceto Balsamico Tradizionale di Modena DOP' und wie unterscheidet er sich fundamental vom normalen Balsamico-Essig?",
        answerA = "Er ist nur in Glasflaschen erhältlich, während normaler Balsamico in Holzfässern reift",
        answerB = "Er wird mindestens 12 Jahre in Fässern aus 5 verschiedenen Holzarten gereift, aus eingedicktem Traubensaft (Traubenmost), und kostet 60-100 Euro für 100 ml",
        answerC = "Er wird aus roten Trauben hergestellt, normaler Balsamico aus weißen",
        answerD = "Er enthält keine Essigsäurebakterien und wird durch Fermentation mit Hefen hergestellt",
        correctAnswer = 1,
        explanation = "Aceto Balsamico Tradizionale di Modena DOP ist ein komplett anderes Produkt als günstiger Supermarkt-Balsamico. Er wird ausschließlich aus eingedicktem Traubenmost (Trebbiano/Lambrusco) hergestellt, muss min. 12 Jahre (oder 25 für 'Extravecchio') in immer kleineren Fässern aus verschiedenen Holzarten (Eiche, Kastanie, Kirsche, Maulbeere, Wacholder) reifen. Die jährliche Gesamtproduktion ist winzig.",
        difficulty = 5,
        funFact = "Familien in Modena vererben ihre Balsamico-Fässer (Batteria) von Generation zu Generation. Ein vollständiges Set von 5-7 Fässern, das bereits seit 50 Jahren in Betrieb ist, kann Tausende Euro wert sein."
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Welches Restaurant erhielt 2022 drei Michelin-Sterne und gilt als das teuerste Restaurant der Welt, mit einem Menü von über 800 Euro pro Person?",
        answerA = "Osteria Francescana (Modena, Italien)",
        answerB = "Eleven Madison Park (New York, USA)",
        answerC = "Sublimotion (Ibiza, Spanien)",
        answerD = "Ultraviolet (Shanghai, China)",
        correctAnswer = 2,
        explanation = "Das Sublimotion auf Ibiza (Spanien) gilt als teuerstes Restaurant der Welt mit einem Menü von ursprünglich bis zu 1.650 Euro pro Person. Es kombiniert ein 20-Gänge-Menü mit multisensoriellen Erlebnissen: 360°-Projektionen, Surround-Sound und VR-Brillen. Nur 12 Gäste können gleichzeitig speisen. Allerdings hält es keine Michelin-Sterne.",
        difficulty = 5,
        funFact = "Das 'Ultraviolet' in Shanghai von Paul Pairet (3 Michelin-Sterne) hat nur einen einzigen Tisch für 10 Gäste. Jeder der 22 Gänge wird von individuellem Licht, Sound, Duft und Atmosphäre begleitet. Preis: ca. 800-1.000 Euro pro Person."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Was ist 'Hákarl' und aus welchem Land stammt diese Delikatesse, die durch einen Fermentationsprozess von 2-5 Monaten entgiftet wird?",
        answerA = "Fermentierter Walhai aus Grönland",
        answerB = "Getrockneter Stockfisch aus Norwegen",
        answerC = "Gesalzener Heringsrogen aus Schweden",
        answerD = "Fermentierter Grönlandhai aus Island",
        correctAnswer = 3,
        explanation = "Hákarl ist ein isländisches Nationalgericht: fermentierter Grönlandhai (Somniosus microcephalus). Der Hai enthält im Frischzustand giftige Mengen Trimethylaminoxid und Harnstoff. Durch Fermentation (2-3 Monate im Erdgrab, dann Trocknung) werden diese Substanzen abgebaut. Das Ergebnis riecht intensiv nach Ammoniak und schmeckt extrem stark. Selbst Anthony Bourdain nannte es 'das Schlimmste, was ich je gegessen habe'.",
        difficulty = 5,
        funFact = "Der Grönlandhai ist das am längsten lebende Wirbeltier der Welt: Analysen zeigen, dass manche Individuen über 500 Jahre alt werden. Sie erreichen erst mit 150 Jahren die Geschlechtsreife."
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Was ist 'Ortolan' und warum wird dieser illegale französische Tafelgenuss traditionell mit einem weißen Tuch über dem Kopf des Esser verzehrt?",
        answerA = "Ein seltener Käse aus dem Jura, der essende Personen emotional bewegt",
        answerB = "Ein winziger Singvogel (Gartenammer), der ganz im Mund verzehrt wird, und das Tuch soll den Blick Gottes verbergen",
        answerC = "Eine verbotene Pilzsorte aus den Alpen, deren Duft das Sehen beeinträchtigt",
        answerD = "Ein fermentiertes Vogelei, das so stark riecht dass man es abgeschirmt essen muss",
        correctAnswer = 3,
        explanation = "Der Ortolan (Gartenammer, Emberiza hortulana) ist ein winziger Zugvogel, der in Frankreich seit 1999 illegal gegessen werden darf (er steht unter Schutz). Traditionell wurde er lebendig ertränkt, gebraten und ganz im Mund verzehrt — Knochen inklusive. Das weiße Tuch über dem Kopf soll laut Überlieferung 'den Blick Gottes verbergen' oder die Aromen konzentrieren. François Mitterrand aß ihn als seine letzte Mahlzeit.",
        difficulty = 5,
        funFact = "Trotz des Verbots wird Ortolan in Frankreich weiterhin heimlich gegessen. In den Landes und in der Gascogne werden sie illegal gefangen. EU-Behörden schätzen, dass jährlich noch Zehntausende Ortolane illegal verzehrt werden."
    )

)
