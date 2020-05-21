/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedemo;

/**
 *
 * @author admin
 */
public class CompositeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFile item = new Folder("Data", "19/05/2020");
        AbstractFile folder1 = new Folder("Toan", "19/05/2020");
        item.add(folder1);
        AbstractFile folder1_1 = new Folder("Dai So", "19/05/2020");
        AbstractFile folder1_2 = new Folder("Giai tich", "19/05/2020");
        folder1.add(folder1_1);
        folder1.add(folder1_2);
        System.out.println(item.getTree());
    }
    
}
