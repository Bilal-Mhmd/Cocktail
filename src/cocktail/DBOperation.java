package cocktail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bilal
 */
public class DBOperation {

    public int insertObjectsData(ArrayList<Object> ss) {
        Connection con = DataBase.getDBCon();

        int value = 0;
        try {
            PreparedStatement pds = con.prepareStatement("insert Objects values");

            int i = 0;
            for (Object o : ss) {
                i++;
                if (o instanceof Blender) {
                    Blender b = (Blender) o;
                    pds.setString(i, b.getInfo());

                } else if (o instanceof Fruits) {
                    Fruits f = (Fruits) o;
                    pds.setString(i, f.getInfo());
                } else if (o instanceof Milk) {
                    Milk m = (Milk) o;
                    pds.setString(i, m.getInfo());
                } else if (o instanceof Sugar) {
                    Sugar s = (Sugar) o;
                    pds.setString(i, s.getInfo());
                } else if (o instanceof Cup) {
                    Cup c = (Cup) o;
                    pds.setString(i, c.getInfo());
                }

            }
            value = pds.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return value;
    }

}
