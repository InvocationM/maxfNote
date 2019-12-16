package max_12_6;

/**
 * 描述:
 * ----通话详单
 *
 * @author Administrator
 * @create 2019-12-03 17:15
 */
public class CallDetail {


    private String call_no;
    private String destination;
    private String duration;
    private int anInt ;

    public CallDetail(String call_no, String destination, String duration) {
        this.call_no = call_no;
        this.destination = destination;
        this.duration = duration;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getCall_no() {
        return call_no;
    }

    public void setCall_no(String call_no) {
        this.call_no = call_no;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}