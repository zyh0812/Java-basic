package com.zyh.stringbuilder;

import java.util.StringJoiner;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");

        sj.add("aaa").add("bbb").add("bbb");

        System.out.println(sj);
    }
}
