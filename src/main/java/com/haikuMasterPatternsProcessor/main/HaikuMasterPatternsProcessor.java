package com.haikuMasterPatternsProcessor.main;

import com.haikuMasterPatternsProcessor.database.TrainingDataDatabaseAccessor;
import com.haikuMasterPatternsProcessor.reader.TextReader;
import com.haikuMasterPatternsProcessor.reader.TextReaderImpl;
import com.haikuMasterPatternsProcessor.tagger.PosTagger;
import com.haikuMasterPatternsProcessor.tagger.PosTaggerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * Created by Oliver on 2/4/2017.
 */
public class HaikuMasterPatternsProcessor {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        TrainingDataDatabaseAccessor trainingDataDatabaseAccessor = (TrainingDataDatabaseAccessor) context.getBean("trainingDataDatabaseAccessor");
        PosTagger posTagger = new PosTaggerImpl();
        TextReader textReader = new TextReaderImpl();
        List<String> haikus = textReader.read();
        for (String haiku : haikus) {
            String taggedHaiku = posTagger.tag(haiku);
            trainingDataDatabaseAccessor.insertPattern(taggedHaiku);
            System.out.println(haiku + " ----> " + taggedHaiku);
        }
    }


}