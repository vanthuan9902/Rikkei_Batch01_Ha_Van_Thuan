package Demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SachDao {
    private static final String SANPHAMSACH_FILE_NAME = "sach.txt";

    public void write(List<SanPhamSach> sanPhamSachList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(SANPHAMSACH_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(sanPhamSachList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    public List<SanPhamSach> read() {
        List<SanPhamSach> sanPhamSachList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(SANPHAMSACH_FILE_NAME));
            ois = new ObjectInputStream(fis);
            sanPhamSachList = (List<SanPhamSach>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return sanPhamSachList;
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
