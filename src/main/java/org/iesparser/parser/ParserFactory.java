/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesparser.parser;

import java.io.IOException;

/**
 * Abstrakcyjna fabryka parserów. Hurr.
 *
 * @author mateusz
 */
public interface ParserFactory {

    /**
     * Tworzy parser.
     *
     * @param filename nazwa pliku
     * @return parser
     */
    public Parser newParser(String filename) throws IOException;
}
