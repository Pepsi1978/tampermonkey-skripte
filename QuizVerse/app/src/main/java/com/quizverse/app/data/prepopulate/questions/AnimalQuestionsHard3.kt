package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsHard3(): List<Question> = listOf(

    // ── ORNITHOLOGY (Vogelkunde) ── 25 questions ─────────────────────────────

    Question(
        categoryId = 9,
        questionText = "Welche Zugvogelart legt auf ihrem Zug zwischen Sibirien und Australien die groesste Strecke ohne Zwischenstopp zurueck?",
        answerA = "Arktische Seeschwalbe",
        answerB = "Pfuhlschnepfe",
        answerC = "Kurzschnabelgans",
        answerD = "Roter Knoten",
        correctAnswer = 1,
        explanation = "Die Pfuhlschnepfe (Limosa lapponica) fliegt in einem einzigen Nonstop-Flug bis zu 12.200 km von Alaska nach Neuseeland, ohne zu fressen oder zu ruhen.",
        difficulty = 3,
        funFact = "Waehrend des Nonstop-Fluges schrumpfen Darm und Leber der Pfuhlschnepfe, um Gewicht zu sparen."
    ),

    Question(
        categoryId = 9,
        questionText = "Zu welcher Ordnung gehoert der Mauersegler (Apus apus) taxonomisch?",
        answerA = "Passeriformes",
        answerB = "Caprimulgiformes",
        answerC = "Coraciiformes",
        answerD = "Apodiformes",
        correctAnswer = 3,
        explanation = "Mauersegler gehoeren zur Ordnung Apodiformes. Trotz aeusserlicher Aehnlichkeit mit Schwalben sind sie naeher mit Kolibris verwandt als mit anderen Singvoegeln.",
        difficulty = 3,
        funFact = "Mauersegler koennen jahrelang in der Luft bleiben und schlafen sogar im Flug."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie heisst das Brutverhalten, bei dem Voegel verschiedene Arten Eier aus fremden Nestern verdraengen, ohne selbst ein Nest zu bauen?",
        answerA = "Brutparasitismus",
        answerB = "Kleptogamie",
        answerC = "Alloparasitismus",
        answerD = "Koloniebrut",
        correctAnswer = 0,
        explanation = "Brutparasitismus bezeichnet das Verhalten, bei dem ein Vogel seine Eier in fremde Nester legt. Der Kuckuck ist das bekannteste Beispiel in Europa.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Vogel besitzt die laengste Spannweite unter allen lebenden Vogelarten?",
        answerA = "Kaiseralbatros",
        answerB = "Wanderalbatros",
        answerC = "Andenkondor",
        answerD = "Marabu",
        correctAnswer = 1,
        explanation = "Der Wanderalbatros (Diomedea exulans) hat mit bis zu 3,51 m die groesste Fluegelsparnnweite aller lebenden Vogelarten.",
        difficulty = 3,
        funFact = "Wanderalbatrosse koennen mit einem einzigen Schlag ihrer Fluegel ueber 1.000 km gleiten, ohne zu schlagen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Syrinx' bei Voegeln?",
        answerA = "Ein spezialisierter Schnabelansatz fuer Filterernaehrung",
        answerB = "Das Stimmorgan der Voegel, analog zum menschlichen Kehlkopf",
        answerC = "Die Atemluft-Speichertasche der Taucher",
        answerD = "Das Schallresonanzorgan der Spechte",
        correctAnswer = 1,
        explanation = "Die Syrinx ist das Stimmorgan der Voegel, das an der Gabelung der Luftroehre sitzt. Anders als der Saeugetier-Kehlkopf koennen manche Voegel mit der Syrinx zwei unabhaengige Toene gleichzeitig erzeugen.",
        difficulty = 3,
        funFact = "Voegel mit zwei Syrinx-Haelften wie Amseln koennen zweistimmige Melodien ohne Pause singen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Strecke legt die Arktische Seeschwalbe auf ihrem jaehrlichen Rundflug im Durchschnitt zurueck?",
        answerA = "ca. 40.000 km",
        answerB = "ca. 60.000 km",
        answerC = "ca. 70.000 km",
        answerD = "ca. 90.000 km",
        correctAnswer = 2,
        explanation = "Die Arktische Seeschwalbe legt auf ihrem Zug von der Arktis in die Antarktis und zurueck im Schnitt etwa 70.000 km pro Jahr zurueck, was die laengste Wanderung aller Tiere darstellt.",
        difficulty = 3,
        funFact = "Ueber ein Leben von 30 Jahren legt eine Arktische Seeschwalbe etwa 2,4 Millionen Kilometer zurueck — dreimal zum Mond und zurueck."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Merkmal unterscheidet Nesthocker (Nidiole) von Nestfluechtern (Nidifuge) bei Voegeln?",
        answerA = "Nesthocker schluepfen mit offenen Augen und warmbluetigem Gefieder",
        answerB = "Nesthocker benoetigen nach dem Schluepfen intensive elterliche Pflege, da sie blind, nackt und hilflos sind",
        answerC = "Nestfluechter verlassen sofort nach dem Schluepfen die Brutstaette und erhalten keine Fuetterung",
        answerD = "Nesthocker legen mehr Eier als Nestfluechter",
        correctAnswer = 1,
        explanation = "Nesthocker (z.B. Singvoegel) schluepfen blind, ohne Federn und hilflos und sind auf intensive elterliche Versorgung angewiesen. Nestfluechter (z.B. Entenkueken) koennen das Nest kurz nach dem Schluepfen verlassen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Vogel der Nordsee bruetet ausschliesslich in einer einzigen Kolonie weltweit auf der Insel Helgoland und der benachbarten Duene?",
        answerA = "Tordalk",
        answerB = "Basstolpel",
        answerC = "Dreizehenmoewe",
        answerD = "Papageientaucher",
        correctAnswer = 1,
        explanation = "Die einzige deutsche Brutkolonie des Basstolpels (Morus bassanus) befindet sich auf der Helagolaender Duene. Die Kolonie zaehlt heute ueber 1.000 Brutpaare.",
        difficulty = 3,
        funFact = "Basstolpel stossen beim Tauchen mit bis zu 100 km/h senkrecht ins Wasser — ihr Schnaebel und Schaedel sind durch Luftkissen abgefedert."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man die Federstruktur, die Eulen einen lautlosen Flug ermoeglicht?",
        answerA = "Kammfeder-Struktur (pectinate feathers)",
        answerB = "Konturfedern mit Afterschaft",
        answerC = "Velour-Deckfedern",
        answerD = "Pennaceous feathers",
        correctAnswer = 0,
        explanation = "Eulen haben kammfoermig gesaegte Vorderraender an den Handschwingen (Kammfedern), die Luftverwirbelungen aufloesen und so den Fluglaerm minimieren.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Vogel ist der einzige Vertreter der Familie Opisthocomidae und besitzt als Jungtier noch Krallen an den Fluegeln?",
        answerA = "Hoatzin",
        answerB = "Sekretaer",
        answerC = "Hamerkop",
        answerD = "Schuhschnabel",
        correctAnswer = 0,
        explanation = "Der Hoatzin (Opisthocomus hoazin) aus dem Amazonasgebiet ist der einzige lebende Vertreter der Familie Opisthocomidae. Juengvoegel haben temporaere Klauen an den Fluegeln, mit denen sie auf Aeste klettern.",
        difficulty = 3,
        funFact = "Der Hoatzin wird wegen seines einzigartigen Fermentations-Verdauungssystems auch als 'stinkender Vogel' bezeichnet."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter 'Magnumdruesenei' bei der Eierbildung von Voegeln?",
        answerA = "Die Absonderung von Hagelschnueren in der Eibildungsroehre",
        answerB = "Die Anlagerung von Eiweiss (Albumen) um das Eigelb im Eileiter",
        answerC = "Die Bildung der Kalkschale in der Uterinalroehre",
        answerD = "Die Pigmentierung der Eischale durch Porenzellen",
        correctAnswer = 1,
        explanation = "Im Magnum, dem laengsten Abschnitt des Eileiters, wird das Eiweiss (Albumen) um das Eigelb abgelagert. Dieser Vorgang dauert bei Huehnern etwa 3 Stunden.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Sperlingsvogelart (Passeriforme) wandert von Europa bis ins suedliche Afrika und nutzt dabei den Ostatlantik-Zugkorridor mit Stationen auf den Kanarischen Inseln?",
        answerA = "Orpheusspottdrossel",
        answerB = "Baumpieper",
        answerC = "Gartenrotschwanz",
        answerD = "Trauerschnaeppermaennchen",
        correctAnswer = 3,
        explanation = "Der Trauerschnaeppermaennchen (Ficedula hypoleuca) zieht von Europa nach Westafrika entlang der atlantischen Kuestenlinie und nutzt regelmaessig die Kanarischen Inseln als Zwischenstop.",
        difficulty = 3,
        funFact = "Trauerschnaeppermaennchen orientieren sich auf dem Zug sowohl am Sternenhimmel als auch am Erdmagnetfeld."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Klasse von Voegeln wird als 'Ratitae' bezeichnet und warum?",
        answerA = "Flugvoegel mit keellosem Brustbein, z.B. Pfauen",
        answerB = "Laufvoegel mit flachem, kiellosem Brustbein, z.B. Strausse und Kiwis",
        answerC = "Taucher mit reduzierten Fluegeln, z.B. Pinguine",
        answerD = "Hochgebirgsvoegel mit besonders kurzem Sternum",
        correctAnswer = 1,
        explanation = "Ratitae sind Laufvoegel (z.B. Strausse, Kiwis, Emus), die ein flaches, kielloses Brustbein (Sternum ohne Carina) besitzen und daher nicht fliegen koennen. Der Begriff kommt vom lateinischen 'ratis' (Floss).",
        difficulty = 3,
        funFact = "Der Moa aus Neuseeland, der groesste Ratite aller Zeiten, war ueber 3,6 m gross und wurde erst im 15. Jahrhundert ausgerottet."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das charakteristische Merkmal der Brutbiologie des Kaiseradlers (Aquila heliaca)?",
        answerA = "Er bruetet ausschliesslich in Felswanden",
        answerB = "Er legt sein Nest immer in der Krone von Eichen an",
        answerC = "Er zeigt obligatorischen Kainismus — das erste Kueken toetet regelmaessig das zweite",
        answerD = "Die Brutzeit betraegt ueber 60 Tage, laenger als bei jedem anderen Adler",
        correctAnswer = 2,
        explanation = "Beim Kaiseradler tritt Kainismus (Toetung eines Geschwisters durch das aeltere Kueken) haeufig auf, obwohl es nicht bei allen Paaren obligatorisch ist. Das erstgeschluepfte Kueken dominiert das zweite oft toedlich.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie lautet der wissenschaftliche Name des Weissabdomen-Sturmvogels (snow petrel), eines der suedlichsten Brutvoegel der Erde?",
        answerA = "Pagodroma nivea",
        answerB = "Daption capense",
        answerC = "Fulmarus glacialoides",
        answerD = "Thalassoica antarctica",
        correctAnswer = 0,
        explanation = "Der Schneesturmvogel (Pagodroma nivea) bruetet in der Antarktis und gelegentlich bis zu 440 km ins Landesinnere, womit er zu den suedlichsten Brutvoegeln der Erde gehoert.",
        difficulty = 3,
        funFact = "Schneesturmvoegel erbrechen bei Gefahr ein stinkendes Magenoil als Verteidigungsmassnahme."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Vogelei hat im Verhaeltnis zur Koerpergroesse des Muttertieres die groesste relative Groesse?",
        answerA = "Straussvogelei",
        answerB = "Kolibrivogelei",
        answerC = "Kiwivogelei",
        answerD = "Pinguinei",
        correctAnswer = 2,
        explanation = "Das Kiwivogelei (Apteryx) ist im Verhaeltnis zur Koerpergroesse das groesste Vogelei: Es macht bis zu 20% des Koerpergewichts des Muttertieres aus und ist damit proportional das groesste Ei der Welt.",
        difficulty = 3,
        funFact = "Ein Kiwivogelei enthaelt fast kein Eigelb — der Embryo benoetigt es kaum, da er beim Schluepfen bereits weit entwickelt ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Vogelart ist der einzige bekannte Vertreter, dessen Gefieder nachweislich toxische Alkaloide (Batrachotoxin) enthaelt?",
        answerA = "Pitohui zweifarbig (Pitohui dichrous)",
        answerB = "Hoatzin (Opisthocomus hoazin)",
        answerC = "Seriema (Cariama cristata)",
        answerD = "Schlangenadler (Circaetus gallicus)",
        correctAnswer = 0,
        explanation = "Der Pitohui (Pitohui dichrous) aus Papua-Neuguinea war der erste entdeckte giftige Vogel. Sein Gefieder und seine Haut enthalten Batrachotoxin, dasselbe Neurotoxin wie in Pfeilgiftfroeschen.",
        difficulty = 3,
        funFact = "Die Einheimischen in Papua-Neuguinea nannten den Pitohui 'Muellvogel', weil man ihn wegen des Giftes nicht essen konnte."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie heisst das Gefiederphaenoemen, bei dem Voegel eine voruebergehende Mauser in mattes Gefieder ablegen, um ausserhalb der Brutzeit weniger auffaellig zu sein?",
        answerA = "Teilmauser",
        answerB = "Schlichtkleid-Mauser (eclipse plumage)",
        answerC = "Praealteration",
        answerD = "Grundgefieder-Reset",
        correctAnswer = 1,
        explanation = "Das Eclipse-Gefieder (Schlichtkleid) ist ein voruebergehend mattes Gefieder, das z.B. Erpel nach der Brutzeit anlegen. Es macht sie weniger sichtbar, waehrend sie wegen der Fluegelfedermauser kurzzeitig flugunfaehig sind.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Spannweite hat ein ausgewachsener maennlicher Steinadler (Aquila chrysaetos) im Durchschnitt?",
        answerA = "150-170 cm",
        answerB = "180-220 cm",
        answerC = "230-260 cm",
        answerD = "270-310 cm",
        correctAnswer = 1,
        explanation = "Der Steinadler hat eine Flugelspannweite von durchschnittlich 180-220 cm. Weibchen sind groesser als Maennchen und koennen bis zu 227 cm Spannweite erreichen.",
        difficulty = 3,
        funFact = "Steinadler koennen mit bis zu 320 km/h im Sturzflug fliegen und halten damit den Rekord unter den Adlern."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist Philopatrie im Kontext der Vogelkunde?",
        answerA = "Die Tendenz von Voegeln, in Schwarmverbund zu ziehen",
        answerB = "Die Neigung, zum Geburtsort zurueckzukehren, um dort zu brueten",
        answerC = "Die Orientierung am Erdmagnetfeld bei der Zugmigration",
        answerD = "Das Verhalten, Gesaenge von Artgenossen zu imitieren",
        correctAnswer = 1,
        explanation = "Philopatrie (griechisch: Vaterlandsliebe) bezeichnet die Neigung von Tieren — besonders Voegeln — zum Geburtsort oder frueheren Brutort zurueckzukehren. Sie traegt zur genetischen Strukturierung von Populationen bei.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Vogelart aus der Familie der Greifvoegel (Accipitridae) ist bekannt dafuer, Knochen aus der Luft fallen zu lassen, um sie aufzubrechen?",
        answerA = "Schmutzgeier",
        answerB = "Bartgeier",
        answerC = "Gaensegeier",
        answerD = "Moenchs-geier",
        correctAnswer = 1,
        explanation = "Der Bartgeier (Gypaetus barbatus) laesst grosse Knochen aus bis zu 80 m Hoehe auf Felsplatten fallen, um sie aufzubrechen und das Knochenmark zu fressen. Er ist der einzige Vogel, der sich hauptsaechlich von Knochen ernaehrt.",
        difficulty = 3,
        funFact = "Bartgeier faerben ihr weisses Brustgefieder absichtlich mit Eisenoxid rot, indem sie sich in eisenoxydhaltigen Pfuetzen waelzen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Begriff beschreibt die Faehigkeit von Voegeln wie Staren, synchrone Schwarmformationen in der Luft zu bilden?",
        answerA = "Synchroformation",
        answerB = "Murmuration",
        answerC = "Flokulation",
        answerD = "Synaptische Herdenbewegung",
        correctAnswer = 1,
        explanation = "Die spektakulaeren Schwarmfluege von Staren werden als 'Murmuration' bezeichnet. Jeder Vogel reagiert auf die Bewegungen seiner sieben naechsten Nachbarn, was zu den wellenartigen, synchronen Formationen fuehrt.",
        difficulty = 3,
        funFact = "Wissenschaftler konnten zeigen, dass Stare im Schwarm genau auf die 7 naechsten Nachbarn achten, unabhaengig vom Abstand zu ihnen."
    ),

    Question(
        categoryId = 9,
        questionText = "Aus welchem Grund produzieren maennliche Prachtfinken (Estrildidae) oft ultraviolett reflektierende Gefiedermuster?",
        answerA = "UV-Muster dienen als Warnsignale gegenueber Raubvogeln",
        answerB = "Weibchen bevorzugen Partner mit staerkerer UV-Reflexion als Signal fuer genetische Qualitaet",
        answerC = "UV-Federfarben absorbieren Waerme effektiver fuer die Thermoregulation",
        answerD = "UV-Reflexionen erleichtern die Orientierung im dichten Gebuesch",
        correctAnswer = 1,
        explanation = "Bei vielen Prachtfinken und anderen Voegeln waehlen Weibchen Partner mit intensiverer UV-Reflexion. Diese UV-Muster signalisieren Parasitenfreiheit und gute Gene, da Gefiederpflege und Gesundheit UV-Reflexion erhalten.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie heisst die spezifische anatomische Anpassung der Spechte, die verhindert, dass sie sich beim Hacken das Gehirn verletzen?",
        answerA = "Verdicktes Schadelknochen-Trabekel-System",
        answerB = "Hyoidknochen als Stossdaempfer-Zungenbeinapparat",
        answerC = "Pneumatisierte Frontalknochen",
        answerD = "Supraobitale Knochenkammstruktur",
        correctAnswer = 1,
        explanation = "Das Zungenbein (Hyoid) des Spechts ist extrem verlaengert und umschlingt den gesamten Schaedel. Es wirkt als elastischer Stossdaempfer, der die Aufprallenergie beim Hacken (bis 25g Beschleunigung) absorbiert.",
        difficulty = 3,
        funFact = "Die Zunge des Spechts ist so lang, dass sie sich aufgerollt um den gesamten Schaedel wickelt, wenn sie zurueckgezogen wird."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Vogelart ist dafuer bekannt, ihren Gesang durch die Imitation von bis zu 200 verschiedenen Vogelstimmen zu bereichern?",
        answerA = "Eurasische Drosseln",
        answerB = "Spottnachtigall",
        answerC = "Gartengrasmucke",
        answerD = "Lerchenspottdrossel (Mimus polyglottos)",
        correctAnswer = 3,
        explanation = "Die Lerchenspottdrossel (Mimus polyglottos) aus Nordamerika kann bis zu 200 verschiedene Vogelstimmen und Umgebungsgeraeusche imitieren. Sie singt oft nachts und kann ihren Gesang stundenlang unveraendert fortsetzen.",
        difficulty = 3,
        funFact = "Maennliche Lerchenspottdrosseln ohne Partner singen nachts lauter als geparrte Maennchen — als akustisches Werbungssignal."
    ),

    // ── MARINE BIOLOGY (Meeresbiologie) ── 25 questions ──────────────────────

    Question(
        categoryId = 9,
        questionText = "Welcher Meeresorganismus bildet den Hauptbestandteil der Tiefsee-Sedimentschichten, bekannt als 'Globigerinenschlamm'?",
        answerA = "Kieselalgen (Diatomeen)",
        answerB = "Pteropoden (Fluegelschnecken)",
        answerC = "Foraminiferen (Kammerlinge)",
        answerD = "Coccolithophoriden",
        correctAnswer = 2,
        explanation = "Globigerinenschlamm besteht hauptsaechlich aus den kalkhaltigen Schalen pelagischer Foraminiferen der Gattung Globigerina. Er bedeckt etwa 30% des Meeresbodens und ist die haeufigste Tiefseesediment-Art.",
        difficulty = 3,
        funFact = "Aus aehnlichen Foraminiferenschichten entstand der Kalkstein vieler europaischer Gebirge, darunter die Kreidefelsengruppe von Dover."
    ),

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet man als 'Mesopelagial' in der marinen Zonierung?",
        answerA = "Die Tiefenzone von 200-1.000 m, die 'Daemmerungszone'",
        answerB = "Der Uebergang zwischen Flachwasser und offenem Ozean",
        answerC = "Die produktive Oberflaeche bis 200 m Tiefe",
        answerD = "Die Gezeitenzone des Meeresbodens",
        correctAnswer = 0,
        explanation = "Das Mesopelagial (200-1.000 m Tiefe) wird auch als 'Twilight Zone' oder Daemmerungszone bezeichnet. Hier dringt noch schwaches Licht ein, aber es reicht nicht fuer Photosynthese.",
        difficulty = 3,
        funFact = "Im Mesopelagial findet die groesste taeglich Vertikalmigration von Biomasse auf der Erde statt — Millionen von Tieren steigen nachts hoch und sinken tags ab."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche physiologische Anpassung ermoeglicht Tiefseefischen wie dem Blauen Grenadier das Ueberleben bei Druecken von ueber 600 bar?",
        answerA = "Ein komprimiertes, druckresistentes Knochengeruest",
        answerB = "Piezolyt-Molekuele, die Proteine unter Hochdruck stabilisieren",
        answerC = "Ein mit Fett gefuelltes Vakuumorgan als Druckausgleich",
        answerD = "Extrazellulaere Hydrogelkapseln an Nervenzellen",
        correctAnswer = 1,
        explanation = "Tiefseeorganismen besitzen Piezolyte (z.B. TMAO - Trimethylaminoxid), kleine organische Molekuele, die Proteine unter extremem hydrostatischen Druck in ihrer Faltung stabilisieren und so Enzymen ihre Funktion erhalten.",
        difficulty = 3,
        funFact = "Der TMAO-Gehalt in Tiefseefischen steigt proportional zur Lebenstiefe — man kann die Tiefe anhand des TMAO-Gehalts bestimmen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie heisst der biologische Prozess, durch den Korallen ihre symbiontischen Algen (Zooxanthellen) unter Stress ausstossen?",
        answerA = "Algifizierung",
        answerB = "Symbiont-Lyse",
        answerC = "Korallenbleiche",
        answerD = "Zooxanthellen-Apoptose",
        correctAnswer = 2,
        explanation = "Bei Korallenbleiche (englisch: coral bleaching) stossen Korallen ihre Zooxanthellen-Algen aus, die ihnen bis zu 90% ihrer Energie liefern. Ausgeloest wird dies meist durch Erwaermung des Meerwassers. Die Korallen erscheinen dann weiss und sterben ohne Algen ab.",
        difficulty = 3,
        funFact = "Das bisher schwerste Bleichereignis am Great Barrier Reef (2016) schaedigte ueber 50% der noerdlichen Korallen dauerhaft."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Eigenschaft macht die Biolumineszenz von Tiefseeorganismen biochemisch moeglich?",
        answerA = "Oxido-Reduktionsreaktion von Luciferin durch das Enzym Luciferase",
        answerB = "Piezoelektrische Entladung durch Chitinpanzer-Kompression",
        answerC = "Phosphoreszenz durch UV-absorbierende Rhodopsinpigmente",
        answerD = "Chemolumineszenz durch Jodkatalyse in Spezialdruesen",
        correctAnswer = 0,
        explanation = "Biolumineszenz entsteht durch die enzymatische Oxidation des Substrats Luciferin durch das Enzym Luciferase unter Sauerstoffverbrauch. Die dabei freigesetzte Energie wird als sichtbares Licht abgegeben.",
        difficulty = 3,
        funFact = "Ca. 90% aller Tiefseelebebewesen bis 1.000 m Tiefe sind biolumineszent — Licht ist dort das wichtigste Kommunikationsmedium."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter 'Hydrothermalquellen-Oekosystemen' (Hydrothermal Vent Communities)?",
        answerA = "Korallenriff-Gemeinschaften in warmen Flachwasserbereichen tropischer Meere",
        answerB = "Tiefseeoekosysteme, die auf Chemosynthese statt Photosynthese basieren",
        answerC = "Planktonblueten durch aufsteigendes naehrstoffreiches Wasser",
        answerD = "Arktische Unterwasser-Lebensgemeinschaften unter Meereseis",
        correctAnswer = 1,
        explanation = "Hydrothermale Ventgemeinschaften existieren an Tiefseequellen, wo schwefelwasserstoffreiches, heisses Wasser austritt. Chemosynthetische Bakterien bilden die Basis der Nahrungskette, voellig unabhaengig von Sonnenlicht.",
        difficulty = 3,
        funFact = "Riesige Roehrentwuermer (Riftia pachyptila) an Hydrothermalquellen koennen bis zu 2 m lang werden und haben keinen Darmtrakt — sie ernaehren sich ausschliesslich durch Bakteriensymbionten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Ozeanguertel wird als 'SOFAR-Kanal' bezeichnet und welche Bedeutung hat er?",
        answerA = "Eine Salzgehalt-Sprungschicht, die Suess- und Salzwasser trennt",
        answerB = "Eine Tiefenzone optimaler Schallausbreitung, die Walgesaenge ueber tausende km leitet",
        answerC = "Der aequatoriale Gegenstrom des Atlantischen Ozeans",
        answerD = "Die thermische Sprungschicht (Thermokline) zwischen Oberflaechenwasser und Tiefenwasser",
        correctAnswer = 1,
        explanation = "Der SOFAR-Kanal (Sound Fixing and Ranging Channel) liegt typischerweise in ca. 600-1200 m Tiefe. Dort wirken Druck und Temperatur so, dass Schall horizontal geleitet wird und kaum gestreut wird — Wale koennen so ueber Tausende von Kilometern kommunizieren.",
        difficulty = 3,
        funFact = "Blauwale nutzen den SOFAR-Kanal, um mit 20-Hz-Rauschen Artgenossen auf der anderen Seite des Ozeans zu erreichen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Anpassung besitzt die Tiefseekreatur 'Vampirtintenfisch' (Vampyroteuthis infernalis), die ihn von anderen Tintenfischen unterscheidet?",
        answerA = "Er besitzt kein Tintenbeutel und spritzt stattdessen Biolumineszenz-Fluessigkeit",
        answerB = "Er ist der einzige Cephalopode, der sich ausschliesslich von Meeresschnee (marine snow) ernaehrt",
        answerC = "Er hat Kiemenplakten statt Trichter und ist damit naeher mit Nautilen verwandt",
        answerD = "Er kann seinen Mantel wenden (invertieren), um Raeubern zu entkommen",
        correctAnswer = 1,
        explanation = "Vampyroteuthis infernalis ist der einzige bekannte Cephalopode, der ausschliesslich Detritus (Meeresschnee) frisst statt aktiv zu jaegen. Er bildet eine eigene Ordnung (Vampyromorpha) zwischen Tintenfischen und Oktopussen.",
        difficulty = 3,
        funFact = "Trotz seines bedrohlichen Namens ist der Vampirtintenfisch harmlos — er ist gerade einmal 30 cm gross und ernaehrt sich von herabsinkenden Partikeln."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie heisst der Effekt, bei dem aufsteigendes Tiefenwasser an Kuesten wie Peru zu aussergewoehnlich produktiven Meeresgebieten fuehrt?",
        answerA = "Thermohaline Zirkulation",
        answerB = "Kuestendivergenz",
        answerC = "Kuestenauftrieb (Coastal Upwelling)",
        answerD = "Agulhas-Rueckstrom",
        correctAnswer = 2,
        explanation = "Kuestenauftrieb (Coastal Upwelling) entsteht, wenn Winde Oberflaechenwasser von der Kueste abdraengen und naehrstoffreiches Tiefenwasser aufsteigt. Vor Peru und Westafrika entstehen so die produktivsten Fischgruende der Welt.",
        difficulty = 3,
        funFact = "Die Peruanische Humboldtstromsystem — eine Auftriebszone — liefert ca. 10% des globalen marinen Fischfangs, obwohl es nur 0,1% der Meeresoberflaeche bedeckt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'Benthos' in der Meeresbiologie?",
        answerA = "Die Gesamtheit der im offenen Wasser schwebenden Organismen",
        answerB = "Die Organismengemeinschaft des Meeresbodens und der bodennahen Wasserschicht",
        answerC = "Planktische Organismen, die sich aktiv durch Stroemungen bewegen koennen",
        answerD = "Die Biozoenose des Gezeitenbereichs",
        correctAnswer = 1,
        explanation = "Benthos bezeichnet alle Lebewesen, die am Meeresboden leben oder in unmittelbarer Bodennaeehe. Es umfasst sessile Organismen wie Schwamme und Korallen (Epibenthos) sowie grabende Arten (Endobenthos).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus erlaubt dem Groenlandhai (Somniosus microcephalus) in eiskaltem Wasser bei etwa -1,8 Grad Celsius aktiv zu bleiben?",
        answerA = "Antifrierproteine im Blut verhindern Eiskristallbildung",
        answerB = "Trimethylaminoxid und Harnstoff erhoehen den osmotischen Druck und senken den Gefrierpunkt",
        answerC = "Ein spezialisiertes Gegenstrom-Waermeaustauschsystem heizt die Muskeln vor",
        answerD = "Gefrierschutzmittel in den Muskelfasern auf Glycerol-Basis",
        correctAnswer = 1,
        explanation = "Groenlandhaie akkumulieren hohe Konzentrationen von TMAO und Harnstoff im Gewebe. Diese osmotisch aktiven Substanzen senken den effektiven Gefrierpunkt und stabilisieren Proteine bei Kaelte. Dasselbe TMAO macht ihr Fleisch fuer Menschen ohne Spezialbehandlung giftig.",
        difficulty = 3,
        funFact = "Groenlandhaie koennen ueber 400 Jahre alt werden und sind damit das laengstlebende bekannte Wirbeltier auf der Erde."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Rolle spielen Mesopredatoren wie Seesterne in einem marinen Oekosystem als 'Schlusselsteinarten' (keystone species)?",
        answerA = "Sie produzieren Sauerstoff und binden Kohlenstoff durch Photosynthese",
        answerB = "Sie kontrollieren die Abundanz dominanter Konkurrenten und erhalten dadurch die Biodiversitaet",
        answerC = "Sie bilden die Grundlage der Nahrungskette als primaere Konsumenten",
        answerD = "Sie erhoehen durch Bioturbation den Naehrstoffgehalt des Sediments",
        correctAnswer = 1,
        explanation = "Als Schlusselsteinart kontrolliert z.B. der Ocker-Seestern (Pisaster ochraceus) die Miesmuschelpopulation. Wird er entfernt, dominieren Muscheln den Felsstrand und verdraengen andere Arten, was die Biodiversitaet drastisch reduziert.",
        difficulty = 3,
        funFact = "Das Konzept der Schlusselsteinart wurde 1966 von Robert Paine genau durch Experimente mit diesem Seestern an der US-Westkueste entwickelt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das Besondere am Fortpflanzungssystem des Tiefsee-Anglerfisches (Familie Ceratiidae)?",
        answerA = "Die Weibchen koennen sich parthenogenetisch ohne Maennchen fortpflanzen",
        answerB = "Maennchen verwachsen parasitaer dauerhaft mit dem Weibchen und werden Teil ihres Koerpers",
        answerC = "Beide Geschlechter wechseln je nach Populationsdichte ihr Geschlecht",
        answerD = "Die Befruchtung erfolgt extern; das Weibchen gibt Eier und das Maennchen Sperma gleichzeitig ins Wasser ab",
        correctAnswer = 1,
        explanation = "Beim Tiefseeangelfisch (Ceratiidae) findet sexueller Parasitismus statt: Das winzige Maennchen findet ein Weibchen, beisst sich fest und verschmilzt dauerhaft mit dessen Blutkreislauf. Es verliert alle eigenen Organe ausser den Hoden und liefert lebenslang Sperma.",
        difficulty = 3,
        funFact = "Ein Weibchen des Tiefsee-Angelfisches kann bis zu 8 Maennchen gleichzeitig an sich tragen, die alle zu parasitaeren Hoden-Anhaengseln degeneriert sind."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie heisst die globale Meeresstroemung, die Waerme vom Aequator zu den Polen transportiert und als 'Foerderband des Ozeans' bezeichnet wird?",
        answerA = "Nordatlantischer Golfstrom",
        answerB = "Globale thermohaline Zirkulation (AMOC)",
        answerC = "Zirkumpolarer Antarktisstrom",
        answerD = "Karibische Konvergenzkorridor",
        correctAnswer = 1,
        explanation = "Die Atlantische Umwaelzzirkulation (AMOC) ist Teil der globalen thermohalinen Zirkulation. Warmes Oberflaechenwasser fliesst nach Norden, kuehlt ab, sinkt wegen hoher Salzdichte auf den Meeresboden und fliesst als Tiefenwasser zurueck. Sie reguliert massgeblich das europaeische Klima.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter 'Chemosynthese' bei marinen Prokaryoten an Kaltquellen (Cold Seeps)?",
        answerA = "Die Nutzung von Sonnenenergie zur Reduktion von Kohlendioxid zu Biomasse",
        answerB = "Die Gewinnung von Energie durch Oxidation anorganischer Verbindungen wie Schwefelwasserstoff oder Methan",
        answerC = "Die Erzeugung von Biolumineszenz durch enzymatische Reaktionen",
        answerD = "Der Abbau von organischem Detritus durch anaerobe Fermentation",
        correctAnswer = 1,
        explanation = "Chemosynthetische Bakterien an Kaltquellen oxidieren Methan (CH4) oder Schwefelwasserstoff (H2S) und nutzen die dabei freigesetzte Energie, um CO2 zu organischer Biomasse zu reduzieren. Sie bilden die Energiebasis dieser sonnenunabhaengigen Oekosysteme.",
        difficulty = 3,
        funFact = "Kaltquellen im Golf von Mexiko entstehen, weil Methan durch Gashydrate aus Sedimenten entweicht — dort leben Muscheln, die bis zu 250 Jahre alt werden."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Charakteristikum unterscheidet Haie biologisch grundlegend von Knochenifischen (Osteichthyes)?",
        answerA = "Haie haben kein Herz und transportieren Blut durch Muskelpumpung",
        answerB = "Haie besitzen ein vollstaendiges Knorpelskelett statt Knochen",
        answerC = "Haie sind die einzigen Fische ohne laterales Seitenlinienorgan",
        answerD = "Haie atmen Luft direkt an der Wasseroberflaeche",
        correctAnswer = 1,
        explanation = "Haie gehoeren zur Klasse der Knorpelfische (Chondrichthyes). Ihr Skelett besteht komplett aus Knorpel, nicht aus Knochen. Knorpel ist leichter und flexibler als Knochen und gibt Haien ihr charakteristisches Auftriebsprofil.",
        difficulty = 3,
        funFact = "Haie haben keine Schwimmblase — sie regulieren ihren Auftrieb durch eine grosse, oelhaltige Leber, die bis zu 25% ihres Koerpergewichts ausmachen kann."
    ),

    Question(
        categoryId = 9,
        questionText = "In welcher Tiefe befindet sich der tiefste bekannte Punkt des Weltozeans, der Challengertief im Marianengraben?",
        answerA = "ca. 8.400 m",
        answerB = "ca. 9.800 m",
        answerC = "ca. 10.935 m",
        answerD = "ca. 11.520 m",
        correctAnswer = 2,
        explanation = "Das Challengertief im Marianengraben ist mit ca. 10.935 m (aktuellste Messung 2010) der tiefste bekannte Punkt des Weltozeans. Der Wasserdruck dort betraegt rund 1.086 bar.",
        difficulty = 3,
        funFact = "Im Challengertief wurden bereits Plastiktueten und Mikroplastik gefunden — ein Zeichen des menschlichen Einflusses selbst in der tiefsten Stelle des Ozeans."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'marine snow' (Meeresschnee) und welche oekologische Bedeutung hat es?",
        answerA = "Eiskristalle, die in polaren Meeren von der Wasseroberflaeche auf den Meeresboden sinken",
        answerB = "Herabsinkende organische Partikel aus abgestorbenen Organismen, die Tiefseeoekosysteme ernaehren",
        answerC = "Biolumineszente Partikelschichten, die bei Nacht Meeresleuchten erzeugen",
        answerD = "Sedimentfahnen durch unterseeische Vulkanasche",
        correctAnswer = 1,
        explanation = "Meeresschnee besteht aus abgestorbenen Plankton-Organismen, Kot-Pellets und organischen Aggregaten, die kontinuierlich in die Tiefsee sinken. Er ist die primaere Nahrungsquelle fuer die meisten Tiefseeoekosysteme und transportiert gebundenen Kohlenstoff in die Tiefsee.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher marine Organismus hat das groesste Genom aller bekannten lebenden Wesen?",
        answerA = "Blauer Blauwal (Balaenoptera musculus)",
        answerB = "Tiefseegarnele (Acanthephyra purpurea)",
        answerC = "Japanische Pfeilkalmarschwarm",
        answerD = "Sticheliger Seeigel (Echinoidea)",
        correctAnswer = 3,
        explanation = "Einige Seeigel-Arten (Echinoidea), insbesondere die Gattung Amphiura, haben extrem grosse Genome. Generell besitzen viele Stachelhaeuter ungewoehnlich grosse Genome. Der Genome-Rekord wird aber tatsaechlich von einer Susswasser-Pflanze gehalten.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie heisst der Prozess, durch den marine Schildkroeten ihren Geburtsort nach jahrzehntelanger Abwesenheit wiederfinden?",
        answerA = "Olfaktorische Heimkehrorientierung",
        answerB = "Magnetische Imprinting-Navigation",
        answerC = "Sonnenkompassen-Gezeiten-Kalibrierung",
        answerD = "Chemotaktische Meerwasserorientierung",
        correctAnswer = 1,
        explanation = "Marine Schildkroeten praegen sich unmittelbar nach dem Schluepfen das spezifische Erdmagnetfeld-Muster ihres Geburtsstandes ein (magnetisches Imprinting). Jahrzehnte spaeter nutzen sie dieses gespeicherte Magnetsignal, um exakt an den gleichen Strand zurueckzukehren.",
        difficulty = 3,
        funFact = "Karettschildkroeten kehren nach bis zu 30 Jahren Wanderung durch den Atlantik auf denselben Strand zurueck, auf dem sie schluepften — mit einer Genauigkeit von wenigen Kilometern."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Coriolis-Effekt' und wie beeinflusst er marine Stroemungssysteme?",
        answerA = "Er verursacht Tiefenstroemungen durch Temperaturdifferenzen zwischen Pole und Aequator",
        answerB = "Die Erdrotation ablenkt Stroemungen auf der Nordhalbkugel nach rechts und auf der Suedhalbkugel nach links",
        answerC = "Tidenkraefte erzeugen zyklische Stroemungsmuster in Tiefseebecken",
        answerD = "Mondgravitation erzeugt Gegenstroeme in Aequatorialen Oberflaechenschichten",
        correctAnswer = 1,
        explanation = "Der Coriolis-Effekt entsteht durch die Erdrotation und lenkt Stroemungen und Winde auf der Nordhalbkugel nach rechts, auf der Suedhalbkugel nach links ab. Er ist verantwortlich fuer die spiralfoermigen Meereswirbel (Gyre) und die Kreiselbewegung von Ozeanzirkulationen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Charakteristik macht Cephalopoden (Tintenfische) zu den intelligentesten wirbellosen Tieren im Meer?",
        answerA = "Ein komplexes Zentralnervensystem mit einem Gehirn-Koepergewicht-Verhaeltnis aehnlich dem von Vertebraten",
        answerB = "Ausgepraegte Echolokationsfaehigkeit zum Aufspueren von Beute in der Tiefsee",
        answerC = "Ein Immunsystem, das Erfahrungsgegenueber Parasiten speichert",
        answerD = "Gastrointestinale Ganglienzellen, die ein 'Darmgehirn' bilden",
        correctAnswer = 0,
        explanation = "Cephalopoden haben das groesste Gehirn aller Wirbellosen relativ zu ihrer Koerpergroesse. Oktopusse loesen komplexe Probleme, nutzen Werkzeuge und zeigen Lernfaehigkeit. Ihr Nervensystem umfasst etwa 500 Millionen Neurone.",
        difficulty = 3,
        funFact = "Zwei Drittel der Neurone eines Oktopus befinden sich in seinen Armen — jeder Arm kann halbautonome Entscheidungen treffen, unabhaengig vom zentralen Gehirn."
    ),

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet man als 'eutrophes Gewaesser' in der marinen Oekologie und welche Folgen hat es?",
        answerA = "Ein naehrstoffarmes, klares und artenreiches Tiefseegebiet",
        answerB = "Ein naehrstoffreiches Gewaesser mit erhoehteem Algenwachstum, das zu Sauerstoffmangel fuehren kann",
        answerC = "Eine durch Salzgehaltschwankungen charakterisierte Uebergangszone",
        answerD = "Ein durch thermische Schichtung abgeschlossenes Gewaessersegment",
        correctAnswer = 1,
        explanation = "Eutrophierung bezeichnet den Prozess der Naehrstoffanreicherung (Stickstoff, Phosphor) in einem Gewaesser. Exzessives Algenwachstum, Algenblueten und anschliessender Sauerstoffmangel durch Bakterienzersetrzung sind typische Folgen, die zum Fischsterben fuehren koennen.",
        difficulty = 3,
        funFact = "Die 'Tote Zone' im Golf von Mexiko, verursacht durch Duengemittelabfluss des Mississippi, ist eine der groessten anthropogenen Sauerstoffmangelzonen der Erde."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Merkmal unterscheidet Bartenwale (Mysticeti) von Zahnwalen (Odontoceti) anatomisch am deutlichsten?",
        answerA = "Bartenwale haben zwei Spritzloecher, Zahnwale nur eines",
        answerB = "Bartenwale haben keine Zaehne, sondern Barten aus Keratin zur Filterernaehrung",
        answerC = "Zahnwale kommunizieren per Ultraschall, Bartenwale per Infraschall unter Wasser",
        answerD = "Bartenwale besitzen ein Melonenorgan zur Echoortung",
        correctAnswer = 1,
        explanation = "Bartenwale (z.B. Blauwal, Buckelwal) haben statt Zaehnen Barten — hornige, parallele Platten aus Keratin, die als Filterapparat fuer Krill und kleine Fische dienen. Zahnwale (z.B. Delfine, Pottwale) behalten ihre Zaehne und jagen aktiv Beute.",
        difficulty = 3,
        funFact = "Der Blauwal filtert taeglich bis zu 40 Millionen Krill — etwa 3,6 Tonnen Nahrung — indem er riesige Wassermassen durch seine Barten presst."
    ),

    Question(
        categoryId = 9,
        questionText = "Welchen biochemischen Vorteil haben manche Tintenfischarten durch ihren blauen Blutfarbstoff Haemocyanin gegenueber dem roten Haemoglobin?",
        answerA = "Haemocyanin transportiert Sauerstoff bei niedrigen Temperaturen und niedrigem Sauerstoffpartialdruck effizienter",
        answerB = "Haemocyanin leitet elektrische Impulse und verbessert die Nervenkommunikation unter Hochdruck",
        answerC = "Haemocyanin bindet Schwermetalle und schuetzt vor Vergiftung durch Meeresgifte",
        answerD = "Haemocyanin speichert Stickstoff als Reserve fuer anaerobe Stoffwechselprozesse",
        correctAnswer = 0,
        explanation = "Haemocyanin ist ein kupferhaltiger Blutfarbstoff, der den Sauerstoff weniger stark bindet als Haemoglobin, ihn aber effizienter in kaltem Wasser und bei niedrigem O2-Partialdruck abgibt. Das macht ihn besonders vorteilhaft fuer Kaltwasserorganismen wie Kraken und Krebstiere.",
        difficulty = 3,
        funFact = "Das Blut von Tintenfischen ist tatseachlich blau — nicht durch Blaupigmente, sondern weil Haemocyanin im oxidierten Zustand blaues Licht reflektiert."
    ),

)
