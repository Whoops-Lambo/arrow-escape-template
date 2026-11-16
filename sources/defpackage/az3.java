package defpackage;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbkw;
import java.util.Objects;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class az3 extends QueryInfoGenerationCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzbkw b;

    public az3(zzbkw zzbkwVar, String str) {
        this.a = str;
        Objects.requireNonNull(zzbkwVar);
        this.b = zzbkwVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i = zze.zza;
        zzo.zzi("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbkw zzbkwVar = this.b;
            zzbkwVar.g.c(zzbkwVar.b(this.a, str).toString());
        } catch (JSONException e) {
            zzo.zzg("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            zzbkw zzbkwVar = this.b;
            zzbkwVar.g.c(zzbkwVar.c(this.a, query).toString());
        } catch (JSONException e) {
            int i = zze.zza;
            zzo.zzg("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
