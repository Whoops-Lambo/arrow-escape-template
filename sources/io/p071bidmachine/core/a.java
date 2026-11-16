package io.p071bidmachine.core;

import io.p071bidmachine.media3.extractor.text.j;
import io.p071bidmachine.util.log.c;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static boolean a;
    public static volatile j b = new j(14);
    public static volatile j c = new j(15);
    public static volatile j d = c;

    public static void a(b bVar) {
        j jVar = d;
        switch (jVar.a) {
            case 14:
                jVar.r(3, null, null, bVar, null);
                break;
        }
    }

    public static void b(Object obj, b bVar) {
        j jVar = d;
        switch (jVar.a) {
            case 14:
                jVar.r(3, obj, null, bVar, null);
                break;
        }
    }

    public static void c(Object obj, String str) {
        j jVar = d;
        switch (jVar.a) {
            case 14:
                jVar.r(3, obj, str, null, null);
                break;
        }
    }

    public static void d(String str) {
        j jVar = d;
        switch (jVar.a) {
            case 14:
                jVar.r(3, null, str, null, null);
                break;
        }
    }

    public static void e(b bVar) {
        j jVar = d;
        switch (jVar.a) {
            case 14:
                jVar.r(6, null, null, bVar, null);
                break;
        }
    }

    public static void f(Object obj, b bVar) {
        j jVar = d;
        switch (jVar.a) {
            case 14:
                jVar.r(6, obj, null, bVar, null);
                break;
        }
    }

    public static void g(boolean z) {
        a = z;
        d = z ? b : c;
        c.a.b = z;
    }

    public static void h(String str) {
        j jVar = d;
        switch (jVar.a) {
            case 14:
                jVar.r(5, null, str, null, null);
                break;
        }
    }

    public static void i(Throwable th) {
        j jVar = d;
        switch (jVar.a) {
            case 14:
                jVar.r(5, null, null, null, th);
                break;
        }
    }
}
