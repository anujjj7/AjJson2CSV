package main.java.org.jsontocsv;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.BasicConfigurator;

import main.java.org.jsontocsv.parser.JSONFlattener;
import main.java.org.jsontocsv.writer.CSVWriter;

public class Main {

    public static void main(String[] args) throws Exception {
    	
    	BasicConfigurator.configure();

        List<Map<String, String>> flatJson;

        flatJson = JSONFlattener.parseJson(new File("files/CP_RAW_DATA1.json"), "UTF-8");
        
        CSVWriter.writeToFile(CSVWriter.getCSV(flatJson, ","), "files/OutputCsv.csv");
        
        System.out.println("Completed!");
    }
}
