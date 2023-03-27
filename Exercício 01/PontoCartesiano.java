public class PontoCartesiano {
    private double xA;
    private double yA;
    private double xB;
    private double yB;
    
    public PontoCartesiano(double xA, double yA, double xB, double yB) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
    }

    /**
     * @return double return the xA
     */
    public double getXA() {
        return xA;
    }

    /**
     * @param xA the xA to set
     */
    public void setXA(double xA) {
        this.xA = xA;
    }

    /**
     * @return double return the yA
     */
    public double getYA() {
        return yA;
    }

    /**
     * @param yA the yA to set
     */
    public void setYA(double yA) {
        this.yA = yA;
    }

    /**
     * @return double return the xB
     */
    public double getXB() {
        return xB;
    }

    /**
     * @param xB the xB to set
     */
    public void setXB(double xB) {
        this.xB = xB;
    }

    /**
     * @return double return the yB
     */
    public double getYB() {
        return yB;
    }

    /**
     * @param yB the yB to set
     */
    public void setYB(double yB) {
        this.yB = yB;
    }

    public double calcularDistanciaEuclidiana (){
        return Math.sqrt(Math.pow((getXB() - getXA()),2) + Math.pow((getYB() - getYA()),2));
    }
}