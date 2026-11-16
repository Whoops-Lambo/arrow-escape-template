package com.adsurge.adn.p047o0;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static List a(List list, double d) {
        List list2 = list;
        int size = list2.size();
        com.adsurge.adn.J0.a.a("ShapeGestureRecognizer", "point count %d, interval %f", Integer.valueOf(size), Double.valueOf(d));
        int i = 1;
        if (size <= 1 || d < 1.0d) {
            com.adsurge.adn.J0.a.a("ShapeGestureRecognizer", "point count <= 1 or interval < 1, no need resample!");
            return list;
        }
        ArrayList arrayList = new ArrayList();
        PointF pointF = (PointF) list2.get(0);
        arrayList.add(new PointF(pointF.x, pointF.y));
        double d2 = 0.0d;
        while (i < size) {
            PointF pointF2 = (PointF) list2.get(i);
            double dHypot = Math.hypot(pointF2.x - pointF.x, pointF2.y - pointF.y);
            double d3 = dHypot + d2;
            com.adsurge.adn.J0.a.a("ShapeGestureRecognizer", "dd %f, interval %f, remain %f", Double.valueOf(d3), Double.valueOf(d), Double.valueOf(d2));
            while (d3 >= d) {
                if (d3 == d) {
                    pointF = new PointF(pointF2.x, pointF2.y);
                    d3 = 0.0d;
                } else {
                    double d4 = (d - d2) / dHypot;
                    float f = pointF.x;
                    double d5 = (((double) (pointF2.x - f)) * d4) + ((double) f);
                    float f2 = pointF.y;
                    d3 -= d;
                    pointF = new PointF((float) d5, (float) ((((double) (pointF2.y - f2)) * d4) + ((double) f2)));
                }
                arrayList.add(pointF);
                size = size;
            }
            i++;
            list2 = list;
            pointF = pointF2;
            d2 = d3;
        }
        return arrayList;
    }

    public static float a(List list, List list2) {
        if (list == null || list2 == null) {
            return -1.0f;
        }
        int iMin = Math.min(list.size(), list2.size());
        if (iMin >= 20) {
            iMin = 20;
        }
        return a(list, list2, iMin);
    }

    public static float a(List list, List list2, int i) {
        return a(a(a(list, i)), a(a(list2, i)));
    }

    public static List a(List list, int i) {
        if (i <= 1) {
            com.adsurge.adn.J0.a.a("ShapeGestureRecognizer", "sample count <= 1 !");
            return list;
        }
        int size = list.size();
        if (i == size) {
            com.adsurge.adn.J0.a.a("ShapeGestureRecognizer", "sample count == path.size, no need resample!");
            return list;
        }
        PointF pointF = (PointF) list.get(0);
        double dA = 0.0d;
        for (int i2 = 1; i2 < size; i2++) {
            dA += (double) a(pointF, (PointF) list.get(i2));
            pointF = (PointF) list.get(i2);
        }
        List listA = a(list, dA / ((double) (i - 1)));
        if (listA.size() < i) {
            PointF pointF2 = (PointF) list.get(size - 1);
            listA.add(new PointF(pointF2.x, pointF2.y));
        }
        return listA;
    }

    public static float a(List list, List list2, boolean z) {
        float fA = a(list, list2);
        if (!z) {
            return fA;
        }
        Collections.reverse(list);
        return Math.max(fA, a(list, list2));
    }

    public static float a(PointF pointF, PointF pointF2) {
        return (float) Math.hypot(pointF.x - pointF2.x, pointF.y - pointF2.y);
    }

    public static float a(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0 || fArr2.length == 0) {
            return -1.0f;
        }
        double d = 0.0d;
        double dPow = 0.0d;
        double dPow2 = 0.0d;
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            d += (double) (fArr2[i] * f);
            dPow2 += Math.pow(f, 2.0d);
            dPow += Math.pow(fArr2[i], 2.0d);
        }
        return (float) (d / (Math.sqrt(dPow) * Math.sqrt(dPow2)));
    }

    public static float[] a(List list) {
        float[] fArr = new float[list.size() * 2];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        for (int i = 1; i < list.size(); i++) {
            int i2 = i * 2;
            int i3 = i - 1;
            fArr[i2] = ((PointF) list.get(i)).x - ((PointF) list.get(i3)).x;
            fArr[i2 + 1] = ((PointF) list.get(i)).y - ((PointF) list.get(i3)).y;
        }
        return fArr;
    }
}
