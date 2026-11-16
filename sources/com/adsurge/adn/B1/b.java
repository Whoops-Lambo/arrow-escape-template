package com.adsurge.adn.B1;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class b {
    public final String a;
    public final File b;
    public final String c;
    public final boolean d;
    public String g;
    public double i;
    public String j;
    public com.adsurge.adn.Y0.c k;
    public boolean l;
    public boolean e = true;
    public boolean f = false;
    public long h = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public String a;
        public File b;
        public String c;
        public String g;
        public long h;
        public String j;
        public com.adsurge.adn.Y0.c k;
        public boolean d = true;
        public boolean e = true;
        public boolean f = false;
        public double i = 1.0d;
        public boolean l = true;

        public b a() {
            b bVar = new b(this.b, this.c, this.a, this.d);
            bVar.f = this.f;
            bVar.e = this.e;
            bVar.g = this.g;
            bVar.h = this.h;
            bVar.i = this.i;
            bVar.j = this.j;
            bVar.k = this.k;
            bVar.l = this.l || this.d;
            return bVar;
        }

        public a b(boolean z) {
            this.f = z;
            return this;
        }

        public a c(String str) {
            this.j = str;
            return this;
        }

        public a d(String str) {
            this.a = str;
            return this;
        }

        public a b(String str) {
            this.g = str;
            return this;
        }

        public a c(boolean z) {
            this.d = z;
            return this;
        }

        public a a(String str) {
            this.c = str;
            return this;
        }

        public a a(boolean z) {
            this.e = z;
            return this;
        }

        public a a(com.adsurge.adn.Y0.c cVar) {
            this.k = cVar;
            return this;
        }

        public a a(File file) {
            this.b = file;
            return this;
        }
    }

    public com.adsurge.adn.Y0.c a() {
        return this.k;
    }

    public File b() {
        return this.b;
    }

    public double c() {
        return this.i;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return TextUtils.isEmpty(this.g) ? this.a : this.g;
    }

    public String f() {
        return this.j;
    }

    public String g() {
        return this.a;
    }

    public boolean h() {
        return this.l;
    }

    public boolean i() {
        return this.e;
    }

    public boolean j() {
        return this.f;
    }

    public boolean k() {
        return this.d;
    }

    public b(File file, String str, String str2, boolean z) {
        this.b = file;
        this.c = str;
        this.a = str2;
        this.d = z;
    }
}
