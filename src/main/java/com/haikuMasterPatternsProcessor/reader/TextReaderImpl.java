package com.haikuMasterPatternsProcessor.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Oliver on 2/5/2017.
 */
public class TextReaderImpl implements TextReader {

    @Override
    public List<String> read() {
        List<String> haikus = null;
        String wholeText = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\Oliver\\Documents\\NlpTrainingData\\HaikuPatterns.txt"));
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String haikuTrainingDataRow = br.readLine();
            while (haikuTrainingDataRow != null) {
                if(!"".equals(haikuTrainingDataRow)){
                    wholeText += haikuTrainingDataRow;
                    wholeText += "@";
                    System.out.println(haikuTrainingDataRow);
                }
                haikuTrainingDataRow = br.readLine();
            }
            haikus = Arrays.asList(wholeText.split("######"));

        } catch (final IOException e) {
            e.printStackTrace();

        }
        return haikus;
    }

}
