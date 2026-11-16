package io.p071bidmachine.media3.exoplayer.analytics;

import android.graphics.Bitmap;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.util.e;
import io.p071bidmachine.media3.common.util.j;
import io.p071bidmachine.media3.exoplayer.source.y0;
import io.p071bidmachine.media3.extractor.amr.a;
import io.p071bidmachine.media3.extractor.flac.c;
import io.p071bidmachine.media3.extractor.flv.b;
import io.p071bidmachine.media3.extractor.m;
import io.p071bidmachine.media3.extractor.mp4.i;
import io.p071bidmachine.media3.extractor.p;
import io.p071bidmachine.media3.extractor.text.k;
import io.p071bidmachine.t1;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements j, e, p {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // io.p071bidmachine.media3.common.util.e
    public void accept(Object obj) {
        switch (this.a) {
            case 16:
                ((y0) obj).b.getClass();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    public Constructor b() {
        switch (this.a) {
            case 18:
                if (Boolean.TRUE.equals(Class.forName("io.bidmachine.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("io.bidmachine.media3.decoder.flac.FlacExtractor").asSubclass(m.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("io.bidmachine.media3.decoder.midi.MidiExtractor").asSubclass(m.class).getConstructor(null);
        }
    }

    @Override // io.p071bidmachine.media3.extractor.p
    public m[] createExtractors() {
        switch (this.a) {
            case 20:
                return new m[]{new a()};
            case 21:
                return new m[]{new c()};
            case 22:
                return new m[]{new b()};
            case 23:
            case 24:
            default:
                return new m[]{new io.p071bidmachine.media3.extractor.ts.d(0)};
            case 25:
                return new m[]{new i(k.q9, 16)};
            case 26:
                return new m[]{new io.p071bidmachine.media3.extractor.ogg.d()};
            case 27:
                return new m[]{new io.p071bidmachine.media3.extractor.ts.a()};
            case 28:
                return new m[]{new io.p071bidmachine.media3.extractor.ts.c()};
        }
    }

    @Override // io.p071bidmachine.media3.common.util.j
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.a) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                bVar.getClass();
                break;
            case 2:
                bVar.getClass();
                break;
            case 3:
                bVar.getClass();
                break;
            case 4:
                bVar.getClass();
                break;
            case 5:
                bVar.getClass();
                break;
            case 6:
                bVar.getClass();
                break;
            case 7:
                bVar.getClass();
                break;
            case 8:
                bVar.getClass();
                break;
            case 9:
                bVar.getClass();
                break;
            case 10:
                bVar.getClass();
                break;
            case 11:
                bVar.getClass();
                break;
            case 12:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    public static Bitmap a(byte[] bArr, int i) throws io.p071bidmachine.media3.exoplayer.image.d {
        try {
            return t1.s(bArr, i);
        } catch (g0 e) {
            throw new io.p071bidmachine.media3.exoplayer.image.d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new io.p071bidmachine.media3.exoplayer.image.d(e2);
        }
    }
}
