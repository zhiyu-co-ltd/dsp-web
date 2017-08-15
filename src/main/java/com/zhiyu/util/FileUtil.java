package com.zhiyu.util;

/**
 * Created by zhaojianfan on 17/8/10.
 */

import java.io.*;

public class FileUtil {


    public  void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }

    public static void main(String[] args) {

        FileUtil fileUtil = new FileUtil();
        //fileUtil.uploadFile();


    }

}
