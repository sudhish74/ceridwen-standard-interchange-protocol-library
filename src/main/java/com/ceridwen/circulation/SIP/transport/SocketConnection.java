/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceridwen.circulation.SIP.transport;

import java.net.Socket;

/**
 *
 * @author Matthew.Dovey
 */
public class SocketConnection extends AbstractSocketConnection {

  @Override
  Socket getSocket() throws Exception {
    return new java.net.Socket();
  }
  
}
