package com.mbridge.msdk.config.component.style.model;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    private String a = "";
    private String b = "";
    private Object c = "";
    private String d = "0";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "0";
    private String i = "";
    private String j = "";
    private String k = "";
    private String l = "0";
    private Object m;
    private float n;

    public String a() {
        return this.a;
    }

    public Object b() {
        return this.c;
    }

    public void c(Object obj) {
        try {
            String strValueOf = String.valueOf(obj);
            if (TextUtils.isEmpty(strValueOf) || strValueOf.equalsIgnoreCase("null")) {
                this.n = 0.5f;
            } else {
                this.n = Float.parseFloat(strValueOf);
            }
        } catch (Throwable unused) {
            this.n = 0.5f;
        }
    }

    public void d(Object obj) {
        this.h = obj == null ? "0" : String.valueOf(obj);
    }

    public void e(Object obj) {
        this.g = obj == null ? "" : String.valueOf(obj);
    }

    public void f(String str) {
        this.l = str;
    }

    public void g(String str) {
        this.b = str;
    }

    public void h(String str) {
        this.f = str;
    }

    public void i(String str) {
        this.e = str;
    }

    public String j() {
        return this.g;
    }

    public String k() {
        return this.b;
    }

    public String l() {
        return this.f;
    }

    public String m() {
        return this.e;
    }

    public void a(String str) {
        this.a = str;
    }

    public void b(String str) {
        this.i = str;
    }

    public float f() {
        return this.n;
    }

    public String g() {
        return this.d;
    }

    public String h() {
        return this.l;
    }

    public String i() {
        return this.h;
    }

    public void a(Object obj) {
        this.c = obj;
    }

    public void b(Object obj) {
        this.m = obj;
    }

    public void d(String str) {
        this.j = str;
    }

    public void e(String str) {
        this.d = str;
    }

    public String d() {
        return this.k;
    }

    public Object e() {
        return this.m;
    }

    public void c(String str) {
        this.k = str;
    }

    public String c() {
        return this.i;
    }
}
