package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun animalQuestionsHard2(): List<Question> = listOf(

    Question(
        categoryId = 9,
        questionText = "Wie lautet der wissenschaftliche Name des Sumatranischen Tigers?",
        answerA = "Panthera tigris altaica",
        answerB = "Panthera tigris corbetti",
        answerC = "Panthera tigris sumatrae",
        answerD = "Panthera tigris tigris",
        correctAnswer = 2,
        explanation = "Der Sumatranische Tiger traegt den wissenschaftlichen Namen Panthera tigris sumatrae. Er ist die kleinste lebende Unterart des Tigers und gilt als vom Aussterben bedroht (IUCN: CR).",
        difficulty = 3,
        funFact = "Weltweit leben noch weniger als 400 Sumatranische Tiger in freier Wildbahn."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie lang ist die Tragzeit des Afrikanischen Elefanten (Loxodonta africana) durchschnittlich?",
        answerA = "12 Monate",
        answerB = "18 Monate",
        answerC = "22 Monate",
        answerD = "26 Monate",
        correctAnswer = 2,
        explanation = "Die Tragzeit des Afrikanischen Elefanten betraegt durchschnittlich 22 Monate (ca. 645 Tage) und ist damit die laengste aller Landtiere.",
        difficulty = 3,
        funFact = "Elefantenkalb wiegen bei der Geburt bereits etwa 100 Kilogramm."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Hormon ist hauptsaechlich fuer die Einleitung der Milchproduktion bei Saeugern nach der Geburt verantwortlich?",
        answerA = "Oxytocin",
        answerB = "Prolaktin",
        answerC = "Progesteron",
        answerD = "Oestradiol",
        correctAnswer = 1,
        explanation = "Prolaktin, ausgeschuettet vom Hypophysenvorderlappen, stimuliert die Milchproduktion (Laktogenese) in den Brustdruesen nach der Geburt. Oxytocin ist fuer den Milchejektionsreflex zustaendig.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet der Begriff 'Diapause' in der Saeugetierreproduktion?",
        answerA = "Die Ruhephase des Herzens zwischen zwei Schlaegen",
        answerB = "Die verzoegerte Einnistung eines Embryos in die Gebaermutter",
        answerC = "Den Winterschlaf von Saeugetieren",
        answerD = "Die Pause zwischen zwei Wurfzyklen",
        correctAnswer = 1,
        explanation = "Embryonale Diapause (oder verzogerte Implantation) beschreibt das Phaenomen, bei dem sich ein befruchtetes Ei als Blastozyste im Ruhezustand befindet, bevor es sich in die Gebarmutter einnistet. Dies kommt bei ueber 100 Saeugetierarten vor, z.B. beim Europaeischen Reh.",
        difficulty = 3,
        funFact = "Beim Europaeischen Reh kann die Diapause bis zu 5 Monate dauern, obwohl die eigentliche Entwicklungszeit nur 5 Monate betraegt."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher IUCN-Gefaehrdungsstatus gilt fuer das Spitzmaulnashorn (Diceros bicornis)?",
        answerA = "Gefaehrdet (VU)",
        answerB = "Stark gefaehrdet (EN)",
        answerC = "Vom Aussterben bedroht (CR)",
        answerD = "Nicht gefaehrdet (LC)",
        correctAnswer = 2,
        explanation = "Das Spitzmaulnashorn (Diceros bicornis) wird von der IUCN als 'Vom Aussterben bedroht' (Critically Endangered, CR) eingestuft. Die Weltpopulation belaeuft sich auf etwa 5.600 Individuen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Saeugetier hat den hoechsten bekannten Stoffwechselumsatz pro Koerpergewicht?",
        answerA = "Hausspitzmaus (Sorex araneus)",
        answerB = "Zwergspitzmaus (Sorex minutus)",
        answerC = "Etruskerspitzmaus (Suncus etruscus)",
        answerD = "Streifenhornchen (Tamias striatus)",
        correctAnswer = 2,
        explanation = "Die Etruskerspitzmaus (Suncus etruscus), mit etwa 1,8 g eines der kleinsten Saeugetiere der Welt, hat den hoechsten Stoffwechselumsatz relativ zum Koerpergewicht und muss stetis fressen, um zu ueberleben.",
        difficulty = 3,
        funFact = "Das Herz der Etruskerspitzmaus schlaegt bis zu 1.500 Mal pro Minute."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Ordnung umfasst Fledermaeuse in der wissenschaftlichen Klassifikation?",
        answerA = "Insectivora",
        answerB = "Dermoptera",
        answerC = "Chiroptera",
        answerD = "Scandentia",
        correctAnswer = 2,
        explanation = "Fledermaeuse gehoeren zur Ordnung Chiroptera (griech.: cheir = Hand, pteron = Fluegel). Sie sind die einzigen Saeugetiere, die aktiv fliegen koennen, und machen etwa 20% aller Saeugetierarten aus.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie viele Chromosomenpaare hat der Hausigel (Erinaceus europaeus)?",
        answerA = "23 Paare",
        answerB = "44 Paare",
        answerC = "46 Paare",
        answerD = "48 Paare",
        correctAnswer = 0,
        explanation = "Der Hausigel (Erinaceus europaeus) besitzt 23 Chromosomenpaare, also einen diploiden Chromosomensatz von 2n=46 Chromosomen. Damit hat er zunaechst die gleiche Anzahl wie der Mensch, aber andere Chromosomenmorphologien.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das primaere Funktionsmerkmal des Jacobsonschen Organs (Vomeronasalorgan) bei Saeugetieren?",
        answerA = "Richtungshoeren durch akustische Lokalisation",
        answerB = "Detektion von Pheromonen und chemischen Signalstoffen",
        answerC = "Magnetfeldwahrnehmung zur Navigation",
        answerD = "Infrarotwahrnehmung zur Beutejagd",
        correctAnswer = 1,
        explanation = "Das Vomeronasalorgan (Jacobsonsches Organ) ist ein akzessorisches Riechorgan, das speziell nicht-fluechtige Chemikalien wie Pheromone detektiert und so das Sozial- und Fortpflanzungsverhalten beeinflusst. Es ist bei vielen Saeugetieren funktionell, beim Menschen jedoch rueckgebildet.",
        difficulty = 3,
        funFact = "Katzen zeigen den Flehmen-Reflex (Maul oeffnen, Lippen zurueckziehen), um Pheromone besser zum Vomeronasalorgan zu leiten."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Saeugetiergruppe wird als 'Monotremata' bezeichnet und was ist ihr definierendes Merkmal?",
        answerA = "Beuteltiere, die ihre Jungen im Beutel aufziehen",
        answerB = "Eierlegende Saeugetiere wie Schnabeltier und Ameisenigel",
        answerC = "Plazentatiere mit besonders langer Tragzeit",
        answerD = "Saeugetiere ohne Zaehne, die sich von Insekten ernaehren",
        correctAnswer = 1,
        explanation = "Monotremata sind eierlegende Saeugetiere. Zu ihnen gehoeren nur das Schnabeltier (Ornithorhynchus anatinus) und die vier Ameisenigelarten. Sie saeugen ihre Jungen, legen aber Eier und haben eine Kloake (gemeinsame Oeffnung fuer Verdauung, Harn und Fortpflanzung).",
        difficulty = 3,
        funFact = "Das Schnabeltier ist eines der wenigen giftigen Saeugetiere: Maennchen haben an den Hinterbeinsporen ein hochwirksames Gift."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie wird der Stoffwechselzustand bezeichnet, bei dem Saeugetiere ihren Grundumsatz im Winter stark reduzieren, aber bei Stoerung schnell aufwachen koennen?",
        answerA = "Torpor",
        answerB = "Tiefschlaf (Koma)",
        answerC = "Echte Hibernation",
        answerD = "Aestivation",
        correctAnswer = 0,
        explanation = "Torpor bezeichnet einen kurzen, reversibler Ruhezustand mit drastisch reduzierter Koerpertemperatur und Stoffwechselrate. Im Gegensatz zur echten Hibernation koennen Tiere im Torpor schneller aufgeweckt werden. Echter Winterschlaf (z.B. beim Siebenschlaefer) ist tiefer und laenger anhaltend.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Neurotransmitter ist hauptsaechlich fuer die Regulation des zirkadianen Rhythmus bei Saeugetieren verantwortlich?",
        answerA = "Serotonin",
        answerB = "Dopamin",
        answerC = "Melatonin",
        answerD = "Acetylcholin",
        correctAnswer = 2,
        explanation = "Melatonin, produziert in der Zirbeldruse (Epiphyse), reguliert den zirkadianen Rhythmus bei Saeugetieren. Seine Ausschuettung wird durch Dunkelheit stimuliert und durch Licht gehemmt. Der suprachiasmatische Nukleus im Hypothalamus ist der Hauptschrittmacher.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Zahnformel beschreibt das Gebiss eines erwachsenen Menschen korrekt?",
        answerA = "I 2/2, C 1/1, P 2/2, M 3/3",
        answerB = "I 3/3, C 1/1, P 2/2, M 2/2",
        answerC = "I 2/2, C 1/1, P 3/3, M 2/2",
        answerD = "I 2/2, C 1/1, P 2/2, M 2/2",
        correctAnswer = 0,
        explanation = "Die Zahnformel des erwachsenen Menschen ist I 2/2, C 1/1, P 2/2, M 3/3 — also 2 Schneidezaehne, 1 Eckzahn, 2 Vorbackenzaehne und 3 Backenzaehne je Kieferhaelfte, ergibt 32 Zaehne gesamt.",
        difficulty = 3,
        funFact = "Die dritten Molaren ('Weisheitsszaehne') werden bei modernen Menschen haeufig nicht vollstaendig entwickelt oder brechen nie durch."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter 'Heterochronie' in der evolutionaeren Entwicklungsbiologie der Saeugetiere?",
        answerA = "Unterschiede in der Koerpergroesse zwischen nah verwandten Arten",
        answerB = "Veraenderung des Zeitpunkts oder der Rate von Entwicklungsereignissen in der Evolution",
        answerC = "Gleichzeitiges Vorkommen mehrerer Generationen in einer Population",
        answerD = "Unterschiede im Schlafverhalten zwischen Saeugetierarten",
        correctAnswer = 1,
        explanation = "Heterochronie bezeichnet evolutionaere Veraenderungen im Timing oder der Rate ontogenetischer Entwicklungsprozesse. Sie erklaert viele evolutionaere Neuerungen bei Saeugetieren, wie Neotenie (Beibehaltung juveniler Merkmale im Erwachsenenalter).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Saeugetier hat die laengste bekannte Lebensspanne in Wildnis (ohne menschliche Pflege)?",
        answerA = "Afrikanischer Elefant (ca. 70 Jahre)",
        answerB = "Groenlandwal (Balaena mysticetus, ca. 200+ Jahre)",
        answerC = "Blauwal (Balaenoptera musculus, ca. 110 Jahre)",
        answerD = "Grauer Wal (Eschrichtius robustus, ca. 80 Jahre)",
        correctAnswer = 1,
        explanation = "Der Groenlandwal (Balaena mysticetus) gilt als das laengstlebende Saeugetier. Anhand von Harpunenfragmenten und biochemischen Analysen wurden Individuen auf ueber 200 Jahre geschaetzt, wobei ein Exemplar auf ca. 211 Jahre datiert wurde.",
        difficulty = 3,
        funFact = "Groenlandwale besitzen einen besonders effizienten DNA-Reparaturmechanismus, der moeglicherweise ihre extreme Langlebigkeit erklaert."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Struktur ist bei Wiederkaeusern fuer die mikrobielle Fermentation der pflanzlichen Nahrung hauptsaechlich zustaendig?",
        answerA = "Psalter (Omasum)",
        answerB = "Haube (Reticulum)",
        answerC = "Labmagen (Abomasum)",
        answerD = "Pansen (Rumen)",
        correctAnswer = 3,
        explanation = "Der Pansen (Rumen) ist der groesste Magenabschnitt bei Wiederkaeusern und der Hauptfermentationsort. Hier bauen Milliarden von Bakterien, Pilzen und Protozoen Zellulose und andere Pflanzenfasern enzymatisch ab.",
        difficulty = 3,
        funFact = "Ein ausgewachsenes Rind hat einen Pansen mit einem Fassungsvermoegen von 100-200 Litern."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Gen wird als 'Master-Regulator' der Saeugetier-Embryonalentwicklung und der Bestimmung der Koerperachsen bezeichnet?",
        answerA = "BRCA1",
        answerB = "HOX-Gene",
        answerC = "TP53",
        answerD = "FOXP2",
        correctAnswer = 1,
        explanation = "HOX-Gene (Homeobox-Gene) kodieren fuer Transkriptionsfaktoren, die die Koerperachsen und die Segmentidentitaet in der Embryonalentwicklung aller Saeugetiere festlegen. Sie sind hochkonserviert und in fast allen vielzelligen Tieren vorhanden.",
        difficulty = 3,
        funFact = "Mutationen in HOX-Genen koennen zu drastischen anatomischen Veraenderungen fuehren, wie dem Wachstum eines Beines anstelle einer Antenne bei Fruchtfliegen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie bezeichnet man den Fachbegriff fuer Saeugetiere, die ihre Koerpertemperatur durch innere Waermeproduktion regulieren?",
        answerA = "Poikilotherm",
        answerB = "Ektotherm",
        answerC = "Endotherm",
        answerD = "Heterotherm",
        correctAnswer = 2,
        explanation = "Endotherme Tiere (auch 'Warmbluter') erzeugen durch Stoffwechselprozesse koerpereigene Waerme und halten eine konstante Koerpertemperatur aufrecht. Alle Saeugetiere und Voegel sind endotherm, im Gegensatz zu ektothermen Reptilien und Amphibien.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Saeugetierart bildet das groesste bekannte Tier, das je auf der Erde gelebt hat?",
        answerA = "Blauwal (Balaenoptera musculus)",
        answerB = "Blauwal-Unterart (Balaenoptera musculus musculus)",
        answerC = "Argentinosaurus (ausgestorbener Dinosaurier)",
        answerD = "Basilosaurus (ausgestorbener Wal)",
        correctAnswer = 0,
        explanation = "Der Blauwal (Balaenoptera musculus) ist das groesste bekannte Tier in der Erdgeschichte. Er kann bis zu 33 Meter lang werden und 190 Tonnen wiegen — groesser als jeder bekannte Dinosaurier.",
        difficulty = 3,
        funFact = "Das Herz eines Blauwals ist so gross wie ein kleines Auto und wiegt etwa 180 Kilogramm."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'Allopatrie' in der Speziationsbiologie?",
        answerA = "Artenbildung innerhalb desselben geografischen Gebiets",
        answerB = "Artenbildung durch geografische Isolation der Populationen",
        answerC = "Hybridbildung zwischen zwei verwandten Arten",
        answerD = "Ruckkreuzung einer Hybridart mit einer Elternart",
        correctAnswer = 1,
        explanation = "Allopatrische Speziation (allo = verschieden, patria = Heimat) bezeichnet die Artenbildung durch geografische Trennung von Populationen. Eine physische Barriere verhindert den Genfluss, wodurch sich die getrennten Populationen unabhaengig voneinander entwickeln und schliesslich zu eigenen Arten werden.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Mechanismus erklaert die besonders effiziente Sauerstoffversorgung tief tauchender Saeugetiere wie Pottwale?",
        answerA = "Hoehere Haemoglobinkonzentration im Blut und Myoglobinreichtum in Muskeln",
        answerB = "Spezielle Kiemen zusaetzlich zur Lunge",
        answerC = "Direkter Sauerstofftransport durch die Haut",
        answerD = "Anaerobe Atmung ohne Sauerstoff",
        correctAnswer = 0,
        explanation = "Tauchende Saeugetiere wie Pottwale haben deutlich hoehere Haemoglobinkonzentrationen im Blut und sehr hohe Myoglobingehalte in der Muskulatur (Muskeln erscheinen dadurch dunkelrot). Zudem koennen sie die Herzfrequenz drastisch senken (Tauchreflex).",
        difficulty = 3,
        funFact = "Pottwale koennen bis zu 90 Minuten tauchen und Tiefen von ueber 2.000 Metern erreichen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie viele Halswirbel haben nahezu alle Saeugetiere, unabhaengig von der Halslaenge?",
        answerA = "5",
        answerB = "6",
        answerC = "7",
        answerD = "8",
        correctAnswer = 2,
        explanation = "Fast alle Saeugetiere — vom Zwergspitzmaus bis zur Giraffe — besitzen genau 7 Halswirbel. Die wenigen Ausnahmen sind Seekuehe (6 Halswirbel) und einige Faultiersarten (6 oder 9 Halswirbel).",
        difficulty = 3,
        funFact = "Die Giraffe hat trotz ihres langen Halses ebenfalls nur 7 Halswirbel — diese sind jedoch jeweils bis zu 28 cm lang."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche der folgenden Aussagen zur MHC (Haupthistokompatibilitaetskomplex)-Diversitaet bei Saeugetieren trifft zu?",
        answerA = "Hohe MHC-Diversitaet erhoht die Suszeptibilitaet fuer Parasiteninfektionen",
        answerB = "MHC-Gene sind bei Saeugetieren monomorph und Art-spezifisch einheitlich",
        answerC = "Hohe MHC-Diversitaet in einer Population verbessert die kollektive Pathogenresistenz",
        answerD = "MHC-Diversitaet hat keinen Einfluss auf die Partnerwahl",
        correctAnswer = 2,
        explanation = "Hohe MHC-Diversitaet innerhalb einer Population erhoht die Wahrscheinlichkeit, dass zumindest einige Individuen fuer neue Pathogene resistente Allele besitzen. Dies schuetzt Populationen vor dem Ausloeschen durch epidemische Krankheiten. Studien zeigen auch, dass Saeugetiere Partner mit unterschiedlichem MHC bevorzugen (Geruch).",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie hoch ist die durchschnittliche Koerpertemperatur eines gesunden Hausschweins (Sus scrofa domesticus)?",
        answerA = "36,5 - 37,5 Grad Celsius",
        answerB = "37,5 - 38,5 Grad Celsius",
        answerC = "38,5 - 39,5 Grad Celsius",
        answerD = "40,0 - 41,0 Grad Celsius",
        correctAnswer = 2,
        explanation = "Die normale Koerpertemperatur des Hausschweins liegt bei 38,5 bis 39,5 Grad Celsius. Dieser Wert ist hoeher als beim Menschen (36,5-37,5 Grad). Abweichungen koennen auf Krankheiten wie Schweinegrippe oder Erysipel hindeuten.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Unterordnung umfasst die Menschenaffen (Hominidae) und den Menschen in der Primatensystematik?",
        answerA = "Strepsirrhini",
        answerB = "Platyrrhini",
        answerC = "Catarrhini",
        answerD = "Tarsiiformes",
        correctAnswer = 2,
        explanation = "Menschenaffen und der Mensch gehoeren zur Unterordnung Haplorhini und darin zur Parvordnung Catarrhini (Schmalnasenaffen), die sich durch eng zusammenstehende, nach unten gerichtete Nasenloecher auszeichnen. Zur Familie Hominidae gehoeren: Mensch, Schimpansen, Gorillas und Orang-Utans.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet der Fachbegriff 'Brunft' bei Hirschen und anderen Cerviden?",
        answerA = "Die Fellwechselperiode im Fruehling",
        answerB = "Die jaehrliche Reproduktionsphase mit Paarungskaempfen und erhoehtem Testosteronspiegel",
        answerC = "Die Abwerfperiode des Geweihs im Winter",
        answerD = "Die Nahrungsaufnahme vor dem Winterschlaf",
        correctAnswer = 1,
        explanation = "Die Brunft ist die Paarungszeit bei Cerviden (Hirschartigen), die im Herbst stattfindet. Sie wird von einem drastischen Anstieg des Testosteronspiegels begleitet, der zu Geweihhartung, Revierverteidigung, Rollschreien und Rivalenkaempfen der Boecke fuehrt.",
        difficulty = 3,
        funFact = "Waehrend der Brunft koennen maennliche Rothirsche bis zu 30% ihres Koerpergewichts verlieren, da sie kaum fressen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches ist das schwerste bekannte Landraubtier (Carnivora) der Gegenwart?",
        answerA = "Afrikanischer Loewe (Panthera leo)",
        answerB = "Eisbear (Ursus maritimus)",
        answerC = "Amur-Tiger (Panthera tigris altaica)",
        answerD = "Suedlicher Seeelefant (Mirounga leonina)",
        correctAnswer = 3,
        explanation = "Der Suedliche Seeelefant (Mirounga leonina) ist das schwerste Raubtier (Ordnung Carnivora) der Welt. Maennchen koennen bis zu 3.000 kg wiegen und 5-6 Meter lang werden, obwohl sie zum Eis- oder Landraubtier gezaehlt werden, da sie hauptsaechlich im Wasser leben.",
        difficulty = 3,
        funFact = "Maennliche Suedliche Seeelefanten sind bis zu 10-mal schwerer als Weibchen — der extremste Geschlechtsdimorphismus unter Saeugetieren."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Prozess erklaert die Entstehung der Plazenta aus evolutionaerer Sicht bei Saeugetieren?",
        answerA = "Einbau retroviraler DNA-Elemente in das Saeugetiergenom",
        answerB = "Mutation der Eischale bei fruehen Reptilienvorfahren",
        answerC = "Horizontaler Gentransfer von Bakterien",
        answerD = "Konvergente Evolution aus Kiemenstrukturen",
        correctAnswer = 0,
        explanation = "Wissenschaftliche Forschung zeigt, dass Syncytine, Schluessel-Proteine fuer die Plazentabildung, aus endogenen retroviralen Elementen (ERVs) stammen. Diese wurden vor ca. 130 Millionen Jahren in das Saeugergenom integriert und ermoeglichten die Entstehung der invasiven Plazenta.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Wie gross ist die Tragzeit des Virginischen Opossums (Didelphis virginiana), dem kuerzeststragenden Beuteltier?",
        answerA = "6 Tage",
        answerB = "13 Tage",
        answerC = "28 Tage",
        answerD = "42 Tage",
        correctAnswer = 1,
        explanation = "Das Virginische Opossum hat mit ca. 13 Tagen eine der kuerzesten Tragzeiten aller Saeugetiere. Die extrem unreifen Jungen (kaum groesser als eine Biene) klettern nach der Geburt selbststaendig in den Beutel und haften sich an einen Zitzen.",
        difficulty = 3,
        funFact = "Ein Opossum-Wurf kann aus bis zu 20 Jungtieren bestehen, obwohl die Mutter nur 13 Zitzen hat."
    ),

    Question(
        categoryId = 9,
        questionText = "Was beschreibt der Begriff 'Kin Selection' (Verwandtenselektion) in der Verhaltensbiologie der Saeugetiere?",
        answerA = "Die Auswahl von Nahrungsquellen basierend auf der Naehrstoffzusammensetzung",
        answerB = "Die bevorzugte Kooperation und Altruismus gegenueber genetisch verwandten Individuen",
        answerC = "Das Paarungsverhalten, bei dem Verwandte bevorzugt werden",
        answerD = "Die territoriale Vertreibung von Geschwistern aus dem Revier",
        correctAnswer = 1,
        explanation = "Kin Selection erklaert altruistisches Verhalten gegenueber Verwandten: Ein Individuum kann seinen inklusiven Fitnessbeitrag erhoehen, indem es Verwandten hilft, weil diese gemeinsame Gene tragen. Der Koeffizient r (Verwandtschaftsgrad) mal Fitness-Gewinn muss den eigenen Fitnessverlust ueberwiegen (Hamiltons Regel: rb > c).",
        difficulty = 3,
        funFact = "Erdmaennchen (Suricata suricatta) sind ein klassisches Beispiel: Sie zeigen ausgepraegten Altruismus, halten Wache und alarmieren die Gruppe trotz eigener Gefahr."
    ),

    Question(
        categoryId = 9,
        questionText = "Welche anatomische Besonderheit unterscheidet das Herz der Saeugetiere von dem der Reptilien?",
        answerA = "Saeugetiere haben ein 3-kammeriges Herz, Reptilien ein 4-kammeriges",
        answerB = "Saeugetiere haben ein vollstaendig getrenntes 4-kammeriges Herz, Reptilien ein unvollstaendig getrenntes",
        answerC = "Saeugetiere haben ein Herz mit Klappenventilen, Reptilien nicht",
        answerD = "Das Saeugetierherz pumpt von rechts nach links, das Reptilienherz umgekehrt",
        correctAnswer = 1,
        explanation = "Saeugetiere (und Voegel) haben ein vollstaendig 4-kammeriges Herz mit vollstaendig getrenntem Lungen- und Koerperkreislauf. Die meisten Reptilien haben ein 3-kammeriges Herz oder ein 4-kammeriges mit unvollstaendiger Septumtrennung, was eine partielle Mischung von oxygeniertem und desoxygeniertem Blut erlaubt.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Bei welcher Tiergruppe kommt die 'Delayed Fertilization' (verzoegerte Befruchtung) vor, bei der Spermien monatelang im weiblichen Koerper lebensfaehig bleiben?",
        answerA = "Wiederkaeuer (Ruminantia)",
        answerB = "Fledermaeuse (Chiroptera)",
        answerC = "Ruesselspringer (Macroscelidea)",
        answerD = "Spitzmaeuse (Soricidae)",
        correctAnswer = 1,
        explanation = "Viele temperate Fledermausarten paaren sich im Herbst, speichern die Spermien ueberwintert im weiblichen Reproduktionstrakt und die Befruchtung erfolgt erst nach dem Winterschlaf im Fruehling. So werden die Jungen zur guenstigsten Zeit geboren.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Klasse von Lipiden bildet die Hauptkomponente der Myelinscheide um Saeugetier-Nervenfasern?",
        answerA = "Triglyceride",
        answerB = "Phospholipide und Sphingolipide (Cerebroside, Sulfatide)",
        answerC = "Cholesterin-Ester",
        answerD = "Prostaglandine",
        correctAnswer = 1,
        explanation = "Myelin besteht zu etwa 70-85% aus Lipiden, hauptsaechlich Phospholipiden (wie Phosphatidylcholin) und Sphingolipiden (Galaktosylceramid, Sulfatide). Diese Lipidschichten isolieren die Nervenfaser elektrisch und ermoeglichen die saltatorische Erregungsleitung.",
        difficulty = 3,
        funFact = "Die Signalleitung in myelinisierten Nervenfasern erfolgt bis zu 120 Meter pro Sekunde — unvelisinierte Fasern leiten nur 0,5-2 m/s."
    ),

    Question(
        categoryId = 9,
        questionText = "Was versteht man unter dem Fachbegriff 'Diphyodontie' bei Saeugern?",
        answerA = "Das Vorhandensein von vier verschiedenen Zahntypen im Gebiss",
        answerB = "Genau zwei aufeinanderfolgende Zahngenerationen (Milchzaehne und bleibende Zaehne)",
        answerC = "Zaehne, die aus zwei unterschiedlichen Materialien bestehen",
        answerD = "Das Wachsen der Zaehne in zwei Phasen pro Lebensabschnitt",
        correctAnswer = 1,
        explanation = "Diphyodontie (di = zwei, phyo = wachsen, odont = Zahn) bezeichnet den Zahndurchbruch in zwei Generationen: Die Decidualdentition (Milchzaehne) wird durch die permanente Dentition (bleibende Zaehne) ersetzt. Fast alle Saeugetiere sind diphyodont, im Gegensatz zu polyphyodonten Tieren (z.B. Haie), die Zaehne immer wieder erneuern.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Saeugetier hat das groesste Gehirn im Verhaeltnis zur Koerpergroesse (Enzephaliserungsquotient EQ)?",
        answerA = "Grosser Tummler (Tursiops truncatus)",
        answerB = "Schimpanse (Pan troglodytes)",
        answerC = "Mensch (Homo sapiens)",
        answerD = "Orca (Orcinus orca)",
        correctAnswer = 2,
        explanation = "Der Mensch hat mit einem Enzephaliserungsquotienten (EQ) von etwa 7,4 das groesste Gehirn-Koerper-Verhaeltnis aller Saeugetiere. Zum Vergleich: Delfine haben EQ ~4, Schimpansen ~2,5, Hunde ~1,2.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Saeugertier-Ordnung ist mit ca. 2.500 Arten die artenreichste?",
        answerA = "Chiroperta (Fledermaeuse)",
        answerB = "Rodentia (Nagetiere)",
        answerC = "Soricomorpha (Spitzmaeuse)",
        answerD = "Carnivora (Raubtiere)",
        correctAnswer = 1,
        explanation = "Rodentia (Nagetiere) ist mit ca. 2.500 beschriebenen Arten die artenreichste Saeugetierordnung und umfasst ca. 40% aller Saeugetierarten. Zu ihr gehoeren Maeuse, Ratten, Eichoernchen, Biber, Meerschweinchen und viele mehr.",
        difficulty = 3,
        funFact = "Nagetiere kommen auf allen Kontinenten ausser der Antarktis vor und haben sich an nahezu alle terrestrischen Lebensraeume angepasst."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie nennt man das spezifische Tragsystem bei Beuteltieren, in dem die Embryonalenentwicklung hauptsaechlich stattfindet?",
        answerA = "Uterus",
        answerB = "Marsupium",
        answerC = "Choriallantoisplazenta",
        answerD = "Vitellus",
        correctAnswer = 1,
        explanation = "Das Marsupium ist der Beutel (Hautfalte) an der Bauchseite der Beuteltierweibchen, in dem die Jungen nach der kurzen Tragetid weiterwachsen, waehrend sie an einem Zitzen haften. Nicht alle Beuteltiere haben einen vollstaendigen Beutel.",
        difficulty = 3,
        funFact = "Beuteltiermaennchen koennen ebenfalls ein rudimentaeres Marsupium besitzen, das jedoch keine Funktion hat."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist das biochemische Besonderheit des Haemoglobins F (fetales Haemoglobin) gegenueber adultem Haemoglobin?",
        answerA = "HbF hat eine niedrigere Sauerstoffaffinitaet zur Sauerstoffabgabe ins Gewebe",
        answerB = "HbF hat eine hoehere Sauerstoffaffinitaet und entzieht dem Mutterblut aktiv Sauerstoff",
        answerC = "HbF transportiert Kohlendioxid effizienter als Sauerstoff",
        answerD = "HbF besteht aus vier identischen Alpha-Untereinheiten",
        correctAnswer = 1,
        explanation = "Fetales Haemoglobin (HbF) besteht aus zwei Alpha- und zwei Gamma-Untereinheiten. Die Gamma-Ketten binden 2,3-BPG (Bisphosphoglycerat) weniger als Beta-Ketten, wodurch HbF eine hoehere Sauerstoffaffinitaet besitzt. So kann der Foetus dem Mutterblut (mit adultem HbA) aktiv Sauerstoff entziehen.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Tierart wird wegen ihrer einzigartigen Schwimmtechnik, bei der nur die Hinterflossenpaare schlagen, als 'Ruder-Wal' bezeichnet?",
        answerA = "Pottwal (Physeter macrocephalus)",
        answerB = "Sei-Wal (Balaenoptera borealis)",
        answerC = "Narwal (Monodon monoceros)",
        answerD = "Groenlandwal (Balaena mysticetus)",
        correctAnswer = 3,
        explanation = "Der Groenlandwal (Balaena mysticetus) hat keine Rueckenflosse und bewegt sich durch vertikale Schlaege der Fluke fort. Seine extreme Speckschicht (bis zu 50 cm) macht ihn ideal an das arktische Leben angepasst. Die eigentliche Frage bezieht sich auf seine Anatomie ohne Rueckenflosse.",
        difficulty = 3,
        funFact = "Der Groenlandwal kann mit seinem massigen Kopf Meereisplatten von bis zu 60 cm Dicke durchbrechen."
    ),

    Question(
        categoryId = 9,
        questionText = "Was bezeichnet der Begriff 'Koprophagie' bei Saeugetieren, und bei welchen Tiergruppen ist sie adaptiv?",
        answerA = "Das Fressen von Aas; adaptiv bei Geierarten und Hyaenen",
        answerB = "Das Fressen eigener Faeces zur Nahrstoffgewinnung; adaptiv bei Hasen und Nagetieren",
        answerC = "Das Fressen von Pilzen; adaptiv bei Biebern",
        answerD = "Das Trinken von Urin zur Wassergewinnung; adaptiv bei Wuestenratten",
        correctAnswer = 1,
        explanation = "Koprophagie (Kotfressen) ist bei Hasen (Lagomorpha) und manchen Nagetieren eine adaptive Strategie. Hasen produzieren zwei Kottypen: weiche Caecotrophe (reich an Protein, B-Vitaminen) die direkt aus dem After gefressen werden, und normale harte Kotpillen. So werden Naehrstoffe aus dem Blinddarm wiederverwertet.",
        difficulty = 3,
        funFact = "Kaninchen fressen die Caecotrophe direkt beim Ausscheiden, oft fruehmorgens, sodass der Besitzer dies selten beobachtet."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Saeugetier gilt als naechster lebender Verwandter des Elefanten (Loxodonta/Elephas)?",
        answerA = "Nilpferd (Hippopotamus amphibius)",
        answerB = "Klippdachs (Procavia capensis)",
        answerC = "Tapir (Tapirus spp.)",
        answerD = "Seekuh (Trichechus spp.)",
        correctAnswer = 1,
        explanation = "Molekularphylogenetische Studien zeigen, dass der Klippdachs (Procavia capensis) und Seekuehe (Sirenia) zu den naechsten lebenden Verwandten der Elefanten gehoeren. Alle drei bilden zusammen mit den Tenreks die Ueberordnung Afrotheria.",
        difficulty = 3,
        funFact = "Der Klippdachs sieht aus wie ein Meerschweinchen, ist aber tatsaechlich naeher mit Elefanten verwandt als mit Nagern."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Gen wurde als wichtiger Regulator des Sozialverhaltens und der Paarbindung bei monogamen Saeugetieren identifiziert?",
        answerA = "OXTR (Oxytocinrezeptor-Gen)",
        answerB = "AVPR1a (Arginin-Vasopressin-Rezeptor 1a)",
        answerC = "DRD4 (Dopaminrezeptor D4)",
        answerD = "SERT (Serotonintransporter)",
        correctAnswer = 1,
        explanation = "Das AVPR1a-Gen, das den Vasopressin-V1a-Rezeptor kodiert, zeigt starke Korrelation mit monogamem Sozialverhalten bei Prairiewoelmaeuse (Microtus ochrogaster). Prairiewoelmaeuse mit mehr AVPR1a-Rezeptoren im Belohnungszentrum des Gehirns bilden staerkere Paarbindungen.",
        difficulty = 3,
        funFact = "Verwandte Bergwoelmaeuse (Microtus montanus) sind polygam und haben weniger AVPR1a-Rezeptoren in denselben Hirnregionen."
    ),

    Question(
        categoryId = 9,
        questionText = "Wie bezeichnet man den Zustand, in dem ein Saeugetier-Embryo waehrend der Regenzeit schlaeft und erst bei guenstigen Umweltbedingungen weiterwachst?",
        answerA = "Aestivation",
        answerB = "Embryonale Diapause",
        answerC = "Fetaler Dormanzstatus",
        answerD = "Neonatale Torpor",
        correctAnswer = 1,
        explanation = "Die embryonale Diapause (verzoegerte Implantation) erlaubt Saeugetieren, den Zeitpunkt der Geburt an guenstige Umweltbedingungen anzupassen. Bei einem Einfluss von Umweltsignalen (Fotoperiode, Nahrungsverfuegbarkeit) wird die ruhende Blastozyste aktiviert und nistet sich ein.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche Saeugetierart hat die groesste bekannte Wanderungsdistanz unter allen Landsaeugetieren?",
        answerA = "Nordamerikanisches Karibu (Rangifer tarandus granti)",
        answerB = "Weissohr-Gnu (Connochaetes taurinus)",
        answerC = "Saiga-Antilope (Saiga tatarica)",
        answerD = "Amerikanischer Bison (Bison bison)",
        correctAnswer = 0,
        explanation = "Das Barren-Ground-Karibu (Rangifer tarandus granti) in Alaska und Kanada legt jaehrliche Wanderungen von bis zu 4.800 km hin und zurueck zurueck — die laengsten dokumentierten Landsaeugetier-Migrationen der Welt.",
        difficulty = 3,
        funFact = "Karibous orientieren sich bei ihrer Wanderung moeglicherweise am Erdmagnetfeld, da sie im Tapetum lucidum des Auges UV-empfindliche Photorezeptoren besitzen."
    ),

    Question(
        categoryId = 9,
        questionText = "Welchen Namen traegt die phylogenetische Ueberordnung, die Elefanten, Seekuehe, Klippdachse und weitere afrikanische Saeugetiere vereint?",
        answerA = "Laurasiatheria",
        answerB = "Euarchontoglires",
        answerC = "Afrotheria",
        answerD = "Xenarthra",
        correctAnswer = 2,
        explanation = "Afrotheria ist eine molekular definierte Ueberordnung afrikanischer Saeugetiere, die Elefanten (Proboscidea), Seekuehe (Sirenia), Klippdachse (Hyracoidea), Ameisenfresser (Tubulidentata), Tenreks, Goldmaulwuerfe und Ruesselspringer umfasst. Sie stammen von einem gemeinsamen Vorfahren ab, der auf dem afrikanischen Kontinent lebte.",
        difficulty = 3,
        funFact = null
    ),

    Question(
        categoryId = 9,
        questionText = "Welche besondere Faehigkeit besitzt das Schnabeltier (Ornithorhynchus anatinus) bei der Jagd unter Wasser?",
        answerA = "Es kann Schallwellen wie ein Delfin zum Echoloten nutzen",
        answerB = "Es besitzt Elektrorezeptoren im Schnabel zur Detektion elektrischer Felder der Beute",
        answerC = "Es sieht Infrarotstrahlung, die von warmblutiger Beute abgegeben wird",
        answerD = "Es nutzt chemosensorische Rezeptoren fuer den Geruchssinn im Wasser",
        correctAnswer = 1,
        explanation = "Das Schnabeltier besitzt im Schnabel etwa 40.000 Elektrorezeptoren (und 60.000 Mechanorezeptoren). Es taucht mit geschlossenen Augen, Ohren und Nase und ortet Beute ausschliesslich durch die elektrischen Felder der Muskelbewegungen kleiner Wassertiere.",
        difficulty = 3,
        funFact = "Das Schnabeltier ist das einzige Saeugetier, das aktiv elektrische Felder wahrnehmen kann — eine Faehigkeit, die sonst nur bei Fischen und Haien bekannt ist."
    ),

    Question(
        categoryId = 9,
        questionText = "Was ist die primaere Funktion des braunen Fettgewebes (BAT) bei neugeborenen Saeugetieren und Winterschlaefern?",
        answerA = "Energiespeicherung als langfristige Fettreserve",
        answerB = "Waermeproduktion durch Entkopplung der Atmungskette (Thermogenin/UCP1)",
        answerC = "Bildung von Hormonen wie Leptin und Adiponektin",
        answerD = "Immunabwehr durch Bereitstellung von Abwehrzellen",
        correctAnswer = 1,
        explanation = "Braunes Fettgewebe (BAT) enthaelt reichlich Mitochondrien mit dem Protein Thermogenin (UCP1, Uncoupling Protein 1), das die oxidative Phosphorylierung von der ATP-Synthese entkoppelt. Dabei wird Energie als Waerme freigesetzt statt als ATP gespeichert — diese zitterfreie Thermogenese erwaermt Neugeborene und Winterschlaefer beim Aufwachen.",
        difficulty = 3,
        funFact = "Erwachsene Menschen haben aktives braunes Fettgewebe in der Hals-Schluesselbein-Region, das bei Kaeltestress aktiviert wird."
    ),

    Question(
        categoryId = 9,
        questionText = "Welcher Knochen ist in der Wirbelsaeule von Bartenwalen vollstaendig rueckgebildet?",
        answerA = "Os sacrum (Kreuzbein)",
        answerB = "Atlas (erster Halswirbel)",
        answerC = "Sternum (Brustbein)",
        answerD = "Os coccygis (Steissbein)",
        correctAnswer = 0,
        explanation = "Wale haben kein Kreuzbein (Os sacrum) mehr, da ihre Hinterextremitaeten vollstaendig rueckgebildet wurden. Nur rudimentaere Beckenknochen ('Pelvisknochen') ohne Verbindung zur Wirbelsaeule sind noch vorhanden — ein evolutionaerer Beleg fuer die terrestrischen Vorfahren der Wale.",
        difficulty = 3,
        funFact = "Gelegentlich werden Wale mit rudimentaeren Hinterbeinresten geboren — ein Atavismus, der die evolutionaere Abstammung von Landtieren beweist."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Enzym in Saeugetiermilch baut Laktose auf und ist bei laktoseintoleranten Erwachsenen nicht ausreichend vorhanden?",
        answerA = "Lipase",
        answerB = "Amylase",
        answerC = "Laktase (Beta-Galaktosidase)",
        answerD = "Protease",
        correctAnswer = 2,
        explanation = "Laktase (Lactase-Phlorizin-Hydrolase, LPH) ist das Enzym im Duenadarmbuerstensaum, das Laktose in Glukose und Galaktose spaltet. Bei den meisten Saeugetieren (und ca. 65% der erwachsenen Menschen weltweit) nimmt die Laktaseaktivitaet nach dem Abstillen ab (Laktasepersistenz ist eine seltene Mutation).",
        difficulty = 3,
        funFact = "Die Mutation fuer Laktasepersistenz entstand vor ca. 7.500 Jahren unabhaengig voneinander in Nordeuropa und Ostafrika."
    ),

    Question(
        categoryId = 9,
        questionText = "Welches Saeugetier hat den hoechsten bekannten Blutdruck unter allen Landtieren?",
        answerA = "Afrikanischer Elefant",
        answerB = "Giraffe (Giraffa camelopardalis)",
        answerC = "Flusspferd (Hippopotamus amphibius)",
        answerD = "Grosser Kudu (Tragelaphus strepsiceros)",
        correctAnswer = 1,
        explanation = "Die Giraffe hat den hoechsten systolischen Blutdruck aller Landtiere (ca. 280/180 mmHg am Herzen), um trotz der grossen Hoehe (bis 2 m ueber dem Herzen) das Gehirn ausreichend zu durchbluten. Besondere Ventilmechanismen verhindern einen Blutdruckabfall beim Trinken (Kopf gesenkt).",
        difficulty = 3,
        funFact = "Wenn eine Giraffe den Kopf zum Trinken senkt, wuerden ohne Gegenmassnahmen gefaesserweiternde Reflexe und spezialisierte Venenklappen einen toedlichen Blutdruckanstieg im Gehirn verursachen."
    ),

)
