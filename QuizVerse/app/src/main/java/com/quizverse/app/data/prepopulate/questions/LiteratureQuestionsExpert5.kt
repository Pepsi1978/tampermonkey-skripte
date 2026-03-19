package com.quizverse.app.data.prepopulate.questions

import com.quizverse.app.data.database.entities.Question

fun literatureQuestionsExpert5(): List<Question> = listOf(

    // Question 1 - Japanische Literatur: Genji Monogatari
    Question(
        categoryId = 10,
        questionText = "Welches japanische Werk aus dem frühen 11. Jahrhundert gilt als einer der ersten Romane der Weltliteratur?",
        answerA = "Das Kopfkissenbuch",
        answerB = "Heike Monogatari",
        answerC = "Genji Monogatari",
        answerD = "Ise Monogatari",
        correctAnswer = 2,
        explanation = "Das 'Genji Monogatari' (Die Geschichte vom Prinzen Genji), verfasst von der Hofdame Murasaki Shikibu zwischen 1004 und 1011, gilt als bedeutendster Beitrag Japans zur Weltliteratur und wird häufig als der erste psychologische Roman der Weltgeschichte bezeichnet.",
        difficulty = 4,
        funFact = "Die erste vollständige englische Übersetzung fertigte Arthur Waley 1925 an; die erste direkte deutsche Übersetzung erschien erst 1966 durch Oscar Benl."
    ),

    // Question 2 - Japanische Literatur: Murasaki Shikibu
    Question(
        categoryId = 10,
        questionText = "In welcher Epoche der japanischen Geschichte entstand das Genji Monogatari?",
        answerA = "Edo-Zeit",
        answerB = "Heian-Zeit",
        answerC = "Nara-Zeit",
        answerD = "Kamakura-Zeit",
        correctAnswer = 1,
        explanation = "Das Genji Monogatari entstand in der Heian-Zeit (794–1185), einer Epoche, in der die japanische Hofkultur ihren Höhepunkt erreichte. Murasaki Shikibu war Hofdame der Kaiserin Akiko und schrieb den Roman als Reflexion des höfischen Lebens.",
        difficulty = 4,
        funFact = "In der Heian-Zeit war die literarische Sprache der Frauen Japanisch (Kana-Schrift), während Männer üblicherweise auf Chinesisch schrieben — so konnten Frauen paradoxerweise die wichtigsten Werke der japanischen Literatur schaffen."
    ),

    // Question 3 - Chinesische Literatur: Traum der roten Kammer
    Question(
        categoryId = 10,
        questionText = "Wie lautet der chinesische Originaltitel des 'Traums der Roten Kammer' von Cao Xueqin?",
        answerA = "Jin Ping Mei",
        answerB = "Xiyouji",
        answerC = "Shuihu Zhuan",
        answerD = "Honglou Meng",
        correctAnswer = 3,
        explanation = "'Honglou Meng' bedeutet wörtlich 'Traum vom roten Pavillon' und ist einer der vier klassischen Romane der chinesischen Literatur. Cao Xueqin schrieb über zehn Jahre daran; bei seinem Tod 1763 waren nur 80 der 100 Kapitel vollendet.",
        difficulty = 4,
        funFact = "Gao E ergänzte den Roman 1791 zu einer 120-Kapitel-Version. Die akademische Disziplin, die sich ausschließlich mit diesem Roman beschäftigt, heißt 'Hongxue' (Rote-Kammer-Wissenschaft)."
    ),

    // Question 4 - Chinesische Literatur: Vier Klassiker
    Question(
        categoryId = 10,
        questionText = "Welche vier Werke gelten als die 'Vier Großen Klassiker' (四大名著) der chinesischen Literatur?",
        answerA = "Traum der roten Kammer, Die Räuber vom Liang-Schan-Moor, Reise nach Westen, Geschichte der drei Reiche",
        answerB = "Traum der roten Kammer, Jin Ping Mei, Reise nach Westen, Geschichte der Han-Dynastie",
        answerC = "Konfuzius-Analekten, Tao Te Ching, Zhuangzi, I Ging",
        answerD = "Traum der roten Kammer, Die Räuber vom Liang-Schan-Moor, Geschichte der drei Reiche, Jin Ping Mei",
        correctAnswer = 0,
        explanation = "Die vier Großen Klassiker sind: 'Honglou Meng' (Traum der roten Kammer), 'Shuihu Zhuan' (Die Räuber vom Liang-Schan-Moor), 'Xiyouji' (Reise nach Westen) und 'Sanguo Yanyi' (Geschichte der drei Reiche). Sie entstanden zwischen dem 14. und 18. Jahrhundert.",
        difficulty = 4,
        funFact = "Die 'Reise nach Westen' (Xiyouji) ist die Grundlage für den Affen Sun Wukong, der in Dutzenden von Animes, Filmen und Videospielen weltweit wiedergeboren wurde — darunter 'Dragon Ball'."
    ),

    // Question 5 - Afrikanische Literatur: Ngugi wa Thiongo
    Question(
        categoryId = 10,
        questionText = "Welcher kenianische Schriftsteller beschloss 1977, nicht mehr auf Englisch zu schreiben, und verfasste fortan nur noch auf Gikuyu?",
        answerA = "Chinua Achebe",
        answerB = "Ngugi wa Thiongo",
        answerC = "Ben Okri",
        answerD = "Wole Soyinka",
        correctAnswer = 1,
        explanation = "Ngugi wa Thiongo (geboren 1938 als James Ngugi) entschied sich nach seiner Verhaftung durch die kenianische Regierung 1977, englische Sprache als Kolonialinstrument abzulehnen. Sein Essay-Band 'Decolonising the Mind' (1986) wurde zum Manifest dieser Haltung.",
        difficulty = 4,
        funFact = "Ngugis erstes Gikuyu-Werk 'Ngaahika Ndeenda' (Ich will heiraten, wenn ich will) schrieb er gemeinsam mit einem ungebildeten Bauern im Gefängnis auf Toilettenpapier."
    ),

    // Question 6 - Afrikanische Literatur: Wole Soyinka
    Question(
        categoryId = 10,
        questionText = "Wole Soyinka war 1986 der erste Afrikaner, der den Nobelpreis für Literatur erhielt. Aus welchem Land stammt er?",
        answerA = "Nigeria",
        answerB = "Ghana",
        answerC = "Kenia",
        answerD = "Südafrika",
        correctAnswer = 0,
        explanation = "Wole Soyinka ist Nigerianer und wurde 1986 mit dem Nobelpreis für Literatur ausgezeichnet. Er ist bekannt für Dramen wie 'Der Tod und der König's Reiter' und die Memoiren 'Aké: Die Jahre der Kindheit'. Er verbrachte wegen politischen Widerstands Jahre im Gefängnis.",
        difficulty = 4,
        funFact = "Soyinka verbrachte 1967–69 während des Biafra-Krieges 22 Monate in Einzelhaft, ohne Bücher oder Papier — trotzdem schrieb er heimlich Gedichte auf Toilettenpapier und Zigarettenschachteln."
    ),

    // Question 7 - Lateinamerikanischer Boom: García Márquez
    Question(
        categoryId = 10,
        questionText = "In welchem Jahr erschien García Márquez' 'Hundert Jahre Einsamkeit', und wie viele Bücher soll es am ersten Tag verkauft haben?",
        answerA = "1967, 8.000 Exemplare in der ersten Woche",
        answerB = "1965, 500 Exemplare am ersten Tag",
        answerC = "1970, 50.000 Exemplare in den ersten drei Monaten",
        answerD = "1963, 1.000 Exemplare am ersten Tag",
        correctAnswer = 0,
        explanation = "'Cien años de soledad' erschien 1967 in Buenos Aires. Die erste Auflage von 8.000 Exemplaren war in Lateinamerika innerhalb einer Woche ausverkauft. García Márquez erhielt 1982 den Nobelpreis für Literatur für dieses und andere Werke.",
        difficulty = 4,
        funFact = "García Márquez schrieb den Roman in 18 Monaten in Mexiko-Stadt, versetzte dabei seine Schreibmaschine und ließ sich von seiner Frau Mercedes finanziell über Wasser halten — sie hielt die Gläubiger hin, ohne ihm zu sagen wie schlimm es war."
    ),

    // Question 8 - Lateinamerikanischer Boom: Borges
    Question(
        categoryId = 10,
        questionText = "Welchen internationalen Literaturpreis teilte Jorge Luis Borges 1961 mit Samuel Beckett?",
        answerA = "Prix Médicis",
        answerB = "Prix Femina",
        answerC = "Cervantes-Preis",
        answerD = "Formentor-Preis",
        correctAnswer = 3,
        explanation = "Borges und Beckett teilten 1961 den Formentor-Preis (auch 'International Publishers' Prize'), damals die bedeutendste internationale Literaturauszeichnung. Dieser Preis brachte Borges internationale Bekanntheit, bevor er den Nobelpreis hätte erhalten können — den er nie bekam.",
        difficulty = 4,
        funFact = "Borges wurde nie mit dem Nobelpreis ausgezeichnet, obwohl er jahrzehntelang als heißer Kandidat galt. Gerüchten zufolge blockierte ein schwedisches Komiteemitglied seine Nominierung wegen politischer Differenzen."
    ),

    // Question 9 - Lateinamerikanischer Boom: Cortázar
    Question(
        categoryId = 10,
        questionText = "Was ist das strukturelle Besondere an Julio Cortázars Roman 'Rayuela' (Himmel und Hölle, 1963)?",
        answerA = "Der Leser kann zwischen zwei Lesereihenfolgen wählen — linear oder nach einem Sprungschema",
        answerB = "Er ist vollständig in Geheimschrift verfasst",
        answerC = "Jedes Kapitel ist aus einer anderen Sprache übersetzt",
        answerD = "Die Kapitel sind alphabetisch nach dem ersten Wort geordnet",
        correctAnswer = 0,
        explanation = "'Rayuela' bietet zwei Lektüremodi: linear (Kapitel 1–56) oder nach einem vom Autor vorgegebenen Sprungmuster, das auch die 'entbehrlichen Kapitel' (99 zusätzliche Kapitel) einbezieht. Der Roman wurde zum Kultbuch für mehrere Generationen.",
        difficulty = 4,
        funFact = "Der Titel 'Rayuela' ist das spanische Wort für das Kinderspiel 'Himmel und Hölle' (auch Hüpfkästchen genannt) — die Sprungbewegung des Spiels spiegelt die nicht-lineare Struktur des Romans wider."
    ),

    // Question 10 - Indische Literatur: Tagore
    Question(
        categoryId = 10,
        questionText = "Für welches Werk erhielt Rabindranath Tagore 1913 als erster Nicht-Europäer den Nobelpreis für Literatur?",
        answerA = "Gora",
        answerB = "The Home and the World",
        answerC = "Chitra",
        answerD = "Gitanjali",
        correctAnswer = 3,
        explanation = "'Gitanjali' (Liedopfer) ist eine Sammlung von 157 Gedichten, deren englische Übersetzung 'Song Offerings' Tagore 1913 den Nobelpreis einbrachte. Das zentrale Thema ist Gotteshingabe; viele der Gedichte wurden zu bengalischen Liedern vertont.",
        difficulty = 4,
        funFact = "Tagore übersetzte 'Gitanjali' selbst ins Englische — ein Umstand, der ihn von den meisten Nobelpreisträgern unterscheidet. W.B. Yeats schrieb das Vorwort zur englischen Ausgabe."
    ),

    // Question 11 - Arabische Literatur: Tausendundeine Nacht
    Question(
        categoryId = 10,
        questionText = "In welcher Sprache wurden die Geschichten von Tausendundeiner Nacht ursprünglich kompiliert, und aus welchem Land stammt die älteste bekannte Handschrift?",
        answerA = "Persisch, aus dem Iran",
        answerB = "Arabisch, aus Syrien",
        answerC = "Türkisch, aus dem osmanischen Reich",
        answerD = "Aramäisch, aus dem Irak",
        correctAnswer = 1,
        explanation = "Die älteste bekannte arabische Handschrift von Tausendundeine Nacht stammt aus Syrien (9. Jahrhundert). Die Geschichten haben jedoch Wurzeln in persischen, indischen und arabischen Quellen — die Rahmenerzählung mit Scheherazade und dem König Schahriyar stammt aus dem persischen 'Hezar Afsaneh'.",
        difficulty = 4,
        funFact = "Die berühmten Geschichten von Aladdin, Ali Baba und Sindbad dem Seefahrer sind in den ältesten Handschriften nicht enthalten — sie wurden erst vom französischen Übersetzer Antoine Galland im frühen 18. Jahrhundert hinzugefügt."
    ),

    // Question 12 - Arabische Literatur: Mahfouz
    Question(
        categoryId = 10,
        questionText = "Welches Hauptwerk Naguib Mahfouz', das drei Generationen einer ägyptischen Famile verfolgt, gilt als Hauptwerk der arabischen Romanliteratur?",
        answerA = "Midaq-Gasse",
        answerB = "Die Kairo-Trilogie",
        answerC = "Der Dieb und die Hunde",
        answerD = "Kinder der Gabalawi",
        correctAnswer = 1,
        explanation = "Die Kairo-Trilogie (1956–57) — bestehend aus 'Bayn al-Qasrayn', 'Qasr al-Shauq' und 'Al-Sukkariyya' — verfolgt drei Generationen einer Kairoer Familie vom Ersten Weltkrieg bis zur Revolution von 1952. Mahfouz schrieb sie zwischen 1946 und 1952 und gilt damit als 'Vater des ägyptischen Romans'.",
        difficulty = 4,
        funFact = "Mahfouz arbeitete viele Jahre lang als Beamter im ägyptischen Kultusministerium und schrieb nur frühmorgens, bevor er ins Büro fuhr. Sein gesamtes Romanwerk entstand in dieser Morgenstunden-Disziplin."
    ),

    // Question 13 - Persische Literatur: Omar Khayyam
    Question(
        categoryId = 10,
        questionText = "Wer war Omar Khayyam zu Lebzeiten primär, bevor er posthum als Dichter berühmt wurde?",
        answerA = "Militärischer Feldherr und Staatsmann",
        answerB = "Sufi-Mystiker und religiöser Führer",
        answerC = "Hofmaler und Miniaturist",
        answerD = "Astronom und Mathematiker",
        correctAnswer = 3,
        explanation = "Omar Khayyam (1048–1131) war zu Lebzeiten vor allem als Mathematiker und Astronom berühmt. Er reformierte den persischen Kalender und löste kubische Gleichungen. Die früheste Erwähnung seiner Dichtkunst findet sich in einer Biografie, die 43 Jahre nach seinem Tod verfasst wurde.",
        difficulty = 4,
        funFact = "Khayyams Kalenderreform war so präzise, dass sein persischer Kalender den gregorianischen Kalender an Genauigkeit übertrifft — er hat nur einen Fehler von einem Tag in 5.000 Jahren."
    ),

    // Question 14 - Persische Literatur: Rumi
    Question(
        categoryId = 10,
        questionText = "In welcher Stadt lebte und wirkte Dschalal ad-Din Rumi, der Verfasser des 'Masnawi', den größten Teil seines Lebens?",
        answerA = "Bagdad",
        answerB = "Konya",
        answerC = "Samarkand",
        answerD = "Teheran",
        correctAnswer = 1,
        explanation = "Rumi (1207–1273) lebte und wirkte in Konya (heutige Türkei), damals Teil des seldschukischen Anatolien. Dort gründete er die Bruderschaft der Mewlewi-Derwische (Tanzende Derwische). Sein Hauptwerk 'Masnawi-yi Ma'nawi' umfasst über 25.000 Doppelverse.",
        difficulty = 4,
        funFact = "Rumi wurde 1207 in Balkh (heutiges Afghanistan) geboren, aber die politische Situation zwang seine Familie zur Emigration. Er starb 1273 in Konya — sein Mausoleum ist dort bis heute eine wichtige Pilgerstätte."
    ),

    // Question 15 - Persische Literatur: Hafis
    Question(
        categoryId = 10,
        questionText = "Welcher deutsche Dichter schrieb unter dem Einfluss des persischen Dichters Hafis seinen 'West-östlichen Divan'?",
        answerA = "Friedrich Schiller",
        answerB = "Heinrich Heine",
        answerC = "Johann Wolfgang von Goethe",
        answerD = "Friedrich Hölderlin",
        correctAnswer = 2,
        explanation = "Goethes 'West-östlicher Divan' (1819) entstand als poetischer Dialog mit dem persischen Dichter Hafis (1315–1390). Hafis ist bekannt für seinen 'Diwan' — eine Sammlung von über 400 Ghaselen (Liebesgedichten), die oft mystisch-religiöse Themen unter dem Deckmantel weltlicher Liebe verhandeln.",
        difficulty = 4,
        funFact = "Goethe lernte im Alter von 65 Jahren Persisch, um Hafis im Original lesen zu können. Der 'West-östliche Divan' gilt als das bedeutendste Zeugnis der deutsch-persischen Literaturbeziehung."
    ),

    // Question 16 - Russisches Silbernes Zeitalter: Achmatowa
    Question(
        categoryId = 10,
        questionText = "Welches Gedichtzyklus von Anna Achmatowa, geschrieben zwischen 1935 und 1961, dokumentiert die stalinistischen Säuberungen und das Leiden der Angehörigen politischer Häftlinge?",
        answerA = "Requiem",
        answerB = "Abend",
        answerC = "Anno Domini MCMXXI",
        answerD = "Das Gedicht ohne Held",
        correctAnswer = 0,
        explanation = "Achmatowas 'Requiem' entstand nach der Verhaftung ihres Sohnes Lew Gumiljow durch den NKWD. Sie schrieb die Gedichte und ließ sie von Freundinnen auswendig lernen, bevor die Zettel verbrannt wurden — eine Technik des kollektiven Gedächtnisses gegen die Zensur.",
        difficulty = 4,
        funFact = "Achmatowas Sohn Lew Gumiljow wurde dreimal verhaftet und verbrachte insgesamt 14 Jahre in Gulags. Als Achmatowa 1946 öffentlich gedemütigt wurde, ließ Lew sich in der Hoffnung verhaften, seine Verhaftung könnte ihr nützen."
    ),

    // Question 17 - Russisches Silbernes Zeitalter: Zwetajewa
    Question(
        categoryId = 10,
        questionText = "Marina Zwetajewa ist nach welcher großen russischen Dichterin die zweite bedeutendste Lyrikerin des Silbernen Zeitalters und ehrte diese mit den Worten 'Muse des Weinens'?",
        answerA = "Sinaida Hippius",
        answerB = "Sofja Parnok",
        answerC = "Bella Achmadulina",
        answerD = "Anna Achmatowa",
        correctAnswer = 3,
        explanation = "Marina Zwetajewa schrieb 1916 über Anna Achmatowa: 'Muse des Weinens, schönste aller Musen … Anna Achmatowa! Dieser Name ist ein gewaltiger Seufzer.' Beide Dichterinnen sind die bedeutendsten Lyrikerinnen des Russischen Silbernen Zeitalters (1890–1930).",
        difficulty = 4,
        funFact = "Zwetajewa erhängte sich 1941 völlig verarmt in Jelabuga. Ihr Mann war erschossen, ihre Tochter in einem Gulag — sie hatte sich nach Jahren im Pariser Exil in die Sowjetunion zurückgetraut."
    ),

    // Question 18 - Skandinavische Literatur: Hamsun
    Question(
        categoryId = 10,
        questionText = "Für welches Werk erhielt der norwegische Schriftsteller Knut Hamsun 1920 den Nobelpreis für Literatur?",
        answerA = "Hunger",
        answerB = "Segen der Erde",
        answerC = "Victoria",
        answerD = "Pan",
        correctAnswer = 1,
        explanation = "'Segen der Erde' (Markens Grøde, 1917) ist Hamsuns Hauptwerk — ein epischer Roman über den Bauern Isak, der urbar macht und sich eine Existenz aufbaut. Der Roman gilt als Manifest eines naturverbundenen, antimodernen Lebensideals.",
        difficulty = 4,
        funFact = "Hamsuns Roman 'Hunger' (1890) war bahnbrechend für den modernen psychologischen Roman — er führte den inneren Monolog als Erzähltechnik ein. Franz Kafka und Henry Miller nannten Hamsun als wichtige Inspirationsquelle."
    ),

    // Question 19 - Skandinavische Literatur: Ibsen
    Question(
        categoryId = 10,
        questionText = "Welches Ibsen-Stück aus dem Jahr 1879 löste in ganz Europa Skandal aus, weil eine Ehefrau ihren Mann und ihre Kinder verlässt?",
        answerA = "Peer Gynt",
        answerB = "Nora oder Ein Puppenheim",
        answerC = "Die Wildente",
        answerD = "Hedda Gabler",
        correctAnswer = 1,
        explanation = "'Et dukkehjem' (Nora oder Ein Puppenheim, 1879) zeigt Nora Helmer, die ihren Mann verlässt, um als freie Frau zu leben. Das Türschlagen am Ende des Stücks wurde als Fanal des Feminismus gewertet. Das Stück löste in Europa so heftige Debatten aus, dass Ibsen für deutsche Aufführungen ein alternatives, milderes Ende schreiben musste.",
        difficulty = 4,
        funFact = "Der Theaterkritiker Georg Brandes nannte Ibsen 'den Mann, der eine Tür zugeschlagen hat und damit die moderne Welt erschüttert hat'. Das Ende von Nora gilt als einer der berühmtesten Bühnenabgänge der Theatergeschichte."
    ),

    // Question 20 - Japanische Literatur: Mishima
    Question(
        categoryId = 10,
        questionText = "An welchem Datum vollendete Yukio Mishima das letzte Kapitel seiner Tetralogie 'Das Meer der Fruchtbarkeit' — und was tat er danach?",
        answerA = "Am 25. November 1970 — er beging noch am selben Tag rituellen Selbstmord (Seppuku)",
        answerB = "Am 1. Januar 1971 — er reiste nach Amerika",
        answerC = "Am 15. August 1968 — er wurde verhaftet",
        answerD = "Am 3. Oktober 1972 — er starb an einem Herzinfarkt",
        correctAnswer = 0,
        explanation = "Mishima übergab das Manuskript des letzten Bandes ('Der Verfall des Engels') am 25. November 1970 an seinen Verleger. Danach marschierte er mit vier Mitgliedern seiner Privatarmee ins Verteidigungsministerium, hielt eine Rede und beging Seppuku (rituellen Selbstmord durch Bauchaufschlitzen).",
        difficulty = 4,
        funFact = "Mishimas Privatarmee 'Tatenokai' (Schildgesellschaft) zählte etwa 80 junge Männer. Der Putschversuch war von Anfang an zum Scheitern verurteilt — Mishima wusste es und plante es als Inszenierung seines Todes."
    ),

    // Question 21 - Japanische Literatur: Kawabata
    Question(
        categoryId = 10,
        questionText = "Welcher japanische Schriftsteller erhielt 1968 als erster Japaner den Nobelpreis für Literatur?",
        answerA = "Yukio Mishima",
        answerB = "Kenzaburo Oe",
        answerC = "Junichiro Tanizaki",
        answerD = "Yasunari Kawabata",
        correctAnswer = 3,
        explanation = "Yasunari Kawabata erhielt 1968 den Nobelpreis für Literatur für Werke wie 'Schneeland' (Yukiguni), 'Tausend Kraniche' und 'Die Meisterin'. Die Akademie würdigte seine 'narrativen Meisterschaft, die mit großer Sinnesschärfe die Essenz der japanischen Seele ausdrückt'.",
        difficulty = 4,
        funFact = "Kawabata war mit Mishima befreundet und hielt nach dessen Selbstmord 1970 die Gedächtnisrede. 1972 beging Kawabata selbst Selbstmord durch Gas — ohne Abschiedsbrief."
    ),

    // Question 22 - Indische Literatur: Epos
    Question(
        categoryId = 10,
        questionText = "Das Mahabharata gilt als eines der längsten epischen Gedichte der Welt. Wie viele Verse umfasst es ungefähr?",
        answerA = "Ca. 100.000 Verse",
        answerB = "Ca. 24.000 Verse",
        answerC = "Ca. 48.000 Verse",
        answerD = "Ca. 250.000 Verse",
        correctAnswer = 0,
        explanation = "Das Mahabharata umfasst in seiner langen Version (Sahasrakoti) ca. 100.000 Doppelverse (Shlokas) und gilt damit als eines der längsten literarischen Werke der Welt — etwa zehnmal länger als Ilias und Odyssee zusammen. Die Bhagavad Gita ist ein Teil davon.",
        difficulty = 4,
        funFact = "Im Mahabharata steht der berühmte Satz: 'Was immer hier steht, kann anderswo gefunden werden; was hier nicht steht, existiert nirgends.' Dies beschreibt den universellen Anspruch des Epos."
    ),

    // Question 23 - Lateinamerikanische Literatur: Vargas Llosa
    Question(
        categoryId = 10,
        questionText = "Mario Vargas Llosa erhielt 2010 den Nobelpreis für Literatur. Aus welchem Land stammt er?",
        answerA = "Kolumbien",
        answerB = "Peru",
        answerC = "Chile",
        answerD = "Argentinien",
        correctAnswer = 1,
        explanation = "Mario Vargas Llosa ist Peruaner und gehört neben García Márquez, Cortázar und Fuentes zu den vier Hauptvertretern des Lateinamerikanischen Booms. Der Nobelpreis wurde ihm 'für seine Kartografie der Machtstrukturen und seine scharfen Bilder individuellen Widerstands, des Aufstands und der Niederlage' verliehen.",
        difficulty = 4,
        funFact = "Vargas Llosa kandidierte 1990 für die Präsidentschaft Perus und verlor gegen Alberto Fujimori. Er schrieb den Roman 'Der Geschichtenerzähler' während des Wahlkampfes."
    ),

    // Question 24 - Afrikanische Literatur: Achebe
    Question(
        categoryId = 10,
        questionText = "Aus welchem Gedicht W.B. Yeats' stammt der Titel von Chinua Achebes 'Things Fall Apart' (Alles zerfällt)?",
        answerA = "The Second Coming",
        answerB = "Easter, 1916",
        answerC = "The Lake Isle of Innisfree",
        answerD = "Sailing to Byzantium",
        correctAnswer = 0,
        explanation = "Der Titel stammt aus Yeats' Gedicht 'The Second Coming' (1919): 'Things fall apart; the centre cannot hold'. Achebe wählte diesen Titel bewusst, um den Zerfall der Igbo-Gesellschaft unter dem kolonialen Druck zu symbolisieren.",
        difficulty = 4,
        funFact = "Achebe schrieb 'Things Fall Apart' als direkte Antwort auf Joseph Conrads 'Herz der Finsternis', das er in einem berühmten Essay als rassistisch kritisierte, weil es Afrika nur als Kulisse und Afrikaner als Staffage darstellte."
    ),

    // Question 25 - Russisches Silbernes Zeitalter: Symbolismus
    Question(
        categoryId = 10,
        questionText = "Welche drei literarischen Bewegungen dominierten das Russische Silberne Zeitalter (ca. 1890–1930)?",
        answerA = "Realismus, Naturalismus und Expressionismus",
        answerB = "Symbolismus, Akmeismus und Futurismus",
        answerC = "Romantismus, Nihilismus und Sozialistischer Realismus",
        answerD = "Dadaismus, Surrealismus und Kubismus",
        correctAnswer = 1,
        explanation = "Das Silberne Zeitalter wurde von drei Bewegungen geprägt: dem russischen Symbolismus (mit Blok, Bely), dem Akmeismus (mit Achmatowa, Gumiljow) und dem russischen Futurismus (mit Majakowski, Chlebnikow). Marina Zwetajewa gehörte keiner dieser Gruppen an.",
        difficulty = 4,
        funFact = "Das 'Goldene Zeitalter' der russischen Literatur war das 19. Jahrhundert mit Puschkin, Tolstoi und Dostojewski. Das 'Silberne' des frühen 20. Jahrhunderts war weniger bekannt, aber ebenso innovativ."
    ),

    // Question 26 - Arabische Literatur: Klassisch
    Question(
        categoryId = 10,
        questionText = "Welches arabische literarische Genre bezeichnet eine Sammlung von moralischen Fabeln mit Tier-Protagonisten, die auf indischen Quellen basiert und im 8. Jahrhundert von Ibn al-Muqaffa ins Arabische übersetzt wurde?",
        answerA = "Maqama",
        answerB = "Qasida",
        answerC = "Kalila wa Dimna",
        answerD = "Diwan",
        correctAnswer = 2,
        explanation = "'Kalila wa Dimna' ist eine Sammlung von Tierfabeln, die Ibn al-Muqaffa ca. 750 n. Chr. aus dem Persischen (Panchatantra-Tradition) ins Arabische übersetzte. Die beiden Titelprotagonisten sind Schakale, die durch Klugheit und List moralische Lektionen vermitteln.",
        difficulty = 4,
        funFact = "Ibn al-Muqaffa wurde kurz nach der Übersetzung von 'Kalila wa Dimna' hingerichtet — angeblich weil seine freien Gedanken den Kalif beunruhigten. Das Buch überlebte ihn um Jahrhunderte."
    ),

    // Question 27 - Lateinamerikanische Literatur: Borges tief
    Question(
        categoryId = 10,
        questionText = "Was ist das 'Aleph' in Borges' gleichnamiger Erzählung?",
        answerA = "Ein heiliges hebräisches Buch",
        answerB = "Ein Spiegel, der die Vergangenheit zeigt",
        answerC = "Ein Punkt im Raum, der alle anderen Punkte des Universums gleichzeitig enthält",
        answerD = "Eine argentinische Stadt, die sich selbst verschluckt",
        correctAnswer = 2,
        explanation = "In Borges' Erzählung 'Das Aleph' (1945) ist das Aleph ein winziger Punkt unter einer Kellertreppe, der alle Punkte des Universums gleichzeitig enthält — der Erzähler kann darin die gesamte Welt auf einmal sehen. Das Aleph ist zugleich der erste Buchstabe des hebräischen Alphabets.",
        difficulty = 4,
        funFact = "Borges nannte die Erzählung nach dem ersten Buchstaben des hebräischen Alphabets, der in der Kabbala als Symbol für den Ursprung aller Dinge gilt — ein direkter Bezug zur jüdischen Mystik."
    ),

    // Question 28 - Persische Literatur: Firdausi
    Question(
        categoryId = 10,
        questionText = "Welches persische Nationalepos, das ca. 60.000 Doppelverse umfasst, erzählt die mythische Geschichte Persiens bis zur arabischen Eroberung?",
        answerA = "Shahnameh",
        answerB = "Masnawi",
        answerC = "Bustan",
        answerD = "Golestan",
        correctAnswer = 0,
        explanation = "Das 'Shahnameh' (Buch der Könige) von Firdausi (ca. 1010) umfasst etwa 60.000 Doppelverse und ist das bedeutendste persische Nationalepos. Es schildert die mythische und legendäre Geschichte Persiens von der Schöpfung bis zur arabischen Eroberung im 7. Jahrhundert.",
        difficulty = 4,
        funFact = "Firdausi arbeitete 30 Jahre an dem Epos und schrieb es auf Bestellung des Sultans Mahmud von Ghazni. Als dieser die versprochene Bezahlung verweigerte, soll Firdausi eine vernichtende Satire auf ihn geschrieben haben."
    ),

    // Question 29 - Japanische Literatur: Sei Shonagon
    Question(
        categoryId = 10,
        questionText = "Welches Werk der japanischen Schriftstellerin Sei Shonagon aus der Heian-Zeit gilt als eines der ältesten Tagebuch-/Essay-Werke der Weltliteratur?",
        answerA = "Sarashina-Tagebuch",
        answerB = "Izumi Shikibu-Tagebuch",
        answerC = "Makura no Soshi",
        answerD = "Murasaki Shikibu-Tagebuch",
        correctAnswer = 2,
        explanation = "'Makura no Soshi' (Das Kopfkissenbuch, ca. 1000 n. Chr.) von Sei Shonagon ist eine Sammlung von Beobachtungen, Listen, Anekdoten und Essays aus dem höfischen Leben. Sei Shonagon war Hofdame wie Murasaki Shikibu, aber beide schrieben sehr unterschiedliche Werke.",
        difficulty = 4,
        funFact = "Sei Shonagon und Murasaki Shikibu rivalisierten als Hofdamen, und Murasaki schrieb in ihrem Tagebuch, Sei Shonagon sei 'zu selbstverliebt'. 'Das Kopfkissenbuch' erfand eine neue literarische Form — das 'Zuihitsu' (freier Essay-Stil)."
    ),

    // Question 30 - Indische Literatur: Rushdie
    Question(
        categoryId = 10,
        questionText = "Welcher Preis wurde Salman Rushdies 'Mitternachtskinder' zweimal als bestes aller Booker-Gewinner verliehen?",
        answerA = "Man Booker International Prize",
        answerB = "Booker of Bookers und Best of the Booker",
        answerC = "Commonwealth Writers' Prize",
        answerD = "Pulitzer Prize for Fiction",
        correctAnswer = 1,
        explanation = "'Mitternachtskinder' gewann 1981 den Booker Prize und wurde später zweimal als bestes Booker-Buch aller Zeiten gewählt: 'Booker of Bookers' (1993, zum 25. Jubiläum) und 'Best of the Booker' (2008, zum 40. Jubiläum).",
        difficulty = 4,
        funFact = "Der Roman verbindet Magie, Geschichte und persönliche Erinnerung: Saleem Sinai, der in der Unabhängigkeitsnacht Indiens 1947 geboren wird, kann die Gedanken aller anderen 'Mitternachtskinder' hören — eine Metapher für Indiens pluralistische Identität."
    ),

    // Question 31 - Skandinavische Literatur: Sigrid Undset
    Question(
        categoryId = 10,
        questionText = "Welche norwegische Schriftstellerin erhielt 1928 den Nobelpreis für Literatur für ihre historischen Romane über das mittelalterliche Norwegen?",
        answerA = "Astrid Lindgren",
        answerB = "Sigrid Undset",
        answerC = "Amalie Skram",
        answerD = "Selma Lagerlöf",
        correctAnswer = 1,
        explanation = "Sigrid Undset erhielt 1928 den Nobelpreis für Literatur, hauptsächlich für ihre Mittelalter-Trilogie 'Kristin Lavranstochter' (1920–22). Sie war die dritte Nobelpreisträgerin für Literatur insgesamt und die erste Skandinavierin.",
        difficulty = 4,
        funFact = "Sigrid Undset konvertierte 1924 zum Katholizismus — eine ungewöhnliche Entscheidung in protestantischen Norwegen. Während der deutschen Besatzung im Zweiten Weltkrieg floh sie nach Amerika und half dem norwegischen Widerstand."
    ),

    // Question 32 - Afrikanische Literatur: Ben Okri
    Question(
        categoryId = 10,
        questionText = "Welcher nigerianische Schriftsteller gewann 1991 den Booker Prize für seinen magisch-realistischen Roman 'The Famished Road'?",
        answerA = "Chimamanda Ngozi Adichie",
        answerB = "Cyprian Ekwensi",
        answerC = "Ben Okri",
        answerD = "Ken Saro-Wiwa",
        correctAnswer = 2,
        explanation = "Ben Okri erhielt 1991 den Booker Prize für 'The Famished Road', einen Roman über einen 'Abiku' — ein Kind, das zwischen der Welt der Geister und der Lebenden wandelt. Das Konzept des Abiku stammt aus der Yoruba-Mythologie und beschreibt Kinder, die zwischen beiden Welten pendeln.",
        difficulty = 4,
        funFact = "Das Konzept des Abiku findet sich auch in Wole Soyinkas gleichnamigem Gedicht und in Flora Nwapas Romanen — es ist eines der prägendsten Mythen der Yoruba-Kultur, die immer wieder in der nigerianischen Literatur auftaucht."
    ),

    // Question 33 - Lateinamerikanische Literatur: Neruda
    Question(
        categoryId = 10,
        questionText = "Pablo Neruda erhielt 1971 den Nobelpreis für Literatur. Unter welchem bürgerlichen Namen war er geboren?",
        answerA = "José Emilio Pacheco",
        answerB = "Vicente Huidobro",
        answerC = "Gabriela Mistral",
        answerD = "Neftalí Ricardo Reyes Basoalto",
        correctAnswer = 3,
        explanation = "Pablo Neruda wurde als Neftalí Ricardo Reyes Basoalto geboren (1904, Chile). Er wählte das Pseudonym 'Pablo Neruda' nach dem tschechischen Dichter Jan Neruda, um seiner Dichterleidenschaft nachzugehen ohne den Widerstand seines Vaters zu provozieren.",
        difficulty = 4,
        funFact = "Neruda starb am 23. September 1973 — zwölf Tage nach dem Militärputsch Pinochets, der seinen engen Freund Salvador Allende tötete. Ob er an Krebs oder unter ungeklärten Umständen starb, ist bis heute umstritten."
    ),

    // Question 34 - Russisches Silbernes Zeitalter: Blok
    Question(
        categoryId = 10,
        questionText = "Welches berühmte Gedicht des russischen Symbolisten Alexander Blok aus dem Jahr 1918 feiert die Oktoberrevolution mit messianischen Bildern?",
        answerA = "Die Zwölf",
        answerB = "Die Schöne Unbekannte",
        answerC = "Nacht, Straße, Laterne",
        answerD = "Die Skythen",
        correctAnswer = 0,
        explanation = "'Die Zwölf' (1918) ist Bloks revolutionäres Hauptwerk: Zwölf Rotgardisten marschieren durch das Petrograd der Revolution — am Ende führt eine Christusfigur ihren Zug an. Das Poem schockierte viele durch seine gleichzeitige Verherrlichung und Dämonisierung der Revolution.",
        difficulty = 4,
        funFact = "Blok stand nach der Veröffentlichung von 'Die Zwölf' von beiden Lagern angegriffen: Die Bolschewiken hielten ihn für einen religiösen Mystiker, die Konservativen für einen Revolutionsanhänger. Er starb 1921, erschöpft und desillusioniert."
    ),

    // Question 35 - Arabische Literatur: Adonis
    Question(
        categoryId = 10,
        questionText = "Welcher syrische Dichter, geboren 1930 als Ali Ahmad Said Esber, gilt als bedeutendster zeitgenössischer Lyriker in arabischer Sprache?",
        answerA = "Adonis",
        answerB = "Mahmoud Darwish",
        answerC = "Nizar Qabbani",
        answerD = "Said Akl",
        correctAnswer = 0,
        explanation = "Adonis (Ali Ahmad Said Esber) gilt als Erneuerer der arabischen Poesie und wird seit Jahrzehnten für den Nobelpreis gehandelt. Er lebt im Pariser Exil und ist für seine moderne, avantgardistische Lyrik bekannt, die traditionelle arabische Formen mit westlichen Einflüssen verbindet.",
        difficulty = 4,
        funFact = "Adonis wählte sein Pseudonym nach dem phönizischen Gott Adonis — ein bewusstes Zeichen seiner Rückbesinnung auf vorislamische, arabische Kulturen. Er kritisiert religiösen Fundamentalismus offen und ist damit auch innerhalb der arabischen Welt umstritten."
    ),

    // Question 36 - Japanische Literatur: Natsume Soseki
    Question(
        categoryId = 10,
        questionText = "Welcher japanische Schriftsteller des frühen 20. Jahrhunderts, dessen Gesicht auf dem 1000-Yen-Schein abgebildet ist, schrieb 'Ich bin eine Katze' und 'Kokoro'?",
        answerA = "Ryunosuke Akutagawa",
        answerB = "Junichiro Tanizaki",
        answerC = "Natsume Soseki",
        answerD = "Toson Shimazaki",
        correctAnswer = 2,
        explanation = "Natsume Soseki (1867–1916) ist der bedeutendste japanische Romancier der Meiji-Zeit. 'Kokoro' (1914), sein letztes vollendetes Werk, und 'Ich bin eine Katze' (1905–06) sind seine bekanntesten Werke. Sein Porträt war jahrzehntelang auf dem 1000-Yen-Schein zu sehen.",
        difficulty = 4,
        funFact = "Soseki studierte englische Literatur in London (1900–02) und litt dort unter tiefer Einsamkeit und Depressionen. Diese Erfahrung der kulturellen Entfremdung prägte sein gesamtes Werk."
    ),

    // Question 37 - Lateinamerikanische Literatur: Fuentes
    Question(
        categoryId = 10,
        questionText = "Welcher mexikanische Schriftsteller und eine der vier Hauptfiguren des Lateinamerikanischen Booms schrieb den Roman 'Der Tod des Artemio Cruz' (1962)?",
        answerA = "Octavio Paz",
        answerB = "Juan Rulfo",
        answerC = "Carlos Fuentes",
        answerD = "Elena Poniatowska",
        correctAnswer = 2,
        explanation = "Carlos Fuentes (1928–2012) schrieb 'La muerte de Artemio Cruz' (1962), einen Roman über einen sterbenden mexikanischen Revolutionär, der sein Leben retrospektiv überdenkt. Das Buch revolutionierte die Verwendung verschiedener grammatischer Personen (Ich, Du, Er) für verschiedene Zeitebenen.",
        difficulty = 4,
        funFact = "Juan Rulfo ist mit nur zwei Werken — dem Kurzgeschichtenband 'El Llano en llamas' und dem Roman 'Pedro Páramo' — einer der einflussreichsten lateinamerikanischen Schriftsteller. García Márquez sagt, 'Pedro Páramo' habe ihn gelehrt, wie man schreibt."
    ),

    // Question 38 - Skandinavische Literatur: Strindberg
    Question(
        categoryId = 10,
        questionText = "August Strindberg ist ein Pionier welcher dramatischen Form, die er in Stücken wie 'Ein Traumspiel' (1902) entwickelte?",
        answerA = "Naturalismus",
        answerB = "Episches Theater",
        answerC = "Theater des Absurden",
        answerD = "Expressionismus und expressionistisches Traumtheater",
        correctAnswer = 3,
        explanation = "'Ein Traumspiel' (1902) ist Strindbergs Hauptwerk des expressionistischen Traumtheaters: Die Handlung folgt einer Traumlogik, Figuren verschmelzen ineinander, Zeit und Raum sind fluid. Strindberg schrieb als Motto: 'Alles kann geschehen, alles ist möglich und wahrscheinlich.' Das Stück beeinflusste den Expressionismus stark.",
        difficulty = 4,
        funFact = "Strindberg war ein Pionier der modernen Psychologie im Theater — lange bevor Freud populär wurde. Er schrieb offen über seine eigene psychische Instabilität und hatte drei gescheiterte Ehen, die sein Werk prägten."
    ),

    // Question 39 - Indische Literatur: Sanskrit-Klassik
    Question(
        categoryId = 10,
        questionText = "Welches Sanskrit-Drama des Dichters Kalidasa (ca. 4.–5. Jahrhundert n. Chr.) gilt als Meisterwerk der klassischen indischen Literatur und erzählt die Geschichte einer vergesslichen Liebes-Wiedervereinigung?",
        answerA = "Mudrarakshasa",
        answerB = "Mricchakatika",
        answerC = "Meghaduta",
        answerD = "Abhijnanasakuntalam",
        correctAnswer = 3,
        explanation = "'Abhijnanasakuntalam' (Die Erkenntnis der Shakuntala) von Kalidasa erzählt die Geschichte des Königs Dushyanta, der Shakuntala heiratet, sie aber durch einen Fluch vergisst. Das Stück wurde 1789 ins Englische übersetzt und begeisterte Goethe so sehr, dass er sagte: 'Willst du die Blüte des frühen, die Früchte des späteren Jahres, willst du, was reizt und entzückt, willst du was sättigt und nährt, willst du den Himmel, die Erde, mit Einem Namen begreifen: nenn ich, Sakuntala, dich, und so ist Alles gesagt.'",
        difficulty = 4,
        funFact = "Kalidasas Werk wurde ein Jahrhunderte langer Schlüsseltext für den europäischen Orientalismus. Herder, Schlegel und Schopenhauer waren begeistert — und Goethe ließ sich vom Prolog für den Faust-Prolog inspirieren."
    ),

    // Question 40 - Afrikanische Literatur: Senghor
    Question(
        categoryId = 10,
        questionText = "Léopold Sédar Senghor war nicht nur Dichter, sondern auch Staatspräsident welches westafrikanischen Landes?",
        answerA = "Elfenbeinküste",
        answerB = "Mali",
        answerC = "Senegal",
        answerD = "Guinea",
        correctAnswer = 2,
        explanation = "Léopold Sédar Senghor (1906–2001) war Mitbegründer der literarisch-kulturellen Négritude-Bewegung und von 1960 bis 1980 erster Präsident des unabhängigen Senegal. 1983 wurde er als erster Afrikaner in die Académie française aufgenommen.",
        difficulty = 4,
        funFact = "Die Négritude-Bewegung, gegründet von Senghor, Aimé Césaire und Léon-Gontran Damas in Paris in den 1930er Jahren, war eine intellektuelle und kulturelle Gegenbewegung zum europäischen Kolonialismus — eine Rückbesinnung auf afrikanische Identität und Werte."
    ),

    // Question 41 - Arabische Literatur: Moderner Palästina
    Question(
        categoryId = 10,
        questionText = "Welcher palästinensische Dichter, oft als 'nationaler Dichter Palästinas' bezeichnet, schrieb das Gedicht 'Auf diesem Land' (1966)?",
        answerA = "Emile Habibi",
        answerB = "Ghassan Kanafani",
        answerC = "Mahmoud Darwish",
        answerD = "Samih al-Qasim",
        correctAnswer = 2,
        explanation = "Mahmoud Darwish (1941–2008) gilt als bedeutendster arabischer Lyriker des 20. Jahrhunderts und nationaler Dichter Palästinas. 'Auf diesem Land / was das Leben des Lebens wert macht' ist eines seiner bekanntesten Gedichte. Er war Mitglied der PLO und lebte lange im Exil.",
        difficulty = 4,
        funFact = "Mahmoud Darwishs Gedicht 'Ausweis' (Sajjil ana arabi, 1964) war so einflussreich, dass israelische Soldaten angewiesen wurden, es nicht laut zu lesen — aus Angst vor seiner emotionalen Wirkung."
    ),

    // Question 42 - Japanische Literatur: Akutagawa
    Question(
        categoryId = 10,
        questionText = "Nach welchem japanischen Schriftsteller, der sich 1927 das Leben nahm, ist Japans bedeutendster Literaturpreis für Nachwuchsautoren benannt?",
        answerA = "Yasunari Kawabata",
        answerB = "Natsume Soseki",
        answerC = "Yukio Mishima",
        answerD = "Ryunosuke Akutagawa",
        correctAnswer = 3,
        explanation = "Der Akutagawa-Preis, Japans renommiertester Nachwuchs-Literaturpreis, ist nach Ryunosuke Akutagawa (1892–1927) benannt. Akutagawa schrieb Meisterwerke der japanischen Kurzprosa wie 'Rashomon' und 'Im Dickicht', bevor er sich 1927 im Alter von 35 Jahren das Leben nahm.",
        difficulty = 4,
        funFact = "Akira Kurosawas berühmter Film 'Rashomon' (1950) basiert auf zwei Kurzgeschichten Akutagawas: 'Rashomon' und 'Im Dickicht'. Der Begriff 'Rashomon-Effekt' (verschiedene Zeugen schildern dasselbe Ereignis widersprüchlich) ist seitdem ein fester Begriff in der Psychologie."
    ),

    // Question 43 - Lateinamerikanische Literatur: Allende
    Question(
        categoryId = 10,
        questionText = "Isabel Allende schrieb ihren ersten Roman 'Das Geisterhaus' (La casa de los espíritus, 1982) ursprünglich als was?",
        answerA = "Als langen Brief an ihren sterbenden Großvater",
        answerB = "Als Bühnenmanuskript für ein Theater in Santiago",
        answerC = "Als Auftragsarbeit für einen Verlag in Spanien",
        answerD = "Als Tagebuch während ihres Exils in Venezuela",
        correctAnswer = 0,
        explanation = "'Das Geisterhaus' begann als langer Brief Isabels an ihren 99-jährigen Großvater, der in Chile im Sterben lag und den sie wegen des Exils nicht besuchen konnte. Der Brief wurde immer länger und verwandelte sich in einen Roman. Isabel Allende ist eine Nichte von Salvador Allende.",
        difficulty = 4,
        funFact = "Isabel Allende floh nach dem Pinochet-Putsch 1973 aus Chile ins Exil nach Venezuela. Sie schrieb 'Das Geisterhaus' 1981 in Caracas — 13 Jahre nach der Diktatur. Ihr Großvater starb, bevor das Buch fertig war."
    ),

    // Question 44 - Russisches Silbernes Zeitalter: Pasternak
    Question(
        categoryId = 10,
        questionText = "Boris Pasternak erhielt 1958 den Nobelpreis für Literatur, musste ihn aber auf Druck der sowjetischen Regierung ablehnen. Für welches Werk?",
        answerA = "Mein Schwesterchen, das Leben",
        answerB = "Doktor Schiwago",
        answerC = "Sicheres Geleit",
        answerD = "Zweite Geburt",
        correctAnswer = 1,
        explanation = "'Doktor Schiwago' (1957) durfte in der Sowjetunion nicht erscheinen und wurde heimlich nach Italien geschmuggelt, wo es bei Feltrinelli veröffentlicht wurde. Als Pasternak dafür den Nobelpreis erhielt, zwangen die sowjetischen Behörden ihn zur Ablehnung unter Androhung von Ausweisung.",
        difficulty = 4,
        funFact = "Die CIA ließ 'Doktor Schiwago' in russischer Sprache drucken und verteilte ihn im Kalten Krieg heimlich in der Sowjetunion — als Propagandainstrument. Das Buch wurde damit auch ein geopolitisches Werkzeug."
    ),

    // Question 45 - Skandinavische Literatur: Jon Fosse
    Question(
        categoryId = 10,
        questionText = "Jon Fosse, Nobelpreisträger für Literatur 2023, schreibt in einer welchen Sprache, die nur von weniger als 500.000 Menschen gesprochen wird?",
        answerA = "Färöisch",
        answerB = "Samisch",
        answerC = "Nynorsk (Neunorwegisch)",
        answerD = "Friesisch",
        correctAnswer = 2,
        explanation = "Jon Fosse schreibt auf Nynorsk, einer der zwei offiziellen Schriftsprachen Norwegens, die von weniger als 500.000 Menschen gesprochen wird. Nynorsk wurde im 19. Jahrhundert von Ivar Aasen als Alternative zum Dänisch-beeinflussten Bokmål entwickelt.",
        difficulty = 4,
        funFact = "Fosse ist neben Knut Hamsun, Bjørnstjerne Bjørnson und Sigrid Undset der vierte norwegische Nobelpreisträger für Literatur. Er ist bekannt für minimale, meditative Prosa und Dramen — sein Stil wird als 'Fosse-Minimalismus' bezeichnet."
    ),

    // Question 46 - Indische Literatur: Roy
    Question(
        categoryId = 10,
        questionText = "Arundhati Roy erhielt 1997 den Booker Prize für ihren Debütroman. Wie lautet der Titel?",
        answerA = "The White Tiger",
        answerB = "The Namesake",
        answerC = "A Fine Balance",
        answerD = "The God of Small Things",
        correctAnswer = 3,
        explanation = "'The God of Small Things' (1997) ist Arundhati Roys einziger Roman (neben zahlreichen Sachbüchern). Der Roman spielt in Kerala und thematisiert das indische Kastensystem, koloniale Nachwirkungen und eine verbotene Liebe. Roy hat seitdem ausschließlich politische Sachbücher und Essays geschrieben.",
        difficulty = 4,
        funFact = "Roy wurde nach dem Erfolg ihres Romans zum politischen Aktivismus gezogen — Atomtests, Staudammprojekte, Kaschmir-Konflikt. Sie sagte: 'Solange ich auf der Seite der Schwachen stehe, bin ich auf der richtigen Seite.'"
    ),

    // Question 47 - Arabische Literatur: Alf Layla
    Question(
        categoryId = 10,
        questionText = "Wie heißt die Figur, die in Tausendundeine Nacht durch ihre Erzählkunst ihr Leben rettet, indem sie den König jede Nacht mit einer unvollendeten Geschichte in Spannung hält?",
        answerA = "Dinazade",
        answerB = "Marjanah",
        answerC = "Scheherazade",
        answerD = "Morgiane",
        correctAnswer = 2,
        explanation = "Scheherazade (arabisch: Shahrazad) ist die Erzählerin in Tausendundeine Nacht. König Schahriyar tötet jede Frau nach der Hochzeitsnacht. Scheherazade rettet sich, indem sie jede Nacht eine Geschichte beginnt und sie vor dem entscheidenden Höhepunkt abbricht — so bleibt der König am Leben, um die Fortsetzung zu hören.",
        difficulty = 4,
        funFact = "Scheherazades Schwester Dinazade spielt eine entscheidende Rolle: Sie fragt morgens nach der Geschichte, was Scheherazade das Signal gibt, anzufangen. Dinazade ist die erste Literaturkritikerin der Weltgeschichte — sie fordert immer mehr."
    ),

    // Question 48 - Lateinamerikanische Literatur: Vargas Llosa tief
    Question(
        categoryId = 10,
        questionText = "Vargas Llosas Roman 'Das grüne Haus' (La Casa Verde, 1965) spielt in welchem Land und verbindet welche zwei Schauplätze miteinander?",
        answerA = "Kolumbien: Bogotá und die Kaffeeplantagen",
        answerB = "Bolivien: La Paz und die Yungas",
        answerC = "Mexiko: Mexico City und die Halbinsel Yucatán",
        answerD = "Peru: die Wüstenstadt Piura und das Amazonasgebiet",
        correctAnswer = 3,
        explanation = "'La Casa Verde' verknüpft zwei Handlungsstränge: die Wüstenstadt Piura (wo ein berühmtes Bordell namens 'Das grüne Haus' steht) und den Amazonas-Dschungel Perus. Die komplexe, nichtlineare Erzählstruktur machte den Roman zu einem Meisterwerk des Booms.",
        difficulty = 4,
        funFact = "Vargas Llosa konstruierte in 'Das grüne Haus' fünf parallele Handlungsstränge aus verschiedenen Zeiten und Orten, die er ineinander verschnitt — eine Technik, die er 'kommunizierende Röhren' nannte."
    ),

    // Question 49 - Japanische Literatur: Oe
    Question(
        categoryId = 10,
        questionText = "Welcher japanische Schriftsteller erhielt 1994 den Nobelpreis für Literatur und sagte, er lehne die kulturellen Auszeichnungen der japanischen Regierung ab?",
        answerA = "Kenzaburo Oe",
        answerB = "Haruki Murakami",
        answerC = "Yasunari Kawabata",
        answerD = "Kobo Abe",
        correctAnswer = 0,
        explanation = "Kenzaburo Oe erhielt 1994 den Nobelpreis für Literatur. Er lehnte wenige Wochen später den japanischen Kulturorden (Bunka Kunsho) ab, weil dieser vom japanischen Kaiser verliehen wird, und Oe den Tenno-Kult ablehnt. Er ist bekannt für sein Engagement gegen Atomkraft und Nationalismus.",
        difficulty = 4,
        funFact = "Oes Sohn Hikari wurde mit einem Gehirntumor geboren und ist geistig behindert. Hikari wurde jedoch ein anerkannter Komponist klassischer Musik — Oes Umgang mit dieser Erfahrung prägt viele seiner Romane."
    ),

    // Question 50 - Russisches Silbernes Zeitalter: Mandelstam
    Question(
        categoryId = 10,
        questionText = "Welcher russische Dichter des Silbernen Zeitalters starb 1938 in einem Durchgangslager bei Wladiwostok, nachdem er ein Gedicht über Stalins Grausamkeit geschrieben hatte?",
        answerA = "Boris Pasternak",
        answerB = "Nikolai Gumiljow",
        answerC = "Ossip Mandelstam",
        answerD = "Sergei Jessenin",
        correctAnswer = 2,
        explanation = "Ossip Mandelstam schrieb 1933 ein Epigramm auf Stalin ('Stalin-Epigramm'), das ihn das Leben kostete. Er rezitierte es privat einem kleinen Kreis — einer der Anwesenden denunzierte ihn. Nach zwei Verhaftungen starb Mandelstam 1938 im Durchgangslager Wtoraja Retschka nahe Wladiwostok.",
        difficulty = 4,
        funFact = "Anna Achmatowa, Mandelstams Freundin, lernte sein verbotenes Werk auswendig und ließ es von anderen auswendig lernen — die einzige Möglichkeit, es zu bewahren. Dieser literarische Widerstand heißt 'Samizdat'."
    )

)
