package socket.lession19_download;

import java.io.IOException;

/**
 * @project network-programming
 * @user DinhChiThien on 10/21/2019.
 * @student_id 15130173
 * @email 15130173@st.hcmuaf.edu.vn
 **/
public class TestClient {
    public static void main(String[] args) throws IOException {
        String ipAdd = "127.0.0.1";
        int port = 7;
        new Client(ipAdd, port).download();
    }
}
