package utiliy;

import baseApi.Base;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Criminal on 4/25/15.
 */
public class DataReader extends Base{
    int numberofrows,numberofCol;
    public String [][] fileReader(String path) throws IOException {

        File file = new File(path);
        String [] [] data = {};
        FileInputStream fis =new FileInputStream(file);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheetAt(0);
        numberofrows = sheet.getLastRowNum();
        numberofCol = sheet.getRow(0).getLastCellNum();
        data = new String[numberofrows+1][numberofCol+1];

        for (int i=1;i<data.length;i++){
            HSSFRow rows = sheet.getRow(i);
            for (int j=0;j<numberofCol;j++){
                HSSFCell cell = rows.getCell(j);
                String cellData = cell.getStringCellValue();
                System.out.print(cellData);
                data[i][j]=cellData;



            }

        }
        return data;
    }
    public String getCellValue (HSSFCell cell) {
        Double value;
        int dataType = cell.getCellType();
        switch (dataType){
            case HSSFCell.CELL_TYPE_NUMERIC:
                value = cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_STRING:
                value = cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN:

        }
        return value;

    }
}

