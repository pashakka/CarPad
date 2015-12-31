package ua.od.pashakka.carpad.data;

/**
 * Units
 */
public class Unit {
    private int _id;
    private String _name;

    public Unit() {
    }

    public Unit(int id, String name) {
        _id = id;
        _name = name;
    }

    @Override
    public String toString() {
        return _name;
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
     * Name of unit
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
