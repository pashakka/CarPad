package ua.od.pashakka.carpad.data;

/**
 * Record subtype
 */
public class PadRecSubType {
    private int _id;
    private String _name;

    public PadRecSubType() {
    }

    public PadRecSubType(int id, String name) {
        _id = id;
        _name = name;
    }

    @Override
    public String toString() {
        return _id + ": " + _name;
    }

    /**
     * id
     *
     * @return
     */
    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    /**
     * Name of subtype
     *
     * @return
     */
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
