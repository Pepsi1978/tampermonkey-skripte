package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun mixedQuestionsHard2(): List<Question> = listOf(

    // --- GRUNDGESETZ & VERFASSUNGSRECHT (10) ---

    Question(
        categoryId = 11,
        questionText = "Wann trat das Grundgesetz der Bundesrepublik Deutschland in Kraft?",
        answerA = "8. Mai 1945",
        answerB = "23. Mai 1949",
        answerC = "3. Oktober 1990",
        answerD = "1. Januar 1957",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das Grundgesetz wurde am 23. Mai 1949 verkündet und trat am selben Tag in Kraft. Es wurde vom Parlamentarischen Rat in Bonn erarbeitet und ist seitdem die Verfassung der Bundesrepublik Deutschland.",
        funFact = "Das Grundgesetz sollte ursprünglich nur als vorläufige Verfassung gelten, bis Deutschland wiedervereinigt wäre — doch nach der Wiedervereinigung 1990 blieb es als dauerhafte Verfassung bestehen."
    ),

    Question(
        categoryId = 11,
        questionText = "Welcher Artikel des Grundgesetzes enthält die 'Ewigkeitsklausel', die bestimmte Verfassungsprinzipien vor Änderungen schützt?",
        answerA = "Artikel 1 GG",
        answerB = "Artikel 20 GG",
        answerC = "Artikel 79 Abs. 3 GG",
        answerD = "Artikel 93 GG",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Artikel 79 Abs. 3 GG verbietet Änderungen der Verfassung, die die Grundsätze aus Art. 1 (Menschenwürde) und Art. 20 (Demokratie, Rechtsstaat, Sozialstaat, Bundesstaat) berühren. Diese Normen sind selbst für den verfassungsändernden Gesetzgeber unantastbar.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was besagt das Prinzip der 'Verhältnismäßigkeit' im deutschen Verfassungsrecht?",
        answerA = "Alle Bürger sind vor dem Gesetz gleich",
        answerB = "Gesetze dürfen rückwirkend keine Strafen verhängen",
        answerC = "Die Staatsgewalt geht vom Volke aus",
        answerD = "Staatseingriffe müssen geeignet, erforderlich und angemessen sein",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Der Verhältnismäßigkeitsgrundsatz verlangt, dass staatliche Eingriffe in Grundrechte drei Stufen bestehen: Geeignetheit (taugt das Mittel zum Zweck?), Erforderlichkeit (gibt es mildere Mittel?) und Angemessenheit (steht der Eingriff in Relation zum Ziel?).",
        funFact = "Das Bundesverfassungsgericht hat den Verhältnismäßigkeitsgrundsatz als überragendes rechtsstaatliches Prinzip bezeichnet und wendet ihn in nahezu jeder Grundrechtsprüfung an."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Organ der Bundesrepublik hat das alleinige Recht, ein Bundesgesetz für verfassungswidrig zu erklären?",
        answerA = "Der Bundesrat",
        answerB = "Das Bundesverwaltungsgericht",
        answerC = "Das Bundesverfassungsgericht",
        answerD = "Der Bundespräsident",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Das Bundesverfassungsgericht in Karlsruhe hat als einziges Gericht das Recht, Bundesgesetze für mit dem Grundgesetz unvereinbar und damit nichtig zu erklären (Normverwerfungsmonopol). Andere Gerichte müssen eine Vorlage machen.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was versteht man unter einer 'Verfassungsbeschwerde' in Deutschland?",
        answerA = "Eine Klage gegen einen anderen Staat vor dem Internationalen Gerichtshof",
        answerB = "Eine Beschwerde des Bundesrates gegen ein Bundesgesetz",
        answerC = "Ein Rechtsmittel eines Bürgers gegen Verletzung seiner Grundrechte durch die öffentliche Gewalt",
        answerD = "Eine Klage des Bundestages gegen den Bundespräsidenten",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Die Verfassungsbeschwerde (Art. 93 Abs. 1 Nr. 4a GG) ist ein außerordentlicher Rechtsbehelf, mit dem jeder Bürger beim Bundesverfassungsgericht rügen kann, durch die öffentliche Gewalt in seinen Grundrechten verletzt zu werden — allerdings erst nach Erschöpfung des Rechtswegs.",
        funFact = "Jährlich gehen beim Bundesverfassungsgericht über 6.000 Verfassungsbeschwerden ein. Nur etwa 1–2 % davon sind erfolgreich."
    ),

    Question(
        categoryId = 11,
        questionText = "Was bedeutet 'Normenhierarchie' im deutschen Rechtssystem?",
        answerA = "Die Rangfolge verschiedener Rechtsquellen, wobei höherrangiges Recht vorgeht",
        answerB = "Die zeitliche Abfolge der Gesetzgebung",
        answerC = "Die geographische Zuständigkeit verschiedener Gerichte",
        answerD = "Die Einteilung von Gesetzen in öffentliches und privates Recht",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Die Normenhierarchie ordnet Rechtsquellen nach ihrer Rangordnung: Grundgesetz > Bundesgesetze > Landesverfassungen > Landesgesetze > Verordnungen > Satzungen. Widersprüche werden durch den Grundsatz lex superior derogat legi inferiori aufgelöst.",
        funFact = "Das Grundgesetz steht an der Spitze der deutschen Normenhierarchie. Selbst der Gesetzgeber kann es nur mit Zweidrittelmehrheit in Bundestag und Bundesrat ändern."
    ),

    Question(
        categoryId = 11,
        questionText = "Was bezeichnet man als 'konstruktives Misstrauensvotum' im Grundgesetz?",
        answerA = "Den Rücktritt des Bundeskanzlers auf eigenen Wunsch",
        answerB = "Die Möglichkeit des Bundestages, den Kanzler nur durch Wahl eines Nachfolgers abzusetzen",
        answerC = "Das Recht des Bundespräsidenten, den Bundestag aufzulösen",
        answerD = "Die Ablehnung des Haushaltsgesetzes durch den Bundesrat",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Art. 67 GG sieht vor, dass der Bundestag dem Bundeskanzler nur dann das Misstrauen aussprechen kann, wenn er gleichzeitig mit der Mehrheit seiner Mitglieder einen Nachfolger wählt. Diese Konstruktion soll Regierungskrisen wie in der Weimarer Republik verhindern.",
        funFact = "Das konstruktive Misstrauensvotum wurde bisher zweimal angewendet: 1972 (Rainer Barzel gegen Willy Brandt, scheiterte) und 1982 (Helmut Kohl löste Helmut Schmidt ab, erfolgreich)."
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Prinzip besagt, dass staatliche Gesetze nicht rückwirkend Straftaten einführen oder Strafen verschärfen dürfen?",
        answerA = "Nemo-tenetur-Grundsatz",
        answerB = "In-dubio-pro-reo-Grundsatz",
        answerC = "Nullum-crimen-sine-lege-Grundsatz",
        answerD = "Ne-bis-in-idem-Grundsatz",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Nullum crimen, nulla poena sine lege (kein Verbrechen, keine Strafe ohne Gesetz) ist in Art. 103 Abs. 2 GG verankert. Es verbietet rückwirkende Strafgesetze und fordert, dass strafbare Handlungen im Gesetz klar bestimmt sein müssen.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Welches Grundrecht schützt Artikel 5 Abs. 1 Satz 1 des Grundgesetzes?",
        answerA = "Das Recht auf körperliche Unversehrtheit",
        answerB = "Die Freiheit der Person",
        answerC = "Die Meinungs- und Informationsfreiheit",
        answerD = "Das Recht auf Eigentum",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Art. 5 Abs. 1 S. 1 GG schützt die Meinungsfreiheit und die Informationsfreiheit (Recht, sich aus allgemein zugänglichen Quellen zu unterrichten). Diese Grundrechte stehen jedoch unter Gesetzesvorbehalt und gelten nicht schrankenlos.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist die 'Gegendarstellung' im deutschen Presserecht?",
        answerA = "Das Recht eines Journalisten, Informanten zu schützen",
        answerB = "Die staatliche Zensur von Presseerzeugnissen",
        answerC = "Die Haftung eines Verlags für den Inhalt seiner Publikationen",
        answerD = "Das Recht einer betroffenen Person, auf eine Tatsachenbehauptung in einem Medium zu antworten",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Das Gegendarstellungsrecht (geregelt in den Landespressegesetzen) gibt jeder Person, über die ein Medium eine Tatsachenbehauptung aufgestellt hat, das Recht, eine Gegendarstellung abdrucken zu lassen — unabhängig davon, ob die ursprüngliche Meldung wahr oder falsch war.",
        funFact = "Im Unterschied zur Gegendarstellung gibt es den Widerruf, bei dem der Verlag selbst eine falsche Behauptung zurücknimmt — dieser muss klagbar erstritten werden."
    ),

    // --- STRAFRECHT (10) ---

    Question(
        categoryId = 11,
        questionText = "Was versteht man im deutschen Strafrecht unter 'Vorsatz'?",
        answerA = "Die fahrlässige Herbeiführung eines Schadens",
        answerB = "Die Schuldfähigkeit des Täters",
        answerC = "Die Planung einer Straftat durch mehrere Personen",
        answerD = "Das Wissen und Wollen der Tatbestandsverwirklichung",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Vorsatz bedeutet das Wissen um die Tatumstände und der Wille zur Tatbestandsverwirklichung. Das StGB unterscheidet dolus directus 1. Grades (Absicht), dolus directus 2. Grades (sicheres Wissen) und dolus eventualis (bedingter Vorsatz).",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist der Unterschied zwischen 'Täterschaft' und 'Beihilfe' im deutschen Strafrecht?",
        answerA = "Der Täter führt die Tat als eigene aus, der Gehilfe fördert vorsätzlich eine fremde Tat",
        answerB = "Täterschaft bezieht sich nur auf Kapitalverbrechen, Beihilfe auf leichtere Vergehen",
        answerC = "Täterschaft ist straflos, Beihilfe wird stets mit Freiheitsentzug bestraft",
        answerD = "Beide Begriffe sind im modernen StGB bedeutungsgleich",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Nach § 25 StGB ist Täter, wer die Tat selbst oder durch einen anderen begeht. Gehilfe (§ 27 StGB) ist, wer einem anderen zu dessen vorsätzlicher rechtswidriger Tat vorsätzlich Hilfe leistet. Die Beihilfe wird nach § 49 StGB gemildert.",
        funFact = "Die Abgrenzung zwischen Mittäterschaft und Beihilfe ist eines der meistdiskutierten Probleme im deutschen Strafrecht. Der BGH nutzt dafür die sogenannte Tatherrschaftslehre."
    ),

    Question(
        categoryId = 11,
        questionText = "Was bedeutet der lateinische Grundsatz 'In dubio pro reo'?",
        answerA = "Im Zweifel für den Angeklagten",
        answerB = "Keine Strafe ohne Gesetz",
        answerC = "Der Staat muss die Schuld beweisen",
        answerD = "Niemand darf zweimal wegen derselben Tat bestraft werden",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Im Zweifel für den Angeklagten ist ein fundamentaler Grundsatz des deutschen Strafprozessrechts. Er besagt, dass das Gericht bei nicht ausreichend bewiesenem Sachverhalt vom für den Angeklagten günstigsten Fall ausgehen muss.",
        funFact = "Obwohl in dubio pro reo im StGB nicht ausdrücklich genannt wird, gilt er als verfassungsrechtlich verankert — abgeleitet aus der Unschuldsvermutung des Art. 6 Abs. 2 EMRK und dem Rechtsstaatsprinzip."
    ),

    Question(
        categoryId = 11,
        questionText = "Wann liegt im deutschen Strafrecht ein Fall von 'Notwehr' vor?",
        answerA = "Wenn eine Handlung erforderlich ist, um einen gegenwärtigen rechtswidrigen Angriff auf sich oder andere abzuwenden",
        answerB = "Wenn jemand aus Angst handelt, auch ohne unmittelbaren Angriff",
        answerC = "Wenn jemand auf staatliche Anordnung hin handelt",
        answerD = "Wenn eine Straftat durch psychische Erkrankung verursacht wird",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "§ 32 StGB definiert Notwehr als die Verteidigung, die erforderlich ist, um einen gegenwärtigen rechtswidrigen Angriff von sich oder einem anderen abzuwenden. Notwehr kennt keine Güterabwägung — der Angreifer muss hinnehmen, dass er zur Abwehr verletzt wird.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist der Unterschied zwischen 'Verbrechen' und 'Vergehen' im deutschen Strafrecht?",
        answerA = "Verbrechen werden mit Mindeststrafe von einem Jahr Freiheitsstrafe bedroht, Vergehen mit geringerer Mindeststrafe",
        answerB = "Verbrechen sind vorsätzlich, Vergehen immer fahrlässig",
        answerC = "Verbrechen werden vor dem BGH verhandelt, Vergehen vor dem Amtsgericht",
        answerD = "Verbrechen sind nur gegen Personen gerichtet, Vergehen gegen Eigentum",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "§ 12 StGB unterscheidet: Verbrechen sind Taten, die mit Freiheitsstrafe von mindestens einem Jahr bedroht sind. Vergehen sind sonstige rechtswidrige Taten. Der Versuch eines Verbrechens ist stets strafbar, bei Vergehen nur wenn gesetzlich vorgesehen.",
        funFact = "Der Versuch eines Verbrechens ist stets strafbar. Der Versuch eines Vergehens nur dann, wenn das Gesetz es ausdrücklich vorsieht (§ 23 Abs. 1 StGB)."
    ),

    Question(
        categoryId = 11,
        questionText = "Was versteht man unter 'Strafverfolgungsverjährung' im deutschen Recht?",
        answerA = "Den Ablauf einer Frist, nach der eine Tat nicht mehr strafrechtlich verfolgt werden kann",
        answerB = "Die Möglichkeit, eine verhängte Strafe nach bestimmter Zeit zu erlassen",
        answerC = "Den Zeitraum, in dem eine Bewährungsstrafe läuft",
        answerD = "Die Verjährung von Schadensersatzansprüchen nach einer Straftat",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Die Verfolgungsverjährung (§§ 78 ff. StGB) bewirkt, dass nach Ablauf bestimmter Fristen eine Strafverfolgung nicht mehr möglich ist. Die Frist richtet sich nach der Strafdrohung: bei lebenslanger Strafe 30 Jahre, bei Mord keine Verjährung.",
        funFact = "Für Mord gilt seit 1979 in Deutschland keine Verjährung. Diese Änderung wurde eingeführt, damit NS-Täter auch Jahrzehnte nach den Verbrechen noch verfolgt werden können."
    ),

    Question(
        categoryId = 11,
        questionText = "Was bedeutet das strafrechtliche Prinzip 'Ne bis in idem'?",
        answerA = "Niemand darf wegen derselben Tat zweimal bestraft oder verfolgt werden",
        answerB = "Der Angeklagte hat das Recht zu schweigen",
        answerC = "Der Staat trägt die Beweislast",
        answerD = "Straftaten verjähren nach einer bestimmten Zeit",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Ne bis in idem (nicht zweimal in derselben Sache) ist in Art. 103 Abs. 3 GG und Art. 50 EU-Grundrechtecharta verankert. Es schützt den Freigesprochenen oder Verurteilten davor, wegen derselben Tat erneut angeklagt zu werden.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist eine 'Strafaussetzung zur Bewährung' in Deutschland?",
        answerA = "Eine Geldstrafe als Ersatz für eine Freiheitsstrafe",
        answerB = "Die endgültige Streichung einer Strafe aus dem Strafregister",
        answerC = "Die Übertragung der Strafvollstreckung an ein anderes Land",
        answerD = "Die bedingte Nichtanordnung einer Haftstrafe unter Auflagen für eine Probezeit",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Bei Freiheitsstrafen bis zu zwei Jahren kann das Gericht die Vollstreckung zur Bewährung aussetzen (§ 56 StGB). Hält der Verurteilte die Bewährungsauflagen während der Probezeit ein, wird die Strafe nach deren Ablauf erlassen.",
        funFact = "Etwa 70 % aller Freiheitsstrafen in Deutschland werden zur Bewährung ausgesetzt. Das Ziel ist die Resozialisierung ohne die negativen Folgen des Strafvollzugs."
    ),

    Question(
        categoryId = 11,
        questionText = "Was versteht man im Strafrecht unter einem 'Unterlassungsdelikt'?",
        answerA = "Eine Straftat gegen staatliche Institutionen",
        answerB = "Eine Straftat, bei der der Täter durch Nichthandeln trotz Pflicht den Tatbestand erfüllt",
        answerC = "Ein Delikt, bei dem der Täter geistig nicht zurechnungsfähig ist",
        answerD = "Eine Straftat, die durch aktives Handeln begangen wird",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Bei Unterlassungsdelikten wird die Straftat durch Nichthandeln begangen. Beim echten Unterlassungsdelikt (z.B. § 323c StGB, unterlassene Hilfeleistung) trifft alle eine Hilfspflicht. Beim unechten braucht man eine besondere Garantenstellung.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Welches war das erste Strafgesetzbuch, das im gesamten Deutschen Reich Gültigkeit hatte?",
        answerA = "Das Preußische Allgemeine Landrecht von 1794",
        answerB = "Das Strafgesetzbuch für den Norddeutschen Bund von 1870/71",
        answerC = "Das Bayerische Strafgesetzbuch von 1813",
        answerD = "Das Reichsstrafgesetzbuch von 1900",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das Strafgesetzbuch des Norddeutschen Bundes von 1870 wurde am 15. Mai 1871 auf das gesamte Deutsche Reich ausgedehnt und gilt als Vorläufer des heutigen StGB. Es trat am 1. Januar 1872 in Kraft.",
        funFact = "Das StGB von 1871 war ein Meilenstein der Rechtsvereinheitlichung: Vorher galten im deutschen Gebiet über 30 verschiedene Strafgesetze verschiedener Territorien nebeneinander."
    ),

    // --- ZIVILRECHT & BGB (10) ---

    Question(
        categoryId = 11,
        questionText = "Wann trat das Bürgerliche Gesetzbuch (BGB) in Deutschland in Kraft?",
        answerA = "23. Mai 1949",
        answerB = "1. Juli 1990",
        answerC = "1. Januar 1871",
        answerD = "1. Januar 1900",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Das BGB wurde 1896 vom Reichstag verabschiedet und trat am 1. Januar 1900 in Kraft. Es ist eine der bedeutendsten Kodifikationen des Zivilrechts weltweit und hat viele andere Rechtssysteme beeinflusst.",
        funFact = "Das BGB enthält über 2.385 Paragraphen und ist damit eines der umfangreichsten Zivilgesetzbücher der Welt. Seine nüchterne, präzise Sprache galt als Vorbild für zahlreiche andere Länder."
    ),

    Question(
        categoryId = 11,
        questionText = "Was versteht man im deutschen Zivilrecht unter 'Geschäftsfähigkeit'?",
        answerA = "Die Fähigkeit, ein Unternehmen zu gründen",
        answerB = "Die Fähigkeit, durch eigene Willenserklärungen Rechtsgeschäfte vorzunehmen",
        answerC = "Die Berechtigung, vor Gericht zu klagen",
        answerD = "Das Recht, ein Testament zu verfassen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Geschäftsfähigkeit (§§ 104 ff. BGB) ist die Fähigkeit, Rechtsgeschäfte selbstständig wirksam vorzunehmen. Kinder unter 7 Jahren sind geschäftsunfähig, 7- bis 17-Jährige beschränkt geschäftsfähig, Volljährige voll geschäftsfähig.",
        funFact = "Der Taschengeldparagraph (§ 110 BGB) erlaubt Minderjährigen, Verträge selbstständig abzuschließen, wenn sie die Leistung mit ihrem Taschengeld erbringen."
    ),

    Question(
        categoryId = 11,
        questionText = "Was bedeutet 'Culpa in contrahendo' (c.i.c.) im deutschen Vertragsrecht?",
        answerA = "Die verschuldensunabhängige Produkthaftung",
        answerB = "Die Haftung des Vermieters für Mängel der Mietsache",
        answerC = "Die Haftung für schuldhafte Pflichtverletzungen bei der Vertragsanbahnung",
        answerD = "Die Unmöglichkeit einer vertraglich vereinbarten Leistung",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Culpa in contrahendo (Verschulden beim Vertragsschluss) ist heute in § 311 Abs. 2 BGB geregelt. Es begründet Schadensersatzpflichten, wenn jemand im Vorfeld eines Vertrages Schutzpflichten verletzt — z.B. durch falsche Informationen bei Vertragsverhandlungen.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist eine 'Anfechtung' eines Rechtsgeschäfts im deutschen BGB?",
        answerA = "Die rückwirkende Aufhebung eines fehlerhaften Rechtsgeschäfts",
        answerB = "Die Kündigung eines laufenden Vertrags",
        answerC = "Die Geltendmachung von Schadensersatz wegen Vertragsverletzung",
        answerD = "Die Verlängerung einer gesetzlichen Verjährungsfrist",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Die Anfechtung (§§ 119 ff. BGB) ermöglicht es, ein Rechtsgeschäft wegen Irrtum, arglistiger Täuschung oder widerrechtlicher Drohung rückwirkend (ex tunc) zu beseitigen. Das Geschäft gilt dann als von Anfang an nichtig.",
        funFact = "Die Anfechtungsgründe im BGB sind eng begrenzt: Ein Motivirrtum berechtigt nicht zur Anfechtung. Nur Erklärungs- und Eigenschaftsirrtümer sind anfechtungsrelevant."
    ),

    Question(
        categoryId = 11,
        questionText = "Was versteht man im deutschen Erbrecht unter einem 'Pflichtteil'?",
        answerA = "Den gesetzlichen Mindestanteil am Nachlass, der enterbten nahen Angehörigen zusteht",
        answerB = "Den Teil des Erbes, der an den Staat fällt, wenn kein Testament vorliegt",
        answerC = "Die Pflicht des Erben, alle Schulden des Verstorbenen zu übernehmen",
        answerD = "Das Recht des Testamentsvollstreckers auf Vergütung",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Der Pflichtteil (§§ 2303 ff. BGB) beträgt die Hälfte des gesetzlichen Erbteils und steht Abkömmlingen, Eltern und Ehepartnern zu, wenn sie durch Testament enterbt wurden. Er ist ein reiner Geldanspruch gegen den Erben.",
        funFact = "Der Pflichtteil kann nur in Ausnahmefällen entzogen werden — etwa wenn der Pflichtteilsberechtigte dem Erblasser nach dem Leben getrachtet hat (§ 2333 BGB)."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist das 'Abstraktionsprinzip' im deutschen BGB?",
        answerA = "Verpflichtungsgeschäft und Verfügungsgeschäft sind voneinander unabhängig",
        answerB = "Schulden verjähren nach drei Jahren",
        answerC = "Verträge müssen stets schriftlich geschlossen werden",
        answerD = "Nur natürliche Personen können Eigentumsrechte erwerben",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Das Abstraktionsprinzip trennt das schuldrechtliche Verpflichtungsgeschäft (z.B. Kaufvertrag) vom dinglichen Verfügungsgeschäft (Eigentumsübertragung). Beide sind rechtlich unabhängig: Auch ein nichtiger Kaufvertrag lässt das übertragene Eigentum zunächst beim Käufer.",
        funFact = "Das Abstraktionsprinzip ist eine deutsche Besonderheit im Zivilrecht. Die meisten anderen Länder kennen das Kausalprinzip, bei dem das Verfügungsgeschäft von der Wirksamkeit des Verpflichtungsgeschäfts abhängt."
    ),

    Question(
        categoryId = 11,
        questionText = "Was versteht man unter 'Gesamtschuldnerschaft' im deutschen BGB?",
        answerA = "Eine Erbschaft, die auf mehrere Personen übergeht",
        answerB = "Mehrere Schuldner haften für dieselbe Forderung, sodass der Gläubiger jeden auf die volle Leistung in Anspruch nehmen kann",
        answerC = "Eine gemeinsame Firma mehrerer Personen ohne Haftungsbeschränkung",
        answerD = "Die Schulden einer aufgelösten Gesellschaft",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Bei der Gesamtschuld (§ 421 BGB) sind mehrere Schuldner so verpflichtet, dass jeder die ganze Leistung zu bewirken hat, der Gläubiger sie aber nur einmal fordern kann. Im Innenverhältnis gibt es einen Ausgleichsanspruch unter den Gesamtschuldnern.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was regelt das 'Widerrufsrecht' im deutschen Verbraucherrecht?",
        answerA = "Den Anspruch auf Rückerstattung der Mehrwertsteuer",
        answerB = "Das Recht des Händlers, einen Vertrag wegen Irrtums aufzuheben",
        answerC = "Die Möglichkeit des Verbrauchers, mangelhafte Ware zurückzugeben",
        answerD = "Das Recht des Verbrauchers, einen Fernabsatzvertrag innerhalb von 14 Tagen ohne Angabe von Gründen zu widerrufen",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Das Widerrufsrecht (§ 355 BGB) ermöglicht Verbrauchern bei Fernabsatz- und Haustürgeschäften, den Vertrag innerhalb von 14 Tagen ohne Angabe von Gründen zu widerrufen. Die Frist beginnt mit Erhalt der Ware und ordnungsgemäßer Widerrufsbelehrung.",
        funFact = "Wenn ein Online-Händler keine Widerrufsbelehrung erteilt, verlängert sich die Widerrufsfrist auf bis zu zwölf Monate und vierzehn Tage — eine empfindliche Sanktion für fehlende Informationspflichten."
    ),

    Question(
        categoryId = 11,
        questionText = "Was bezeichnet im deutschen Schuldrecht der Begriff 'Unmöglichkeit' (§ 275 BGB)?",
        answerA = "Die subjektive Weigerung des Schuldners, zu leisten",
        answerB = "Den Fall, dass die geschuldete Leistung objektiv oder subjektiv nicht erbracht werden kann",
        answerC = "Die Insolvenz des Schuldners",
        answerD = "Die fehlende Genehmigung für einen Vertrag",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "§ 275 BGB regelt, dass der Schuldner von seiner Leistungspflicht befreit wird, wenn die Leistung unmöglich ist. Bei objektiver Unmöglichkeit kann niemand leisten; bei subjektiver Unmöglichkeit kann nur dieser Schuldner nicht leisten.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist der Unterschied zwischen 'Kündigung' und 'Anfechtung' bei einem Mietvertrag?",
        answerA = "Die Kündigung ist stets fristlos, die Anfechtung erfordert Fristen",
        answerB = "Es gibt keinen Unterschied, beide Begriffe sind synonym",
        answerC = "Die Anfechtung ist nur durch den Vermieter möglich, die Kündigung nur durch den Mieter",
        answerD = "Die Kündigung beendet den Vertrag für die Zukunft, die Anfechtung macht ihn von Anfang an unwirksam",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Die Kündigung (ex nunc) beendet das Dauerschuldverhältnis für die Zukunft. Die Anfechtung (ex tunc) vernichtet den Vertrag rückwirkend von Anfang an. Bei Mietverträgen führt die Anfechtung zur Rückabwicklung, was bei Dauerschuldverhältnissen praktisch problematisch ist.",
        funFact = "Wegen der Rückabwicklungsprobleme bei Dauerschuldverhältnissen wird die Anfechtung hier oft durch eine fristlose Kündigung aus wichtigem Grund ersetzt."
    ),

    // --- BERUEHMTE PROZESSE & RECHTSGESCHICHTE (10) ---

    Question(
        categoryId = 11,
        questionText = "In welcher Stadt fanden die Hauptkriegsverbrecherprozesse nach dem Zweiten Weltkrieg statt?",
        answerA = "Berlin",
        answerB = "Frankfurt am Main",
        answerC = "Nürnberg",
        answerD = "München",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Die Nürnberger Prozesse (1945–1946) fanden vor dem Internationalen Militärgerichtshof statt, der von den vier Siegermächten USA, Großbritannien, Frankreich und der Sowjetunion gebildet wurde. 24 Hauptkriegsverbrecher wurden angeklagt, 12 zum Tode verurteilt.",
        funFact = "Nürnberg wurde nicht nur wegen seiner Symbolik (Reichsparteitage), sondern auch wegen des weitgehend intakten Justizpalastes als Prozessort gewählt — ein praktischer Grund für eine historisch wegweisende Entscheidung."
    ),

    Question(
        categoryId = 11,
        questionText = "Wie heißt der Frankfurter Staatsanwalt, der maßgeblich die Auschwitz-Prozesse der 1960er Jahre initiierte?",
        answerA = "Hans Filbinger",
        answerB = "Gustav Heinemann",
        answerC = "Karl Carstens",
        answerD = "Fritz Bauer",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Fritz Bauer (1903–1968), hessischer Generalstaatsanwalt, trieb trotz massiver Widerstände die strafrechtliche Aufarbeitung der NS-Verbrechen voran. Er initiierte den Frankfurter Auschwitz-Prozess (1963–1965) und gab Israel den Hinweis auf den Aufenthaltsort Adolf Eichmanns.",
        funFact = "Fritz Bauer soll gesagt haben: Wenn ich mein Büro verlasse, betrete ich feindliches Ausland. Diese Aussage beschreibt die Feindseligkeit, die er in der deutschen Nachkriegsgesellschaft für seine Arbeit erntete."
    ),

    Question(
        categoryId = 11,
        questionText = "Was war das historisch bedeutsame Ergebnis der Nürnberger Prozesse für das Völkerrecht?",
        answerA = "Die Gründung des Internationalen Strafgerichtshofs in Den Haag",
        answerB = "Die Etablierung individueller strafrechtlicher Verantwortlichkeit für Verbrechen gegen den Frieden und die Menschlichkeit",
        answerC = "Die Einführung der Todesstrafe in allen westlichen Demokratien",
        answerD = "Die Auflösung der Vereinten Nationen zugunsten eines Weltgerichts",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Die Nürnberger Prozesse begründeten das Prinzip der individuellen völkerrechtlichen Strafverantwortlichkeit: Staatsoberhäupter und Befehlsträger konnten sich nicht mehr hinter dem Befehlsgehorsam verstecken. Dies war der Grundstein des modernen Völkerstrafrechts.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was war das 'Contergan-Verfahren' und warum endete es ohne Verurteilung?",
        answerA = "Ein Patentrechtsstreit zwischen deutschen und US-amerikanischen Pharmafirmen",
        answerB = "Ein Umweltstrafverfahren, das wegen Beweismangels eingestellt wurde",
        answerC = "Ein Strafverfahren gegen Grünenthal-Manager wegen Körperverletzung durch das Schlafmittel Thalidomid, eingestellt gegen Zahlung von Bußgeldern",
        answerD = "Ein Kartellverfahren gegen die Pharmaindustrie, das durch Vergleich beendet wurde",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Das Contergan-Strafverfahren (1968–1970) gegen Manager der Firma Grünenthal wegen fahrlässiger Körperverletzung durch Thalidomid, das bei Tausenden Neugeborenen Fehlbildungen verursacht hatte, wurde nach § 153a StPO gegen Zahlung von 100 Mio. DM an einen Hilfsfonds eingestellt.",
        funFact = "Contergan kam 1957 auf den deutschen Markt. In den USA wurde es nie zugelassen, weil die FDA-Beamtin Frances Kelsey auf Langzeitstudien bestand — was ihr die höchste zivile Auszeichnung der USA einbrachte."
    ),

    Question(
        categoryId = 11,
        questionText = "Welche bahnbrechende Entscheidung traf das Bundesverfassungsgericht 1975 zum Schwangerschaftsabbruch?",
        answerA = "Es übertrug die Regelung des Schwangerschaftsabbruchs an die Bundesländer",
        answerB = "Es verpflichtete den Bundestag, innerhalb von drei Jahren ein neues Gesetz zu verabschieden",
        answerC = "Es erklärte den Schwangerschaftsabbruch generell als legal",
        answerD = "Es erklärte die Fristenlösung für verfassungswidrig, da das ungeborene Leben staatlichen Schutz erfordert",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Mit dem ersten Abtreibungsurteil 1975 (BVerfGE 39, 1) erklärte das BVerfG die Fristenlösung für verfassungswidrig. Es begründete aus Art. 2 Abs. 2 GG eine staatliche Schutzpflicht für das ungeborene Leben. 1993 folgte ein zweites Urteil, das die heute geltende Beratungslösung ermöglichte.",
        funFact = "Das erste Abtreibungsurteil von 1975 ist eines der meistzitierten und umstrittensten Urteile des Bundesverfassungsgerichts."
    ),

    Question(
        categoryId = 11,
        questionText = "Was war die 'Spiegel-Affäre' von 1962 und welche Bedeutung hatte sie für die Pressefreiheit?",
        answerA = "Ein Verleumdungsverfahren gegen den Spiegel, das zur Stärkung des Zeugnisverweigerungsrechts führte",
        answerB = "Die strafrechtliche Verfolgung des Spiegel wegen Landesverrats, die als Angriff auf die Pressefreiheit gewertet wurde",
        answerC = "Ein Kartellverfahren gegen Springer, das den Medienmarkt grundlegend veränderte",
        answerD = "Ein Urheberrechtsstreit, der das deutsche Presserecht modernisierte",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Im Oktober 1962 ließ Verteidigungsminister Franz Josef Strauß die Spiegel-Redaktion wegen eines Artikels über die NATO-Übung Fallex 62 wegen Landesverrats durchsuchen. Die Affäre führte zum Rücktritt Strauß und gilt als Geburtsstunde des kritischen Investigativjournalismus in Deutschland.",
        funFact = "Der Spiegel-Herausgeber Rudolf Augstein war 103 Tage in Untersuchungshaft — das Verfahren wurde schließlich eingestellt. Die Affäre gilt als erste große Verfassungskrise der Bundesrepublik."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist der 'Europäische Gerichtshof für Menschenrechte' (EGMR) und wo hat er seinen Sitz?",
        answerA = "Ein UN-Gericht mit Sitz in Genf, das Menschenrechtsverletzungen weltweit ahndet",
        answerB = "Ein gemeinsames Gericht der NATO-Staaten mit Sitz in Brüssel",
        answerC = "Ein Gericht des Europarats mit Sitz in Straßburg, das die EMRK anwendet",
        answerD = "Ein EU-Gericht mit Sitz in Luxemburg, das EU-Recht anwendet",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Der EGMR in Straßburg ist das Gericht des Europarats (nicht der EU) und wacht über die Einhaltung der Europäischen Menschenrechtskonvention (EMRK) durch die 46 Mitgliedstaaten. Jeder Mensch kann nach Erschöpfung des nationalen Rechtswegs Beschwerde einlegen.",
        funFact = "Deutschland wurde vom EGMR bereits hundertfach verurteilt — am häufigsten wegen der überlangen Dauer von Strafverfahren und zivilrechtlichen Prozessen."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist der 'Europäische Haftbefehl' im EU-Recht?",
        answerA = "Eine EU-weite Norm zur Vereinheitlichung der Mindeststrafen",
        answerB = "Ein EU-Rechtsinstrument zur vereinfachten Auslieferung zwischen Mitgliedstaaten auf Basis gegenseitiger Anerkennung",
        answerC = "Eine Vollstreckungsmaßnahme der Europäischen Zentralbank gegen Steuerschuldner",
        answerD = "Eine Kooperationsvereinbarung von Interpol und Europol",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Der Europäische Haftbefehl (seit 2004) ersetzt traditionelle Auslieferungsverfahren zwischen EU-Mitgliedstaaten durch ein vereinfachtes System der gegenseitigen Anerkennung. Die Übergabe muss innerhalb von 60 Tagen erfolgen, ohne dass der ersuchte Staat die Strafbarkeit inhaltlich prüft.",
        funFact = "Deutschland hatte den Europäischen Haftbefehl nach einem BVerfG-Urteil 2005 zunächst ausgesetzt, weil das ursprüngliche Umsetzungsgesetz gegen Art. 16 GG (Auslieferungsverbot für Deutsche) verstieß."
    ),

    Question(
        categoryId = 11,
        questionText = "Was regelt das 'Haager Übereinkommen über die zivilrechtlichen Aspekte internationaler Kindesentführung' von 1980?",
        answerA = "Die schnelle Rückführung von Kindern in ihr gewöhnliches Aufenthaltsland nach rechtswidriger Verbringung ins Ausland",
        answerB = "Die internationale Zuständigkeit bei Sorgerechtsstreitigkeiten",
        answerC = "Den Schutz von Kindern in internationalen Kriegsgebieten",
        answerD = "Den internationalen Adoptionsverkehr zwischen Vertragsstaaten",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Das Haager Kindesentführungsübereinkommen (HKÜ) verpflichtet die Vertragsstaaten, widerrechtlich verbrachte oder zurückgehaltene Kinder rasch in ihr gewöhnliches Aufenthaltsland zurückzuführen, um den Status quo ante wiederherzustellen.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was war die Bedeutung des 'Linoleumrollen-Urteils' des Reichsgerichts von 1902 für das Zivilrecht?",
        answerA = "Es begründete das Grundprinzip der Vertragsfreiheit",
        answerB = "Es erweiterte die Haftung für unerlaubte Handlungen gegenüber Dritten ohne Vertragsbeziehung",
        answerC = "Es schuf erstmals den gesetzlichen Kündigungsschutz",
        answerD = "Es begründete den Anspruch auf Schadensersatz bei höherer Gewalt",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Das Linoleumrollen-Urteil des Reichsgerichts von 1902 gilt als Meilenstein: Ein Käufer, der durch eine herunterfallende Linoleumrolle verletzt wurde, klagte erfolgreich trotz fehlender Vertragsbeziehung zum Schädiger — Grundlage der Haftung aus unerlaubter Handlung gegenüber Dritten.",
        funFact = null
    ),

    // --- VOELKERRECHT & INTERNATIONALES RECHT (10) ---

    Question(
        categoryId = 11,
        questionText = "Was versteht man unter 'Völkergewohnheitsrecht'?",
        answerA = "Gesetze, die von internationalen Organisationen erlassen werden",
        answerB = "Verträge zwischen mehr als drei Staaten",
        answerC = "Diplomatische Protokolle, die von der UN genehmigt wurden",
        answerD = "Allgemeine Praxis der Staaten, die von diesen als rechtlich verbindlich anerkannt wird",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Völkergewohnheitsrecht entsteht durch eine allgemeine, einheitliche und beständige Übung der Staaten (usus) in Verbindung mit der Überzeugung, rechtlich dazu verpflichtet zu sein (opinio iuris). Es gilt für alle Staaten, auch solche ohne entsprechenden Vertrag.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was sind die vier Genfer Konventionen von 1949?",
        answerA = "Abkommen über den Schutz von Flüchtlingen, Staatenlosen, Asylsuchenden und Migranten",
        answerB = "Verträge über Abrüstung, Nichtverbreitung von Atomwaffen, chemischen und biologischen Waffen",
        answerC = "Abkommen zum Schutz von Verwundeten, Schiffbrüchigen, Kriegsgefangenen und Zivilpersonen im bewaffneten Konflikt",
        answerD = "Verträge über die Neutralität bestimmter Staaten und die Unverletzlichkeit diplomatischer Missionen",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Die vier Genfer Konventionen von 1949 bilden den Kern des humanitären Völkerrechts: I. Schutz der Verwundeten (Landheer), II. Schutz der Schiffbrüchigen, III. Behandlung der Kriegsgefangenen, IV. Schutz der Zivilbevölkerung.",
        funFact = "Die Genfer Konventionen wurden von 196 Staaten ratifiziert — damit haben sie nahezu universelle Geltung und sind eines der breitest akzeptierten Abkommen der Völkerrechtsgeschichte."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist der 'Internationale Strafgerichtshof' (IStGH) und wo hat er seinen Sitz?",
        answerA = "Ein EU-Gericht mit Sitz in Luxemburg für grenzüberschreitende Straftaten",
        answerB = "Ein Schiedsgericht des Europarats in Straßburg für Streitigkeiten zwischen Staaten",
        answerC = "Ein UN-Organ mit Sitz in New York zur Ahndung von Terrorismus",
        answerD = "Ein permanentes internationales Gericht mit Sitz in Den Haag, das Völkermord und Verbrechen gegen die Menschlichkeit ahndet",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Der IStGH (International Criminal Court, ICC) mit Sitz in Den Haag wurde durch das Römische Statut von 1998 gegründet und nahm 2002 seine Arbeit auf. Er ist zuständig für Völkermord, Verbrechen gegen die Menschlichkeit, Kriegsverbrechen und das Verbrechen der Aggression.",
        funFact = "Die USA haben das Römische Statut zwar unterzeichnet, die Ratifikation aber zurückgezogen. Auch Russland und China sind dem IStGH nicht beigetreten — was seine universelle Wirkung einschränkt."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist das Prinzip der 'Universellen Gerichtsbarkeit' im Völkerstrafrecht?",
        answerA = "Die Pflicht jedes Staates, eigene Staatsbürger an ausländische Gerichte auszuliefern",
        answerB = "Das exklusive Recht des IStGH, Völkerrechtsverbrechen zu verfolgen",
        answerC = "Die Möglichkeit eines Staates, bestimmte schwere Verbrechen unabhängig vom Tatort und der Nationalität des Täters zu verfolgen",
        answerD = "Das Recht der UN, in jedem Staat Strafprozesse zu führen",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Die universelle Gerichtsbarkeit erlaubt Staaten, bei schwersten Verbrechen (Völkermord, Verbrechen gegen die Menschlichkeit, Kriegsverbrechen, Folter) unabhängig von Tatort und Nationalität Strafverfolgung zu betreiben — dem Prinzip aut dedere aut iudicare folgend.",
        funFact = null
    ),

    Question(
        categoryId = 11,
        questionText = "Was bedeutet 'pacta sunt servanda' im Völkerrecht?",
        answerA = "Neue Verträge heben ältere Verträge auf",
        answerB = "Verträge zwischen Staaten sind nur bei UN-Registrierung gültig",
        answerC = "Vertragsparteien müssen Verträge in gutem Glauben erfüllen",
        answerD = "Verträge müssen öffentlich bekannt gemacht werden",
        correctAnswer = 2,
        difficulty = 3,
        explanation = "Pacta sunt servanda (Verträge sind einzuhalten) ist ein fundamentales Prinzip des Völkerrechts, kodifiziert in Art. 26 der Wiener Vertragsrechtskonvention. Es verpflichtet die Vertragsparteien, ihre Verträge in gutem Glauben zu erfüllen.",
        funFact = "Der Grundsatz ist so alt wie die Diplomatie selbst — er findet sich in Vertragswerken aus dem alten Ägypten, Mesopotamien und Griechenland. Seine völkerrechtliche Kodifikation erfolgte erst 1969 in Wien."
    ),

    Question(
        categoryId = 11,
        questionText = "Was versteht man unter 'diplomatischer Immunität'?",
        answerA = "Das Recht von Diplomaten, visumsfrei in alle Länder einzureisen",
        answerB = "Den Schutz von Diplomaten vor der Strafverfolgung durch den Empfangsstaat",
        answerC = "Die Unverletzlichkeit von Botschaftsgebäuden",
        answerD = "Das Recht von Staatsführern, im Ausland keine Steuern zu zahlen",
        correctAnswer = 1,
        difficulty = 3,
        explanation = "Diplomatische Immunität (geregelt im Wiener Übereinkommen von 1961) schützt Diplomaten vor Strafverfolgung und Zivilklagen im Empfangsstaat. Der Entsendestaat kann auf die Immunität verzichten.",
        funFact = "Diplomatische Immunität gilt nicht schrankenlos: Der Entsendestaat kann sie aufheben, und der Diplomat kann zur persona non grata erklärt und ausgewiesen werden."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist das 'Interventionsverbot' im Völkerrecht?",
        answerA = "Das Verbot, in innere Angelegenheiten anderer Staaten einzugreifen",
        answerB = "Das Verbot militärischer Überflüge über fremde Staatsgebiete",
        answerC = "Das Verbot, internationale Handelsabkommen einseitig zu kündigen",
        answerD = "Das Verbot der Nutzung von Atomwaffen in bewaffneten Konflikten",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Das Interventionsverbot ist ein Kernprinzip des Völkerrechts (Art. 2 Abs. 7 UN-Charta): Kein Staat darf sich in Angelegenheiten einmischen, die im wesentlichen zur inneren Zuständigkeit eines anderen Staates gehören.",
        funFact = "Das Interventionsverbot steht in Spannung zur Schutzverantwortung (Responsibility to Protect, R2P), die der UN-Sicherheitsrat bei schwersten Menschenrechtsverletzungen eine Intervention rechtfertigen lässt."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist die Besonderheit des 'Rechts der Staatennachfolge' im Völkerrecht?",
        answerA = "Es bestimmt, welche Verträge und Verbindlichkeiten beim Wechsel staatlicher Souveränität über ein Territorium übergehen",
        answerB = "Es regelt die Erbfolge bei Monarchien",
        answerC = "Es legt fest, wie neue Staaten in die UN aufgenommen werden",
        answerD = "Es regelt den Übergang diplomatischer Beziehungen bei Regierungswechseln",
        correctAnswer = 0,
        difficulty = 3,
        explanation = "Das Recht der Staatennachfolge befasst sich mit der Frage, welche Rechte und Pflichten ein Staat übernimmt, wenn er die Hoheit über ein Territorium erwirbt — etwa bei Sezession, Vereinigung oder Dekolonisierung. Geregelt in zwei Wiener Konventionen von 1978 und 1983.",
        funFact = "Nach der deutschen Wiedervereinigung 1990 trat die BRD als Continuator-Staat in die völkerrechtlichen Verpflichtungen der DDR ein, nicht als Nachfolgestaat."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist der Unterschied zwischen 'Auslieferung' und 'Abschiebung' im deutschen Recht?",
        answerA = "Auslieferung gilt nur für EU-Bürger, Abschiebung für Nicht-EU-Bürger",
        answerB = "Auslieferung erfordert ein Gerichtsurteil, Abschiebung ist eine Verwaltungsentscheidung ohne Rechtsmittel",
        answerC = "Auslieferung und Abschiebung sind rechtlich identisch",
        answerD = "Auslieferung erfolgt zur Strafverfolgung auf Ersuchen eines anderen Staates, Abschiebung ist eine aufenthaltsrechtliche Zwangsmaßnahme",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Auslieferung (§§ 2 ff. IRG) ist die Übergabe einer Person an einen anderen Staat zur Strafverfolgung oder -vollstreckung. Abschiebung (§ 58 AufenthG) ist eine aufenthaltsrechtliche Maßnahme gegen Ausländer ohne Aufenthaltstitel. Beide haben unterschiedliche Rechtsgrundlagen und Verfahren.",
        funFact = "Deutschland liefert eigene Staatsangehörige grundsätzlich nicht aus (Art. 16 Abs. 2 GG). Eine Ausnahme gilt für den Europäischen Haftbefehl, bei dem Auslieferung unter bestimmten Bedingungen möglich ist."
    ),

    Question(
        categoryId = 11,
        questionText = "Was ist das 'Territorialprinzip' im internationalen Strafrecht?",
        answerA = "Das Verbot, Staatsgrenzen mit Militär zu überschreiten",
        answerB = "Die exklusive Hoheit eines Staates über seine Bodenschätze",
        answerC = "Das Prinzip, dass Straftaten nur im Heimatstaat des Täters verfolgt werden",
        answerD = "Die Zuständigkeit eines Staates für alle Straftaten, die auf seinem Territorium begangen wurden",
        correctAnswer = 3,
        difficulty = 3,
        explanation = "Das Territorialprinzip (§ 3 StGB) begründet die Strafgewalt Deutschlands für alle Taten, die im Inland begangen wurden — unabhängig von der Nationalität des Täters. Es ist das grundlegende Anknüpfungsprinzip des deutschen internationalen Strafrechts.",
        funFact = null
    )

)
