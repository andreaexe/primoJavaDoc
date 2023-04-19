/**
 * la classe rappresenta e gestisce dati di tipo temporale
 */

public class time {

    protected int minuti;
    protected int ore;
    protected int secondi;

    /**
     * costruisce un oggetto time dato in ingresso il numero di secondi
     * 
     * @param secondi numero di secondi nell' oggetto time
     */
    public time(int secondi) {

        this.secondi = secondi;
    }

    /**
     * costruisce un oggetto time danto in ingresso ore minuti e secondi
     * 
     * @param ore     numero di ore nell oggetto time
     * @param minuti  numero di minuti nell oggetto time
     * @param secondi numero di secondi dell'oggetto time
     */
    public time(int ore, int minuti, int secondi) {

        this.secondi = secondi;
        this.minuti = minuti;
        this.ore = ore;
    }

    /**
     * vengono addizionati il numero di secondi specificati
     * 
     * @param secondi numero di secondi da aggiungere
     */

    public void addSecondi(int secondi) {

        if (secondi > 60 && secondi < 3600) {

            this.minuti = this.minuti + secondi / 60;

        } else if (secondi > 3600) {

            // this.ore=this.minuti+
        }

        this.secondi = this.secondi + secondi;
    }

    /**
     * esprime le ore i minuti e i secondi dell' oggetto time in secondi
     * 
     * @return il numero totale dei secondi
     */
    public int convertiSecondi() {

        return this.ore * 3600 + this.minuti * 60 + this.secondi * 1;

    }

    /**
     * restituisce una stringa che rappresenta l' oggetto
     * 
     * @return rappresentazione testuale dell' oggetto Time {ore:minuti:secondi}
     */
    public String toString() {

        String s = " ";
        s = "secondi: " + this.secondi + "minuti: " + this.minuti + "ore: " + this.ore;

        return s;
    }

}
