package com.haikuMasterPatternsProcessor.tagger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oliver on 2/5/2017.
 */
public class ConstantWordsModel {

    public static Map<String, String> constantWordsModelMap = new HashMap<String, String>();

    static {
        constantWordsModelMap.put("with", Tags.PREPOSITION);
        constantWordsModelMap.put("from", Tags.PREPOSITION);
        constantWordsModelMap.put("without", Tags.PREPOSITION);
        constantWordsModelMap.put("within", Tags.PREPOSITION);
        constantWordsModelMap.put("into", Tags.PREPOSITION);
        constantWordsModelMap.put("in", Tags.PREPOSITION);
        constantWordsModelMap.put("on", Tags.PREPOSITION);
        constantWordsModelMap.put("at", Tags.PREPOSITION);
        constantWordsModelMap.put("by", Tags.PREPOSITION);
        constantWordsModelMap.put("of", Tags.PREPOSITION);
        constantWordsModelMap.put("throughout", Tags.PREPOSITION);
        constantWordsModelMap.put("as", Tags.PREPOSITION);
        constantWordsModelMap.put("about", Tags.PREPOSITION);
        constantWordsModelMap.put("over", Tags.PREPOSITION);
        constantWordsModelMap.put("for", Tags.PREPOSITION);
        constantWordsModelMap.put("since", Tags.PREPOSITION);
        constantWordsModelMap.put("til", Tags.PREPOSITION);
        constantWordsModelMap.put("till", Tags.PREPOSITION);
        constantWordsModelMap.put("until", Tags.PREPOSITION);
        constantWordsModelMap.put("ago", Tags.PREPOSITION);
        constantWordsModelMap.put("before", Tags.PREPOSITION);
        constantWordsModelMap.put("after", Tags.PREPOSITION);
        constantWordsModelMap.put("against", Tags.PREPOSITION);
        constantWordsModelMap.put("between", Tags.PREPOSITION);
        constantWordsModelMap.put("amongst", Tags.PREPOSITION);
        constantWordsModelMap.put("than", Tags.PREPOSITION);
        constantWordsModelMap.put("across", Tags.PREPOSITION);

        constantWordsModelMap.put("and", Tags.AND_OR);
        constantWordsModelMap.put("or", Tags.AND_OR);

        constantWordsModelMap.put("but", Tags.CONJUNCTION);
        constantWordsModelMap.put("yet", Tags.CONJUNCTION);
        constantWordsModelMap.put("so", Tags.CONJUNCTION);
        constantWordsModelMap.put("although", Tags.CONJUNCTION);
        constantWordsModelMap.put("though", Tags.CONJUNCTION);
        constantWordsModelMap.put("because", Tags.CONJUNCTION);
        constantWordsModelMap.put("unless", Tags.CONJUNCTION);
        constantWordsModelMap.put("rather", Tags.CONJUNCTION);
        constantWordsModelMap.put("than", Tags.CONJUNCTION);
        constantWordsModelMap.put("while", Tags.CONJUNCTION);
        constantWordsModelMap.put("if", Tags.CONJUNCTION);
        constantWordsModelMap.put("else", Tags.CONJUNCTION);

        constantWordsModelMap.put("then", Tags.ADVERB);
        constantWordsModelMap.put("outside", Tags.ADVERB);
        constantWordsModelMap.put("inside", Tags.ADVERB);
        constantWordsModelMap.put("also", Tags.ADVERB);
        constantWordsModelMap.put("too", Tags.ADVERB);

        constantWordsModelMap.put("is", Tags.IS_ARE);
        constantWordsModelMap.put("are", Tags.IS_ARE);
        constantWordsModelMap.put("was", Tags.IS_ARE);
        constantWordsModelMap.put("were", Tags.IS_ARE);
        constantWordsModelMap.put("be", Tags.IS_ARE);
        constantWordsModelMap.put("been", Tags.IS_ARE);
        constantWordsModelMap.put("being", Tags.IS_ARE);

        constantWordsModelMap.put("to", Tags.TO);

        constantWordsModelMap.put("not", Tags.NOT);

        constantWordsModelMap.put("a", Tags.DETERMINER);
        constantWordsModelMap.put("an", Tags.DETERMINER);
        constantWordsModelMap.put("the", Tags.DETERMINER);

        constantWordsModelMap.put("might", Tags.MODAL_VERB);
        constantWordsModelMap.put("should", Tags.MODAL_VERB);
        constantWordsModelMap.put("shouldn't", Tags.MODAL_VERB);
        constantWordsModelMap.put("would", Tags.MODAL_VERB);
        constantWordsModelMap.put("wouldn't", Tags.MODAL_VERB);
        constantWordsModelMap.put("must", Tags.MODAL_VERB);
        constantWordsModelMap.put("can", Tags.MODAL_VERB);
        constantWordsModelMap.put("can't", Tags.MODAL_VERB);
        constantWordsModelMap.put("could", Tags.MODAL_VERB);
        constantWordsModelMap.put("couldn't", Tags.MODAL_VERB);

        constantWordsModelMap.put("all", Tags.QUANTIFIER);
        constantWordsModelMap.put("both", Tags.QUANTIFIER);
        constantWordsModelMap.put("half", Tags.QUANTIFIER);
        constantWordsModelMap.put("some", Tags.QUANTIFIER);
        constantWordsModelMap.put("any", Tags.QUANTIFIER);
        constantWordsModelMap.put("many", Tags.QUANTIFIER);
        constantWordsModelMap.put("most", Tags.QUANTIFIER);
        constantWordsModelMap.put("lot", Tags.QUANTIFIER);
        constantWordsModelMap.put("plenty", Tags.QUANTIFIER);
        constantWordsModelMap.put("each", Tags.QUANTIFIER);
        constantWordsModelMap.put("every", Tags.QUANTIFIER);
        constantWordsModelMap.put("more", Tags.QUANTIFIER);
        constantWordsModelMap.put("less", Tags.QUANTIFIER);
        constantWordsModelMap.put("least", Tags.QUANTIFIER);
        constantWordsModelMap.put("several", Tags.QUANTIFIER);
        constantWordsModelMap.put("much", Tags.QUANTIFIER);
        constantWordsModelMap.put("few", Tags.QUANTIFIER);


        constantWordsModelMap.put("have", Tags.HAVE);
        constantWordsModelMap.put("has", Tags.HAVE);
        constantWordsModelMap.put("had", Tags.HAVE);

        constantWordsModelMap.put("I", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("I've", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("I'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("you", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("you've", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("you'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("he", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("he's", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("he'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("she", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("she's", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("she'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("we", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("we've", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("we'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("they", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("they've", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("they'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("us", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("hers", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("herself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("him", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("himself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("hisself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("it", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("itself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("me", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("myself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("oneself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("ourselves", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("ownself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("self", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("them", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("themselves", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("ourselves", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("her", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("his", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("my", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("mine", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("our", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("ours", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("their", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("your", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("yours", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("its", Tags.PRONOUN_POSSESIVE);

        constantWordsModelMap.put("what", Tags.WH_DETERMINER);
        constantWordsModelMap.put("which", Tags.WH_DETERMINER);
        constantWordsModelMap.put("who", Tags.WH_DETERMINER);
        constantWordsModelMap.put("whatever", Tags.WH_DETERMINER);
        constantWordsModelMap.put("whichever", Tags.WH_DETERMINER);
        constantWordsModelMap.put("whoever", Tags.WH_DETERMINER);
        constantWordsModelMap.put("who", Tags.WH_DETERMINER);

        constantWordsModelMap.put("whose", Tags.WH_PRONOUN_POSSESSIVE);

        constantWordsModelMap.put("that", Tags.WH_PRONOUN);
        constantWordsModelMap.put("this", Tags.WH_PRONOUN);
        constantWordsModelMap.put("those", Tags.WH_PRONOUN);
        constantWordsModelMap.put("these", Tags.WH_PRONOUN);

        constantWordsModelMap.put("how", Tags.WH_ADVERB);
        constantWordsModelMap.put("however", Tags.WH_ADVERB);
        constantWordsModelMap.put("whence", Tags.WH_ADVERB);
        constantWordsModelMap.put("when", Tags.WH_ADVERB);
        constantWordsModelMap.put("whenever", Tags.WH_ADVERB);
        constantWordsModelMap.put("where", Tags.WH_ADVERB);
        constantWordsModelMap.put("whereby", Tags.WH_ADVERB);
        constantWordsModelMap.put("wherever", Tags.WH_ADVERB);
        constantWordsModelMap.put("wherein", Tags.WH_ADVERB);
        constantWordsModelMap.put("whereof", Tags.WH_ADVERB);
        constantWordsModelMap.put("why", Tags.WH_ADVERB);

        constantWordsModelMap.put("there", Tags.THERE);
        constantWordsModelMap.put("there's", Tags.THERE);
        constantWordsModelMap.put("there're", Tags.THERE);

        constantWordsModelMap.put("here", Tags.HERE);
        constantWordsModelMap.put("here's", Tags.HERE);
        constantWordsModelMap.put("here're", Tags.HERE);

        constantWordsModelMap.put("do", Tags.DO);
        constantWordsModelMap.put("does", Tags.DO);
        constantWordsModelMap.put("did", Tags.DO);
        constantWordsModelMap.put("done", Tags.DO);

        constantWordsModelMap.put("don't", Tags.DO);
        constantWordsModelMap.put("doesn't", Tags.DO);
        constantWordsModelMap.put("didn't", Tags.DO);


    }
}