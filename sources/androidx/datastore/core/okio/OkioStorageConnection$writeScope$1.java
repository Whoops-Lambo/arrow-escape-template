package androidx.datastore.core.okio;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@t50(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {236, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "writeScope")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class OkioStorageConnection$writeScope$1 extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ OkioStorageConnection s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorageConnection$writeScope$1(OkioStorageConnection okioStorageConnection, fy fyVar) {
        super(fyVar);
        this.s = okioStorageConnection;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        this.s.a(null, this);
        throw null;
    }
}
