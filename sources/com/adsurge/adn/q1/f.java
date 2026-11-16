package com.adsurge.adn.q1;

import android.graphics.Bitmap;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public File a;
    public Bitmap b;
    public Movie c;
    public Drawable d;
    public boolean e;
    public int f = 0;
    public boolean g;
    public boolean h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public f a = new f();

        public a a(com.adsurge.adn.M0.a aVar) {
            f fVar = this.a;
            fVar.d = aVar;
            fVar.f = 3;
            return this;
        }

        public a b(boolean z) {
            this.a.e = z;
            return this;
        }

        public a c(boolean z) {
            this.a.g = z;
            return this;
        }

        public a a(Movie movie) {
            f fVar = this.a;
            fVar.c = movie;
            fVar.f = 2;
            return this;
        }

        public a a(Bitmap bitmap) {
            f fVar = this.a;
            fVar.b = bitmap;
            fVar.f = 1;
            return this;
        }

        public a a(File file) {
            this.a.a = file;
            return this;
        }

        public a a(boolean z) {
            this.a.h = z;
            return this;
        }

        public f a() {
            return this.a;
        }
    }

    public boolean a() {
        return this.e;
    }

    public Bitmap b() {
        return this.b;
    }

    public Drawable c() {
        return this.d;
    }

    public File d() {
        return this.a;
    }

    public Movie e() {
        return this.c;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return this.g;
    }
}
