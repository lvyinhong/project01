package com.llvvllvv.idea;

import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

/**
 * @author llvvlv00
 * @date 2021/02/20 11:49 上午
 * @since
 */
public class TemplatesTest {
    // 模版1: main
    public static void main(String[] args) {
        // 模版2: sout
        System.out.println("Hello World");
        // 变形:soutp/soutm/soutv/xxx.sout
        System.out.println("hello world");

        // 模版3:
        String[] arr = new String[]{"Tom", "Jerry", "Hanmeimei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 变形: iter
        for (String s : arr) {
            System.out.println(s);
        }
        // 变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
        System.out.println("===================");
        // 模版4: list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        for (Object o : list) {
            System.out.println(o);
        }

        // 变形 list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 变形 list.forr 倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        // 模版5: ifn
        if (list == null) {
            System.out.println("list is null");
        }

        // 变形 inn: if not null
        if (list != null) {

        }

        // 变形 xxx.nn/ xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }

    // 模版6 prsf: 可生成 private static final
    private static final int test = 0  ;

    // 变形 psf
    public static final int test2 = 0;

    // 变形 psfi
    public static final int test3 = 0;

    // 变形 psfs
    public static final String test4 = "china";

    public static void testOne(int in) {
        ArrayList<Integer> m = m(false);
    }

    public static ArrayList<Integer> m(boolean b) {
        return new ArrayList<>();
    }

}
