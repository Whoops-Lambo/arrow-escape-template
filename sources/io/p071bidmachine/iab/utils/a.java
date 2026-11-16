package io.p071bidmachine.iab.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final int a = Color.parseColor("#B4FFFFFF");
    public static final int b;
    public static final q c;
    public static final q d;
    public static final q e;
    public static final q f;
    public static final q g;
    public static final q h;
    public static final q i;
    public static final q j;
    public static final q k;
    public static final q l;
    public static final q m;
    public static final q n;
    public static final q o;

    public static Bitmap a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    static {
        Color.parseColor("#5c000000");
        b = Color.parseColor("#52000000");
        q qVar = new q();
        c = qVar;
        qVar.e = 5;
        qVar.f = 48;
        Float fValueOf = Float.valueOf(2.0f);
        qVar.s = fValueOf;
        qVar.g = "cross";
        qVar.r(8, 8, 8, 8);
        Float fValueOf2 = Float.valueOf(30.0f);
        qVar.z(fValueOf2);
        qVar.q(fValueOf2);
        Float fValueOf3 = Float.valueOf(3.0f);
        qVar.i = fValueOf3;
        q qVar2 = new q();
        f = qVar2;
        qVar2.e = 5;
        qVar2.f = 48;
        qVar2.s = fValueOf;
        qVar2.g = "circular";
        qVar2.r(8, 8, 8, 8);
        qVar2.z(fValueOf2);
        qVar2.q(fValueOf2);
        qVar2.v = 1;
        qVar2.i = fValueOf3;
        q qVar3 = new q();
        g = qVar3;
        qVar3.e = 5;
        qVar3.f = 48;
        Float fValueOf4 = Float.valueOf(16.0f);
        qVar3.w = fValueOf4;
        qVar3.s = fValueOf;
        qVar3.x(12, 2, 12, 2);
        qVar3.r = "%1.0f%";
        qVar3.g = "text";
        qVar3.r(8, 8, 8, 8);
        qVar3.v = 1;
        qVar3.i = fValueOf3;
        q qVar4 = new q();
        e = qVar4;
        qVar4.e = 3;
        qVar4.f = 48;
        qVar4.s = fValueOf;
        qVar4.r(8, 8, 8, 8);
        qVar4.z(fValueOf2);
        qVar4.q(fValueOf2);
        qVar4.i = fValueOf3;
        q qVar5 = new q();
        d = qVar5;
        qVar5.e = 17;
        qVar5.f = 48;
        qVar5.s = fValueOf;
        qVar5.r(8, 8, 8, 8);
        qVar5.z(fValueOf2);
        qVar5.q(fValueOf2);
        qVar5.d = Boolean.FALSE;
        qVar5.i = fValueOf3;
        q qVar6 = new q();
        l = qVar6;
        qVar6.e = 17;
        qVar6.f = 80;
        qVar6.b = 0;
        qVar6.s = fValueOf3;
        qVar6.z(-1);
        qVar6.q(3);
        qVar6.g = "linear";
        qVar6.i = fValueOf3;
        q qVar7 = new q();
        k = qVar7;
        qVar7.e = 17;
        qVar7.f = 80;
        qVar7.w = fValueOf4;
        qVar7.s = fValueOf;
        qVar7.x(12, 2, 12, 2);
        qVar7.r = "%1.0f%";
        qVar7.g = "text";
        qVar7.r(3, 3, 3, 3);
        qVar7.v = 1;
        qVar7.i = fValueOf3;
        q qVar8 = new q();
        m = qVar8;
        qVar8.e = 17;
        qVar8.f = 80;
        qVar8.s = fValueOf;
        qVar8.c = Boolean.TRUE;
        qVar8.g = "circular";
        qVar8.r(8, 8, 8, 8);
        qVar8.z(fValueOf2);
        qVar8.q(fValueOf2);
        qVar8.v = 1;
        qVar8.i = fValueOf3;
        q qVar9 = new q();
        h = qVar9;
        qVar9.e = 5;
        qVar9.f = 80;
        qVar9.w = fValueOf4;
        qVar9.s = fValueOf;
        qVar9.x(16, 6, 16, 6);
        qVar9.g = "text";
        qVar9.r(3, 3, 3, 3);
        qVar9.v = 1;
        qVar9.i = fValueOf3;
        q qVar10 = new q();
        i = qVar10;
        qVar10.e = 17;
        qVar10.f = 80;
        qVar10.b = 0;
        qVar10.r(3, 3, 3, 3);
        q qVar11 = new q();
        qVar11.o(qVar10);
        j = qVar11;
        qVar11.r(0, 0, 0, 0);
        q qVar12 = new q();
        n = qVar12;
        qVar12.e = 1;
        qVar12.f = 16;
        qVar12.x(8, 8, 8, 8);
        qVar12.s = fValueOf3;
        qVar12.z(48);
        qVar12.q(48);
        q qVar13 = new q();
        o = qVar13;
        qVar13.e = 3;
        qVar13.f = 48;
        qVar13.b = -16777216;
        qVar13.g = "fullscreen";
    }

    public static q b(q qVar) {
        q qVar2 = c;
        if (qVar == null || !("crossfill".equals(qVar.g) || "skipfill".equals(qVar.g))) {
            return qVar2;
        }
        q qVar3 = new q();
        qVar3.c = Boolean.TRUE;
        return qVar2.d(qVar3);
    }
}
