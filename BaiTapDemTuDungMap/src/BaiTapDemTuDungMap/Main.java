package BaiTapDemTuDungMap;

import com.sun.source.tree.Tree;
import org.w3c.dom.ls.LSOutput;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String vanBan = "Good morning sunshine good day";
        String[] vanBanSauTach = vanBan.split(" ");
        Map< String,Integer> wordMap = new TreeMap<>();
        for (Integer i = 0; i < vanBanSauTach.length; i++) {
            if(wordMap.containsKey(vanBanSauTach[i].toLowerCase())){
                wordMap.put(vanBanSauTach[i].toLowerCase(),wordMap.get(vanBanSauTach[i].toLowerCase())+1);

            }
            else wordMap.put(vanBanSauTach[i].toLowerCase(),1);
            System.out.println(vanBanSauTach[i].toLowerCase());
        }
        System.out.println(vanBanSauTach.length);
        System.out.println(wordMap);
    }
}

