package com.adsurge.adn.p036k1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.adsurge.adn.p011c0.e;
import com.adsurge.adn.q1.c;
import com.adsurge.adn.q1.f;
import com.adsurge.adn.x1.n;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class g implements e {
    public static final Map a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.q1.a.b {
        public final /* synthetic */ ImageView a;

        public a(ImageView imageView) {
            this.a = imageView;
        }

        @Override // com.adsurge.adn.q1.a.b
        public void a(f fVar) {
            ImageView imageView = this.a;
            if (imageView != null) {
                imageView.setImageBitmap(fVar.b());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b implements c {
        public final e.a a;

        @Override // com.adsurge.adn.q1.c
        public void a(String str, ImageView imageView, f fVar) {
            Object objB;
            Map map = g.a;
            e.a aVar = (e.a) map.get(str);
            if (aVar != null) {
                aVar.a(fVar.d(), fVar.b());
                map.remove(str);
            }
            if (this.a == null) {
                return;
            }
            int iF = fVar.f();
            if (iF == 1) {
                objB = fVar.b();
            } else if (iF != 2) {
                objB = iF != 3 ? fVar.d() : fVar.c();
            } else {
                objB = fVar.e();
            }
            if (objB == null) {
                return;
            }
            this.a.a(fVar.d(), objB);
        }

        public b(e.a aVar) {
            this.a = aVar;
        }

        @Override // com.adsurge.adn.q1.c
        public void a(String str, int i, Exception exc) {
            Map map = g.a;
            e.a aVar = (e.a) map.get(str);
            if (aVar != null) {
                aVar.a(str, i, exc);
                map.remove(str);
            }
            e.a aVar2 = this.a;
            if (aVar2 == null) {
                return;
            }
            aVar2.a(str, i, exc);
        }
    }

    public void b(String str, e.a aVar) {
        a.put(str, aVar);
    }

    @Override // com.adsurge.adn.p011c0.e
    public void a(String str, e.a aVar) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith(d.v) && !str.startsWith("https://")) {
                return;
            }
            com.adsurge.adn.q1.b.a().a(str, new b(aVar));
        }
    }

    public final void c(String str, e.a aVar) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith(d.v) && !str.startsWith("https://")) {
                Bitmap bitmapA = n.a(str);
                if (bitmapA != null) {
                    aVar.a(null, bitmapA);
                    return;
                }
                return;
            }
            com.adsurge.adn.q1.b.a().a(str, (ImageView) null, new b(aVar));
        }
    }

    @Override // com.adsurge.adn.p011c0.e
    public void a(Object obj, e.a aVar) {
        if (obj instanceof String) {
            c((String) obj, aVar);
        } else if (obj instanceof File) {
            com.adsurge.adn.q1.b.a().a((File) obj, (ImageView) null, new b(aVar));
        } else {
            aVar.a(null, obj);
        }
    }

    public void a(String str) {
        a.remove(str);
    }

    @Override // com.adsurge.adn.p011c0.e
    public Bitmap a(File file) {
        return com.adsurge.adn.x1.d.a(file, (ImageView) null);
    }

    @Override // com.adsurge.adn.p011c0.e
    public void a(Object obj, Bitmap bitmap, float f, ImageView imageView) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        if (f > 25.0f) {
            f = 25.0f;
        }
        com.adsurge.adn.q1.a.a(obj, bitmap, f, new a(imageView));
    }
}
