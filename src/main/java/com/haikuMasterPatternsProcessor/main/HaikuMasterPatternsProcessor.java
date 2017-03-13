package com.haikuMasterPatternsProcessor.main;

import com.haikuMasterPatternsProcessor.reader.TextReader;
import com.haikuMasterPatternsProcessor.reader.TextReaderImpl;
import com.haikuMasterPatternsProcessor.tagger.PosTagger;
import com.haikuMasterPatternsProcessor.tagger.PosTaggerImpl;
import com.haikuMasterPatternsProcessor.writer.HaikuPatternsWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oliver on 2/4/2017.
 */
public class HaikuMasterPatternsProcessor {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HaikuPatternsWriter haikuPatternsWriter = (HaikuPatternsWriter) context.getBean("haikuPatternsWriter");
        PosTagger posTagger = new PosTaggerImpl();
        TextReader textReader = new TextReaderImpl();
        List<String> haikus = textReader.read();
        List<String> taggedHaikus = new ArrayList<>();
        for (String haiku : haikus) {
            String taggedHaiku = posTagger.tag(haiku);
            taggedHaikus.add(taggedHaiku);
            System.out.println(haiku + " ----> " + taggedHaiku);
        }
        haikuPatternsWriter.write(taggedHaikus);

    }


}