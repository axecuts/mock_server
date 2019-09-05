package com.example.test.Folderstat;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FolderStats {
    int totalFolder = 0;
    int totalFile = 0;
    List<String> folderlist=new ArrayList<String>();
    private static String path="";
    public FolderStats(){
    }
    public static FolderStats check(String pathname){
        FolderStats size =null;
        try {
            size = new FolderStats();
            long fileSizeByte = size.getFileSize(new File(pathname));
            System.out.println("Folder Size: " + fileSizeByte + " Bytes");
            System.out.println("Total Number of Folders: "+ size.getTotalFolder());
            System.out.println("Total Number of Files: " + size.getTotalFile());
        } catch (Exception e) {}
        return size;
    }
    public long getFileSize(File folder) {
        totalFolder++;
        List<String> list = new ArrayList<>();
        list.add(folder.getName());
        System.out.println("Folder: " + folder.getName());
        long foldersize = 0;
        File[] filelist = folder.listFiles();
        for (int i = 0; i < filelist.length; i++) {
            if (filelist[i].isDirectory()) {
                foldersize += getFileSize(filelist[i]);
            } else {
                totalFile++;
                foldersize += filelist[i].length();
            }
        }
        return foldersize;
    }

    public int getTotalFolder() {
        return totalFolder;
    }

    public int getTotalFile() {
        return totalFile;
    }

    }
