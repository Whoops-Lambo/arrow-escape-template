package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class O1 {
    private String c;
    private String d;
    private int f;
    private HashSet<String> b = new HashSet<>();
    private boolean a = false;
    private boolean e = false;
    private boolean g = true;

    public HashSet<String> b() {
        return this.b;
    }

    public void c(String str) {
        this.c = str;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.a;
    }

    public boolean g() {
        return this.g;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.b.add(str);
        }
    }

    public void b(String str) {
        this.d = str;
    }

    public String c() {
        return this.d;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(boolean z) {
        this.e = z;
    }

    public void a(boolean z) {
        this.a = z;
    }

    public int a() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }
}
