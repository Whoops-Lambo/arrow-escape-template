package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class Ld {
    private final ArrayList<String> a = new ArrayList<>();
    private final ArrayList<String> b = new ArrayList<>();
    private final ArrayList<String> c = new ArrayList<>();
    private final ArrayList<String> d = new ArrayList<>();

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.c.add(str);
        }
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.b.add(str);
        }
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.d.add(str);
        }
    }

    public void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a.add(str);
        }
    }

    public ArrayList<String> a() {
        return this.c;
    }

    public ArrayList<String> b() {
        return this.b;
    }

    public ArrayList<String> c() {
        return this.d;
    }

    public ArrayList<String> d() {
        return this.a;
    }
}
