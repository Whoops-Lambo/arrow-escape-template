package io.p071bidmachine.ads.networks.adaptiverendering;

import android.os.Handler;
import defpackage.ar1;
import io.p071bidmachine.internal.f1;
import io.p071bidmachine.media3.common.k0;
import io.p071bidmachine.media3.common.l;
import io.p071bidmachine.media3.common.l0;
import io.p071bidmachine.media3.common.util.j;
import io.p071bidmachine.media3.common.util.k;
import io.p071bidmachine.media3.exoplayer.e0;
import io.p071bidmachine.media3.exoplayer.m;
import io.p071bidmachine.utils.lazy.b;
import java.security.GeneralSecurityException;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements b, k, j {
    public final /* synthetic */ int a;

    public static /* synthetic */ void b() {
        throw new ar1();
    }

    public static /* synthetic */ void c(int i, String str) {
        throw new IllegalArgumentException((str + i).toString());
    }

    public static /* synthetic */ void d(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    @Override // io.p071bidmachine.media3.common.util.k
    public void a(Object obj, l lVar) {
        ((l0) obj).o(new k0(lVar));
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public Object mo1394get() {
        Calendar calendar;
        switch (this.a) {
            case 0:
                return "PlaceholderSource don't found. Set one of: name, color, gradient";
            case 1:
                return "ColorSource don't found. Can't parse context color";
            case 2:
                return "ColorSource don't found. Can't create context gradient";
            case 3:
                return "ColorSource don't found. Can't parse color";
            case 4:
                return "ColorSource don't found. Can't create Gradient";
            case 5:
                return "ColorSource don't found. Set one of: color, gradient, context_color, context_gradient";
            case 6:
                return "Failed to parse all colors. Check if colors are specified correctly.";
            case 7:
                return "BackgroundSource don't found. Can't create Color";
            case 8:
                return "Not all colors were parsed, check if the colors are specified correctly";
            case 9:
                return "BackgroundSource don't found. Can't create Image";
            case 10:
                return "BackgroundSource don't found. Set one of: color, gradient";
            case 11:
                return "ResourceSource don't found. Set one of: html, xml";
            case 12:
                return "ResourceSource don't found. Set one of: base64, url, payload";
            case 13:
                return "BrokenCreativeDetector algorithms is empty";
            case 14:
                return "Not all BrokenCreativeDetector algorithms were applied, check if the algorithms are specified correctly";
            case 15:
                return "PlaceholderSource don't found. Can't create Color";
            case 16:
            case 17:
            default:
                List list = f1.c;
                return "Access to platform data before init";
            case 18:
                Handler handler = io.p071bidmachine.core.j.a;
                return "Manifest permission not found: android.permission.ACCESS_NETWORK_STATE. Check the integration.";
            case 19:
                try {
                    try {
                        calendar = Calendar.getInstance();
                    } catch (Throwable unused) {
                        calendar = Calendar.getInstance(Locale.US);
                    }
                    break;
                } catch (Throwable unused2) {
                    calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
                }
                return Integer.valueOf(calendar.get(1));
        }
    }

    @Override // io.p071bidmachine.media3.common.util.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 24:
                ((l0) obj).l(m.d(new e0(1), 1003));
                break;
            case 25:
                ((l0) obj).onRenderedFirstFrame();
                break;
            case 26:
                ((io.p071bidmachine.media3.exoplayer.analytics.b) obj).getClass();
                break;
            case 27:
                ((io.p071bidmachine.media3.exoplayer.analytics.b) obj).getClass();
                break;
            case 28:
                ((io.p071bidmachine.media3.exoplayer.analytics.b) obj).getClass();
                break;
            default:
                ((io.p071bidmachine.media3.exoplayer.analytics.b) obj).getClass();
                break;
        }
    }

    public /* synthetic */ e(int i) {
        this.a = i;
    }
}
