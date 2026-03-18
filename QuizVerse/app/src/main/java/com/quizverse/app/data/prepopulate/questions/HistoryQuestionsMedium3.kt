package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun historyQuestionsMedium3(): List<Question> = listOf(

    // Question 1 - Weimar Republic
    Question(
        categoryId = 3,
        questionText = "In welchem Jahr wurde die Weimarer Republik offiziell ausgerufen?",
        answerA = "1916",
        answerB = "1919",
        answerC = "1918",
        answerD = "1920",
        correctAnswer = 2, // C
        explanation = "Am 9. November 1918 rief Philipp Scheidemann von einem Fenster des Reichstags die Republik aus. Die neue Verfassung trat 1919 in Kraft, benannt nach der Stadt Weimar, wo die Nationalversammlung tagte.",
        difficulty = 2,
        funFact = "Wenige Stunden nach Scheidemanns Ausruf proklamierte Karl Liebknecht vom Berliner Stadtschloss aus eine 'Freie Sozialistische Republik' – die politische Weiche Deutschlands stand auf des Messers Schneide."
    ),

    // Question 2 - Weimar Republic
    Question(
        categoryId = 3,
        questionText = "Welcher Artikel der Weimarer Verfassung erlaubte dem Reichspräsidenten, per Notverordnung ohne Parlament zu regieren?",
        answerA = "Artikel 48",
        answerB = "Artikel 54",
        answerC = "Artikel 1",
        answerD = "Artikel 76",
        correctAnswer = 0, // A
        explanation = "Artikel 48 der Weimarer Verfassung gab dem Reichspräsidenten weitreichende Notstandsbefugnisse. In der Endphase der Republik wurde er massenhaft genutzt – allein 1932 erließ Hindenburg 66 Notverordnungen.",
        difficulty = 2,
        funFact = "Artikel 48 war ursprünglich als Sicherheitsnetz für echte Ausnahmezustände gedacht. Er wurde jedoch so häufig genutzt, dass das parlamentarische System faktisch ausgehöhlt wurde, noch bevor Hitler an die Macht kam."
    ),

    // Question 3 - Weimar Republic
    Question(
        categoryId = 3,
        questionText = "Wie hieß die Hyperinflation des Jahres 1923 in Deutschland in ihrer extremsten Phase?",
        answerA = "Stagflation",
        answerB = "Galoppierende Inflation",
        answerC = "Deflation",
        answerD = "Hyperinflation",
        correctAnswer = 3, // D
        explanation = "Im November 1923 erreichte die Hyperinflation ihren Höhepunkt: Ein US-Dollar kostete 4,2 Billionen Mark. Ein Brot kostete Milliarden Mark. Die Ersparnisse der Mittelschicht wurden vernichtet.",
        difficulty = 2,
        funFact = "Die Reichsbank druckte Banknoten so schnell, dass sie zuletzt nur einseitig bedruckt wurden. Kinder spielten mit Geldscheinen als Bauklötze, weil das Papier wertlos war."
    ),

    // Question 4 - Hyperinflation 1923
    Question(
        categoryId = 3,
        questionText = "Was war der Hauptauslöser der deutschen Hyperinflation von 1923?",
        answerA = "Der Erste Weltkrieg allein",
        answerB = "Die Besetzung des Ruhrgebiets durch Frankreich und Belgien",
        answerC = "Eine internationale Börsenkrise",
        answerD = "Der Zusammenbruch der Reichsbank",
        correctAnswer = 1, // B
        explanation = "Als Deutschland die Reparationszahlungen nicht leistete, besetzten Frankreich und Belgien im Januar 1923 das Ruhrgebiet. Die Berliner Regierung rief zum 'passiven Widerstand' auf und druckte Geld, um streikende Arbeiter zu bezahlen – das trieb die Inflation ins Extreme.",
        difficulty = 2,
        funFact = "Die Einführung der Rentenmark im November 1923 beendete die Hyperinflation fast über Nacht. Eine Rentenmark ersetzte eine Billion alte Papiermark – ein wirtschaftliches Wunder der Psychologie."
    ),

    // Question 5 - Weimar Republic elections
    Question(
        categoryId = 3,
        questionText = "Welche Partei erzielte bei der Reichstagswahl im Juli 1932 mit 37,4 % das beste Ergebnis?",
        answerA = "SPD",
        answerB = "KPD",
        answerC = "Zentrum",
        answerD = "NSDAP",
        correctAnswer = 3, // D
        explanation = "Die NSDAP wurde im Juli 1932 mit 37,4 % zur stärksten Partei im Reichstag. Dies war ihr bestes Wahlergebnis in freien Wahlen. Bei der Novemberwahl 1932 verlor sie bereits wieder Stimmen.",
        difficulty = 2,
        funFact = "Hitler verlor die Reichspräsidentenwahl 1932 gegen Hindenburg, der ihn dennoch am 30. Januar 1933 zum Reichskanzler ernannte – auf Drängen konservativer Berater, die glaubten, ihn kontrollieren zu können."
    ),

    // Question 6 - WWI Trench Warfare
    Question(
        categoryId = 3,
        questionText = "Welche neuartige Waffe setzte Deutschland erstmals im April 1915 bei Ypern im Ersten Weltkrieg ein?",
        answerA = "Panzer",
        answerB = "Giftgas",
        answerC = "Flammenwerfer",
        answerD = "Bomber",
        correctAnswer = 1, // B
        explanation = "Am 22. April 1915 ließ die deutsche Armee erstmals Chlorgas gegen alliierte Stellungen frei. Dies war der erste großangelegte Chemiewaffenangriff der Geschichte. Zehntausende Soldaten wurden verletzt oder getötet.",
        difficulty = 2,
        funFact = "Die allierten Soldaten hatten keine Schutzausrüstung. Als Notbehelf rieten Offiziere, nasse Tücher – am besten mit Urin getränkt – vor Mund und Nase zu halten, da Ammoniak das Chlor neutralisiert."
    ),

    // Question 7 - Battle of Verdun
    Question(
        categoryId = 3,
        questionText = "Wie lange dauerte die Schlacht von Verdun im Jahr 1916?",
        answerA = "2 Monate",
        answerB = "6 Monate",
        answerC = "Fast 10 Monate",
        answerD = "1 Jahr",
        correctAnswer = 2, // C
        explanation = "Die Schlacht von Verdun dauerte vom 21. Februar bis zum 18. Dezember 1916 – fast zehn Monate. Sie kostete auf beiden Seiten zusammen etwa 700.000 Tote, Verwundete und Vermisste, ohne dass sich die Frontlinie wesentlich veränderte.",
        difficulty = 2,
        funFact = "Der deutsche Generalstabschef Falkenhayn plante Verdun als 'Blutpumpe', um Frankreich zu verbluten. Dieser zynische Plan scheiterte – Deutschland verlor annähernd genauso viele Männer wie Frankreich."
    ),

    // Question 8 - Battle of the Somme
    Question(
        categoryId = 3,
        questionText = "Wie viele britische Soldaten fielen am ersten Tag der Somme-Offensive (1. Juli 1916)?",
        answerA = "Etwa 5.000",
        answerB = "Etwa 57.000",
        answerC = "Etwa 20.000",
        answerD = "Etwa 100.000",
        correctAnswer = 1, // B
        explanation = "Am 1. Juli 1916, dem ersten Tag der Somme-Offensive, erlitten die Briten rund 57.470 Verluste, davon fast 20.000 Tote. Es ist der verlustreichste Tag in der Geschichte der britischen Armee.",
        difficulty = 2,
        funFact = "Viele der Gefallenen gehörten zu sogenannten 'Pals Battalions' – Einheiten aus Männern derselben Stadt oder desselben Berufs. Ganze Generationen junger Männer aus einzelnen Ortschaften wurden an einem einzigen Tag ausgelöscht."
    ),

    // Question 9 - WWI Trench Warfare
    Question(
        categoryId = 3,
        questionText = "Welches Waffensystem verwendeten die Briten erstmals am 15. September 1916 an der Somme?",
        answerA = "Artillerietrommelfeuer",
        answerB = "Kampfflugzeuge",
        answerC = "Panzer",
        answerD = "Maschinengewehre",
        correctAnswer = 2, // C
        explanation = "Am 15. September 1916 setzten die Briten erstmals Panzer (Mark I) in der Somme-Offensive ein. Der erste Einsatz war nicht sehr erfolgreich, da viele Fahrzeuge ausfielen, aber er revolutionierte die Kriegsführung.",
        difficulty = 2,
        funFact = "Um die Geheimhaltung zu wahren, nannten die Briten die neuen Fahrzeuge 'Tanks' (Wassertanks), als ob sie Wasservorräte für die Wüste transportieren würden. Der Name blieb bis heute."
    ),

    // Question 10 - Treaty of Brest-Litovsk
    Question(
        categoryId = 3,
        questionText = "Wann wurde der Frieden von Brest-Litowsk unterzeichnet, der Russland aus dem Ersten Weltkrieg herausnahm?",
        answerA = "Januar 1918",
        answerB = "November 1917",
        answerC = "März 1918",
        answerD = "Juni 1918",
        correctAnswer = 2, // C
        explanation = "Der Friedensvertrag von Brest-Litowsk wurde am 3. März 1918 zwischen den Mittelmächten und Sowjetrussland unterzeichnet. Russland musste enorme Gebiete abtreten: Polen, das Baltikum, die Ukraine und Teile des Kaukasus.",
        difficulty = 2,
        funFact = "Leo Trotzki, der die russischen Verhandlungen leitete, versuchte eine 'Weder Krieg noch Frieden'-Taktik – er erklärte den Krieg für beendet, ohne Bedingungen zu akzeptieren. Deutschland antwortete mit einer neuen Offensive und zwang Russland zu noch härteren Bedingungen."
    ),

    // Question 11 - Russian Revolution
    Question(
        categoryId = 3,
        questionText = "Wie hieß das versiegelte Zugabteil, in dem Lenin im April 1917 von der Schweiz nach Russland reiste?",
        answerA = "Orientexpress",
        answerB = "Plombierter Zug",
        answerC = "Zarenzug",
        answerD = "Kommunistenzug",
        correctAnswer = 1, // B
        explanation = "Deutschland erlaubte Lenin und seinen Genossen, in einem sogenannten 'plombierten' oder 'versiegelten' Zug durch deutsches Gebiet zu reisen. Deutschland hoffte, Lenin würde Russland destabilisieren und zum Austritt aus dem Krieg bewegen – diese Rechnung ging auf.",
        difficulty = 2,
        funFact = "Der deutsche Generalstab finanzierte die Bolschewiki mit Millionen Mark. Ein General schrieb später, er habe Russland eine 'revolutionäre Bazille' eingeimpft – und tatsächlich kollabierte die Ostfront innerhalb weniger Monate."
    ),

    // Question 12 - Russian Revolution
    Question(
        categoryId = 3,
        questionText = "Welches Ereignis wird als 'Oktoberrevolution' bezeichnet und fand nach dem julianischen Kalender statt?",
        answerA = "Sturm auf das Winterpalais am 25. Oktober 1917",
        answerB = "Die Abdankung des Zaren im März 1917",
        answerC = "Der Kieler Matrosenaufstand",
        answerD = "Lenins Rückkehr nach Petrograd",
        correctAnswer = 0, // A
        explanation = "In der Nacht vom 25. auf den 26. Oktober 1917 (nach julianischem Kalender) stürmten bolschewistische Rotgardisten das Winterpalais in Petrograd und verhafteten die Provisorische Regierung. Nach dem gregorianischen Kalender war es der 7. November.",
        difficulty = 2,
        funFact = "Der 'Sturm' auf das Winterpalais war kaum das dramatische Ereignis, das sowjetische Propagandafilme darstellten. Die Bolschewiki spazier ten fast ungehindert hinein – die Verteidigung bestand hauptsächlich aus einem Frauenbataillon und einigen Kadetten."
    ),

    // Question 13 - Lenin
    Question(
        categoryId = 3,
        questionText = "Wie hieß Lenins Wirtschaftspolitik, die er 1921 einführte, um die Wirtschaft nach dem Bürgerkrieg zu stabilisieren?",
        answerA = "Kriegskommunismus",
        answerB = "Neue Ökonomische Politik (NÖP)",
        answerC = "Fünfjahresplan",
        answerD = "Kollektivierung",
        correctAnswer = 1, // B
        explanation = "Die Neue Ökonomische Politik (NÖP) wurde 1921 eingeführt. Sie erlaubte begrenzte Privatwirtschaft und freien Handel, um die durch Weltkrieg und Bürgerkrieg zerrüttete Wirtschaft zu stabilisieren. Stalin beendete die NÖP nach Lenins Tod.",
        difficulty = 2,
        funFact = "Lenin bezeichnete die NÖP als 'einen Schritt zurück, um zwei Schritte vorwärts zu machen'. Viele überzeugte Kommunisten sahen es als Verrat an der Revolution – Lenin nannte es pragmatischen Überlebensrealismus."
    ),

    // Question 14 - Trotsky
    Question(
        categoryId = 3,
        questionText = "Welche militärische Organisation baute Trotzki nach der Revolution auf, die den Bürgerkrieg gewann?",
        answerA = "Die Tscheka",
        answerB = "Die Rote Armee",
        answerC = "Die Komintern",
        answerD = "Die Leibgarde",
        correctAnswer = 1, // B
        explanation = "Leo Trotzki wurde Volkskommissar für Kriegswesen und baute die Rote Armee fast aus dem Nichts auf. Er nahm sogar Offiziere des Zarenheeres unter politischer Überwachung in Dienst und verwandelte einen Haufen bewaffneter Revolutionäre in eine schlagkräftige Armee.",
        difficulty = 2,
        funFact = "Trotzki führte seinen Krieg von einem gepanzerten Sonderzug aus, der quer durch Russland fuhr. Der Zug hatte eigene Druckmaschinen, ein Radio, eine Bibliothek und sogar ein Orchester."
    ),

    // Question 15 - Bolsheviks
    Question(
        categoryId = 3,
        questionText = "Was bedeutet der Begriff 'Bolschewiki' auf Russisch?",
        answerA = "Rote Kämpfer",
        answerB = "Revolutionäre",
        answerC = "Mehrheitler",
        answerD = "Volkspartei",
        correctAnswer = 2, // C
        explanation = "Bolschewiki bedeutet 'Mehrheitler' (von russisch 'bolschinstwo' = Mehrheit). Der Name entstand bei einem Parteitag 1903, als Lenins Fraktion eine knappe Abstimmung gewann. Die Gegenpartei nannte sich 'Menschewiki' (Minderheitler).",
        difficulty = 2,
        funFact = "Die 'Mehrheit', die den Namen begründete, war tatsächlich nur eine knappe Abstimmungsmehrheit in einem Komitee – nicht die Mehrheit der russischen Bevölkerung. Trotzdem behielten die Bolschewiki den Namen als politischen Trumpf."
    ),

    // Question 16 - Rise of Fascism
    Question(
        categoryId = 3,
        questionText = "In welchem Jahr marschierte Benito Mussolini mit seinen Faschisten auf Rom und übernahm die Macht in Italien?",
        answerA = "1920",
        answerB = "1922",
        answerC = "1924",
        answerD = "1926",
        correctAnswer = 1, // B
        explanation = "Im Oktober 1922 organisierte Mussolini den 'Marsch auf Rom'. König Viktor Emanuel III. ernannte Mussolini zum Premierminister, statt das Militär zur Niederschlagung einzusetzen. Mussolini baute danach schrittweise eine Diktatur auf.",
        difficulty = 2,
        funFact = "Mussolini selbst nahm am 'Marsch auf Rom' gar nicht teil – er reiste bequem im Schlafwagen nach Rom. Seine Schwarzhemden marschierten im strömenden Regen, während Il Duce im Trockenen saß."
    ),

    // Question 17 - Rise of Fascism
    Question(
        categoryId = 3,
        questionText = "Welche faschistischen Milizen terrorisierten in Italien nach dem Ersten Weltkrieg politische Gegner?",
        answerA = "Grauhemden",
        answerB = "Sturmabteilungen",
        answerC = "Schwarzhemden",
        answerD = "Camicie Brune",
        correctAnswer = 2, // C
        explanation = "Mussolinis Milizen trugen schwarze Uniformhemden und wurden daher 'Schwarzhemden' (Camicie Nere) genannt. Sie terrorisierten Gewerkschafter, Sozialisten und Kommunisten, zerstörten deren Büros und schlugen Gegner zusammen.",
        difficulty = 2,
        funFact = "Das Wort 'Faschismus' leitet sich vom italienischen 'fascio' (Bündel) ab – ein Symbol für Stärke durch Einheit aus der römischen Antike. Mussolini wählte es bewusst, um an Roms imperiale Vergangenheit anzuknüpfen."
    ),

    // Question 18 - Rise of Fascism in Germany
    Question(
        categoryId = 3,
        questionText = "Welches Ereignis versuchte Hitler am 8./9. November 1923 in München?",
        answerA = "Eine Wahl zu manipulieren",
        answerB = "Den Hitlerputsch (Bürgerbräukeller-Putsch)",
        answerC = "Den Reichstag anzuzünden",
        answerD = "Die Ermordung von Hindenburg",
        correctAnswer = 1, // B
        explanation = "Am 8./9. November 1923 versuchte Hitler mit der NSDAP und ehemaligen Generälen, die Münchner Regierung zu stürzen und dann auf Berlin zu marschieren. Der Putsch scheiterte an der Feldherrnhalle. Hitler wurde verhaftet und zu 5 Jahren Festungshaft verurteilt.",
        difficulty = 2,
        funFact = "Im Gefängnis Landsberg diktierte Hitler seinem Stellvertreter Rudolf Hess 'Mein Kampf'. Er wurde nach nur neun Monaten entlassen. Die Haftzeit hatte er für politische Propaganda genutzt."
    ),

    // Question 19 - Spanish Civil War
    Question(
        categoryId = 3,
        questionText = "Wer war der Anführer der nationalistischen Kräfte im Spanischen Bürgerkrieg?",
        answerA = "Manuel Azaña",
        answerB = "Francisco Franco",
        answerC = "Emilio Mola",
        answerD = "José Antonio Primo de Rivera",
        correctAnswer = 1, // B
        explanation = "General Francisco Franco übernahm nach dem Tod General Molas die Führung der Nationalisten und gewann den Bürgerkrieg 1939. Er regierte Spanien als Diktator bis zu seinem Tod im November 1975.",
        difficulty = 2,
        funFact = "Franco war so vorsichtig und misstrauisch, dass Hitler ihn nach einem langen Treffen 1940 als 'undankbaren Feigling' bezeichnete. Franco hielt Spanien im Zweiten Weltkrieg offiziell neutral, obwohl er Hitler viel verdankte."
    ),

    // Question 20 - Spanish Civil War
    Question(
        categoryId = 3,
        questionText = "Welche deutsche Einheit bombardierte die baskische Stadt Guernica im April 1937 während des Spanischen Bürgerkriegs?",
        answerA = "SS-Division",
        answerB = "Wehrmacht-Infanterie",
        answerC = "Legion Condor",
        answerD = "Kriegsmarine",
        correctAnswer = 2, // C
        explanation = "Die Legion Condor, eine Freiwilligeneinheit der deutschen Luftwaffe, bombardierte Guernica am 26. April 1937. Der Angriff auf die Zivilbevölkerung schockierte die Weltöffentlichkeit. Pablo Picasso verewigte das Massaker in seinem berühmten Gemälde 'Guernica'.",
        difficulty = 2,
        funFact = "Deutschland nutzte den Spanischen Bürgerkrieg als Testgelände für neue Waffen und Taktiken. Die Erfahrungen der Legion Condor flossen direkt in die Blitzkrieg-Doktrin des Zweiten Weltkriegs ein."
    ),

    // Question 21 - Spanish Civil War
    Question(
        categoryId = 3,
        questionText = "Welche ausländischen Mächte unterstützten die Republik im Spanischen Bürgerkrieg?",
        answerA = "Großbritannien und Frankreich",
        answerB = "Die Sowjetunion und Mexiko",
        answerC = "Die USA und Kanada",
        answerD = "Italien und Deutschland",
        correctAnswer = 1, // B
        explanation = "Die Sowjetunion lieferte Waffen, Flugzeuge und Berater an die Spanische Republik, Mexiko entsandte ebenfalls Unterstützung. Großbritannien und Frankreich hielten sich trotz eines Nichteinmischungsabkommens heraus, das Deutschland und Italien systematisch brachen.",
        difficulty = 2,
        funFact = "Etwa 35.000 Freiwillige aus aller Welt kämpften in den Internationalen Brigaden für die Republik – darunter Schriftsteller wie Ernest Hemingway und George Orwell, die später über ihre Erlebnisse schrieben."
    ),

    // Question 22 - Spanish Civil War
    Question(
        categoryId = 3,
        questionText = "Wann endete der Spanische Bürgerkrieg mit dem Sieg der Nationalisten?",
        answerA = "April 1938",
        answerB = "Januar 1940",
        answerC = "April 1939",
        answerD = "Juli 1938",
        correctAnswer = 2, // C
        explanation = "Der Spanische Bürgerkrieg endete am 1. April 1939 mit dem Sieg der Nationalisten unter Franco. Die Republik kapitulierte. Hunderttausende Republikaner flohen ins Exil nach Frankreich, Mexiko und in andere Länder.",
        difficulty = 2,
        funFact = "Über 500.000 Menschen starben im Spanischen Bürgerkrieg durch Kampfhandlungen, Hinrichtungen und Hunger. Francos Repressalien nach dem Sieg kosteten noch einmal Zehntausende das Leben."
    ),

    // Question 23 - League of Nations
    Question(
        categoryId = 3,
        questionText = "Welches Land schlug den Völkerbund vor, trat ihm aber selbst nie bei?",
        answerA = "Großbritannien",
        answerB = "Frankreich",
        answerC = "Die USA",
        answerD = "Deutschland",
        correctAnswer = 2, // C
        explanation = "US-Präsident Woodrow Wilson war der geistige Vater des Völkerbunds und machte ihn zum zentralen Punkt seiner '14 Punkte'. Der US-Senat verweigerte jedoch die Ratifizierung des Versailler Vertrags, womit die USA dem Völkerbund fernblieben.",
        difficulty = 2,
        funFact = "Wilson erlitt während seiner Kampagne für den Völkerbund einen schweren Schlaganfall. Er ließ sich fast ein Jahr lang nicht in der Öffentlichkeit sehen – seine Frau Edith leitete inoffiziell die Regierungsgeschäfte."
    ),

    // Question 24 - League of Nations
    Question(
        categoryId = 3,
        questionText = "Welches Land wurde 1931 vom Völkerbund nach seiner Invasion der Mandschurei verurteilt?",
        answerA = "China",
        answerB = "Japan",
        answerC = "Russland",
        answerD = "Deutschland",
        correctAnswer = 1, // B
        explanation = "Japan marschierte 1931 in die chinesische Mandschurei ein und errichtete den Puppenstaat Mandschukuo. Der Völkerbund verurteilte die Invasion, Japan antwortete 1933 mit dem Austritt aus dem Völkerbund.",
        difficulty = 2,
        funFact = "Der Völkerbund konnte ohne eigene Streitkräfte und ohne Unterstützung der USA keine echten Sanktionen durchsetzen. Japan ignorierte die Verurteilung schlicht – ein frühes Zeichen der Schwäche der internationalen Organisation."
    ),

    // Question 25 - League of Nations
    Question(
        categoryId = 3,
        questionText = "In welcher Stadt hatte der Völkerbund seinen Hauptsitz?",
        answerA = "Wien",
        answerB = "Paris",
        answerC = "Genf",
        answerD = "Den Haag",
        correctAnswer = 2, // C
        explanation = "Der Völkerbund hatte seinen Hauptsitz in Genf, Schweiz. Das Palais des Nations, 1929–1938 erbaut, diente als Hauptquartier. Heute ist es Sitz des UN-Büros in Genf.",
        difficulty = 2,
        funFact = "Die Schweiz, selbst ein neutrales Land, war der ideale Standort. Ironischerweise trat die Schweiz dem Völkerbund erst 1920 bei – und war damit streng genommen kein Gründungsmitglied, obwohl der Sitz in Genf lag."
    ),

    // Question 26 - Great Depression
    Question(
        categoryId = 3,
        questionText = "An welchem Datum begann der Börsencrash, der die Weltwirtschaftskrise einleitete?",
        answerA = "29. Oktober 1929",
        answerB = "15. September 1929",
        answerC = "3. Oktober 1930",
        answerD = "24. Oktober 1928",
        correctAnswer = 0, // A
        explanation = "Am 'Schwarzen Dienstag', dem 29. Oktober 1929, brach die New Yorker Börse ein. Aktien verloren innerhalb von Stunden Milliarden an Wert. Es folgte die schwerste Wirtschaftskrise der modernen Geschichte.",
        difficulty = 2,
        funFact = "Dem 'Schwarzen Dienstag' ging der 'Schwarze Donnerstag' (24. Oktober) voraus. Banker versuchten durch koordinierte Käufe die Panik einzudämmen – es gelang nur kurz. Am Dienstag brach alles endgültig ein."
    ),

    // Question 27 - Great Depression
    Question(
        categoryId = 3,
        questionText = "Welches US-Programm versuchte, die Wirtschaft in den 1930er Jahren durch staatliche Investitionen wiederzubeleben?",
        answerA = "Fair Deal",
        answerB = "New Deal",
        answerC = "Marshall Plan",
        answerD = "Square Deal",
        correctAnswer = 1, // B
        explanation = "Der 'New Deal' von Präsident Franklin D. Roosevelt (ab 1933) umfasste staatliche Arbeitsprogramme, Bankenreformen und Sozialversicherung. Er linderte das Elend, die Wirtschaftskrise endete aber erst mit dem Zweiten Weltkrieg.",
        difficulty = 2,
        funFact = "Das Tennessee Valley Authority-Projekt baute Dämme, erzeugte Strom und schuf Jobs in einer der ärmsten Regionen der USA. Es gilt als eines der größten staatlichen Infrastrukturprojekte der Geschichte."
    ),

    // Question 28 - Interwar Period
    Question(
        categoryId = 3,
        questionText = "Wie hieß der Pakt von 1928, in dem Kriegführung als Mittel nationaler Politik geächtet wurde?",
        answerA = "Locarno-Vertrag",
        answerB = "Briand-Kellogg-Pakt",
        answerC = "Genfer Protokoll",
        answerD = "Washington Naval Treaty",
        correctAnswer = 1, // B
        explanation = "Der Briand-Kellogg-Pakt (auch Kellogg-Briand-Pakt) von 1928 wurde von 62 Staaten unterzeichnet. Er erklärte den Angriffskrieg für illegal. Er hatte jedoch keine Durchsetzungsmechanismen und blieb wirkungslos.",
        difficulty = 2,
        funFact = "Der Pakt ist formal bis heute in Kraft – auch Deutschland und Japan haben ihn nicht gekündigt. Er bildete rechtlich die Grundlage für die Kriegsverbrecherprozesse in Nürnberg und Tokio nach dem Zweiten Weltkrieg."
    ),

    // Question 29 - Interwar Period
    Question(
        categoryId = 3,
        questionText = "Welches Abkommen von 1925 garantierte die deutsch-französisch-belgischen Grenzen und galt als Meilenstein der Entspannung?",
        answerA = "Rapallo-Vertrag",
        answerB = "Lausanne-Vertrag",
        answerC = "Vertrag von Locarno",
        answerD = "Dawes-Plan",
        correctAnswer = 2, // C
        explanation = "Die Verträge von Locarno (Oktober 1925) garantierten die Westgrenzen Deutschlands und regelten Schiedsverfahren für Ostgrenzstreitigkeiten. Deutschland, Frankreich und Großbritannien näherten sich an – eine kurze Phase des Optimismus folgte.",
        difficulty = 2,
        funFact = "Der deutsche Außenminister Gustav Stresemann erhielt dafür den Friedensnobelpreis. Er starb 1929, kurz vor dem Börsenkrach – er erlebte nicht, wie seine Errungenschaften durch die Weltwirtschaftskrise und den Aufstieg der NSDAP zunichte gemacht wurden."
    ),

    // Question 30 - Weimar Republic culture
    Question(
        categoryId = 3,
        questionText = "Welche Kunstschule wurde 1919 in Weimar gegründet und prägte das moderne Design nachhaltig?",
        answerA = "Akademie der Künste",
        answerB = "Bauhaus",
        answerC = "Blaue Reiter",
        answerD = "Jugendstil-Atelier",
        correctAnswer = 1, // B
        explanation = "Das Bauhaus wurde 1919 von Walter Gropius in Weimar gegründet. Es verband Kunst, Handwerk und Technik und entwickelte ein minimalistisches, funktionales Designprinzip, das bis heute in Architektur, Typografie und Produktdesign wirkt.",
        difficulty = 2,
        funFact = "Die Nationalsozialisten erzwangen 1933 die Schließung des Bauhauses als 'undeutsch' und 'kommunistisch'. Viele Lehrer emigrierten in die USA, wo sie das Bauhaus-Denken an Universitäten wie dem MIT und der Harvard weitertrugen."
    ),

    // Question 31 - WWI causes
    Question(
        categoryId = 3,
        questionText = "Welche Wirkung hatte Artikel 231 des Versailler Vertrags, der Deutschland die Alleinschuld am Ersten Weltkrieg zuwies?",
        answerA = "Er regelte die Gebietsabtretungen",
        answerB = "Er war die Grundlage für die Reparationsforderungen",
        answerC = "Er löste sofort einen neuen Krieg aus",
        answerD = "Er schuf den Völkerbund",
        correctAnswer = 1, // B
        explanation = "Die 'Kriegsschuldklausel' (Artikel 231) diente als rechtliche Grundlage für die Reparationsforderungen an Deutschland. Die Gesamtsumme wurde 1921 auf 132 Milliarden Goldmark festgesetzt und schürte tiefen deutschen Ressentiments.",
        difficulty = 2,
        funFact = "Deutschland leistete die letzte Reparationszahlung erst am 3. Oktober 2010 – 92 Jahre nach Ende des Ersten Weltkriegs. Die letzten Zinsen auf Nachkriegsanleihen aus den 1920er Jahren wurden damit beglichen."
    ),

    // Question 32 - Russian Revolution
    Question(
        categoryId = 3,
        questionText = "Wie hieß die zaristische Geheimpolizei, die die Bolschewiki durch die eigene Geheimpolizei Tscheka ersetzten?",
        answerA = "NKWD",
        answerB = "Ochrana",
        answerC = "GPU",
        answerD = "KGB",
        correctAnswer = 1, // B
        explanation = "Die Ochrana (Departement für Staatsschutz) war die zaristische Geheimpolizei. Die Bolschewiki gründeten als Ersatz die Tscheka (Außerordentliche Kommission) unter Felix Dserschinski, die den Roten Terror leitete.",
        difficulty = 2,
        funFact = "Die Ochrana hatte vor der Revolution so tiefe Verbindungen zu revolutionären Gruppen, dass einige Historiker spekulieren, ob bestimmte Attentate nicht absichtlich zugelassen wurden, um härtere Repressionsgesetze durchzusetzen."
    ),

    // Question 33 - WWI Eastern Front
    Question(
        categoryId = 3,
        questionText = "Wie hieß die russische Großoffensive von 1916, die Österreich-Ungarn fast zum Zusammenbruch brachte?",
        answerA = "Brussilow-Offensive",
        answerB = "Tankow-Offensive",
        answerC = "Kerenski-Offensive",
        answerD = "Petrograd-Offensive",
        correctAnswer = 0, // A
        explanation = "Die Brussilow-Offensive (Juni–September 1916) unter General Alexei Brussilow erzielte einen der größten Erfolge der Entente im Ersten Weltkrieg. Österreich-Ungarn erlitt über 1,5 Millionen Verluste, aber die russische Armee erschöpfte sich dabei selbst.",
        difficulty = 2,
        funFact = "Die innovative Taktik der Brussilow-Offensive – Angriffe an mehreren Stellen gleichzeitig statt an einem einzigen Schwerpunkt – gilt als Vorläufer moderner Infiltrationstaktiken und wurde in späteren Kriegen weltweit studiert."
    ),

    // Question 34 - Weimar Republic end
    Question(
        categoryId = 3,
        questionText = "Wer ernannte Adolf Hitler am 30. Januar 1933 zum Reichskanzler?",
        answerA = "Paul von Hindenburg",
        answerB = "Franz von Papen",
        answerC = "Hermann Göring",
        answerD = "Ernst Röhm",
        correctAnswer = 0, // A
        explanation = "Reichspräsident Paul von Hindenburg ernannte Hitler am 30. Januar 1933 zum Reichskanzler. Er tat dies widerwillig auf Drängen konservativer Berater wie Franz von Papen, die glaubten, Hitler für ihre Ziele einspannen zu können.",
        difficulty = 2,
        funFact = "Hindenburg hatte Hitler ursprünglich tief verachtet und ihn 'den böhmischen Gefreiten' genannt. Die Entscheidung, ihn zu ernennen, galt schon damals als fataler Fehler – und wurde Geschichte."
    ),

    // Question 35 - Rise of Fascism Spain
    Question(
        categoryId = 3,
        questionText = "Welche spanische faschistische Bewegung gründete José Antonio Primo de Rivera 1933?",
        answerA = "Carlist-Bewegung",
        answerB = "Falange Española",
        answerC = "Confederación Nacional del Trabajo",
        answerD = "CEDA",
        correctAnswer = 1, // B
        explanation = "Die Falange Española (Spanische Phalanx) wurde 1933 von José Antonio Primo de Rivera gegründet. Sie war die wichtigste faschistische Bewegung Spaniens. Primo de Rivera wurde 1936 von der Republik erschossen, wurde aber von Franco zur Märtyrerfigur stilisiert.",
        difficulty = 2,
        funFact = "Franco vereinnahmte die Falange politisch und verschmolz sie 1937 zwangsweise mit anderen nationalistischen Gruppen zur FET y de las JONS. Echte Falangisten und ihre Nachkommen haben Franco nie vergeben, dass er ihre Bewegung instrumentalisierte."
    ),

    // Question 36 - Interwar Germany
    Question(
        categoryId = 3,
        questionText = "Wie hieß der US-amerikanische Plan von 1924, der Deutschlands Reparationszahlungen neu regelte und ausländische Kredite ermöglichte?",
        answerA = "Wilson-Plan",
        answerB = "Marshall-Plan",
        answerC = "Young-Plan",
        answerD = "Dawes-Plan",
        correctAnswer = 3, // D
        explanation = "Der Dawes-Plan (1924) strukturierte Deutschlands Reparationszahlungen neu und ermöglichte große US-Kredite nach Deutschland. Er stabilisierte die Weimarer Republik kurzfristig – bis die Weltwirtschaftskrise 1929 die US-Kredite versiegte.",
        difficulty = 2,
        funFact = "Das Geld floss in einem merkwürdigen Kreislauf: US-Banken gaben Deutschland Kredite, Deutschland zahlte Reparationen an Frankreich und Großbritannien, die damit ihre Kriegsschulden an die USA begleichen – alles war voneinander abhängig."
    ),

    // Question 37 - WWI technology
    Question(
        categoryId = 3,
        questionText = "Wie hieß die deutsche Marine-Strategie, mit der U-Boote ohne Vorwarnung jedes Schiff in bestimmten Gebieten versenkten?",
        answerA = "Flottengesetz",
        answerB = "Uneingeschränkter U-Boot-Krieg",
        answerC = "Hungerblockade",
        answerD = "Schlieffen-Plan",
        correctAnswer = 1, // B
        explanation = "Der 'uneingeschränkte U-Boot-Krieg', den Deutschland ab Februar 1917 wieder aufnahm, versankte alle Schiffe in bestimmten Seegebieten ohne Vorwarnung – auch neutrale. Die Versenkung amerikanischer Schiffe war einer der Hauptgründe für den US-Kriegseintritt.",
        difficulty = 2,
        funFact = "Die Versenkung der Lusitania (1915) mit 1.198 Toten, darunter 128 Amerikaner, empörte die USA. Deutschland setzte den uneingeschränkten U-Boot-Krieg zunächst aus – um ihn 1917 wieder aufzunehmen und den US-Kriegseintritt zu riskieren."
    ),

    // Question 38 - Russian Civil War
    Question(
        categoryId = 3,
        questionText = "Wie nannte man die Kräfte, die gegen die bolschewistische Rote Armee im russischen Bürgerkrieg kämpften?",
        answerA = "Grüne Armee",
        answerB = "Weiße Armee",
        answerC = "Zaristische Garde",
        answerD = "Demokratische Front",
        correctAnswer = 1, // B
        explanation = "Die 'Weiße Armee' oder 'Weißgardisten' waren ein loses Bündnis aus monarchistischen, liberalen und sozialistischen Gegnern der Bolschewiki. Sie erhielten Unterstützung von Großbritannien, Frankreich, den USA und Japan, wurden aber 1920/21 besiegt.",
        difficulty = 2,
        funFact = "Neben Roten und Weißen gab es noch eine 'Grüne Armee' aus Bauern, die beide Seiten ablehnten und für sich kämpften. Anarchisten unter Nestor Machno kontrollierten zeitweise große Teile der Ukraine."
    ),

    // Question 39 - Weimar Constitution
    Question(
        categoryId = 3,
        questionText = "Wer war der erste gewählte Reichspräsident der Weimarer Republik?",
        answerA = "Paul von Hindenburg",
        answerB = "Friedrich Ebert",
        answerC = "Philipp Scheidemann",
        answerD = "Gustav Stresemann",
        correctAnswer = 1, // B
        explanation = "Friedrich Ebert (SPD) war der erste Reichspräsident der Weimarer Republik (1919–1925). Er wurde zunächst von der Nationalversammlung gewählt. Ebert starb 1925 an den Folgen einer Appendizitis, weil er trotz Schmerzen seinen Posten nicht verlassen wollte.",
        difficulty = 2,
        funFact = "Ebert wurde ständig von nationalistischen Kreisen angegriffen, die ihm Vaterlandsverrat vorwarfen. Er gewann zwar Verleumdungsprozesse, nahm die Aufregung aber so ernst, dass er die medizinische Behandlung seiner Appendizitis verzögerte – mit tödlichen Folgen."
    ),

    // Question 40 - Fascism ideology
    Question(
        categoryId = 3,
        questionText = "Welcher Begriff beschreibt Mussolinis Wirtschaftsmodell, das Staat, Unternehmer und Arbeiter unter staatlicher Kontrolle vereinen sollte?",
        answerA = "Sozialismus",
        answerB = "Korporatismus",
        answerC = "Liberalismus",
        answerD = "Kommunismus",
        correctAnswer = 1, // B
        explanation = "Der faschistische Korporatismus sollte Klassenkonflikte durch staatlich gelenkte Kooperation von Arbeitgebern und Arbeitnehmern überwinden. In der Praxis bedeutete er die Zerschlagung freier Gewerkschaften und die Kontrolle der Wirtschaft durch den Staat.",
        difficulty = 2,
        funFact = "Mussolini ließ Zuge pünktlich fahren – so lautet ein bekanntes Klischee. Historiker bezweifeln das: Die Bahnpunktlichkeit verbesserte sich kaum unter dem Faschismus. Der Mythos war schlicht gute Propaganda."
    ),

    // Question 41 - WWI aftermath
    Question(
        categoryId = 3,
        questionText = "Welches Territorium trat Deutschland laut Versailler Vertrag an Frankreich zurück?",
        answerA = "Schlesien",
        answerB = "Saargebiet und Elsass-Lothringen",
        answerC = "Böhmen",
        answerD = "Österreich",
        correctAnswer = 1, // B
        explanation = "Deutschland musste Elsass-Lothringen an Frankreich zurückgeben, das seit 1871 deutsch gewesen war. Das Saargebiet wurde für 15 Jahre unter Völkerbundmandat gestellt, bevor eine Volksabstimmung 1935 für die Rückkehr zu Deutschland stimmte.",
        difficulty = 2,
        funFact = "Die Volksabstimmung im Saargebiet 1935 fand unter nationalsozialistischer Herrschaft statt. Trotzdem stimmten über 90 % für den Anschluss an Deutschland – ein echter politischer Erfolg für Hitler, der ihn international als gemäßigt erscheinen ließ."
    ),

    // Question 42 - Great Depression Germany
    Question(
        categoryId = 3,
        questionText = "Wie hoch war die Arbeitslosenquote in Deutschland auf dem Höhepunkt der Weltwirtschaftskrise um 1932?",
        answerA = "Etwa 10 %",
        answerB = "Etwa 44 %",
        answerC = "Etwa 25 %",
        answerD = "Etwa 60 %",
        correctAnswer = 1, // B
        explanation = "Im Winter 1932 waren in Deutschland etwa 6 Millionen Menschen offiziell arbeitslos – rund 44 % der Erwerbsbevölkerung. Die Dunkelziffer lag noch höher. Diese soziale Katastrophe trieb Millionen in die Arme extremer Parteien.",
        difficulty = 2,
        funFact = "Neben den offiziellen Arbeitslosen gab es Millionen Kurzarbeiter und 'verdeckte' Arbeitslose. Ganze Familien verarmten. Die Suppenküchen und Massenquartiere der großen Städte wurden zu Symbolen der Weimarer Endkrise."
    ),

    // Question 43 - Russian Revolution
    Question(
        categoryId = 3,
        questionText = "Was verstand Lenin unter dem Begriff 'Imperialismus als höchstes Stadium des Kapitalismus'?",
        answerA = "Kapitalistische Länder expandieren militärisch, um Märkte und Ressourcen zu sichern",
        answerB = "Imperialismus ist eine Vorstufe zum Sozialismus",
        answerC = "Kolonialismus ist notwendig für wirtschaftlichen Fortschritt",
        answerD = "Krieg ist unvermeidlich zwischen kapitalistischen Nationen",
        correctAnswer = 0, // A
        explanation = "In seiner 1916 verfassten Schrift argumentierte Lenin, der Kapitalismus exportiere Kapital in Kolonien und halbkoloniale Länder, weil die Profitrate im Inland sinke. Kriege entstünden durch Konkurrenz der kapitalistischen Mächte um Ressourcen und Märkte.",
        difficulty = 2,
        funFact = "Lenin schrieb das Werk im Zürcher Exil während des Ersten Weltkriegs. Er nutzte es als theoretische Begründung, warum Sozialisten den 'imperialistischen Krieg' ablehnen sollten – und warum Revolutionen auch in rückständigen Ländern wie Russland möglich seien."
    ),

    // Question 44 - Weimar Republic parties
    Question(
        categoryId = 3,
        questionText = "Welche Partei war die wichtigste demokratische Stütze der Weimarer Republik und ihre erste Regierungspartei?",
        answerA = "Zentrumspartei",
        answerB = "Deutsche Demokratische Partei (DDP)",
        answerC = "Sozialdemokratische Partei (SPD)",
        answerD = "Deutsche Volkspartei (DVP)",
        correctAnswer = 2, // C
        explanation = "Die SPD war die stärkste prorepublikanische Kraft in der Weimarer Republik. Ihr Mitglied Philipp Scheidemann rief die Republik aus, ihr Mitglied Friedrich Ebert wurde erster Reichspräsident. Die SPD verteidigte Weimar konsequent bis zum Ende.",
        difficulty = 2,
        funFact = "Als Hitler am 23. März 1933 das Ermächtigungsgesetz vorlegte, stimmten alle Parteien außer der SPD dafür – aus Angst oder Opportunismus. SPD-Fraktionschef Otto Wels hielt eine mutige Rede dagegen: 'Freiheit und Leben kann man uns nehmen, die Ehre nicht.'"
    ),

    // Question 45 - Interwar nationalism
    Question(
        categoryId = 3,
        questionText = "Welcher Begriff beschrieb die Gebiete mit deutschsprachiger Bevölkerung außerhalb Deutschlands, die Hitler annektieren wollte?",
        answerA = "Südmark",
        answerB = "Volksgemeinschaft",
        answerC = "Lebensraum",
        answerD = "Heim ins Reich",
        correctAnswer = 3, // D
        explanation = "'Heim ins Reich' war die NS-Propaganda-Parole für die Annexion deutschsprachiger Gebiete. Sie wurde für Österreich (1938) und das Sudetenland (1938) eingesetzt. Der Begriff verknüpfte ethnischen Nationalismus mit imperialen Ambitionen.",
        difficulty = 2,
        funFact = "Die westlichen Mächte tolerierten im Münchner Abkommen (1938) die Annexion des Sudetenlands, um Hitler zu beschwichtigen. Premierminister Chamberlain sprach von 'Frieden in unserer Zeit' – sechs Monate später besetzte Hitler den Rest der Tschechoslowakei."
    ),

    // Question 46 - WWI naval war
    Question(
        categoryId = 3,
        questionText = "Wie hieß die einzige große Seeschlacht zwischen der britischen und deutschen Flotte im Ersten Weltkrieg (1916)?",
        answerA = "Seeschlacht von Helgoland",
        answerB = "Seeschlacht am Skagerrak",
        answerC = "Seeschlacht bei Jutland",
        answerD = "A und C sind dasselbe",
        correctAnswer = 3, // D
        explanation = "Die Seeschlacht am Skagerrak (britisch: Battle of Jutland) fand vom 31. Mai bis 1. Juni 1916 statt. Beide Seiten beanspruchten den Sieg: Die Briten verloren mehr Schiffe, die Deutschen mehr Männer. Die deutsche Hochseeflotte wagte danach keine weitere Ausfahrt.",
        difficulty = 2,
        funFact = "Ein amerikanischer Journalist schrieb: 'Die deutsche Flotte hat den Wärter angegriffen, ist aber noch immer im Gefängnis.' Die britische Seeblockade blieb intakt – Deutschland konnte Überseehandel nicht wiederaufnehmen."
    ),

    // Question 47 - Interwar period fascism
    Question(
        categoryId = 3,
        questionText = "Welcher österreichische Kanzler errichtete 1933/34 einen 'Austro-Faschismus' und unterdrückte die Sozialdemokraten?",
        answerA = "Otto Habsburg",
        answerB = "Arthur Seyss-Inquart",
        answerC = "Engelbert Dollfuß",
        answerD = "Karl Renner",
        correctAnswer = 2, // C
        explanation = "Engelbert Dollfuß schaltete 1933 das österreichische Parlament aus und errichtete einen autoritären 'Ständestaat'. 1934 ließ er Arbeiteraufstände blutig niederschlagen. Er wurde im Juli 1934 bei einem NS-Putschversuch ermordet.",
        difficulty = 2,
        funFact = "Die Mörder ließen Dollfuß nach dem Attentat verblutenund ließen ihn ohne medizinische Hilfe liegen, obwohl ein Arzt hätte gerufen werden können. Der Putsch scheiterte, weil Mussolini – damals noch kein Hitler-Verbündeter – österreichische Truppen an der Grenze zusammenzog."
    ),

    // Question 48 - WWI Western Front
    Question(
        categoryId = 3,
        questionText = "Welcher Plan sah 1914 vor, Frankreich durch Belgien blitzschnell zu schlagen, bevor Russland mobilisiert?",
        answerA = "Hindenburg-Plan",
        answerB = "Falkenhayn-Plan",
        answerC = "Schlieffen-Plan",
        answerD = "Moltke-Plan",
        correctAnswer = 2, // C
        explanation = "Der Schlieffen-Plan (entwickelt von Generalstabschef Alfred von Schlieffen) sah einen massiven Schwenk durch Belgien vor, um Frankreich zu umfassen und schnell zu besiegen, bevor Russland vollständig mobilisiert war. Der Plan scheiterte 1914 an der Marne.",
        difficulty = 2,
        funFact = "Belgiens Neutralität war durch den Londoner Vertrag von 1839 garantiert. Als Deutschland einmarschierte, trat Großbritannien in den Krieg ein. Kaiser Wilhelm II. soll entsetzt gefragt haben, ob man wirklich wegen eines 'Fetzen Papiers' Krieg führe."
    ),

    // Question 49 - Russian Revolution aftermath
    Question(
        categoryId = 3,
        questionText = "Wie hieß die Politik der Bolschewiki, Getreide gewaltsam von Bauern zu beschlagnahmen, um die städtische Bevölkerung zu ernähren?",
        answerA = "Neue Ökonomische Politik",
        answerB = "Kollektivierung",
        answerC = "Kriegskommunismus",
        answerD = "Prodrazvyorstka",
        correctAnswer = 2, // C
        explanation = "Der 'Kriegskommunismus' (1918–1921) umfasste die gewaltsame Requirierung von Getreide bei Bauern (Prodrazverstka), Verstaatlichung der Industrie und Abschaffung des Marktes. Er führte zu Hungersnöten und Bauernaufständen und wurde 1921 durch die NÖP ersetzt.",
        difficulty = 2,
        funFact = "Die Hungersnot von 1921/22 tötete schätzungsweise 5 Millionen Menschen in Russland. Amerikanische Hilfsorganisationen unter Herbert Hoover retteten Millionen weitere – eine pikante historische Ironie, da Hoover später als Präsident die US-Weltwirtschaftskrise verschlimmerte."
    ),

    // Question 50 - League of Nations failure
    Question(
        categoryId = 3,
        questionText = "Warum scheiterte der Völkerbund bei der Abwehr von Italiens Invasion Äthiopiens (1935/36)?",
        answerA = "Der Völkerbund hatte keine Mitglieder mehr",
        answerB = "Sanktionen schlossen kein Erdöl ein und Großbritannien und Frankreich weigerten sich, den Suezkanal zu sperren",
        answerC = "Äthiopien war kein Völkerbundmitglied",
        answerD = "Die USA vetoten jede Maßnahme",
        correctAnswer = 1, // B
        explanation = "Der Völkerbund verhängte Wirtschaftssanktionen gegen Italien, schloss aber gezielt Erdöl aus – da ein Ölembargo Mussolini wirklich hätte stoppen können. Großbritannien und Frankreich scheuten den Konflikt, weil sie Mussolini als Verbündeten gegen Hitler gewinnen wollten.",
        difficulty = 2,
        funFact = "Der Versuch, Mussolini zu beschwichtigen, scheiterte spektakulär: Kurz nach dem Krieg in Äthiopien verbündete er sich doch mit Hitler. Das Haile-Hoare-Abkommen, das Äthiopien teilweise Italien zugesprochen hätte, wurde durch einen Skandal zu Fall gebracht."
    ),

)
