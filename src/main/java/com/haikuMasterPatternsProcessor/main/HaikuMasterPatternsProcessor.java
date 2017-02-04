package com.haikuMasterPatternsProcessor.main;

import com.haikuMasterPatternsProcessor.database.TrainingDataDatabaseAccessor;
import com.haikuMasterPatternsProcessor.tagger.PosTagger;
import com.haikuMasterPatternsProcessor.tagger.PosTaggerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Oliver on 2/4/2017.
 */
public class HaikuMasterPatternsProcessor {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        TrainingDataDatabaseAccessor trainingDataDatabaseAccessor = (TrainingDataDatabaseAccessor) context.getBean("trainingDataDatabaseAccessor");
        PosTagger posTagger = new PosTaggerImpl();

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Oliver\\Documents\\NlpTrainingData\\HaikuPatterns.txt"));
        String trainingDataRowAsString = br.readLine();
        String haiku = "";
        while (trainingDataRowAsString != null) {
            if (!"".equals(trainingDataRowAsString)) {
                haiku += trainingDataRowAsString;
                haiku += " ";
            } else {
                String taggedHaiku = posTagger.tag(haiku);
                trainingDataDatabaseAccessor.insertPattern(taggedHaiku);
                System.out.println(haiku);
                haiku = "";
            }
            trainingDataRowAsString = br.readLine();
        }
    }


}