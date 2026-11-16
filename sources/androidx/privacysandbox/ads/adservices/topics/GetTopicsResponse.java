package androidx.privacysandbox.ads.adservices.topics;

import com.google.android.gms.internal.ads.w;
import defpackage.gg0;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTopicsResponse {
    public final List a;
    public final gg0 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsResponse)) {
            return false;
        }
        List list = this.a;
        int size = list.size();
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        gg0 gg0Var = getTopicsResponse.b;
        List list2 = getTopicsResponse.a;
        if (size != list2.size()) {
            return false;
        }
        gg0 gg0Var2 = this.b;
        gg0Var2.getClass();
        gg0Var.getClass();
        return new HashSet(list).equals(new HashSet(list2)) && new HashSet(gg0Var2).equals(new HashSet(gg0Var));
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.a + ", EncryptedTopics=" + this.b;
    }

    public GetTopicsResponse(w wVar) {
        wVar.getClass();
        this.a = wVar;
        this.b = gg0.a;
    }
}
