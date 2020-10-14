# SampleSAX
Zum XML Verarbeitungs Kurs ein Sample für Java API SAX

## SAX (simle api for xml processing)

## Sinn/Zweck/Besonderheiten
- ist ein de facto Standard/Industriestandard 
- bevor es StAX gab war es die schnellste und speicherschonendste Methode zur Verarbeitung von XML Dateien
- Push Parser (dh er hat Kontrolle und man kann nur bei seinen Callback-Methoden/Events reagieren)
- Handelt Events (zB startElement, endElement, startDocument, ....)
- kann nur parsen / Lesen
- liest immer stoisch von vorne nach hinten

## Vorteile
- schnell und speichersparend -> auch bei großen XML Doks effizient
- prüft immer die Wohlgeformtheit eines xml doks (kann auch Zulässigkeit prüfen)

## Herausforderungen
- nur lesen nicht schreiben
- es werden immer nur kleine Bestandteile von XML Datein betrachtet und nicht die gesamte Struktur -> Programmierung ist schwierig
- Push Parser -> Lesen immer bis zum Ende
