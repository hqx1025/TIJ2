package com.aihqx.thinkinginjava.chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author huqingxiang
 * @descrption Practice2
 * @date 2019-01-30 11:06
 */
public class SortedDirList {
    private File files;
    private String[] filePathStrs;
    public SortedDirList(String path) {
        files = new File(path);
        filePathStrs = files.list();
        Arrays.sort(filePathStrs,String.CASE_INSENSITIVE_ORDER);
    }

    public String[] list(){
        return filePathStrs;
    }
    public String[] list(final String regex){
        //匿名内部类实现FilenameFilter用于筛选需要的文件名
        return files.list(new FilenameFilter() {
            //根据传入的正则表达式规则进行筛选
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                //进行匹配
                return pattern.matcher(name).matches();
            }
        });
    }
}
