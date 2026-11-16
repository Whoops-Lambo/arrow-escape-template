package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class I5 {
    private String a;
    private boolean b;
    private String c;
    private J7 d;
    private boolean e;
    private ArrayList<Pair<String, String>> f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        private String a;
        private J7 d;
        private boolean b = false;
        private String c = "POST";
        private boolean e = false;
        private ArrayList<Pair<String, String>> f = new ArrayList<>();

        public a a(Pair<String, String> pair) {
            this.f.add(pair);
            return this;
        }

        public a b() {
            this.c = C4887nc.a;
            return this;
        }

        public a c() {
            this.c = "POST";
            return this;
        }

        public a(String str) {
            this.a = "";
            if (str != null && !str.isEmpty()) {
                this.a = str;
            }
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }

        public a a(J7 j7) {
            this.d = j7;
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f.addAll(list);
            return this;
        }

        public a a(boolean z) {
            this.e = z;
            return this;
        }

        public I5 a() {
            return new I5(this);
        }
    }

    public boolean a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public J7 c() {
        return this.d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f);
    }

    public String e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public I5(a aVar) {
        this.e = false;
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (aVar.f != null) {
            this.f = new ArrayList<>(aVar.f);
        }
    }
}
