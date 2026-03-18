package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsMedium4(): List<Question> = listOf(

    // 50 medium marine life questions (difficulty = 2, categoryId = 9)

    Question(
        categoryId = 9,
        questionText = "Welche Eigenschaft macht den Blauwal zum groessten Tier der Erde?",
        answerA = "Er hat das groesste Gehirn aller Tiere",
        answerB = "Er kann bis zu 33 Meter lang werden und ueber 150 Tonnen wiegen",
        answerC = "Er lebt tiefer als alle anderen Wale",
        answerD = "Er hat die laengste Lebenserwartung aller Meeressaeuger",
        correctAnswer = 1,
        explanation = "Der Blauwal kann bis zu 33 Meter lang und ueber 150 Tonnen schwer werden und ist damit das groesste Tier, das je auf der Erde gelebt hat.",
        difficulty = 2,
        funFact = "Das Herz eines Blauwals ist so gross wie ein kleines Auto und wiegt bis zu 600 Kilogramm."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die Hauptnahrung des Buckelwals?",
        answerA = "Tintenfische und Kraken",
        answerB = "Kleine Fische und Krill",
        answerC = "Delfine und Robben",
        answerD = "Quallen und Meeresschildkroeten",
        correctAnswer = 1,
        explanation = "Buckelwale ernaehren sich hauptsaechlich von kleinen Fischen wie Hering und Makrele sowie von Krill, den sie mit ihrer Barten herausfiltern.",
        difficulty = 2,
        funFact = "Buckelwale entwickeln komplexe Jagdstrategien, zum Beispiel das sogenannte Blasennetz, bei dem mehrere Wale gemeinsam Fische mit Luftblasen einschliessen."
    ),

    Question(
        categoryId = 9,
        questionText = "In welcher Tiefenzone des Ozeans beginnt die sogenannte Mittelwasserzone (Mesopelagial)?",
        answerA = "0 bis 200 Meter",
        answerB = "200 bis 1000 Meter",
        answerC = "1000 bis 4000 Meter",
        answerD = "4000 bis 6000 Meter",
        correctAnswer = 1,
        explanation = "Das Mesopelagial erstreckt sich von 200 bis 1000 Meter Tiefe. In dieser Zone dringt kaum noch Sonnenlicht vor, und viele Tiere wandern nachts nach oben.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Anpassung ermoeglicht es Tiefseeangelfischen (Angler), Beute in absoluter Dunkelheit anzulocken?",
        answerA = "Extrem empfindliche Seitenlinienorgane",
        answerB = "Ein biolumineszierender Angelfortsatz mit Lichtorgan",
        answerC = "Chemoreceptoren die Blut aus grossen Entfernungen riechen",
        answerD = "Ultraschallortung aehnlich wie bei Fledermaeuse",
        correctAnswer = 1,
        explanation = "Weibliche Tiefseeanglerfische tragen einen biolumineszierenden Fortsatz (Illicium) auf dem Kopf, dessen Leuchtorgan durch symbiotische Bakterien leuchtet und Beutetiere anlockt.",
        difficulty = 2,
        funFact = "Bei Tiefseeanglerfischen ist das Maennchen winzig und verschmilzt dauerhaft mit dem Weibchen - es verliert dabei alle eigenen Organe ausser den Hoden."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie viele Arme hat ein gewoehnlicher Tintenfisch (Oktopus) im Vergleich zu einem Kalmar?",
        answerA = "Oktopus hat 8 Arme, Kalmar hat 10 Tentakel",
        answerB = "Beide haben 8 Arme",
        answerC = "Oktopus hat 10 Tentakel, Kalmar hat 8 Arme",
        answerD = "Beide haben 10 Tentakel",
        correctAnswer = 0,
        explanation = "Oktopusse haben 8 gleichartige Arme, waehrend Kalmars 8 kurze Arme und 2 laengere Fangtenrakel besitzen, also insgesamt 10 Tentakel.",
        difficulty = 2,
        funFact = "Oktopusse haben drei Herzen und blaues Blut, da sie anstelle von Haemoglobin das kupferhaltige Haemocyanin verwenden."
    ),

    Question(
        categoryId = 9,
        questionText = "Was unterscheidet Haie von Knochenfeischen in Bezug auf das Skelett?",
        answerA = "Haie haben ein Skelett aus verknoemertem Knorpel",
        answerB = "Haie haben ein vollstaendiges Knochenskelett",
        answerC = "Haie haben ein Skelett aus Knorpel statt Knochen",
        answerD = "Haie haben gar kein Skelett",
        correctAnswer = 2,
        explanation = "Haie gehoeren zu den Knorpelfischen (Chondrichthyes) und haben ein Skelett, das vollstaendig aus Knorpel besteht, nicht aus Knochen.",
        difficulty = 2,
        funFact = "Weil Knorpel sich schlechter fossilisiert als Knochen, kennen wir das Aussehen vieler ausgestorbener Haiarten hauptsaechlich durch ihre Zaehne."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist Biolumineszenz bei Meerestieren?",
        answerA = "Die Faehigkeit, UV-Licht zu reflektieren",
        answerB = "Die Faehigkeit, durch chemische Reaktionen im Koerper selbst Licht zu erzeugen",
        answerC = "Die Faehigkeit, Licht zu absorbieren und im Dunkeln zu gluehen",
        answerD = "Die Faehigkeit, Licht durch spezielle Schuppen zu brechen",
        correctAnswer = 1,
        explanation = "Biolumineszenz ist die Faehigkeit von Lebewesen, durch enzymatische Oxidation von Luciferin selbst Licht zu erzeugen. Im Ozean nutzen dies viele Tiere zur Kommunikation, Tarnung oder Beutejagd.",
        difficulty = 2,
        funFact = "Schaetzungen zufolge sind ueber 76 Prozent aller Meeresorganismen in gewissen Lebensphasen biolumineszent."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Hai gilt als der groesste lebende Hai der Welt?",
        answerA = "Weisser Hai",
        answerB = "Hammerhai",
        answerC = "Walhai",
        answerD = "Tigerhai",
        correctAnswer = 2,
        explanation = "Der Walhai kann bis zu 12 Meter lang werden und ist damit der groesste lebende Fisch und Hai. Er ernaehrt sich jedoch friedlich von Plankton.",
        difficulty = 2,
        funFact = "Trotz seiner enormen Groesse filtert der Walhai nur Plankton, kleine Fische und Krustentiere aus dem Wasser - er ist fuer Menschen vollkommen harmlos."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie kommunizieren Buckelwale untereinander ueber grosse Entfernungen?",
        answerA = "Durch elektrische Impulse im Wasser",
        answerB = "Durch komplexe Gesaenge, die sich jaehrlich veraendern",
        answerC = "Durch Echolot aehnlich wie Fledermaeuse",
        answerD = "Durch Farbwechsel an der Bauchseite",
        correctAnswer = 1,
        explanation = "Maennliche Buckelwale singen komplexe Lieder, die Stunden dauern koennen. Diese Gesaenge veraendern sich jedes Jahr und breiten sich durch die gesamte Population aus.",
        difficulty = 2,
        funFact = "Buckelwal-Gesaenge koennen tausende Kilometer weit unter Wasser gehoert werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein Korallenriff biologisch gesehen?",
        answerA = "Eine Felsformation am Meeresboden",
        answerB = "Eine Ansammlung von Meerespflanzen",
        answerC = "Eine Struktur aus Kalkskeletten von Korallentieren und deren Symbiosepartnern",
        answerD = "Ein vulkanisches Unterwassergebilde",
        correctAnswer = 2,
        explanation = "Korallenriffe bestehen aus den Kalkskeletten von Steinkorallen (Polypen). Diese leben in Symbiose mit photosynthetischen Algen (Zooxanthellen), die ihnen Naehrstoffe liefern.",
        difficulty = 2,
        funFact = "Das Grosse Barriere Riff in Australien ist das groesste Lebewesen der Erde und sogar vom Weltraum aus sichtbar."
    ),

    Question(
        categoryId = 9,
        questionText = "Was geschieht beim Korallenbleichen?",
        answerA = "Korallen sterben durch Verschmutzung ab",
        answerB = "Korallen verlieren ihre Symbiosealgen durch Temperaturstress",
        answerC = "Korallen verfaerben sich durch veraenderte pH-Werte",
        answerD = "Korallen werden von parasitaeren Algen besiedelt",
        correctAnswer = 1,
        explanation = "Korallenbleichen tritt auf, wenn erhoehte Wassertemperaturen die symbiotischen Zooxanthellen stossen. Die Korallen verlieren ihre Farbe und sterben ohne ihre Nahrungslieferanten ab.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Besonderheit hat das Fortbewegungssystem von Quallen?",
        answerA = "Sie schwimmen mit paarigen Flossen",
        answerB = "Sie treiben passiv mit Strudeln",
        answerC = "Sie bewegen sich durch Rueckstoss beim Zusammenziehen ihres Schirmkoerpers",
        answerD = "Sie kriechen am Meeresboden entlang",
        correctAnswer = 2,
        explanation = "Quallen bewegen sich durch rhythmisches Zusammenziehen ihres glockenfoermigen Koerpers, wodurch Wasser ausgestossen wird und sie sich durch Rueckstoss vorwaerts bewegen.",
        difficulty = 2,
        funFact = "Die Qualle Turritopsis dohrnii gilt als biologisch unsterblich, da sie sich nach der Fortpflanzung wieder in ein Polypen-Stadium zurueckverwandeln kann."
    ),

    Question(
        categoryId = 9,
        questionText = "Was unterscheidet Delfine von anderen Fischen bei der Fortpflanzung?",
        answerA = "Delfine legen Eier wie Fische",
        answerB = "Delfine sind Saugetiere und gebaeren lebende Junge, die gesaeugt werden",
        answerC = "Delfine vermehren sich durch Knospung",
        answerD = "Delfine laichen wie Lachse",
        correctAnswer = 1,
        explanation = "Delfine sind Meeressaeuger. Sie gebaeren lebende Junge und saeugen diese mit Milch, atmen Luft und sind warmbluetig - im Gegensatz zu echten Fischen.",
        difficulty = 2,
        funFact = "Delfine haben individuelle Pfeiftoene, die wie Namen funktionieren und mit denen sie sich gegenseitig erkennen und rufen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie orientiert sich der Hammerhai mit seinem ungewoehnlichen Kopf?",
        answerA = "Er nutzt den breiten Kopf um groessere Beute zu schlagen",
        answerB = "Der breite Kopf verbessert die elektrische Wahrnehmung und gibt besseres Rundumsehen",
        answerC = "Der flache Kopf hilft ihm, den Meeresboden zu durchwhlen",
        answerD = "Der Kopf dient als Tarnung unter flachen Riffen",
        correctAnswer = 1,
        explanation = "Der hammerfoermige Kopf (Cephalofoil) des Hammerhais vergroessert die Flaeche fuer die Lorenzinischen Ampullen, die elektrische Felder wahrnehmen. Ausserdem bietet er ein breiteres Gesichtsfeld.",
        difficulty = 2,
        funFact = "Hammerhaie koernen in Schulen von bis zu hundert Tieren schwimmen, was unter Haien sehr ungewoehnlich ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die Funktion der Schwimmblase bei Knochenfischen?",
        answerA = "Atmung von Sauerstoff aus dem Wasser",
        answerB = "Regelung des Auftriebs um in verschiedenen Tiefen zu schweben",
        answerC = "Erzeugung von Lauten zur Kommunikation",
        answerD = "Speicherung von Naehrstoffen",
        correctAnswer = 1,
        explanation = "Die Schwimmblase ist ein mit Gas gefuelltes Organ, das Fischen ermoeglicht, ihren Auftrieb zu regulieren. Durch Gasfuellung oder -entleerung koennen sie in jeder Tiefe schwebend bleiben.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Art von Atmung nutzen Meeresschildkroeten?",
        answerA = "Kiemenatmung wie Fische",
        answerB = "Hautatmung durch die Schuppenhaut",
        answerC = "Lungenatmung und muessen regelmaessig an die Oberflaeche",
        answerD = "Kloakenatmung durch den After unter Wasser",
        correctAnswer = 2,
        explanation = "Meeresschildkroeten sind Reptilien mit Lungen und muessen regelmaessig an die Meeresoberflaeche kommen, um Luft zu holen. Manche Arten koennen im Schlaf jedoch Sauerstoff durch die Kloake aufnehmen.",
        difficulty = 2,
        funFact = "Meeresschildkroeten legen Eier und kehren dabei an denselben Strand zurueck, an dem sie selbst geschluepft sind, auch nach Jahrzehnten und tausenden Kilometern Reise."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen einem Wal und einem Delphin biologisch?",
        answerA = "Delfine sind Fische, Wale sind Saegetiere",
        answerB = "Delfine sind kleine Zahnwale, Wale ist der Ueberbegriff fuer alle Cetacea",
        answerC = "Wale leben im Meer, Delfine auch in Fluessen",
        answerD = "Delfine gehoeren zu den Pinguinen, Wale zu den Robben",
        correctAnswer = 1,
        explanation = "Wale ist der volkstuemlche Begriff fuer alle Cetacea. Delfine sind eine Gruppe kleiner Zahnwale (Odontoceti). Biologisch sind Delfine also Wale.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Meerestier gilt als das intelligenteste Wirbellose?",
        answerA = "Quallen",
        answerB = "Seesterne",
        answerC = "Kraken (Oktopusse)",
        answerD = "Garnelen",
        correctAnswer = 2,
        explanation = "Oktopusse gelten als die intelligentesten Wirbellosen. Sie zeigen Problemloesungsverhalten, Werkzeuggebrauch, Gedaechtnis und koennen Glaeser oeffnen sowie Labyrinthe loesen.",
        difficulty = 2,
        funFact = "Oktopusse haben zwei Drittel ihrer Neuronen in ihren Armen verteilt, nicht im Zentralgehirn. Jeder Arm kann relativ autonom handeln."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Funktion haben die Barteln (Barten) von Bartenwalen?",
        answerA = "Echolot zur Orientierung",
        answerB = "Filtration von Krill und kleinen Organismen aus dem Wasser",
        answerC = "Kommunikation durch Vibration",
        answerD = "Verteidigung gegen Praedatoren",
        correctAnswer = 1,
        explanation = "Barten sind hornige Platten im Maul von Bartenwalen. Sie funktionieren wie ein Sieb und filtern Krill, kleine Fische und Zooplankton aus grossen Wassermengen.",
        difficulty = 2,
        funFact = "Ein Blauwal kann mit einem einzigen Schluck bis zu 500 Liter Wasser filtern und dabei mehrere Kilogramm Krill auf einmal erbeuten."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das Besondere an der Fortbewegung von Rochen?",
        answerA = "Sie schwimmen mit einem langen Schwanzflossen",
        answerB = "Sie undulieren mit ihren grossen, flugelartigen Brustflossen",
        answerC = "Sie stossen sich mit dem Schwanz vom Boden ab",
        answerD = "Sie nutzen Saugnapfe am Bauch",
        correctAnswer = 1,
        explanation = "Rochen bewegen sich durch wellenfoermige Bewegungen ihrer verbreiterten Brustflossen fort, die sich wie riesige Fluegel auf und ab bzw. vorne nach hinten bewegen.",
        difficulty = 2,
        funFact = "Mantas (Teufelsrochen) koennen aus dem Wasser springen und dabei mehrere Meter hoch in die Luft gelangen, wahrscheinlich zur Kommunikation oder Parasitenabwehr."
    ),

    Question(
        categoryId = 9,
        questionText = "In welcher Tiefe leben Tiefseeorganismen der hadalen Zone?",
        answerA = "Unter 200 Meter",
        answerB = "Unter 2000 Meter",
        answerC = "Unter 6000 Meter in Tiefseegraeben",
        answerD = "Unter 1000 Meter",
        correctAnswer = 2,
        explanation = "Die hadalische Zone bezeichnet Tiefen unter 6000 Metern, hauptsaechlich in Tiefseegraeben wie dem Marianengraben. Dort herrscht extremer Druck und absolute Dunkelheit.",
        difficulty = 2,
        funFact = "Im Marianengraben wurden noch in 11.000 Metern Tiefe lebende Organismen entdeckt, darunter Schnecken, Garnelen und Bakterien."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen Robben und Seeloewen?",
        answerA = "Robben sind groesser und haben laengere Flossen",
        answerB = "Seeloewen haben sichtbare Ohren und koennen ihre Hinterflossen drehen, Robben nicht",
        answerC = "Robben leben im Meer, Seeloewen nur an Land",
        answerD = "Es gibt keinen Unterschied, es sind verschiedene Namen fuer dasselbe Tier",
        correctAnswer = 1,
        explanation = "Seeloewen (Otariidae) haben sichtbare Ohren und koennen ihre Hinterflossen nach vorn drehen, um an Land zu gehen. Robben (Phocidae) haben keine sichtbaren Ohren und robben an Land.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie ernaehren sich Seepferdchen?",
        answerA = "Sie saugen Algen von Korallen",
        answerB = "Sie saugen mit ihrer roehrenfoermigen Schnauze lebende Kleinkrebse und Plankton auf",
        answerC = "Sie fressen tote organische Reste vom Meeresboden",
        answerD = "Sie fangen Fische mit ihrem Greifschwanz",
        correctAnswer = 1,
        explanation = "Seepferdchen haben eine lange roehrenfoermige Schnauze, mit der sie Kleinkrebse wie Ruderfusskrebse und Garnelchen durch schnelles Aufsaugen erbeuten. Sie koennen kein Wasser kauen.",
        difficulty = 2,
        funFact = "Bei Seepferdchen tragen die Maennchen den Nachwuchs in einem Brutbeutel und gebaeren die Jungen nach 10 bis 45 Tagen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was macht die Peitschenqualle (Portugiesische Galeere) besonders?",
        answerA = "Sie ist keine einzelne Qualle, sondern eine Kolonie verschiedener Polypenarten",
        answerB = "Sie hat das staerkste Gift aller Meerestiere",
        answerC = "Sie kann ohne Wasser mehrere Stunden ueberleben",
        answerD = "Sie ist die groesste Qualle der Welt",
        correctAnswer = 0,
        explanation = "Die Portugiesische Galeere ist keine echte Qualle, sondern ein Siphonophor: eine Kolonie aus verschiedenen spezialisierten Polypen, die zusammen als ein Organismus funktionieren.",
        difficulty = 2,
        funFact = "Die Tentakeln der Portugiesischen Galeere koennen bis zu 50 Meter lang werden und verursachen auch nach dem Tod des Tieres noch schmerzhaften Kontakt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Eigenschaft besitzt die Haut von Weisssen Haien, die die Stroemung verbessert?",
        answerA = "Sie ist vollkommen glatt und schleimig",
        answerB = "Sie ist mit zahnartig strukturierten Placoidschuppen bedeckt, die Turbulenzen reduzieren",
        answerC = "Sie hat elektrisch leitende Streifen die Reibung verringern",
        answerD = "Sie hat Kielstreifen aehnlich wie Golfbaelle",
        correctAnswer = 1,
        explanation = "Haihaut besteht aus zahnartig strukturierten Placoidschuppen (Hautzaehnen), die Wasserturbulenzen reduzieren und so die Schwimmgeschwindigkeit erhoehen. Diese Struktur inspirierte moderne Schwimmanzuege.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist Echolokation und welche Meeressaeuger nutzen sie hauptsaechlich?",
        answerA = "Magnetnavigation, genutzt von Bartenwalen",
        answerB = "Schallortung durch ausgesendete Klicklaute, genutzt von Zahnwalen und Delfinen",
        answerC = "Orientierung durch Meeresstroemungen, genutzt von Robben",
        answerD = "Navigation durch Temperaturgradienten, genutzt von Haien",
        correctAnswer = 1,
        explanation = "Echolokation ist die Faehigkeit, durch Aussenden von Schallwellen und Auswertung der Echos die Umgebung zu kartieren. Zahnwale und Delfine nutzen hochfrequente Klicklaute um Beute und Hindernisse zu orten.",
        difficulty = 2,
        funFact = "Delfine koennen durch Echolokation die innere Struktur von Objekten erkennen - zum Beispiel ob ein Fisch Eier enthaelt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist ein Hydrothermalquell und welche Tiere leben dort?",
        answerA = "Kalte Auftriebsgebiete, bewohnt von grossen Schwarmfischen",
        answerB = "Unterwasserheisskquellen, bewohnt von Roehrenwuermern, Garnelen und Bakterien ohne Sonnenlicht",
        answerC = "Tiefe Meeresbuchten mit Suesswaerzufluss",
        answerD = "Vulkaninseln, bewohnt von speziellen Korallenarten",
        correctAnswer = 1,
        explanation = "Hydrothermale Schlote sind submariner vulkanischer Ursprung, die heisses, mineralreiches Wasser ausstossen. Die dort lebenden Tiere (Roehrenwuermer, Muscheln, Garnelen) basieren ihre Nahrungskette auf Chemosynthese statt Photosynthese.",
        difficulty = 2,
        funFact = "Die Roehrenwuermer an Hydrothermalquellen koennen ueber zwei Meter lang werden und gehoeren zu den am schnellsten wachsenden wirbellosen Tieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie schuetzt sich die Boxqualle (Wuerfqualle) vor Fressfeinden?",
        answerA = "Durch giftige Tentakeln mit den staerksten Tiergiften der Welt",
        answerB = "Durch eine harte Schale aus Chitin",
        answerC = "Durch Tarnung und Farbwechsel",
        answerD = "Durch sehr schnelle Fortbewegung",
        correctAnswer = 0,
        explanation = "Boxquallen besitzen Tentakeln mit Nematocysten, die extrem starkes Gift (Cnidocystin) enthalten. Einige Arten wie Chironex fleckeri gelten als die giftigsten Meerestiere ueberhaupt.",
        difficulty = 2,
        funFact = "Boxquallen sind die einzigen Quallen mit echten Augen, einschliesslich Linse, Hornhaut und Netzhaut. Sie sehen damit trotzdem nur verschwommen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was unterscheidet Krill vom einfachen Zooplankton?",
        answerA = "Krill ist pflanzlich, Zooplankton tierisch",
        answerB = "Krill ist ein spezieller garnelenaehnlicher Krebs, Zooplankton ist ein Oberbegriff fuer tierisches Plankton",
        answerC = "Krill lebt nur in der Tiefsee, Zooplankton nur an der Oberflaeche",
        answerD = "Krill ist ein Fisch, kein Krebs",
        correctAnswer = 1,
        explanation = "Krill (Euphausiidae) sind kleine garnelenaehnliche Krebstiere und bilden eine bestimmte Gruppe. Zooplankton ist ein Sammelname fuer alle im Wasser treibenden Kleintiere, zu denen auch Krill gehoert.",
        difficulty = 2,
        funFact = "In der Antarktis kann die Gesamtbiomasse des Antarktischen Krills bis zu 500 Millionen Tonnen betragen - eine der groessten Biomassen aller Tierarten."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das besondere Jagdverhalten des Schwertwals (Orca)?",
        answerA = "Er jagt ausschliesslich alleine und lauert Beute auf",
        answerB = "Er nutzt kooperative Jagdstrategien in Familiengruppen mit kulturell uebertragenen Techniken",
        answerC = "Er paralyisiert Beute durch elektrische Schlaege",
        answerD = "Er nutzt Gift aus speziellen Druesen im Maul",
        correctAnswer = 1,
        explanation = "Orcas jagten in komplexen sozialen Gruppen und entwickeln spezifische Jagdtechniken, die von Generation zu Generation kulturell weitergegeben werden. Verschiedene Populationen haben voellig unterschiedliche Jagdstrategien.",
        difficulty = 2,
        funFact = "Es gibt keine dokumentierten Faelle von wilden Orcas, die Menschen angegriffen haben. In Gefangenschaft kam es jedoch zu mehreren Vorfaellen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Hauptunterschied zwischen pelagischen und benthischen Meerestieren?",
        answerA = "Pelagische Tiere sind groesser als benthische",
        answerB = "Pelagische Tiere leben im freien Wasser, benthische am Meeresboden",
        answerC = "Benthische Tiere koennen atmen, pelagische nicht",
        answerD = "Pelagische Tiere sind gefaehrlicher als benthische",
        correctAnswer = 1,
        explanation = "Pelagisch bezeichnet den Lebensraum im freien Wasser (Wassersaeule), benthisch den Meeresboden. Thunfische sind pelagisch, Seegurken benthisch.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Organ ermoeglicht es Haien, elektrische Felder zu spueren?",
        answerA = "Lorenzinische Ampullen, gallertige Kanaele in der Schnauze",
        answerB = "Seitenlinienorgan entlang des Rueckens",
        answerC = "Spezielle Zellen im Auge",
        answerD = "Elektrisch sensitive Barteln am Kiefer",
        correctAnswer = 0,
        explanation = "Lorenzinische Ampullen sind geleeige Poren in der Kopfregion von Haien, die schwache elektrische Felder wahrnehmen. Dadurch koennen sie verborgene Beute im Sand aufspueren.",
        difficulty = 2,
        funFact = "Haie koennen elektrische Felder von weniger als 0,01 Mikrovolt pro Zentimeter wahrnehmen - das entspricht der elektrischen Aktivitaet einer Muskelbewegung aus einigen Metern Entfernung."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie pflanzt sich der Seeigel fort?",
        answerA = "Durch lebendige Geburt wie Saugetiere",
        answerB = "Durch Knospung an der Kouerperoberflaeche",
        answerC = "Durch externe Befruchtung: Eier und Spermien werden ins Wasser abgegeben",
        answerD = "Durch innere Befruchtung und Eiablage am Boden",
        correctAnswer = 2,
        explanation = "Seeigel geben Eizellen und Spermien synchron ins Meerwasser ab, wo die Befruchtung stattfindet. Die Larven treiben als Plankton, bevor sie sich am Boden festsetzen.",
        difficulty = 2,
        funFact = "Manche Seeigel-Arten koennen ueber 100 Jahre alt werden. Das Alter kann durch Wachstumsringe in den Schalen bestimmt werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Was macht den Papierboot-Tintenfisch (Argonauta) einzigartig unter Tintenfischen?",
        answerA = "Er lebt in mutualistischer Symbiose mit Walen",
        answerB = "Das Weibchen produziert ein duennschaliges Gehaeusegehaeuse aus Kalk fuer die Eier",
        answerC = "Er kann an Land ueberleben und klettert auf Steine",
        answerD = "Er ist der einzige giftige Tintenfisch",
        correctAnswer = 1,
        explanation = "Das Weibchen des Papierboot-Tintenfisches sekretiert aus speziell verbreiterten Armen ein duennschaliges, spiraliges Gehaeusegehaeuse (Eikapsel), in dem es auch selbst lebt. Das Maennchen ist winzig.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Rolle spielen Mangroven fuer die Meeresbiologie?",
        answerA = "Sie sind Nahrungsquelle fuer Blauwale",
        answerB = "Sie dienen als Kinderstube fuer viele Meeresfische und schuetzen Kuesten vor Erosion",
        answerC = "Sie versorgen das Korallenriff mit Sauerstoff",
        answerD = "Sie sind Hauptlebensraum fuer Tiefseeorganismen",
        correctAnswer = 1,
        explanation = "Mangrovenwaelder sind wichtige Kinderstuben fuer viele Meeresfische, Krabben und Garnelen. Ihr Wurzelwerk bietet Schutz vor Fraessfeinden und ihre Wurzeln stabilisieren Kuesten.",
        difficulty = 2,
        funFact = "Mangrovenwaelder speichern bis zu viermal so viel Kohlenstoff wie tropische Regenwaelderndurch tiefe Torfsedimente unter ihren Wurzeln."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist besonders am Farbwechsel von Kalmaren und Oktopussen?",
        answerA = "Er wird durch Hormonsignale aus dem Gehirn gesteuert",
        answerB = "Chromatophoren (pigmenthaltige Zellen) und Iridophoren werden durch Muskeln extrem schnell gesteuert",
        answerC = "Die Farbe entsteht durch Lichtreflexion von Schuppen",
        answerD = "Sie nutzen Biolumineszenz um Farben zu erzeugen",
        correctAnswer = 1,
        explanation = "Cephalopoden besitzen Chromatophoren (pigmentgefuellte Zellen) und Iridophoren, die durch direkte Muskelkontraktion in Millisekunden veraendert werden. So koennen Muster und Farben sofort veraendert werden.",
        difficulty = 2,
        funFact = "Oktopusse und Kalmars sind meist farbenblind, trotzdem erzeugen sie perfekte Farbtarnungen. Moeglicherweise messen sie Farbe indirekt durch Pupillenform und Lichtintensitaet."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Fisch kann durch Aufblaehen seines Magens Wasser aufnehmen und sich kugelig aufblaesen?",
        answerA = "Zitteraal",
        answerB = "Kugelfisch (Tetraodontidae)",
        answerC = "Steinfisch",
        answerD = "Mondfisch (Mola mola)",
        correctAnswer = 1,
        explanation = "Kugelfische koennen durch Wasseraufnahme in den dehnbaren Magen ihr Volumen stark vergroessern und Stacheln aufrichten, um Fressfeinde abzuschrecken. Sie enthalten zudem das starke Gift Tetrodotoxin.",
        difficulty = 2,
        funFact = "Tetrodotoxin, das Gift des Kugelfischs, ist 1200-mal giftiger als Zyanid. Es gibt kein Gegengift. Trotzdem ist Kugelfisch (Fugu) in Japan eine Delikatesse."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die Bedeutung der ozeanischen Thermokline fuer das Meeresleben?",
        answerA = "Sie ist eine Zone extremer Hitze wo keine Tiere leben",
        answerB = "Sie ist eine Schicht mit starkem Temperaturgefaelle, die warmes Oberflaechenwasser von kaltem Tiefenwasser trennt",
        answerC = "Sie ist eine Schicht mit hohem Salzgehalt die Auftrieb verhindert",
        answerD = "Sie ist eine Zone mit dem hoechsten Sauerstoffgehalt",
        correctAnswer = 1,
        explanation = "Die Thermokline ist eine Wasserschicht, in der die Temperatur mit der Tiefe schnell abfaellt. Sie trennt naehrstoffarmes, warmes Oberflaechenwasser von naehrstoffreichem, kaltem Tiefenwasser und beeinflusst Nahrungsketten.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie atmen Meeressaeuger wie Wale unter Wasser?",
        answerA = "Durch Kiemen die sich aus Evolutionsgruenden erhalten haben",
        answerB = "Sie atmen nicht unter Wasser, sondern halten die Luft an und kommen zum Atmen an die Oberflaeche",
        answerC = "Durch spezielle Hautatmung ueber die Schwanzflosse",
        answerD = "Sie absorbieren Sauerstoff direkt aus dem Meerwasser",
        correctAnswer = 1,
        explanation = "Wale sind Lungenatmer und muessen regelmaessig an die Oberflaeche. Sie haben jedoch Anpassungen wie hoehere Myoglobinkonzentration im Muskeln und verlangsamten Herzschlag fuer lange Tauchgaenge.",
        difficulty = 2,
        funFact = "Schnabelwale koennen bis zu 3 Stunden tauchen und dabei ueber 2000 Meter tief tauchen - der laengste und tiefste Tauchgang aller Saegetiere."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die Nahrungsgrundlage fuer praktisch alle ozeanischen Nahrungsketten?",
        answerA = "Korallen und Seegras",
        answerB = "Phytoplankton, mikroskopische photosynthetische Organismen",
        answerC = "Bakterien am Meeresboden",
        answerD = "Kleinkrebse und Muschellarven",
        correctAnswer = 1,
        explanation = "Phytoplankton bildet durch Photosynthese organische Substanz aus Sonnenlicht und CO2 und ist die Basis fast aller marinen Nahrungsketten. Es produziert etwa 50 Prozent des gesamten Sauerstoffs der Erde.",
        difficulty = 2,
        funFact = "Ein einziger Quadratmeter Ozean kann Milliarden von Phytoplankton-Zellen enthalten. Saisonal entstehen sichtbare Bluetenfelder, die sogar aus dem Weltraum erkennbar sind."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Eigenschaft besitzt der Zitterrochen (Torpedo)?",
        answerA = "Er kann sich aufblaesen wie ein Kugelfisch",
        answerB = "Er erzeugt elektrische Schlaege von bis zu 220 Volt zur Betaeubung von Beute",
        answerC = "Er springt aus dem Wasser um Voegel zu fangen",
        answerD = "Er kann mehrere Stunden ausserhalb des Wassers ueberleben",
        correctAnswer = 1,
        explanation = "Zitterrochen besitzen elektrische Organe, die aus modifizierten Muskelzellen (Elektroplatten) bestehen und starke Stromschlaege erzeugen. Diese werden zur Jagd und zur Verteidigung eingesetzt.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das Besondere an der Fortpflanzung von Krebsen wie Hummern und Krabben?",
        answerA = "Sie gebaeren lebende Junge",
        answerB = "Das Weibchen traegt befruchtete Eier unter dem Hinterleib bis zum Schluepfen",
        answerC = "Sie legen Eier in Sand wie Meeresschildkroeten",
        answerD = "Sie vermehren sich ungeschlechtlich durch Teilung",
        correctAnswer = 1,
        explanation = "Weibliche Krebstiere (Hummer, Krabben, Garnelen) tragen die befruchteten Eier unter ihrem Hinterleib an speziellen Eierbeinchen, bis die Larven schluepfen.",
        difficulty = 2,
        funFact = "Ein grosser Hummer kann ueber 100 Jahre alt werden. Das Alter laesst sich schwer bestimmen, weil Hummer keine Jahresringe wie Baeume haben."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie unterscheidet sich die Haut von Haien von der Haut von Delfinen?",
        answerA = "Haut von Delfinen ist glaetter und hat keine Schuppen",
        answerB = "Hai-Haut besteht aus Placoidschuppen, Delphinhaut ist glatt und gummiartig ohne Schuppen",
        answerC = "Beide haben identische Haut",
        answerD = "Delphinhaut ist dicker und rauer",
        correctAnswer = 1,
        explanation = "Haie haben Placoidschuppen (Hautzaehne) die die Hautoberflaeche strukturieren. Delfine als Saegetiere haben eine glatte, elastische Haut ohne Schuppen, die hydrodynamisch sehr effizient ist.",
        difficulty = 2,
        funFact = "Delfinhaut erneuert sich alle zwei Stunden komplett, was dazu beitraegt, Algen und Parasitenwachstum zu verhindern und die Reibung zu minimieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist eine Meerestrombe (Upwelling) und warum ist sie fuer Fische wichtig?",
        answerA = "Eine Unterwasserstroemung die Korallen bildet",
        answerB = "Aufsteigendes naehrstoffreiches Tiefenwasser das Plankton und damit Fischgruende foerdert",
        answerC = "Ein Wirbelsturm der das Meerwasser erwaermt",
        answerD = "Eine Wellenformation die Fische an Kuesten treibt",
        correctAnswer = 1,
        explanation = "Upwelling bezeichnet das Aufsteigen von naehrstoffreichem kaltem Tiefenwasser an die Oberflaeche, meist durch Winde. Dies foerdert Phytoplankton-Wachstum und damit reiche Fischgruende.",
        difficulty = 2,
        funFact = "Die Upwelling-Gebiete vor Peru und Namibia gehoeren zu den produktivsten Fischgewaeessern der Welt, obwohl sie nur 0,1 Prozent der Meeresoberflaeche ausmachen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter dem Migrationsverhalten von Lachsen?",
        answerA = "Lachse wandern jaehrlich zwischen Nord- und Suedpol",
        answerB = "Lachse schluepfen im Suessswasser, wachsen im Meer auf und kehren zum Laichen in ihr Geburtsgewasser zurueck",
        answerC = "Lachse leben immer im Meer und laichen dort",
        answerD = "Lachse migrieren nur einmal im Leben zufaellig",
        correctAnswer = 1,
        explanation = "Lachse sind anadromer Fische: Sie schluepfen in Suesswaesserflueessen, wandern als Junglachse ins Meer, wachsen dort auf und kehren als Adulte praezise in ihr Geburtsgewasser zurueck, um zu laichen.",
        difficulty = 2,
        funFact = "Lachse orientieren sich fuer die Rueckkehr zum Geburtsgewasser durch den charakteristischen chemischen Geruch des Wassers, den sie als Jungtiere eingepraegt haben."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Organ nutzen Haie zusaetzlich um Beute zu riechen?",
        answerA = "Spezialisierte Geruchsgaenge die direkt zum Gehirn fuehren und extrem empfindlich sind",
        answerB = "Tastsensoren an den Flossen",
        answerC = "Elektrische Felder in der Umgebung",
        answerD = "Reflektierende Augen die UV-Licht wahrnehmen",
        correctAnswer = 0,
        explanation = "Haie haben extrem empfindliche Geruchsorgane. Etwa zwei Drittel des Haigehirns ist fuer die Verarbeitung von Geruchsreizen zustaendig. Sie koennen Blut in einer Verduennung von 1:1.000.000 wahrnehmen.",
        difficulty = 2,
        funFact = "Der Geruchssinn des Haies ist so gut, dass er eine einzige Bluttropfen in einem Swimmingpool-grossen Wasservolumen erkennen kann."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die biologische Besonderheit des Schwertfisches (Xiphias gladius)?",
        answerA = "Er ist der einzige Fisch der im Eis leben kann",
        answerB = "Er besitzt ein spezielles Organ das sein Gehirn und Augen erwaermt",
        answerC = "Er kann elektrische Schlaege erzeugen wie der Zitteraal",
        answerD = "Er ist der einzige Fisch mit Lungen",
        correctAnswer = 1,
        explanation = "Schwertfische besitzen ein einzigartiges Waermeerzeugungsorgan das Gehirn und Augen auf bis zu 28 Grad Celsius ueber Umgebungstemperatur erwaermt. Dies verbessert die Sehleistung beim Jagen in kaltem Tiefenwasser.",
        difficulty = 2,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie schlafen Delfine obwohl sie kontinuierlich atmen muessen?",
        answerA = "Sie schlafen gar nicht",
        answerB = "Durch unihaemisphaerischen Schlaf: eine Gehirnhaelfte schlaeft, die andere bleibt wach",
        answerC = "Sie schlafen am Meeresboden zwischen Algen",
        answerD = "Sie schlafen nur ausserhalb des Wassers an Land",
        correctAnswer = 1,
        explanation = "Delfine nutzen unihaemisphaerischen Schlaf: eine Gehirnhaelfte schlaeft, waehrend die andere wach bleibt und Atmung und Orientierung kontrolliert. Dann wechseln sie die Seite.",
        difficulty = 2,
        funFact = "Auch Wale schlafen so und wurden dabei beobachtet, wie sie regungslos senkrecht im Wasser treiben - dieses Verhalten nennt man 'Loggen'."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das besondere Merkmal der Mantarochen gegenueber anderen Rochen?",
        answerA = "Sie sind giftig und haben Stacheln",
        answerB = "Sie haben keine Schwanzstacheln und sind Filtrierer von Plankton",
        answerC = "Sie koennen elektrische Schlaege ausueben",
        answerD = "Sie koennen ausserhalb des Wassers ueberleben",
        correctAnswer = 1,
        explanation = "Mantas (Teufelsrochen) haben keinen Giftstachel und sind harmlose Filtrierer. Sie filtern Plankton mit ihren Kiemenplatten und gehoeren mit bis zu 7 Metern Spannweite zu den groessten Rochen.",
        difficulty = 2,
        funFact = "Mantas haben das groesste Gehirn-zu-Koerper-Verhaeltnis aller Fische und zeigen Verhalten das auf Selbsterkennung hindeutet."
    ),

    Question(
        categoryId = 9,
        questionText = "Warum sind Seegurken fuer das marine Oekosystem wichtig?",
        answerA = "Sie reinigen das Wasser durch Filtration von Algen",
        answerB = "Sie zersetzen organisches Material am Meeresboden und recyceln Naehrstoffe",
        answerC = "Sie produzieren Sauerstoff fuer Korallenriffe",
        answerD = "Sie schiessen Wasserstrahlen um Sediment zu belueften",
        correctAnswer = 1,
        explanation = "Seegurken sind wichtige Zersetzer im marinen Oekosystem. Sie nehmen Sediment auf, verdauen organische Partikel und geben sauberes Sediment wieder ab. So recyceln sie Naehrstoffe und belueften den Meeresboden.",
        difficulty = 2,
        funFact = "Als Verteidigungsmechanismus stossen Seegurken ihre inneren Organe aus dem After aus und regenerieren sie danach vollstaendig."
    ),

)
