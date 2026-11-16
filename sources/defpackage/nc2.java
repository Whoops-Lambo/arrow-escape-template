package defpackage;

import android.os.HandlerThread;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.zzba;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzgwr;
import com.google.android.gms.internal.ads.zznv;
import com.google.android.gms.internal.ads.zznx;
import com.google.android.gms.internal.p002firebaseauthapi.zzhy;
import com.google.android.gms.internal.p002firebaseauthapi.zzmf;
import com.google.android.gms.internal.p002firebaseauthapi.zzms;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.media3.exoplayer.mediacodec.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class nc2 implements zzdjz, zzmf, zzeb, zzgwr {
    public final /* synthetic */ int a;
    public final int b;

    public nc2(int i) throws InvalidAlgorithmParameterException {
        this.a = 5;
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(pv1.k(i, "Unsupported key length: "));
        }
        this.b = i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length == this.b) {
            return new zzhy(bArr).a(bArr2, bArr3, i, bArr4);
        }
        throw new InvalidAlgorithmParameterException(pv1.k(bArr.length, "Unexpected key length: "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public int zza() {
        switch (this.a) {
            case 3:
                int i = this.b;
                if (i == 2) {
                    return 10;
                }
                if (i == 5) {
                    return 11;
                }
                if (i == 29) {
                    return 12;
                }
                if (i == 42) {
                    return 16;
                }
                if (i != 22) {
                    return i != 23 ? 0 : 15;
                }
                return 1073741824;
            default:
                return this.b;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public byte[] zzc() throws GeneralSecurityException {
        int i = this.b;
        if (i == 16) {
            return zzms.i;
        }
        if (i == 32) {
            return zzms.j;
        }
        e.d("Could not determine HPKE AEAD ID");
        return null;
    }

    public int b(int i, int i2, int i3) {
        return tb5.g((int) (i3 * (Math.min(i, i2) / this.b)), 1, Math.max(1, i3));
    }

    public /* synthetic */ nc2(zznv zznvVar, int i) {
        this.a = 7;
        this.b = i;
    }

    public /* synthetic */ nc2(zznv zznvVar, int i, long j) {
        this.a = 6;
        this.b = i;
    }

    public /* synthetic */ nc2(zznv zznvVar, int i, zzba zzbaVar, zzba zzbaVar2) {
        this.a = 8;
        this.b = i;
    }

    public /* synthetic */ nc2(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public /* synthetic */ Object mo1232zza() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 9:
                return new HandlerThread(b.v(i2, "ExoPlayer:MediaCodecQueueingThread:"));
            default:
                return new HandlerThread(b.v(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        switch (this.a) {
            case 4:
                ((zzr) obj).zzdX(this.b);
                break;
            case 5:
            default:
                ((zznx) obj).g(this.b);
                break;
            case 6:
                ((zznx) obj).e(this.b);
                break;
            case 7:
                ((zznx) obj).f(this.b);
                break;
        }
    }
}
