package com.adsurge.adn.p068y0;

import android.graphics.Bitmap;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.adsurge.adn.p011c0.e;
import com.adsurge.adn.p032j0.f;
import com.adsurge.adn.p038l0.i;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c extends com.adsurge.adn.p068y0.a {
    public float[] P;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements i.e {
        @Override // com.adsurge.adn.l0.i.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            return new c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b implements e.a {
        public final c a;
        public final int b;
        public final float[] c;
        public final Object d;
        public final WeakReference e;
        public JSONArray f;

        @Override // com.adsurge.adn.c0.e.a
        public void a(File file, Object obj) {
            com.adsurge.adn.p011c0.a aVarD;
            e eVarE;
            com.adsurge.adn.p068y0.d dVar = (com.adsurge.adn.p068y0.d) this.e.get();
            if (dVar == null) {
                return;
            }
            if (!(obj instanceof Bitmap)) {
                if (obj instanceof Movie) {
                    if (this.a.I) {
                        dVar.setMovie((Movie) obj);
                        return;
                    }
                    return;
                } else {
                    if (obj instanceof Drawable) {
                        a(dVar, (Drawable) obj);
                        return;
                    }
                    return;
                }
            }
            int i = this.b;
            if (i == 0) {
                Bitmap bitmapA = (Bitmap) obj;
                float[] fArr = this.c;
                if (fArr != null) {
                    bitmapA = a(bitmapA, fArr);
                }
                dVar.setImageBitmap(bitmapA);
                return;
            }
            if (i != 1 || (aVarD = this.a.d()) == null || this.d == null || this.f == null || (eVarE = aVarD.e()) == null) {
                return;
            }
            eVarE.a(this.d, (Bitmap) obj, (float) this.f.optDouble(0), dVar);
        }

        public b(c cVar, int i, float[] fArr, Object obj, com.adsurge.adn.p068y0.d dVar, JSONArray jSONArray) {
            this.a = cVar;
            this.b = i;
            this.c = fArr;
            this.d = obj;
            this.e = new WeakReference(dVar);
            this.f = jSONArray;
        }

        public final int a(int i, float f) {
            if (i <= 0 || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return 0;
            }
            if (f != 1.0f) {
                float f2 = i;
                if (f < f2) {
                    return f > 1.0f ? (int) f : (int) (f2 * f);
                }
            }
            return i;
        }

        public final void a(com.adsurge.adn.p068y0.d dVar, Drawable drawable) {
            c cVar = this.a;
            if (cVar.I) {
                if (drawable instanceof com.adsurge.adn.M0.a) {
                    com.adsurge.adn.M0.a aVar = (com.adsurge.adn.M0.a) drawable;
                    int iQ = cVar.Q();
                    int iP = this.a.P();
                    if (iQ > 0 && iP != 1) {
                        aVar.a(1);
                        ((com.adsurge.adn.N0.b) aVar.c()).a(new RunnableC0150c(this.a, aVar));
                    } else {
                        aVar.a(iP);
                    }
                }
                if (this.a.S() <= 0) {
                    dVar.setImageDrawable(drawable);
                } else {
                    dVar.postDelayed(new d(this.e, drawable), this.a.S());
                }
            }
        }

        @Override // com.adsurge.adn.c0.e.a
        public void a(Object obj, int i, Exception exc) {
            f.a(obj, i, exc);
        }

        public final Bitmap a(Bitmap bitmap, float[] fArr) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int iA = a(width, fArr[0]);
            int iA2 = a(height, fArr[1]);
            int iA3 = a(width, fArr[2]);
            int iA4 = a(height, fArr[3]);
            if (iA + iA3 > width) {
                iA3 = width - iA;
            }
            if (iA2 + iA4 > height) {
                iA4 = height - iA2;
            }
            return (iA3 == 0 || iA4 == 0) ? bitmap : Bitmap.createBitmap(bitmap, iA, iA2, iA3, iA4);
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.y0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class RunnableC0150c implements Runnable, com.adsurge.adn.P0.b.j {
        public final WeakReference a;
        public final com.adsurge.adn.M0.a b;
        public int c;

        @Override // com.adsurge.adn.P0.b.j
        public void b() {
        }

        @Override // com.adsurge.adn.P0.b.j
        public void a() {
            com.adsurge.adn.p068y0.d dVar;
            com.adsurge.adn.p068y0.a aVar = (com.adsurge.adn.p068y0.a) this.a.get();
            if (aVar == null || (dVar = (com.adsurge.adn.p068y0.d) aVar.C()) == null) {
                return;
            }
            int i = this.c - 1;
            this.c = i;
            if (i != 0) {
                dVar.postDelayed(this, aVar.Q());
                return;
            }
            com.adsurge.adn.p014d0.b bVar = aVar.J;
            if (bVar != null) {
                bVar.a(aVar.H);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.start();
        }

        public RunnableC0150c(com.adsurge.adn.p068y0.a aVar, com.adsurge.adn.M0.a aVar2) {
            this.a = new WeakReference(aVar);
            this.b = aVar2;
            int iP = aVar.P();
            this.c = iP == 0 ? -1 : iP;
        }

        @Override // com.adsurge.adn.P0.b.j
        public void a(ByteBuffer byteBuffer) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class d implements Runnable {
        public final WeakReference a;
        public final Drawable b;

        @Override // java.lang.Runnable
        public void run() {
            com.adsurge.adn.p068y0.d dVar = (com.adsurge.adn.p068y0.d) this.a.get();
            if (dVar == null) {
                return;
            }
            dVar.setImageDrawable(this.b);
        }

        public d(WeakReference weakReference, Drawable drawable) {
            this.a = weakReference;
            this.b = drawable;
        }
    }

    public final ImageView.ScaleType n(int i) {
        if (i == 1) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i != 2) {
            return i != 4 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    @Override // com.adsurge.adn.p068y0.a
    public void a(Object obj) {
        if (this.L == null) {
            return;
        }
        d().e().a(obj, new b(this, this.M, this.P, this.L, (com.adsurge.adn.p068y0.d) this.y, this.N));
    }

    @Override // com.adsurge.adn.p038l0.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.adsurge.adn.p068y0.d b(com.adsurge.adn.p011c0.a aVar) {
        com.adsurge.adn.p068y0.d dVar = new com.adsurge.adn.p068y0.d(d().c());
        dVar.setScaleType(ImageView.ScaleType.FIT_XY);
        dVar.setCropToPadding(true);
        return dVar;
    }

    @Override // com.adsurge.adn.p038l0.i
    public com.adsurge.adn.p050p0.d q() {
        return new com.adsurge.adn.p050p0.d(this, (com.adsurge.adn.p068y0.d) this.y);
    }

    @Override // com.adsurge.adn.p068y0.a
    public void m(int i) {
        ImageView.ScaleType scaleTypeN = n(i);
        if (scaleTypeN == ImageView.ScaleType.CENTER_CROP) {
            ((com.adsurge.adn.p068y0.d) this.y).setCropToPadding(true);
        }
        ((com.adsurge.adn.p068y0.d) this.y).setScaleType(scaleTypeN);
    }

    @Override // com.adsurge.adn.p068y0.a, com.adsurge.adn.p038l0.i
    public void c() {
        super.c();
        this.P = null;
    }

    @Override // com.adsurge.adn.p068y0.a
    public void a(float[] fArr) {
        if (fArr == null || fArr.length < 4) {
            return;
        }
        this.P = fArr;
    }
}
