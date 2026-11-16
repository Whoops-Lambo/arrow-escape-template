package defpackage;

import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzbvy;
import com.google.android.gms.internal.ads.zzcha;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xz3 implements zzbrk {
    public final /* synthetic */ int a = 0;
    public final zzcha b;

    public xz3(zzbrl zzbrlVar, zzcha zzchaVar) {
        this.b = zzchaVar;
        Objects.requireNonNull(zzbrlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void a(JSONObject jSONObject) {
        int i = this.a;
        zzcha zzchaVar = this.b;
        switch (i) {
            case 0:
                zzchaVar.zzc(jSONObject);
                break;
            default:
                try {
                    zzchaVar.zzc(jSONObject);
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e) {
                    zzchaVar.zzd(e);
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzb(String str) {
        int i = this.a;
        zzcha zzchaVar = this.b;
        switch (i) {
            case 0:
                zzchaVar.zzd(new zzbvb(str));
                break;
            default:
                try {
                    if (str == null) {
                        zzchaVar.zzd(new zzbvb());
                    } else {
                        zzchaVar.zzd(new zzbvb(str));
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
                break;
        }
    }

    public xz3(zzbvy zzbvyVar, zzcha zzchaVar) {
        this.b = zzchaVar;
    }
}
