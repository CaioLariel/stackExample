/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

/**
 *
 * @author clima
 */
public class Pilha {

    //atributos
    int elementos[];
    int topo;

    public Pilha(int tamanho) {
        this.elementos = new int[tamanho];
        this.topo = -1; //;position invalid
    }

    public void push(int valor) {
        if (isFull()) {
             throw new RuntimeException("Stack Overflow");
        }
        topo++; // aumenta o topo
            elementos[topo] = valor; //adiciona o valor ao topo
    }

    public int pop() {
        if(isEmpty()){
            throw new RuntimeException("a fila está vazia"); 
        }
        int valorRemovendoTopo;
        valorRemovendoTopo = elementos[topo];
        topo--;
        return valorRemovendoTopo;
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return !(topo == this.elementos.length);
    }

    public int top() {
        return elementos[topo];
    }

}
