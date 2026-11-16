package com.bytedance.adsdk.ahm.noq;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.ahm.rz.ahm.kus;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ct {
    private static final PointF kgy = new PointF();

    private static int ahm(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static boolean rz(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static void kgy(kus kusVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFKgy = kusVar.kgy();
        path.moveTo(pointFKgy.x, pointFKgy.y);
        kgy.set(pointFKgy.x, pointFKgy.y);
        int i = 0;
        while (i < kusVar.rz().size()) {
            com.bytedance.adsdk.ahm.rz.kgy kgyVar = kusVar.rz().get(i);
            PointF pointFKgy2 = kgyVar.kgy();
            PointF pointFAhm = kgyVar.ahm();
            PointF pointFRz = kgyVar.rz();
            PointF pointF = kgy;
            if (pointFKgy2.equals(pointF) && pointFAhm.equals(pointFRz)) {
                path.lineTo(pointFRz.x, pointFRz.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFKgy2.x, pointFKgy2.y, pointFAhm.x, pointFAhm.y, pointFRz.x, pointFRz.y);
            }
            pointF.set(pointFRz.x, pointFRz.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (kusVar.ahm()) {
            path3.close();
        }
    }

    public static float ahm(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static PointF kgy(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int kgy(int i, int i2, float f) {
        return (int) ((f * (i2 - i)) + i);
    }

    public static float kgy(float f, float f2, float f3) {
        return h50.c(f2, f, f3, f);
    }

    public static int kgy(float f, float f2) {
        return kgy((int) f, (int) f2);
    }

    private static int kgy(int i, int i2) {
        return i - (i2 * ahm(i, i2));
    }

    public static int kgy(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }
}
