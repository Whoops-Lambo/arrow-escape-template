package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pp4 implements Connections.StartAdvertisingResult {
    public final Status a;

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.a;
    }

    public pp4(Status status) {
        this.a = status;
    }
}
