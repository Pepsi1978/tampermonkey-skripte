package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsHard4(): List<Question> = listOf(

    // ── ENTOMOLOGIE (Insektenkunde) — 25 Fragen ──────────────────────────────

    Question(
        categoryId = 9,
        questionText = "Welches Enzym spaltet in der Honigbiene Saccharose zu Glucose und Fructose um?",
        answerA = "Amylase",
        answerB = "Lipase",
        answerC = "Invertase",
        answerD = "Protease",
        correctAnswer = 2,
        explanation = "Die Invertase (Saccharase) wird von den Hypopharynxdruesen der Biene sezerniert und hydrolysiert Saccharose zu Glucose und Fructose, was die Grundlage fuer die Honigreifung bildet.",
        difficulty = 3,
        funFact = "Eine Biene muss Nektar mehrfach aufnehmen und wieder abgeben, um den Wassergehalt von ca. 80 % auf unter 20 % zu senken."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie bezeichnet man die spezifische Koerperregion bei Ameisen, die das Metasoma vom Mesosoma trennt und fuer ihre schlanke Taille verantwortlich ist?",
        answerA = "Petiolus",
        answerB = "Scutellum",
        answerC = "Propodeum",
        answerD = "Gaster",
        correctAnswer = 0,
        explanation = "Der Petiolus (auch: Stielchen) ist ein stark eingeschnuertes Segment zwischen Mesosoma und Gaster. Er ermoeglicht der Ameise extreme Beweglichkeit beim Beissangriff.",
        difficulty = 3,
        funFact = "Bei manchen Ameisenarten wie Myrmecia hat der Petiolus zwei Segmente und wird dann als Postpetiolus bezeichnet."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Neurotransmitter wird durch das Gift der Schwarzen Witwe (Latrodectus) massiv ausgeschuettet, was zu anhaltenden Muskelkraempfen fuehrt?",
        answerA = "Dopamin",
        answerB = "Serotonin",
        answerC = "Acetylcholin",
        answerD = "Acetylcholin und Noradrenalin gleichzeitig",
        correctAnswer = 3,
        explanation = "Das alpha-Latrotoxin der Schwarzen Witwe bewirkt eine massive und unkontrollierte Ausschuettung von Acetylcholin und Noradrenalin an den Synapsen, was zu anhaltenden schmerzhaften Muskelkontraktionen fuehrt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Pheromon nutzt die europaeische Honigbiene (Apis mellifera) primaer als Alarmstoff bei Angriffen auf den Stock?",
        answerA = "9-ODA (9-Oxodec-2-ensaeure)",
        answerB = "Isoamylacetat",
        answerC = "Geraniol",
        answerD = "Farnesol",
        correctAnswer = 1,
        explanation = "Isoamylacetat (Isoamylacetat, auch Isopentylacetat) wird von den Wehrbienen aus der Nassanoff-Druse und der Giftstachel-Basis freigesetzt und loest Angriffs- und Alarmverhalten aus.",
        difficulty = 3,
        funFact = "Isoamylacetat riecht nach Bananen — deshalb sollten Imker keine Bananen in der Naehe eines Bienenstocks essen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man die besondere Form der Metamorphose bei Blaschenkaefer (Meloe), bei der die Larve aktiv nach einem Wirt sucht?",
        answerA = "Hemimetabolie",
        answerB = "Hypermetamorphose",
        answerC = "Paedogenese",
        answerD = "Neotenie",
        correctAnswer = 1,
        explanation = "Die Hypermetamorphose ist eine erweiterte Form der holometabolen Entwicklung, bei der auf eine aktive mobile Erstlarve (Triungulin) mehrere verschiedenartige Larvalstadien folgen, bevor die Verpuppung erfolgt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Substanz produziert der Bombardierkafer (Brachinus) in seiner Abwehrreaktion durch eine exotherme chemische Reaktion?",
        answerA = "Ameisensaeure",
        answerB = "Blausaeure",
        answerC = "Benzochinon",
        answerD = "Phenol",
        correctAnswer = 2,
        explanation = "Der Bombardierkafer mischt Hydrochinon und Wasserstoffperoxid in einer speziellen Reaktionskammer. Durch Enzyme (Katalasen und Peroxidasen) entsteht siedend heisses Benzochinon-Gas, das mit lautem Knall ausgestossen wird.",
        difficulty = 3,
        funFact = "Die Reaktionskammer erreicht dabei kurzzeitig annaehernd 100 Grad Celsius — der Kafer selbst bleibt unverletzt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man in der Entomologie unter dem Begriff 'Trophallaxis'?",
        answerA = "Saison-bedingte Wanderung von Insektenvolkern",
        answerB = "Wechselseitige Futteruebertragung zwischen Nestgenossen durch Mundkontakt",
        answerC = "Chemische Kommunikation ueber Spurpheromone",
        answerD = "Verteilung von Brutpflegepflichten in einem Insektenstaat",
        correctAnswer = 1,
        explanation = "Trophallaxis bezeichnet den oralen Futteraustausch zwischen Individuen einer Kolonie. Sie dient nicht nur der Nahrungsverteilung, sondern auch der Weitergabe von Pheromonen und dem sozialen Zusammenhalt.",
        difficulty = 3,
        funFact = "Bei Ameisen kann so ein einziger Futtertraeger den gesamten Stock mit einem Tropfen ernaehren — das Futter wird im Sozialmagen gespeichert und weitergegeben."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie lautet der Fachbegriff fuer die Faehigkeit bestimmter Insekten wie Stabheuschrecken, sich ohne Befruchtung fortzupflanzen?",
        answerA = "Hermaphroditismus",
        answerB = "Parthenogenese",
        answerC = "Polyembryonie",
        answerD = "Paedogenese",
        correctAnswer = 1,
        explanation = "Parthenogenese ist die Entwicklung eines neuen Individuums aus einer unbefruchteten Eizelle. Bei Stabheuschrecken (z. B. Carausius morosus) ist dies die Normalreproduktionsform — Maennchen sind extrem selten.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Funktion hat das Johnston-Organ bei Muecken (Culicidae)?",
        answerA = "Wahrnehmung von Luftfeuchtigkeit",
        answerB = "Detektion des Blutdrucks im Wirt",
        answerC = "Wahrnehmung von Flugelschlag-Frequenzen zur Partnerfindung",
        answerD = "Echolokation zur Hinderniserkennung",
        correctAnswer = 2,
        explanation = "Das Johnston-Organ sitzt im zweiten Fuehlerglied (Pedicellus) und registriert Schwingungen der Fuehlergeissel. Maennchen nutzen es zur Erkennung des artspezifischen Fluegelschlags (ca. 400-600 Hz) der Weibchen.",
        difficulty = 3,
        funFact = "Maennliche Muecken haben besonders buschige Antennen mit vielen Sensillen, um die Schwingungen besser aufzufangen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Kohlenwasserstoff bildet die Hauptkomponente der kutikulaeren Kohlenwasserstoffe, die Ameisen zur Nestmitglied-Erkennung nutzen?",
        answerA = "Pentadecan",
        answerB = "Nonacosan",
        answerC = "n-Hexadecan",
        answerD = "Tridecan",
        correctAnswer = 1,
        explanation = "Nonacosan (C29H60) und andere langkettige Kohlenwasserstoffe bilden den hauptsaechlichen Teil des Nestduftes bei vielen Ameisenarten. Das spezifische Gemisch erlaubt die Unterscheidung zwischen Nestgenossen und Fremden.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Bei welcher Kaeferart legen Weibchen ihre Eier ausschliesslich in die Ohrkanal-Bereiche von Grosssaeugetieren ab?",
        answerA = "Meloe proscarabaeus",
        answerB = "Onthophagus taurus",
        answerC = "Lucilia sericata",
        answerD = "Wohlfahrtia magnifica (eine Schmeissfliege, keine Kaeferart)",
        correctAnswer = 3,
        explanation = "Die Frage enthalt eine Falle: Wohlfahrtia magnifica ist eine Schmeissfliege (Diptera), keine Kaeferart. Tatsaechlich legt sie Larven in Koerperoeffnungen ab (obligate Myiasis). Unter den Kaefer-Antworten gibt es keine korrekte — die richtige Antwort D weist auf diesen Unterschied hin.",
        difficulty = 3,
        funFact = "Myiasis durch Wohlfahrtia kann bei Schafen und Rindern schwere Gewebeschaeden verursachen und ist in Suedosteuropa ein ernstes Tierschutzproblem."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche spezielle Druese produziert bei Termitenkoeniginnen das Pheromon, das die Reproduktion der Arbeiterinnen hemmt?",
        answerA = "Nasutus-Druese",
        answerB = "Royalsin-Druese",
        answerC = "Thorakale Exokrindruese",
        answerD = "Pygidialdruese",
        correctAnswer = 2,
        explanation = "Die thorakale Exokrindruese der Koenigin sezerniert Pheromone, die als 'queen inhibitory pheromones' die Ovarienentwicklung und Reproduktion der Arbeiterinnen unterdruecken.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Insekt gilt als Vektor der Chagas-Krankheit (Amerikanische Trypanosomiasis)?",
        answerA = "Anopheles gambiae",
        answerB = "Triatoma infestans (Raubwanze)",
        answerC = "Simulium damnosum (Kriebelmucke)",
        answerD = "Phlebotomus papatasi (Sandmucke)",
        correctAnswer = 1,
        explanation = "Triatoma infestans und andere Raubwanzen (Triatominae) sind die Hauptvektoren von Trypanosoma cruzi. Der Erreger wird nicht durch den Stich uebertragen, sondern durch die Faeces der Wanze, die der Wirt in die Stichwunde reibt.",
        difficulty = 3,
        funFact = "Carlos Chagas entdeckte 1909 als einziger Wissenschaftler gleichzeitig Erreger, Uebertraeger und Krankheit — ein einmaliges Ereignis in der Medizingeschichte."
    ),

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet der Begriff 'Subsozialitaet' in der Insektensozialbiologie?",
        answerA = "Leben in losen, temporaeren Gruppen ohne Kooperationsverhalten",
        answerB = "Elterliche Brutpflege ueber die Geburt hinaus, ohne overlapping generations",
        answerC = "Hochentwickelter Eusozialismus mit Kastensystem",
        answerD = "Kommunikation durch akustische Signale im Nest",
        correctAnswer = 1,
        explanation = "Subsozialitaet beschreibt eine Vorstufe des Eusozialismus: Eltern pflegen ihre Brut aktiv, aber Eltern- und Kindergeneration ueberlappen nicht dauerhaft. Es gibt noch keine Kastenteilung.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher physiologische Mechanismus ermoeglicht Eintagsfliegen-Larven (Ephemeroptera) die Atmung im Wasser?",
        answerA = "Hauttracheen ohne Stigmen (Tracheenkiemen)",
        answerB = "Bucco-pharyngeale Atmung",
        answerC = "Physikalische Kiemen (plastron)",
        answerD = "Rektale Kiemen",
        correctAnswer = 0,
        explanation = "Eintagsfliegen-Larven besitzen Tracheenkiemen: blattartige Anhaenge am Abdomen, die reich mit Tracheen durchzogen sind und Sauerstoff direkt aus dem Wasser aufnehmen koennen.",
        difficulty = 3,
        funFact = "Erwachsene Eintagsfliegen haben rueckgebildete Mundwerkzeuge und koennen nicht fressen — sie leben nur von den Energiereserven aus der Larvenphase."
    ),

    Question(
        categoryId = 9,
        questionText = "Bei der Honigbiene existieren drei Kastentypen. Welches genetische Merkmal unterscheidet Koeniginnenbiene und Arbeiterin trotz identischer DNA?",
        answerA = "Unterschiedliche mitochondriale DNA",
        answerB = "Epigenetische Modifikation durch Koeniginnenfuttersaft (Royal Jelly)",
        answerC = "Unterschiedliche Chromosomenzahl",
        answerD = "Unterschiedliche Aktivierung des Insulinrezeptor-Signalwegs",
        correctAnswer = 1,
        explanation = "Koeniginnen und Arbeiterinnen sind genetisch identisch. Royal Jelly aktiviert epigenetische Prozesse (z. B. DNA-Methylierung via DNMT3), die bei Larven, die ausschliesslich damit gefuettert werden, zur Koeniginnenentwicklung fuehren.",
        difficulty = 3,
        funFact = "Royal Jelly aktiviert den Insulin/IGF-Signalweg, der zu groesserem Koerper, aktiven Ovarien und laengerem Leben der Koenigin fuehrt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Klasse von Verbindungen sind die Hauptkomponenten des Giftes der Kegelkopfameise Dinoponera gigantea?",
        answerA = "Phospholipide",
        answerB = "Dinoponerins (Lipopeptide)",
        answerC = "Monoamine",
        answerD = "Alkaloid-Mischungen",
        correctAnswer = 1,
        explanation = "Das Gift von Dinoponera gigantea enthaelt vor allem Dinoponerins, eine Klasse von Lipopeptiden, die porenformend auf Zellmembranen wirken und starke haemolytische sowie antimikrobielle Aktivitaet zeigen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist der Unterschied zwischen einem 'aeromorphen' und einem 'poecilandren' Ameisenstaat?",
        answerA = "Aeromorph: nur Weibchen im Staat; Poecilander: nur Maennchen",
        answerB = "Aeromorph: ein Koenigintyp; Poecilander: verschiedenartige Maennchen-Morphen",
        answerC = "Aeromorph: geflugelte Koeniginnen; Poecilander: fluegellose Koeniginnen",
        answerD = "Aeromorph: Kolonie mit Soldatenkaste; Poecilander: Kolonie ohne Soldaten",
        correctAnswer = 1,
        explanation = "In poecilodren Ameisenstaaten gibt es mehrere morphologisch verschiedene Maennchen-Formen (z. B. gefluegelte und fluegellose Maennchen), waehrend aeromorphe Staaten nur einen Koeniginnentyp besitzen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Durch welchen Mechanismus orientieren sich Polarlichtkaefer (Lampyridae-Weibchen) praezise auf das Blinklichtsignal ihres Maennchens?",
        answerA = "Akustische Resonanz der Elytren",
        answerB = "Zeitgeber-gesteuertes Muster-Matching nach speziesspezifischer Blinkfrequenz",
        answerC = "UV-Reflexion der Fluegel",
        answerD = "Magnetorezeptions-gesteuerte Richtungsbestimmung",
        correctAnswer = 1,
        explanation = "Weibchen von Leuchtkaefern erkennen die artspezifische Kombination aus Blinkintervall, Blinkdauer und Flugmuster der Maennchen. Verschiedene Lampyris-Arten unterscheiden sich primaer durch das zeitliche Muster ihrer Signale.",
        difficulty = 3,
        funFact = "Die Biolumineszenz wird durch Luciferase-katalysierte Oxidation von Luciferin erzeugt — mit einem Wirkungsgrad von nahezu 100 %, waehrend eine Gluehbirne nur ca. 5 % Licht erzeugt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches ist das einzige bekannte Insekt, das mithilfe von Sonnenpolarisation auch nachts navigiert (mit Mondpolarisationslicht)?",
        answerA = "Apis mellifera (Honigbiene)",
        answerB = "Danaus plexippus (Monarchfalter)",
        answerC = "Scarabaeus satyrus (Mistkaefer)",
        answerD = "Formica rufa (Waldameise)",
        correctAnswer = 2,
        explanation = "Der suedafrikanische Mistkaefer Scarabaeus satyrus kann polarisiertes Mondlicht zur Orientierung nutzen und rollt seinen Dungball in einer geraden Linie, ohne dabei im Kreis zu laufen.",
        difficulty = 3,
        funFact = "Bei bedecktem Himmel orientiert sich Scarabaeus satyrus an der Milchstrasse — der erste bekannte Fall eines Tiers, das dazu faehig ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Gift enthaelt die Feuerameise Solenopsis invicta als Hauptwirkstoff?",
        answerA = "Formicinol",
        answerB = "Solenopsin (Piperidinalkaloid)",
        answerC = "Ponericin",
        answerD = "Myrmicacin",
        correctAnswer = 1,
        explanation = "Solenopsine sind Piperidin-Alkaloide, die im Gift von Solenopsis invicta dominieren. Sie wirken zytotoxisch, haemolytisch und antibiotisch. Das brennende Gefuehl beim Stich entsteht durch ihre lipophile Membranwirkung.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'Allometrie' im Kontext von Ameisensoldaten?",
        answerA = "Gleichmaessiges Koerperwachstum aller Kastentypen",
        answerB = "Unverhaltnis-maessig grosses Wachstum bestimmter Koerperteile (z. B. Mandibeln) gegenueber dem Koerper",
        answerC = "Hormonell bedingte Saisonalitaet der Koerpermasse",
        answerD = "Kein Wachstum nach der Haeutung",
        correctAnswer = 1,
        explanation = "Bei Ameisenmajorinnen (Supersoldaten) wachsen Kopf und Mandibeln ueberproporzional zum Koerper. Diese allometrische Skalierung erzeugt eine Kaste, die sich speziell fuer die Nestverteidigung eignet.",
        difficulty = 3,
        funFact = "Bei Pheidole pallidula-Supersoldaten sind Kopf und Mandibeln so gross, dass die Tiere kaum selbststaendig fressen koennen und von Arbeiterinnen versorgt werden muessen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Peptid im Gift der Japanischen Hornisse (Vespa mandarinia) loest eine starke Mastzell-Degranulation aus?",
        answerA = "Mastoparan",
        answerB = "Melittin",
        answerC = "Phospholipase A2",
        answerD = "Apamin",
        correctAnswer = 0,
        explanation = "Mastoparan ist ein amphiphiles Peptid aus dem Gift verschiedener Wespenarten, darunter Vespa mandarinia. Es aktiviert G-Proteine direkt und loest massiv Mastzell-Degranulation und Histaminfreisetzung aus.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche biologische Erscheinung beschreibt die 'Brood Parasitism' bei Schmarotzerhummeln (Psithyrus-Arten)?",
        answerA = "Hummeln, die Blutlaeuse von anderen Tieren fressen",
        answerB = "Weibchen, die Nester anderer Hummelarten uebernehmen und deren Arbeiterinnen fuer die Aufzucht eigener Brut nutzen",
        answerC = "Parasitierung der Hummeln durch Milben (Varroa)",
        answerD = "Massensterben von Hummelkoeniginnen durch Parasiten im Winter",
        correctAnswer = 1,
        explanation = "Schmarotzerhummeln (heute als Bombus-Untergattung betrachtet) toeten die Wirtskoenigin oder verdraengen sie und legen eigene Eier. Die Arbeiterinnen des Wirts pflegen dann die Schmarotzerbrut.",
        difficulty = 3,
        funFact = "Psithyrus-Weibchen haben kein Koerbchen (Corbiculum) an den Hinterbeinen, da sie selbst keine Pollen sammeln — ein klares morphologisches Merkmal des Sozialparasitismus."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Segment des Insektenfluegels ist bei Zweiflueglern (Diptera) zu einem Halteren (Schwingkoelbchen) reduziert?",
        answerA = "Der erste Fluegelansatz (Vorderfluegel)",
        answerB = "Das dritte Brustsegment-Paar (Hinterfluegel)",
        answerC = "Die Basalarterien des zweiten Fluegelpaares",
        answerD = "Das Scutellum-Exoskelett",
        correctAnswer = 1,
        explanation = "Bei Diptera (Fliegen, Muecken) sind die Hinterfluegel (Metathorax-Fluegel) zu Halteren umgebildet. Diese schwingen synchron zu den Vorderfluegeln und fungieren als Gyrosensoren fuer die Flugstabilisierung.",
        difficulty = 3,
        funFact = "Wird einem Insekt ein Halter entfernt, verliert es die Faehigkeit, stabil zu fliegen und dreht sich unkontrolliert um die Laengsachse."
    ),

    // ── HERPETOLOGIE (Reptilien und Amphibien) — 25 Fragen ───────────────────

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus ermoeglicht der Lederschildkroete (Dermochelys coriacea) das Ueberleben in kalten Gewaessern, obwohl sie wechselwarm ist?",
        answerA = "Regionale Endothermie durch Gegenstrom-Waermeaustausch",
        answerB = "Saisonal erhoehte Schilddruesen-Hormonproduktion",
        answerC = "Braunes Fettgewebe aehnlich wie bei Saeugetieren",
        answerD = "Vasokonstriktion aller peripheren Blutgefaesse",
        correctAnswer = 0,
        explanation = "Die Lederschildkroete besitzt ein Retia mirabilia (Gegenstrom-Waermetauscher-System) in Flossen und Blutzirkulation. Arterielle Waerme wird auf venoezes Blut uebertragen und haelt die Koerpertemperatur deutlich ueber der Wassertemperatur.",
        difficulty = 3,
        funFact = "Dermochelys coriacea kann in 4 Grad Celsius kaltem Wasser ueberleben und taucht bis zu 1.200 Meter tief."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Gift-Peptid ist die Hauptkomponente im Sekret der suedamerikanischen Pfeilgiftfroschart Phyllobates terribilis?",
        answerA = "Epibatidin",
        answerB = "Batrachotoxin",
        answerC = "Pumiliotoxin",
        answerD = "Dendrobatin",
        correctAnswer = 1,
        explanation = "Batrachotoxin (BTX) ist ein steroidal-alkaloides Neurotoxin und blockiert spannungsgesteuerte Natriumkanaele in der offenen Stellung. Phyllobates terribilis ist der giftigste Wirbeltier der Erde — ein einziger Frosch enthaelt genug Gift, um 10 Menschen zu toeten.",
        difficulty = 3,
        funFact = "Batrachotoxin wird nicht vom Frosch selbst produziert, sondern aus Kaefern der Gattung Choresine aufgenommen, die der Frosch frisst."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das 'Jacobson-Organ' bei Schlangen und welche Sinnesmodalitaet nimmt es wahr?",
        answerA = "Infrarot-Gruben fuer Waermewahrnehmung",
        answerB = "Vomeronasalorgan fuer chemische Geruchsstoffe (Chemorezeption)",
        answerC = "Haerchen-bestetztes Tympanum fuer akustische Schwingungen",
        answerD = "Druckrezeptoren an der Kiefer-Unterseite",
        correctAnswer = 1,
        explanation = "Das Jacobson-Organ (Organon vomeronasale) liegt im Gaumen und ist mit dem olfaktorischen System verbunden. Die Zunge transportiert Duftstoffpartikel zum Organ, das chemische Reize verarbeitet — wichtig fuer Beuteverfolgung und Partnersuche.",
        difficulty = 3,
        funFact = "Schlangen haben kein Trommelfell — sie nehmen Schall ueber Bodenvibration wahr, die ueber Kieferknochen ins Innenohr geleitet wird."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher anatomische Unterschied kennzeichnet die Ordnung Gymnophiona (Blindwuehlen) gegenueber anderen Amphibien?",
        answerA = "Vollstaendig verknocherte Wirbelsaeule ohne Rippen",
        answerB = "Beinslosigkeit, annelide Koerperringelung und spezialisierte tentakelartige Sinnesorgane",
        answerC = "Vier funktionale Gliedmassen mit rudimentaeren Zehenansaetzen",
        answerD = "Aussenkiemen im Adultstadium",
        correctAnswer = 1,
        explanation = "Gymnophionen sind beinlose Amphibien mit ringformig segmentiertem Koerper (Annulae). Einzigartig sind tentakelartige Sinnesorgane zwischen Auge und Nase fuer Chemorezetion. Sie leben meist fossorial (unterirdisch).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Durch welche Evolution entwickelte sich die Giftapparatur der Grubenottern (Crotalinae) von der ihrer Vorfahren?",
        answerA = "Aus modifizierten Zungenspitzen-Druesen",
        answerB = "Aus modifizierten Speicheldruesen (Parotiden) mit progressiver Zahnspezialisierung zu Solenoglyphen",
        answerC = "Als vollig neue Organstruktur ohne Vorlaeufer",
        answerD = "Aus Schweissdruesen der Haut am Kopf",
        correctAnswer = 1,
        explanation = "Die Giftdruesen der Schlangen sind evolutiv aus den Parotiden (Ohrspeicheldruesen) entstanden. Bei Grubenottern (Solenoglyphen) sind die Fangzaehne hohl und kanalfuehrend, aus urspruenglich furchentragenden Opisthoglyphen entwickelt.",
        difficulty = 3,
        funFact = "Grubenottern koennen ihre Hohlfangzaehne einklappen — das Fangzahnpaar dreht sich beim Schluss um ca. 90 Grad nach hinten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher spezifische Ionenkanal-Typ wird durch das Conotoxin von Kegelschnecken (Conus geographus) blockiert, das auch fuer Menschen letal sein kann?",
        answerA = "Spannungsgesteuerte Kaliumkanaele",
        answerB = "Spannungsgesteuerte Natriumkanaele (Nav1.x)",
        answerC = "NMDA-Glutamatrezeptoren",
        answerD = "Nikotinische Acetylcholin-Rezeptoren",
        correctAnswer = 1,
        explanation = "Conotoxine von Conus geographus blockieren primaer spannungsgesteuerte Natriumkanaele (mu-Conotoxine), Calciumkanaele (omega-Conotoxine) und Acetylcholinrezeptoren. Die Kombination fuehrt zu Atemlahmung und Herzstillstand.",
        difficulty = 3,
        funFact = "Aus Conotoxinen wurde das Schmerzmittel Ziconotid (Prialt) entwickelt, das 1000x staerker als Morphin wirkt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was macht die Fortpflanzungsbiologie des Surinam-Wabenkroete (Pipa pipa) so aussergewoehnlich?",
        answerA = "Lebendgeburt aller Jungtiere durch Plazenta",
        answerB = "Entwicklung der Eier eingebettet in der Rueckenhaut des Weibchens bis zum fertigen Jungtier",
        answerC = "Externe Befruchtung durch Wassereinleitung von Fremdmaennchen",
        answerD = "Hermaphroditismus mit selbstbefruchtenden Weibchen",
        correctAnswer = 1,
        explanation = "Bei Pipa pipa drueckt das Maennchen die befruchteten Eier in die aufgequollene Rueckenhaut des Weibchens. Dort entwickeln sich die Tiere in Hudertauschen eingebetteter Einzel-Kammern direkt zu kleinen Froeschen, die dann durch die Haut brechen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Protein im Blut der Gila-Krustenechse (Heloderma suspectum) wirkt als Vorbild fuer das Diabetes-Typ-2-Medikament Exenatide?",
        answerA = "Gilatoxin-A",
        answerB = "Exendin-4 (GLP-1-Agonist)",
        answerC = "Helodermatin",
        answerD = "Gilatide",
        correctAnswer = 1,
        explanation = "Exendin-4 aus dem Speichel von Heloderma suspectum ist ein Agonist des GLP-1-Rezeptors und stimuliert insulinabhaengig die Insulinsekretion. Das synthetische Analogon Exenatide (Byetta) ist ein zugelassenes Antidiabetikum.",
        difficulty = 3,
        funFact = "Heloderma suspectum ist neben H. horridum eine der wenigen Echsenarten mit verifizierter Giftigkeit — jahrzehntelang wurde ihre Giftigkeit von der Wissenschaft bezweifelt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche einzigartige Anpassung besitzt die Mata-Mata-Schildkroete (Chelus fimbriata) zur Beutejagd?",
        answerA = "Aktive Verfolgungsjagd mit hoher Schwimmgeschwindigkeit",
        answerB = "Sog-Jagd: Riesiges Maul wird schlagartig geoeffnet und Wasser mit Beute eingesaugt",
        answerC = "Elektrische Organe zur Betaeubung von Fischen",
        answerD = "Giftdruesen an der Unterkieferinnenseite",
        correctAnswer = 1,
        explanation = "Die Mata-Mata jagt durch Saugfang (gape-and-suck): Mit einer schnellen Maul-Oeffnung entsteht ein Unterdruck, der Wasser und Beute einsaugt. Die Geschwindigkeit dieser Bewegung betraegt Millisekunden.",
        difficulty = 3,
        funFact = "Die Mata-Mata sieht aus wie ein Haufen fauler Blatter — Hautzipfel, plattkopfige Form und braun-graue Farbe tarnen sie perfekt auf dem Flussbett."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Rezeptortyp in den Grubenorganen von Pythons (Pythonidae) ermoeglicht die Infrarot-Wahrnehmung?",
        answerA = "TRPA1-Ionenkanaele",
        answerB = "Rhodopsin-ahnliche Opsine",
        answerC = "Mechanosensitive Druckrezeptoren",
        answerD = "Thermoelektrische Organe (Seebeck-Effekt)",
        correctAnswer = 0,
        explanation = "Die Labialpits (Grubenorgane) von Pythons enthalten eine extrem duenne Membran mit TRPA1-Ionenkanaelen, die auf minimale Temperaturveraenderungen durch Infrarotstrahlung reagieren. Die Auflosung liegt bei ca. 0,003 Grad Celsius.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die biologische Bedeutung der 'aposematischen Faerbung' beim Feuersalamander (Salamandra salamandra)?",
        answerA = "Balzfaerbung zur Anlockung von Weibchen",
        answerB = "Warnfaerbung fuer Praedatoren: signalisiert Giftigkeit",
        answerC = "Krypsis zur Tarnung im Laubwald",
        answerD = "UV-Reflexion zur Waermeaufnahme",
        correctAnswer = 1,
        explanation = "Die gelb-schwarze Faerbung des Feuersalamanders ist klassische Aposematismus. Haut-Parotoidendruesen sezernieren Samandarin-Alkaloide, die Praedatoren abschrecken. Das Muster verknuepft visuelle Information mit negativer Erfahrung.",
        difficulty = 3,
        funFact = "Samandarin ist ein Steroid-Alkaloid, das Natriumkanaele blockiert und bei Saeugetieren Krampfanfaelle verursacht."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher phylogenetische Begriff beschreibt die gemeinsame Abstammung aller Reptilien und Voegel von einem gemeinsamen Vorfahren?",
        answerA = "Reptilia (paraphyletische Gruppe)",
        answerB = "Sauropsida (monoparaphyletische Gruppe)",
        answerC = "Amniota (einschliesslich Saeugetiere)",
        answerD = "Diapsida (alle Reptilien mit zwei Schlaefenfenstern)",
        correctAnswer = 1,
        explanation = "Sauropsida ist der kladistische Begriff fuer alle Amnioten ausser Saeugetieren — also Reptilien (Squamata, Testudines, Crocodylia, Sphenodon) und Voegel (Aves). Diese Gruppe ist monoparaphyletisch.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Schlangengattung gilt als die giftigste landlebende Schlange der Welt, gemessen am subkutanen LD50-Wert?",
        answerA = "Oxyuranus microlepidotus (Inlandtaipan)",
        answerB = "Bitis gabonica (Gabunviper)",
        answerC = "Hydrophis platurus (Gelbbauchseeschlange)",
        answerD = "Naja ashei (Mohren-Kobra)",
        correctAnswer = 0,
        explanation = "Oxyuranus microlepidotus (Inlandtaipan, Fierce Snake) hat mit einem subkutanen LD50 von ca. 0,025 mg/kg bei Maeusen das starkste bekannte Schlanengift. Ihr Gift ist ca. 50x toxischer als das der Koenigskobra.",
        difficulty = 3,
        funFact = "Trotz ihres extrem wirksamen Gifts ist die Inlandtaipan fuer Menschen kaum gefaehrlich, da sie in extrem abgelegenen Gebieten Zentralaustraliens lebt und sehr scheues Verhalten zeigt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Caudal Autotomie' und durch welchen anatomischen Mechanismus wird sie bei Eidechsen ermoeglicht?",
        answerA = "Aktive Beisskraft auf den Schwanz durch den Besitzer, um Praedatoren zu erschrecken",
        answerB = "Selbststaendiges Abwerfen des Schwanzes durch vorgeformte Bruchstellen (Frakturplanen) in den Wirbelkoerpern",
        answerC = "Schwanzamputation durch Giftdruesen-Sekretion an der Schwanzbasis",
        answerD = "Regeneration des Schwanzes durch Stammzellen ohne Abwerfen",
        correctAnswer = 1,
        explanation = "Caudal Autotomie wird durch spezielle Frakturplanen (fracture planes) innerhalb einzelner Wirbelkoerper ermoeglicht. Muskeln koennen an diesen Sollbruchstellen kontrahieren und den Schwanz abwerfen, waehrend Blutgefaesse sich sofort verschliessen.",
        difficulty = 3,
        funFact = "Der abgeworfene Schwanz zuckt noch Minuten lang weiter und lenkt so den Praedator ab, waehrend die Eidechse fliehen kann."
    ),

    Question(
        categoryId = 9,
        questionText = "Welchen einzigartigen Reproduktionsmechanismus besitzt der Komodowarane (Varanus komodoensis)?",
        answerA = "Lebendgeburt durch Plazentaverbindung",
        answerB = "Parthenogenese (Jungfernzeugung) — Weibchen koennen ohne Maennchen Nachwuchs zeugen",
        answerC = "Hermaphroditismus mit saisonalem Geschlechtswechsel",
        answerD = "Externe Befruchtung durch Wassereinleitung",
        correctAnswer = 1,
        explanation = "Komodowarane sind zur Parthenogenese faehig (nachgewiesen im Zoo). Dabei entstehen durch automikte Parthenogenese nur haploide Tiere, die anschliessend diploide Nachkommen erzeugen koennen. Die Nachwuchs-Maennchen koennen sich dann mit der Mutter paaren.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher chemische Komplex ist das primaere Neurotoxin im Gift der Mambas (Dendroaspis) und welchen Rezeptor blockiert er?",
        answerA = "Fasciculin — hemmt Acetylcholinesterase",
        answerB = "Calciseptin — blockiert L-Typ Calciumkanaele",
        answerC = "Dendrotoxin — blockiert Kaliumkanaele",
        answerD = "Mambarin — stimuliert muskarinische Acetylcholinrezeptoren",
        correctAnswer = 2,
        explanation = "Dendrotoxine sind die charakteristischen Neurotoxine der Mambas. Sie blockieren spannungsgesteuerte Kaliumkanaele (Kv1.1, Kv1.2, Kv1.6) und verhindern so die Repolarisation nach Aktionspotentialen, was zu unkontrollierter neuronaler Erregung fuehrt.",
        difficulty = 3,
        funFact = "Dendrotoxine wurden als Forschungswerkzeuge wertvoll, um Kaliumkanal-Subtypen zu identifizieren und ihre Funktion zu verstehen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt die 'Bergmann'sche Regel' in Bezug auf Ectothermen wie Reptilien?",
        answerA = "Innerhalb einer Art haben Individuen in kaelterem Klima eine groessere Koerpermasse",
        answerB = "Ectotherme in heisseren Regionen sind stets kleiner als verwandte Arten in kaelteren Zonen",
        answerC = "Bei Ectothermen gilt die Regel in umgekehrter Richtung: Kleinere Tiere in kaelterem Klima",
        answerD = "Die Bergmann-Regel gilt nicht fuer Ectotherme",
        correctAnswer = 2,
        explanation = "Bei Ectothermen (Reptilien, Amphibien) gilt die 'umgekehrte Bergmann-Regel' (Converse Bergmann Rule): Individuen in waermeren Klimaten sind haeufig groesser, da Waerme Wachstum und Metabolismus foerdert. Dies ist das Gegenteil zum Muster bei Endothermen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche morphologische Struktur des Chamaeleo calyptratus (Jemenchamaeleo) dient zur sozialen Signalisation und Temperaturregulation?",
        answerA = "Parietal-Augenhecker (drittes Auge)",
        answerB = "Casque (Helmaufsatz am Scheitelbein)",
        answerC = "Kehlfahne (Dewlap)",
        answerD = "Dorsale Segel-Membrane",
        correctAnswer = 1,
        explanation = "Der Casque (Helmaufsatz) des Jemenchamaeleons dient als Hautthermoregulator: Das gefaessreiche Gewebe kann Waerme schnell aufnehmen und abgeben. Er spielt auch eine Rolle bei der sozialen Erkennung von Geschlecht und Reife.",
        difficulty = 3,
        funFact = "Jemenchamaeloens sind eine der wenigen Echsenarten, die pflanzliche Nahrung aktiv bevorzugen — sie fressen Blatter, Bluten und Fruechte zusaetzlich zu Insekten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Schildkroetenart ist durch ihre Faehigkeit zur kutanen Atmung bekannt, die ihr langen Aufenthalt unter Wasser im Winter ermoeglicht?",
        answerA = "Caretta caretta (Unechte Karettschildkroete)",
        answerB = "Chrysemys picta (Schmuckschildkroete)",
        answerC = "Trachemys scripta (Buchstaben-Schmuckschildkroete)",
        answerD = "Sternotherus odoratus (Moschusschildkroete)",
        correctAnswer = 1,
        explanation = "Chrysemys picta kann in eisbedeckten Teichen uberwintern, indem sie Sauerstoff ueber speziell vaskularisierte Hautstellen und kloakale Bursae aus dem Wasser aufnimmt. Bei 3-4 Grad Celsius ist der O2-Bedarf so gering, dass diese kutane Atmung genuegt.",
        difficulty = 3,
        funFact = "Chrysemys picta kann im Zustand der Winterstarre (Brumation) bis zu 5 Monate ohne Auftauchen ueberleben."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche physiologische Besonderheit erlaubt dem Axolotl (Ambystoma mexicanum) das permanente Verbleiben im Larvenstadium?",
        answerA = "Genetische Mutation der Schilddruse",
        answerB = "Neotenie: Schilddruse produziert kein Thyroxin, da fehlendes Umwelt-Signal ausbleibt",
        answerC = "Artificielle Hemmung der Metamorphosegene durch Parasitenbefall",
        answerD = "Fehlende Hypophyse (Pituitary gland)",
        correctAnswer = 1,
        explanation = "Axolotl zeigen Neotenie: Sie behalten Larvenmerkmale (Aussenkiemen, Flossensaum) dauerhaft. Der Grund ist, dass die Schilddruse auf externe Jodquelle oder TRH-Signal reagiert — in der natruerlichen Umgebung fehlt das Signal. Exogenes Thyroxin loest Metamorphose aus.",
        difficulty = 3,
        funFact = "Axolotl koennen Gliedmassen, Herz-, Lungen- und sogar Teile des Gehirns vollstaendig regenerieren — ein intensiv erforschtes Regenerationsmodell."
    ),

    Question(
        categoryId = 9,
        questionText = "Durch welches Gift-Typ wirkt das Neurotoxin der Gabunviper (Bitis gabonica) primaer?",
        answerA = "Praesynaptisches Neurotoxin (Phospholipase A2 blockiert Acetylcholin-Freisetzung)",
        answerB = "Cytotoxisch und haemotoxisch: Phospholipase, Hyaluronidase, Serinproteasen",
        answerC = "Postsynaptisches Neurotoxin (blockiert nikotinische AChR)",
        answerD = "Rein haemolytisch ohne Gewebezerstoerung",
        correctAnswer = 1,
        explanation = "Das Gift der Gabunviper ist primaer zytotoxisch und haemotoxisch: Phospholipase A2 zerstoert Zellmembranen, Serinproteasen stoeren die Blutgerinnung, Hyaluronidase erleichtert die Giftausbreitung im Gewebe. Massive Nekrosen und DIC sind typische Folgen.",
        difficulty = 3,
        funFact = "Die Gabunviper hat die laengsten Fangzaehne aller Schlangen — bis zu 5 cm Laenge bei grossen Exemplaren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Begriff bezeichnet das Phaenomen, dass manche Kroetenarten (z. B. Rhinella marina) ihr Gift durch Parotoidendruesen aktiv abgeben koennen?",
        answerA = "Venomous (aktive Giftinjektions-Apparatur)",
        answerB = "Poisonous (passives Giftgewebe ohne Injektionsorgan)",
        answerC = "Toxiferous (transportiert Gift ohne es zu produzieren)",
        answerD = "Toxinogenic (produziert Giftstoffe ohne sie abzugeben)",
        correctAnswer = 1,
        explanation = "Kroetenarten wie Rhinella marina sind 'poisonous', nicht 'venomous': Sie besitzen kein aktives Injektionssystem, sondern passive Hautgiftdruesen. Das Gift (Bufadienolide, Biogene Amine) wird nur freigesetzt, wenn die Kroete gebissen oder gedrueckt wird.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches ist das einzige europaeische Reptil, das als echter Viviparer (Lebendgebaerender) bekannt ist und keine Eier ablegt?",
        answerA = "Lacerta agilis (Zauneidechse)",
        answerB = "Anguis fragilis (Blindschleiche)",
        answerC = "Vipera berus (Kreuzotter)",
        answerD = "Coronella austriaca (Schlingnatter)",
        correctAnswer = 2,
        explanation = "Vipera berus ist ovovivipar/vivipar: Die Jungen entwickeln sich in einer duennen Membran im Mutterleib und werden als fertige kleine Schlangen geboren. Dies ist eine Anpassung an das kuehlere Klima Nordeuropas, wo Eier im Boden oft nicht genug Waerme bekommen wuerden.",
        difficulty = 3,
        funFact = "Die Kreuzotter ist die einzige Schlange, die noerdlich des Polarkreises vorkommt — ein Beleg fuer den evolutionaeren Vorteil der Viviparie in kalten Klimaten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Sinnesorgan nutzt Chelonia mydas (Gruene Meeresschildkroete) zur magnetischen Navigation ueber Tausende von Kilometern?",
        answerA = "Optiksystem mit speziellen UV-Fotorezeptoren",
        answerB = "Magnetorezeptoren im Innenohr mit Magnetit-Kristallen",
        answerC = "Seitenliniensystem analog zu Fischen",
        answerD = "Lateral-organ am Scheitelbein",
        correctAnswer = 1,
        explanation = "Gruene Meeresschildkroeten besitzen Magnetorezeptoren, die wahrscheinlich auf Magnetit-Kristallen in den Haarzellen des Innenohrs beruhen. Sie koennen Magnetfeldstaerke und -inklination messen und so ihren Standort auf dem Ozean bestimmen.",
        difficulty = 3,
        funFact = "Chelonia mydas kehrt zum Strand zurueck, an dem sie geschluepft ist, um selbst Eier zu legen — selbst wenn dieser Strand tausende Kilometer entfernt liegt."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist 'Protandrie' und bei welcher Reptiliengruppe ist dieses Reproduktionsverhalten besonders relevant?",
        answerA = "Geschlechtswechsel von weiblich zu maennlich; relevant bei Chamaeloens",
        answerB = "Maennchen erreichen Geschlechtsreife frueher als Weibchen derselben Art; relevant bei vielen Eidechsenarten",
        answerC = "Gleichzeitiger Hermaphroditismus; relevant bei Schildkroeten",
        answerD = "Saisonale Hormonschwankungen, die Maennchen fuer Brunstsaison vorbereiten",
        correctAnswer = 1,
        explanation = "Protandrie bezeichnet den Zustand, in dem Maennchen innerhalb einer Art frueher geschlechtsreif werden als Weibchen. Dies ist bei vielen Lacertiden (Eidechsen) bekannt und fuehrt dazu, dass Maennchen laengere Zeit zur Konkurrenz bereitstehen.",
        difficulty = 3,
        funFact = null
    )

)
