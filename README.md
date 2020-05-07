# Übung1
#### Lehrveranstaltung: Konfigurationsmanagment SS2020
 *Dieses Repository enthält alle Dokumente und Dateien die
 für die 1. Übung des Kurses Konfigurationsmanagment im 
 Sommersemesters 2020 notwendig beziehungsweise relevant sind. Zusätzlich
 wird in diesem README-Dokument beschrieben worum es in dem Project
 Drinks geht und wie unsere Gruppe vorhat das vorhandene Projekt zu erweitern.*
 
* #### Beschreibung des Projekts
  Das Hauptprojekt (also ohne die Testautomation) hat 3 Java-Files, nämlich Drink, 
  Liquid und Simple Drink. Im Folgenden werden die Funktionen dieser Files genau beschrieben. 
  
  ##### 1. Drink: 
  Die Klasse Drink ist eine abstrakte Klasse, welche als Vorlage für tatsächliche konkrete Getränke aggiert.
  Dabei hat sie das Attribut _"name"_ und auch zahlreiche abstrakte Methoden die von abgeleiteten Klassen überschrieben werden können,
   wie getVolume(), getAlcoholPercent() und isAlcoholic().
             
  ##### 2. Liquid:
  Die Klasse Liquid beschreibt Flüssigkeiten mit den Attributen _"name", "volume"_ und _"alcoholPercent"_, welche 
  in den tatsächlichen Getränken verwendet werden können. Die Klasse hat neben den Methoden
  getVolume() und getAlcoholPercent() natürlich auch die Getter und Setter für die jeweiligen Attribute.
  
  ##### 3. SimpleDrink
  Die Klasse SimpleDrink ist von der Klasse Drink abgeleitet und stellt daher ein tatsächliches Getränk oder 
  eine tatsächliche Flüssigkeit dar, welche wiederum in Getränken verwendet werden kann. Da SimpleDrink eine abgeleitete
  Klasse ist werden die Methoden getVolume(), getAlcoholPercent() und isAlcoholic() überschrieben. 
  Dabei gibt :
    - _getVolume()_: das Volumen des Getränks in Liter zurück.
    - _getAlcoholPercent()_: das berechnete Alkoholvolumen des Getränks in Prozent zurück.
    - _isAlcoholic()_: einen Boolean-Wert zurück, der mir angibt ob alkoholische Flüssigkeiten in diesem Getränk enthalten
    sind.
  
  
- #### Beschreibung der Erweiterung
  Unsere Gruppe hat sich für die Möglichkeit a) entschieden, also von
  Drinks/SimpleDrink   eine   aufwändig   umzusetzende Subklasse   abzuleiten. 
  (Verwendung   einer   Collection). Dabei haben wir uns dazu entschieden ein Mischgetränk zu implementieren,
  welches eine Ableitung der Klasse Drinks darstellt. Das Getränk hat einen Namen, enthält zwei Flüssigkeiten. 
  Allerdings darf nur höchstens eine der beiden Getränke Alkohol enthalten sonst wird eine Exception geworfen.
  Zusätzlich kann aus einer Auswahl ein Sirup zum Getränk hinzugefügt werden. 
  Auch eine Liste von beispielsweise Aromen, Früchten oder anderen Zutaten können dem Getränk hinzugefügt werden. 
  Das Getränk hat weiters zwei Methoden, es kann sowohl gerührt als auch geschüttelt werden. 
 
