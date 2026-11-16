package com.adsurge.adn.N0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c extends com.adsurge.adn.P0.a {
    public static final byte[] n = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] o = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    public static final ThreadLocal p = new ThreadLocal();
    public static final /* synthetic */ boolean q = true;
    public final byte i;
    public final byte j;
    public byte[] k;
    public List l;
    public List m;

    public final int a(com.adsurge.adn.O0.b bVar) {
        int i;
        Iterator it = this.m.iterator();
        int i2 = 33;
        while (it.hasNext()) {
            i2 += ((e) it.next()).a + 12;
        }
        for (e eVar : this.l) {
            if (eVar instanceof h) {
                i = eVar.a + 12;
            } else if (eVar instanceof g) {
                i = eVar.a + 8;
            }
            i2 += i;
        }
        int length = i2 + o.length;
        a(length);
        bVar.a(length);
        bVar.a(n);
        bVar.d(13);
        int iA = bVar.a();
        bVar.c(j.h);
        bVar.d(this.b);
        bVar.d(this.c);
        bVar.a(this.k);
        CRC32 crc32A = a();
        crc32A.reset();
        crc32A.update(bVar.b(), iA, 17);
        bVar.d((int) crc32A.getValue());
        for (e eVar2 : this.m) {
            if (!(eVar2 instanceof i)) {
                ((com.adsurge.adn.O0.a) this.a).reset();
                ((com.adsurge.adn.O0.a) this.a).skip(eVar2.d);
                ((com.adsurge.adn.O0.a) this.a).read(bVar.b(), bVar.a(), eVar2.a + 12);
                bVar.b(eVar2.a + 12);
            }
        }
        for (e eVar3 : this.l) {
            if (eVar3 instanceof h) {
                ((com.adsurge.adn.O0.a) this.a).reset();
                ((com.adsurge.adn.O0.a) this.a).skip(eVar3.d);
                ((com.adsurge.adn.O0.a) this.a).read(bVar.b(), bVar.a(), eVar3.a + 12);
                bVar.b(eVar3.a + 12);
            } else if (eVar3 instanceof g) {
                bVar.d(eVar3.a - 4);
                int iA2 = bVar.a();
                bVar.c(h.e);
                ((com.adsurge.adn.O0.a) this.a).reset();
                ((com.adsurge.adn.O0.a) this.a).skip(eVar3.d + 12);
                ((com.adsurge.adn.O0.a) this.a).read(bVar.b(), bVar.a(), eVar3.a - 4);
                bVar.b(eVar3.a - 4);
                crc32A.reset();
                crc32A.update(bVar.b(), iA2, eVar3.a);
                bVar.d((int) crc32A.getValue());
            }
        }
        bVar.a(o);
        return length;
    }

    public final String b() {
        com.adsurge.adn.R0.d dVar = this.a;
        if (dVar == null) {
            return null;
        }
        com.adsurge.adn.R0.d dVar2 = ((com.adsurge.adn.O0.a) dVar).a;
        com.adsurge.adn.R0.b bVar = dVar2 instanceof com.adsurge.adn.R0.b ? (com.adsurge.adn.R0.b) dVar2 : null;
        if (bVar == null) {
            return null;
        }
        return bVar.c;
    }

    public c(com.adsurge.adn.O0.a aVar, f fVar) {
        super(aVar);
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.i = fVar.m;
        this.j = fVar.l;
        int i = fVar.j * 1000;
        short s = fVar.k;
        int i2 = i / (s == 0 ? (short) 100 : s);
        this.f = i2;
        if (i2 < 10) {
            this.f = 100;
        }
        this.b = fVar.f;
        this.c = fVar.g;
        this.d = fVar.h;
        this.e = fVar.i;
    }

    public final CRC32 a() {
        ThreadLocal threadLocal = p;
        CRC32 crc32 = (CRC32) threadLocal.get();
        if (crc32 != null) {
            return crc32;
        }
        CRC32 crc33 = new CRC32();
        threadLocal.set(crc33);
        return crc33;
    }

    public final void a(int i) {
        if (i < 10485760) {
            return;
        }
        com.adsurge.adn.L0.a.a(b(), i);
    }

    @Override // com.adsurge.adn.P0.a
    public Bitmap a(Canvas canvas, Paint paint, int i, Bitmap bitmap, com.adsurge.adn.O0.b bVar) {
        Bitmap bitmapDecodeByteArray;
        try {
            int iA = a(bVar);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inSampleSize = i;
            options.inMutable = true;
            options.inBitmap = bitmap;
            byte[] bArrB = bVar.b();
            try {
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, iA, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i;
                options2.inMutable = true;
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, iA, options2);
            }
            if (!q && bitmapDecodeByteArray == null) {
                throw new AssertionError();
            }
            Rect rect = this.g;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmapDecodeByteArray.getWidth();
            this.g.bottom = bitmapDecodeByteArray.getHeight();
            Rect rect2 = this.h;
            float f = i;
            float f2 = this.d / f;
            rect2.left = (int) f2;
            rect2.top = (int) (this.e / f);
            rect2.right = (int) (f2 + bitmapDecodeByteArray.getWidth());
            this.h.bottom = (int) ((this.e / f) + bitmapDecodeByteArray.getHeight());
            canvas.drawBitmap(bitmapDecodeByteArray, this.g, this.h, paint);
            return bitmapDecodeByteArray;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            com.adsurge.adn.L0.a.a(b(), 2, e2);
            return null;
        }
    }
}
