package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun mixedQuestionsEasy3(): List<Question> = listOf(

    // Question 1 — Erfindung: Gummibaerchen
    Question(
        categoryId = 11,
        questionText = "Wer erfand die Gummibaerchen?",
        answerA = "Hans Riegel aus Bonn",
        answerB = "August Storck aus Berlin",
        answerC = "Karl Haribo aus Koeln",
        answerD = "Fritz Wuerth aus Muenchen",
        correctAnswer = 0,
        explanation = "Hans Riegel gruendete 1920 die Firma HARIBO (HA-ns RI-egel BO-nn) und erfand 1922 die ersten Gummibaerchen. Er nannte sie urspruenglich 'Tanzbären'.",
        difficulty = 1,
        funFact = "HARIBO steht fuer HAns RIegel BOnn. Heute produziert HARIBO taeglich ueber 100 Millionen Gummibaerchen weltweit."
    ),

    // Question 2 — Erfindung: Fahrrad
    Question(
        categoryId = 11,
        questionText = "Wer erfand das erste Fahrrad (Laufmaschine)?",
        answerA = "Carl Benz",
        answerB = "Gottlieb Daimler",
        answerC = "Karl von Drais",
        answerD = "Ernst Abbe",
        correctAnswer = 2,
        explanation = "Karl von Drais baute 1817 die erste 'Laufmaschine', den Vorlaeufer des Fahrrads. Sie hatte noch keine Pedale — der Fahrer bewegte sich mit den Fuessen vom Boden ab.",
        difficulty = 1,
        funFact = "Die Laufmaschine wurde damals auch 'Draisine' genannt. Eine Hungersnot 1816 (verursacht durch den Vulkanausbruch des Tambora) liess viele Pferde sterben — das motivierte von Drais zur Erfindung."
    ),

    // Question 3 — Erfindung: Kaffeefilter
    Question(
        categoryId = 11,
        questionText = "In welchem Jahr meldete Melitta Bentz den Kaffeefilter zum Patent an?",
        answerA = "1895",
        answerB = "1920",
        answerC = "1930",
        answerD = "1908",
        correctAnswer = 3,
        explanation = "Melitta Bentz meldete ihre Erfindung am 20. Juni 1908 beim Kaiserlichen Patentamt an. Sie verwendete Loeschpapier aus dem Schulheft ihres Sohnes und einen durchlöcherten Messinglecher.",
        difficulty = 1,
        funFact = "Melitta Bentz gruendete ihr Unternehmen mit nur 72 Pfennig Startkapital. Heute ist Melitta ein weltbekannter Konzern mit Milliardenumsatz."
    ),

    // Question 4 — Erfindung: Post-it
    Question(
        categoryId = 11,
        questionText = "Was inspirierte Art Fry zur Erfindung des Post-it-Klebezettels?",
        answerA = "Herausfallende Lesezeichen in seinem Gesangbuch",
        answerB = "Verlorene Notizen auf seinem Schreibtisch",
        answerC = "Eine defekte Heftklammer im Buero",
        answerD = "Klebrige Bonbons seiner Kinder",
        correctAnswer = 0,
        explanation = "Art Fry aergerte sich 1974 darueber, dass seine Lesezeichen im Kirchenchor-Gesangbuch herausfielen. Er erinnerte sich an Spencer Silvers schwach haftenden Klebstoff von 1968 und entwickelte daraus den Post-it.",
        difficulty = 1,
        funFact = "Spencer Silver erfand 1968 den Post-it-Klebstoff versehentlich, als er einen starken Klebstoff entwickeln sollte. Erst 12 Jahre spaeter, 1980, kam das Produkt auf den Markt."
    ),

    // Question 5 — Erfindung: Reissverschluss
    Question(
        categoryId = 11,
        questionText = "Wer entwickelte den modernen Reissverschluss mit Zaehnchenreihen?",
        answerA = "Heinrich Braun",
        answerB = "Whitcomb Judson",
        answerC = "Gideon Sundbäck",
        answerD = "Thomas Edison",
        correctAnswer = 2,
        explanation = "Der Schwede Gideon Sundbäck perfektionierte 1912 den Reissverschluss mit ineinandergreifenden Zaehnchenreihen. Whitcomb Judson hatte 1893 zwar eine fruehe Version patentiert, aber Sundbäcks Version ist die Grundlage des heutigen Reissverschlusses.",
        difficulty = 1,
        funFact = "Der Begriff 'Zipper' (englisch fuer Reissverschluss) wurde von der Schuhfirma B.F. Goodrich gepraegt, die 1923 Galoschen mit Sundbäcks Verschluss vermarktete."
    ),

    // Question 6 — Erfindung: Dreipunktgurt
    Question(
        categoryId = 11,
        questionText = "Bei welchem Autohersteller arbeitete der Erfinder des Dreipunktgurts Nils Bohlin?",
        answerA = "Mercedes-Benz",
        answerB = "BMW",
        answerC = "Volvo",
        answerD = "Ford",
        correctAnswer = 2,
        explanation = "Nils Ivar Bohlin erfand den Dreipunktgurt als Ingenieur bei Volvo. Am 29. August 1958 meldete er das Patent an. Volvo stellte das Patent anderen Herstellern kostenlos zur Verfuegung.",
        difficulty = 1,
        funFact = "Volvo verzichtete bewusst darauf, das Dreipunktgurt-Patent zu schützen — um moeglichst viele Menschenleben zu retten. Experten schaetzen, dass der Gurt bis heute ueber eine Million Leben gerettet hat."
    ),

    // Question 7 — Erfindung: Buchdruck
    Question(
        categoryId = 11,
        questionText = "In welcher Stadt erfand Johannes Gutenberg den Buchdruck mit beweglichen Lettern?",
        answerA = "Frankfurt",
        answerB = "Koeln",
        answerC = "Heidelberg",
        answerD = "Mainz",
        correctAnswer = 3,
        explanation = "Johannes Gutenberg erfand den Buchdruck mit beweglichen Metalllettern um 1450 in Mainz. Die Gutenberg-Bibel gilt als erstes massengedrucktes Buch Europas.",
        difficulty = 1,
        funFact = "Von der Gutenberg-Bibel (1452–1455) sind noch 49 Exemplare erhalten. Ein vollstaendiges Exemplar wurde zuletzt 1978 fuer 2,2 Millionen Dollar versteigert."
    ),

    // Question 8 — Erfindung: Cornflakes
    Question(
        categoryId = 11,
        questionText = "Wie entstanden Cornflakes urspruenglich?",
        answerA = "Als Diätprodukt fuer Sportler",
        answerB = "Durch einen Kochunfall mit vergessenem Teig",
        answerC = "Als Tierfutter-Ersatz",
        answerD = "Als Konserve fuer lange Seereisen",
        correctAnswer = 1,
        explanation = "John Harvey Kellogg liess 1894 gekochten Weizenteig uebernacht stehen. Am naechsten Morgen rollte er die abgestandene Masse zu Flocken — und erfand so die Getreideflocken. Sein Bruder Will gruendete dann die Cornflakes-Firma.",
        difficulty = 1,
        funFact = "John Harvey Kellogg erfand die Cornflakes urspruenglich als gesundes, reizungsloses Fruehstueck fuer Patienten seiner Sanatoriums-Klinik. Zucker sollte dabei komplett verboten sein."
    ),

    // Question 9 — Erfindung: Aspirin
    Question(
        categoryId = 11,
        questionText = "Von welchem deutschen Unternehmen wurde Aspirin entwickelt?",
        answerA = "Siemens",
        answerB = "BASF",
        answerC = "Bayer",
        answerD = "Henkel",
        correctAnswer = 2,
        explanation = "Felix Hoffmann entwickelte 1897 bei Bayer die Acetylsalicylsaeure und synthetisierte es in reiner, stabiler Form. Bayer liess 1899 den Markennamen 'Aspirin' eintragen.",
        difficulty = 1,
        funFact = "Felix Hoffmann soll Aspirin entwickelt haben, um seinem Vater zu helfen, der unter Gelenkrheuma litt. Das urspruengliche Mittel Salicylsaeure war ihm zu magenreizend."
    ),

    // Question 10 — Erfindung: Jeans
    Question(
        categoryId = 11,
        questionText = "Wann und von wem wurde die erste Jeans patentiert?",
        answerA = "1873 von Levi Strauss und Jacob Davis",
        answerB = "1851 von Henry Ford",
        answerC = "1890 von Levi Strauss allein",
        answerD = "1865 von einem texanischen Rancher",
        correctAnswer = 0,
        explanation = "Am 20. Mai 1873 erhielten Levi Strauss und der Schneider Jacob Davis das US-Patent auf nietenartig verstärkte Arbeitshosen aus Denim. Davis erfand die Nieten, Strauss finanzierte das Patent.",
        difficulty = 1,
        funFact = "Die kleinen Taschen in Jeans sind sogenannte 'Uhrentaschen', die urspruenglich fuer Taschenuhren von Cowboys vorgesehen waren. Heute passen Muenzen oder Daumen hinein."
    ),

    // Question 11 — Erfindung: Telefon
    Question(
        categoryId = 11,
        questionText = "In welchem Jahr meldete Alexander Graham Bell das Telefon-Patent an?",
        answerA = "1870",
        answerB = "1876",
        answerC = "1884",
        answerD = "1901",
        correctAnswer = 1,
        explanation = "Alexander Graham Bell erhielt am 7. Maerz 1876 das Patent auf das Telefon. Sein erstes Telefongespraech mit Assistenten Watson am selben Tag gilt als historischer Moment.",
        difficulty = 1,
        funFact = "Elisha Gray reichte am selben Tag ein Patent ein — Bell war nur wenige Stunden frueher beim Patentamt. Dieser knappe Vorsprung entschied einen der beruehmt-beruechtigen Patentstreitigkeiten der Geschichte."
    ),

    // Question 12 — Erfindung: Gluehbirne
    Question(
        categoryId = 11,
        questionText = "Wer patentierte 1879 die praktisch nutzbare elektrische Gluehbirne?",
        answerA = "Nikola Tesla",
        answerB = "James Watt",
        answerC = "Thomas Alva Edison",
        answerD = "Michael Faraday",
        correctAnswer = 2,
        explanation = "Thomas Alva Edison patentierte 1879 seine verbesserte Gluehbirne mit einem Kohlefaden. Er testete ueber 6.000 verschiedene Materialien, bevor er den richtigen Gluehfaden fand.",
        difficulty = 1,
        funFact = "Als Edison seine Gluehbirne vorstellte, schrieb eine Zeitung: 'Wer damit vertraut ist, wird erkennen, dass Edisons Gluehbirne ein klarer Fehlschlag ist.' Kurz darauf beleuchtete sie die halbe Welt."
    ),

    // Question 13 — Erfindung: Wuerfelzucker
    Question(
        categoryId = 11,
        questionText = "Warum erfand Jacob Christoph Rad den Wuerfelzucker?",
        answerA = "Weil Zucker damals sehr teuer war",
        answerB = "Weil seine Frau sich beim Zuckerbrechen verletzte",
        answerC = "Weil Zucker im Kegelformat beim Transport zerbrach",
        answerD = "Weil sein Arzt kleine Portionen empfahl",
        correctAnswer = 1,
        explanation = "Jacob Christoph Rad erfand den Wuerfelzucker um 1840, nachdem sich seine Frau beim Abbrechen von Zuckerkegeln verletzt hatte. Er entwickelte eine Maschine, die Zucker in einheitliche Wuerfel pressste.",
        difficulty = 1,
        funFact = "Vor der Erfindung des Wuerfelzuckers wurde Zucker in kegelfoermigen 'Zuckerhüten' verkauft, die mit speziellen Zuckerzangen oder -haemmern gebrochen werden mussten."
    ),

    // Question 14 — Erfindung: Nylonstruempfe
    Question(
        categoryId = 11,
        questionText = "Welches Unternehmen erfand Nylon und damit die Nylonstruempfe?",
        answerA = "BASF",
        answerB = "DuPont",
        answerC = "3M",
        answerD = "Dow Chemical",
        correctAnswer = 1,
        explanation = "DuPont-Chemiker Wallace Carothers entwickelte Nylon, den ersten vollkommen synthetischen Textilfaden. Am 15. Mai 1940 kamen die ersten Nylonstruempfe in den USA auf den Markt.",
        difficulty = 1,
        funFact = "Am ersten Verkaufstag von Nylonstruempfen wurden in den USA 780.000 Paare verkauft. Frauen standen stundenlang Schlange — manche sahen Nylon als groessere Erfindung als das Telefon."
    ),

    // Question 15 — Erfindung: Kugelschreiber
    Question(
        categoryId = 11,
        questionText = "Nach wem wurde der Kugelschreiber in vielen Laendern benannt?",
        answerA = "Laszlo Biro",
        answerB = "Milton Reynolds",
        answerC = "Rudolf Hell",
        answerD = "Marcel Bich",
        correctAnswer = 0,
        explanation = "Laszlo Biró (auch Biro geschrieben) erfand zusammen mit seinem Bruder Georg 1938 den modernen Kugelschreiber. In Argentinien, Australien und anderen Laendern heisst der Kugelschreiber noch heute 'Biro'.",
        difficulty = 1,
        funFact = "Biró war Journalist und aergerter sich, dass Fuellhaltertinte auf Zeitungspapier verlief. Er beobachtete, wie Druckertinte schnell trocknete, und entwickelte daraus die zaehfluessige Kugelschreibertinte."
    ),

    // Question 16 — Erfindung: Briefmarke
    Question(
        categoryId = 11,
        questionText = "In welchem Land wurde die erste Briefmarke der Welt herausgegeben?",
        answerA = "Deutschland",
        answerB = "Frankreich",
        answerC = "USA",
        answerD = "Grossbritannien",
        correctAnswer = 3,
        explanation = "Grossbritannien gab 1840 die erste Briefmarke der Welt heraus: die 'Penny Black'. Sie zeigte das Portraet von Koenigin Victoria und kostete einen Penny.",
        difficulty = 1,
        funFact = "Auf der Penny Black war keine Landesbezeichnung, weil Grossbritannien als Erfinder der Briefmarke dieses Privileg bis heute behaelt. Grossbritannien ist das einzige Land der Welt, das seinen Namen nicht auf Briefmarken drucken muss."
    ),

    // Question 17 — Erfindung: Roentgenstrahlen
    Question(
        categoryId = 11,
        questionText = "Was zeigte das erste Roentgenbild der Geschichte?",
        answerA = "Die Hand von Roentgens Frau",
        answerB = "Den Fuss eines Soldaten",
        answerC = "Eine Muenze in einer Schachtel",
        answerD = "Roentgens eigene linke Hand",
        correctAnswer = 0,
        explanation = "Am 22. Dezember 1895 fotografierte Wilhelm Conrad Roentgen die Hand seiner Frau Anna Bertha. Es war das erste Roentgenbild der Geschichte und zeigte deutlich ihre Knochen und Ehering.",
        difficulty = 1,
        funFact = "Als Anna Bertha Ludwig das Bild ihrer Hand sah, soll sie erschrocken ausgerufen haben: 'Ich habe meinen Tod gesehen!' Roentgen erhielt 1901 den allerersten Nobelpreis fuer Physik."
    ),

    // Question 18 — Erfindung: Klebefilm (Tesa/Scotch)
    Question(
        categoryId = 11,
        questionText = "Aus welchem Grund wurde Klebefilm (Scotch Tape) urspruenglich erfunden?",
        answerA = "Fuer Bueroarbeiten",
        answerB = "Zum Abdichten von Lebensmittelverpackungen",
        answerC = "Als Wundverband-Ersatz",
        answerD = "Fuer Papierarbeiten in Schulen",
        correctAnswer = 1,
        explanation = "3M-Ingenieur Richard Drew erfand Scotch Tape 1930, um Lebensmittelverpackungen in der Wirtschaftskrise guenstig und luftdicht abzudichten. Insbesondere Baeckereien nutzten ihn fuer Zellophan-Tueten.",
        difficulty = 1,
        funFact = "'Scotch' im Namen Scotch Tape war urspruenglich ein Spitzname. Autolackierer sagten zu Drew, sein erster Klebeband-Prototyp sei 'scotch' (geizig) mit Klebstoff — dieser Name blieb."
    ),

    // Question 19 — Erfindung: Mikrowelle
    Question(
        categoryId = 11,
        questionText = "Wie wurde die Mikrowelle zufallig erfunden?",
        answerA = "Ein Schokoladenriegel schmolz in einer Jackentasche nahe Radargeraeten",
        answerB = "Ein Ei explodierte beim Erhitzen mit einer Wärmepistole",
        answerC = "Eine Laborantin erhitzte versehentlich ein Glas mit Metallloeffel",
        answerD = "Ein Ingenieur bemerkte, dass Kupferspulen Kaffee erwaermten",
        correctAnswer = 0,
        explanation = "Percy Spencer bemerkte 1945, dass ein Schokoladenriegel in seiner Jackentasche geschmolzen war, als er vor einem aktiven Radarsender stand. Er erkannte die Erwaermungswirkung von Mikrowellen und entwickelte den ersten Mikrowellenherd.",
        difficulty = 1,
        funFact = "Der erste kommerzielle Mikrowellenherd hiess 'Radarange', war 1,80 m hoch, 340 kg schwer und kostete 5.000 Dollar — so viel wie ein Auto. Erst in den 1970ern wurden kompakte Haushaltsmikrowellen erschwinglich."
    ),

    // Question 20 — Erfindung: Cornflakes-Brueder
    Question(
        categoryId = 11,
        questionText = "Wann gruendete Will Keith Kellogg die Kellogg's Cornflakes-Firma?",
        answerA = "1894",
        answerB = "1906",
        answerC = "1912",
        answerD = "1920",
        correctAnswer = 1,
        explanation = "Will Keith Kellogg gruendete am 19. Februar 1906 die Battle Creek Toasted Corn Flake Company. Er fuhr das Unternehmen zur Riesenfirma, waehrend sein Bruder John Harvey kein Interesse am Geschaeft hatte.",
        difficulty = 1,
        funFact = "Will Kellogg fugte Zucker zu den Cornflakes hinzu, was sein Bruder John Harvey als Verrat an der Gesundheitsidee betrachtete. Die beiden zerstritten sich deshalb fuer immer."
    ),

    // Question 21 — Erfindung: Fahrenheit/Thermometer
    Question(
        categoryId = 11,
        questionText = "Wer erfand das Quecksilberthermometer?",
        answerA = "Anders Celsius",
        answerB = "Lord Kelvin",
        answerC = "Isaac Newton",
        answerD = "Daniel Gabriel Fahrenheit",
        correctAnswer = 3,
        explanation = "Daniel Gabriel Fahrenheit erfand 1714 das erste Quecksilberthermometer. Er entwickelte auch die nach ihm benannte Temperaturskala. Celsius erfand 1742 seine eigene Skala.",
        difficulty = 1,
        funFact = "Fahrenheit setzte den Nullpunkt seiner Skala auf die niedrigste Temperatur, die er in seiner Heimatstadt (Danzig) je gemessen hatte — eine Kältemischung aus Eis und Salz. 0 Grad Celsius entsprechen 32 Grad Fahrenheit."
    ),

    // Question 22 — Erfindung: Dampfmaschine
    Question(
        categoryId = 11,
        questionText = "Wer verbesserte die Dampfmaschine 1769 entscheidend und leitete die Industrielle Revolution ein?",
        answerA = "James Watt",
        answerB = "George Stephenson",
        answerC = "Isambard Brunel",
        answerD = "Robert Fulton",
        correctAnswer = 0,
        explanation = "James Watt patentierte 1769 seine verbesserte Dampfmaschine mit separatem Kondensator, die deutlich effizienter war. Diese Erfindung gilt als Ausloeser der Industriellen Revolution.",
        difficulty = 1,
        funFact = "James Watt wurde so verehrt, dass die Einheit der Leistung 'Watt' nach ihm benannt wurde. Um uns die Staerke einer Maschine zu erklaeren, erfand er selbst den Begriff 'Pferdestärke'."
    ),

    // Question 23 — Erfindung: Schreibmaschine
    Question(
        categoryId = 11,
        questionText = "Wofuer waren Schreibmaschinen mit QWERTY-Tastatur urspruenglich ausgelegt?",
        answerA = "Um Schreibfehler zu verringern",
        answerB = "Um haeufig benutzte Tasten auseinanderzulegen und Verhakungen zu vermeiden",
        answerC = "Um die Schreibgeschwindigkeit zu maximieren",
        answerD = "Um Telegraphen-Codes einfacher einzutippen",
        correctAnswer = 1,
        explanation = "Das QWERTY-Layout wurde 1873 entwickelt, um Typen-Verhakungen bei fruehen Schreibmaschinen zu vermeiden. Haeufig zusammen verwendete Buchstaben wurden bewusst auseinander platziert.",
        difficulty = 1,
        funFact = "Obwohl moderne Tastaturen keine Verhakungen mehr haben, verwenden wir QWERTY bis heute. Das DVORAK-Layout waere effizienter, konnte sich aber nie durchsetzen — zu viele Menschen hatten QWERTY gelernt."
    ),

    // Question 24 — Erfindung: Sicherheitsnadel
    Question(
        categoryId = 11,
        questionText = "Wie lange brauchte Walter Hunt fuer die Erfindung der Sicherheitsnadel?",
        answerA = "Drei Stunden",
        answerB = "Einen Monat",
        answerC = "Ein Jahr",
        answerD = "Drei Monate",
        correctAnswer = 0,
        explanation = "Walter Hunt erfand die Sicherheitsnadel 1849 in nur drei Stunden. Er brauchte dringend Geld und bastelte aus einem Metalldraht das Prinzip der selbstsichernden Nadel, das er dann patentierte.",
        difficulty = 1,
        funFact = "Walter Hunt verkaufte sein Sicherheitsnadel-Patent sofort fuer 400 Dollar, um alte Schulden zu begleichen. Spaeter verdiente der Kaeufer Millionen damit. Hunt erfand auch die Naehmaschine, verkaufte dieses Patent aber ebenfalls zu frueh."
    ),

    // Question 25 — Erfindung: Stacheldraht
    Question(
        categoryId = 11,
        questionText = "In welchem Land wurde Stacheldraht 1874 erfunden?",
        answerA = "Deutschland",
        answerB = "USA",
        answerC = "Frankreich",
        answerD = "England",
        correctAnswer = 1,
        explanation = "Joseph Glidden aus Illinois erfand und patentierte 1874 den modernen Stacheldraht. Mit ihm konnten Farmen im amerikanischen Westen erstmals grossflächig eingezäunt werden.",
        difficulty = 1,
        funFact = "Stacheldraht wird auch als 'die Erfindung, die den Wilden Westen zahmte' bezeichnet. Vorher war es kaum moeglich, riesige Praerieflaechen einzuzäunen, was zu ewigen Weiderechtsstreitigkeiten fuehrte."
    ),

    // Question 26 — Erfindung: Schutzimpfung
    Question(
        categoryId = 11,
        questionText = "Wer entwickelte die erste Schutzimpfung der Geschichte (gegen Pocken)?",
        answerA = "Louis Pasteur",
        answerB = "Robert Koch",
        answerC = "Edward Jenner",
        answerD = "Alexander Fleming",
        correctAnswer = 2,
        explanation = "Edward Jenner entwickelte 1796 die erste Schutzimpfung gegen Pocken. Er bemerkte, dass Kuehpocken-infizierte Melkerinnen immun gegen die gefaehrlichen echten Pocken waren.",
        difficulty = 1,
        funFact = "Das Wort 'Vakzin' (Impfstoff) leitet sich vom lateinischen 'vacca' (Kuh) ab — ein Hinweis auf Jenners Kuehpocken-Entdeckung. Pocken wurden 1980 durch Impfungen weltweit ausgerottet."
    ),

    // Question 27 — Erfindung: Penicillin
    Question(
        categoryId = 11,
        questionText = "Wie entdeckte Alexander Fleming das Penicillin?",
        answerA = "Er fand Schimmel auf einem vergessenen Bakterien-Naehrboeden",
        answerB = "Er entwickelte es gezielt aus Brotschimmel",
        answerC = "Er entdeckte es bei der Behandlung verwundeter Soldaten",
        answerD = "Er synthetisierte es aus Pflanzenextrakten",
        correctAnswer = 0,
        explanation = "Alexander Fleming entdeckte Penicillin 1928 zufallig: Ein vergessener Bakterien-Naehrboden war mit Schimmel (Penicillium) verunreinigt, und um den Schimmel herum waren die Bakterien abgestorben.",
        difficulty = 1,
        funFact = "Fleming selbst scherzte spaeter: 'Ich habe das Penicillin nicht erfunden — die Natur hat es erfunden. Ich habe es nur entdeckt.' Der Wirkstoff wurde 1945 mit dem Nobelpreis ausgezeichnet."
    ),

    // Question 28 — Erfindung: Dynamit
    Question(
        categoryId = 11,
        questionText = "Wer erfand das Dynamit?",
        answerA = "Fritz Haber",
        answerB = "Alfred Nobel",
        answerC = "Johann Philipp Reis",
        answerD = "Werner von Siemens",
        correctAnswer = 1,
        explanation = "Alfred Nobel erfand 1867 das Dynamit, indem er Nitroglyzerin mit Kieselgur mischte, um es sicher transportierbar zu machen. Er war schockiert, wie sein Erfindung im Krieg eingesetzt wurde.",
        difficulty = 1,
        funFact = "Aus Reue ueber die kriegerische Nutzung des Dynamits stiftete Alfred Nobel testamentarisch die beruehmten Nobelpreise. Der Friedensnobelpreis ist die bekannteste Ironie seiner Geschichte."
    ),

    // Question 29 — Erfindung: Nähmaschine
    Question(
        categoryId = 11,
        questionText = "In welchem Land wurde die erste praktisch nutzbare Nähmaschine erfunden?",
        answerA = "England",
        answerB = "Frankreich",
        answerC = "Deutschland",
        answerD = "USA",
        correctAnswer = 1,
        explanation = "Barthelemy Thimonnier erfand 1830 in Frankreich die erste praktisch einsetzbare Nähmaschine. Er nutzte sie fuer Uniformnaehen, wurde aber von wuetenden Schneidergesellen angegriffen, die ihre Arbeit verloren sahen.",
        difficulty = 1,
        funFact = "Thimonnier wurde von einem Schneider-Mob fast getoetet, der seine Werkstatt stuermte und 80 seiner Maschinen zerstoerte. Heute gilt er als Pionier, der fast zu seinem eigenen Schaden seiner Zeit voraus war."
    ),

    // Question 30 — Erfindung: Konservendose
    Question(
        categoryId = 11,
        questionText = "Wann wurde der Dosenoefffner erfunden, verglichen mit der Konservendose?",
        answerA = "Gleichzeitig mit der Dose",
        answerB = "10 Jahre spaeter",
        answerC = "50 Jahre spaeter",
        answerD = "Schon 20 Jahre vorher",
        correctAnswer = 2,
        explanation = "Die Konservendose wurde 1810 patentiert. Der Dosenoeffner wurde erst 1858 — also fast 50 Jahre spaeter — erfunden. In der Zwischenzeit mussten die Menschen mit Hammer und Meissel an Dosen.",
        difficulty = 1,
        funFact = "Die erste Anleitung fuer Konservendosen lautete tatsaechlich: 'Mit Hammer und Meissel am oberen Rand oeffnen.' Dass der Dosenoeffner spaeter kam als die Dose gilt als einer der groessten Design-Fehler der Geschichte."
    ),

    // Question 31 — Erfindung: Rolltreppe
    Question(
        categoryId = 11,
        questionText = "Wann wurde die erste Rolltreppe der Welt oeffentlich vorgefuehrt?",
        answerA = "1892",
        answerB = "1900",
        answerC = "1895",
        answerD = "1910",
        correctAnswer = 2,
        explanation = "Die erste Rolltreppe der Welt wurde 1895 von Jesse Reno entwickelt und auf dem Vergnuegungsdamm Coney Island in New York als Attraktion vorgefuehrt. Sie war schraeg und bewegte 75.000 Fahrgaeste am Tag.",
        difficulty = 1,
        funFact = "Bei der Weltausstellung in Paris 1900 sahen viele Europäer zum ersten Mal eine Rolltreppe. Manche weigerten sich einzusteigen und andere mussten von Angestellten hinaufbegleitet werden."
    ),

    // Question 32 — Erfindung: Luftreifen
    Question(
        categoryId = 11,
        questionText = "Wer erfand den aufblasbaren Gummireifen fuer Fahrraeder?",
        answerA = "Charles Goodyear",
        answerB = "Andre Michelin",
        answerC = "John Dunlop",
        answerD = "Robert William Thomson",
        correctAnswer = 2,
        explanation = "John Dunlop erfand 1888 den pneumatischen Fahrradreifen, nachdem sein Sohn ueber das holprige Kopfsteinpflaster fahren musste. Er fuellte Schlaeuche mit Luft und befestigte sie an den Radfeln.",
        difficulty = 1,
        funFact = "John Dunlop war Veterinaer, kein Ingenieur. Er testete seine erste Version mit einem Gartenteich-Schlauch. Heute ist Dunlop eine der groessten Reifenmarken der Welt."
    ),

    // Question 33 — Erfindung: Barcode
    Question(
        categoryId = 11,
        questionText = "Was wurde als erstes Produkt der Welt mit einem Barcode eingescannt?",
        answerA = "Eine Flasche Coca-Cola",
        answerB = "Ein Paket Kaugummi",
        answerC = "Eine Dose Suppe",
        answerD = "Eine Flasche Bier",
        correctAnswer = 1,
        explanation = "Am 26. Juni 1974 wurde in einem Supermarkt in Troy, Ohio, ein Paket Wrigley's Kaugummi als erstes Produkt der Welt mit einem Barcode-Scanner erfasst. Dieses Kaugummi-Paket liegt heute im Smithsonian-Museum.",
        difficulty = 1,
        funFact = "Der Barcode wurde bereits 1952 von Norman Woodland und Bernard Silver erfunden — aber erst 1974 war die Scanner-Technik billig und zuverlaessig genug fuer Supermaerkte. Woodland soll die Idee am Strand entwickelt haben, als er Morsezeichen in den Sand zeichnete."
    ),

    // Question 34 — Erfindung: Reisverschluss Name
    Question(
        categoryId = 11,
        questionText = "Woher kommt der Begriff 'Reissverschluss'?",
        answerA = "Weil er beim Reissen von Stoff verwendet wurde",
        answerB = "Weil er beim Ruckreissen der Ziehlasche einen Geraeusch macht",
        answerC = "Weil er sich schnell 'auf- und zureissen' laesst",
        answerD = "Weil er zuerst bei Reisegepäck eingesetzt wurde",
        correctAnswer = 3,
        explanation = "Der Begriff 'Reissverschluss' stammt daher, dass er zunaechst vor allem bei Reisegepäck, Koffer und Taschen eingesetzt wurde. Auf Englisch heisst er 'Zipper', weil er beim Schliessen ein Zipp-Geraeusch macht.",
        difficulty = 1,
        funFact = "Vor der Verbreitung des Reissverschlusses wurden Kleidungsstuecke, Schuhe und Taschen mit Haken-und-Oesen-Verschluessen, Knoepfen oder Schnueren geschlossen — was viel laenger dauerte."
    ),

    // Question 35 — Erfindung: Kuehlschrank
    Question(
        categoryId = 11,
        questionText = "In welchem Jahrzehnt kam der elektrische Haushalts-Kuehlschrank auf den Markt?",
        answerA = "1880er Jahre",
        answerB = "1910er Jahre",
        answerC = "1900er Jahre",
        answerD = "1930er Jahre",
        correctAnswer = 1,
        explanation = "Der erste elektrische Haushaltskuehlschrank kam 1913 (also in den 1910er Jahren) auf den US-Markt. Die Firma 'Domelre' brachte ihn unter dem Namen 'Domestic Electric Refrigerator' heraus.",
        difficulty = 1,
        funFact = "Vor dem Kuehlschrank lieferten Eishaendler taegliche Eisblock nach Hause. Im Sommer war das ein gut bezahlter Beruf. Als Kuehlschranke sich verbreiteten, verschwand dieser Beruf innerhalb von Jahren."
    ),

    // Question 36 — Erfindung: Glace/Eis am Stiel
    Question(
        categoryId = 11,
        questionText = "Wie alt war Frank Epperson, als er das Eis am Stiel erfand?",
        answerA = "11 Jahre",
        answerB = "18 Jahre",
        answerC = "25 Jahre",
        answerD = "8 Jahre",
        correctAnswer = 0,
        explanation = "Frank Epperson war 11 Jahre alt, als er 1905 versehentlich das erste Eis am Stiel erfand. Er liess einen Becher Limonade mit Ruehrstab draussen in der Kaelte stehen — und fand am Morgen gefrorenes Eis am Holzstab.",
        difficulty = 1,
        funFact = "Epperson patentierte seine Erfindung erst 18 Jahre spaeter, 1923. Er nannte es 'Eppsicle'. Spaeter nannten seine Kinder es 'Pop's sicle' — daraus wurde 'Popsicle', der heutige Markenname in den USA."
    ),

    // Question 37 — Erfindung: Klettverschluss
    Question(
        categoryId = 11,
        questionText = "Wodurch wurde der Schweizer Ingenieur George de Mestral zur Erfindung des Klettverschlusses inspiriert?",
        answerA = "Durch Borsten einer Katzenpfote",
        answerB = "Durch Klettenhaken, die sich in seinem Hundehaar verhakten",
        answerC = "Durch das Muster eines Tannenzapfens",
        answerD = "Durch Spinnennetze nach dem Regen",
        correctAnswer = 1,
        explanation = "George de Mestral beobachtete 1941 nach einem Spaziergang, wie sich Klettenfrüchte in seinem Hundehaar und seiner Kleidung verhakten. Er analysierte die Haken unter dem Mikroskop und entwickelte daraus Velcro (Klettverschluss).",
        difficulty = 1,
        funFact = "Der Name 'Velcro' kombiniert die franzoesischen Woerter 'velours' (Samtstoff) und 'crochet' (Haken). Die NASA nutzt Klettverschluesse im Weltall, da herkoemmliche Knoepfe und Reissverschluesse im Raumanzug schwer zu bedienen sind."
    ),

    // Question 38 — Erfindung: Streichholz
    Question(
        categoryId = 11,
        questionText = "In welchem Land wurde das Sicherheitsstreichholz erfunden?",
        answerA = "Deutschland",
        answerB = "Grossbritannien",
        answerC = "Schweden",
        answerD = "Oesterreich",
        correctAnswer = 2,
        explanation = "Johan Edvard Lundstrom erfand 1855 in Schweden das Sicherheitsstreichholz, das sich nur an einer speziell praparierten Reibeflaeche zuenden laesst. Diese schwedische Erfindung wurde weltweiter Standard.",
        difficulty = 1,
        funFact = "Vor dem Sicherheitsstreichholz gab es 'Kongresstreichhoelzer', die sich an fast jeder Oberflaeche zuendeten — auch unbeabsichtigt. Es gab viele Braende durch versehentliches Zuenden in der Hosentasche."
    ),

    // Question 39 — Erfindung: Waschmaschine
    Question(
        categoryId = 11,
        questionText = "Was bewegte die erste elektrische Waschmaschine (1908)?",
        answerA = "Eine Trommel die sich links und rechts dreht",
        answerB = "Einen Ruehrstab der das Waesche bewegt",
        answerC = "Einen Propeller unter dem Waesche",
        answerD = "Eine Schaukel-Bewegung des gesamten Bottichs",
        correctAnswer = 1,
        explanation = "Die erste elektrische Waschmaschine 'Thor' von Hurley Machine Company (1908) hatte einen elektrisch betriebenen Ruehrstab (Agitator), der das Wasser und die Wäsche in Bewegung brachte.",
        difficulty = 1,
        funFact = "Vor der Waschmaschine verbrachten Hausfrauen einen ganzen Tag pro Woche mit Waeschewaschen. Historiker nennen die Waschmaschine eine der emanzipatorischsten Erfindungen der Geschichte."
    ),

    // Question 40 — Erfindung: Herzschrittmacher
    Question(
        categoryId = 11,
        questionText = "Wie wurde der erste implantierbare Herzschrittmacher 1958 entdeckt?",
        answerA = "Ein Laborfehler beim Testen eines Elektronik-Geraetes",
        answerB = "Ein Forscher improvisierte ihn waehrend einer Notfall-OP",
        answerC = "Rune Elmqvist loetete ihn an einem Kuechentisch zusammen",
        answerD = "Er wurde zunaechst als Herzfrequenz-Messgeraet entwickelt",
        correctAnswer = 2,
        explanation = "Der schwedische Ingenieur Rune Elmqvist baute den ersten implantierbaren Herzschrittmacher buchstaeblich an einem Kuechentisch zusammen. Am 8. Oktober 1958 wurde er Patient Arne Larsson eingepflanzt — der damit 43 Jahre laenger lebte.",
        difficulty = 1,
        funFact = "Arne Larsson, der erste Patient mit implantiertem Herzschrittmacher, lebte bis 2001 und ueberlebte damit sogar den Erfinder des Geraetes. Er bekam in seinem Leben 26 Herzschrittmacher eingesetzt."
    ),

    // Question 41 — Erfindung: Radar
    Question(
        categoryId = 11,
        questionText = "Wofuer stand das Akronym RADAR urspruenglich?",
        answerA = "Radio Amplification Detection And Ranging",
        answerB = "Radio Detection And Ranging",
        answerC = "Rapid Air Detection And Recognition",
        answerD = "Remote Acoustic Direction And Range",
        correctAnswer = 1,
        explanation = "RADAR steht fuer 'Radio Detection And Ranging' (Radioerkennung und Entfernungsmessung). Die Technologie wurde in den 1930ern parallel in mehreren Laendern entwickelt und war im Zweiten Weltkrieg kriegsentscheidend.",
        difficulty = 1,
        funFact = "Radar wurde zufaellig mitentwickelt: Als Ingenieure feststellten, dass Funksignale von vorbeifliegenden Flugzeugen reflektiert wurden, erkannten sie das militaerische Potential dieser Beobachtung."
    ),

    // Question 42 — Erfindung: Internet
    Question(
        categoryId = 11,
        questionText = "Wie hiess das Vorlaeufer-Netzwerk des Internets?",
        answerA = "BITNET",
        answerB = "DARPANET",
        answerC = "ARPANET",
        answerD = "MILNET",
        correctAnswer = 2,
        explanation = "Das ARPANET (Advanced Research Projects Agency Network) der US-Verteidigungsbehoerde gilt als direkter Vorgaenger des Internets. Die erste ARPANET-Nachricht wurde am 29. Oktober 1969 gesendet.",
        difficulty = 1,
        funFact = "Die erste Internet-Nachricht hiess eigentlich 'LOGIN', aber das System stuerzte nach den ersten zwei Buchstaben 'LO' ab. So war die erste Nachricht im Internet versehentlich das englische Wort 'Lo' (zu Deutsch: 'Schau')."
    ),

    // Question 43 — Erfindung: Kaugummi
    Question(
        categoryId = 11,
        questionText = "Aus welchem Material bestand der erste moderne Kaugummi?",
        answerA = "Birkenteer",
        answerB = "Chicle (Baumharz vom Sapodilla-Baum)",
        answerC = "Paraffin-Wachs",
        answerD = "Gummi arabicum",
        correctAnswer = 1,
        explanation = "Thomas Adams kaufte 1869 grosse Mengen Chicle, ein natuerliches Harz vom Sapodilla-Baum aus Mexiko, und entwickelte daraus modernen Kaugummi. 1871 patentierte er eine Kaugummi-Maschine.",
        difficulty = 1,
        funFact = "Adams kaufte das Chicle urspruenglich, um damit Gummi als Ersatz fuer echten Naturkautschuk herzustellen. Als das scheiterte, probierte er es als Kaugummi — und erfand damit eine milliardenschwere Industrie."
    ),

    // Question 44 — Erfindung: Fernsehen
    Question(
        categoryId = 11,
        questionText = "Wer gilt als Erfinder des mechanischen Fernsehens?",
        answerA = "Guglielmo Marconi",
        answerB = "John Logie Baird",
        answerC = "Philo Farnsworth",
        answerD = "Lee de Forest",
        correctAnswer = 1,
        explanation = "John Logie Baird fuehrte am 26. Januar 1926 die erste oeffentliche Demonstration eines funktionierenden Fernsehsystems durch. Er uebertrug bewegte Bilder mittels einer mechanischen Nipkow-Scheibe.",
        difficulty = 1,
        funFact = "Baird testete sein Fernsehsystem mit einer Puppe namens 'Stooky Bill', da echte Gesichter fuer fruehe Kameras zu wenig Kontrast hatten. Das erste menschliche Gesicht im TV gehoerte seinem Bueroangestellten William Taynton."
    ),

    // Question 45 — Erfindung: Plastik
    Question(
        categoryId = 11,
        questionText = "Wer erfand 1907 den ersten vollsynthetischen Kunststoff 'Bakelit'?",
        answerA = "Hermann Staudinger",
        answerB = "Leo Baekeland",
        answerC = "Wallace Carothers",
        answerD = "Otto Rohm",
        correctAnswer = 1,
        explanation = "Leo Baekeland erfand 1907 Bakelit, den ersten vollkommen synthetischen Kunststoff. Es war hitzebestaendig und elektrisch nicht leitend — ideal fuer Schalter, Telefone und Radios der frueher Elektronikindustrie.",
        difficulty = 1,
        funFact = "Bakelit wurde das 'Material der tausend Verwendungen' genannt. Baekeland wurde so reich, dass er sein eigenes Schiff kaufte. Als man ihn fragte, warum er nicht ein groesseres Schiff kaufe, antwortete er: 'Weil ich kein Matrose bin, sondern ein Chemiker.'"
    ),

    // Question 46 — Erfindung: Fotoapparat
    Question(
        categoryId = 11,
        questionText = "Wie lange dauerte die Belichtungszeit des ersten fotografischen Bildes (1826)?",
        answerA = "30 Sekunden",
        answerB = "8 Stunden",
        answerC = "10 Minuten",
        answerD = "Eine Stunde",
        correctAnswer = 1,
        explanation = "Joseph Nicephore Niepce machte 1826 das erste permanente Foto der Geschichte. Die Belichtungszeit betrug etwa acht Stunden. Das Bild zeigt den Blick aus seinem Arbeitszimmerfenster.",
        difficulty = 1,
        funFact = "Weil die Belichtungszeit acht Stunden betrug, erscheint auf dem Bild die Sonne gleichzeitig auf beiden Seiten des Gebaeudes — die linke und rechte Fassade sind beleuchtet, weil die Sonne in der Zeit von Ost nach West gewandert ist."
    ),

    // Question 47 — Erfindung: Taschenlampe
    Question(
        categoryId = 11,
        questionText = "Warum hiessen die ersten Taschenlampen auf Englisch 'flashlight'?",
        answerA = "Weil sie nur kurze Blitze machen konnten, da die Batterien so schwach waren",
        answerB = "Weil sie urspruenglich fuer Foto-Blitze entwickelt wurden",
        answerC = "Weil ihr Lichtstrahl so schmal wie ein Blitz war",
        answerD = "Weil sie die Form von Blitzen hatten",
        correctAnswer = 0,
        explanation = "Die ersten Taschenlampen (um 1900) konnten wegen schwacher fruher Batterien und ineffizienter Gluehbirnen nur kurze 'Lichtblitze' erzeugen — daher der englische Name 'flashlight'. Man musste sie immer wieder aus- und einschalten.",
        difficulty = 1,
        funFact = "David Misell erfand die erste praktische Taschenlampe um 1899 und liess sie von Thomas Edison patentieren. Das Patent enthielt folgende Beschreibung: 'elektrische Fackel'."
    ),

    // Question 48 — Erfindung: Papier
    Question(
        categoryId = 11,
        questionText = "Wer erfand Papier, wie wir es heute kennen?",
        answerA = "Die alten Aegypter",
        answerB = "Cai Lun in China",
        answerC = "Die alten Roemer",
        answerD = "Die Mayas in Mittelamerika",
        correctAnswer = 1,
        explanation = "Cai Lun, ein chinesischer Hofbeamter, wird die Erfindung des Papiers um 105 n. Chr. zugeschrieben. Er stellte Papier aus Rinde, Hanf, Lumpen und alten Fischernetzen her.",
        difficulty = 1,
        funFact = "Vor der Papiererfindung schrieben Menschen auf Tontafeln, Papyrus, Tierhaeute (Pergament) oder Holztafeln. Chinesisches Papier erreichte den Westen erst im 8. Jahrhundert nach Arabien, und Europa bekam das Wissen erst im 12. Jahrhundert."
    ),

    // Question 49 — Erfindung: Dampflok
    Question(
        categoryId = 11,
        questionText = "Wer baute 1814 die erste praktisch einsetzbare Dampflokomotive?",
        answerA = "James Watt",
        answerB = "Richard Trevithick",
        answerC = "George Stephenson",
        answerD = "Isambard Kingdom Brunel",
        correctAnswer = 2,
        explanation = "George Stephenson baute 1814 die Dampflokomotive 'Blucher', eine der ersten wirklich betriebssicheren Dampfloks. 1825 eroeffnete er die erste oeffentliche Dampfeisenbahn zwischen Stockton und Darlington.",
        difficulty = 1,
        funFact = "Als Stephensons Dampflok das erste Mal fuhr, warnten Kritiker, der menschliche Koerper koennte bei hoher Geschwindigkeit sterben. Tatsaechlich fiel die erste Eisenbahn-Passagierin bei einem Halt vom Wagen und wurde ueberfahren."
    ),

    // Question 50 — Erfindung: Antibiotika
    Question(
        categoryId = 11,
        questionText = "Welchen Pilz entdeckte Alexander Fleming, der Penicillin produziert?",
        answerA = "Aspergillus niger",
        answerB = "Candida albicans",
        answerC = "Penicillium notatum",
        answerD = "Saccharomyces cerevisiae",
        correctAnswer = 2,
        explanation = "Alexander Fleming entdeckte 1928, dass der Schimmelpilz Penicillium notatum Bakterien abtoetest. Aus diesem Schimmel wurde der weltweit erste Antibiotikawirkstoff Penicillin gewonnen.",
        difficulty = 1,
        funFact = "Fleming verliess sein Labor 1928 unaufgeraeumt in den Urlaub. Als er zurueckkam, entdeckte er Schimmel auf einem Bakteriennaehrboden — und bemerkte den Bereich ringsum, wo alle Bakterien abgestorben waren. Sauberkeit haette diese lebensrettende Entdeckung verhindert."
    )

)
