/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brunobs.bswvendas.suporte.exception;

/**
 *
 * @author Bruno
 */
public class BsException extends Exception {

    protected String msg;

    public BsException(String msg) {
        super(msg);
        this.msg = msg;

    }
}
