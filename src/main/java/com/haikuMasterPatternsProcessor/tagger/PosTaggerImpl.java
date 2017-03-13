package com.haikuMasterPatternsProcessor.tagger;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

import java.util.Properties;

/**
 * Created by Oliver on 2/4/2017.
 */
public class PosTaggerImpl implements PosTagger {

    private Properties props;

    private StanfordCoreNLP pipeline;

    public PosTaggerImpl() {
        props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, pos");
        pipeline = new StanfordCoreNLP(props);
    }

    public String tag(String haiku) {
        StringBuilder taggedPattern = new StringBuilder();
        String[] splitHaiku = haiku.split("@");
        for (String haikuSentence : splitHaiku) {
            Annotation annotation = new Annotation(haikuSentence);
            pipeline.annotate(annotation);
            if (annotation.get(CoreAnnotations.SentencesAnnotation.class).size() > 0) {
                CoreMap processedSentence = annotation.get(CoreAnnotations.SentencesAnnotation.class).get(0);
                for (CoreLabel token : processedSentence.get(CoreAnnotations.TokensAnnotation.class)) {
                    String word = token.get(CoreAnnotations.TextAnnotation.class);
                    String tag = token.get(CoreAnnotations.PartOfSpeechAnnotation.class);
                    if (ConstantWordsModel.constantWordsModelMap.containsKey(word)) {
                        taggedPattern.append(word);
                        taggedPattern.append(" ");
                    } else {
                        if (TagsCache.tags.contains(tag)) {
                            taggedPattern.append(TagsCache.tagsConversionMap.get(tag));
                            taggedPattern.append(" ");
                        } else {
                            taggedPattern.append(word);
                            taggedPattern.append(" ");
                        }
                    }
                }
            }
            taggedPattern.append("@");
        }
        return taggedPattern.toString();
    }
}

