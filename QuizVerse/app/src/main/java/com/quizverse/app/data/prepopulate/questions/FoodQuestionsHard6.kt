package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun foodQuestionsHard6(): List<Question> = listOf(

    // ── SCHOKOLADENGESCHICHTE ─────────────────────────────────────────────────

    // Question 1
    Question(
        categoryId = 8,
        questionText = "Welches Volk kultivierte als erstes den Kakaobaum in größerem Maßstab und nutzte Kakaobohnen als Zahlungsmittel?",
        answerA = "Azteken",
        answerB = "Olmeken",
        answerC = "Inka",
        answerD = "Tolteken",
        correctAnswer = 1,
        explanation = "Die Olmeken, die ab etwa 1500 v. Chr. im Tiefland der mexikanischen Golfküste lebten, gelten als erste Kultiveure des Kakaobaums in größerem Maßstab. Später übernahmen Maya und Azteken diese Tradition und nutzten Kakaobohnen tatsächlich als Zahlungsmittel.",
        difficulty = 3,
        funFact = "Der wissenschaftliche Name des Kakaobaums lautet 'Theobroma cacao' — griechisch für 'Speise der Götter'."
    ),

    // Question 2
    Question(
        categoryId = 8,
        questionText = "Wie hieß das Kakaogetränk der Azteken, das mit Chilli, Vanille und Honig gewürzt wurde?",
        answerA = "Chococatl",
        answerB = "Cacaoatl",
        answerC = "Xocolatl",
        answerD = "Tlilxochitl",
        correctAnswer = 2,
        explanation = "Die Azteken nannten ihr Kakaogetränk 'Xocolatl' (bitteres Wasser). Es wurde kalt getrunken, mit Chilli, Vanille und Honig gewürzt und galt als Kraftdrink, der dem Adel und Kriegern vorbehalten war.",
        difficulty = 3,
        funFact = "Montezuma II. soll täglich bis zu 50 Becher Xocolatl getrunken haben, bevor er Frauen empfing — er galt als Aphrodisiakum."
    ),

    // Question 3
    Question(
        categoryId = 8,
        questionText = "In welchem Jahr brachte Hernán Cortés die ersten Kakaobohnen nach Spanien, was als Beginn der europäischen Schokoladengeschichte gilt?",
        answerA = "1502",
        answerB = "1519",
        answerC = "1528",
        answerD = "1550",
        correctAnswer = 2,
        explanation = "Hernán Cortés kehrte 1528 aus Mexiko nach Spanien zurück und brachte dabei Kakaobohnen sowie die Geräte zur Zubereitung des Xocolatl mit. Kolumbus hatte zwar 1502 Kakaobohnen gesehen, aber ihre Bedeutung nicht erkannt.",
        difficulty = 3,
        funFact = "Die Spanier hielten das Schokoladerezept fast 100 Jahre lang geheim — erst um 1615 verbreitete sich Schokolade als Getränk nach Frankreich."
    ),

    // Question 4
    Question(
        categoryId = 8,
        questionText = "Welches Unternehmen brachte 1848 erstmals eine essbare (feste) Schokolade aus Kakaomasse, Kakaobutter und Zucker auf den Markt?",
        answerA = "Lindt & Sprüngli",
        answerB = "Cadbury",
        answerC = "Fry & Sons",
        answerD = "Nestlé",
        correctAnswer = 2,
        explanation = "Die englische Firma J.S. Fry & Sons brachte 1848 mit dem 'Chocolat Délicieux à Manger' die erste modern essbare Schokoladentafel auf den Markt. Die Masse aus Kakaopulver, Zucker und Kakaobutter konnte zum ersten Mal geformt werden.",
        difficulty = 3,
        funFact = "Lindt erfand 1879 das 'Conchieren' — das stundenlange Rühren der Schokoladenmasse — was die heutige samtige Konsistenz ermöglicht."
    ),

    // ── KARTOFFELGESCHICHTE ───────────────────────────────────────────────────

    // Question 5
    Question(
        categoryId = 8,
        questionText = "Wann kamen die ersten Kartoffeln nach Spanien — als direkte Folge der Conquista unter Pizarro?",
        answerA = "Etwa 1570",
        answerB = "Etwa 1532",
        answerC = "Etwa 1610",
        answerD = "Etwa 1650",
        correctAnswer = 0,
        explanation = "Nach der Eroberung des Inkareiches durch Pizarro (1532) gelangte die Kartoffel zunächst nach Spanien, etwa um 1570. Die erste dokumentierte Erwähnung in Europa stammt aus einem Kloster in Sevilla von 1576.",
        difficulty = 3,
        funFact = "Jahrhundertelang galt die Kartoffel in Europa als verdächtig — manche glaubten, sie verursache Lepra, weil ihre unregelmäßige Form an Leprakranke erinnerte."
    ),

    // Question 6
    Question(
        categoryId = 8,
        questionText = "Welche List verwendete Friedrich der Große, um preußische Bauern zum Kartoffelanbau zu bewegen?",
        answerA = "Er verteilte kostenlose Saatkartoffeln auf Marktplätzen",
        answerB = "Er ließ königliche Kartoffelfelder bewachen, damit Bauern die Knollen heimlich stehlen mussten",
        answerC = "Er erklärte Kartoffeln zum offiziellen Armeeverpflegungsmittel",
        answerD = "Er verbot den Import von Getreide und zwang so zum Anbau",
        correctAnswer = 1,
        explanation = "Friedrich der Große ließ seine königlichen Kartoffelfelder ostentativ von Soldaten bewachen. Die psychologische List funktionierte: Bauern glaubten, etwas Wertvolles werde gehütet, und stahlen nachts die Knollen — und bauten sie dann selbst an.",
        difficulty = 3,
        funFact = "Diese Taktik wird als 'reverse psychology' avant la lettre bezeichnet und ist eines der frühesten bekannten Beispiele für staatliches Nudging in der Agrargeschichte."
    ),

    // Question 7
    Question(
        categoryId = 8,
        questionText = "In welchem europäischen Land löste eine Kartoffelfäule-Katastrophe zwischen 1845 und 1852 eine Hungersnot aus, die zur Emigration von über einer Million Menschen führte?",
        answerA = "Irland",
        answerB = "Polen",
        answerC = "Schottland",
        answerD = "Belgien",
        correctAnswer = 0,
        explanation = "Die Große Hungersnot (Great Famine) in Irland wurde durch den Befall der Kartoffelernte mit dem Erreger Phytophthora infestans ausgelöst. Über eine Million Menschen starben, mehr als eine Million emigrierten — hauptsächlich in die USA.",
        difficulty = 3,
        funFact = "Irlands Bevölkerung betrug vor der Hungersnot etwa 8 Millionen Menschen — heute ist sie nach einem Jahrhundert der Emigration erst wieder auf ca. 7 Millionen gestiegen."
    ),

    // ── GEWÜRZHANDEL & HISTORISCHE HANDELSROUTEN ─────────────────────────────

    // Question 8
    Question(
        categoryId = 8,
        questionText = "Um das Wievielste erhöhte sich der Pfefferpreis auf dem Weg von Indien bis nach Venedig im 15. Jahrhundert?",
        answerA = "Etwa das 30-Fache",
        answerB = "Etwa das 10-Fache",
        answerC = "Etwa das 5-Fache",
        answerD = "Etwa das 50-Fache",
        correctAnswer = 0,
        explanation = "Im 15. Jahrhundert stieg der Pfefferpreis auf dem Weg von Indien nach Venedig um fast das Dreißigfache. In Venedig selbst kostete Pfeffer sogar das 60- bis 100-Fache des Ausgangspreises in Kalkutta.",
        difficulty = 3,
        funFact = "Pfeffer war im Mittelalter so wertvoll, dass Mieten, Mitgiften und sogar Lösegelder in Pfeffer bezahlt wurden. Die Hansestädte nannten reiche Kaufleute 'Pfeffersäcke'."
    ),

    // Question 9
    Question(
        categoryId = 8,
        questionText = "Welches Ereignis beendete hauptsächlich Venedigs Monopol auf den Gewürzhandel mit Asien im späten 15. Jahrhundert?",
        answerA = "Die Einnahme Konstantinopels durch die Osmanen 1453",
        answerB = "Die Entdeckung Amerikas durch Kolumbus 1492",
        answerC = "Der Erste Kreuzzug und die Unterbrechung der Landrouten",
        answerD = "Die Erschließung des Seewegs um Kap der Guten Hoffnung durch Vasco da Gama 1498",
        correctAnswer = 3,
        explanation = "Vasco da Gamas Erschließung des Seewegs um das Kap der Guten Hoffnung 1498 ermöglichte Portugal den direkten Handel mit Indien, ohne den Umweg über venezianische und osmanische Zwischenhändler. Dies brach Venedigs Gewürzmonopol nachhaltig.",
        difficulty = 3,
        funFact = "Die Einnahme Konstantinopels 1453 schadete Venedig ebenfalls — beide Ereignisse zusammen beendeten die venezianische Handelshegemonie innerhalb von nur 50 Jahren."
    ),

    // Question 10
    Question(
        categoryId = 8,
        questionText = "Welches Gewürz war auf den Banda-Inseln (heute Indonesien) so begehrt, dass die Niederländische VOC im 17. Jahrhundert einen Genozid an der einheimischen Bevölkerung verübte, um das Monopol zu sichern?",
        answerA = "Nelken",
        answerB = "Muskatnuss",
        answerC = "Pfeffer",
        answerD = "Zimt",
        correctAnswer = 1,
        explanation = "Die Muskatnuss wuchs ausschließlich auf den Banda-Inseln. Die VOC (Vereinigte Ostindische Kompanie) ließ um 1621 die einheimische Bandanesische Bevölkerung fast vollständig auslöschen — von ca. 15.000 Menschen überlebten nur wenige Hundert — um das Muskatmonopol zu sichern.",
        difficulty = 3,
        funFact = "Im 17. Jahrhundert bot England der VOC an, die Insel Run (eine Banda-Insel) gegen Manhattan einzutauschen — die VOC stimmte zu. Das Muskat-Monopol galt als wertvoller."
    ),

    // ── ZUCKERGESCHICHTE ──────────────────────────────────────────────────────

    // Question 11
    Question(
        categoryId = 8,
        questionText = "In welchem Land wurde um 600 n. Chr. erstmals eine industrielle Methode zur Kristallisierung von Rohrzucker entwickelt?",
        answerA = "Persien",
        answerB = "Arabien",
        answerC = "China",
        answerD = "Indien",
        correctAnswer = 0,
        explanation = "Die Perser entwickelten um 600 n. Chr. eine frühe Raffinierungsmethode: Heißer Zuckerrohrsaft wurde in kegelförmige Tongefäße gefüllt, aus deren Spitze der Sirup abfloss, während im Kegel der Zucker auskristallisierte — das Prinzip des Zuckerhuts.",
        difficulty = 3,
        funFact = "Der Zuckerhut als Verkaufsform für raffinierten Zucker war in Europa bis ins 19. Jahrhundert das Standard-Verkaufsformat; Hausfrauen mussten Stücke mit einer speziellen Zuckerzange abbrechen."
    ),

    // Question 12
    Question(
        categoryId = 8,
        questionText = "Wer entdeckte um 1747, dass die europäische Runkelrübe Saccharose in verarbeitbarer Menge enthält — was zur Entwicklung der Zuckerrübe führte?",
        answerA = "Franz Carl Achard",
        answerB = "Justus von Liebig",
        answerC = "Carl von Linné",
        answerD = "Andreas Sigismund Marggraf",
        correctAnswer = 3,
        explanation = "Der Berliner Chemiker Andreas Sigismund Marggraf entdeckte 1747 durch Extraktion mit Alkohol, dass Runkelrüben Saccharose enthalten. Sein Schüler Franz Carl Achard züchtete daraufhin eine zuckerreichere Varietät und baute 1802 die erste europäische Zuckerrübenfabrik in Schlesien.",
        difficulty = 3,
        funFact = "Napoleons Kontinentalsperre (1806) machte den Rübenzucker wirtschaftlich dringend nötig, da Rohrzucker aus den Kolonien nicht mehr importiert werden konnte."
    ),

    // Question 13
    Question(
        categoryId = 8,
        questionText = "Auf welcher Insel begann Kolumbus auf seiner zweiten Reise 1493 mit dem Zuckerrohranbau in der Neuen Welt — ein Wendepunkt für den Atlantischen Sklavenhandel?",
        answerA = "Hispaniola",
        answerB = "Jamaika",
        answerC = "Puerto Rico",
        answerD = "Kuba",
        correctAnswer = 0,
        explanation = "Auf Hispaniola (heute Haiti und Dominikanische Republik) pflanzte Kolumbus auf seiner zweiten Reise erstmals Zuckerrohr in der Neuen Welt. Der Zuckeranbau wurde zum Motor des atlantischen Sklavenhandels, da er extrem arbeitsintensiv war.",
        difficulty = 3,
        funFact = "Schätzungsweise 12 Millionen Afrikaner wurden über drei Jahrhunderte versklavt und in die Neue Welt verschleppt — der Zuckeranbau war die häufigste Zwangsarbeit."
    ),

    // ── KAFFEEGESCHICHTE ──────────────────────────────────────────────────────

    // Question 14
    Question(
        categoryId = 8,
        questionText = "In welcher Stadt wurde 1511 das erste dokumentierte Kaffeeverbot der Geschichte ausgesprochen — und von wem?",
        answerA = "Mekka — vom Gouverneur Khair Beg",
        answerB = "Kairo — vom ägyptischen Sultan",
        answerC = "Konstantinopel — vom osmanischen Sultan Selim I.",
        answerD = "Venedig — vom Papst",
        correctAnswer = 0,
        explanation = "Der Gouverneur von Mekka, Khair Beg, verbot 1511 Kaffee und Kaffeehäuser, da er befürchtete, die Geselligkeit in Kaffeehäusern fördere politische Opposition. Er wurde jedoch kurz darauf vom ägyptischen Sultan abgesetzt, der das Verbot aufhob.",
        difficulty = 3,
        funFact = "Kaffeehäuser wurden auch 'Schulen der Weisheit' genannt — in Wien entwickelten sich die Kaffeehäuser des 17.-19. Jahrhunderts zu wichtigen intellektuellen Treffpunkten."
    ),

    // Question 15
    Question(
        categoryId = 8,
        questionText = "Welche venezianischen Kaufleute brachten 1615 als erste Kaffee nach Westeuropa — und wie reagierte die Kirche zunächst?",
        answerA = "Sie ignorierten Kaffee zunächst vollständig als exotische Kuriosität",
        answerB = "Sie begrüßten Kaffee als nüchternes Getränk im Gegensatz zu Alkohol",
        answerC = "Sie verlangten ein Verbot als 'Getränk des Teufels', bis Papst Clemens VIII. ihn probierte und segnete",
        answerD = "Sie forderten eine Besteuerung wie bei Wein",
        correctAnswer = 2,
        explanation = "Priester in Venedig bezeichneten Kaffee als 'Getränk des Teufels' und verlangten ein Verbot. Papst Clemens VIII. ließ sich eine Tasse bringen, probierte sie und segnete das Getränk — womit er das kirchliche Problem elegant auflöste.",
        difficulty = 3,
        funFact = "Das erste Wiener Kaffeehaus öffnete 1685; der Legende nach brachte der Pole Georg Franz Kolschitzky nach der Zweiten Wiener Türkenbelagerung (1683) erbeutete türkische Kaffeesäcke als Startkapital mit."
    ),

    // Question 16
    Question(
        categoryId = 8,
        questionText = "Welches Land schmuggelte im 17. Jahrhundert als erstes Kaffeepflänzchen aus dem Jemen, um eine eigene Kaffeeplantage zu gründen und das arabische Monopol zu brechen?",
        answerA = "England",
        answerB = "Niederlande",
        answerC = "Frankreich",
        answerD = "Portugal",
        correctAnswer = 1,
        explanation = "Den Niederländern gelang es, um 1616 erste Kaffeepflanzen aus dem Jemen zu schmuggeln. Sie bauten zunächst auf Ceylon (Sri Lanka) und dann auf Java (Indonesien) Kaffee an und brachen so das Monopol des Osmanischen Reichs auf Kaffeexporte.",
        difficulty = 3,
        funFact = "Der Name 'Java' ist bis heute ein Synonym für Kaffee in der englischen Sprache — ein sprachliches Überbleibsel der niederländischen Kolonialherrschaft."
    ),

    // ── BROT, BIER & ANTIKE LEBENSMITTEL ─────────────────────────────────────

    // Question 17
    Question(
        categoryId = 8,
        questionText = "Was erhielten die Arbeiter beim Bau der Pyramiden von Gizeh täglich als Lohnzahlung in Naturalien?",
        answerA = "Hirse, Linsen und Honig",
        answerB = "Brot, Bier, Zwiebeln und Fisch",
        answerC = "Weizen, Datteln und Olivenöl",
        answerD = "Fleisch, Käse und Wein",
        correctAnswer = 1,
        explanation = "Archäologische Funde belegen, dass die Pyramidenarbeiter täglich Brot, Bier, Zwiebeln, Knoblauch und gesalzenen Fisch erhielten. Bier war ein kalorienreiches Grundnahrungsmittel — täglich bis zu 4 Liter pro Arbeiter.",
        difficulty = 3,
        funFact = "Das ägyptische Bier hatte einen Alkoholgehalt von 3-5% und war wegen der ungekochten Gerstekörner auch nahrhafter als heutiges Bier — es war eher flüssiges Brot."
    ),

    // Question 18
    Question(
        categoryId = 8,
        questionText = "Welches ist das älteste bekannte schriftliche Bierrezept der Welt und in welcher Sprache ist es verfasst?",
        answerA = "Das 'Hymnus an Ninkasi' — in sumerischer Keilschrift, ca. 1800 v. Chr.",
        answerB = "Das Papyrus Harris — in altägyptischen Hieroglyphen, ca. 1200 v. Chr.",
        answerC = "Die Zosimos-Schriften — in altgriechisch, ca. 300 n. Chr.",
        answerD = "Das Reinheitsgebot — in mittelhochdeutsch, 1516 n. Chr.",
        correctAnswer = 0,
        explanation = "Der 'Hymnus an Ninkasi', die sumerische Göttin des Bieres, enthält auf Keilschrifttafeln aus ca. 1800 v. Chr. ein vollständiges Bierrezept. Er beschreibt die Zubereitung von Emmer-Malzbrot, das dann mit Wasser vergoren wurde.",
        difficulty = 3,
        funFact = "Das Deutsche Reinheitsgebot von 1516 ist zwar eines der ältesten noch gültigen Lebensmittelgesetze der Welt, aber das Bierbrauen selbst ist mindestens 5.000 Jahre älter."
    ),

    // Question 19
    Question(
        categoryId = 8,
        questionText = "In welchem Jahr und von wem wurde das Bayerische Reinheitsgebot erlassen — und was schrieb es vor?",
        answerA = "1487 von Kaiser Friedrich III. — Bier darf nur in zugelassenen Brauereien hergestellt werden",
        answerB = "1516 von Herzog Wilhelm IV. — Bier darf nur Wasser, Malz und Hopfen enthalten",
        answerC = "1603 von Herzog Maximilian I. — Bier muss mindestens 3 Monate gelagert werden",
        answerD = "1521 von Martin Luther — Bier darf nicht mit Kräutern wie Bilsenkraut versetzt werden",
        correctAnswer = 1,
        explanation = "Das Bayerische Reinheitsgebot wurde am 23. April 1516 von Herzog Wilhelm IV. in Ingolstadt erlassen. Es schrieb vor, dass Bier nur aus Wasser, Malz und Hopfen gebraut werden darf — Hefe war noch nicht als Zutat bekannt und wurde erst später hinzugefügt.",
        difficulty = 3,
        funFact = "Das Reinheitsgebot war ursprünglich auch ein Verbraucherschutzgesetz gegen giftige Zutaten wie Bilsenkraut, Tollkirsche und Stechapfel, die damals manchem Bier zugesetzt wurden."
    ),

    // ── KULINARISCHE ERFINDUNGEN ──────────────────────────────────────────────

    // Question 20
    Question(
        categoryId = 8,
        questionText = "Welcher französische Chemiker gewann 1869 Napoleons III. Preisgeld für eine Butteralternative und erfand damit die Margarine?",
        answerA = "Hippolyte Mège-Mouriès",
        answerB = "Antoine Lavoisier",
        answerC = "Louis Pasteur",
        answerD = "Michel Eugène Chevreul",
        correctAnswer = 0,
        explanation = "Hippolyte Mège-Mouriès gewann 1869 das von Napoleon III. ausgelobte Preisgeld für eine günstige, haltbare Butteralternative für die Armee. Er stellte Margarine aus Rindertalg, Magermilch und Magenextrakt her und nannte sie 'Oleomargarin' nach dem griechischen Wort für Perlmutter.",
        difficulty = 3,
        funFact = "Der Name 'Margarin' kommt vom griechischen 'margarites' (Perle) — die schimmernden, perlähnlichen Fettkristalle gaben dem Produkt seinen Namen."
    ),

    // Question 21
    Question(
        categoryId = 8,
        questionText = "Wie entstanden Cornflakes tatsächlich und wer waren ihre Erfinder?",
        answerA = "Charles William Post erfand sie 1895 als Konkurrenzprodukt zu Granola",
        answerB = "John Harvey Kellogg und sein Bruder Will Keith Kellogg entdeckten sie 1894 zufällig durch übrig gebliebenen gekochten Mais",
        answerC = "Sylvester Graham entwickelte sie 1829 als Teil seiner Getreidediät",
        answerD = "Ferdinand Charles Hennies produzierte sie 1900 erstmals industriell in Deutschland",
        correctAnswer = 1,
        explanation = "John Harvey Kellogg und sein Bruder Will Keith Kellogg ließen 1894 im Battle Creek Sanatorium gekochten Mais versehentlich über Nacht stehen. Am nächsten Morgen rollten sie die getrocknete Masse — es entstanden knusprige Flocken. Will baute daraus einen Milliardenkonzern.",
        difficulty = 3,
        funFact = "Kellogg erfand Cornflakes ursprünglich als 'anti-aphrodisisches' Frühstück für Sanatoriums-Patienten — als gesunde, reizarme Kost zur Unterdrückung 'unzüchtiger Gedanken'."
    ),

    // Question 22
    Question(
        categoryId = 8,
        questionText = "Was war Ketchup ursprünglich, bevor es in den USA mit Tomaten zubereitet wurde?",
        answerA = "Eine Weintrauben-Essig-Sauce aus dem Mittelmeerraum",
        answerB = "Eine Chutney-artige Mangosauce aus Indien",
        answerC = "Eine fermentierte Fischsauce aus Südostasien",
        answerD = "Eine Pilz-Essig-Sauce aus England",
        correctAnswer = 2,
        explanation = "Ketchup leitet sich vom malaiischen 'kecap' oder chinesischen 'ke-tsiap' ab — einer fermentierten Fischsauce aus Südostasien. Englische Kaufleute lernten sie im 17. Jahrhundert kennen und brachten sie nach Europa, wo sie mit verschiedenen Zutaten nachgekocht wurde.",
        difficulty = 3,
        funFact = "Das erste amerikanische Tomaten-Ketchup-Rezept stammt von 1812 — James Mease aus Philadelphia schlug vor, Tomaten zu verwenden, da sie 'love apples' seien und ihnen magische Kräfte zugeschrieben wurden."
    ),

    // Question 23
    Question(
        categoryId = 8,
        questionText = "Welcher Koch und Erfinder entwickelte 1795 das erste Sterilisationsverfahren für Lebensmittel — die sogenannte Appertisierung?",
        answerA = "Alexis Soyer",
        answerB = "Auguste Escoffier",
        answerC = "Marie-Antoine Carême",
        answerD = "Nicolas Appert",
        correctAnswer = 3,
        explanation = "Nicolas Appert, ein französischer Koch und Konditor, erhitzte Lebensmittel in luftdicht verschlossenen Glasgefäßen und erhielt dafür 1809 Napoleons Preisgeld von 12.000 Francs für die Verbesserung der Truppenversorgung. Das Verfahren heißt Appertisierung.",
        difficulty = 3,
        funFact = "Appert wusste nicht warum seine Methode funktionierte — Louis Pasteur erklärte erst 50 Jahre später, dass das Erhitzen Mikroorganismen abtötet."
    ),

    // ── LEBENSMITTELKONSERVIERUNG & PASTEURISIERUNG ───────────────────────────

    // Question 24
    Question(
        categoryId = 8,
        questionText = "In welchem Jahr und für welches Lebensmittel führte Louis Pasteur das erste Pasteurisierungsverfahren durch?",
        answerA = "1864 — für Wein",
        answerB = "1880 — für Fruchtsäfte",
        answerC = "1856 — für Milch",
        answerD = "1871 — für Bier",
        correctAnswer = 0,
        explanation = "Louis Pasteur entwickelte die Pasteurisierung 1864 zunächst für Wein, um das Verderben zu verhindern. Kaiser Napoleon III. beauftragte ihn, das Problem mit französischem Exportwein zu lösen, der auf langen Seereisen sauer wurde.",
        difficulty = 3,
        funFact = "Der Begriff 'Pasteurisierung' für Milch entstand erst Jahrzehnte später — Pasteur selbst arbeitete primär an Wein und Bier."
    ),

    // Question 25
    Question(
        categoryId = 8,
        questionText = "Wer erhielt 1810 das erste Patent für die Konservendose aus Blech — und welches Material wurde anfangs genutzt?",
        answerA = "Nicolas Appert — Weißblech",
        answerB = "Peter Durand — Weißblech (verzinntes Eisenblech)",
        answerC = "Bryan Donkin — Aluminium",
        answerD = "Josiah Wedgwood — Keramik mit Metalldeckel",
        correctAnswer = 1,
        explanation = "Der Engländer Peter Durand meldete 1810 das Patent für verzinntes Eisenblech als Konservenbehälter an. Bryan Donkin kaufte das Patent und eröffnete die erste Dosenfabrik. Die frühen Dosen wurden noch mit Hammer und Meißel geöffnet.",
        difficulty = 3,
        funFact = "Dosenöffner wurden erst 1858 erfunden — fast 50 Jahre nach der Konservendose selbst. Bis dahin standen auf frühen Dosen Anweisungen wie 'mit Meißel und Hammer an der Oberkante öffnen'."
    ),

    // ── LEBENSMITTELGESCHICHTE ALLGEMEIN ─────────────────────────────────────

    // Question 26
    Question(
        categoryId = 8,
        questionText = "In welchem Land wurde Käse als kulturelle Praxis erstmals systematisch entwickelt — basierend auf der ältesten archäologischen Evidenz aus ca. 5500 v. Chr.?",
        answerA = "Polen",
        answerB = "Mesopotamien",
        answerC = "Anatolien (heutige Türkei)",
        answerD = "Ägypten",
        correctAnswer = 0,
        explanation = "Archäologische Funde in Polen (ca. 5500 v. Chr.) zeigen Siebgefäße mit Milchrückständen — die älteste direkte Evidenz für Käseherstellung. Milchfette wurden in den Gefäßen zur Trennung von Molke erhitzt, was auf frühe Käseproduktion hindeutet.",
        difficulty = 3,
        funFact = "Die Menschheit begann Käse zu produzieren, obwohl die meisten Erwachsenen damals laktoseintolerant waren — Käse enthält weniger Laktose als frische Milch und war daher verträglicher."
    ),

    // Question 27
    Question(
        categoryId = 8,
        questionText = "Welche Stadt galt im Mittelalter als das Zentrum des europäischen Safranhandels, wo Safran-Verfälscher mit dem Tod bestraft wurden?",
        answerA = "Paris",
        answerB = "Basel",
        answerC = "Nürnberg",
        answerD = "Venedig",
        correctAnswer = 2,
        explanation = "Nürnberg war eines der wichtigsten Zentren des Safranhandels. Das 'Safranschaueramt' prüfte die Qualität, und das sogenannte 'Safranschaugesetz' von 1441 bestrafte Safranfälscher tatsächlich mit Verbrennung oder lebendigem Begräbnis.",
        difficulty = 3,
        funFact = "Safran ist bis heute das teuerste Gewürz der Welt — für 1 kg getrocknete Safranfäden müssen 150.000 bis 200.000 Krokusblüten von Hand geerntet werden."
    ),

    // Question 28
    Question(
        categoryId = 8,
        questionText = "Was war die 'Neue Welt-Austausch' (Columbian Exchange) und welches Lebensmittel aus Europa hatte die verheerendsten Folgen für amerikanische Ureinwohner?",
        answerA = "Schweinefleisch — da es religiöse Verbote gab",
        answerB = "Weizen — da er die heimischen Maispflanzen verdrängte",
        answerC = "Alkohol — da Ureinwohner keine genetische Resistenz entwickelt hatten",
        answerD = "Zucker — da er Abhängigkeit erzeugte",
        correctAnswer = 2,
        explanation = "Der Columbian Exchange bezeichnet den wechselseitigen Austausch von Pflanzen, Tieren und Krankheiten nach 1492. Alkohol hatte verheerende Auswirkungen auf Ureinwohner, da viele Gruppen weniger Alkohol-Dehydrogenase produzieren, was zu schnellerer Abhängigkeit führt.",
        difficulty = 3,
        funFact = "Der Columbian Exchange brachte auch Tomaten, Kartoffeln, Mais und Kakao nach Europa — und Pferde, Schweine, Rinder und Weizen nach Amerika. Er veränderte die globale Ernährung radikaler als jedes andere Ereignis."
    ),

    // Question 29
    Question(
        categoryId = 8,
        questionText = "Welches Land erfand die Technik, Pasta aus Hartweizengries herzustellen — und wann kam diese Technik nach Italien?",
        answerA = "Griechenland — schon in der Antike als 'Lagana'",
        answerB = "China — über die Seidenstraße im 13. Jahrhundert",
        answerC = "Arabien — vermutlich durch arabische Einwanderer nach Sizilien im 9.-10. Jahrhundert",
        answerD = "Persien — durch Kreuzfahrer im 11. Jahrhundert",
        correctAnswer = 2,
        explanation = "Die älteste dokumentierte Erwähnung von getrockneter Pasta in der Nähe Siziliens stammt aus dem 12. Jahrhundert, und arabische Historiker beschreiben bereits im 9.-10. Jahrhundert die Produktion von fadenförmigen, getrockneten Teigwaren in Sizilien unter arabischer Herrschaft.",
        difficulty = 3,
        funFact = "Die Legende, Marco Polo habe Pasta aus China mitgebracht, ist historisch nicht belegt — Pasta existierte in Italien bereits, bevor Polo 1295 zurückkehrte."
    ),

    // Question 30
    Question(
        categoryId = 8,
        questionText = "Was war das Gastmahl 'Lucullisches Mahl' — und nach welchem Römer ist es benannt?",
        answerA = "Nach Kaiser Nero, der 3.000 Sklaven für Bankette besaß",
        answerB = "Nach dem Senator Marcus Apicius, Verfasser des ältesten erhaltenen Kochbuchs",
        answerC = "Nach dem Philosophen Epikur, Begründer des kulinarischen Hedonismus",
        answerD = "Nach dem General Lucius Licinius Lucullus, bekannt für extravagante Bankette",
        correctAnswer = 3,
        explanation = "Lucius Licinius Lucullus (ca. 117-56 v. Chr.) war ein römischer General und Konsul, der nach seinem Feldzug gegen Mithridates mit ungeheurem Reichtum zurückkehrte und für legendär opulente Bankette berühmt wurde. 'Lucullisch' bedeutet bis heute 'üppig und prächtig'.",
        difficulty = 3,
        funFact = "Lucullus soll auch Kirschen aus Giresun (heute Türkei) nach Europa gebracht haben — der Ortsname Giresun leitet sich vom griechischen 'Kerasous' ab, woraus sich 'Kirsche' entwickelte."
    ),

    // ── REGIONALE KULINARISCHE TRADITIONEN ───────────────────────────────────

    // Question 31
    Question(
        categoryId = 8,
        questionText = "Welche japanische Zubereitungsmethode für Reis wurde erstmals im 8. Jahrhundert n. Chr. beschrieben und gilt als Vorläufer des modernen Sushis?",
        answerA = "Narezushi — fermentierter Fisch auf gesäuertem Reis",
        answerB = "Temakizushi — handgerollte Reiskegel mit Meeresfrüchten",
        answerC = "Edomae-Sushi — frischer Fisch auf Hand-Nigiri",
        answerD = "Oshizushi — gepresster Reis mit rohem Fisch",
        correctAnswer = 0,
        explanation = "Narezushi, bei dem Fisch in Reis eingelegt und fermentiert wird (der Reis wird nicht gegessen), gilt als älteste Form des Sushis und wurde aus China nach Japan gebracht. Es ist noch heute als Spezialgericht in Japan erhältlich.",
        difficulty = 3,
        funFact = "Das heutige Nigiri-Sushi (Edomae-Sushi) wurde erst um 1820 in Edo (Tokio) erfunden — als Street Food für die arbeitende Bevölkerung, nicht als Delikatesse."
    ),

    // Question 32
    Question(
        categoryId = 8,
        questionText = "Welche kulinarische Tradition beschreibt 'Haute Cuisine' und wer gilt als ihr Begründer?",
        answerA = "Auguste Escoffier (1846-1935) — er vereinfachte die klassische Küche für Hotels",
        answerB = "Guillaume Tirel 'Taillevent' (1310-1395) — er schrieb das erste französische Kochbuch",
        answerC = "François Pierre La Varenne (1615-1678) — er trennte erstmals süße von herzhaften Gerichten",
        answerD = "Marie-Antoine Carême (1784-1833) — er kodifizierte die französische Küche als systematische Kochkunst",
        correctAnswer = 3,
        explanation = "Marie-Antoine Carême gilt als Vater der Haute Cuisine. Er entwickelte die Grundsaucen (Espagnole, Béchamel, Velouté, Allemande), entwarf spektakuläre Architektur aus Zucker und Pastete, und kodifizierte die französische Küche in systematischen Büchern.",
        difficulty = 3,
        funFact = "Carême arbeitete für Napoleon, Talleyrand, den britischen Regent (späteren König Georg IV.) und den russischen Zaren — der erste internationale Celebrity-Koch."
    ),

    // Question 33
    Question(
        categoryId = 8,
        questionText = "Was ist 'Garum' und welche Kultur verwendete es als universales Würzmittel ähnlich wie heute Sojasauce in Ostasien?",
        answerA = "Würzpaste aus Oliven und Kräutern — ein griechisches Küstengewürz",
        answerB = "Fermentierte Fischsauce — das wichtigste Würzmittel des antiken Roms",
        answerC = "Eingekochter Weinmost — der Vorläufer von Balsamico-Essig",
        answerD = "Salzzuckermischung aus Nordafrika — von den Karthagern entwickelt",
        correctAnswer = 1,
        explanation = "Garum war eine fermentierte Fischsauce aus kleinen Fischen (Sardinen, Makrelen), die im antiken Rom als universales Würzmittel verwendet wurde. Es wurde in großen Amphoren transportiert und war das 'Ketchup' der Antike — in nahezu jedem Gericht.",
        difficulty = 3,
        funFact = "Die größten Garum-Produktionsstätten im Römischen Reich lagen in Nordafrika und Spanien — der Geruch war legendär schlimm; Garum-Fabriken mussten außerhalb der Stadtmauern gebaut werden."
    ),

    // Question 34
    Question(
        categoryId = 8,
        questionText = "Welches österreichische Gericht wurde angeblich vom Feldmarschall Radetzky aus Mailand nach Wien gebracht — obwohl die Datierung historisch umstritten ist?",
        answerA = "Tafelspitz",
        answerB = "Wiener Schnitzel",
        answerC = "Kaiserschmarrn",
        answerD = "Gulasch",
        correctAnswer = 1,
        explanation = "Die Legende besagt, Feldmarschall Radetzky habe das Wiener Schnitzel als Abwandlung der norditalienischen 'Cotoletta alla milanese' aus Mailand nach Wien gebracht. Historiker bezweifeln diese Geschichte, da beide Gerichte möglicherweise unabhängig entstanden.",
        difficulty = 3,
        funFact = "Das echte Wiener Schnitzel muss aus Kalbfleisch bestehen — 'Schnitzel Wiener Art' aus Schweinefleisch ist offiziell eine andere Speise."
    ),

    // Question 35
    Question(
        categoryId = 8,
        questionText = "Welches Land entwickelte als erstes die Technik der Schokoladen-Conchierung — und wer erfand sie?",
        answerA = "Frankreich — Auguste Poulain entwickelte die Conche 1865",
        answerB = "Deutschland — Henri Nestlé verbesserte das Verfahren 1875",
        answerC = "Belgien — Jean Neuhaus entwickelte die Conchierung 1912",
        answerD = "Schweiz — Rodolphe Lindt erfand die Conche 1879 in Bern",
        correctAnswer = 3,
        explanation = "Rodolphe Lindt erfand 1879 in Bern die Conchiermaschine — ein Gerät, das Schokoladenmasse stundenlang reibt und rührt. Dadurch wurden Aromastoffe freigesetzt und die Textur samtig-glatt. 'Conche' leitet sich vom lateinischen 'concha' (Muschel) wegen der muschelförmigen Maschine ab.",
        difficulty = 3,
        funFact = "Lindt conchierte seine Schokolade versehentlich 72 Stunden lang — ein Fehler, der zur Entdeckung der überlegenen Qualität führte."
    ),

    // ── ALTE WELT LEBENSMITTEL & URSPRÜNGE ───────────────────────────────────

    // Question 36
    Question(
        categoryId = 8,
        questionText = "Welches Lebensmittel wurde in China bereits 5000 v. Chr. aus fermentiertem Soja hergestellt — als Vorläufer von Sojasauce und Miso?",
        answerA = "Natto",
        answerB = "Tempeh",
        answerC = "Tofu",
        answerD = "Jiang (fermentierte Sojapaste)",
        correctAnswer = 3,
        explanation = "Jiang, eine fermentierte Paste aus Sojabohnen (und manchmal Fleisch), ist der dokumentierte Vorläufer von Sojasauce und Miso. Erste Erwähnungen stammen aus chinesischen Texten des 3. Jahrtausends v. Chr. Sojasauce entwickelte sich als flüssige Form dieser Paste.",
        difficulty = 3,
        funFact = "Tofu wurde erst um 200 v. Chr. in China erfunden — der Legende nach durch einen Unfall, als jemand Sojamilch mit Meersalz versah und dabei Gerinnung entdeckte."
    ),

    // Question 37
    Question(
        categoryId = 8,
        questionText = "Wann und wo entstand Wein erstmals als fermentiertes Traubengetränk — basierend auf den ältesten bekannten Belegen?",
        answerA = "Ca. 3500 v. Chr. im antiken Ägypten",
        answerB = "Ca. 6000 v. Chr. im heutigen Georgien (Kaukasus)",
        answerC = "Ca. 4500 v. Chr. in Mesopotamien (heutiger Irak)",
        answerD = "Ca. 2000 v. Chr. in der Ägäis (Minoische Kultur)",
        correctAnswer = 1,
        explanation = "Archäologische Funde in Georgien, insbesondere Weinreste in Tontöpfen aus Shulaveri-Shomu-Keramik (ca. 6000-5800 v. Chr.), gelten als älteste Belege für Weinherstellung. Georgien gilt daher als die 'Wiege des Weins'.",
        difficulty = 3,
        funFact = "Die traditionelle georgische Wein-Herstellungsmethode im Tontopf (Qvevri) wurde 2013 von der UNESCO als immaterielles Kulturerbe der Menschheit anerkannt."
    ),

    // Question 38
    Question(
        categoryId = 8,
        questionText = "Welches Lebensmittel verbreitete sich durch arabische Händler im Mittelalter von Indien über Nordafrika nach Europa und wurde dabei als 'indisches Salz' bezeichnet?",
        answerA = "Ingwer",
        answerB = "Rohrzucker",
        answerC = "Sesam",
        answerD = "Kurkuma",
        correctAnswer = 1,
        explanation = "Rohrzucker wurde im Mittelalter als 'indisches Salz' oder 'weißes Gold' bezeichnet und war extrem teuer. Arabische Händler kontrollierten die Handelsrouten von Indien nach Europa. Zucker war zunächst ein Apothekerprodukt und Luxusgut.",
        difficulty = 3,
        funFact = "Im mittelalterlichen Europa wurde Zucker wie Gewürze beim Apotheker verkauft und mit Gold aufgewogen. Erst mit dem Zuckerrohranbau in der Karibik ab dem 16. Jahrhundert wurde er erschwinglich."
    ),

    // Question 39
    Question(
        categoryId = 8,
        questionText = "Welches europäische Land gilt als Erfinder der modernen Dosennahrung, weil es 1795 den ersten offiziellen Wettbewerb zur Lebensmittelkonservierung ausschrieb?",
        answerA = "Niederlande",
        answerB = "Preußen",
        answerC = "Frankreich",
        answerD = "England",
        correctAnswer = 2,
        explanation = "Die französische Direktorialregierung schrieb 1795 einen Preis von 12.000 Francs für eine Methode aus, mit der Lebensmittel lange haltbar gemacht werden konnten — für die Versorgung von Napoleons Truppen. Nicolas Appert gewann 1809 diesen Preis mit seiner Einkochtechnik.",
        difficulty = 3,
        funFact = "Napoleon soll gesagt haben: 'Eine Armee marschiert auf ihrem Magen' — die Konservenentwicklung war direkt durch die logistischen Probleme seiner Feldzüge motiviert."
    ),

    // Question 40
    Question(
        categoryId = 8,
        questionText = "Welches ist das älteste noch verwendete Kochbuch der Welt und aus welcher Epoche stammt es?",
        answerA = "Kitab al-Tabikh von al-Baghdadi — Abbassidenzeit, ca. 1226 n. Chr.",
        answerB = "Le Viandier von Taillevent — Mittelalterliches Frankreich, ca. 1300 n. Chr.",
        answerC = "Forme of Cury — England, ca. 1390 n. Chr.",
        answerD = "De re coquinaria von Apicius — Römische Kaiserzeit, ca. 4. Jahrhundert n. Chr.",
        correctAnswer = 3,
        explanation = "Das Apicius-Kochbuch 'De re coquinaria' aus dem 4. Jahrhundert n. Chr. ist das älteste vollständig erhaltene Kochbuch der westlichen Welt. Es enthält über 400 Rezepte der römischen Küche — von Soßen über Fleischgerichte bis zu Süßspeisen.",
        difficulty = 3,
        funFact = "Marcus Gavius Apicius, ein legendärer Feinschmecker des 1. Jahrhunderts n. Chr., dem das Buch zugeschrieben wird, soll sich vergiftet haben, als er feststellte, dass sein Vermögen nicht mehr ausreichte, um seinen Lebensstandard zu finanzieren."
    ),

    // ── MODERNE LEBENSMITTELGESCHICHTE ───────────────────────────────────────

    // Question 41
    Question(
        categoryId = 8,
        questionText = "Welcher deutsche Chemiker entwickelte 1909 die Synthese von Ammoniak aus Stickstoff und Wasserstoff — was die Grundlage für Kunstdünger und damit für die Ernährung von Milliarden Menschen wurde?",
        answerA = "Carl Bosch",
        answerB = "Justus von Liebig",
        answerC = "Fritz Haber",
        answerD = "Wilhelm Ostwald",
        correctAnswer = 2,
        explanation = "Fritz Haber entwickelte 1909 die Ammoniaksynthese, Carl Bosch machte sie industriell nutzbar (Haber-Bosch-Verfahren). Kunstdünger aus synthetischem Ammoniak ermöglichte die Ernährung von ca. 4 Milliarden Menschen, die ohne dieses Verfahren nicht existieren könnten.",
        difficulty = 3,
        funFact = "Schätzungsweise stammt der Stickstoff in 50% aller Menschen auf der Erde aus dem Haber-Bosch-Verfahren — wir sind buchstäblich zu einem Teil aus synthetischem Dünger gemacht."
    ),

    // Question 42
    Question(
        categoryId = 8,
        questionText = "Wann und durch wen wurde Milchpulver erstmals industriell produziert — welches Land war Pionier?",
        answerA = "1832 — Marco d'Avignon in Frankreich",
        answerB = "1872 — Henri Nestlé in der Schweiz",
        answerC = "1805 — Osip Krichevsky in Russland",
        answerD = "1855 — Gail Borden in den USA",
        correctAnswer = 2,
        explanation = "Der russische Arzt Osip Krichevsky beschrieb 1802 erstmals ein Verfahren zur Herstellung von Milchpulver. Industrielle Produktion begann in Russland um 1805. Spätere Pioniere wie Borden (Kondensmilch, 1853) und Nestlé (Milchmehl für Säuglinge, 1867) bauten darauf auf.",
        difficulty = 3,
        funFact = "Nestlés 'Farine Lactée' von 1867 rettete nachweislich das Leben eines Säuglings, der die Muttermilch nicht vertrug — dies machte Henri Nestlé zur Sensation und gründete sein Imperium."
    ),

    // Question 43
    Question(
        categoryId = 8,
        questionText = "Was beschreibt der Begriff 'Terroir' im Kontext von Wein und kulinarischen Traditionen?",
        answerA = "Die gesetzlich geschützten Herkunftsbezeichnungen der EU für Lebensmittel",
        answerB = "Die traditionelle Weinlese-Methode mit Handpflücken",
        answerC = "Die traditionellen Zubereitungsmethoden einer Region",
        answerD = "Das Ensemble aus Boden, Klima, Topographie und lokalen Hefefilzpilzen, das den Charakter eines Weins prägt",
        correctAnswer = 3,
        explanation = "Terroir (französisch für 'Erde' oder 'Boden') bezeichnet im Weinbau das Zusammenspiel von geologischen, klimatischen und biologischen Faktoren eines Anbaugebietes, die den unverwechselbaren Charakter eines Weins entstehen lassen. Es ist ein zentrales Konzept der französischen Weinkultur.",
        difficulty = 3,
        funFact = "Der Begriff Terroir wird heute auch auf andere Lebensmittel ausgedehnt — Käse, Olivenöl, Kaffee und sogar Schokolade können 'Terroir' besitzen."
    ),

    // Question 44
    Question(
        categoryId = 8,
        questionText = "Welches Land gilt als Ursprung des Rezepts für die 'Béchamelsauce' — und nach wem wurde sie benannt?",
        answerA = "Italien — nach Catherine de Médicis als 'Salsa Bianca'",
        answerB = "Österreich — nach dem Grafen Béchamel aus Wien",
        answerC = "Frankreich — nach Louis de Béchamel, Finanzier am Hof Ludwigs XIV.",
        answerD = "England — nach William Bechamel, einem Londoner Koch des 17. Jahrhunderts",
        correctAnswer = 2,
        explanation = "Die Béchamelsauce ist nach Louis de Béchamel (1630-1703) benannt, einem reichen Financier und Haushofmeister am Hof Ludwigs XIV. Die Sauce wurde jedoch wahrscheinlich von Marie-Antoine Carême codifiziert und perfektioniert — ob Béchamel sie wirklich erfand, ist historisch unklar.",
        difficulty = 3,
        funFact = "Die Béchamelsauce ist eine der fünf 'Muttersaucen' der französischen Küche nach Escoffier — aus ihr leiten sich Dutzende weitere Saucen ab."
    ),

    // Question 45
    Question(
        categoryId = 8,
        questionText = "Welches Lebensmittel wurde im 19. Jahrhundert als 'weiße Pest' bezeichnet und für Tuberkulose und andere Krankheiten verantwortlich gemacht?",
        answerA = "Kartoffeln (wegen des Solanin-Gehalts)",
        answerB = "Weißbrot (wegen des Fehlens von Ballaststoffen)",
        answerC = "Raffinierter Zucker (wegen der vermeintlich süchtig machenden Wirkung)",
        answerD = "Rohe Milch (wegen der Übertragung von Tuberkulose)",
        correctAnswer = 3,
        explanation = "Rohe Milch wurde als 'weiße Pest' bezeichnet, da sie nachweislich bovine Tuberkulose übertragen konnte. Pasteurisierung war daher ein entscheidender Public-Health-Fortschritt — in den USA und Europa wurden Gesetze zur Pflicht-Pasteurisierung erst im frühen 20. Jahrhundert eingeführt.",
        difficulty = 3,
        funFact = "Noch heute sterben weltweit jährlich Tausende Menschen durch rohe Milch verursachte Infektionen — in manchen US-Bundesstaaten ist der Verkauf von Rohmilch noch immer legal."
    ),

    // Question 46
    Question(
        categoryId = 8,
        questionText = "Welche Pflanze brachte Kolumbus 1493 als erstes amerikanisches Nahrungsmittel nach Europa, das sofort akzeptiert und weit verbreitet wurde?",
        answerA = "Chilli",
        answerB = "Tomate",
        answerC = "Mais",
        answerD = "Süßkartoffel (Batate)",
        correctAnswer = 3,
        explanation = "Die Süßkartoffel (Batate) war das erste amerikanische Nahrungsmittel, das in Europa breite Akzeptanz fand — weil sie süß war und keine neuen Zubereitungsmethoden erforderte. Tomaten und Kartoffeln wurden in Europa zunächst jahrzehntelang als giftig oder zumindest verdächtig angesehen.",
        difficulty = 3,
        funFact = "Tomaten wurden in Europa bis ins 18. Jahrhundert vorwiegend als Zierpflanze gehalten, da sie zur Familie der Nachtschattengewächse gehören, zu der auch giftige Pflanzen zählen."
    ),

    // Question 47
    Question(
        categoryId = 8,
        questionText = "Was ist 'Umami' — wann wurde dieser Geschmack wissenschaftlich beschrieben und von wem?",
        answerA = "1972 von US-amerikanischen Wissenschaftlern, die MSG (Mononatriumglutamat) in Rattenexperimenten erforschten",
        answerB = "1908 vom japanischen Chemiker Kikunae Ikeda, der Glutaminsäure als Träger eines eigenständigen, herzhaften Geschmacks identifizierte",
        answerC = "1934 vom deutschen Physiologen Wilhelm Kühne, der Geschmacksrezeptoren für Fleischbrühe entdeckte",
        answerD = "1985 von einer japanisch-amerikanischen Forschergruppe, die Glutamatrezeptoren auf der Zunge identifizierte",
        correctAnswer = 1,
        explanation = "Kikunae Ikeda, Professor an der Kaiserlichen Universität Tokio, isolierte 1908 Glutaminsäure aus Konbu-Algen und erkannte sie als Träger eines eigenständigen, herzhaften Geschmacks. Er nannte ihn 'Umami' (japanisch für 'köstlich' oder 'wohlschmeckend') und patentierte MSG.",
        difficulty = 3,
        funFact = "Umami wurde erst um 2000 weltweit als fünfte Grundgeschmacksrichtung neben süß, sauer, salzig und bitter anerkannt — obwohl Ikeda es bereits 1908 beschrieben hatte."
    ),

    // Question 48
    Question(
        categoryId = 8,
        questionText = "Welches ist das älteste bekannte Rezept für Käsekuchen (Cheesecake) und aus welcher Kultur stammt es?",
        answerA = "Aus dem antiken Rom, ca. 200 v. Chr.",
        answerB = "Aus dem mittelalterlichen England, ca. 1390 n. Chr.",
        answerC = "Aus der osmanischen Küche, ca. 1400 n. Chr.",
        answerD = "Aus dem antiken Griechenland, ca. 776 v. Chr. auf der Insel Samos",
        correctAnswer = 3,
        explanation = "Der griechische Arzt Aegimus soll ca. 776 v. Chr. ein Buch über die Kunst der Käsekuchenbereitung geschrieben haben. Auf der Insel Samos wurden Käsekuchen aus Frischkäse, Weizen und Honig als Energieriegel für Olympia-Athleten gebacken.",
        difficulty = 3,
        funFact = "Als die Römer Griechenland eroberten, übernahmen sie das Rezept und verbreiteten es über ganz Europa — jede Kultur variierte es mit lokalen Zutaten."
    ),

    // Question 49
    Question(
        categoryId = 8,
        questionText = "Welche kulinarische Technik wurde im frühen 20. Jahrhundert als 'wissenschaftliches Kochen' bezeichnet und versuchte, Ernährung durch Nährstoffoptimierung zu revolutionieren?",
        answerA = "Das Taylorismus-Kochen von Frederick Taylor, der Kochzeiten optimierte",
        answerB = "Molecular Gastronomy — entwickelt von Ferran Adrià und Heston Blumenthal",
        answerC = "Die Rohkostbewegung von Max Bircher-Benner",
        answerD = "Die 'Scientific Cookery' von Ellen Swallow Richards, die Ernährung als Chemie betrachtete",
        correctAnswer = 3,
        explanation = "Ellen Swallow Richards (1842-1911), erste Frau am MIT und Begründerin der Ökologie als Wissenschaft, entwickelte 'Scientific Cookery' — den Ansatz, Kochen als angewandte Chemie zu betrachten und Mahlzeiten nach Nährwert zu optimieren. Sie gründete die erste öffentliche 'Nutrition Kitchen' in Boston.",
        difficulty = 3,
        funFact = "Richards' Arbeit führte direkt zu den ersten Nährwertangaben auf Lebensmittelpackungen und zu staatlich geförderten Schulmensen in den USA."
    ),

    // Question 50
    Question(
        categoryId = 8,
        questionText = "Welche historische Handelsroute verband von ca. 200 v. Chr. bis 1450 n. Chr. China mit dem Mittelmeer und transportierte neben Seide auch Gewürze, Tee und Lebensmittel?",
        answerA = "Die Weihrauchstraße (Incense Road) durch Arabien",
        answerB = "Die Bernsteinstraße (Amber Road) von der Ostsee nach Rom",
        answerC = "Die Seidenstraße (Silk Road) über Zentralasien",
        answerD = "Die Gewürzroute (Spice Route) über den Indischen Ozean",
        correctAnswer = 2,
        explanation = "Die Seidenstraße war ein Netz aus Landrouten und Seewegen, das China mit dem Mittelmeer verband. Neben Seide transportierte sie Gewürze, Tee, Porzellan, Papier, Glas und kulturelle Einflüsse — darunter Kochtechniken, Zutaten und kulinarische Traditionen zwischen Ost und West.",
        difficulty = 3,
        funFact = "Den Namen 'Seidenstraße' erfand erst 1877 der deutsche Geograph Ferdinand von Richthofen — die Menschen zur Zeit dieser Route nannten sie nie so."
    )

)
