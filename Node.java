/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

/**
 *
 * @author hieupc
 */
public class Node {
    String title; 
    Node next;    
    Node(String title) {
        this.title = title; 
        this.next = null;   
    }
}
