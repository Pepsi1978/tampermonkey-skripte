package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun healthQuestionsEasy5(): List<Question> = listOf(

    // --- Types of doctors ---

    Question(
        categoryId = 16,
        questionText = "Welcher Arzt behandelt Zaehne?",
        answerA = "Augenarzt",
        answerB = "Hautarzt",
        answerC = "Zahnarzt",
        answerD = "Kinderarzt",
        correctAnswer = 2,
        explanation = "Der Zahnarzt (Dentist) ist auf die Behandlung von Zaehnen, Zahnfleisch und dem gesamten Mundraum spezialisiert.",
        difficulty = 1,
        funFact = "In Deutschland gibt es rund 67.000 Zahnaerzte  -  das ist einer der hoechsten Werte pro Einwohner in Europa."
    ),

    Question(
        categoryId = 16,
        questionText = "Welcher Arzt untersucht die Augen?",
        answerA = "Orthopaedie",
        answerB = "Augenarzt",
        answerC = "HNO-Arzt",
        answerD = "Internist",
        correctAnswer = 1,
        explanation = "Der Augenarzt (Ophthalmologe) diagnostiziert und behandelt Erkrankungen des Auges, wie Kurzsichtigkeit oder den Grauen Star.",
        difficulty = 1,
        funFact = "Das menschliche Auge kann bis zu 10 Millionen verschiedene Farbnuancen unterscheiden."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist ein Allgemeinmediziner?",
        answerA = "Ein Arzt nur fuer Kinder",
        answerB = "Ein Arzt nur fuer Herzerkrankungen",
        answerC = "Ein Arzt fuer alle Altersgruppen als erste Anlaufstelle",
        answerD = "Ein Arzt nur fuer Operationen",
        correctAnswer = 2,
        explanation = "Der Allgemeinmediziner (Hausarzt) ist die erste Anlaufstelle fuer alle Gesundheitsprobleme und koordiniert bei Bedarf die Weiterbehandlung durch Spezialisten.",
        difficulty = 1,
        funFact = "In Deutschland hat jeder gesetzlich Versicherte das Recht, ohne Ueberweisung direkt zum Hausarzt zu gehen."
    ),

    Question(
        categoryId = 16,
        questionText = "Was behandelt ein HNO-Arzt?",
        answerA = "Herz und Nieren",
        answerB = "Haut und Nagel",
        answerC = "Hals, Nase und Ohren",
        answerD = "Hueften und Knochen",
        correctAnswer = 2,
        explanation = "Der HNO-Arzt (Hals-Nasen-Ohren-Arzt) behandelt Erkrankungen im Bereich Hals, Nase, Ohren sowie Mund und Rachen.",
        difficulty = 1,
        funFact = "Schnupfen ist die haeufigste Erkrankung, wegen der Patienten einen HNO-Arzt aufsuchen."
    ),

    Question(
        categoryId = 16,
        questionText = "Welcher Arzt ist auf Kinder spezialisiert?",
        answerA = "Geriater",
        answerB = "Gynaekologie",
        answerC = "Paediater (Kinderarzt)",
        answerD = "Neurologe",
        correctAnswer = 2,
        explanation = "Der Paediater (Kinderarzt) ist auf die medizinische Versorgung von Neugeborenen, Kindern und Jugendlichen spezialisiert.",
        difficulty = 1,
        funFact = "Die Kinderheilkunde als eigenstaendiges Fachgebiet entstand erst im 19. Jahrhundert  -  davor wurden Kinder wie kleine Erwachsene behandelt."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist ein Hautarzt?",
        answerA = "Ein Arzt fuer Muskelerkrankungen",
        answerB = "Ein Arzt fuer Erkrankungen der Haut, Haare und Naegel",
        answerC = "Ein Arzt fuer Knochenbrueche",
        answerD = "Ein Arzt fuer Magenprobleme",
        correctAnswer = 1,
        explanation = "Der Dermatologe (Hautarzt) behandelt Erkrankungen der Haut, Haare und Naegel, zum Beispiel Akne, Ekzeme oder Hautkrebs.",
        difficulty = 1,
        funFact = "Die Haut ist mit einer Flaeche von etwa 1,7 Quadratmetern das groesste Organ des menschlichen Koerpers."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist ein Gynaekologie-Arzt?",
        answerA = "Ein Arzt fuer Maenner",
        answerB = "Ein Arzt fuer Knochen",
        answerC = "Ein Frauenarzt",
        answerD = "Ein Zahnarzt",
        correctAnswer = 2,
        explanation = "Der Gynaekologe (Frauenarzt) ist auf die Gesundheit der weiblichen Geschlechtsorgane sowie Schwangerschaft und Geburt spezialisiert.",
        difficulty = 1,
        funFact = "Regelmaessige Vorsorgeuntersuchungen beim Gynaekologen koennen Gebaermutterhalskrebs fruehzeitig erkennen und sind in Deutschland kostenlos."
    ),

    // --- Hospital vs pharmacy vs doctor's office ---

    Question(
        categoryId = 16,
        questionText = "Wo holt man verschriebene Medikamente ab?",
        answerA = "Im Krankenhaus",
        answerB = "In der Apotheke",
        answerC = "Beim Zahnarzt",
        answerD = "Im Supermarkt",
        correctAnswer = 1,
        explanation = "Verschriebene Medikamente werden in der Apotheke ausgegeben. Apotheker pruefen auch auf Wechselwirkungen zwischen verschiedenen Medikamenten.",
        difficulty = 1,
        funFact = "In Deutschland gibt es ueber 18.000 Apotheken  -  mehr als McDonald's-Filialen."
    ),

    Question(
        categoryId = 16,
        questionText = "Wann sollte man in die Notaufnahme eines Krankenhauses gehen?",
        answerA = "Bei einem leichten Schnupfen",
        answerB = "Fuer eine regulaere Vorsorgeuntersuchung",
        answerC = "Bei schweren oder lebensbedrohlichen Verletzungen oder Erkrankungen",
        answerD = "Um ein Rezept abzuholen",
        correctAnswer = 2,
        explanation = "Die Notaufnahme eines Krankenhauses ist fuer ernste, akute oder lebensbedrohliche Faelle gedacht. Leichte Erkrankungen sollten beim Hausarzt behandelt werden.",
        difficulty = 1,
        funFact = "In Deutschland werden jaehrlich rund 20 Millionen Patienten in Notaufnahmen behandelt  -  viele davon unnoetigerweise mit nicht-dringenden Beschwerden."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist der Unterschied zwischen einer Arztpraxis und einem Krankenhaus?",
        answerA = "In der Arztpraxis werden nur Kinder behandelt",
        answerB = "Im Krankenhaus koennen Patienten stationaer aufgenommen werden, in der Praxis nicht",
        answerC = "In der Arztpraxis gibt es mehr Aerzte",
        answerD = "Ein Krankenhaus ist kostenlos, die Praxis nicht",
        correctAnswer = 1,
        explanation = "Krankenhaeuser haben Stationen, auf denen Patienten ueber Nacht oder laenger aufgenommen werden koennen. Arztpraxen behandeln ambulant, ohne Uebernachtung.",
        difficulty = 1,
        funFact = "Das erste oeffentliche Krankenhaus der Welt wurde im Jahr 805 n. Chr. in Bagdad errichtet."
    ),

    Question(
        categoryId = 16,
        questionText = "Was macht ein Apotheker?",
        answerA = "Er operiert Patienten",
        answerB = "Er stellt Diagnosen fuer Krankheiten",
        answerC = "Er gibt Medikamente ab und beraet ueber deren Anwendung",
        answerD = "Er fuehrt Roentgenuntersuchungen durch",
        correctAnswer = 2,
        explanation = "Apotheker sind Experten fuer Arzneimittel. Sie geben Medikamente ab, pruefen Rezepte und beraten Patienten ueber Dosierung und Nebenwirkungen.",
        difficulty = 1,
        funFact = "Apotheker studieren mindestens 5 Jahre Pharmazie, bevor sie in einer Apotheke arbeiten duerfen."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist ein Rezept beim Arzt?",
        answerA = "Ein Koch-Rezept",
        answerB = "Eine schriftliche Anweisung des Arztes fuer die Ausgabe eines Medikaments",
        answerC = "Eine Rechnung vom Arzt",
        answerD = "Ein Termin-Formular",
        correctAnswer = 1,
        explanation = "Ein aerztliches Rezept ist ein schriftliches Dokument, mit dem der Arzt die Ausgabe eines bestimmten Medikaments in der Apotheke anordnet.",
        difficulty = 1,
        funFact = "Manche Medikamente wie Schmerzmittel sind rezeptfrei erhaeltlich, starke Mittel wie Antibiotika benoetigen immer ein Rezept."
    ),

    // --- Common medications ---

    Question(
        categoryId = 16,
        questionText = "Wogegen hilft Aspirin hauptsaechlich?",
        answerA = "Gegen Magenprobleme",
        answerB = "Gegen Schmerzen und Fieber",
        answerC = "Gegen Husten",
        answerD = "Gegen Schlaflosigkeit",
        correctAnswer = 1,
        explanation = "Aspirin (Wirkstoff: Acetylsalicylsaeure) wirkt schmerzlindernd, fiebersenkend und entzuendungshemmend. Es wird auch zur Blutverduessung eingesetzt.",
        difficulty = 1,
        funFact = "Aspirin wurde 1897 von Felix Hoffmann bei Bayer entwickelt und ist eines der am meisten verkauften Medikamente der Welt."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist Ibuprofen?",
        answerA = "Ein Antibiotikum gegen bakterielle Infektionen",
        answerB = "Ein Schmerz- und Entzuendungshemmer",
        answerC = "Ein Mittel gegen Schlafprobleme",
        answerD = "Ein Vitamin-Praeparat",
        correctAnswer = 1,
        explanation = "Ibuprofen ist ein Schmerzmittel und Entzuendungshemmer aus der Gruppe der nicht-steroidalen Antirheumatika (NSAR). Es wirkt auch fiebersenkend.",
        difficulty = 1,
        funFact = "Ibuprofen wurde 1961 entwickelt und ist weltweit eines der meistverkauften rezeptfreien Medikamente."
    ),

    Question(
        categoryId = 16,
        questionText = "Wofuer wird Paracetamol eingesetzt?",
        answerA = "Zur Behandlung von Pilzinfektionen",
        answerB = "Gegen Kopfschmerzen und Fieber",
        answerC = "Als Antibiotikum",
        answerD = "Gegen Bluthochdruck",
        correctAnswer = 1,
        explanation = "Paracetamol ist ein weit verbreitetes Schmerz- und Fiebermittel, das auch fuer Kinder und Schwangere (in angemessener Dosis) geeignet ist.",
        difficulty = 1,
        funFact = "Paracetamol in zu hoher Dosis kann die Leber schwer schaedigen  -  deshalb sollte man die empfohlene Tagesdosis nie ueberschreiten."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist ein Antibiotikum?",
        answerA = "Ein Mittel gegen Viren",
        answerB = "Ein Mittel gegen Pilze",
        answerC = "Ein Mittel gegen Bakterien",
        answerD = "Ein Mittel gegen Allergien",
        correctAnswer = 2,
        explanation = "Antibiotika sind Medikamente, die gezielt bakterielle Infektionen bekaempfen. Gegen Viren sind sie wirkungslos.",
        difficulty = 1,
        funFact = "Das erste Antibiotikum, Penicillin, wurde 1928 zunaechst zufaellig von Alexander Fleming entdeckt."
    ),

    Question(
        categoryId = 16,
        questionText = "Warum darf man Antibiotika nicht vorzeitig absetzen?",
        answerA = "Weil sie sonst teurer werden",
        answerB = "Weil sonst resistente Bakterien entstehen koennen",
        answerC = "Weil man sonst allergisch wird",
        answerD = "Weil das Medikament sonst nicht wirkt",
        correctAnswer = 1,
        explanation = "Wenn man Antibiotika zu frueh absetzt, koennen ueberlebende Bakterien resistent werden und zukuenftige Behandlungen erschweren.",
        difficulty = 1,
        funFact = "Antibiotikaresistenz gilt laut WHO als eine der groessten globalen Gesundheitsbedrohungen des 21. Jahrhunderts."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist ein rezeptfreies Medikament?",
        answerA = "Ein Medikament, das man ohne aerztliches Rezept in der Apotheke kaufen kann",
        answerB = "Ein Medikament, das kostenlos ist",
        answerC = "Ein Medikament, das nur im Krankenhaus erhaltlich ist",
        answerD = "Ein Medikament fuer Kinder",
        correctAnswer = 0,
        explanation = "Rezeptfreie Medikamente (OTC = Over the Counter) koennen direkt in der Apotheke oder im Drogeriemarkt gekauft werden, ohne aerztliche Verordnung.",
        difficulty = 1,
        funFact = "In Deutschland sind rund 40.000 verschiedene Medikamente zugelassen  -  etwa die Haelfte davon ist rezeptfrei erhaeltlich."
    ),

    // --- Vaccination basics ---

    Question(
        categoryId = 16,
        questionText = "Was bewirkt eine Impfung im Koerper?",
        answerA = "Sie toetet alle Keime im Blut sofort ab",
        answerB = "Sie trainiert das Immunsystem, einen bestimmten Erreger zu erkennen und zu bekaempfen",
        answerC = "Sie macht den Koerper staerker durch Sport",
        answerD = "Sie erhoht die Koerpertemperatur",
        correctAnswer = 1,
        explanation = "Impfungen enthalten abgeschwachte oder inaktivierte Erreger oder Teile davon. Das Immunsystem lernt, diese zu erkennen und bildet Antikoerper fuer einen zukuenftigen Schutz.",
        difficulty = 1,
        funFact = "Pocken sind die einzige menschliche Infektionskrankheit, die durch weltweite Impfkampagnen vollstaendig ausgerottet wurde  -  fuer immer, seit 1980."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist eine Auffrischimpfung?",
        answerA = "Eine Impfung gegen neue Krankheiten",
        answerB = "Eine Wiederholung einer Impfung, um den Schutz aufrechtzuerhalten",
        answerC = "Eine Impfung fuer Tiere",
        answerD = "Eine Impfung nach einer Auslandsreise",
        correctAnswer = 1,
        explanation = "Auffrischimpfungen sind Wiederholungsimpfungen, die noetig sind, weil der Impfschutz mancher Impfungen nach einigen Jahren nachlassen kann.",
        difficulty = 1,
        funFact = "Tetanus-Impfschutz haelt etwa 10 Jahre  -  danach sollte man eine Auffrischung erhalten, damit der Schutz bestehen bleibt."
    ),

    Question(
        categoryId = 16,
        questionText = "Welche Impfung schuetzt vor Grippe?",
        answerA = "Masernimpfung",
        answerB = "Influenza-Impfung (Grippeimpfung)",
        answerC = "Tetanus-Impfung",
        answerD = "Hepatitis-Impfung",
        correctAnswer = 1,
        explanation = "Die Influenza-Impfung schuetzt vor der echten Grippe (Influenza), nicht vor einfachen Erkaeltungen. Sie wird jaehrlich angepasst, weil das Grippevirus sich veraendert.",
        difficulty = 1,
        funFact = "Die Grippe ist gefaehrlicher als viele denken  -  weltweit sterben jaehrlich bis zu 650.000 Menschen an Grippekomplikationen."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist Herdenimmunitaet?",
        answerA = "Wenn Tiere gegen eine Krankheit immun sind",
        answerB = "Wenn so viele Menschen geimpft sind, dass eine Krankheit sich kaum noch ausbreiten kann",
        answerC = "Wenn eine Person zweimal geimpft wird",
        answerD = "Wenn ein Medikament fuer alle Menschen wirkt",
        correctAnswer = 1,
        explanation = "Bei Herdenimmunitaet sind so viele Menschen immunisiert (durch Impfung oder Infektion), dass eine Krankheit sich nicht mehr effektiv ausbreiten kann und auch ungeimpfte Personen geschuetzt werden.",
        difficulty = 1,
        funFact = "Fuer Masern braucht man eine Herdenimmunitaet von ueber 95 %, weil das Masernvirus extrem ansteckend ist."
    ),

    Question(
        categoryId = 16,
        questionText = "Welche Impfung erhalten Babys in Deutschland als erste?",
        answerA = "Grippeimpfung",
        answerB = "Impfung gegen Rotaviren, 6-fach-Impfung und weitere ab dem 2. Lebensmonat",
        answerC = "Nur die Tetanus-Impfung",
        answerD = "Keine Impfung vor dem 1. Geburtstag",
        correctAnswer = 1,
        explanation = "Gemaess dem STIKO-Impfkalender erhalten Babys ab dem 2. Lebensmonat die erste Impfung gegen Rotaviren sowie ab dem 3. Monat die erste 6-fach-Impfung.",
        difficulty = 1,
        funFact = "Die 6-fach-Impfung schuetzt gleichzeitig gegen Diphtherie, Tetanus, Keuchhusten, Hib, Polio und Hepatitis B  -  sechs Krankheiten mit einer einzigen Spritze."
    ),

    Question(
        categoryId = 16,
        questionText = "Was versteht man unter einem Impfpass?",
        answerA = "Einen Ausweis fuer Tierimpfungen",
        answerB = "Ein Dokument, in dem alle erhaltenen Impfungen mit Datum eingetragen sind",
        answerC = "Eine aerztliche Rechnung fuer Impfungen",
        answerD = "Einen Reisepass mit Impfnachweis nur fuer Auslandsreisen",
        correctAnswer = 1,
        explanation = "Der Impfpass ist ein persoenliches Dokument, in dem alle Schutzimpfungen eingetragen werden. Er belegt den Impfstatus und ist wichtig fuer Arztbesuche und Reisen.",
        difficulty = 1,
        funFact = "Wer seinen alten Impfpass verloren hat, kann den Hausarzt oder die Krankenkasse um eine Rekonstruktion bitten, da Impfungen oft in Patientenakten gespeichert sind."
    ),

    // --- Blood donation basics ---

    Question(
        categoryId = 16,
        questionText = "Ab welchem Alter darf man in Deutschland Blut spenden?",
        answerA = "Ab 14 Jahren",
        answerB = "Ab 16 Jahren",
        answerC = "Ab 18 Jahren",
        answerD = "Ab 21 Jahren",
        correctAnswer = 2,
        explanation = "In Deutschland darf man ab 18 Jahren Blut spenden. Erstspender werden in der Regel nur bis zum Alter von 64 Jahren angenommen, Wiederholungsspender koennen laenger spenden.",
        difficulty = 1,
        funFact = "In Deutschland werden taeglich rund 15.000 Blutspenden benoetigt  -  das sind etwa 5,5 Millionen Spenden pro Jahr."
    ),

    Question(
        categoryId = 16,
        questionText = "Wie oft darf eine Frau pro Jahr Vollblut spenden?",
        answerA = "Einmal",
        answerB = "Zweimal",
        answerC = "Viermal",
        answerD = "Zehnmal",
        correctAnswer = 1,
        explanation = "Frauen duerfen maximal zweimal pro Jahr Vollblut spenden, Maenner bis zu viermal. Zwischen zwei Spenden muss eine Pause von mindestens 56 Tagen liegen.",
        difficulty = 1,
        funFact = "Eine einzelne Blutspende von 500 ml kann bis zu drei Menschen das Leben retten, weil das Blut in Erythrozyten, Thrombozyten und Plasma aufgeteilt wird."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist die haeufigste Blutgruppe in Deutschland?",
        answerA = "AB+",
        answerB = "B+",
        answerC = "A+",
        answerD = "0+",
        correctAnswer = 2,
        explanation = "Die Blutgruppe A+ ist in Deutschland am weitesten verbreitet und kommt bei etwa 37 % der Bevoelkerung vor.",
        difficulty = 1,
        funFact = "Blutgruppe 0- ist der universelle Spender  -  dieses Blut kann an Menschen jeder Blutgruppe gegeben werden und ist deshalb besonders wertvoll."
    ),

    Question(
        categoryId = 16,
        questionText = "Was darf man kurz vor einer Blutspende NICHT tun?",
        answerA = "Wasser trinken",
        answerB = "Alkohol trinken",
        answerC = "Schlafen",
        answerD = "Spazieren gehen",
        correctAnswer = 1,
        explanation = "Vor einer Blutspende sollte man keinen Alkohol trinken, ausreichend geschlafen haben und eine fettige Mahlzeit vermeiden. Wasser trinken ist dagegen sehr empfehlenswert.",
        difficulty = 1,
        funFact = "Viel Trinken vor und nach der Blutspende hilft dem Koerper, das gespendete Blutvolumen schneller wieder aufzufuellen."
    ),

    // --- Health insurance basics ---

    Question(
        categoryId = 16,
        questionText = "Was ist eine Krankenversicherung?",
        answerA = "Eine Versicherung, die Kosten bei Krankheit, Arztbesuchen und Behandlungen uebernimmt",
        answerB = "Eine Versicherung fuer Haustiere",
        answerC = "Eine Versicherung gegen Unfaelle im Ausland",
        answerD = "Ein Sparkonto fuer Medikamente",
        correctAnswer = 0,
        explanation = "Die Krankenversicherung traegt die Kosten fuer medizinische Behandlungen, Medikamente und Krankenhausaufenthalte. In Deutschland besteht eine allgemeine Versicherungspflicht.",
        difficulty = 1,
        funFact = "Deutschland hat das aelteste gesetzliche Krankenversicherungssystem der Welt  -  eingefuehrt 1883 unter Reichskanzler Otto von Bismarck."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist der Unterschied zwischen gesetzlicher und privater Krankenversicherung?",
        answerA = "Es gibt keinen Unterschied",
        answerB = "Gesetzlich (GKV) richtet sich nach dem Einkommen, privat (PKV) nach Alter und Gesundheitszustand",
        answerC = "Nur Beamte duerfen sich privat versichern",
        answerD = "Die private Versicherung ist immer billiger",
        correctAnswer = 1,
        explanation = "Bei der gesetzlichen Krankenversicherung richtet sich der Beitrag nach dem Einkommen. Bei der privaten Krankenversicherung zaehlen Alter, Geschlecht und Gesundheitszustand.",
        difficulty = 1,
        funFact = "Rund 90 % aller Deutschen sind gesetzlich krankenversichert  -  nur etwa 10 % haben eine private Krankenversicherung."
    ),

    Question(
        categoryId = 16,
        questionText = "Was versteht man unter dem Begriff 'Zuzahlung' bei Medikamenten?",
        answerA = "Den vollen Preis des Medikaments",
        answerB = "Den Betrag, den Patienten zusaetzlich zur Kassenleistung selbst zahlen muessen",
        answerC = "Eine freiwillige Spende an die Krankenkasse",
        answerD = "Den Aufpreis fuer Markenmedikamente",
        correctAnswer = 1,
        explanation = "Bei verschriebenen Medikamenten zahlen gesetzlich Versicherte in Deutschland eine Zuzahlung von in der Regel 10 % des Preises, mindestens 5 Euro, maximal 10 Euro.",
        difficulty = 1,
        funFact = "Kinder unter 18 Jahren sind in Deutschland von der Zuzahlung bei Medikamenten befreit."
    ),

    Question(
        categoryId = 16,
        questionText = "Was bedeutet 'Krankenstand' in Deutschland?",
        answerA = "Die Anzahl der Krankenhausbetten",
        answerB = "Der Anteil der Arbeitnehmer, die krankgeschrieben sind",
        answerC = "Ein Parkplatz fuer Krankenwagen",
        answerD = "Ein Wartebereich beim Arzt",
        correctAnswer = 1,
        explanation = "Der Krankenstand bezeichnet den prozentualen Anteil der Arbeitnehmer, die zu einem bestimmten Zeitpunkt krankgeschrieben sind.",
        difficulty = 1,
        funFact = "Im Jahr 2023 lag der Krankenstand in Deutschland bei einem Rekordwert von ueber 6 %  -  jeder 16. Arbeitnehmer fehlte durchschnittlich taeglich."
    ),

    // --- Pregnancy basics, baby health ---

    Question(
        categoryId = 16,
        questionText = "Wie lange dauert eine normale Schwangerschaft?",
        answerA = "6 Monate (26 Wochen)",
        answerB = "7 Monate (30 Wochen)",
        answerC = "9 Monate (ca. 40 Wochen)",
        answerD = "12 Monate (52 Wochen)",
        correctAnswer = 2,
        explanation = "Eine normale Schwangerschaft dauert rund 40 Wochen (etwa 9 Monate) vom ersten Tag der letzten Periode bis zur Geburt.",
        difficulty = 1,
        funFact = "Babys, die zwischen Woche 37 und 42 geboren werden, gelten als reifgeboren. Fruehgeborene kommen vor der 37. Schwangerschaftswoche zur Welt."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist ein Mutterpass?",
        answerA = "Der Reisepass einer Mutter",
        answerB = "Ein Dokument mit allen Untersuchungsbefunden waehrend der Schwangerschaft",
        answerC = "Die Geburtsurkunde des Kindes",
        answerD = "Der Arztausweis der Hebamme",
        correctAnswer = 1,
        explanation = "Der Mutterpass ist ein Heft, in dem alle wichtigen medizinischen Befunde und Untersuchungsergebnisse waehrend der Schwangerschaft festgehalten werden.",
        difficulty = 1,
        funFact = "Den Mutterpass gibt es in Deutschland seit 1961. Schwangere sollten ihn immer bei sich tragen, da er im Notfall lebenswichtige Informationen enthaelt."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist Folsaeure und warum ist sie in der Schwangerschaft wichtig?",
        answerA = "Ein Vitamin, das die Entwicklung des Nervensystems des Babys unterstuetzt",
        answerB = "Ein Schmerzmittel fuer Schwangere",
        answerC = "Ein Mineral fuer die Knochen der Mutter",
        answerD = "Ein Antibiotikum fuer Infektionen in der Schwangerschaft",
        correctAnswer = 0,
        explanation = "Folsaeure (Vitamin B9) ist entscheidend fuer die normale Entwicklung des Neuralrohrs beim Baby. Ein Mangel kann zu Fehlbildungen wie Spina bifida fuehren.",
        difficulty = 1,
        funFact = "Aerzte empfehlen, schon vor der Schwangerschaft mit Folsaeure-Tabletten zu beginnen, weil das Neuralrohr sich bereits in den ersten Wochen nach der Empfaengnis entwickelt."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist das U1 beim Baby?",
        answerA = "Die erste Ultraschalluntersuchung in der Schwangerschaft",
        answerB = "Die erste Vorsorgeuntersuchung direkt nach der Geburt",
        answerC = "Die erste Impfung nach der Geburt",
        answerD = "Ein Test auf Allergien bei Neugeborenen",
        correctAnswer = 1,
        explanation = "U1 ist die erste Vorsorgeuntersuchung eines Neugeborenen, die direkt nach der Geburt im Kreissaal durchgefuehrt wird. Sie prueft, ob das Baby gesund ist.",
        difficulty = 1,
        funFact = "In Deutschland gibt es insgesamt 10 Kinder-Vorsorgeuntersuchungen (U1 bis U9 und J1), die von der Krankenkasse bezahlt werden."
    ),

    Question(
        categoryId = 16,
        questionText = "Warum sollen Saeuglinges auf dem Ruecken schlafen?",
        answerA = "Damit sie besser schlafen",
        answerB = "Um das Risiko des Plaetzlichen Kindstodes (SIDS) zu verringern",
        answerC = "Damit sie schneller wachsen",
        answerD = "Weil sie dann ruhiger sind",
        correctAnswer = 1,
        explanation = "Das Schlafen auf dem Ruecken verringert das Risiko des Ploetzlichen Kindstodes (SIDS) deutlich. Bauchschlafen gilt als Risikofaktor.",
        difficulty = 1,
        funFact = "Seit der weltweiten Aufklaerungskampagne 'Back to Sleep' in den 1990er Jahren ist die SIDS-Rate in vielen Laendern um ueber 50 % gesunken."
    ),

    // --- Smoking effects on health ---

    Question(
        categoryId = 16,
        questionText = "Welches Organ wird durch Rauchen am staerksten geschaedigt?",
        answerA = "Die Nieren",
        answerB = "Die Lunge",
        answerC = "Der Magen",
        answerD = "Die Augen",
        correctAnswer = 1,
        explanation = "Rauchen schaedigt vor allem die Lunge. Es kann Lungenkrebs, chronische Bronchitis und COPD (chronisch-obstruktive Lungenerkrankung) verursachen.",
        difficulty = 1,
        funFact = "Rauchen ist in Deutschland die groesste vermeidbare Todesursache  -  rund 127.000 Menschen sterben jaehrlich an tabakbedingten Erkrankungen."
    ),

    Question(
        categoryId = 16,
        questionText = "Wie lange nach dem Rauchstopp verbessert sich die Lungenfunktion spuerbar?",
        answerA = "Nie, der Schaden ist permanent",
        answerB = "Nach 50 Jahren",
        answerC = "Bereits innerhalb von Wochen bis wenigen Monaten",
        answerD = "Erst nach 10 Jahren",
        correctAnswer = 2,
        explanation = "Schon wenige Wochen nach dem Rauchstopp verbessert sich die Lungenfunktion deutlich. Der Koerper beginnt sofort mit der Selbstreparatur.",
        difficulty = 1,
        funFact = "Bereits 20 Minuten nach der letzten Zigarette normalisiert sich der Blutdruck. Nach einem Jahr sinkt das Herzinfarktrisiko auf die Haelfte im Vergleich zu aktiven Rauchern."
    ),

    Question(
        categoryId = 16,
        questionText = "Welcher Stoff im Tabakrauch macht suechtig?",
        answerA = "Teer",
        answerB = "Nikotin",
        answerC = "Kohlenmonoxid",
        answerD = "Ammoniak",
        correctAnswer = 1,
        explanation = "Nikotin ist der suchterzeugende Stoff im Tabak. Es wirkt auf das Belohnungssystem im Gehirn und fuehrt zu koerperlicher und psychischer Abhaengigkeit.",
        difficulty = 1,
        funFact = "Tabakrauch enthaelt ueber 4.000 chemische Verbindungen, von denen mindestens 70 als krebserregend eingestuft sind."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist Passivrauchen?",
        answerA = "Rauchen ohne Feuerzeug",
        answerB = "Das unfreiwillige Einatmen von Tabakrauch durch Nichtraucher",
        answerC = "Eine mildere Form des Rauchens mit weniger Schadstoffen",
        answerD = "Das Rauchen von Kraeuterprodukten",
        correctAnswer = 1,
        explanation = "Passivrauchen bezeichnet das Einatmen von Tabakrauch aus der Umgebung durch Personen, die selbst nicht rauchen. Es ist ebenfalls gesundheitsschaedlich.",
        difficulty = 1,
        funFact = "Passivrauchen erhoet das Risiko fuer Lungenkrebs um etwa 25 % und fuer Herzerkrankungen um rund 30 %  -  auch wenn man selbst nie geraucht hat."
    ),

    // --- Alcohol effects on health ---

    Question(
        categoryId = 16,
        questionText = "Welches Organ baut Alkohol hauptsaechlich ab?",
        answerA = "Die Nieren",
        answerB = "Die Lunge",
        answerC = "Die Leber",
        answerD = "Der Magen",
        correctAnswer = 2,
        explanation = "Die Leber ist das Hauptorgan fuer den Alkoholabbau. Sie baut pro Stunde etwa 0,1 g Alkohol pro Kilogramm Koerpergewicht ab.",
        difficulty = 1,
        funFact = "Ein Glas Bier (0,5 l) benoetigt der Koerper eines Erwachsenen etwa 2-3 Stunden zum vollstaendigen Abbau  -  der Koerper kann diesen Prozess nicht beschleunigen."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist eine Leberzirrhose?",
        answerA = "Eine Infektion der Leber durch Viren",
        answerB = "Eine chronische Vernarbung des Lebergewebes, oft durch Alkohol",
        answerC = "Eine Entzuendung der Gallenblase",
        answerD = "Eine gutartige Schwellung der Leber",
        correctAnswer = 1,
        explanation = "Leberzirrhose ist ein fortgeschrittenes Stadium der Lebererkrankung, bei dem funktionsfaehiges Lebergewebe durch Narbengewebe ersetzt wird. Chronischer Alkoholmissbrauch ist eine Hauptursache.",
        difficulty = 1,
        funFact = "Die Leber ist das einzige menschliche Organ, das sich vollstaendig regenerieren kann  -  aber nur wenn der schadliche Einfluss (z.B. Alkohol) rechtzeitig gestoppt wird."
    ),

    Question(
        categoryId = 16,
        questionText = "Welche Auswirkung hat Alkohol auf das Gehirn?",
        answerA = "Er verbessert die Konzentration",
        answerB = "Er hemmt die Gehirnfunktion und verlangsamt Reaktionen",
        answerC = "Er macht das Gehirn groesser",
        answerD = "Er hat keinen Einfluss auf das Gehirn",
        correctAnswer = 1,
        explanation = "Alkohol hemmt die Aktivitaet des zentralen Nervensystems. Er verlangsamt Reaktionen, beeintraechtigt das Urteilsvermoegen und kann bei hohen Mengen zu Bewusstlosigkeit fuehren.",
        difficulty = 1,
        funFact = "Schon ab einem Blutalkoholgehalt von 0,3 Promille nimmt die Sehscharfe und die Reaktionsgeschwindigkeit messbar ab  -  auch wenn man sich noch fit fuehlt."
    ),

    Question(
        categoryId = 16,
        questionText = "Ist Alkohol in der Schwangerschaft gefaehrlich?",
        answerA = "Nein, kleine Mengen sind unbedenklich",
        answerB = "Nur im ersten Trimester",
        answerC = "Ja, es gibt keine sichere Menge Alkohol in der Schwangerschaft",
        answerD = "Nur Spirituosen sind schaedlich, Bier und Wein nicht",
        correctAnswer = 2,
        explanation = "Es gibt keine als sicher geltende Alkoholmenge waehrend der Schwangerschaft. Alkohol kann das Ungeborene schwer schaedigen und das Fetale Alkoholsyndrom ausloesen.",
        difficulty = 1,
        funFact = "Fetales Alkoholsyndrom (FAS) ist die haeufigste nicht-genetische geistige Behinderung in Deutschland und waere durch vollstaendigen Alkoholverzicht in der Schwangerschaft vollstaendig vermeidbar."
    ),

    Question(
        categoryId = 16,
        questionText = "Was bedeutet 'nuechtern' beim Arzttermin?",
        answerA = "Dass man muede ist",
        answerB = "Dass man vor der Untersuchung nichts gegessen oder getrunken hat (ausser Wasser)",
        answerC = "Dass man keinen Alkohol getrunken hat",
        answerD = "Dass man alleine zum Arzt geht",
        correctAnswer = 1,
        explanation = "Nuechtern zu sein bedeutet in der Medizin, dass man vor einer Blutuntersuchung oder Operation fuer eine bestimmte Zeit (meistens 8-12 Stunden) nichts gegessen hat.",
        difficulty = 1,
        funFact = "Nuechternes Blut liefert genauere Messwerte fuer Blutzucker und Blutfette, weil Mahlzeiten diese Werte voruebergehend veraendern koennen."
    ),

    // --- Additional prevention and medical knowledge ---

    Question(
        categoryId = 16,
        questionText = "Was ist eine Vorsorgeuntersuchung?",
        answerA = "Eine Untersuchung nach einer schweren Erkrankung",
        answerB = "Eine regelmaessige Untersuchung zur Frueherkennung von Krankheiten",
        answerC = "Eine Untersuchung vor einem Auslandsflug",
        answerD = "Eine Untersuchung nur fuer aeltere Menschen",
        correctAnswer = 1,
        explanation = "Vorsorgeuntersuchungen dienen dazu, Krankheiten fruehzeitig zu erkennen, bevor sie Symptome verursachen. Fruehzeitige Erkennung verbessert Heilungschancen erheblich.",
        difficulty = 1,
        funFact = "In Deutschland hat jeder gesetzlich Versicherte ab 35 Jahren alle zwei Jahre Anspruch auf einen kostenlosen Gesundheits-Check-up beim Hausarzt."
    ),

    Question(
        categoryId = 16,
        questionText = "Was misst ein Blutdruckmessgeraet?",
        answerA = "Den Zuckergehalt im Blut",
        answerB = "Die Temperatur des Blutes",
        answerC = "Den Druck, den das Herz beim Pumpen auf die Arterien ausuegt",
        answerD = "Die Anzahl der roten Blutkoerperchen",
        correctAnswer = 2,
        explanation = "Der Blutdruck misst, mit welchem Druck das Herz das Blut durch die Blutgefaesse pumpt. Er wird als zwei Werte angegeben: systolisch (Herzkontraktion) und diastolisch (Herzentspannung).",
        difficulty = 1,
        funFact = "Ein normaler Blutdruck liegt bei etwa 120/80 mmHg. Bluthochdruck (ueber 140/90 mmHg) wird 'stiller Killer' genannt, weil er oft keine Symptome hat."
    ),

    Question(
        categoryId = 16,
        questionText = "Welche Notfall-Rufnummer gilt fuer den Krankenwagen in Deutschland?",
        answerA = "110",
        answerB = "112",
        answerC = "116 117",
        answerD = "115",
        correctAnswer = 1,
        explanation = "Die Notrufnummer 112 gilt in ganz Deutschland und der EU fuer Feuerwehr und Rettungsdienst. Sie ist kostenlos und rund um die Uhr erreichbar.",
        difficulty = 1,
        funFact = "Die 112 ist in der gesamten Europaeischen Union einheitlich als Notrufnummer festgelegt  -  so kann man auch im EU-Ausland im Notfall helfen oder Hilfe rufen."
    ),

    Question(
        categoryId = 16,
        questionText = "Was ist der aerztliche Bereitschaftsdienst (116 117)?",
        answerA = "Der Notruf fuer lebensbedrohliche Situationen",
        answerB = "Ein aerztlicher Dienst ausserhalb der Praxisoeffnungszeiten fuer nicht-lebensbedrohliche Beschwerden",
        answerC = "Eine Hotline fuer psychische Probleme",
        answerD = "Der Termin-Service fuer Krankenhaeuser",
        correctAnswer = 1,
        explanation = "Der aerztliche Bereitschaftsdienst (116 117) ist fuer medizinische Faelle gedacht, die nicht lebensbedrohlich sind, aber nicht bis zum naechsten Arztbesuch warten koennen.",
        difficulty = 1,
        funFact = "Der aerztliche Bereitschaftsdienst ist abends, am Wochenende und an Feiertagen erreichbar  -  also genau dann, wenn normale Arztpraxen geschlossen sind."
    ),

)
