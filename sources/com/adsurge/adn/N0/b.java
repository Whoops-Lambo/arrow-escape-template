package com.adsurge.adn.N0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b extends com.adsurge.adn.P0.b {
    public static final String C = "b";
    public final Paint A;
    public final a B;
    public com.adsurge.adn.O0.b y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public byte a;
        public Rect b = new Rect();
        public ByteBuffer c;
    }

    @Override // com.adsurge.adn.P0.b
    public void a(com.adsurge.adn.P0.a aVar) {
        if (aVar == null || this.p == null) {
            return;
        }
        try {
            Bitmap bitmapB = b(this.p.width() / this.k, this.p.height() / this.k);
            Canvas canvas = (Canvas) this.n.get(bitmapB);
            if (canvas == null) {
                canvas = new Canvas(bitmapB);
                this.n.put(bitmapB, canvas);
            }
            Canvas canvas2 = canvas;
            if (aVar instanceof c) {
                this.o.rewind();
                bitmapB.copyPixelsFromBuffer(this.o);
                if (this.e == 0) {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                } else {
                    canvas2.save();
                    canvas2.clipRect(this.B.b);
                    a aVar2 = this.B;
                    byte b = aVar2.a;
                    if (b == 1) {
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    } else if (b == 2) {
                        aVar2.c.rewind();
                        bitmapB.copyPixelsFromBuffer(this.B.c);
                    }
                    canvas2.restore();
                }
                if (((c) aVar).j == 2) {
                    a aVar3 = this.B;
                    if (aVar3.a != 2) {
                        aVar3.c.rewind();
                        bitmapB.copyPixelsToBuffer(this.B.c);
                    }
                }
                this.B.a = ((c) aVar).j;
                canvas2.save();
                if (((c) aVar).i == 0) {
                    int i = aVar.d;
                    int i2 = this.k;
                    int i3 = aVar.e;
                    canvas2.clipRect(i / i2, i3 / i2, (i + aVar.b) / i2, (i3 + aVar.c) / i2);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                Rect rect = this.B.b;
                int i4 = aVar.d;
                int i5 = this.k;
                int i6 = aVar.e;
                rect.set(i4 / i5, i6 / i5, (i4 + aVar.b) / i5, (i6 + aVar.c) / i5);
                canvas2.restore();
            }
            Bitmap bitmapB2 = b(aVar.b, aVar.c);
            a(aVar.a(canvas2, this.A, this.k, bitmapB2, h()));
            a(bitmapB2);
            this.o.rewind();
            bitmapB.copyPixelsToBuffer(this.o);
            a(bitmapB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.adsurge.adn.P0.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.adsurge.adn.O0.a a(com.adsurge.adn.R0.d dVar) {
        return new com.adsurge.adn.O0.a(dVar);
    }

    @Override // com.adsurge.adn.P0.b
    public int e() {
        return this.z;
    }

    @Override // com.adsurge.adn.P0.b
    public void l() {
        this.B.c = null;
        this.y = null;
    }

    @Override // com.adsurge.adn.P0.b
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public com.adsurge.adn.O0.b h() {
        if (this.y == null) {
            this.y = new com.adsurge.adn.O0.b();
        }
        return this.y;
    }

    public b(com.adsurge.adn.S0.b bVar, com.adsurge.adn.P0.b.j jVar) {
        super(bVar, jVar);
        Paint paint = new Paint();
        this.A = paint;
        this.B = new a();
        paint.setAntiAlias(true);
    }

    @Override // com.adsurge.adn.P0.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect b(com.adsurge.adn.O0.a aVar) {
        List<e> listA = d.a(aVar);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[0];
        c cVar = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        for (e eVar : listA) {
            boolean z2 = eVar instanceof i;
            if (z2) {
                Log.e(C, "chunk read reach to end");
                break;
            }
            if (eVar instanceof com.adsurge.adn.N0.a) {
                this.z = ((com.adsurge.adn.N0.a) eVar).f;
                z = true;
            } else if (eVar instanceof f) {
                cVar = new c(aVar, (f) eVar);
                cVar.m = arrayList;
                cVar.k = bArr;
                this.d.add(cVar);
            } else if (eVar instanceof g) {
                if (cVar != null) {
                    cVar.l.add(eVar);
                }
            } else if (eVar instanceof h) {
                if (!z) {
                    k kVar = new k(aVar);
                    kVar.b = i2;
                    kVar.c = i;
                    this.d.add(kVar);
                    this.z = 1;
                    break;
                }
                if (cVar != null) {
                    cVar.l.add(eVar);
                }
            } else if (eVar instanceof j) {
                j jVar = (j) eVar;
                i2 = jVar.e;
                i = jVar.f;
                bArr = jVar.g;
            } else if (!z2) {
                arrayList.add(eVar);
            }
        }
        int i3 = i2 * i;
        int i4 = this.k;
        this.o = ByteBuffer.allocate(((i3 / (i4 * i4)) + 1) * 4);
        a aVar2 = this.B;
        int i5 = this.k;
        aVar2.c = ByteBuffer.allocate(((i3 / (i5 * i5)) + 1) * 4);
        return new Rect(0, 0, i2, i);
    }
}
