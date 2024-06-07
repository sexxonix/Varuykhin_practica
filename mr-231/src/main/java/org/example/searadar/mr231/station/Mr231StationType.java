package org.example.searadar.mr231.station;

import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;

import org.example.searadar.mr231.convert.Mr231Converter;

import java.nio.charset.Charset;

public class Mr231StationType {

    private static final String STATION_TYPE = "МР-231";
    private static final String CODEC_NAME = "mr231";


    protected void doInitialize() {
        TextLineCodecFactory textLineCodecFactory = new TextLineCodecFactory(
                Charset.defaultCharset(),
                LineDelimiter.UNIX,
                LineDelimiter.CRLF
        );

    }


    public Mr231Converter createConverter() {
        return new Mr231Converter();
    }
}
