package io.p071bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import com.moloco.sdk.internal.error.crash.data.network.b;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.h62;
import defpackage.sy;
import defpackage.wz2;
import io.p071bidmachine.rendering.internal.adform.countdown.a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class w implements i {
    public final z a;
    public final c0 b;
    public final b c;
    public final a d;
    public final io.p071bidmachine.media3.exoplayer.offline.b e;
    public final y f;

    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // io.p071bidmachine.rendering.internal.meanbackground.i
    public final Object a(sy syVar, View view, fy fyVar) {
        u uVar;
        sy syVar2;
        w wVar;
        Bitmap bitmap;
        sy syVar3;
        Rect rect;
        Bitmap bitmap2;
        w wVar2 = this;
        if (fyVar instanceof u) {
            uVar = (u) fyVar;
            int i = uVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.w = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(wVar2, fyVar);
            }
        } else {
            uVar = new u(wVar2, fyVar);
        }
        Object objA = uVar.u;
        int i2 = uVar.w;
        int i3 = 3;
        int i4 = 1;
        Bitmap bitmap3 = null;
        byte b = 0;
        byte b2 = 0;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(objA);
            h62 h62Var = new h62(wVar2, view, b == true ? 1 : 0, 8);
            uVar.r = wVar2;
            syVar2 = syVar;
            uVar.s = syVar2;
            uVar.w = 1;
            objA = wVar2.f.a("Screenshot", h62Var, uVar);
            if (objA != dzVar) {
            }
            return dzVar;
        }
        if (i2 == 1) {
            sy syVar4 = uVar.s;
            w wVar3 = (w) uVar.r;
            wz2.a0(objA);
            syVar2 = syVar4;
            wVar2 = wVar3;
        } else {
            if (i2 == 2) {
                Bitmap bitmap4 = uVar.t;
                syVar2 = uVar.s;
                w wVar4 = (w) uVar.r;
                wz2.a0(objA);
                bitmap = bitmap4;
                wVar = wVar4;
                syVar3 = syVar2;
                rect = (Rect) objA;
                if (rect == null) {
                    return new h(bitmap, i4);
                }
                y yVar = wVar.f;
                v vVar = new v(null, syVar3, bitmap, rect, wVar);
                uVar.r = bitmap;
                uVar.s = null;
                uVar.t = null;
                uVar.w = 3;
                objA = yVar.a("Extract content corners", vVar, uVar);
                if (objA != dzVar) {
                    bitmap2 = bitmap;
                }
                return dzVar;
            }
            if (i2 != 3) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bitmap2 = (Bitmap) uVar.r;
            wz2.a0(objA);
        }
        return new h((List) objA, bitmap2);
        Bitmap bitmap5 = (Bitmap) objA;
        if (bitmap5 == null) {
            return new h(bitmap3, i3);
        }
        y yVar2 = wVar2.f;
        h62 h62Var2 = new h62(wVar2, bitmap5, b2 == true ? 1 : 0, 7);
        uVar.r = wVar2;
        uVar.s = syVar2;
        uVar.t = bitmap5;
        uVar.w = 2;
        Object objA2 = yVar2.a("Scan bounds", h62Var2, uVar);
        if (objA2 != dzVar) {
            wVar = wVar2;
            bitmap = bitmap5;
            objA = objA2;
            syVar3 = syVar2;
            rect = (Rect) objA;
            if (rect == null) {
                return new h(bitmap, i4);
            }
            y yVar3 = wVar.f;
            v vVar2 = new v(null, syVar3, bitmap, rect, wVar);
            uVar.r = bitmap;
            uVar.s = null;
            uVar.t = null;
            uVar.w = 3;
            objA = yVar3.a("Extract content corners", vVar2, uVar);
            if (objA != dzVar) {
                bitmap2 = bitmap;
                return new h((List) objA, bitmap2);
            }
        }
        return dzVar;
    }

    public w(z zVar, c0 c0Var, b bVar, a aVar, io.p071bidmachine.media3.exoplayer.offline.b bVar2, y yVar) {
        zVar.getClass();
        c0Var.getClass();
        aVar.getClass();
        yVar.getClass();
        this.a = zVar;
        this.b = c0Var;
        this.c = bVar;
        this.d = aVar;
        this.e = bVar2;
        this.f = yVar;
    }
}
