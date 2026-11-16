package defpackage;

import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzcha;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o04 implements zzbrk {
    public final zzbus a;
    public final zzcha b;
    public final /* synthetic */ zzbvq c;

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void a(JSONObject jSONObject) {
        zzbus zzbusVar = this.a;
        zzcha zzchaVar = this.b;
        try {
            try {
                zzchaVar.zzc(this.c.a.a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                zzchaVar.zzd(e);
            }
        } finally {
            zzbusVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzb(String str) {
        zzbus zzbusVar = this.a;
        zzcha zzchaVar = this.b;
        try {
            if (str == null) {
                zzchaVar.zzd(new zzbvb());
            } else {
                zzchaVar.zzd(new zzbvb(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            zzbusVar.d();
        }
    }

    public o04(zzbvq zzbvqVar, zzbus zzbusVar, zzcha zzchaVar) {
        Objects.requireNonNull(zzbvqVar);
        this.c = zzbvqVar;
        this.a = zzbusVar;
        this.b = zzchaVar;
    }
}
