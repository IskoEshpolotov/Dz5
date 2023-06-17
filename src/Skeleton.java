public class Skeleton extends Boss {
    private int arrow;

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    public String info() {
        return super.info() + "\nARROW " + getArrow();
    }
}
