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
public class File extends AbstractFile{

    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public String getTree() {
        return this.prefix + this.ten;
    }

    @Override
    public void add(AbstractFile abstractFile) {
    }

    @Override
    public void remove(AbstractFile abstractFile) {
    }
    
}
