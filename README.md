# Übung1
#### Lehrveranstaltung: Konfigurationsmanagment SS2020
 *Dieses Repository enthält alle Dokumente und Dateien die
 für die 1. Übung der Lehrveranstaltun Konfigurationsmanagment im 
 Sommersemesters 2020 notwendig beziehungsweise relevant sind. Zusätzlich
 wird in diesem README-Dokument beschrieben worum es in dem Project
 Drinks geht und wie unsere Gruppe vorhat das vorhandene Projekt zu erweitern.*
 
* #### Beschreibung des Projekts
  Das Hauptprojekt (also ohne die Testautomation) hat 3 Java-Files, nämlich Drink, 
  Liquid und Simple Drink. Im Folgenden werden die Funktionen dieser Files genau beschrieben. 
  
  ##### 1. Drink: 
  Die Klasse Drink ist eine abstrakte Klasse, welche als Vorlage für tatsächliche konkrete Getränke aggiert.
  Dabei hat sie das Attribut _"name"_ und abstrakte Methoden die von abgeleiteten Klassen überschrieben werden können,
   wie getVolume(), getAlcoholPercent() und isAlcoholic().
             
  ##### 2. Liquid:
  Die Klasse Liquid beschreibt Flüssigkeiten mit den Attributen _"name", "volume"_ und _"alcoholPercent"_, welche 
  in den tatsächlichen Getränken verwendet werden können. Die Klasse hat neben den Methoden
  getVolume() und getAlcoholPercent() natürlich auch die Getter und Setter für die jeweiligen Attribute.
  
  ##### 3. SimpleDrink
  Die Klasse SimpleDrink ist von der Klasse Drink abgeleitet und stellt daher ein tatsächliches Getränk oder 
  eine tatsächliche Flüssigkeit dar, welche wiederum in Getränken verwendet werden kann. Da SimpleDrink eine abgeleitete
  Klasse ist werden die Methoden getVolume(), getAlcoholPercent() und isAlcoholic() überschrieben. 
  Dabei gibt:
    - _getVolume()_: das Volumen des Getränks in Liter zurück.
    - _getAlcoholPercent()_: das berechnete Alkoholvolumen des Getränks in Prozent zurück.
    - _isAlcoholic()_: einen Boolean-Wert zurück, der mir angibt ob alkoholische Flüssigkeiten in diesem Getränk enthalten
    sind.
  
  
- #### Beschreibung der Erweiterung
  ##### 1. MixedDrink:
  Unsere Gruppe hat sich für die Möglichkeit a) entschieden, also von
  Drinks/SimpleDrink   eine   aufwändig   umzusetzende Subklasse   abzuleiten. 
  (Verwendung   einer   Collection). Dabei haben wir uns dazu entschieden ein Mischgetränk zu implementieren,
  welches eine Ableitung der Klasse Drinks darstellt (Klasse MixedDrink). Das Getränk hat einen Namen und enthält zwei Flüssigkeiten, 
  allerdings darf nur höchstens eines der beiden Flüssigkeiten Alkohol enthalten sonst wird eine Exception geworfen.
  Zusätzlich kann aus einer Auswahl aus Sirupen gewählt werden. Dieser wird jedoch nicht zum Volumen des Getränkes hinzugefügt, da sich die Menge des Sirups je nach Getränk ändern kann. 
  Darüber hinaus können noch weitere Zutaten, beispielsweise Aromen oder Früchte zu dem Getränk hinzugefügt werden. 
  Das Getränk hat weiters zwei Methoden, es kann sowohl gerührt als auch geschüttelt werden.
  Natürlich gibt es auch in dieser Klasse alle notwendigen getter und setter.

  Folgend sehen Sie einen Ausschnitt aus unserer Klasse MixedDrink:

  ```java
  MixedDrink(String name, Liquid l1, Liquid l2, Syrup syrup, List<String> otherIngredients) throws AlcoholicSubstanceException {
        super(name);
        if (liquidsAlcoholic(l1, l2) == false) {
            this.l1 = l1;
            this.l2 = l2;
        } else {
            throw new AlcoholicSubstanceException();
        }
        this.otherIngredients = otherIngredients;
        this.syrup = syrup;
    }
  ```

  Es wurden mehrere Konstruktoren implementiert, da sich nicht in jedem Mischgetränk ein Sirup oder eine weitere Zutat befindet. <br> Insgesamt gibt es 5 Konstruktoren, folgend sehen Sie die jeweiligen Signaturen:
  * public MixedDrink(String name)
  * MixedDrink(String name, Liquid l1, Liquid l2) throws AlcoholicSubstanceException
  * MixedDrink(String name, Liquid l1, Liquid l2, Syrup syrup) throws AlcoholicSubstanceException
  * MixedDrink(String name, Liquid l1, Liquid l2, List<String> otherIngredients) throws AlcoholicSubstanceException
  * MixedDrink(String name, Liquid l1, Liquid l2, Syrup syrup, List<String> otherIngredients) throws AlcoholicSubstanceException

  Wie man sehen kann, ist es also möglich sich sein Mischgetränk auf verschiedenste Wege zusammenzustellen.

  ##### 2. MixedDrinkTest:
  Dies ist die dazugehörige Test-Klasse zu MixedDrink. Es wurde darauf geachtet, dass wirklich jede Methode durchgetestet wird um eine 100%ige Testabdeckung zu erreichen.
  Zu Beginn, im Setup wurden 5 Liquids und in weiterer Folge 5 MixedDrinks erstellt, um danach die Konstruktoren, getter, setter und zusätzliche Methoden gut testen zu können.
  Hier sehen Sie eine der Test Methoden:
  ```java
   /**
     * test the second constructor (name, two liquids)
     */
    @Test
    @DisplayName("Testing the second constructor")
    public void testConstructorTwo() {
        assertEquals("Spritzer", mx2.getName());
        assertEquals(6.5, mx2.getAlcoholPercent(), 0.001);
        assertEquals(0.425, mx2.getVolume(), 0.001);
    }
  ```

  Im speziellen wird getestet, ob beim Erstellen eines MixedDrinks mit dem zweiten Konstruktor *name* richtig gespeichert wird. 
  Ebenso ob die Variablen *alcoholPercent* und *volume* richtig zusammengerechnet und in weiterer Folge richtig gespeichert werden.
  Auch die selbst erstellte Exception *AlcoholicSubstanceException* wurde getestet.

  ##### 3. AlcoholicSubstanceException:
  Dies ist die dazugehörige Klasse zur Exception AlcoholicSubstanceException. Diese wird aufgerufen wenn für ein Mischgetränk zwei alkoholische Flüssigkeiten übergeben werden. 
  Denn laut unserer Definition handelt es sich nur um ein Mischgetränk wenn das Getränk entweder aus zwei nicht-alkoholischen Flüssigkeiten besteht oder höchstens eine alkolhaltige  beinhaltet. 
  Die Klasse ist folgendermaßen aufgebaut:
  ```java
  public class AlcoholicSubstancException extends Throwable {
      public AlcoholicSubstanceException() {
          super("The Definiton of a mixed drink is that it contains not more than one alcoholic liquid. Too many alcoholic liquids here.");
      }
  
      public AlcoholicSubstanceException(String errorMessage, Throwable cause) {
          super(errorMessage, cause);
      }
  }
  ```
  Die Klasse AlcoholicSubstanceException ist eine Ableitung der Throwable-Klasse und spezifiziert den Grund für die Exception (eine detailierte Fehlermeldung).

  ##### 4. SimpleDrinkTest:
  Dies ist die dazugehörige Test-Klasse zu SimpleDrink. Es wurde darauf geachtet, dass wirklich jede Methode durchgetestet wird um eine 100%ige Testabdeckung zu erreichen.
  Zu Beginn, im Setup wurden 2 Liquids und in weiterer Folge 2 SimpleDrinks erstellt, um danach die Konstruktoren gut testen zu können.
  Hier sehen Sie einen der Konstruktorentests:
    
  ```java
          @Test
          @DisplayName("Testing constructor non alcoholic")
          public void testConstructorNonAlcoholic(){
              assertEquals(0, sD1.getAlcoholPercent(), 0.001);
              assertEquals(0.5 , sD1.getVolume(), 0.001);
              assertEquals(false, sD1.isAlcoholic());
      
          }

    ```
  Im speziellen wird getestet, ob beim Erstellen eines SimpleDrink die Variablen *name*, *alcoholPercent* und *volume* richtig gespeichert werden.
  

>