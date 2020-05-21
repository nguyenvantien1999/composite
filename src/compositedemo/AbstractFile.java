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
public abstract class AbstractFile {
    String ten, ngayTao, path;
    String prefix = "";
    public AbstractFile(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.path = ten;
    }
    abstract public void add(AbstractFile abstractFile);
    abstract public void remove(AbstractFile abstractFile);
    abstract public String getTree();

    public String getTen() {
        return ten;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public String getPath() {
        return path;
    }
    
}
