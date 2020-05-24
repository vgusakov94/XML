package com.gusakov.xml.parser;

import com.gusakov.xml.parser.dom.DOMParser;
import com.gusakov.xml.parser.sax.SAXDeviceParser;
import com.gusakov.xml.parser.stax.STAXParser;

public class ParserBuider {

    public enum TypeParser {
        DOM,
        SAX,
        STAX
    }

    public AbstractParser createDeviseParser(String typeParser) {
        AbstractParser abstractParser = null;
        TypeParser type = TypeParser.valueOf(typeParser.toUpperCase());
        switch (type) {
            case DOM:
                abstractParser = DOMParser.getInstance();
                break;
            case SAX:
                abstractParser = SAXDeviceParser.getInstance();
                break;
            case STAX:
                abstractParser = STAXParser.getInstance();
                break;
        }
        return abstractParser;
    }
}
