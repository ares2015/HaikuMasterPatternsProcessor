package com.haikuMasterPatternsProcessor.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Oliver on 3/13/2017.
 */
public class HaikuPatternsWriterImpl implements HaikuPatternsWriter {

    private BufferedWriter bw = null;

    private FileWriter fw = null;

    private final String FILENAME = "C:\\Users\\Oliver\\Documents\\NlpTrainingData\\HaikuMasterTrainingData\\HaikuPatterns.txt";


    @Override
    public void write(List<String> patterns) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILENAME, true);
            bw = new BufferedWriter(fw);
            for (String pattern : patterns) {
                bw.write(pattern);
                bw.newLine();
            }
            System.out.println("Writing into file finished");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }


}