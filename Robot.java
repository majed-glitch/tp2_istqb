public class Robot {
    private String nom;
    private int x, y;
    private String direction;

    public Robot(String nom) {
        this.nom = nom;
        this.x = 0;
        this.y = 0;
        this.direction = "Nord";
    }

    public void avance() {
        switch (this.direction) {
            case "Nord": this.y++; break;  
            case "Est": this.x++; break;
            case "Sud": this.y--; break;
            case "Ouest": this.x--; break;
        }
    }

    public void droite() {
        switch (direction) {
            case "Nord": direction = "Est"; break;
            case "Est": direction = "Sud"; break;
            case "Sud": direction = "Ouest"; break;
            case "Ouest": direction = "Nord"; break;
        }
    }

   
    public int getX() { return x; }
    public int getY() { return y; }
    public String getDirection() { return direction; }

    public String getPosition() {
        return "(" + this.x + "," + this.y + ") " + this.direction;
    }
}
