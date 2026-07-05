package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CsvReader {
    public static List<String[]> readCsv(String filePath) throws IOException {
        List<String[]> data = new ArrayList<>();

        // BufferedReader: doc du lieu trong file va luu vao bo nho dem (cache)
        // giup viec doc cac dong du lieu duoc nhanh hon
        // di kem try-catch: vua handle happy case, vua handle
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        try (reader) {
            String line;
            boolean isHeader = true;

            //doc lan luot tung dong du lieu -> line cuoi
            while ((line = reader.readLine()) != null) {
                //khong lay header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                // bo qua dong trong
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] values = line.split(",");
                data.add(values);
            }
        }

        return data;
    }

    // Sau khi doc file -> chuan hoa du lieu de phu hop voi testNG
    // 0bject[][]: bang du lieu
    // moi hang -> chay 1 lan test, 1 bo tham so
    // moi cot tuong trung cho tung tham so

    public static Object[][] toDataProviderArray(List<String[]> rows) {
        Object[][] data = new Object[rows.size()][];
        for (int i = 0; i < rows.size(); i++) {
            data[i] = rows.get(i);
        }
        return data;
    }
}
