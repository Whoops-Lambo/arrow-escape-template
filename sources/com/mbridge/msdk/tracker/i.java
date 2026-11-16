package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class i implements Serializable {
    static String i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";
    static String j = "DROP TABLE IF EXISTS %s";
    private final e a;
    private int b;
    private int c;
    private final String d;
    private long e;
    private boolean f = false;
    private boolean g = false;
    private String h;

    public void a(int i2) {
        this.b = i2;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(boolean z) {
        this.f = z;
    }

    public e d() {
        return this.a;
    }

    public long f() {
        return this.e;
    }

    public int g() {
        return this.b;
    }

    public String h() {
        return this.h;
    }

    public int i() {
        return this.c;
    }

    public String j() {
        return this.d;
    }

    public boolean k() {
        return this.g;
    }

    public boolean l() {
        return this.f;
    }

    public i(e eVar) {
        this.a = eVar;
        this.d = eVar.m();
    }

    public void a(long j2) {
        this.e = j2;
    }

    public void b(int i2) {
        this.c = i2;
    }

    public void a(String str) {
        this.h = str;
    }
}
