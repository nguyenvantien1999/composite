/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedemo;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Folder extends AbstractFile{

    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
    }
    
    ArrayList<AbstractFile> listFile = new ArrayList<>();
    
    @Override
    public void add(AbstractFile abstractFile) {
        if(!listFile.contains(abstractFile)){
            listFile.add(abstractFile);
            abstractFile.path = this.path + "//" + abstractFile.path;
            abstractFile.prefix = this.prefix + "..";
        }
        
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        if(listFile.contains(abstractFile)){
            listFile.remove(abstractFile);
            return;
        }
        else{
            listFile.forEach((f) -> {
                f.remove(abstractFile);
            });
        }
    }

    @Override
    public String getTree() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefix).append(ten).append(ngayTao);
        for(AbstractFile folder : listFile){
            builder.append("\n").append(folder.getTree());
        }
        return builder.toString();
    }
    
}
