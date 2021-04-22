package dai.compiler.syntax;

public abstract class Region {

    private Integer start;

    private Integer end;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

}
