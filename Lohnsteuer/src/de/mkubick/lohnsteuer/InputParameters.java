package de.mkubick.lohnsteuer;

public class InputParameters {
	
	private int AF = 0; /*Muss = 1 sein, wenn das Faktorverfahren gewählt wurde (nur in Steuerklasse IV)*/
	private int AJAHR = 0; /*Auf die Vollendung des 64. Lebensjahres folgendes Kalenderjahr (erforderlich, wenn ALTER1=1)*/
	private int ALTER1 = 0; /*1, wenn das 64. lebensjahre vor Beginn des Kalenderjahres vollendet wurde, in dem der Lohnzahlungszeitraum endet
	 				(§24a ESTG), sonst=0*/
	private int ENTSCH = 0; /*In VKAPA und VMT enthaltene Entschädigungen nach §24 Nummer 1 EstG in Cent*/
	private float F = 1.0f; /*Eingetragener Faktor mit drei Nachkommastellen*/

}
