package com;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class JavaAssignment11 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("\\C:\\Users\\Keerthi\\Desktop\\textFile.txt");
            int ch;
            HashMap<Character,Integer> count= new HashMap<>() ;
            while ((ch=fr.read())!=-1)
            {
                if(count.containsKey((char)ch))
                {
                    count.put((char)ch,count.get((char)ch)+1);
                }
                else
                    count.put((char)ch,1);
            }
            fr.close();

            FileWriter newFile=new FileWriter("\\C:\\Users\\Keerthi\\Desktop\\counterFile.txt");
            BufferedWriter bw=new BufferedWriter(newFile);

            for(char c: count.keySet())
            {
                String content=c+" "+count.get(c)+"\n";
                bw.write(content);

            }
            bw.close();
            newFile.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
