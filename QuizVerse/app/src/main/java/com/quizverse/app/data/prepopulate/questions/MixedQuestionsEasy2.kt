package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun mixedQuestionsEasy2(): List<Question> = listOf(

    // Question 1 — Redewendung: Schwein haben
    Question(
        categoryId = 11,
        questionText = "Was bedeutet die Redewendung \"Schwein haben\"?",
        answerA = "Ein Haustier besitzen",
        answerB = "Unerwartetes Glueck haben",
        answerC = "Sehr viel essen",
        answerD = "Schmutzig sein",
        correctAnswer = 1,
        explanation = "\"Schwein haben\" bedeutet, unerwartetes Glueck gehabt zu haben. Die Redewendung stammt aus dem Mittelalter, als das Schwein als Trostpreis bei Wettkämpfen vergeben wurde und als Symbol fuer Wohlstand und Glueck galt.",
        difficulty = 1,
        funFact = "Wer beim mittelalterlichen Wettbewerb als Letzter das Ziel erreichte, bekam kein Preisgeld, sondern ein lebendiges Schwein — dennoch war das ein Gewinn, denn das Schwein war viel wert."
    ),

    // Question 2 — Sprichwort: Morgenstund
    Question(
        categoryId = 11,
        questionText = "Wie lautet das Sprichwort vollstaendig: \"Morgenstund hat ...\"?",
        answerA = "... Silber im Mund",
        answerB = "... Gold im Mund",
        answerC = "... Kraft im Leib",
        answerD = "... Freude im Sinn",
        correctAnswer = 1,
        explanation = "Das Sprichwort lautet \"Morgenstund hat Gold im Mund\" und bedeutet, dass fruehes Aufstehen und fruehzeitiges Handeln Vorteile bringen. Es ermutigt dazu, den Tag frueh zu beginnen.",
        difficulty = 1,
        funFact = "Das Sprichwort gibt es in aehnlicher Form auch in vielen anderen Sprachen, z.B. auf Englisch als \"The early bird catches the worm\" (Der fruehe Vogel faengt den Wurm)."
    ),

    // Question 3 — Redewendung: Katze aus dem Sack lassen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"die Katze aus dem Sack lassen\"?",
        answerA = "Einem Tier helfen",
        answerB = "Etwas geheimhalten",
        answerC = "Ein Geheimnis lueften oder die Wahrheit sagen",
        answerD = "Einkaufen gehen",
        correctAnswer = 2,
        explanation = "\"Die Katze aus dem Sack lassen\" bedeutet, ein Geheimnis zu verraten oder die Wahrheit ans Licht zu bringen. Frueher tauschten Haendler Katzen gegen Ferkel aus — wer den Sack oeffnete, erfuhr den Betrug.",
        difficulty = 1,
        funFact = "Die englische Entsprechung \"let the cat out of the bag\" hat denselben Ursprung: Betruegende Haendler steckten Katzen in Saecke statt der versprochenen Ferkel."
    ),

    // Question 4 — Sprichwort: Apfel
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Der Apfel faellt nicht weit vom Stamm\"?",
        answerA = "Aepfel wachsen nah am Baum",
        answerB = "Kinder aehneln oft ihren Eltern",
        answerC = "Gesunde Ernaehrung ist wichtig",
        answerD = "Arbeit lohnt sich immer",
        correctAnswer = 1,
        explanation = "Das Sprichwort bedeutet, dass Kinder oft die Eigenschaften ihrer Eltern uebernehmen. So wie ein Apfel nahe beim Baum landet, von dem er faellt, bleiben Kinder ihren Eltern charakterlich aehnlich.",
        difficulty = 1
    ),

    // Question 5 — Redewendung: Daumen druecken
    Question(
        categoryId = 11,
        questionText = "Was macht man, wenn man jemandem \"die Daumen drueckt\"?",
        answerA = "Man ist wuetend auf ihn",
        answerB = "Man wuenscht ihm Glueck",
        answerC = "Man kritisiert ihn",
        answerD = "Man hilft ihm bei der Arbeit",
        correctAnswer = 1,
        explanation = "\"Jemandem die Daumen druecken\" bedeutet, ihm Glueck zu wuenschen. Die Geste stammt aus der Antike: Beim roemischen Gladiatorenkampf drueckten Zuschauer den Daumen ein, um das Leben des Kaempfers zu schuetzen.",
        difficulty = 1,
        funFact = "Der weitverbreitete Glaube, erhobener Daumen haette im antiken Rom \"Leben verschonen\" bedeutet, ist ein Mythos — Historiker streiten sich noch heute ueber die genaue Bedeutung der Geste."
    ),

    // Question 6 — Redewendung: Holzweg
    Question(
        categoryId = 11,
        questionText = "Woher stammt die Redewendung \"auf dem Holzweg sein\"?",
        answerA = "Vom Bau von Holzhaeusern",
        answerB = "Von Waldwegen, die nur zum Holzeinschlag fuehrten",
        answerC = "Von alten Holzspielzeug-Haendlern",
        answerD = "Von mittelalterlichen Zimmermaeistern",
        correctAnswer = 1,
        explanation = "Ein Holzweg war urspruenglich ein Weg im Wald, der nur fuer das Herausfahren von Holz angelegt wurde und in einer Sackgasse endete. Wer einem Holzweg folgte, kam nirgendwo an — daher bedeutet es heute, falsch zu liegen.",
        difficulty = 1
    ),

    // Question 7 — Redewendung: Leine ziehen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Leine ziehen\"?",
        answerA = "Einen Hund ausführen",
        answerB = "Schnell verschwinden oder weggehen",
        answerC = "Jemanden zurechtzuweisen",
        answerD = "Ein Boot anhaengen",
        correctAnswer = 1,
        explanation = "\"Leine ziehen\" ist eine umgangssprachliche Redewendung und bedeutet, rasch das Weite zu suchen oder einen Ort schnell zu verlassen. Die Herkunft ist unklar, vermutlich aus der Schifffahrt.",
        difficulty = 1
    ),

    // Question 8 — Sprichwort: Vogel
    Question(
        categoryId = 11,
        questionText = "Wie lautet das Sprichwort vollstaendig: \"Der fruehe Vogel faengt ...\"?",
        answerA = "... den Wurm",
        answerB = "... die Muecke",
        answerC = "... das Glueck",
        answerD = "... den Fisch",
        correctAnswer = 0,
        explanation = "\"Der fruehe Vogel faengt den Wurm\" bedeutet, dass Menschen, die frueh aufstehen und rechtzeitig handeln, Vorteile gegenueber anderen haben. Es ist das deutsche Pendant zu \"The early bird catches the worm\".",
        difficulty = 1,
        funFact = "In der Natur stimmt das tatsaechlich: Voegel, die frueh morgens auf Nahrungssuche gehen, finden mehr Wurmer, die nach der kuehlen Nacht noch nah an der Erdoberfleche liegen."
    ),

    // Question 9 — Redewendung: Kerbholz
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"etwas auf dem Kerbholz haben\"?",
        answerA = "Handwerklich begabt sein",
        answerB = "Schulden oder Vergehen auf sich geladen haben",
        answerC = "Gutes getan haben",
        answerD = "In einem Wald wohnen",
        correctAnswer = 1,
        explanation = "Ein Kerbholz war bis ins 18. Jahrhundert ein echter Schuldenstab: Haendler kerbten Schulden in Holz. Wer also \"etwas auf dem Kerbholz hat\", traegt Vergehen oder Schulden mit sich — heute meist im uebertragenem Sinne.",
        difficulty = 1,
        funFact = "Das Kerbholz wurde einmal laengs gespalten — Glaeubiger und Schuldner behielten je eine Haelfte. Beim Abgleich mussten die Kerben genau uebereinstimmen, sonst war Betrug beweisbar."
    ),

    // Question 10 — Sprichwort: Lügen
    Question(
        categoryId = 11,
        questionText = "Welches Sprichwort bedeutet, dass Luegen langfristig nicht helfen?",
        answerA = "Wer lacht, hat Recht",
        answerB = "Luegen haben kurze Beine",
        answerC = "Der Kluge gibt nach",
        answerD = "Reden ist Silber, Schweigen ist Gold",
        correctAnswer = 1,
        explanation = "\"Luegen haben kurze Beine\" bedeutet, dass Luegen nicht weit kommen — sie werden frueh aufgedeckt. Das Sprichwort warnt davor, die Unwahrheit zu sagen, weil sie sich selten lange verbergen laesst.",
        difficulty = 1
    ),

    // Question 11 — Redewendung: Bahnhof verstehen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Ich verstehe nur Bahnhof\"?",
        answerA = "Man kennt sich mit Zuegen aus",
        answerB = "Man versteht gar nichts von dem Gesagten",
        answerC = "Man will nach Hause fahren",
        answerD = "Man laeuft sehr schnell",
        correctAnswer = 1,
        explanation = "\"Ich verstehe nur Bahnhof\" bedeutet, dass man etwas ueberhaupt nicht versteht. Die Redewendung stammt aus dem Ersten Weltkrieg: Muede Soldaten wollten nur noch das Wort 'Bahnhof' hoeren, das fuer sie Heimfahrt bedeutete — alles andere war ihnen gleichgueltig.",
        difficulty = 1,
        funFact = "Die Redewendung ist ein seltenes Beispiel fuer eine Redensart, deren Entstehungsjahr und Kontext historisch sehr genau belegt ist: Erster Weltkrieg, ca. 1917-1918."
    ),

    // Question 12 — Redewendung: Lanze brechen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"fuer jemanden eine Lanze brechen\"?",
        answerA = "Jemanden herausfordern",
        answerB = "Jemanden verteidigen oder unterstuetzen",
        answerC = "Jemanden verletzen",
        answerD = "Mit jemandem streiten",
        correctAnswer = 1,
        explanation = "\"Eine Lanze fuer jemanden brechen\" bedeutet, fuer ihn einzutreten oder ihn zu verteidigen. Im Mittelalter kaempften Ritter beim Turnier fuer andere, oft fuer eine Dame — dabei zerbrach haeufig die gegnerische Lanze am eigenen Schild.",
        difficulty = 1
    ),

    // Question 13 — Sprichwort: Ende gut
    Question(
        categoryId = 11,
        questionText = "Wie endet das Sprichwort \"Ende gut, ...\"?",
        answerA = "... alles besser",
        answerB = "... alles gut",
        answerC = "... nichts bereut",
        answerD = "... Gott sei Dank",
        correctAnswer = 1,
        explanation = "\"Ende gut, alles gut\" bedeutet, dass ein gutes Ergebnis alle vorherigen Schwierigkeiten wettmacht. Das Sprichwort hat seinen Ursprung im gleichnamigen Theaterstueck von William Shakespeare.",
        difficulty = 1
    ),

    // Question 14 — Redewendung: Ariadne-Faden
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"den Faden verlieren\"?",
        answerA = "Beim Naehen einen Fehler machen",
        answerB = "Den roten Faden in einer Rede oder Geschichte verlieren",
        answerC = "Eine Freundschaft beenden",
        answerD = "Beim Sport ausscheiden",
        correctAnswer = 1,
        explanation = "\"Den Faden verlieren\" bedeutet, den Gedankengang zu verlieren oder nicht mehr zu wissen, worüber man spricht. Die Redewendung geht auf den Faden der Ariadne in der griechischen Mythologie zurueck, mit dem Theseus den Weg aus dem Labyrinth fand.",
        difficulty = 1,
        funFact = "Ariadne war die Tochter des Koenigs Minos. Sie gab Theseus den Faden, damit er nach dem Kampf mit dem Minotaurus wieder aus dem Labyrinth herausfinden konnte."
    ),

    // Question 15 — Redewendung: Butter
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"alles in Butter\"?",
        answerA = "Alles ist fettig und schwer",
        answerB = "Alles ist in Ordnung und gut",
        answerC = "Alles ist sehr teuer",
        answerD = "Alles ist verbrannt",
        correctAnswer = 1,
        explanation = "\"Alles in Butter\" bedeutet, dass alles in Ordnung ist. Die Redewendung stammt moeglicherweise aus dem Mittelalter: Wertvolle Glaswaren wurden in Butterfaessern transportiert, da die Butter als Schutz gegen Bruch diente — kam alles heil an, war buchstaeblich alles in Butter.",
        difficulty = 1
    ),

    // Question 16 — Sprichwort: Stille Wasser
    Question(
        categoryId = 11,
        questionText = "Was bedeutet das Sprichwort \"Stille Wasser sind tief\"?",
        answerA = "Seen sind meist sehr tief",
        answerB = "Ruhige, stille Menschen haben oft viel Tiefgang oder ueberraschen einen",
        answerC = "Leise Menschen sind gute Schwimmer",
        answerD = "Im Wald ist es besonders still",
        correctAnswer = 1,
        explanation = "\"Stille Wasser sind tief\" bedeutet, dass ruhige und zurueckhaltende Menschen oft komplexer oder gefaehrlicher sind, als sie auf den ersten Blick wirken. Ruhige Gewaesser koennen taeuschen — genau wie stille Menschen.",
        difficulty = 1
    ),

    // Question 17 — Redewendung: lange Bank
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"etwas auf die lange Bank schieben\"?",
        answerA = "Etwas sehr sorgfaeltig vorbereiten",
        answerB = "Etwas immer wieder verschieben und hinauszuegern",
        answerC = "Etwas schnell erledigen",
        answerD = "Etwas vergessen",
        correctAnswer = 1,
        explanation = "\"Auf die lange Bank schieben\" bedeutet, etwas zu verschieben oder hinauszuzoegern. Im Mittelalter wurden Gerichtsakten, fuer die kein Regal vorhanden war, auf lange Holzbaenke gelegt — und blieben dort oft sehr lange liegen.",
        difficulty = 1,
        funFact = "Die Redewendung ist eines der aeltesten belegten deutschen Sprichwörter und findet sich bereits in Texten aus dem 16. Jahrhundert."
    ),

    // Question 18 — Redewendung: Eselsbruecke
    Question(
        categoryId = 11,
        questionText = "Was ist eine \"Eselsbruecke\"?",
        answerA = "Ein Brueckentyp in alten Staedten",
        answerB = "Eine Gedaechtnishilfe oder ein Merksatz",
        answerC = "Ein Weg fuer Tiere",
        answerD = "Ein altes Sprichwort",
        correctAnswer = 1,
        explanation = "Eine Eselsbruecke ist eine Merkhilfe oder ein Eselsmerker. Der Begriff kommt daher, dass Esel sich weigern, ueber Bruecken zu gehen, die ihr Spiegelbild im Wasser zeigen — man braucht also einen Umweg oder eine Hilfskonstruktion.",
        difficulty = 1
    ),

    // Question 19 — Sprichwort: Vorsicht
    Question(
        categoryId = 11,
        questionText = "Welches Sprichwort passt zur Aussage: Besser nicht zu viel riskieren?",
        answerA = "Wer wagt, gewinnt",
        answerB = "Vorsicht ist die Mutter der Porzellankiste",
        answerC = "Der Kluegere gibt nach",
        answerD = "Ohne Fleiss kein Preis",
        correctAnswer = 1,
        explanation = "\"Vorsicht ist die Mutter der Porzellankiste\" bedeutet, dass Vorsicht dabei hilft, Schaeden zu vermeiden. Porzellan ist sehr zerbrechlich — wer nicht vorsichtig ist, riskiert, dass es kaputtgeht.",
        difficulty = 1
    ),

    // Question 20 — Redewendung: Honig
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"jemandem Honig um den Bart schmieren\"?",
        answerA = "Jemandem beim Essen helfen",
        answerB = "Jemandem schmeicheln, um etwas zu erreichen",
        answerC = "Jemanden zum Lachen bringen",
        answerD = "Jemanden grob kritisieren",
        correctAnswer = 1,
        explanation = "\"Jemandem Honig um den Bart schmieren\" bedeutet, jemanden absichtlich zu schmeicheln, um ihn guenstig zu stimmen oder etwas von ihm zu wollen. Honig ist suess — und suesse Worte sollen jemanden weich machen.",
        difficulty = 1
    ),

    // Question 21 — Sprichwort: Hunger
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Hunger ist der beste Koch\"?",
        answerA = "Koechinnen und Koeche sollen hungrig arbeiten",
        answerB = "Wenn man sehr hungrig ist, schmeckt alles besonders gut",
        answerC = "Gutes Essen braucht Zeit",
        answerD = "Essen sollte nicht verschwenderisch sein",
        correctAnswer = 1,
        explanation = "\"Hunger ist der beste Koch\" bedeutet, dass Speisen viel besser schmecken, wenn man grosse Hungrig ist. Der Hunger verstaerkt den Genuss des Essens erheblich.",
        difficulty = 1
    ),

    // Question 22 — Redewendung: Frosch im Hals
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"einen Frosch im Hals haben\"?",
        answerA = "Sehr laut sprechen koennen",
        answerB = "Heiser sein oder Beschwerden beim Sprechen haben",
        answerC = "Angst vor Fröschen haben",
        answerD = "Ein besonders guter Saenger sein",
        correctAnswer = 1,
        explanation = "\"Einen Frosch im Hals haben\" bedeutet, heiser zu sein oder Schluckbeschwerden zu haben. Das Quaken des Frosches klingt aehnlich wie eine heisere Stimme — daher das Bild des Frosches im Hals.",
        difficulty = 1,
        funFact = "Im Englischen gibt es die sehr aehnliche Redewendung \"a frog in your throat\", was zeigt, dass dieses Sprachbild in vielen Kulturen verbreitet ist."
    ),

    // Question 23 — Redewendung: saurer Apfel
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"in den sauren Apfel beissen\"?",
        answerA = "Etwas Gesundes essen, obwohl man es nicht mag",
        answerB = "Eine unangenehme Sache akzeptieren, weil es keine andere Wahl gibt",
        answerC = "Jemanden stark kritisieren",
        answerD = "Sehr geizig sein",
        correctAnswer = 1,
        explanation = "\"In den sauren Apfel beissen\" bedeutet, etwas Unangenehmes in Kauf zu nehmen, weil man keine andere Wahl hat. Wie ein saurer Apfel schmeckt unangenehm — aber manchmal muss man eben beissen.",
        difficulty = 1
    ),

    // Question 24 — Sprichwort: Reden
    Question(
        categoryId = 11,
        questionText = "Wie lautet das Sprichwort vollstaendig: \"Reden ist Silber, Schweigen ist ...\"?",
        answerA = "... Bronze",
        answerB = "... Platin",
        answerC = "... Gold",
        answerD = "... Diamant",
        correctAnswer = 2,
        explanation = "\"Reden ist Silber, Schweigen ist Gold\" bedeutet, dass es oft klueger ist, zu schweigen als zu reden. Das Sprichwort stammt aus dem arabischen Raum und wurde im 19. Jahrhundert von Thomas Carlyle auf Englisch popularisiert.",
        difficulty = 1
    ),

    // Question 25 — Redewendung: A und O
    Question(
        categoryId = 11,
        questionText = "Woher stammt die Redewendung \"das A und O\"?",
        answerA = "Aus der griechischen Mathematik",
        answerB = "Aus dem deutschen Alphabet",
        answerC = "Aus der Bibel, erster und letzter Buchstabe des griechischen Alphabets",
        answerD = "Aus dem roemischen Recht",
        correctAnswer = 2,
        explanation = "\"Das A und O\" stammt aus der Bibel: A steht fuer Alpha und O fuer Omega — der erste und letzte Buchstabe des griechischen Alphabets. In der Offenbarung des Johannes nennt Gott sich selbst \"das Alpha und das Omega\". Heute bedeutet es: das Wesentlichste.",
        difficulty = 1,
        funFact = "Im Griechischen ist Alpha (Α) der erste und Omega (Ω) der letzte Buchstabe — zusammen stehen sie fuer Anfang und Ende, also fuer alles Vollstaendige."
    ),

    // Question 26 — Redewendung: Wasser gewaschen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"mit allen Wassern gewaschen sein\"?",
        answerA = "Besonders sauber und ordentlich sein",
        answerB = "Sehr erfahren und durchtrieben sein",
        answerC = "Gerne schwimmen gehen",
        answerD = "Sehr jung und unerfahren sein",
        correctAnswer = 1,
        explanation = "\"Mit allen Wassern gewaschen\" bedeutet, sehr erfahren, schlau und manchmal auch listig zu sein. Urspruenglich bezog sich die Redewendung auf Seefahrer, die auf allen sieben Weltmeeren unterwegs waren und dadurch grosse Erfahrung besassen.",
        difficulty = 1
    ),

    // Question 27 — Redewendung: Boden unter den Fuessen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"den Boden unter den Fuessen verlieren\"?",
        answerA = "Ausrutschen oder fallen",
        answerB = "Die Kontrolle und Sicherheit verlieren",
        answerC = "Sehr schnell rennen",
        answerD = "Ein Grundstueck verkaufen",
        correctAnswer = 1,
        explanation = "\"Den Boden unter den Fuessen verlieren\" bedeutet, die Orientierung, Stabilitaet oder Sicherheit zu verlieren. Der Boden steht metaphorisch fuer festen Halt im Leben.",
        difficulty = 1
    ),

    // Question 28 — Sprichwort: Kleider
    Question(
        categoryId = 11,
        questionText = "Was bedeutet das Sprichwort \"Kleider machen Leute\"?",
        answerA = "Kleidung ist sehr teuer",
        answerB = "Das Aeussere beeinflusst, wie andere uns wahrnehmen",
        answerC = "Schneiderei ist ein wichtiger Beruf",
        answerD = "Man soll sich immer gut anziehen",
        correctAnswer = 1,
        explanation = "\"Kleider machen Leute\" bedeutet, dass das aeussere Erscheinungsbild den Eindruck praegt, den andere von uns bekommen. Gottfried Keller schrieb 1874 eine beruehmt gewordene Novelle genau mit diesem Titel.",
        difficulty = 1,
        funFact = "Gottfried Kellers Novelle \"Kleider machen Leute\" erzaehlt von einem mittellosen Schneider, der wegen seiner eleganten Kleidung fuer einen Grafen gehalten wird."
    ),

    // Question 29 — Redewendung: Loewenanteil
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"den Loewenanteil bekommen\"?",
        answerA = "Den kleinsten Teil erhalten",
        answerB = "Den groessten und besten Teil erhalten",
        answerC = "Gleich viel wie alle anderen bekommen",
        answerD = "Leer ausgehen",
        correctAnswer = 1,
        explanation = "\"Den Loewenanteil bekommen\" bedeutet, den groessten oder besten Teil von etwas zu erhalten. Der Loewe als Koenig der Tiere beansprucht in der Fabel des Aesop den groessten Anteil der Beute fuer sich.",
        difficulty = 1
    ),

    // Question 30 — Sprichwort: Geduld
    Question(
        categoryId = 11,
        questionText = "Was bedeutet das Sprichwort \"Gut Ding will Weile haben\"?",
        answerA = "Gute Dinge sind teuer",
        answerB = "Qualitaet braucht Zeit und Sorgfalt",
        answerC = "Man soll geduldig auf andere warten",
        answerD = "Gute Freundschaften halten lange",
        correctAnswer = 1,
        explanation = "\"Gut Ding will Weile haben\" bedeutet, dass etwas Gutes Zeit braucht. Wer hastig arbeitet, macht Fehler — Qualitaet entsteht durch Sorgfalt und Zeit.",
        difficulty = 1
    ),

    // Question 31 — Redewendung: Tinte gesoffen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Du hast wohl Tinte gesoffen!\"?",
        answerA = "Du bist besonders schlau",
        answerB = "Du redest oder schreibst wirres Zeug",
        answerC = "Du bist sehr durstig",
        answerD = "Du musst zum Arzt",
        correctAnswer = 1,
        explanation = "\"Tinte gesoffen haben\" ist ein umgangssprachlicher Ausdruck dafuer, dass jemand Unsinn redet oder schreibt. Tinte zu trinken waere absurd — ebenso wie das, was jemand sagt.",
        difficulty = 1
    ),

    // Question 32 — Sprichwort: Übung
    Question(
        categoryId = 11,
        questionText = "Wie lautet das Sprichwort zur Wichtigkeit von Ueben?",
        answerA = "Wer viel arbeitet, verdient viel",
        answerB = "Uebung macht den Meister",
        answerC = "Lernen ist wie Rudern gegen den Strom",
        answerD = "Fleiss und Glueck kommen zusammen",
        correctAnswer = 1,
        explanation = "\"Uebung macht den Meister\" bedeutet, dass regelmaessiges Ueben die wichtigste Voraussetzung ist, um in einer Taetigkeit sehr gut zu werden. Talent allein reicht nicht — Ausdauer und Wiederholung sind entscheidend.",
        difficulty = 1
    ),

    // Question 33 — Redewendung: Wasser auf die Muehle
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Das ist Wasser auf meine Muehle\"?",
        answerA = "Es regnet sehr stark",
        answerB = "Eine Information oder ein Ereignis unterstuetzt die eigene Meinung",
        answerC = "Man arbeitet sehr hart",
        answerD = "Man wird von jemandem kritisiert",
        correctAnswer = 1,
        explanation = "\"Das ist Wasser auf meine Muehle\" bedeutet, dass etwas die eigene Position oder Argumentation staerkt. Eine Wassermuehle braucht Wasser zum Arbeiten — hilfreiche Informationen sind wie Wasser, das die eigene Muehle antreibt.",
        difficulty = 1,
        funFact = "Wassermuehlen waren im Mittelalter zentrale Technologie — wer die Muehle kontrolliertete, hatte Macht. Die Metapher zeigt, wie tief Muehlen in der deutschen Kultur verwurzelt waren."
    ),

    // Question 34 — Redewendung: Hals und Beinbruch
    Question(
        categoryId = 11,
        questionText = "Was wuenscht man jemandem, wenn man sagt \"Hals- und Beinbruch\"?",
        answerA = "Man wuenscht ihm Verletzungen",
        answerB = "Man wuenscht ihm viel Glueck und Erfolg",
        answerC = "Man will, dass er vorsichtig ist",
        answerD = "Man verabschiedet sich fuer immer",
        correctAnswer = 1,
        explanation = "\"Hals- und Beinbruch\" ist ein Glueckwunsch, der Erfolg wuenscht — obwohl er wie eine Verwuenschung klingt. Der Ursprung ist unklar; eine Theorie besagt, der Ausdruck leite sich aus dem Hebraeischen ab (\"hazlacha u-vracha\" = Glueck und Segen).",
        difficulty = 1
    ),

    // Question 35 — Sprichwort: Eile
    Question(
        categoryId = 11,
        questionText = "Was bedeutet das Sprichwort \"Eile mit Weile\"?",
        answerA = "Man soll immer schnell handeln",
        answerB = "Man kommt weiter, wenn man bedacht und nicht gehetzt vorgeht",
        answerC = "Schnelle Menschen sind erfolgreicher",
        answerD = "Man soll nie zoegern",
        correctAnswer = 1,
        explanation = "\"Eile mit Weile\" ist ein paradox klingendes Sprichwort und bedeutet, dass man mit Bedacht und ohne Hast schneller zum Ziel kommt. Wer hastig vorgeht, macht oft Fehler, die Zeit kosten.",
        difficulty = 1
    ),

    // Question 36 — Redewendung: Nase vorn
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"die Nase vorn haben\"?",
        answerA = "Einen grossen Geruchssinn haben",
        answerB = "Im Vorteil oder fuehrend sein",
        answerC = "Sehr selbstbewusst auftreten",
        answerD = "Besonders neugierig sein",
        correctAnswer = 1,
        explanation = "\"Die Nase vorn haben\" bedeutet, einen Vorsprung oder Vorteil gegenueber anderen zu haben. Das Bild stammt vom Pferderennen: Das Pferd, dessen Nase zuerst die Ziellinie ueberquert, gewinnt.",
        difficulty = 1
    ),

    // Question 37 — Sprichwort: Spatz
    Question(
        categoryId = 11,
        questionText = "Wie lautet das Sprichwort ueber den Spatz auf dem Dach?",
        answerA = "\"Ein Spatz in der Hand ist besser als die Taube auf dem Dach\"",
        answerB = "\"Der Spatz kennt sein Dach\"",
        answerC = "\"Spatzen fliegen am hoechsten\"",
        answerD = "\"Lieber ein Spatz als gar kein Vogel\"",
        correctAnswer = 0,
        explanation = "Das Sprichwort lautet \"Besser ein Spatz in der Hand als eine Taube auf dem Dach\" und bedeutet, dass ein sicherer kleiner Vorteil besser ist als ein grosser, aber ungewisser. Das Sichere ist wertvoller als das Erhoffte.",
        difficulty = 1,
        funFact = "Im Englischen heisst es \"A bird in the hand is worth two in the bush\" — dieselbe Aussage, aber ohne den spezifischen Vergleich von Spatz und Taube."
    ),

    // Question 38 — Redewendung: Katz und Maus
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Katz und Maus spielen\"?",
        answerA = "Ein Kinderspiel spielen",
        answerB = "Jemanden durch Hin-und-Her-Taktieren in der Schwebe halten",
        answerC = "Sehr schnell laufen",
        answerD = "Freunde sein, obwohl man Feinde sind",
        correctAnswer = 1,
        explanation = "\"Katz und Maus spielen\" bedeutet, jemanden absichtlich in Ungewissheit zu lassen oder durch taktisches Verhalten zu quaelen — wie eine Katze, die eine Maus nicht sofort toetet, sondern erst damit spielt.",
        difficulty = 1
    ),

    // Question 39 — Sprichwort: Viele Koeche
    Question(
        categoryId = 11,
        questionText = "Was bedeutet das Sprichwort \"Viele Koeche verderben den Brei\"?",
        answerA = "Kochen macht Spass in der Gruppe",
        answerB = "Wenn zu viele mitreden, geht etwas schief",
        answerC = "Brei ist schwer zu kochen",
        answerD = "Man braucht einen erfahrenen Koch",
        correctAnswer = 1,
        explanation = "\"Viele Koeche verderben den Brei\" bedeutet, dass zu viele Beteiligte mit unterschiedlichen Ideen ein Vorhaben verschlechtern koennen. Zu viele Entscheider fuehren zu Chaos statt zu einem guten Ergebnis.",
        difficulty = 1
    ),

    // Question 40 — Redewendung: Schwamm drueber
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Schwamm drueber!\"?",
        answerA = "Man soll etwas saeubern",
        answerB = "Man soll eine Sache vergessen und vergeben",
        answerC = "Man soll etwas genau untersuchen",
        answerD = "Man soll aufhoeren zu reden",
        correctAnswer = 1,
        explanation = "\"Schwamm drueber!\" bedeutet, etwas abzuhaken, zu vergessen und nicht mehr darueber nachzudenken. Wie ein Schwamm ueber eine Tafel wischt, wischt man die Angelegenheit aus dem Gedaechtnis.",
        difficulty = 1
    ),

    // Question 41 — Redewendung: Kirsche essen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Mit ihm ist nicht gut Kirschen essen\"?",
        answerA = "Er teilt sein Essen nicht",
        answerB = "Mit ihm ist schlecht auszukommen, er ist schwierig im Umgang",
        answerC = "Er mag keine Kirschen",
        answerD = "Er ist sehr geiztig beim Einkaufen",
        correctAnswer = 1,
        explanation = "\"Mit jemandem ist nicht gut Kirschen essen\" bedeutet, dass jemand schwierig und unangenehm im Umgang ist. Beim Kirschenessen koennten Kerne auf den anderen gespuckt werden — also ist es besser, auf Abstand zu bleiben.",
        difficulty = 1
    ),

    // Question 42 — Sprichwort: Wasser predigen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Wasser predigen und Wein trinken\"?",
        answerA = "Jemand mag sowohl Wasser als auch Wein",
        answerB = "Jemand handelt anders als er predigt — Doppelmoral",
        answerC = "Man soll maessig trinken",
        answerD = "Prediger trinken gerne Wein",
        correctAnswer = 1,
        explanation = "\"Wasser predigen und Wein trinken\" beschreibt Heuchelei: Man verlangt von anderen etwas, tut aber selbst das Gegenteil. Das Sprichwort prangert Doppelmoral an.",
        difficulty = 1
    ),

    // Question 43 — Redewendung: Den Nagel auf den Kopf treffen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"den Nagel auf den Kopf treffen\"?",
        answerA = "Handwerklich sehr geschickt sein",
        answerB = "Etwas genau richtig sagen oder treffen",
        answerC = "Jemanden verletzen",
        answerD = "Ein Spiel gewinnen",
        correctAnswer = 1,
        explanation = "\"Den Nagel auf den Kopf treffen\" bedeutet, etwas genau richtig zu sagen oder zu tun. Beim Haemmern eines Nagels muss man den Nagelkopf genau treffen — wer das schafft, macht es perfekt.",
        difficulty = 1
    ),

    // Question 44 — Sprichwort: Eulen nach Athen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"Eulen nach Athen tragen\"?",
        answerA = "Kluge Menschen unterstuetzen",
        answerB = "Etwas tun, das voellig ueberfluessig ist",
        answerC = "Tiere in die Stadt bringen",
        answerD = "Jemandem ein Geschenk machen",
        correctAnswer = 1,
        explanation = "\"Eulen nach Athen tragen\" bedeutet, etwas Ueberfluessiges zu tun. Athen hatte in der Antike so viele Eulen (Symbol der Stadt und der Goettin Athene), dass man dort keine brauchte — also ist es sinnlos, dort weitere hinzubringen.",
        difficulty = 1,
        funFact = "Die Eule war das Wappentier von Athen und stand fuer Weisheit. Sie war so haeufig in der Stadt, dass sogar Silbermuenzen mit einer Eule gepraegt wurden."
    ),

    // Question 45 — Redewendung: ins Fettnäpfchen treten
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"ins Fettnaepfchen treten\"?",
        answerA = "Beim Kochen einen Fehler machen",
        answerB = "Unbeabsichtigt jemanden verletzen oder eine peinliche Situation verursachen",
        answerC = "Schmutzig sein",
        answerD = "Bei einem Wettkampf verlieren",
        correctAnswer = 1,
        explanation = "\"Ins Fettnaepfchen treten\" bedeutet, aus Versehen etwas Taktloses zu sagen oder eine peinliche Situation zu verursachen. Frueher standen Fetttopfe zum Einreiben von Stiefeln auf dem Boden — wer hineintrat, machte sich die Schuhe schmutzig.",
        difficulty = 1
    ),

    // Question 46 — Sprichwort: Wer anderen eine Grube graebt
    Question(
        categoryId = 11,
        questionText = "Wie endet das Sprichwort \"Wer anderen eine Grube graebt, ...\"?",
        answerA = "... hat viel Arbeit",
        answerB = "... faellt selbst hinein",
        answerC = "... wird reich",
        answerD = "... ist kein guter Freund",
        correctAnswer = 1,
        explanation = "\"Wer anderen eine Grube graebt, faellt selbst hinein\" bedeutet, dass Bosheit und Intrigen auf denjenigen zurueckfallen, der sie plant. Boeses zu tun schadet letztlich einem selbst.",
        difficulty = 1
    ),

    // Question 47 — Redewendung: auf eigenen Beinen stehen
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"auf eigenen Beinen stehen\"?",
        answerA = "Sport treiben und kraeftig sein",
        answerB = "Selbststaendig und unabhaengig sein",
        answerC = "Gut tanzen koennen",
        answerD = "Alleine wohnen",
        correctAnswer = 1,
        explanation = "\"Auf eigenen Beinen stehen\" bedeutet, unabhaengig zu sein und sich selbst versorgen zu koennen, ohne die Hilfe anderer zu brauchen. Die Beine tragen einen selbst — man ist niemandem zur Stuetze angewiesen.",
        difficulty = 1
    ),

    // Question 48 — Sprichwort: Was du heute kannst besorgen
    Question(
        categoryId = 11,
        questionText = "Wie lautet das Sprichwort zur Aufschieberitis vollstaendig?",
        answerA = "\"Was du heute kannst besorgen, das verschiebe nicht auf morgen\"",
        answerB = "\"Was du heute tust, hilft dir morgen\"",
        answerC = "\"Heute fleissig, morgen gluecklich\"",
        answerD = "\"Morgen ist auch noch ein Tag\"",
        correctAnswer = 0,
        explanation = "\"Was du heute kannst besorgen, das verschiebe nicht auf morgen\" mahnt dazu, Aufgaben nicht aufzuschieben, sondern sie sofort zu erledigen. Es ist das Gegenteil von \"auf die lange Bank schieben\".",
        difficulty = 1
    ),

    // Question 49 — Redewendung: Bohei
    Question(
        categoryId = 11,
        questionText = "Was bedeutet \"viel Bohei um nichts machen\"?",
        answerA = "Fleissig und hart arbeiten",
        answerB = "Wegen einer Kleinigkeit unnoetig viel Aufhebens machen",
        answerC = "Laut und froelich feiern",
        answerD = "Wichtige Entscheidungen treffen",
        correctAnswer = 1,
        explanation = "\"Viel Bohei machen\" bedeutet, wegen einer unbedeutenden Sache unnoetig viel Aufruhr zu verursachen. Das Wort 'Bohei' stammt vom hebraeischen 'bohu' (Chaos, Leere) und kam ueber das Rotwelsch ins Deutsche.",
        difficulty = 1
    ),

    // Question 50 — Sprichwort: Wer nicht wagt
    Question(
        categoryId = 11,
        questionText = "Wie lautet das Sprichwort vollstaendig: \"Wer nicht wagt, ...\"?",
        answerA = "... der hat schon verloren",
        answerB = "... der nicht gewinnt",
        answerC = "... der lebt sicher",
        answerD = "... ist weise",
        correctAnswer = 1,
        explanation = "\"Wer nicht wagt, der nicht gewinnt\" bedeutet, dass man bereit sein muss, Risiken einzugehen, wenn man Erfolg haben will. Ohne Mut und Risikobereitschaft ist kein grosser Erfolg moeglich.",
        difficulty = 1,
        funFact = "Das englische Pendant lautet \"Nothing ventured, nothing gained\" — dasselbe Prinzip, das in unzaehligen Kulturen weltweit als Sprichwort existiert."
    )

)
