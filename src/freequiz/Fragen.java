/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freequiz;

/**
 *
 * @author dmusiolik
 */
public class Fragen {
    
    public static String[][][][][][] fragen = new String[5][1][1][1][1][1];
    
    public Fragen() {
        //Frage 1
        fragen[0][0][0][0][0][0] = "Was ist die Landeshauptstadt von Nordrhein-Westfalen?";
        //Antwort 1
        fragen[0][1][0][0][0][0] = "Bonn";
        //Antwort 2
        fragen[0][0][1][0][0][0] = "Köln";
        //Antwort 3
        fragen[0][0][0][1][0][0] = "Düsseldorf";
        //Antwort 4
        fragen[0][0][0][0][1][0] = "Dortmund";
        //Richtige Antwort
        fragen[0][0][0][0][0][1] = "C";
        
        //Frage 2
        fragen[1][0][0][0][0][0] = "Wo ist der Firmensitz von Secure Solutions?";
        //Antwort 1
        fragen[1][1][0][0][0][0] = "Düsseldorf";
        //Antwort 2
        fragen[1][0][1][0][0][0] = "Solingen";
        //Antwort 3
        fragen[1][0][0][1][0][0] = "Haan";
        //Antwort 4
        fragen[1][0][0][0][1][0] = "Ratingen";
        //Richtige Antwort
        fragen[0][0][0][0][0][1] = "B";
        
        
        //Frage 3
        fragen[2][0][0][0][0][0] = "In welchem Jahr wurde Secure Solutions gegründet?";
        //Antwort 1
        fragen[2][1][0][0][0][0] = "2009";
        //Antwort 2
        fragen[2][0][1][0][0][0] = "2015";
        //Antwort 3
        fragen[2][0][0][1][0][0] = "2018";
        //Antwort 4
        fragen[2][0][0][0][1][0] = "2019";
        //Richtige Antwort
        fragen[0][0][0][0][0][1] = "C";
        
        //Frage 4
        fragen[3][0][0][0][0][0] = "Welche Pille hat Neo im Film Matrix genommen?";
        //Antwort 1
        fragen[3][1][0][0][0][0] = "Die Blaue";
        //Antwort 2
        fragen[3][0][1][0][0][0] = "Die Rote";
        //Antwort 3
        fragen[3][0][0][1][0][0] = "Die Gelbe";
        //Antwort 4
        fragen[3][0][0][0][1][0] = "Keine";
        //Richtige Antwort
        fragen[0][0][0][0][0][1] = "B";
        
        //Frage 5
        fragen[4][0][0][0][0][0] = "Was ist der Siedepunkt von Stickstoff";
        //Antwort 1
        fragen[4][1][0][0][0][0] = "0°C";
        //Antwort 2
        fragen[4][0][1][0][0][0] = "100°C";
        //Antwort 3
        fragen[4][0][0][1][0][0] = "-100°C";
        //Antwort 4
        fragen[4][0][0][0][1][0] = "-196°Ĉ";
        //Richtige Antwort
        fragen[0][0][0][0][0][1] = "D";
    }
    
}
